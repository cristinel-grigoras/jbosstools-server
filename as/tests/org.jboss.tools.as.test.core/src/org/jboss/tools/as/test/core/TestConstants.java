/*******************************************************************************
 * Copyright (c) 2007 - 2019 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.as.test.core;

import java.util.HashMap;

import org.jboss.ide.eclipse.as.core.util.IJBossToolingConstants;

public class TestConstants {
	public static final String TOMCAT_RUNTIME_55 = "org.eclipse.jst.server.tomcat.runtime.55";
	public static final String JBOSS_AS_32_HOME = System.getProperty("jbosstools.test.jboss.home.3.2", "C:\\apps\\jboss\\jboss-3.2.8.SP1\\");
	public static final String JBOSS_AS_40_HOME = System.getProperty("jbosstools.test.jboss.home.4.0", "C:\\apps\\jboss\\jboss-4.0.5.GA\\");
	public static final String JBOSS_AS_42_HOME = System.getProperty("jbosstools.test.jboss.home.4.2", "C:\\apps\\jboss\\jboss-4.2.1.GA\\");
	public static final String JBOSS_AS_50_HOME = System.getProperty("jbosstools.test.jboss.home.5.0", "C:\\apps\\jboss\\jboss-5.0.0.GA\\");
	public static final String JBOSS_AS_51_HOME = System.getProperty("jbosstools.test.jboss.home.5.1", "C:\\apps\\jboss\\jboss-5.1.0.GA\\");
	public static final String JBOSS_AS_52_HOME = System.getProperty("jbosstools.test.jboss.home.5.2", "C:\\apps\\jboss\\jboss-5.2.0.GA\\");
	public static final String JBOSS_AS_60_HOME = System.getProperty("jbosstools.test.jboss.home.6.0", "C:\\apps\\jboss\\jboss-6.0.0.GA\\");
	public static final String JBOSS_AS_70_HOME = System.getProperty("jbosstools.test.jboss.home.7.0", "C:\\apps\\jboss\\jboss-7.0.0.GA\\");
	public static final String JBOSS_AS_71_HOME = System.getProperty("jbosstools.test.jboss.home.7.1", "C:\\apps\\jboss\\jboss-7.1.0.GA\\");
	public static final String JBOSS_AS_80_HOME = System.getProperty("jbosstools.test.jboss.home.8.0", "C:\\apps\\jboss\\wildfly-8.0.0.GA\\");
	public static final String JBOSS_AS_81_HOME = System.getProperty("jbosstools.test.jboss.home.8.1", "C:\\apps\\jboss\\jboss-wildfly-8.1.0.GA\\");
	public static final String JBOSS_AS_90_HOME = System.getProperty("jbosstools.test.jboss.home.9.0", "C:\\apps\\jboss\\jboss-wildfly-9.0.0.GA\\");
	public static final String JBOSS_WF_100_HOME = System.getProperty("jbosstools.test.jboss.home.10.0", "C:\\apps\\jboss\\jboss-wildfly-10.0.0.GA\\");
	public static final String JBOSS_WF_101_HOME = System.getProperty("jbosstools.test.jboss.home.10.1", "C:\\apps\\jboss\\jboss-wildfly-10.1.0.GA\\");
	public static final String JBOSS_WF_110_HOME = System.getProperty("jbosstools.test.jboss.home.11.0", "C:\\apps\\jboss\\jboss-wildfly-11.0.0.GA\\");
	public static final String JBOSS_WF_120_HOME = System.getProperty("jbosstools.test.jboss.home.12.0", "C:\\apps\\jboss\\jboss-wildfly-12.0.0.GA\\");
	public static final String JBOSS_WF_130_HOME = System.getProperty("jbosstools.test.jboss.home.13.0", "C:\\apps\\jboss\\jboss-wildfly-13.0.0.GA\\");
	public static final String JBOSS_WF_140_HOME = System.getProperty("jbosstools.test.jboss.home.14.0", "C:\\apps\\jboss\\jboss-wildfly-14.0.0.GA\\");
	public static final String JBOSS_WF_150_HOME = System.getProperty("jbosstools.test.jboss.home.15.0", "C:\\apps\\jboss\\jboss-wildfly-15.0.0.GA\\");
	public static final String JBOSS_WF_160_HOME = System.getProperty("jbosstools.test.jboss.home.16.0", "C:\\apps\\jboss\\jboss-wildfly-16.0.0.GA\\");
	public static final String JBOSS_WF_170_HOME = System.getProperty("jbosstools.test.jboss.home.17.0", "C:\\apps\\jboss\\jboss-wildfly-17.0.0.GA\\");
	public static final String JBOSS_WF_180_HOME = System.getProperty("jbosstools.test.jboss.home.18.0", "C:\\apps\\jboss\\jboss-wildfly-18.0.0.GA\\");
	public static final String JBOSS_WF_190_HOME = System.getProperty("jbosstools.test.jboss.home.19.0", "C:\\apps\\jboss\\jboss-wildfly-19.0.0.GA\\");
	public static final String JBOSS_EAP_43_HOME = System.getProperty("jbosstools.test.jboss.home.eap.4.3", "C:\\apps\\jboss\\jboss-eap-4.3.0.GA\\");
	public static final String JBOSS_EAP_50_HOME = System.getProperty("jbosstools.test.jboss.home.eap.5.0", "C:\\apps\\jboss\\jboss-eap-5.0.0.GA\\");
	public static final String JBOSS_EAP_60_HOME = System.getProperty("jbosstools.test.jboss.home.eap.6.0", "C:\\apps\\jboss\\jboss-eap-6.0.0.GA\\");
	public static final String JBOSS_EAP_61_HOME = System.getProperty("jbosstools.test.jboss.home.eap.6.1", "C:\\apps\\jboss\\jboss-eap-6.1.0.GA\\");
	public static final String JBOSS_EAP_62_HOME = System.getProperty("jbosstools.test.jboss.home.eap.6.2", "C:\\apps\\jboss\\jboss-eap-6.2.0.GA\\");
	public static final String JBOSS_EAP_63_HOME = System.getProperty("jbosstools.test.jboss.home.eap.6.3", "C:\\apps\\jboss\\jboss-eap-6.3.0.GA\\");
	public static final String JBOSS_EAP_70_HOME = System.getProperty("jbosstools.test.jboss.home.eap.7.0", "C:\\apps\\jboss\\jboss-eap-7.0.0.GA\\");
	public static final String JBOSS_EAP_71_HOME = System.getProperty("jbosstools.test.jboss.home.eap.7.1", "C:\\apps\\jboss\\jboss-eap-7.1.0.GA\\");
	public static final String JBOSS_EAP_72_HOME = System.getProperty("jbosstools.test.jboss.home.eap.7.2", "C:\\apps\\jboss\\jboss-eap-7.2.0.GA\\");
	public static final String JBOSS_EAP_73_HOME = System.getProperty("jbosstools.test.jboss.home.eap.7.3", "C:\\apps\\jboss\\jboss-eap-7.3.0.GA\\");
	public static final String JBOSS_WF_200_HOME = System.getProperty("jbosstools.test.jboss.home.20.0", "C:\\apps\\jboss\\jboss-wildfly-20.0.0.GA\\");
	public static final String JBOSS_WF_210_HOME = System.getProperty("jbosstools.test.jboss.home.21.0", "C:\\apps\\jboss\\jboss-wildfly-21.0.0.GA\\");
	public static final String JBOSS_WF_220_HOME = System.getProperty("jbosstools.test.jboss.home.22.0", "C:\\apps\\jboss\\jboss-wildfly-22.0.0.GA\\");
	public static final String JBOSS_WF_230_HOME = System.getProperty("jbosstools.test.jboss.home.23.0", "C:\\apps\\jboss\\jboss-wildfly-23.0.0.GA\\");
	public static final String JBOSS_EAP_74_HOME = System.getProperty("jbosstools.test.jboss.home.eap.7.4", "C:\\apps\\jboss\\jboss-eap-7.4.0.GA\\");
	public static final String JBOSS_WF_240_HOME = System.getProperty("jbosstools.test.jboss.home.24.0", "C:\\apps\\jboss\\jboss-wildfly-24.0.0.GA\\");
	public static final String JBOSS_EAP_80_HOME = System.getProperty("jbosstools.test.jboss.home.eap.8.0", "C:\\apps\\jboss\\jboss-eap-8.0.0.GA\\");
	public static final String JBOSS_WF_270_HOME = System.getProperty("jbosstools.test.jboss.home.27.0", "C:\\apps\\jboss\\jboss-wildfly-27.0.0.GA\\");
	// AUTOGEN_SERVER_ADAPTER_CHUNK
	// NEW_SERVER_ADAPTER

	public static final String JRE_8_HOME = System.getProperty("jbosstools.test.jre.8", "C:\\apps\\java\\jre8.0\\");

	public static final String JBOSS_AS_HOME = System.getProperty("jbosstools.test.jboss.home", JBOSS_AS_42_HOME);

	public static final HashMap<String, String> serverTypeToHome = new HashMap<String, String>();
	static {
		serverTypeToHome.put(IJBossToolingConstants.SERVER_AS_32, JBOSS_AS_32_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_AS_40, JBOSS_AS_40_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_AS_42, JBOSS_AS_42_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_AS_50, JBOSS_AS_50_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_AS_51, JBOSS_AS_51_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_AS_60, JBOSS_AS_60_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_AS_70, JBOSS_AS_70_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_AS_71, JBOSS_AS_71_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_80, JBOSS_AS_80_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_90, JBOSS_AS_90_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_100, JBOSS_WF_100_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_110, JBOSS_WF_110_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_120, JBOSS_WF_120_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_130, JBOSS_WF_130_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_140, JBOSS_WF_140_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_150, JBOSS_WF_150_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_160, JBOSS_WF_160_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_170, JBOSS_WF_170_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_180, JBOSS_WF_180_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_190, JBOSS_WF_190_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_200, JBOSS_WF_200_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_210, JBOSS_WF_210_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_EAP_43, JBOSS_EAP_43_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_EAP_50, JBOSS_EAP_50_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_EAP_60, JBOSS_EAP_60_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_EAP_61, JBOSS_EAP_61_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_EAP_70, JBOSS_EAP_70_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_EAP_71, JBOSS_EAP_71_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_EAP_72, JBOSS_EAP_72_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_EAP_73, JBOSS_EAP_73_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_220, JBOSS_WF_220_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_230, JBOSS_WF_230_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_EAP_74, JBOSS_EAP_74_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_240, JBOSS_WF_240_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_EAP_80, JBOSS_EAP_80_HOME);
		serverTypeToHome.put(IJBossToolingConstants.SERVER_WILDFLY_270, JBOSS_WF_270_HOME);
		// AUTOGEN_SERVER_ADAPTER_CHUNK
		// NEW_SERVER_ADAPTER
	}
	
	public static String getServerHome(String serverTypeId) {
		return serverTypeToHome.get(serverTypeId);
	}
}
