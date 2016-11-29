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
 * The Class CCIntegrationException.
 */
public class CCIntegrationException extends Exception
{
	/** The error code. */
	private final CCIntegrationErrorCodes errorCode;


	/**
	 * Instantiates a new CC integration exception.
	 *
	 * @param pErrorCode
	 *           the error code
	 */
	public CCIntegrationException(final CCIntegrationErrorCodes pErrorCode)
	{
		super("ERROR CODE : " + pErrorCode.getErrorCode());
		this.errorCode = pErrorCode;
	}



	/**
	 * Instantiates a new CC integration exception.
	 *
	 * @param pMsg
	 *           the msg
	 * @param pErrorCode
	 *           the error code
	 */
	public CCIntegrationException(final String pMsg, final CCIntegrationErrorCodes pErrorCode)
	{
		super(pMsg + " : ERROR CODE : " + pErrorCode.getErrorCode());
		this.errorCode = pErrorCode;
	}


	/**
	 * Instantiates a new CC integration exception.
	 *
	 * @param pErrorCode
	 *           the error code
	 * @param e
	 *           the e
	 */
	public CCIntegrationException(final CCIntegrationErrorCodes pErrorCode, final Exception e)
	{
		super("ERROR CODE : " + pErrorCode.getErrorCode(), e);
		this.errorCode = pErrorCode;
	}



	public CCIntegrationErrorCodes getErrorCode()
	{
		return errorCode;
	}
}
