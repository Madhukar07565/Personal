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

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import de.hybris.platform.category.CategoryService;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.cnk.travelogix.common.core.cart.data.SupplierData;
import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.operations.data.CategoryDto;
import com.cnk.travelogix.operations.facades.impl.TravelogixCommonDataFacadeImpl;
import com.cnk.travelogix.operations.services.category.TravelogixCategoryService;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 *
 */
public class TravelogixCommonDataFacadeTest
{
	@Mock
	private CategoryService categoryService;
	@Mock
	private ProductService productService;
	@Mock
	private TravelogixCategoryService travelogixCategoryService;
	@Mock
	private ModelService mockModelService;
	@Mock
	private EnumerationService enumerationService;
	@Mock
	private Converter<CategoryModel, CategoryData> categoryConverter;
	@Mock
	private Converter<ProductModel, ProductData> productConverter;
	@Mock
	private Converter<SupplierModel, SupplierData> supplierConverter;
	@InjectMocks
	private final TravelogixCommonDataFacadeImpl configFacadeImpl = new TravelogixCommonDataFacadeImpl();

	final String PRODUCT_CATEGORY = "C001";
	final String PRODUCT_SUB_CATEGORY = "C001S001";

	@Before
	public void setUp()
	{
		//
	}

	@Test
	public void getSuppliersTest()
	{
		List<SupplierData> dtos = new ArrayList<>();
		final ProductCategorySubTypeModel categoryModel = Mockito.mock(ProductCategorySubTypeModel.class);
		given(categoryService.getCategoryForCode(PRODUCT_CATEGORY)).willReturn(categoryModel);
		given(supplierConverter.convertAll(categoryModel.getSuppliers())).willReturn(dtos);
		dtos = configFacadeImpl.getSuppliers(PRODUCT_CATEGORY);
		verify(categoryService).getCategoryForCode(PRODUCT_CATEGORY);
	}

	@Test
	public void getProductsForCategoryTest()
	{
		List<ProductData> productDatas = new ArrayList<>();
		final List<ProductModel> productModels = new ArrayList<>();

		final CategoryModel categoryModel = Mockito.mock(CategoryModel.class);
		given(categoryService.getCategoryForCode(PRODUCT_CATEGORY)).willReturn(categoryModel);
		given(productService.getProductsForCategory(categoryModel)).willReturn(productModels);
		given(productConverter.convertAll(productModels)).willReturn(productDatas);

		productDatas = configFacadeImpl.getProductsForCategory(PRODUCT_CATEGORY);
		verify(categoryService).getCategoryForCode(PRODUCT_CATEGORY);
		verify(productService).getProductsForCategory(categoryModel);

	}

	@Test
	public void getProductsForNullCategoryTest()
	{
		List<ProductData> productDatas = new ArrayList<>();
		productDatas.clear();
		CategoryModel categoryModel = Mockito.mock(CategoryModel.class);
		categoryModel = null;
		given(categoryService.getCategoryForCode(PRODUCT_CATEGORY)).willReturn(categoryModel);

		productDatas = configFacadeImpl.getProductsForCategory(PRODUCT_CATEGORY);
		verify(categoryService).getCategoryForCode(PRODUCT_CATEGORY);
	}

	@Test
	public void getProductCategoryAndSubCategoryTest()
	{
		final List<CategoryData> subCategory = new ArrayList<>();
		List<CategoryDto> categoryDtos = new ArrayList<>();
		final CategoryDto categoryDto = Mockito.mock(CategoryDto.class);
		categoryDto.setCode("C001");
		categoryDto.setName("TAJ");
		categoryDto.setSubCategory(subCategory);
		categoryDtos.add(categoryDto);
		final Collection<CategoryModel> categoryModels = new ArrayList<>();
		final CategoryModel categoryModel = Mockito.mock(CategoryModel.class);
		categoryModels.add(categoryModel);
		given(travelogixCategoryService.findProductCategory()).willReturn(categoryModels);
		given(categoryConverter.convertAll(categoryModels)).willReturn(subCategory);
		categoryDtos = configFacadeImpl.getProductCategoryAndSubCategory();
		verify(travelogixCategoryService).findProductCategory();
	}

}
