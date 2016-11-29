/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.exception.commonlogging.exception.constants;

/**
 * Global class for all Commonlogging constants. You can add global constants for your extension into this class.
 */
public final class HandlingConstants
{
	public static final String UNKNOWN = "Unknown";
	public static final String RECOVERABLE = "Recoverable";
	public static final String unRECOVERABLE = "Unrecoverable";
	public static final String AGENT_ATTENTION = "Agent Attention";

	private HandlingConstants()
	{
		//empty to avoid instantiating this constant class
	}

	// implement here constants used by this extension
}
