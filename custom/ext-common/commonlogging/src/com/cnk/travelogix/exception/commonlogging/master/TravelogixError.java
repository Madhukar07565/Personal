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
package com.cnk.travelogix.exception.commonlogging.master;

import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;


public class TravelogixError
{

	/**
	 * Throw an exception
	 */
	public void sneeze(final String arg0, final String arg1, final int i) throws Exception
	{
		throw new UnknownException("TESTERROR", "Travelogix Simulation of an error");
	}
}
