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
package com.cnk.travelogix.operations.daos.category.impl;

import de.hybris.platform.category.daos.impl.DefaultCategoryDao;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operations.daos.category.TravelogixCategoryDao;


/**
 *
 */
public class TravelogixCategoryDaoImpl extends DefaultCategoryDao implements TravelogixCategoryDao
{
	private static final Logger LOG = Logger.getLogger(TravelogixCategoryDaoImpl.class);

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public Collection<CategoryModel> findProductCategory()
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("from from findProudctCategory dao");
		}
		final String queryString = OperationmastercoreConstants.QUERY_ALL_PRODUCT_CATEGORY;

		final FlexibleSearchQuery productCategoryQuery = new FlexibleSearchQuery(queryString);

		return flexibleSearchService.<CategoryModel> search(productCategoryQuery).getResult();
	}

	@Override
	public Collection<CategoryModel> getProductSubCategoryType(final String catId)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("from from getProductSubCategoryType dao for CatId:::" + catId);
		}
		final String queryString = OperationmastercoreConstants.QUERY_PRODUCT_CAT_SUB_TYPE;
		
		final FlexibleSearchQuery productCategoryQuery = new FlexibleSearchQuery(queryString);
		productCategoryQuery.addQueryParameter(OperationmastercoreConstants.CAT_ID, catId);
		return flexibleSearchService.<CategoryModel> search(productCategoryQuery).getResult();


	}

}
