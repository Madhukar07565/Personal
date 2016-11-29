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
package com.cnk.travelogix.commons.error;

/**
 *
 */
public class Error
{
	private String code;
	private String message;
	/* this will be supplier id incase of supplier */
	private String id;
	private ErrorOrigin originatingFrom;

	/**
	 * @return the code
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * @param code
	 *           the code to set
	 */
	public void setCode(final String code)
	{
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * @param message
	 *           the message to set
	 */
	public void setMessage(final String message)
	{
		this.message = message;
	}

	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * supplier id, in case of supplier specific error, else blank
	 *
	 * @param id
	 *           the id to set
	 */
	public void setId(final String id)
	{
		this.id = id;
	}

	/**
	 * @return the originatingFrom
	 */
	public ErrorOrigin getOriginatingFrom()
	{
		return originatingFrom;
	}

	/**
	 * @param originatingFrom
	 *           the originatingFrom to set
	 */
	public void setOriginatingFrom(final ErrorOrigin originatingFrom)
	{
		this.originatingFrom = originatingFrom;
	}

	public enum ErrorOrigin
	{
		SUPPLIERS, CRM, CC, ECC
	}
}