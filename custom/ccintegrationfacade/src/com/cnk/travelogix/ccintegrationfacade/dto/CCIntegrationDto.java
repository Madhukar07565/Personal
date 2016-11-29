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
package com.cnk.travelogix.ccintegrationfacade.dto;

import java.util.HashMap;
import java.util.Map;

import com.cnk.travelogix.ccintegrationfacade.enums.CCIntegrationConstant;



/**
 * The Class CCIntegrationDto.
 */

public class CCIntegrationDto
{

	/** The req res map. */
	final Map<CCIntegrationConstant, Object> reqResMap = new HashMap<CCIntegrationConstant, Object>();

	/**
	 * Instantiates a new CC integration dto.
	 *
	 * @param reqObj
	 *           the req obj
	 */
	public CCIntegrationDto(final Object reqObj)
	{
		reqResMap.put(CCIntegrationConstant.REQ, reqObj);

	}

	/**
	 * Adds the req.
	 *
	 * @param value
	 *           the value
	 */
	public void addReq(final Object value)
	{
		if (value != null)
		{
			reqResMap.put(CCIntegrationConstant.REQ, value);
		}
	}


	/**
	 * Gets the req.
	 *
	 * @return the req
	 */
	public Object getReq()
	{
		return reqResMap.get(CCIntegrationConstant.REQ);
	}
}
