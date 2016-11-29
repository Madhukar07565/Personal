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

import java.util.Map;

import javax.xml.datatype.DatatypeFactory;

import com.cnk.travelogix.custom.mappingtable.maintain.MappingTableColumn;
import com.cnk.travelogix.custom.mappingtable.maintain.MappingTableRow;
import com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MappingTableRowData;


/**
 *
 */
public class AbstractMappingTableMaintainPopulator
{
	public MappingTableRow setMappingTabelRow(final MappingTableRowData tableRowData, final DatatypeFactory datatypFactory)
	{
		final MappingTableRow mappingTbleRow = new MappingTableRow();
		final Map<String, String> columnNameValueMap = tableRowData.getColumnNameValue();
		mappingTbleRow.setId(tableRowData.getId());

		mappingTbleRow.setStart(datatypFactory.newXMLGregorianCalendar(tableRowData.getStartDate()));
		mappingTbleRow.setEnd(datatypFactory.newXMLGregorianCalendar(tableRowData.getEndDate()));
		for (final Map.Entry<String, String> key : columnNameValueMap.entrySet())
		{
			final MappingTableColumn column = new MappingTableColumn();
			column.setName(key.getKey());
			column.setString(key.getValue());
			mappingTbleRow.getColumn().add(column);
		}
		return mappingTbleRow;
	}
}
