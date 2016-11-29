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
package com.cnk.travelogix.exception.commonlogging.customexception;

import de.hybris.platform.order.CalculationService;


/**
 * A general exception used by {@link CalculationService} extensions if an (expected) error occurs during price
 * calculation or requesting price informations.
 */
public class InvalidLoginException extends ApplicationException
{
	public static final String ERROR_CODE = "ERROR002";

	public InvalidLoginException(final String code, final String message)
	{
		super(code, message);
	}

	/**
	 * Message based exception.
	 *
	 * @param message
	 */
	public InvalidLoginException(final String code, final String handlingCode, final String message)
	{
		super(code, handlingCode, message);
	}

}
