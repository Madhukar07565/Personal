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
package com.cnk.travelogix.operation.daos.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;

import java.util.HashMap;
import java.util.List;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.operation.daos.CityDao;


/**
 * Implementation class of CityDao Interface
 * 
 * @author C5244543
 */
public class DefaultCityDao extends DefaultGenericDao<CityModel> implements CityDao
{
	public DefaultCityDao()
	{
		this("City");
	}

	private DefaultCityDao(final String typecode)
	{
		super(typecode);
	}

	@Override
	public CityModel findCityByIsocode(final String isocode)
	{
		final HashMap params = new HashMap();
		params.put("isocode", isocode);
		return this.find(params).get(0);
	}

	@Override
	public List<CityModel> findCities()
	{
		return super.find();
	}

}
