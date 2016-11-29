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

import com.cnk.travelogix.custom.zifwsb.invoice.create.ZIffmBillDocCreate;
import com.cnk.travelogix.custom.zifwsb.invoice.create.ZifstBilldoc;
import com.cnk.travelogix.custom.zifwsb.invoice.create.ZttBilldoc;
import com.cnk.travelogix.sapintegrations.invoice.create.data.ZIffmBillDocCreateData;
import com.cnk.travelogix.sapintegrations.invoice.create.data.ZifstBilldocData;


/**
 *
 */
public class DefaultInvoiceCreateDataRequestPopulator implements
		Populator<ZIffmBillDocCreateData, com.cnk.travelogix.custom.zifwsb.invoice.create.ZIffmBillDocCreate>
{
	Logger LOG = LoggerFactory.getLogger(getClass());

	@Override
	public void populate(final ZIffmBillDocCreateData source, final ZIffmBillDocCreate target) throws ConversionException
	{
		try
		{
			final ZttBilldoc zttBilldoc = new ZttBilldoc();
			for (final ZifstBilldocData srcConditions : source.getIBillDoc().getItem())
			{
				final ZifstBilldoc targetConditions = new ZifstBilldoc();
				BeanUtils.copyProperties(srcConditions, targetConditions);
				zttBilldoc.getItem().add(targetConditions);
			}
			target.setIBillDoc(zttBilldoc);

			target.setUniqid(source.getUniqid());
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

}
