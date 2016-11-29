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
package com.cnk.travelogix.sapintegrations.converters.populator;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.commons.error.Error;
import com.cnk.travelogix.commons.error.handler.ErrorHandler;


/**
 *
 */
public class AbstractErrorResponsePopulator
{
	@Autowired
	private ErrorHandler integrationsErrorHandler;

	public Error populateError(final Error customError)
	{
		return integrationsErrorHandler.handleError(customError);
	}

	public Error populateError(final String code, final String message)
	{
		final Error error = new Error();
		error.setCode(code);
		error.setMessage(message);
		return integrationsErrorHandler.handleError(error);
	}
}
