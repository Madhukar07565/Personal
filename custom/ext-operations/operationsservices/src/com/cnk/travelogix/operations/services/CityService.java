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
package com.cnk.travelogix.operations.services;

import java.util.List;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;


/**
 * City Service Interface
 *
 * @author C5244543
 */
public interface CityService
{
	CityModel findCityByIsocode(final String isocode);

	List<CityModel> findCities();
}
