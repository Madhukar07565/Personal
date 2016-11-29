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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import com.cnk.travelogix.custom.zifwsb.invoice.create.ZIffmBillDocCreateResponse;
import com.cnk.travelogix.custom.zifwsb.invoice.create.ZifstStatusDoc;
import com.cnk.travelogix.sapintegrations.invoice.create.data.ZIffmBillDocCreateResponseData;
import com.cnk.travelogix.sapintegrations.invoice.create.data.ZifstStatusDocData;


/**
 *
 */
public class DefaultInvoiceCreateResponseDataPopulator extends AbstractErrorResponsePopulator
		implements Populator<ZIffmBillDocCreateResponse, ZIffmBillDocCreateResponseData>
{
	Logger LOG = LoggerFactory.getLogger(getClass());

	@Override
	public void populate(final ZIffmBillDocCreateResponse source, final ZIffmBillDocCreateResponseData target)
			throws ConversionException
	{
		// YTODO Auto-generated method stub
		try
		{
			final ZifstStatusDoc status = source.getStatus();
			final ZifstStatusDocData statusData = new ZifstStatusDocData();
			BeanUtils.copyProperties(status, statusData);
			target.setStatus(statusData);
			if ("E".equalsIgnoreCase(status.getStatus()))
			{
				target.getErrors().add(populateError(status.getStatus(), status.getMessage()));
			}
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

}
