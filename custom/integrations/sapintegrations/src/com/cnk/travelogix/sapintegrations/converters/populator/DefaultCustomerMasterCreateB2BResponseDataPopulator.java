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
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifErpStStatusC;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifTerpPartnerSaveB2BResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifErpStStatusCB2BData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifErpTtStatusCB2BData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifTerpPartnerSaveB2BDataResponse;


/**
 *
 */
public class DefaultCustomerMasterCreateB2BResponseDataPopulator extends AbstractErrorResponsePopulator
		implements Populator<ZifTerpPartnerSaveB2BResponse, ZifTerpPartnerSaveB2BDataResponse>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZifTerpPartnerSaveB2BResponse source, final ZifTerpPartnerSaveB2BDataResponse target)
			throws ConversionException
	{
		try
		{
			final ZifErpTtStatusCB2BData erpTtStatusCB2BData = new ZifErpTtStatusCB2BData();
			final List<ZifErpStStatusC> statues = source.getStatus() == null ? new ArrayList() : source.getStatus().getItem();
			for (final ZifErpStStatusC statusC : statues)
			{
				final ZifErpStStatusCB2BData erpStStatusCB2BData = new ZifErpStStatusCB2BData();
				BeanUtils.copyProperties(statusC, erpStStatusCB2BData);
				erpTtStatusCB2BData.getItem().add(erpStStatusCB2BData);
				if (SapintegrationsConstants.ERROR_STATUS.equalsIgnoreCase(statusC.getStatus()))
				{
					final Error er = populateError(statusC.getStatus(), statusC.getMessage());
					target.getErrors().add(er);
				}
			}
			target.setStatus(erpTtStatusCB2BData);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

}
