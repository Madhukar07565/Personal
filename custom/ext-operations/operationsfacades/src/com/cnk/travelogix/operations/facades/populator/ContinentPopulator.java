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
package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import com.cnk.travelogix.masterdata.core.c2l.model.ContinentModel;
import com.cnk.travelogix.operations.data.ContinentData;


/**
 * Populating CityModel to City Data
 *
 * @author C5244543
 */
public class ContinentPopulator implements Populator<ContinentModel, ContinentData>
{

	private Converter<CountryModel, CountryData> countryConverter;

	@Override
	public void populate(final ContinentModel source, final ContinentData target) throws ConversionException
	{
		if (source != null)
		{
			target.setCountries(countryConverter.convertAll(source.getCountries()));
			target.setIsocode(source.getIsocode());
			target.setName(source.getName());
		}
	}

	/**
	 * @return the countryConverter
	 */
	public Converter<CountryModel, CountryData> getCountryConverter()
	{
		return countryConverter;
	}

	/**
	 * @param countryConverter
	 *           the countryConverter to set
	 */
	public void setCountryConverter(final Converter<CountryModel, CountryData> countryConverter)
	{
		this.countryConverter = countryConverter;
	}
}
