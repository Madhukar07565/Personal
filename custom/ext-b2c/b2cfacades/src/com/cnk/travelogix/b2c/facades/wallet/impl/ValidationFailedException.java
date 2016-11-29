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
package com.cnk.travelogix.b2c.facades.wallet.impl;

import java.util.HashMap;
import java.util.Map;


/**
 *
 */
public class ValidationFailedException extends Exception
{
	private final Map<String, String> errorMessage = new HashMap<>();

	public ValidationFailedException()
	{
		super();
	}

	public ValidationFailedException(final Throwable cause)
	{
		super(cause);
	}

	public ValidationFailedException(final String message)
	{
		super(message);
	}

	public ValidationFailedException(final String message, final Throwable cause)
	{
		super(message, cause);
	}

	public ValidationFailedException addInfo(final String key, final String message)
	{
		this.errorMessage.put(key, message);
		return this;
	}

	public Map<String, String> getErrorMap()
	{
		return errorMessage;
	}

}
