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

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

import com.cnk.travelogix.constants.SapintegrationsConstants;
import com.cnk.travelogix.custom.so.createchange.ZifTerpSalesOrderResponse;
import com.cnk.travelogix.custom.so.createchange.ZifTerpSoStatus;
import com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSalesOrderDataResponse;
import com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSoStatusData;
import com.cnk.travelogix.sapintegrations.so.createchange.data.ZttTerpSoStatusData;


/**
 *
 */
public class DefaultSOCreateChangeResponseDataPopulator extends AbstractErrorResponsePopulator
		implements Populator<ZifTerpSalesOrderResponse, ZifTerpSalesOrderDataResponse>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZifTerpSalesOrderResponse source, final ZifTerpSalesOrderDataResponse target)
			throws ConversionException
	{
		try
		{
			final ZttTerpSoStatusData zttTerpSoStatusData = new ZttTerpSoStatusData();
			final List<ZifTerpSoStatus> statues = source.getStatus() == null ? new ArrayList() : source.getStatus().getItem();
			{
				for (final ZifTerpSoStatus statusSo : statues)
				{
					final ZifTerpSoStatusData zifstStatusSo = new ZifTerpSoStatusData();
					BeanUtils.copyProperties(statusSo, zifstStatusSo);
					zttTerpSoStatusData.getItem().add(zifstStatusSo);
					if (SapintegrationsConstants.ERROR_STATUS.equalsIgnoreCase(statusSo.getStatus()))
					{
						target.getErrors().add(populateError(statusSo.getMessagetype(), statusSo.getMessage()));
					}
				}
			}
			target.setStatus(zttTerpSoStatusData);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

}//ZifTerpSalesOrderResponse,ZifTerpSalesOrderDataResponse