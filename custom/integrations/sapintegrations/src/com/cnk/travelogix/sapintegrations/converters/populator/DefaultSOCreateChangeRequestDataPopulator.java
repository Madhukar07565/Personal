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

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

import com.cnk.travelogix.custom.so.createchange.ZIfTerpSoPartners;
import com.cnk.travelogix.custom.so.createchange.ZifTerpSalesOrder;
import com.cnk.travelogix.custom.so.createchange.ZifTerpSoConditions;
import com.cnk.travelogix.custom.so.createchange.ZifTerpSoHeader;
import com.cnk.travelogix.custom.so.createchange.ZifTerpSoItem;
import com.cnk.travelogix.custom.so.createchange.ZttTerpSoConditions;
import com.cnk.travelogix.custom.so.createchange.ZttTerpSoItemData;
import com.cnk.travelogix.custom.so.createchange.ZttTerpSoPartners;
import com.cnk.travelogix.sapintegrations.so.createchange.data.ZIfTerpSoPartnersData;
import com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSalesOrderDataRequest;
import com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSoConditionsData;
import com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSoItemData;


/**
 *
 */
public class DefaultSOCreateChangeRequestDataPopulator implements Populator<ZifTerpSalesOrderDataRequest, ZifTerpSalesOrder>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZifTerpSalesOrderDataRequest source, final ZifTerpSalesOrder target) throws ConversionException
	{
		try
		{
			final ZifTerpSoHeader header = new ZifTerpSoHeader();
			final ZttTerpSoConditions zttsoConditions = new ZttTerpSoConditions();
			final ZttTerpSoPartners partners = new ZttTerpSoPartners();
			final ZttTerpSoItemData soItemsData = new ZttTerpSoItemData();

			for (final ZifTerpSoConditionsData srcConditions : source.getSoConditions().getItem())
			{
				final ZifTerpSoConditions targetConditions = new ZifTerpSoConditions();
				BeanUtils.copyProperties(srcConditions, targetConditions);
				zttsoConditions.getItem().add(targetConditions);
			}
			target.setSoConditions(zttsoConditions);
			for (final ZifTerpSoItemData srcSoItemData : source.getSoItems().getItem())
			{
				final ZifTerpSoItem targetItemsData = new ZifTerpSoItem();
				BeanUtils.copyProperties(srcSoItemData, targetItemsData);
				soItemsData.getItem().add(targetItemsData);
			}
			target.setSoItems(soItemsData);
			for (final ZIfTerpSoPartnersData srcPartners : source.getSoPartners().getItem())
			{
				final ZIfTerpSoPartners targetPartners = new ZIfTerpSoPartners();
				BeanUtils.copyProperties(srcPartners, targetPartners);
				partners.getItem().add(targetPartners);
			}
			target.setSoPartners(partners);
			BeanUtils.copyProperties(source.getSoHeader(), header);
			target.setSoHeader(header);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}



}
