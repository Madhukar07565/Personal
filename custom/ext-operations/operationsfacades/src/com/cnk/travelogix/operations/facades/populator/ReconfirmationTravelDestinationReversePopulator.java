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

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.cnk.travelogix.datamodel.operation.reconfirmationtraveldestination.model.ReconfirmationTravelDestinationModel;
import com.cnk.travelogix.operations.data.ReconfirmationTravelDestinationData;
import com.cnk.travelogix.operations.services.CityService;
import com.cnk.travelogix.operations.services.ContinentService;
import com.cnk.travelogix.operations.services.CountryService;


/**
 * @author C5244543
 */
public class ReconfirmationTravelDestinationReversePopulator
		implements Populator<ReconfirmationTravelDestinationData, ReconfirmationTravelDestinationModel>
{
	@Autowired
	private CityService cityService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private ContinentService continentService;

	@Override
	public void populate(final ReconfirmationTravelDestinationData source, final ReconfirmationTravelDestinationModel target)
			throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setInclusion(source.getInclusion());
		if (null != source.getCity())
		{
			target.setCity(cityService.findCityByIsocode(source.getCity().getCityIsoCode()));
		}
		if (null != source.getCountry())
		{
			target.setCountry(countryService.findCountryByIsocode(source.getCountry().getIsocode()));
		}
		if (null != source.getContinent())
		{
			target.setContinent(continentService.findContinentByIsocode(source.getContinent().getIsocode()));
		}
	}
}
