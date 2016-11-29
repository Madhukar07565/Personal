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

import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

import com.cnk.travelogix.common.core.cart.data.CityData;
import com.cnk.travelogix.common.core.cart.data.SupplierData;
import com.cnk.travelogix.masterdata.core.general.model.AbstractTravelogixItemModel;
import com.cnk.travelogix.operations.data.CategoryDto;
import com.cnk.travelogix.operations.data.ContinentData;
import com.cnk.travelogix.operations.data.EnumerationDto;
import com.cnk.travelogix.operations.data.TravelogixB2BUnitData;


/**
 * This interface provides common methods for on load screen.
 *
 * @author C5244543
 */
public interface TravelogixCommonDataFacade
{
	List<ContinentData> getContinents();

	List<CityData> getCities(String countryIsocode);

	List<EnumerationDto> getClientTypes();

	List<EnumerationDto> getClientSubCategory();

	List<EnumerationDto> getClientCategory();

	List<EnumerationDto> getClientGroupCompany();

	List<SupplierData> getSuppliers(String productCategory);

	List<SupplierData> getSuppliers(final String productCategory, final String productSubCategory);

	List<TravelogixB2BUnitData> getClients(final String clientCategory, final String clientSubCategory);

	List<ProductData> getProductsForCategory(String category);

	List<ProductData> getProductsForCategory(final String productCategory, final String productSubCategory);

	List<CategoryDto> getProductCategoryAndSubCategory();

	boolean approval(final AbstractTravelogixItemModel model, final String remark);

	boolean reject(final AbstractTravelogixItemModel model, final String remark);
}
