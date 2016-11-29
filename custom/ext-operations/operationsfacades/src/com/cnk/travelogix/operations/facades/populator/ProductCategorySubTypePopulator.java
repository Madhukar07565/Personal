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
package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.commercefacades.product.data.ProductCategorySubTypeData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import com.cnk.travelogix.common.core.cart.data.SupplierData;
import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * Populating ProductCategorySubType model into Data
 *
 * @author C5244543
 */
public class ProductCategorySubTypePopulator implements Populator<ProductCategorySubTypeModel, ProductCategorySubTypeData>
{

	private Converter<SupplierModel, SupplierData> supplierConverter;

	@Override
	public void populate(final ProductCategorySubTypeModel source, final ProductCategorySubTypeData target)
			throws ConversionException
	{
		if (source != null)
		{
			target.setCode(source.getCode());
			target.setName(source.getName());
			target.setSuppliers(supplierConverter.convertAll(source.getSuppliers()));
		}
	}

	/**
	 * @return the supplierConverter
	 */
	public Converter<SupplierModel, SupplierData> getSupplierConverter()
	{
		return supplierConverter;
	}

	/**
	 * @param supplierConverter
	 *           the supplierConverter to set
	 */
	public void setSupplierConverter(final Converter<SupplierModel, SupplierData> supplierConverter)
	{
		this.supplierConverter = supplierConverter;
	}



}
