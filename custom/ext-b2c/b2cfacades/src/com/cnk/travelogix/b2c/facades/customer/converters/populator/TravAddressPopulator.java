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

import de.hybris.platform.commercefacades.user.converters.populator.AddressPopulator;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import javax.annotation.Resource;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.CityData;
import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;


/**
 *
 */
public class TravAddressPopulator extends AddressPopulator
{
	@Resource
	private Converter<CityModel, CityData> cityConverter;

	@Override
	public void populate(final AddressModel source, final AddressData target)
	{
		super.populate(source, target);
		populateCity(source, target);
	}

	private void populateCity(final AddressModel source, final AddressData target)
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		final CityModel cityModel = source.getCity();
		if (cityModel != null)
		{
			target.setCity(cityConverter.convert(cityModel));
		}
	}
}
