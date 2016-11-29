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

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.common.core.cart.data.CityData;
import com.cnk.travelogix.datamodel.operation.reconfirmationtraveldestination.model.ReconfirmationTravelDestinationModel;
import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.masterdata.core.c2l.model.ContinentModel;
import com.cnk.travelogix.operations.data.ContinentData;
import com.cnk.travelogix.operations.data.ReconfirmationTravelDestinationData;


/**
 * @author C5244543
 */
public class ReconfirmationTravelDestinationPopulator
		implements Populator<ReconfirmationTravelDestinationModel, ReconfirmationTravelDestinationData>
{
	@Autowired
	private Converter<CityModel, CityData> cityConverter;
	@Autowired
	private Converter<CountryModel, CountryData> countryConverter;
	@Autowired
	private Converter<ContinentModel, ContinentData> continentConverter;

	@Override
	public void populate(final ReconfirmationTravelDestinationModel source, final ReconfirmationTravelDestinationData target)
			throws ConversionException
	{
		if (source != null)
		{
			target.setInclusion(source.getInclusion());
			target.setCity(cityConverter.convert(source.getCity()));
			target.setCountry(countryConverter.convert(source.getCountry()));
			target.setContinent(continentConverter.convert(source.getContinent()));
		}
	}
}
