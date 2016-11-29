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
package com.cnk.travelogix.operations.doas.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.operations.doas.TravelogixOrderDao;
import com.cnk.travelogix.orgstructure.core.model.BusinessUnitModel;
import com.cnk.travelogix.orgstructure.core.model.GroupCompanyModel;
import com.cnk.travelogix.orgstructure.core.model.GroupOfCompaniesModel;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;
import com.cnk.travelogix.orgstructure.core.model.StrategicBusinessUnitModel;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.flexiblesearch.SavedQueryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.exceptions.FlexibleSearchException;


/**
 * Default implementation for the TravelogixOrderDao
 */
public class DefaultTravelogixOrderDao implements TravelogixOrderDao
{
	private static final Logger LOG = Logger.getLogger(DefaultTravelogixOrderDao.class);

	private final String QUERY_GET_ALL_GROUP_OF_COMPANIES = "SELECT {PK} FROM {GroupOfCompanies}";
	private final String QUERY_GET_ALL_GROUP_COMPANIES = "SELECT {PK} FROM {GroupCompany}";
	private final String QUERY_GET_ALL_COMPANIES = "SELECT {PK} FROM {Company}";
	private final String QUERY_GET_ALL_MARKETS = "SELECT {PK} FROM {Market}";
	private final String QUERY_GET_ALL_PRODUCT_CATEGORIES = "SELECT {PK} from {Category}";
	private final String QUERY_GET_ALL_SBU = "SELECT {PK} from {StrategicBusinessUnit}";
	private final String QUERY_GET_ALL_BU = "SELECT {PK} from {BusinessUnit}";

	private final String QUERY_GET_MAIN_CATEGORY_BY_CODE = "SELECT {PK} FROM {Category} where {code}=?code";
	private final String QUERY_GET_SAVED_QUERY_BY_NAME = "SELECT {PK} from {SavedQuery} where {name}=?name";
	private final String QUERY_GET_SAVED_QUERIES_BY_EMPLOYEE = "SELECT {sq:pk} from {SavedQuery as sq join Employee as employee on {sq.employee}={employee.pk}} where {employee:uid}=?uid";

	@Resource(name = "flexibleSearchService")
	FlexibleSearchService flexibleSearchService;

	@Resource(name = "searchRestrictionService")
	SearchRestrictionService searchRestrictionService;


	@Override
	public List<GroupOfCompaniesModel> findGroupOfCompanies()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_ALL_GROUP_OF_COMPANIES);
		final SearchResult<GroupOfCompaniesModel> searchResult = flexibleSearchService.search(query);
		return searchResult.getResult();
	}

	@Override
	public List<GroupCompanyModel> findGroupCompanies()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_ALL_GROUP_COMPANIES);
		final SearchResult<GroupCompanyModel> searchResult = flexibleSearchService.search(query);
		return searchResult.getResult();
	}

	@Override
	public List<CompanyModel> findCompanies()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_ALL_COMPANIES);
		final SearchResult<CompanyModel> searchResult = flexibleSearchService.search(query);
		return searchResult.getResult();
	}

	@Override
	public List<MarketModel> findMarkets()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_ALL_MARKETS);
		final SearchResult<MarketModel> searchResult = flexibleSearchService.search(query);
		return searchResult.getResult();
	}

	@Override
	public List<StrategicBusinessUnitModel> findStrategicBusinessUnits()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_ALL_SBU);
		final SearchResult<StrategicBusinessUnitModel> searchResult = flexibleSearchService.search(query);
		return searchResult.getResult();
	}

	@Override
	public List<BusinessUnitModel> findBusinessUnits()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_ALL_BU);
		final SearchResult<BusinessUnitModel> searchResult = flexibleSearchService.search(query);
		return searchResult.getResult();
	}

	@Override
	public Collection<CategoryModel> findProductCategories()
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("findProductCategory() called");
		}
		List<CategoryModel> categoryModels = new ArrayList<>();
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_ALL_PRODUCT_CATEGORIES);
		try
		{
			final SearchResult<CategoryModel> searchResult = flexibleSearchService.search(query);
			categoryModels = searchResult.getResult();
			if (CollectionUtils.isNotEmpty(categoryModels))
			{
				LOG.debug("categoryModels " + categoryModels.size());
				return categoryModels;
			}
		}
		catch (final FlexibleSearchException e)
		{
			LOG.error("FlexibleSearchException while quering all Categories" + e.getMessage(), e);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while quering all Categories" + e.getMessage(), e);
		}
		return categoryModels;
	}

	@Override
	public CategoryModel findProductMainCategory(final String categoryCode)
	{
		List<CategoryModel> categoryModels = null;
		CategoryModel categoryModel = null;
		final Map<String, String> queryParams = new HashMap<>();
		queryParams.put("code", categoryCode);

		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_MAIN_CATEGORY_BY_CODE, queryParams);
		try
		{
			categoryModels = new ArrayList<>();
			final SearchResult<CategoryModel> searchResult = flexibleSearchService.search(query);
			categoryModels = searchResult.getResult();
			if (null != categoryModels && !categoryModels.isEmpty())
			{
				categoryModel = categoryModels.get(0);
				LOG.debug("categoryModel code : " + categoryModel.getCode());
			}
		}
		catch (final FlexibleSearchException e)
		{
			LOG.error("FlexibleSearchException while getting root Category for code " + categoryCode + " - " + e.getMessage(), e);
		}
		catch (final Exception e)
		{
			LOG.error("Exception while getting root Category for code " + categoryCode + " - " + e.getMessage(), e);
		}
		return categoryModel;
	}

	@Override
	public List<SavedQueryModel> findSavedQueryByName(final String savedQueryName)
	{
		final Map queryParams = new HashMap<>();
		queryParams.put("name", savedQueryName);
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_SAVED_QUERY_BY_NAME, queryParams);
		final SearchResult<SavedQueryModel> searchResult = flexibleSearchService.search(query);
		return searchResult.getResult();
	}

	@Override
	public List<SavedQueryModel> findSavedQueriesByEmployee(final String employeId)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("findSavedQueriesByEmployee() called - " + employeId);
		}
		List<SavedQueryModel> savedQueryModels = null;
		final Map queryParams = new HashMap<>();
		queryParams.put("uid", employeId);

		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_SAVED_QUERIES_BY_EMPLOYEE, queryParams);
		try
		{
			final SearchResult<SavedQueryModel> searchResult = flexibleSearchService.search(query);
			savedQueryModels = searchResult.getResult();
		}
		catch (final FlexibleSearchException e)
		{
			LOG.error("FlexibleSearchException occured while getting saved queries for employee - " + employeId + e.getMessage(), e);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while getting saved queries for employee - " + employeId + e.getMessage(), e);
		}
		return savedQueryModels;
	}

	@Override
	public List<OrderModel> findBookingDetailsBySavedQuery(final String savedQuery)
	{
		List<OrderModel> orderModels = new ArrayList<>();
		final FlexibleSearchQuery query = new FlexibleSearchQuery(savedQuery);
		try
		{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<OrderModel> searchResult = flexibleSearchService.search(query);
			orderModels = searchResult.getResult();
		}
		catch (final FlexibleSearchException e)
		{
			LOG.error("FlexibleSearchException occured while getting search result for saved query " + savedQuery + e.getMessage(),
					e);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while getting search result for saved query : " + savedQuery + e.getMessage(), e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}

		return orderModels;
	}
}
