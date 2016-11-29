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
public class RestrictedCheckInException extends ApplicationException
{
	public static final String ERROR_CODE = "ERROR011";

	/**
	 * Message based exception.
	 *
	 * @param message
	 */
	public RestrictedCheckInException(final String code, final String message)
	{
		super(code, message);
	}

	/**
	 * Message based exception.
	 *
	 * @param message
	 */
	public RestrictedCheckInException(final String code, final String handlingCode, final String message)
	{
		super(code, handlingCode, message);
	}
}
