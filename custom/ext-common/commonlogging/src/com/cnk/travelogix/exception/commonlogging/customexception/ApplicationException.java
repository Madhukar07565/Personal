/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 */
package com.cnk.travelogix.exception.commonlogging.customexception;

/**
 * Exception thrown when dealing with Content Proxy
 */
public class ApplicationException extends Exception implements ITravelogixCustomException
{
	private String errorCode;
	private String handlingCode;
	private Object[] params;
	private Throwable cause;

	public ApplicationException(final String code)
	{
		super();
		this.errorCode = code;
	}

	/**
	 * Message based exception.
	 *
	 * @param message
	 */
	public ApplicationException(final String code, final String message)
	{
		super(message);
		this.errorCode = code;
	}

	/**
	 * Message based exception.
	 *
	 * @param message
	 */
	public ApplicationException(final String code, final String handlingCode, final String message)
	{
		super(message);
		this.errorCode = code;
		this.handlingCode = handlingCode;
	}

	/**
	 * Throwable based Exception
	 *
	 * @param t
	 */
	public ApplicationException(final String code, final Throwable t)
	{
		super(t);
		this.errorCode = code;
	}

	public ApplicationException(final String code, final String message, final Throwable t)
	{
		super(message, t);
		this.errorCode = code;
	}

	/**
	 * @return - error code
	 */
	public String getErrorCode()
	{
		return errorCode;
	}

	/**
	 * @return the handlingCode
	 */
	public String getHandlingCode()
	{
		return handlingCode;
	}



	/**
	 * @return the params
	 */
	public Object[] getParams()
	{
		return params;
	}

	/**
	 * @return - The cause.
	 */
	@Override
	public Throwable getCause()
	{
		return cause;
	}
}
