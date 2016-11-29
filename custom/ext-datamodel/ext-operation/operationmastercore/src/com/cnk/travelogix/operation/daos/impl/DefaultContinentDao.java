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

import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import com.cnk.travelogix.masterdata.core.c2l.model.ContinentModel;
import com.cnk.travelogix.operation.daos.ContinentDao;


/**
 * Implementation of Continent Dao Interface
 *
 * @author C5244543
 */
public class DefaultContinentDao extends DefaultGenericDao<ContinentModel> implements ContinentDao
{
	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;

	public DefaultContinentDao()
	{
		this("Continent");
	}

	public DefaultContinentDao(final String typecode)
	{
		super(typecode);
	}

	@Override
	public ContinentModel findContinentByIsocode(final String isocode)
	{
		searchRestrictionService.disableSearchRestrictions();
		final HashMap params = new HashMap();
		params.put("isocode", isocode);
		final ContinentModel continentModel = this.find(params).get(0);
		searchRestrictionService.enableSearchRestrictions();
		return continentModel;

	}

	@Override
	public List<ContinentModel> findContinents()
	{
		searchRestrictionService.disableSearchRestrictions();
		final List<ContinentModel> continentModels = super.find();
		searchRestrictionService.enableSearchRestrictions();
		return continentModels;
	}
}
