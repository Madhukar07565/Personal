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
package com.cnk.travelogix.operations.services.category.impl;

import de.hybris.platform.category.impl.DefaultCategoryService;
import de.hybris.platform.category.model.CategoryModel;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.operations.daos.category.TravelogixCategoryDao;
import com.cnk.travelogix.operations.services.category.TravelogixCategoryService;


/**
 *
 */
public class TravelogixCategoryServiceImpl extends DefaultCategoryService implements TravelogixCategoryService
{

	private static final Logger LOG = Logger.getLogger(TravelogixCategoryServiceImpl.class);

	@Resource(name = "travelogixCategoryDao")
	private TravelogixCategoryDao travelogixCategoryDao;

	@Override
	public Collection<CategoryModel> findProductCategory()
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("from find Product category service");
		}

		return travelogixCategoryDao.findProductCategory();
	}

	@Override
	public Collection<CategoryModel> findProductCategorySubType(final String catId)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("from findProductCategorySubType service");
		}
		return travelogixCategoryDao.getProductSubCategoryType(catId);
	}

}
