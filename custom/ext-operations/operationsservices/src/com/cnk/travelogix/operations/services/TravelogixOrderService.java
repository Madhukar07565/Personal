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

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.cnk.travelogix.operations.data.SearchFilterData;
import com.cnk.travelogix.orgstructure.core.model.BusinessUnitModel;
import com.cnk.travelogix.orgstructure.core.model.GroupCompanyModel;
import com.cnk.travelogix.orgstructure.core.model.GroupOfCompaniesModel;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;
import com.cnk.travelogix.orgstructure.core.model.StrategicBusinessUnitModel;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.flexiblesearch.SavedQueryModel;
import de.hybris.platform.core.model.order.OrderModel;


/**
 *
 */
public interface TravelogixOrderService
{
	/**
	 * @param searchFilterData
	 */
	public void createSavedQuery(SearchFilterData searchFilterData);

	/**
	 * @return Map
	 */
	public Map<String, String> getBookingPriorityEnumValues();

	/**
	 * @return Map
	 */
	public Map<String, String> getBookingStatusEnumValues();

	/**
	 * @return Map
	 */
	public Map<String, String> getBookingTypeEnumValues();

	/**
	 * @return List of GroupOfCompaniesModel
	 */
	public List<GroupOfCompaniesModel> getGroupOfCompanies();

	/**
	 * @return List of GroupCompanyModel
	 */
	public List<GroupCompanyModel> getGroupCompanies();

	/**
	 * @return List of CompanyModel
	 */
	public List<CompanyModel> getCompanies();

	/**
	 * @return List of MarketModel
	 */
	public List<MarketModel> getMarkets();

	/**
	 * @return List of StrategicBusinessUnitModel
	 */
	public List<StrategicBusinessUnitModel> getStrategicBusinessUnits();

	/**
	 * @return List of BusinessUnitModel
	 */
	public List<BusinessUnitModel> getBusinessUnits();

	/**
	 * @return Map
	 */
	public Map<String, String> getClientTypeEnumValues();

	/**
	 * @return Map
	 */
	public Map<String, String> getClientCategoryEnumValues();

	/**
	 * @return Map
	 */
	public Map<String, String> getClientSubCategoryEnumValues();

	/**
	 * @return List of Category Models.
	 */
	public Collection<CategoryModel> getProductCategories();

	/**
	 * @param categoryCode
	 * @return CategoryModel
	 */
	public CategoryModel getProductMainCategory(final String categoryCode);

	/**
	 * @param savedQueryName
	 * @return List of SavedQueryModel
	 */
	List<SavedQueryModel> getSavedQueryByName(String savedQueryName);

	/**
	 * @param employeId
	 * @return List of SavedQueryModel
	 */
	public List<SavedQueryModel> getSavedQueriesByEmployee(String employeId);

	/**
	 * @param savedQueryCode
	 * @return List OrderModel
	 */
	public List<OrderModel> getBookingDetailsBySavedQuery(String savedQueryCode);
}
