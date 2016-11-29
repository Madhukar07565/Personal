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
import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZVendorCreateChangeServiceResponse;
import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZifstStatusDoc;
import com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZVendorCreateChangeServiceDataResponse;
import com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZifstStatusDocData;
import com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZifttStatusDocData;


/**
 *
 */
public class DefaultVendorCreateChangeResponseDataPopulator extends AbstractErrorResponsePopulator
		implements Populator<ZVendorCreateChangeServiceResponse, ZVendorCreateChangeServiceDataResponse>
{
	Logger LOG = Logger.getLogger(DefaultVendorCreateChangeResponseDataPopulator.class);

	@Override
	public void populate(final ZVendorCreateChangeServiceResponse source, final ZVendorCreateChangeServiceDataResponse target)
			throws ConversionException
	{
		try
		{
			final ZifttStatusDocData zifttStatusDocData = new ZifttStatusDocData();
			final List<ZifstStatusDoc> zifstStatusDocList = source.getEtStatus() == null ? new ArrayList()
					: source.getEtStatus().getItem();
			for (final ZifstStatusDoc zifstStatusDoc : zifstStatusDocList)
			{
				final ZifstStatusDocData zifstStatusDocData = new ZifstStatusDocData();
				BeanUtils.copyProperties(zifstStatusDoc, zifstStatusDocData);
				zifttStatusDocData.getItem().add(zifstStatusDocData);
				if (SapintegrationsConstants.ERROR_STATUS.equalsIgnoreCase(zifstStatusDoc.getStatus()))
				{
					target.getErrors().add(populateError(zifstStatusDoc.getMessagetype(), zifstStatusDoc.getMessage()));
				}
			}
			target.setEtStatus(zifttStatusDocData);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}
}
