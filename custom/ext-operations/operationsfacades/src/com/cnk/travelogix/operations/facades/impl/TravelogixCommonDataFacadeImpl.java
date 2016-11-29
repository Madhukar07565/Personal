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

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.category.CategoryService;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.client.masters.core.enums.ClientCategory;
import com.cnk.travelogix.client.masters.core.enums.ClientGroupCompany;
import com.cnk.travelogix.client.masters.core.enums.ClientSubCategory;
import com.cnk.travelogix.common.core.cart.data.CityData;
import com.cnk.travelogix.common.core.cart.data.SupplierData;
import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.masterdata.core.c2l.model.ContinentModel;
import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.masterdata.core.enums.ClientType;
import com.cnk.travelogix.masterdata.core.general.model.AbstractTravelogixItemModel;
import com.cnk.travelogix.operations.data.CategoryDto;
import com.cnk.travelogix.operations.data.ContinentData;
import com.cnk.travelogix.operations.data.EnumerationDto;
import com.cnk.travelogix.operations.data.TravelogixB2BUnitData;
import com.cnk.travelogix.operations.facades.TravelogixCommonDataFacade;
import com.cnk.travelogix.operations.services.ClientService;
import com.cnk.travelogix.operations.services.ContinentService;
import com.cnk.travelogix.operations.services.CountryService;
import com.cnk.travelogix.operations.services.category.TravelogixCategoryService;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * Implementation class of TravelogixCommonDataFacade interface.
 *
 * @author C5244543
 */
public class TravelogixCommonDataFacadeImpl implements TravelogixCommonDataFacade
{
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductService productService;
	@Autowired
	private TravelogixCategoryService travelogixCategoryService;
	@Autowired
	private ModelService modelService;
	@Autowired
	private EnumerationService enumerationService;
	@Autowired
	private Converter<CategoryModel, CategoryData> categoryConverter;
	@Autowired
	private Converter<ProductModel, ProductData> productConverter;
	@Autowired
	private ClientService clientService;
	@Autowired
	private ContinentService continentService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private Converter<SupplierModel, SupplierData> supplierConverter;
	@Autowired
	private Converter<ContinentModel, ContinentData> continentConverter;
	@Autowired
	private Converter<CityModel, CityData> cityConverter;
	@Autowired
	private Converter<TravelogixB2BUnitModel, TravelogixB2BUnitData> travelogixB2BUnitConverter;

	@Override
	public List<ContinentData> getContinents()
	{
		final List<ContinentModel> continentModels = continentService.findContinents();

		final List<ContinentData> continentDatas = new ArrayList<>();
		continentDatas.addAll(continentConverter.convertAll(continentModels));
		return continentDatas;
	}

	@Override
	public List<CityData> getCities(final String countryIsocode)
	{
		final CountryModel countryModel = countryService.findCountryByIsocode(countryIsocode);
		final List<CityData> cityDatas = new ArrayList<>();
		cityDatas.addAll(cityConverter.convertAll(countryModel.getCities()));
		return cityDatas;
	}



	@Override
	public List<EnumerationDto> getClientTypes()
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<ClientType> enumTypes = enumerationService.getEnumerationValues(ClientType._TYPECODE);
		for (final ClientType enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			dtos.add(dto);
		}
		return dtos;
	}


	@Override
	public List<EnumerationDto> getClientCategory()
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<ClientCategory> enumTypes = enumerationService.getEnumerationValues(ClientCategory._TYPECODE);
		for (final ClientCategory enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public List<EnumerationDto> getClientSubCategory()
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<ClientSubCategory> enumTypes = enumerationService.getEnumerationValues(ClientSubCategory._TYPECODE);
		for (final ClientSubCategory enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public List<EnumerationDto> getClientGroupCompany()
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<ClientGroupCompany> enumTypes = enumerationService.getEnumerationValues(ClientGroupCompany._TYPECODE);
		for (final ClientGroupCompany enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public List<SupplierData> getSuppliers(final String productCategory, final String productSubCategory)
	{
		List<SupplierData> supplierDatas = new ArrayList<>();
		if (productSubCategory != null && (!productSubCategory.isEmpty()))
		{
			supplierDatas = getSuppliers(productSubCategory);
		}
		else
		{
			if (productCategory != null && (!productCategory.isEmpty()))
			{
				supplierDatas = getSuppliers(productCategory);
			}
		}
		return supplierDatas;
	}

	@Override
	public List<SupplierData> getSuppliers(final String productCategory)
	{
		final List<SupplierData> supplierDatas = new ArrayList<>();
		final CategoryModel categoryModel = categoryService.getCategoryForCode(productCategory);
		if (null != categoryModel && categoryModel instanceof ProductCategorySubTypeModel)
		{
			final ProductCategorySubTypeModel categorySubTypeModel = (ProductCategorySubTypeModel) categoryModel;
			final Set<SupplierModel> supplierModels = categorySubTypeModel.getSuppliers();
			supplierDatas.addAll(supplierConverter.convertAll(supplierModels));
		}
		else if (null != categoryModel)
		{
			for (final CategoryModel subCategoryModel : categoryModel.getCategories())
			{
				if (subCategoryModel instanceof ProductCategorySubTypeModel)
				{
					final ProductCategorySubTypeModel categorySubTypeModel = (ProductCategorySubTypeModel) subCategoryModel;
					final Set<SupplierModel> supplierModels = categorySubTypeModel.getSuppliers();
					supplierDatas.addAll(supplierConverter.convertAll(supplierModels));
				}
			}
		}

		return supplierDatas;
	}

	@Override
	public List<TravelogixB2BUnitData> getClients(final String clientCategory, final String clientSubCategory)
	{
		final List<TravelogixB2BUnitData> clientDatas = new ArrayList<>();
		final List<TravelogixB2BUnitModel> b2bUnitModels = clientService.findClientsForClientCategories(clientCategory,
				clientSubCategory);
		if (b2bUnitModels != null && !b2bUnitModels.isEmpty())
		{
			clientDatas.addAll(travelogixB2BUnitConverter.convertAll(b2bUnitModels));
		}
		return clientDatas;
	}

	@Override
	public List<ProductData> getProductsForCategory(final String productCategory, final String productSubCategory)
	{
		List<ProductData> productDatas = new ArrayList<>();
		if (productSubCategory != null && (!productSubCategory.isEmpty()))
		{
			productDatas = getProductsForCategory(productSubCategory);
		}
		else
		{
			if (productCategory != null && (!productCategory.isEmpty()))
			{
				productDatas = getProductsForCategory(productCategory);
			}
		}
		return productDatas;
	}

	@Override
	public List<ProductData> getProductsForCategory(final String category)
	{
		final List<ProductData> productDatas = new ArrayList<>();
		final CategoryModel categoryModel = categoryService.getCategoryForCode(category);
		if (categoryModel != null)
		{
			final List<ProductModel> productModels = productService.getProductsForCategory(categoryModel);
			productDatas.addAll(productConverter.convertAll(productModels));
		}
		return productDatas;
	}

	@Override
	public List<CategoryDto> getProductCategoryAndSubCategory()
	{
		final List<CategoryDto> categoryDtos = new ArrayList<>();
		//get All the Root Category
		final Collection<CategoryModel> categoryModels = travelogixCategoryService.findProductCategory();
		for (final CategoryModel categoryModel : categoryModels)
		{
			final Collection<CategoryModel> models = categoryModel.getCategories();
			if (CollectionUtils.isNotEmpty(models))
			{
				final CategoryDto categoryDto = new CategoryDto();
				categoryDto.setCode(categoryModel.getCode());
				categoryDto.setName(categoryModel.getName());
				categoryDto.setSubCategory(categoryConverter.convertAll(models));
				categoryDtos.add(categoryDto);
			}
		}
		return categoryDtos;
	}

	@Override
	public boolean approval(final AbstractTravelogixItemModel model, final String remark)
	{
		boolean flag = false;
		if (model != null)
		{
			model.setActive(Boolean.TRUE);
			model.setRemarks(remark);
			model.setApprovalStatus(ArticleApprovalStatus.APPROVED);
			modelService.save(model);
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean reject(final AbstractTravelogixItemModel model, final String remark)
	{
		boolean flag = false;
		if (model != null)
		{
			model.setActive(Boolean.FALSE);
			model.setRemarks(remark);
			model.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
			modelService.save(model);
			flag = true;
		}
		return flag;
	}
}
