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
package com.cnk.travelogix.ccintegrationfacade.exception;

/**
 * The Enum CCIntegrationErrorCodes.
 */
public enum CCIntegrationErrorCodes
{
	/** The record already exists. */
	ERR_ALREADY_EXISTS(1200),

	/** The err for connection time out. */
	ERR_CONNECTION_TIME_OUT(1201, ""),

	/** The err for missing parameter */
	ERR_REQUIRED_PARAM(1202),

	/** The err for runtime errors */
	ERR_RUNTIME(1203);

	/** The error code. */
	private int errorCode;

	/** The localized msg key. */
	private String localizedMsgKey;



	CCIntegrationErrorCodes(final int pErrorCode)
	{
		this.errorCode = pErrorCode;
	}

	CCIntegrationErrorCodes(final int pErrorCode, final String pLocalizedMsgKey)
	{
		this(pErrorCode);
		this.localizedMsgKey = pLocalizedMsgKey;
	}


	public int getErrorCode()
	{
		return errorCode;
	}

	public String getLocalizedMsgKey()
	{
		return localizedMsgKey;
	}
}
