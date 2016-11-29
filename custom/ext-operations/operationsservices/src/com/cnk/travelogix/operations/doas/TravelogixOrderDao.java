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
package com.cnk.travelogix.operations.doas;

import java.util.Collection;
import java.util.List;

import com.cnk.travelogix.orgstructure.core.model.BusinessUnitModel;
import com.cnk.travelogix.orgstructure.core.model.GroupCompanyModel;
import com.cnk.travelogix.orgstructure.core.model.GroupOfCompaniesModel;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;
import com.cnk.travelogix.orgstructure.core.model.StrategicBusinessUnitModel;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.flexiblesearch.SavedQueryModel;
import de.hybris.platform.core.model.order.OrderModel;


public interface TravelogixOrderDao
{
	/**
	 * @return List of GroupOfCompaniesModel's
	 */
	public List<GroupOfCompaniesModel> findGroupOfCompanies();

	/**
	 * @return List of GroupCompanyModel's
	 */
	public List<GroupCompanyModel> findGroupCompanies();

	/**
	 * @return List of CompanyModel's
	 */
	public List<CompanyModel> findCompanies();

	/**
	 * @return List of MarketModel's
	 */
	public List<MarketModel> findMarkets();

	/**
	 * @return List of StrategicBusinessUnitModel's
	 */
	public List<StrategicBusinessUnitModel> findStrategicBusinessUnits();

	/**
	 * @return List of BusinessUnitModel's
	 */
	public List<BusinessUnitModel> findBusinessUnits();

	/**
	 * Find all the Root Categories.
	 *
	 * @return List of CategoryModel's
	 */
	public Collection<CategoryModel> findProductCategories();

	/**
	 * @param categoryCode
	 * @return CategoryModel
	 */
	public CategoryModel findProductMainCategory(String categoryCode);

	/**
	 * @param savedQueryName
	 * @return list of SavedQueryModel's
	 */
	public List<SavedQueryModel> findSavedQueryByName(String savedQueryName);

	/**
	 * @param employeId
	 * @return list of SavedQueryModel's
	 */
	public List<SavedQueryModel> findSavedQueriesByEmployee(String employeId);

	/**
	 * @param savedQuery
	 * @return list of OrderModel's
	 */
	public List<OrderModel> findBookingDetailsBySavedQuery(String savedQuery);
}
