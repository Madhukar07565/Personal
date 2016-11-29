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

import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifErpStCustmast;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifErpTtContmast;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifTerpPartnerSaveB2B;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifTerpPartnerSaveB2BDataRequest;


/**
 *
 */
public class DefaultCustomerMasterCreateB2BRequestDataPopulator implements
		Populator<ZifTerpPartnerSaveB2BDataRequest, ZifTerpPartnerSaveB2B>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZifTerpPartnerSaveB2BDataRequest source, final ZifTerpPartnerSaveB2B target)
			throws ConversionException
	{
		try
		{
			final ZifErpTtContmast erpTtContmast = new ZifErpTtContmast();
			final ZifErpStCustmast erpStCustmast = new ZifErpStCustmast();
			BeanUtils.copyProperties(source.getContactData(), erpTtContmast);
			BeanUtils.copyProperties(source.getCustomerData(), erpStCustmast);
			target.setContactData(erpTtContmast);
			target.setCustomerData(erpStCustmast);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}



}
