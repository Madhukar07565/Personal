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

import com.cnk.travelogix.commons.error.Error;
import com.cnk.travelogix.constants.SapintegrationsConstants;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifErpStStatusC;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifTerpPartnerSaveResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpStStatusCData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpTtStatusCData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataResponse;


/**
 *
 */
public class DefaultCustomerMasterCreateResponseDataPopulator extends AbstractErrorResponsePopulator
		implements Populator<ZifTerpPartnerSaveResponse, ZifTerpPartnerSaveDataResponse>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZifTerpPartnerSaveResponse source, final ZifTerpPartnerSaveDataResponse target)
			throws ConversionException
	{
		try
		{
			final ZifErpTtStatusCData zifErpTtStatusCData = new ZifErpTtStatusCData();
			final List<ZifErpStStatusC> statues = source.getStatus() == null ? new ArrayList() : source.getStatus().getItem();
			for (final ZifErpStStatusC statusC : statues)
			{
				final ZifErpStStatusCData zifErpStStatusCData = new ZifErpStStatusCData();
				BeanUtils.copyProperties(statusC, zifErpStStatusCData);
				zifErpTtStatusCData.getItem().add(zifErpStStatusCData);
				if (SapintegrationsConstants.ERROR_STATUS.equalsIgnoreCase(statusC.getStatus()))
				{
					final Error er = populateError(statusC.getStatus(), statusC.getMessage());
					target.getErrors().add(er);
				}
			}
			target.setStatus(zifErpTtStatusCData);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

}
