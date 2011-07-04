/******************************************************************************* 
 * Copyright (c) 2011 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 * 
 * TODO: Logging and Progress Monitors
 ******************************************************************************/ 
package org.jboss.ide.eclipse.as.rse.core;

import java.text.MessageFormat;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.jboss.ide.eclipse.as.core.extensions.events.ServerLogger;
import org.jboss.ide.eclipse.as.core.server.IServerStatePoller;
import org.jboss.ide.eclipse.as.core.server.internal.AbstractJBossBehaviourDelegate;
import org.jboss.ide.eclipse.as.core.server.internal.PollThread;
import org.jboss.ide.eclipse.as.core.util.LaunchCommandPreferences;
import org.jboss.ide.eclipse.as.core.util.PollThreadUtils;
import org.jboss.ide.eclipse.as.core.util.ServerUtil;
import org.jboss.ide.eclipse.as.rse.core.RSEHostShellModel.ServerShellModel;

public class RSEBehaviourDelegate extends AbstractJBossBehaviourDelegate {
	private PollThread pollThread = null;
	public String getBehaviourTypeId() {
		return RSEPublishMethod.RSE_ID;
	}
	
	@Override
	public void stop(boolean force) {
		if( force ) {
			serverStopped();
			return;
		}

		if( LaunchCommandPreferences.ignoreLaunchCommand(getServer())) {
			serverStopping();
			serverStopped();
			return;
		}

		serverStopping();
		if (!gracefullStop().isOK()) {
			serverStarted();
		} else {
			serverStopped();
		}
	}

	protected IStatus gracefullStop() {
		try {
			ILaunchConfiguration config = getServer().getLaunchConfiguration(false, new NullProgressMonitor());
			//JBossServerBehavior serverBehavior = ServerUtil.checkedGetServerAdapter(getServer(), JBossServerBehavior.class);
			//String defaultCmd = serverBehavior.getDefaultArguments();
			String defaultCmd = ServerUtil.checkedGetBehaviorDelegate(getServer()).getDefaultStopArguments();
			String shutdownCommand = config == null ? defaultCmd :
				RSELaunchConfigProperties.getShutdownCommand(config, defaultCmd);
			ServerShellModel model = RSEHostShellModel.getInstance().getModel(getServer());
			model.executeRemoteCommand("/", shutdownCommand, new String[]{}, new NullProgressMonitor(), 10000, true);
			if( model.getStartupShell() != null && model.getStartupShell().isActive()) {
				model.getStartupShell().writeToShell("exit");
			}
			return Status.OK_STATUS;
		} catch(CoreException ce) {
			ServerLogger.getDefault().log(getServer(), ce.getStatus());
			return new Status(
					IStatus.ERROR, RSECorePlugin.PLUGIN_ID,
					MessageFormat.format("Could not stop server {0}", getServer().getName()), 
					ce);
		}
	}
	
	public void serverStarting() {
		pollServer(IServerStatePoller.SERVER_UP);
	}
	
	public void serverStarted() {
		getActualBehavior().setServerStarted();
	}

	public void serverStopping() {
		getActualBehavior().setServerStopping();
		pollServer(IServerStatePoller.SERVER_DOWN);
	}
	
	public void serverStopped() {
		getActualBehavior().setServerStopped();
	}

	protected void pollServer(final boolean expectedState) {
		if( this.pollThread != null ) {
			pollThread.cancel();
		}
		IServerStatePoller poller = PollThreadUtils.getPoller(expectedState, getServer());
		this.pollThread = new PollThread( expectedState, poller, getActualBehavior());
		pollThread.start();
	}
}
