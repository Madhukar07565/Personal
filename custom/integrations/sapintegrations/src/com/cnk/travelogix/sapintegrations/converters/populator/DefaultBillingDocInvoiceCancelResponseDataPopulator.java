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

import com.cnk.travelogix.custom.zifwsb.inv.cancel.ZIffmBillingdocCancelResponse;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.ZifstStatusDoc;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.data.ZIffmBillingdocCancelDataResponse;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.data.ZifstStatusDocData;


public class DefaultBillingDocInvoiceCancelResponseDataPopulator extends AbstractErrorResponsePopulator
		implements Populator<ZIffmBillingdocCancelResponse, ZIffmBillingdocCancelDataResponse>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZIffmBillingdocCancelResponse source, final ZIffmBillingdocCancelDataResponse target)
			throws ConversionException
	{
		LOG.info("DefaultBillingDocInvoiceCancelResponseDataPopulator - populate ");
		try
		{
			final ZifstStatusDocData zifstStatusDocData = new ZifstStatusDocData();
			if (source.getStatus() != null)
			{
				final ZifstStatusDoc statusDoc = source.getStatus();
				final String status = statusDoc.getStatus();
				zifstStatusDocData.setDocnumber(statusDoc.getDocnumber());
				zifstStatusDocData.setMessage(statusDoc.getMessage());
				zifstStatusDocData.setMessagetype(statusDoc.getMessagetype());
				zifstStatusDocData.setStatus(status);
				zifstStatusDocData.setSysubrc(statusDoc.getSysubrc());
				zifstStatusDocData.setUniqid(statusDoc.getUniqid());
				if ("E".equalsIgnoreCase(status))
				{
					final com.cnk.travelogix.commons.error.Error er = populateError(status, statusDoc.getMessage());
					target.getErrors().add(er);
				}
			}
			target.setStatus(zifstStatusDocData);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

}
