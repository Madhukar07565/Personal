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

import com.cnk.travelogix.custom.zifws.accdocpost.TableOfZifstCustomer;
import com.cnk.travelogix.custom.zifws.accdocpost.TableOfZifstGlacc;
import com.cnk.travelogix.custom.zifws.accdocpost.TableOfZifstVendor;
import com.cnk.travelogix.custom.zifws.accdocpost.ZifstDochead;
import com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocument;
import com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstCustomer;
import com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstGlacc;
import com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstVendor;


/**
 *
 */
public class DefaultAccdocPostRequestDataPopulator
		implements Populator<ZIffmAccountDocument, com.cnk.travelogix.custom.zifws.accdocpost.ZIffmAccountDocument>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZIffmAccountDocument source,
			final com.cnk.travelogix.custom.zifws.accdocpost.ZIffmAccountDocument target) throws ConversionException
	{
		try
		{
			final ZifstDochead targetHeader = new ZifstDochead();
			final TableOfZifstGlacc targetTableGlacc = new TableOfZifstGlacc();
			final TableOfZifstCustomer targetTableCustomer = new TableOfZifstCustomer();
			final TableOfZifstVendor targetTableVendor = new TableOfZifstVendor();

			BeanUtils.copyProperties(source.getIDocheader(), targetHeader);

			for (final ZifstGlacc srcGlacc : source.getItAccountgl().getItem())
			{
				final com.cnk.travelogix.custom.zifws.accdocpost.ZifstGlacc targetGlacc = new com.cnk.travelogix.custom.zifws.accdocpost.ZifstGlacc();
				BeanUtils.copyProperties(srcGlacc, targetGlacc);
				targetTableGlacc.getItem().add(targetGlacc);
			}
			target.setItAccountgl(targetTableGlacc);
			for (final ZifstCustomer srcCustomer : source.getItCustomer().getItem())
			{
				final com.cnk.travelogix.custom.zifws.accdocpost.ZifstCustomer targetCustomer = new com.cnk.travelogix.custom.zifws.accdocpost.ZifstCustomer();
				BeanUtils.copyProperties(srcCustomer, targetCustomer);
				targetTableCustomer.getItem().add(targetCustomer);
			}
			target.setItCustomer(targetTableCustomer);
			for (final ZifstVendor srcVendor : source.getItVendor().getItem())
			{
				final com.cnk.travelogix.custom.zifws.accdocpost.ZifstVendor targetVendor = new com.cnk.travelogix.custom.zifws.accdocpost.ZifstVendor();
				BeanUtils.copyProperties(srcVendor, targetVendor);
				targetTableVendor.getItem().add(targetVendor);
			}
			target.setItVendor(targetTableVendor);
			target.setIDocheader(targetHeader);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

}
