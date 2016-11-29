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
package com.cnk.travelogix.common.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.CityData;
import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;


/**
 *
 */
public class CityPopulator implements Populator<CityModel, CityData>
{
	@Override
	public void populate(final CityModel source, final CityData target) throws ConversionException
	{
		Assert.notNull(target, "Parameter target cannot be null.");
		
		if (source != null)
		{
			target.setCityIsoCode(source.getIsocode());
			target.setCityName(source.getName());
		}
	}
}
