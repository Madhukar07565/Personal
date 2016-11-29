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
package com.cnk.travelogix.operations.exceptions;

import com.cnk.travelogix.exception.commonlogging.customexception.ApplicationException;


/**
 * Exception thrown when dealing with Service Orders
 */
public class ServiceOrderException extends ApplicationException
{
	/**
	 * Code based exception.
	 *
	 * @param code
	 */
	public ServiceOrderException(final String code)
	{
		super(code);
		// YTODO Auto-generated constructor stub
	}

	/**
	 * Message based exception.
	 *
	 * @param message
	 */
	public ServiceOrderException(final String code, final String message)
	{
		super(code, message);
	}

	/**
	 * Message based exception.
	 *
	 * @param message
	 */
	public ServiceOrderException(final String code, final String handlingCode, final String message)
	{
		super(code, handlingCode, message);
	}
}
