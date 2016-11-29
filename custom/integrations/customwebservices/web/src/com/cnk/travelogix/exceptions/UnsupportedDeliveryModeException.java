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
 *  
 */
package com.cnk.travelogix.exceptions;

/**
 * Specific exception that is thrown when delivery mode is not supported for the current session cart
 * 
 *
 * 
 */
public class UnsupportedDeliveryModeException extends Exception
{

	private final String deliveryMode;

	/**
	 * @param code
	 */
	public UnsupportedDeliveryModeException(final String code)
	{
		super("Delivery Mode [" + code + "] is not supported for the current cart");
		this.deliveryMode = code;
	}


	/**
	 * @return the deliveryMode
	 */
	public String getDeliveryMode()
	{
		return deliveryMode;
	}

}