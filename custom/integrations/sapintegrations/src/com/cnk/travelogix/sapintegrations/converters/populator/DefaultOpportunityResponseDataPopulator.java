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

import com.cnk.travelogix.constants.SapintegrationsConstants;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifTerpOpportunityResponse;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifstStatusOpp;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOpportunityDataResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifstStatusOppData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZttStatusOppData;


public class DefaultOpportunityResponseDataPopulator extends AbstractErrorResponsePopulator
		implements Populator<ZifTerpOpportunityResponse, ZifTerpOpportunityDataResponse>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZifTerpOpportunityResponse source, final ZifTerpOpportunityDataResponse target)
			throws ConversionException
	{
		LOG.info("DefaultOpportunityResponseDataPopulator - populate ");
		try
		{
			final ZttStatusOppData targetStatusOppData = new ZttStatusOppData();
			final List<ZifstStatusOpp> srcStatusLst = source.getStatus() == null ? new ArrayList() : source.getStatus().getItem();
			final List<ZifstStatusOppData> targetStatusDataLst = targetStatusOppData.getItem();
			for (final ZifstStatusOpp zifstStatusOpp : srcStatusLst)
			{
				final ZifstStatusOppData statusData = new ZifstStatusOppData();
				statusData.setMessage(zifstStatusOpp.getMessage());
				statusData.setMessagetype(zifstStatusOpp.getMessagetype());
				statusData.setOppNo(zifstStatusOpp.getOppNo());
				statusData.setStatus(zifstStatusOpp.getStatus());
				statusData.setSysubrc(zifstStatusOpp.getSysubrc());
				statusData.setUniqid(zifstStatusOpp.getUniqid());
				targetStatusDataLst.add(statusData);
				if (SapintegrationsConstants.ERROR_STATUS.equalsIgnoreCase(zifstStatusOpp.getStatus()))
				{
					target.getErrors().add(populateError(zifstStatusOpp.getMessagetype(), zifstStatusOpp.getMessage()));
				}
			}
			target.setStatus(targetStatusOppData);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

}
