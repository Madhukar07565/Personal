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

import com.cnk.travelogix.masterdata.core.c2l.model.ContinentModel;
import com.cnk.travelogix.operation.daos.ContinentDao;
import com.cnk.travelogix.operations.services.ContinentService;


/**
 * Implementation class of ContinentService Interface.
 *
 * @author C5244543
 */
public class DefaultContinentService implements ContinentService
{
	@Autowired
	private ContinentDao continentDao;

	@Override
	public ContinentModel findContinentByIsocode(final String isocode)
	{
		return continentDao.findContinentByIsocode(isocode);
	}

	@Override
	public List<ContinentModel> findContinents()
	{
		final List<ContinentModel> continentModels = continentDao.findContinents();
		if (continentModels != null && !continentModels.isEmpty())
		{
			return continentModels;
		}
		return Collections.emptyList();
	}

}
