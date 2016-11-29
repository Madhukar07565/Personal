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
package com.cnk.travelogix.date.util;

/**
 * Date util Class to verify dates
 */
public class TravelogixDateUtil
{
	public boolean validateDate(final String fromDate, final String toDate)
	{
		if (fromDate.compareTo(toDate) > 0 || fromDate.compareTo(toDate) == 0)
		{
			return false;
		}
		return true;
	}
}
