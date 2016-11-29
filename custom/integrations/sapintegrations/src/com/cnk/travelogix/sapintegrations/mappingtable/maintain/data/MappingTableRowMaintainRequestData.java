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
package com.cnk.travelogix.sapintegrations.mappingtable.maintain.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 */
public class MappingTableRowMaintainRequestData
{
	private Map<String, List<MappingTableRowData>> servicesMap = null;

	public void setServicesMap(final Map servicesMap)
	{
		this.servicesMap = servicesMap;
	}

	public Map<String, List<MappingTableRowData>> getServicesMap()
	{
		if (servicesMap == null)
		{
			return new HashMap<>();
		}
		return servicesMap;
	}
}
