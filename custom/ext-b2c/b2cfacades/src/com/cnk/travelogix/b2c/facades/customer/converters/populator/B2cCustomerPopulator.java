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
package com.cnk.travelogix.b2c.facades.customer.converters.populator;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import javax.annotation.Resource;

import org.apache.commons.lang3.BooleanUtils;

import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.model.TravellerModel;


/**
 *
 */
public class B2cCustomerPopulator extends CustomerPopulator
{
	// update by Rick Zhang for TRAV-384 start
	@Resource
	private Converter<TravellerModel, TravellerData> b2cTravellerConverter;
	// update by Rick Zhang for TRAV-384 end
	@Resource
	private Converter<CountryModel, CountryData> countryConverter;

	@Override
	public void populate(final CustomerModel source, final CustomerData target)
	{
		super.populate(source, target);
		// update by Rick Zhang for TRAV-384 start
		target.setTravellers(b2cTravellerConverter.convertAll(source.getTravellers()));
		// update by Rick Zhang for TRAV-384 end
		target.setEmails(source.getEmails());
		target.setMobiles(source.getMobiles());
		if (source.getDefaultWebSite() != null)
		{
			target.setDefaultWebSite(countryConverter.convert(source.getDefaultWebSite()));
		}

		target.setSubscribe(source.getSubscribe());
		target.setDefaultCountryCode(source.getDefaultCountryCode());
		target.setActive(BooleanUtils.isTrue(source.getIsActive()));

	}
}
