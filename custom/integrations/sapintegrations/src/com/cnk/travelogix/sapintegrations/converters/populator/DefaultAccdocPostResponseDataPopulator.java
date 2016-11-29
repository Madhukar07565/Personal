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

import com.cnk.travelogix.commons.error.Error;
import com.cnk.travelogix.custom.zifws.accdocpost.ZIffmAccountDocumentResponse;
import com.cnk.travelogix.custom.zifws.accdocpost.ZifstGlacc;
import com.cnk.travelogix.custom.zifws.accdocpost.ZifstStatusDoc;
import com.cnk.travelogix.custom.zifws.accdocpost.ZifstVendor;
import com.cnk.travelogix.sapintegrations.accdocpost.data.TableOfZifstCustomer;
import com.cnk.travelogix.sapintegrations.accdocpost.data.TableOfZifstGlacc;
import com.cnk.travelogix.sapintegrations.accdocpost.data.TableOfZifstVendor;
import com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstCustomer;
import com.cnk.travelogix.sapintegrations.accdocpost.data.ZifttStatusDoc;


/**
 *
 */
public class DefaultAccdocPostResponseDataPopulator extends AbstractErrorResponsePopulator implements
		Populator<ZIffmAccountDocumentResponse, com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocumentResponse>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZIffmAccountDocumentResponse source,
			final com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocumentResponse target) throws ConversionException
	{
		try
		{
			final TableOfZifstGlacc targetTableGlacc = new TableOfZifstGlacc();
			final TableOfZifstCustomer targetTableCustomer = new TableOfZifstCustomer();
			final TableOfZifstVendor targetTableVendor = new TableOfZifstVendor();
			final ZifttStatusDoc targetStatuses = new ZifttStatusDoc();

			for (final ZifstGlacc srcGlacc : source.getItAccountgl().getItem())
			{
				final com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstGlacc targetGlacc = new com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstGlacc();
				BeanUtils.copyProperties(srcGlacc, targetGlacc);
				targetTableGlacc.getItem().add(targetGlacc);
			}
			target.setItAccountgl(targetTableGlacc);
			for (final com.cnk.travelogix.custom.zifws.accdocpost.ZifstCustomer srcCustomer : source.getItCustomer().getItem())
			{
				final ZifstCustomer targetCustomer = new ZifstCustomer();
				BeanUtils.copyProperties(srcCustomer, targetCustomer);
				targetTableCustomer.getItem().add(targetCustomer);
			}
			target.setItCustomer(targetTableCustomer);
			for (final ZifstVendor srcVendor : source.getItVendor().getItem())
			{
				final com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstVendor targetVendor = new com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstVendor();
				BeanUtils.copyProperties(srcVendor, targetVendor);
				targetTableVendor.getItem().add(targetVendor);
			}
			target.setItVendor(targetTableVendor);
			for (final ZifstStatusDoc srcStatus : source.getEStatus().getItem())
			{
				final com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstStatusDoc targetStatus = new com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstStatusDoc();
				BeanUtils.copyProperties(srcStatus, targetStatus);
				targetStatuses.getItem().add(targetStatus);
				if ("E".equalsIgnoreCase(srcStatus.getStatus()))
				{
					Error er = new Error();
					er.setCode(srcStatus.getStatus());
					er.setMessage(srcStatus.getMessage());
					er = populateError(er);
					target.getErrors().add(er);
				}
			}
			target.setEStatus(targetStatuses);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}

	}


}
