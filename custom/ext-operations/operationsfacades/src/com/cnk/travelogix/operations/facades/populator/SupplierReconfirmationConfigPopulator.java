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

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import com.cnk.travelogix.common.core.cart.data.SupplierData;
import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.model.ReconfirmationIntervalModel;
import com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.model.SupplierReconfirmationConfigModel;
import com.cnk.travelogix.operations.data.ReconfirmationIntervalData;
import com.cnk.travelogix.operations.data.SupplierReconfirmationConfigData;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * Populating SupplierReconfirmationConfig model into Data
 *
 * @author C5244543
 */
public class SupplierReconfirmationConfigPopulator
		implements Populator<SupplierReconfirmationConfigModel, SupplierReconfirmationConfigData>
{

	private Converter<SupplierModel, SupplierData> supplierConverter;
	private Converter<ReconfirmationIntervalModel, ReconfirmationIntervalData> reconfirmationIntervalConverter;

	@Override
	public void populate(final SupplierReconfirmationConfigModel source, final SupplierReconfirmationConfigData target)
			throws ConversionException
	{
		if (source != null)
		{
			target.setReconfirmationTo(source.getReconfirmationTo().getCode());
			target.setSupplier(supplierConverter.convert(source.getSupplier()));
			target.setSupplierReconfirmationInterval(
					reconfirmationIntervalConverter.convert(source.getSupplierReconfirmationInterval()));
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

	/**
	 * @return the reconfirmationIntervalConverter
	 */
	public Converter<ReconfirmationIntervalModel, ReconfirmationIntervalData> getReconfirmationIntervalConverter()
	{
		return reconfirmationIntervalConverter;
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

}
