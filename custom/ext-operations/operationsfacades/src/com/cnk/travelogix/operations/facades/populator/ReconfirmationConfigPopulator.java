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

import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.commercefacades.product.data.ProductCategorySubTypeData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

import com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.model.ClientReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.model.ReconfirmationIntervalModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationtraveldestination.model.ReconfirmationTravelDestinationModel;
import com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.model.SupplierReconfirmationConfigModel;
import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.operations.data.ClientReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationIntervalData;
import com.cnk.travelogix.operations.data.ReconfirmationTravelDestinationData;
import com.cnk.travelogix.operations.data.SupplierReconfirmationConfigData;
import com.cnk.travelogix.operations.employee.data.EmployeeData;


/**
 * Populating ReconfirmationConfig model into data.
 *
 * @author C5244543
 */
public class ReconfirmationConfigPopulator implements Populator<ReconfirmationConfigModel, ReconfirmationConfigData>
{

	private Converter<EmployeeModel, EmployeeData> employeeConverter;
	private Converter<ClientReconfirmationConfigModel, ClientReconfirmationConfigData> clientReconfirmationConfigConverter;
	private Converter<SupplierReconfirmationConfigModel, SupplierReconfirmationConfigData> supplierReconfirmationConfigConverter;
	private Converter<ReconfirmationIntervalModel, ReconfirmationIntervalData> reconfirmationIntervalConverter;
	private Converter<ProductModel, ProductData> productConverter;
	private Converter<CategoryModel, CategoryData> categoryConverter;
	private Converter<ProductCategorySubTypeModel, ProductCategorySubTypeData> productCategorySubTypeConverter;
	private Converter<ReconfirmationTravelDestinationModel, ReconfirmationTravelDestinationData> reconfirmationTravelDestinationConverter;

	@Override
	public void populate(final ReconfirmationConfigModel source, final ReconfirmationConfigData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setCode(source.getCode());
		target.setApprovalStatus(source.getApprovalStatus().name());
		target.setActive(source.getActive());
		target.setCreationTime(new SimpleDateFormat("dd MMM yyyy").format(source.getCreationtime()));
		target.setConfirmationFor(getConfirmationFor(source));
		if (source.getLockedBy() != null)
		{
			target.setLockedBy(employeeConverter.convert(source.getLockedBy()));
		}
		if (source.getProduct() != null)
		{
			target.setProduct(productConverter.convert(source.getProduct()));
		}
		if (source.getProductCategory() != null)
		{
			target.setProductCategory(categoryConverter.convert(source.getProductCategory()));
		}
		if (source.getProductCategorySubType() != null)
		{
			target.setProductCategorySubType(productCategorySubTypeConverter.convert(source.getProductCategorySubType()));
		}

		target.setSupplierReconfirmationConfigs(getSupplierReconfirmationConfigs(source));
		target.setClientReconfirmationConfigs(getClientRecofirmationConfigs(source));

		if (source.getReconfirmationintervals() != null && !source.getReconfirmationintervals().isEmpty())
		{
			target.setReconfirmationintervals(reconfirmationIntervalConverter.convertAll(source.getReconfirmationintervals()));

		}
		if (source.getReconfirmationtraveldestinations() != null && !source.getReconfirmationtraveldestinations().isEmpty())
		{
			target.setReconfirmationTravelDestinations(
					reconfirmationTravelDestinationConverter.convertAll(source.getReconfirmationtraveldestinations()));

		}

	}

	private List<SupplierReconfirmationConfigData> getSupplierReconfirmationConfigs(final ReconfirmationConfigModel source)
	{
		final List<SupplierReconfirmationConfigData> supplierReconfirmationConfigDatas = new ArrayList<>();
		for (final SupplierReconfirmationConfigModel configModel : source.getSupplierreconfirmationconfigs())
		{
			supplierReconfirmationConfigDatas.add(supplierReconfirmationConfigConverter.convert(configModel));
		}
		return supplierReconfirmationConfigDatas;
	}

	private List<ClientReconfirmationConfigData> getClientRecofirmationConfigs(final ReconfirmationConfigModel source)
	{
		final List<ClientReconfirmationConfigData> clientReconfirmationConfigDatas = new ArrayList<>();
		for (final ClientReconfirmationConfigModel configModel : source.getClientreconfirmationconfigs())
		{
			clientReconfirmationConfigDatas.add(clientReconfirmationConfigConverter.convert(configModel));
		}

		return clientReconfirmationConfigDatas;
	}

	private String getConfirmationFor(final ReconfirmationConfigModel source)
	{
		String confirmFor = "";
		if (source.getClientreconfirmationconfigs() != null && !source.getClientreconfirmationconfigs().isEmpty())
		{
			if (source.getSupplierreconfirmationconfigs() != null && !source.getSupplierreconfirmationconfigs().isEmpty())
			{
				confirmFor = "Supplier & Client";
			}
			else
			{
				confirmFor = "Client";
			}
		}
		else
		{
			if (source.getSupplierreconfirmationconfigs() != null && !source.getSupplierreconfirmationconfigs().isEmpty())
			{
				confirmFor = "Supplier";
			}
		}
		return confirmFor;
	}

	/**
	 * @param clientReconfirmationConfigConverter
	 *           the clientReconfirmationConfigConverter to set
	 */
	public void setClientReconfirmationConfigConverter(
			final Converter<ClientReconfirmationConfigModel, ClientReconfirmationConfigData> clientReconfirmationConfigConverter)
	{
		this.clientReconfirmationConfigConverter = clientReconfirmationConfigConverter;
	}

	/**
	 * @param supplierReconfirmationConfigConverter
	 *           the supplierReconfirmationConfigConverter to set
	 */
	public void setSupplierReconfirmationConfigConverter(
			final Converter<SupplierReconfirmationConfigModel, SupplierReconfirmationConfigData> supplierReconfirmationConfigConverter)
	{
		this.supplierReconfirmationConfigConverter = supplierReconfirmationConfigConverter;
	}

	/**
	 * @param reconfirmationIntervalConverter
	 *           the reconfirmationIntervalConverter to set
	 */
	public void setReconfirmationIntervalConverter(
			final Converter<ReconfirmationIntervalModel, ReconfirmationIntervalData> reconfirmationIntervalConverter)
	{
		this.reconfirmationIntervalConverter = reconfirmationIntervalConverter;
	}

	/**
	 * @param productConverter
	 *           the productConverter to set
	 */
	public void setProductConverter(final Converter<ProductModel, ProductData> productConverter)
	{
		this.productConverter = productConverter;
	}

	/**
	 * @param categoryConverter
	 *           the categoryConverter to set
	 */
	public void setCategoryConverter(final Converter<CategoryModel, CategoryData> categoryConverter)
	{
		this.categoryConverter = categoryConverter;
	}

	/**
	 * @param employeeConverter
	 *           the employeeConverter to set
	 */
	public void setEmployeeConverter(final Converter<EmployeeModel, EmployeeData> employeeConverter)
	{
		this.employeeConverter = employeeConverter;
	}

	/**
	 * @return the productCategorySubTypeConverter
	 */
	public Converter<ProductCategorySubTypeModel, ProductCategorySubTypeData> getProductCategorySubTypeConverter()
	{
		return productCategorySubTypeConverter;
	}

	/**
	 * @param productCategorySubTypeConverter
	 *           the productCategorySubTypeConverter to set
	 */
	public void setProductCategorySubTypeConverter(
			final Converter<ProductCategorySubTypeModel, ProductCategorySubTypeData> productCategorySubTypeConverter)
	{
		this.productCategorySubTypeConverter = productCategorySubTypeConverter;
	}

	/**
	 * @param reconfirmationTravelDestinationConverter
	 *           the reconfirmationTravelDestinationConverter to set
	 */
	public void setReconfirmationTravelDestinationConverter(
			final Converter<ReconfirmationTravelDestinationModel, ReconfirmationTravelDestinationData> reconfirmationTravelDestinationConverter)
	{
		this.reconfirmationTravelDestinationConverter = reconfirmationTravelDestinationConverter;
	}

}
