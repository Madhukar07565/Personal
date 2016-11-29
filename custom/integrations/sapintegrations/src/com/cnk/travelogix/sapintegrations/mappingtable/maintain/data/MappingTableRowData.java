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

import java.util.Map;


/**
 *
 */
public class MappingTableRowData
{
	private String id;
	private Map<String, String> columnNameValue;
	protected String startDate;
	protected String endDate;


	/**
	 * @return the startDate
	 */
	public String getStartDate()
	{
		return startDate;
	}

	/**
	 * @param startDate
	 * @format yyyy-MM-dd'T'HH:mm:ss
	 */
	public void setStartDate(final String startDate)
	{
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate()
	{
		return endDate;
	}

	/**
	 * @param endDate
	 * @format yyyy-MM-dd'T'HH:mm:ss
	 */
	public void setEndDate(final String endDate)
	{
		this.endDate = endDate;
	}

	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * @param id
	 *           the id to set
	 */
	public void setId(final String id)
	{
		this.id = id;
	}

	/**
	 * @return the columnNameValue
	 */
	public Map<String, String> getColumnNameValue()
	{
		return columnNameValue;
	}

	/**
	 * @param columnNameValue
	 *           the columnNameValue to set
	 */
	public void setColumnNameValue(final Map<String, String> columnNameValue)
	{
		this.columnNameValue = columnNameValue;
	}
}
