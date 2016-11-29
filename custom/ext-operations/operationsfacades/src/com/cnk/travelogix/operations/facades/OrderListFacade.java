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
package com.cnk.travelogix.operations.facades;

import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.product.data.CategoryData;

import java.util.List;
import java.util.Map;

import com.cnk.travelogix.operations.data.BusinessUnitData;
import com.cnk.travelogix.operations.data.CompanyData;
import com.cnk.travelogix.operations.data.GroupCompanyData;
import com.cnk.travelogix.operations.data.GroupOfCompaniesData;
import com.cnk.travelogix.operations.data.MarketData;
import com.cnk.travelogix.operations.data.SavedQueryData;
import com.cnk.travelogix.operations.data.SearchFilterData;
import com.cnk.travelogix.operations.data.StrategicBusinessUnitData;


/**
 *
 */

public interface OrderListFacade
{
	/**
	 * @return List of OrderData
	 */
	public List<OrderData> getListOfOrders();

	/**
	 * @param code
	 * @return OrderData
	 */

	public OrderData getOrdersForCode(final String code);

	/**
	 * @param searchFilterData
	 *
	 */
	public void createSavedQuery(SearchFilterData searchFilterData);

	public Map<String, String> getBookingPriorityEnumValues();

	public Map<String, String> getBookingStatusEnumValues();

	public Map<String, String> getBookingTypeEnumValues();

	/**
	 * @return List of GroupOfCompaniesData
	 */
	public List<GroupOfCompaniesData> getGroupOfCompanies();

	/**
	 * @return List of GroupCompanyData
	 */
	public List<GroupCompanyData> getGroupCompanies();

	/**
	 * @return List of CompanyData
	 */
	public List<CompanyData> getCompanies();

	/**
	 * @return List of MarketData
	 */
	public List<MarketData> getMarkets();

	/**
	 * @return List of StrategicBusinessUnitData
	 */
	public List<StrategicBusinessUnitData> getStrategicBusinessUnits();

	/**
	 * @return List of BusinessUnitData
	 */
	public List<BusinessUnitData> getBusinessUnits();

	public Map<String, String> getClientTypeEnumValues();

	public Map<String, String> getClientCategoryEnumValues();

	public Map<String, String> getClientSubCategoryEnumValues();

	/**
	 * Gets Root Categories and its sub categories.
	 *
	 * @return Map holds category and List of its sub categories
	 */
	public Map<CategoryData, List<CategoryData>> getProductCategoryAndSubCategory();

	/**
	 * @param categoryCode
	 * @return List of CategoryData
	 */
	public List<CategoryData> getProductSubCategories(String categoryCode);

	/**
	 * @param savedQueryName
	 * @return count of the saved queries
	 */
	public int getSavedQueriesCount(final String savedQueryName);

	/**
	 * @return List of saved queries against the employee
	 */
	List<SavedQueryData> getSavedQueriesByEmployee();

	/**
	 * @param savedQueryCode
	 * @return List of OrderData
	 */
	List<OrderData> getBookingDetailsBySavedQuery(String savedQueryCode);

}
