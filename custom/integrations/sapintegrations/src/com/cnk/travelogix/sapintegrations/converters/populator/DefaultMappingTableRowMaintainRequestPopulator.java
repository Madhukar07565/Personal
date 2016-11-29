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

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cnk.travelogix.custom.mappingtable.maintain.MaintainMappingTableRowRequest;
import com.cnk.travelogix.custom.mappingtable.maintain.MappingTableRow;
import com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MaintainMappingTableRequestData;
import com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MappingTableRowData;


/**
 *
 */
public class DefaultMappingTableRowMaintainRequestPopulator extends AbstractMappingTableMaintainPopulator
		implements Populator<MaintainMappingTableRequestData, MaintainMappingTableRowRequest>
{
	Logger LOG = LoggerFactory.getLogger(getClass());

	@Override
	public void populate(final MaintainMappingTableRequestData source, final MaintainMappingTableRowRequest target)
			throws ConversionException
	{
		try
		{
			final Map<String, List<MappingTableRowData>> servicesMap = source.getServicesMap();
			final DatatypeFactory datatypFactory = DatatypeFactory.newInstance();
			setMapppingTabelRow(servicesMap, datatypFactory, target);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

	public void setMapppingTabelRow(final Map<String, List<MappingTableRowData>> servicesMap, final DatatypeFactory datatypFactory,
			final MaintainMappingTableRowRequest target)
	{
		for (final Map.Entry<String, List<MappingTableRowData>> service : servicesMap.entrySet())
		{
			target.setMappingTableId(service.getKey());
			final List<MappingTableRowData> dataRows = service.getValue();
			for (final MappingTableRowData tableRowData : dataRows)
			{
				final MappingTableRow mappingTbleRow = setMappingTabelRow(tableRowData, datatypFactory);

				target.getRow().add(mappingTbleRow);
			}
		}
	}
}
