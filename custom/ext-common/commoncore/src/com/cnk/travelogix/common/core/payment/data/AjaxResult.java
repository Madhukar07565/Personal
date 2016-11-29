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
package com.cnk.travelogix.common.core.payment.data;

import java.util.HashMap;


/**
 * @author i323727
 *
 */
public class AjaxResult
{
	private boolean status;
	private HashMap<String, Object> result;

	public static AjaxResult newInstance()
	{
		final AjaxResult result = new AjaxResult();
		result.setResult(new HashMap<String, Object>());
		return result;
	}

	public AjaxResult status(final boolean status)
	{
		setStatus(status);
		return this;
	}

	public AjaxResult put(final String key, final Object value)
	{
		getResult().put(key, value);
		return this;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus()
	{
		return status;
	}

	/**
	 * @param status
	 *           the status to set
	 */
	public void setStatus(final boolean status)
	{
		this.status = status;
	}

	/**
	 * @return the result
	 */
	public HashMap<String, Object> getResult()
	{
		return result;
	}

	/**
	 * @param result
	 *           the result to set
	 */
	public void setResult(final HashMap<String, Object> result)
	{
		this.result = result;
	}
}
