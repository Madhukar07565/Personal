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

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.client.core.enums.BookingPriority;
import com.cnk.travelogix.client.masters.core.enums.ClientCategory;
import com.cnk.travelogix.client.masters.core.enums.ClientSubCategory;
import com.cnk.travelogix.masterdata.core.enums.ClientType;
import com.cnk.travelogix.operations.data.SearchFilterData;
import com.cnk.travelogix.operations.doas.TravelogixOrderDao;
import com.cnk.travelogix.operations.services.TravelogixOrderService;
import com.cnk.travelogix.orgstructure.core.model.BusinessUnitModel;
import com.cnk.travelogix.orgstructure.core.model.GroupCompanyModel;
import com.cnk.travelogix.orgstructure.core.model.GroupOfCompaniesModel;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;
import com.cnk.travelogix.orgstructure.core.model.StrategicBusinessUnitModel;

import de.hybris.platform.b2b.enums.BookingType;
import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.flexiblesearch.SavedQueryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.type.TypeService;
import de.hybris.platform.servicelayer.user.UserService;


/**
 * Default implementation for the TravelogixOrderService
 */
public class DefaultTravelogixOrderService implements TravelogixOrderService
{
	private static final Logger LOG = Logger.getLogger(DefaultTravelogixOrderService.class);

	@Resource(name = "travelogixOrderDao")
	private TravelogixOrderDao travelogixOrderDao;

	@Resource(name = "modelService")
	ModelService modelService;

	@Resource(name = "userService")
	UserService userService;

	@Resource(name = "enumerationService")
	private EnumerationService enumerationService;

	@Resource
	private TypeService typeService;

	@Resource(name = "flexibleSearchService")
	FlexibleSearchService flexibleSearchService;


	/**
	 * This method is for creating saved query against employee
	 *
	 * @param searchFilterData
	 */
	@Override
	public void createSavedQuery(final SearchFilterData searchFilterData)
	{
		LOG.debug("createSavedQuery() called...");
		final EmployeeModel employeel = (EmployeeModel) userService.getCurrentUser();

		LOG.debug("current User : " + employeel.getUid());

		final String bookingReference = searchFilterData.getBookingRefNumber();
		final String userName = searchFilterData.getUserName();
		final String financialControlId = searchFilterData.getFinancialControlId();
		final String getBookingDateFrom = searchFilterData.getBookingDateFrom();

		final String supplierCode = searchFilterData.getSupplierCode();

		final String marketUid = searchFilterData.getMarketUid();
		final String companyUid = searchFilterData.getCompanyUid();
		final String groupCompanyUid = searchFilterData.getGroupCompanyUid();
		final String groupOfCompanyUid = searchFilterData.getGroupOfCompanyUid();

		final String travellerName = searchFilterData.getTravellerName();
		final String travellerPhoneNumber = searchFilterData.getTravellerPhoneNumber();
		final String travellerEmail = searchFilterData.getTravellerEmailId();

		final SavedQueryModel savedQuery = modelService.create(SavedQueryModel.class);
		savedQuery.setCode(searchFilterData.getSavedQueryName());
		savedQuery.setName(searchFilterData.getSavedQueryName());
		savedQuery.setDescription(searchFilterData.getSavedQueryName());
		savedQuery.setEmployee(employeel);
		savedQuery.setResultType(typeService.getComposedTypeForClass(OrderModel.class));

		final StringBuilder query = new StringBuilder();
		query.append(
				"select {order:pk} from {Order as order join User as user on {order:user}={user:pk} join AbstractOrderEntry as aoe on {aoe:order}={order:pk} "
						+ "join OrderProductInfo as opi on {aoe:orderProductInfo}={opi:pk} join Supplier as supplier on{opi:enablersupplier}={supplier:pk} "
						+ "join Traveller as traveller on {traveller:abstractorderentry}={aoe:pk} join Customer as customer on {traveller:customer}={customer:pk} "
						+ "join Company as company on {order:company}={company:pk} join GroupCompany as gc on {company:groupcompany}={gc:pk}"
						+ "join GroupOfCompanies as goc on {gc:groupofcompanies}={goc:pk} join Market as market on {order:market}={market:pk}} "
						+ "where {order:code} like " + "\'" + bookingReference + "\'" + "OR {user:name} like " + "\'" + userName + "\'"
						+ "OR {supplier:code} like " + "\'" + supplierCode + "\'" + " OR {order:financialControlId} like " + "\'"
						+ financialControlId + "\'" + " OR {customer:name} like " + "\'" + travellerName + "\'"
						+ " OR {traveller:mobileNumber} like " + "\'" + travellerPhoneNumber + "\'" + " OR {traveller:email} like "
						+ "\'" + travellerEmail + "\'" + " OR {company:uid} like " + "\'" + companyUid + "\'" + " OR {gc:uid} like "
						+ "\'" + groupCompanyUid + "\'" + " OR {goc:uid} like " + "\'" + groupOfCompanyUid + "\'"
						+ " OR {market:uid} like " + "\'" + marketUid + "\'" + " OR {order:date} >= " + "\'" + getBookingDateFrom + "\'"
						+ " order by {order:code} asc");

		savedQuery.setQuery(query.toString());
		LOG.debug("------Saved query-------:" + savedQuery.getQuery());
		modelService.save(savedQuery);

		//savedQuery.setQuery(
		//		"select {o:pk} from {$$$ as o} WHERE {o:code}like ?code or {o:remarks} like ?remarks order by {o:code} asc");
		//		final Map queryParams = new HashMap<>();
		//		queryParams.put("code", typeService.getAtomicType("java.lang.String"));
		//		queryParams.put("remarks", typeService.getAtomicType("java.lang.String"));
		//		savedQuery.setProperty("code", bookingRefNum);
		//		savedQuery.setParams(queryParams);
	}

	/**
	 * @param savedQueryCode
	 * @return List of OrderModel
	 */
	@Override
	public List<OrderModel> getBookingDetailsBySavedQuery(final String savedQueryCode)
	{
		final SavedQueryModel savedQueryModel = modelService.create(SavedQueryModel.class);
		SavedQueryModel savedQuery = null;
		savedQueryModel.setCode(savedQueryCode);

		final List<SavedQueryModel> savedQueryModels = flexibleSearchService.getModelsByExample(savedQueryModel);
		if (null != savedQueryModels && !savedQueryModels.isEmpty())
		{
			savedQuery = savedQueryModels.get(0);
			LOG.debug("savedQuery" + savedQuery);
		}
		final String query = savedQuery.getQuery();
		return travelogixOrderDao.findBookingDetailsBySavedQuery(query);
	}

	/**
	 * @return List of CategoryModel
	 */
	@Override
	public Collection<CategoryModel> getProductCategories()
	{
		return travelogixOrderDao.findProductCategories();
	}

	/**
	 * @param categoryCode
	 * @return CategoryModel
	 */
	@Override
	public CategoryModel getProductMainCategory(final String categoryCode)
	{
		return travelogixOrderDao.findProductMainCategory(categoryCode);
	}

	/**
	 * @param savedQueryName
	 * @return SavedQueryModel
	 */
	@Override
	public List<SavedQueryModel> getSavedQueryByName(final String savedQueryName)
	{
		return travelogixOrderDao.findSavedQueryByName(savedQueryName);
	}

	/**
	 * @param employeId
	 * @return List SavedQueryModel
	 */
	@Override
	public List<SavedQueryModel> getSavedQueriesByEmployee(final String employeId)
	{
		return travelogixOrderDao.findSavedQueriesByEmployee(employeId);
	}

	@Override
	public Map<String, String> getBookingPriorityEnumValues()
	{
		final Map<String, String> bookingPriorityMap = new HashMap<>();
		List<BookingPriority> bookingPriorities = null;
		try
		{
			bookingPriorities = enumerationService.getEnumerationValues(BookingPriority._TYPECODE);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured calling getBookingPriorityEnumValues() " + e.getMessage(), e);
		}
		for (final BookingPriority bookingPriority : bookingPriorities)
		{
			bookingPriorityMap.put(bookingPriority.getCode(), enumerationService.getEnumerationName(bookingPriority));
		}
		return bookingPriorityMap;
	}

	@Override
	public Map<String, String> getBookingStatusEnumValues()
	{
		final Map<String, String> bookingStatusMap = new HashMap<>();
		List<OrderStatus> orderStatusList = null;
		try
		{
			orderStatusList = enumerationService.getEnumerationValues(OrderStatus._TYPECODE);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured calling getBookingPriorityEnumValues() " + e.getMessage(), e);
		}
		for (final OrderStatus orderStatus : orderStatusList)
		{
			bookingStatusMap.put(orderStatus.getCode(), enumerationService.getEnumerationName(orderStatus));
		}
		return bookingStatusMap;
	}

	@Override
	public Map<String, String> getBookingTypeEnumValues()
	{
		final Map<String, String> bookingTypeMap = new HashMap<>();
		List<BookingType> bookingTypeList = null;
		try
		{
			bookingTypeList = enumerationService.getEnumerationValues(BookingType._TYPECODE);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured calling getBookingTypeEnumValues() " + e.getMessage(), e);
		}

		for (final BookingType bookingType : bookingTypeList)
		{
			bookingTypeMap.put(bookingType.getCode(), enumerationService.getEnumerationName(bookingType));
		}
		return bookingTypeMap;
	}

	@Override
	public Map<String, String> getClientTypeEnumValues()
	{
		final Map<String, String> clientTypeMap = new HashMap<>();
		List<ClientType> clientTypeList = null;
		try
		{
			clientTypeList = enumerationService.getEnumerationValues(ClientType._TYPECODE);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured calling getClientTypeEnumValues() " + e.getMessage(), e);
		}

		for (final ClientType clientType : clientTypeList)
		{
			clientTypeMap.put(clientType.getCode(), enumerationService.getEnumerationName(clientType));
		}
		return clientTypeMap;
	}


	@Override
	public Map<String, String> getClientCategoryEnumValues()
	{
		final Map<String, String> clientCategoryMap = new HashMap<>();
		List<ClientCategory> clientCategoryList = null;
		try
		{
			clientCategoryList = enumerationService.getEnumerationValues(ClientCategory._TYPECODE);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured calling getClientCategoryEnumValues() " + e.getMessage(), e);
		}

		for (final ClientCategory clientCategory : clientCategoryList)
		{
			clientCategoryMap.put(clientCategory.getCode(), enumerationService.getEnumerationName(clientCategory));
		}
		return clientCategoryMap;
	}

	@Override
	public Map<String, String> getClientSubCategoryEnumValues()
	{
		final Map<String, String> clientSubCatMap = new HashMap<>();
		List<ClientSubCategory> clientSubCatList = null;
		try
		{
			clientSubCatList = enumerationService.getEnumerationValues(ClientSubCategory._TYPECODE);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured calling getClientSubCategoryEnumValues() " + e.getMessage(), e);
		}

		for (final ClientSubCategory clientSubCategory : clientSubCatList)
		{
			clientSubCatMap.put(clientSubCategory.getCode(), enumerationService.getEnumerationName(clientSubCategory));
		}
		return clientSubCatMap;
	}

	@Override
	public List<GroupOfCompaniesModel> getGroupOfCompanies()
	{
		return travelogixOrderDao.findGroupOfCompanies();
	}

	@Override
	public List<GroupCompanyModel> getGroupCompanies()
	{
		return travelogixOrderDao.findGroupCompanies();
	}

	@Override
	public List<CompanyModel> getCompanies()
	{
		return travelogixOrderDao.findCompanies();
	}

	@Override
	public List<MarketModel> getMarkets()
	{
		return travelogixOrderDao.findMarkets();
	}

	@Override
	public List<StrategicBusinessUnitModel> getStrategicBusinessUnits()
	{
		return travelogixOrderDao.findStrategicBusinessUnits();
	}

	@Override
	public List<BusinessUnitModel> getBusinessUnits()
	{
		return travelogixOrderDao.findBusinessUnits();
	}
}
