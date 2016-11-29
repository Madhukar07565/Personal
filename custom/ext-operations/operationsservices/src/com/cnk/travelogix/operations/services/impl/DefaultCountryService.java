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
package com.cnk.travelogix.operations.services.impl;

import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.servicelayer.i18n.daos.CountryDao;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.operations.services.CountryService;


/**
 * Implementation class of CityService Interface.
 *
 * @author C5244543
 */
public class DefaultCountryService implements CountryService
{
	@Autowired
	private CountryDao countryDao;

	@Override
	public CountryModel findCountryByIsocode(final String isocode)
	{
		final List<CountryModel> countryModel = countryDao.findCountriesByCode(isocode);
		return countryModel != null && !countryModel.isEmpty() ? countryModel.get(0) : null;
	}

	@Override
	public List<CountryModel> findCountries()
	{
		final List<CountryModel> countryModels = countryDao.findCountries();
		if (countryModels != null && !countryModels.isEmpty())
		{
			return countryModels;
		}
		return Collections.emptyList();
	}
}
