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

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZVendorCreateChangeService;
import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZbankDetail;
import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZbankDetailTt;
import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZvendorInput;
import com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZVendorCreateChangeServiceDataRequest;
import com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZbankDetailData;
import com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZvendorInputData;


/**
 *
 */
public class DefaultVendorCreateChangeRequestDataPopulator
		implements Populator<ZVendorCreateChangeServiceDataRequest, ZVendorCreateChangeService>
{
	Logger LOG = Logger.getLogger(DefaultVendorCreateChangeRequestDataPopulator.class);

	@Override
	public void populate(final ZVendorCreateChangeServiceDataRequest source, final ZVendorCreateChangeService target)
			throws ConversionException
	{
		try
		{
			final ZvendorInput zvendorInput = new ZvendorInput();
			if (source.getIsVendorInput() != null)
			{
				final ZvendorInputData zvendorInputData = source.getIsVendorInput();
				BeanUtils.copyProperties(zvendorInputData, zvendorInput);
				populateBankDetails(zvendorInputData, zvendorInput);
			}
			target.setIsVendorInput(zvendorInput);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

	public void populateBankDetails(final ZvendorInputData zvendorInputData, final ZvendorInput zvendorInput)
	{

		if (null != zvendorInputData.getBank())
		{
			final ZbankDetailTt zbankDetailTt = new ZbankDetailTt();

			final List<ZbankDetailData> zbankDetailDataList = zvendorInputData.getBank().getItem();
			for (final ZbankDetailData zbankDetailData : zbankDetailDataList)
			{
				final ZbankDetail zbankDetail = new ZbankDetail();
				BeanUtils.copyProperties(zbankDetailData, zbankDetail);
				zbankDetailTt.getItem().add(zbankDetail);
			}
			zvendorInput.setBank(zbankDetailTt);
		}
	}

}
