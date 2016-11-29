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

import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifErpStContmast;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifErpStCustmast;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifErpTtContmast;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifTerpPartnerSave;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpStContmastData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataRequest;


/**
 *
 */
public class DefaultCustomerMasterCreateRequestDataPopulator
		implements Populator<ZifTerpPartnerSaveDataRequest, ZifTerpPartnerSave>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZifTerpPartnerSaveDataRequest source, final ZifTerpPartnerSave target) throws ConversionException
	{
		try
		{
			final ZifErpStCustmast CustMastData = new ZifErpStCustmast();
			BeanUtils.copyProperties(source.getCustomerData(), CustMastData);
			target.setCustomerData(CustMastData);

			final ZifErpTtContmast contMastData = new ZifErpTtContmast();
			for (final ZifErpStContmastData conatactData : source.getContactData().getItem())
			{
				final ZifErpStContmast zifErpStContmast = new ZifErpStContmast();
				BeanUtils.copyProperties(conatactData, zifErpStContmast);
				contMastData.getItem().add(zifErpStContmast);
			}
			target.setContactData(contMastData);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}



}
