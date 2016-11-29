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

import com.cnk.travelogix.custom.zifwsb.inv.cancel.ZIffmBillingdocCancel;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.data.ZIffmBillingdocCancelDataRequest;


/**
 *
 */
public class DefaultBillingDocInvoiceCancelRequestDataPopulator implements
		Populator<ZIffmBillingdocCancelDataRequest, ZIffmBillingdocCancel>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZIffmBillingdocCancelDataRequest source, final ZIffmBillingdocCancel target)
			throws ConversionException
	{
		try
		{
			target.setPBillingdoc(source.getPBillingdoc());
			target.setPUniqid(source.getPUniqid());
			LOG.info("After : Target " + target.getPBillingdoc() + " - " + target.getPUniqid());
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

}
