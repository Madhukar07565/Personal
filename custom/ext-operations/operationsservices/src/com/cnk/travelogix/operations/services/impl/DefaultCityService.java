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

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.operation.daos.CityDao;
import com.cnk.travelogix.operations.services.CityService;


/**
 * Implementation class of CityService Interface.
 *
 * @author C5244543
 */
public class DefaultCityService implements CityService
{
	@Autowired
	private CityDao cityDao;

	@Override
	public CityModel findCityByIsocode(final String isocode)
	{
		return cityDao.findCityByIsocode(isocode);
	}

	@Override
	public List<CityModel> findCities()
	{
		final List<CityModel> cityModels = cityDao.findCities();
		if (cityModels != null && !cityModels.isEmpty())
		{
			return cityModels;
		}
		return Collections.emptyList();
	}

}
