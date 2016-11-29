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

import com.cnk.travelogix.commons.error.Error;
import com.cnk.travelogix.constants.SapintegrationsConstants;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaintsResponse;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaintsStatus;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsDataResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsStatusData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZttTerpComplaintsStatusData;


public class DefaultComplaintsFeedbackResponseDataPopulator extends AbstractErrorResponsePopulator
		implements Populator<ZifTerpComplaintsResponse, ZifTerpComplaintsDataResponse>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZifTerpComplaintsResponse source, final ZifTerpComplaintsDataResponse target)
			throws ConversionException
	{
		LOG.info("DefaultComplaintsFeedbackResponseDataPopulator - populate ");
		try
		{
			final ZttTerpComplaintsStatusData targetStatusData = new ZttTerpComplaintsStatusData();
			final List<ZifTerpComplaintsStatus> srcStatusLst = source.getStatus() == null ? new ArrayList()
					: source.getStatus().getItem();
			final List<ZifTerpComplaintsStatusData> targetStatusDataLst = targetStatusData.getItem();
			for (final ZifTerpComplaintsStatus zifTerpComplaintsStatus : srcStatusLst)
			{
				final String status = zifTerpComplaintsStatus.getStatus();
				final ZifTerpComplaintsStatusData statusData = new ZifTerpComplaintsStatusData();
				statusData.setComplaintNo(zifTerpComplaintsStatus.getComplaintNo());
				statusData.setFeedbackNo(zifTerpComplaintsStatus.getFeedbackNo());
				statusData.setMessage(zifTerpComplaintsStatus.getMessage());
				statusData.setMessagetype(zifTerpComplaintsStatus.getMessagetype());
				statusData.setStatus(status);
				statusData.setSysubrc(zifTerpComplaintsStatus.getSysubrc());
				statusData.setUniqid(zifTerpComplaintsStatus.getUniqid());
				targetStatusDataLst.add(statusData);
				if (SapintegrationsConstants.ERROR_STATUS.equalsIgnoreCase(zifTerpComplaintsStatus.getStatus()))
				{
					final Error er = populateError(status, zifTerpComplaintsStatus.getMessage());
					target.getErrors().add(er);
				}
			}
			target.setStatus(targetStatusData);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

}
