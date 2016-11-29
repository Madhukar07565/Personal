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
package com.cnk.travelogix.operations.facades.impl;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.flexiblesearch.SavedQueryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.type.TypeService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.operations.data.BusinessUnitData;
import com.cnk.travelogix.operations.data.CompanyData;
import com.cnk.travelogix.operations.data.GroupCompanyData;
import com.cnk.travelogix.operations.data.GroupOfCompaniesData;
import com.cnk.travelogix.operations.data.MarketData;
import com.cnk.travelogix.operations.data.SavedQueryData;
import com.cnk.travelogix.operations.data.SearchFilterData;
import com.cnk.travelogix.operations.data.StrategicBusinessUnitData;
import com.cnk.travelogix.operations.employee.data.EmployeeData;
import com.cnk.travelogix.operations.facades.OrderListFacade;
import com.cnk.travelogix.operations.services.OperationOrderService;
import com.cnk.travelogix.operations.services.TravelogixOrderService;
import com.cnk.travelogix.orgstructure.core.model.BusinessUnitModel;
import com.cnk.travelogix.orgstructure.core.model.GroupCompanyModel;
import com.cnk.travelogix.orgstructure.core.model.GroupOfCompaniesModel;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;
import com.cnk.travelogix.orgstructure.core.model.StrategicBusinessUnitModel;


/**
 * Default implementation for the OrderListFacade
 */
public class OrderListFacadeImpl implements OrderListFacade
{
	private static final Logger LOG = Logger.getLogger(OrderListFacadeImpl.class);

	private Converter<OrderModel, OrderData> orderConverter;

	private OperationOrderService operationOrderService;

	@Resource(name = "modelService")
	ModelService modelService;

	@Resource(name = "userService")
	UserService userService;

	@Resource
	private TypeService typeService;

	@Resource(name = "enumerationService")
	private EnumerationService enumerationService;

	@Resource(name = "travelogixOrderService")
	TravelogixOrderService travelogixOrderService;

	@Resource(name = "employeeConverter")
	//private Converter<EmployeeModel, EmployeeData> employeeConverter;
	private Converter<UserModel, EmployeeData> employeeConverter;

	@Resource(name = "categoryConverter")
	private Converter<CategoryModel, CategoryData> categoryConverter;

	/**
	 * This method is for Saving the Search Criteria
	 *
	 * @param searchFilterData
	 */
	@Override
	public void createSavedQuery(final SearchFilterData searchFilterData)
	{
		try
		{
			travelogixOrderService.createSavedQuery(searchFilterData);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while creating saved query with saved query name : " + searchFilterData.getSavedQueryName(),
					e);
		}
	}

	@Override
	public Map<String, String> getBookingPriorityEnumValues()
	{
		return travelogixOrderService.getBookingPriorityEnumValues();
	}


	@Override
	public Map<String, String> getBookingStatusEnumValues()
	{
		return travelogixOrderService.getBookingStatusEnumValues();
	}

	@Override
	public Map<String, String> getBookingTypeEnumValues()
	{
		return travelogixOrderService.getBookingTypeEnumValues();
	}

	/**
	 * @return List of GroupOfCompaniesData
	 */
	@Override
	public List<GroupOfCompaniesData> getGroupOfCompanies()
	{
		List<GroupOfCompaniesData> groupOfCompaniesDatas = null;
		List<GroupOfCompaniesModel> groupOfCompaniesModels = null;
		try
		{
			groupOfCompaniesModels = travelogixOrderService.getGroupOfCompanies();
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while executing getGroupOfCompanies()" + e.getMessage(), e);
		}

		groupOfCompaniesDatas = populate(groupOfCompaniesModels);
		return groupOfCompaniesDatas;
	}

	/**
	 * @return List of GroupCompanyData
	 */
	@Override
	public List<GroupCompanyData> getGroupCompanies()
	{
		List<GroupCompanyData> groupCompanyDatas = null;
		List<GroupCompanyModel> groupCompanyModels = null;
		try
		{
			groupCompanyModels = travelogixOrderService.getGroupCompanies();
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while executing getGroupCompanies()" + e.getMessage(), e);
		}

		groupCompanyDatas = populateGroupCompanies(groupCompanyModels);
		return groupCompanyDatas;
	}

	/**
	 * @return List of CompanyData
	 */
	@Override
	public List<CompanyData> getCompanies()
	{
		List<CompanyData> companyDatas = null;
		List<CompanyModel> companyModels = null;
		try
		{
			companyModels = travelogixOrderService.getCompanies();
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while executing getGroupCompanies()" + e.getMessage(), e);
		}

		companyDatas = populateCompanies(companyModels);
		return companyDatas;
	}

	/**
	 * @return List of MarketData
	 */
	@Override
	public List<MarketData> getMarkets()
	{
		List<MarketData> marketDatas = null;
		List<MarketModel> marketModels = null;
		try
		{
			marketModels = travelogixOrderService.getMarkets();
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while executing getMarkets()" + e.getMessage(), e);
		}

		marketDatas = populateMarkets(marketModels);
		return marketDatas;
	}

	/**
	 * @return List of StrategicBusinessUnitData
	 */
	@Override
	public List<StrategicBusinessUnitData> getStrategicBusinessUnits()
	{
		List<StrategicBusinessUnitData> strategicBusinessUnitDatas = null;
		List<StrategicBusinessUnitModel> StrategicBusinessUnitModels = null;
		try
		{
			StrategicBusinessUnitModels = travelogixOrderService.getStrategicBusinessUnits();
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while executing getProductCategoryAndSubCategory()- " + e.getMessage(), e);
		}

		strategicBusinessUnitDatas = populateSBU(StrategicBusinessUnitModels);
		return strategicBusinessUnitDatas;
	}

	/**
	 * @return List of BusinessUnitData
	 */
	@Override
	public List<BusinessUnitData> getBusinessUnits()
	{
		List<BusinessUnitData> businessUnitDatas = null;
		List<BusinessUnitModel> businessUnitModels = null;
		try
		{
			businessUnitModels = travelogixOrderService.getBusinessUnits();
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while executing getProductCategoryAndSubCategory()- " + e.getMessage(), e);
		}
		businessUnitDatas = populateBU(businessUnitModels);
		return businessUnitDatas;
	}

	@Override
	public Map<String, String> getClientTypeEnumValues()
	{
		return travelogixOrderService.getClientTypeEnumValues();
	}

	@Override
	public Map<String, String> getClientCategoryEnumValues()
	{
		return travelogixOrderService.getClientCategoryEnumValues();
	}

	@Override
	public Map<String, String> getClientSubCategoryEnumValues()
	{
		return travelogixOrderService.getClientSubCategoryEnumValues();
	}

	/**
	 * Getting root Categories and its sub categories.
	 *
	 * @return Map holds category and List of its sub categories
	 */
	@Override
	public Map<CategoryData, List<CategoryData>> getProductCategoryAndSubCategory()
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("getProductCategoryAndSubCategory() called ");
		}
		//Getting all the root categories
		Collection<CategoryModel> categoryModels = null;
		try
		{
			categoryModels = travelogixOrderService.getProductCategories();
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while executing getProductCategoryAndSubCategory()- " + e.getMessage(), e);
		}

		final Map<CategoryData, List<CategoryData>> categoriesMap = new HashMap<>();

		for (final CategoryModel categoryModel : categoryModels)
		{
			final CategoryData categoryData = categoryConverter.convert(categoryModel);
			final Collection<CategoryModel> catModels = categoryModel.getCategories();
			if (CollectionUtils.isNotEmpty(catModels))
			{
				List<CategoryData> categoryDatas = new ArrayList<>();
				if (null != catModels)
				{
					categoryDatas = categoryConverter.convertAll(catModels);
				}
				categoriesMap.put(categoryData, categoryDatas);
			}
		}
		return categoriesMap;
	}


	@Override
	public List<CategoryData> getProductSubCategories(final String categoryCode)
	{
		List<CategoryData> cateogryDatas = new ArrayList<>();
		CategoryModel categoryModel = null;
		try
		{
			categoryModel = travelogixOrderService.getProductMainCategory(categoryCode);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while executing getProductSubCategories()- " + e.getMessage(), e);
		}

		if (null != categoryModel)
		{
			final List<CategoryModel> cateogryModels = categoryModel.getCategories();
			if (null != cateogryModels)
			{
				cateogryDatas = categoryConverter.convertAll(cateogryModels);
			}
		}
		return cateogryDatas;
	}

	/**
	 * @param savedQueryName
	 * @return int
	 */
	@Override
	public int getSavedQueriesCount(final String savedQueryName)
	{
		LOG.debug("checkSavedQuery() called with savedQueryName : " + savedQueryName);
		List<SavedQueryModel> savedQueryModels = null;
		if (null == savedQueryName || savedQueryName.isEmpty())
		{
			return 1;
		}

		try
		{
			savedQueryModels = travelogixOrderService.getSavedQueryByName(savedQueryName);
			if (null != savedQueryModels)
			{
				return savedQueryModels.size();
			}
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while getting saved query names with savedQueryName " + savedQueryName + e.getMessage(), e);
		}
		return 1;
	}


	/**
	 * @return List of SavedQueryModel's
	 */
	@Override
	public List<SavedQueryData> getSavedQueriesByEmployee()
	{
		final List<SavedQueryData> savedQueryDatas = new ArrayList<>();
		final EmployeeModel employeeModel = (EmployeeModel) userService.getCurrentUser();
		String employeId = null;
		if (null != employeeModel)
		{
			employeId = employeeModel.getUid();
		}
		List<SavedQueryModel> savedQueryModels = null;
		try
		{
			savedQueryModels = travelogixOrderService.getSavedQueriesByEmployee(employeId);
			if (null != savedQueryModels && !savedQueryModels.isEmpty())
			{
				LOG.debug("savedQueryModels size : " + savedQueryModels.size());

				for (final SavedQueryModel savedQueryModel : savedQueryModels)
				{
					SavedQueryData savedQueryData = new SavedQueryData();
					savedQueryData = populate(savedQueryModel);
					savedQueryDatas.add(savedQueryData);
				}
			}
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while getting saved queries for employee - " + employeId + e.getMessage(), e);
		}
		return savedQueryDatas;
	}

	@Override
	public List<OrderData> getBookingDetailsBySavedQuery(final String savedQueryCode)
	{
		List<OrderModel> orderModels = null;
		List<OrderData> orderDatas = null;

		try
		{
			orderModels = travelogixOrderService.getBookingDetailsBySavedQuery(savedQueryCode);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while executing getBookingDetailsBySavedQuery() with savedQueryCode - " + savedQueryCode
					+ e.getMessage(), e);
		}

		if (null != orderModels)
		{
			orderDatas = getOrderConverter().convertAll(orderModels);
		}
		return orderDatas;
	}

	SavedQueryData populate(final SavedQueryModel savedQueryModel)
	{
		final SavedQueryData savedQueryData = new SavedQueryData();
		if (null != savedQueryModel)
		{
			savedQueryData.setCode(savedQueryModel.getCode());
			savedQueryData.setName(savedQueryModel.getName());
		}
		return savedQueryData;
	}

	public List<GroupOfCompaniesData> populate(final List<GroupOfCompaniesModel> groupOfCompaniesModels)
	{
		final List<GroupOfCompaniesData> groupOfCompaniesDatas = new ArrayList<>();
		if (null != groupOfCompaniesModels)
		{
			for (final GroupOfCompaniesModel groupOfCompaniesModel : groupOfCompaniesModels)
			{
				final GroupOfCompaniesData groupOfCompaniesData = new GroupOfCompaniesData();
				groupOfCompaniesData.setUid(groupOfCompaniesModel.getUid());
				groupOfCompaniesData.setName(groupOfCompaniesModel.getName());
				groupOfCompaniesDatas.add(groupOfCompaniesData);
			}
		}
		return groupOfCompaniesDatas;
	}

	public List<GroupCompanyData> populateGroupCompanies(final List<GroupCompanyModel> groupCompanyModels)
	{
		final List<GroupCompanyData> groupCompanyDatas = new ArrayList<>();

		if (null != groupCompanyModels)
		{
			for (final GroupCompanyModel groupCompanyModel : groupCompanyModels)
			{
				final GroupCompanyData groupCompanyData = new GroupCompanyData();
				groupCompanyData.setUid(groupCompanyModel.getUid());
				groupCompanyData.setName(groupCompanyModel.getName());
				groupCompanyDatas.add(groupCompanyData);
			}
		}
		return groupCompanyDatas;
	}

	public List<CompanyData> populateCompanies(final List<CompanyModel> companyModels)
	{
		final List<CompanyData> CompanyDatas = new ArrayList<>();
		if (null != companyModels)
		{
			for (final CompanyModel companyModel : companyModels)
			{
				final CompanyData companyData = new CompanyData();
				companyData.setUid(companyModel.getUid());
				companyData.setName(companyModel.getName());
				CompanyDatas.add(companyData);
			}
		}
		return CompanyDatas;
	}

	public List<MarketData> populateMarkets(final List<MarketModel> marketModels)
	{
		final List<MarketData> marketDatas = new ArrayList<>();
		if (null != marketModels)
		{
			for (final MarketModel marketModel : marketModels)
			{
				final MarketData marketData = new MarketData();
				marketData.setUid(marketModel.getUid());
				marketData.setName(marketModel.getName());
				marketDatas.add(marketData);
			}
		}
		return marketDatas;
	}

	public List<StrategicBusinessUnitData> populateSBU(final List<StrategicBusinessUnitModel> sbuList)
	{
		final List<StrategicBusinessUnitData> strategicBusinessUnitDatas = new ArrayList<>();
		if (null != sbuList)
		{
			for (final StrategicBusinessUnitModel sbuModel : sbuList)
			{
				final StrategicBusinessUnitData sbuData = new StrategicBusinessUnitData();
				sbuData.setUid(sbuModel.getUid());
				sbuData.setName(sbuModel.getName());
				strategicBusinessUnitDatas.add(sbuData);
			}
		}
		return strategicBusinessUnitDatas;
	}

	public List<BusinessUnitData> populateBU(final List<BusinessUnitModel> buList)
	{
		final List<BusinessUnitData> BusinessUnitDatas = new ArrayList<>();
		if (null != buList)
		{
			for (final BusinessUnitModel buModel : buList)
			{
				final BusinessUnitData buData = new BusinessUnitData();
				buData.setUid(buModel.getUid());
				buData.setName(buModel.getName());
				BusinessUnitDatas.add(buData);
			}
		}
		return BusinessUnitDatas;
	}

	/**
	 * This method will return list of Orders
	 */
	@Override
	public List<OrderData> getListOfOrders()
	{
		FlexibleSearchService flexibleSearchService;
		flexibleSearchService = Registry.getApplicationContext().getBean("flexibleSearchService", FlexibleSearchService.class);

		final String QRY_GET_ALL_ORDERS = "SELECT {PK} from {ORDER}";
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(QRY_GET_ALL_ORDERS);
		final SearchResult<OrderModel> searchResult = flexibleSearchService.search(fQuery);
		final List<OrderModel> orderModelList = searchResult.getResult();
		LOG.debug("orderModelList size : " + orderModelList.size());

		final List<OrderData> orderDataList = new ArrayList<>();
		for (final OrderModel orderModel : orderModelList)
		{
			OrderData orderData;
			orderData = orderConverter.convert(orderModel);
			orderDataList.add(orderData);
		}
		return orderDataList;
	}

	/**
	 * @param code
	 * @return OrderData
	 */
	@Override
	public OrderData getOrdersForCode(final String code)
	{
		final OrderModel orderModel = getOperationOrderService().getOrderByCode(code);
		if (orderModel != null)
		{
			final OrderData orderData = getOrderConverter().convert(orderModel);
			return orderData;
		}
		// YTODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the orderConverter
	 */
	public Converter<OrderModel, OrderData> getOrderConverter()
	{
		return orderConverter;
	}

	/**
	 * @param orderConverter
	 *           the orderConverter to set
	 */
	@Required
	public void setOrderConverter(final Converter<OrderModel, OrderData> orderConverter)
	{
		this.orderConverter = orderConverter;
	}

	/**
	 * @return the operationOrderService
	 */
	public OperationOrderService getOperationOrderService()
	{
		return operationOrderService;
	}

	/**
	 * @param operationOrderService
	 *           the operationOrderService to set
	 */
	public void setOperationOrderService(final OperationOrderService operationOrderService)
	{
		this.operationOrderService = operationOrderService;
	}
}
