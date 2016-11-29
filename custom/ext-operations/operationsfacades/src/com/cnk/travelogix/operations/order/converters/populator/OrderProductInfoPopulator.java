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
package com.cnk.travelogix.operations.order.converters.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.OrderProductInfoData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.cart.data.SupplierData;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * @author C5244544
 */
public class OrderProductInfoPopulator implements Populator<OrderProductInfoModel, OrderProductInfoData>
{
	private static final Logger LOG = Logger.getLogger(OrderProductInfoPopulator.class);
	Converter<PriceInfoModel, PriceInfoData> priceInfoConverter;

	@Resource(name = "supplierConverter")
	Converter<SupplierModel, SupplierData> supplierConverter;


	@Override
	public void populate(final OrderProductInfoModel source, final OrderProductInfoData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		if (source.getPriceInfo() != null)
		{
			target.setPriceInfo(priceInfoConverter.convert(source.getPriceInfo()));
		}
		if (null != source.getEnablerSupplier())
		{
			//target.setSupplier(supplierConverter.convert(source.getSupplier()));
			target.setSupplier(supplierConverter.convert(source.getEnablerSupplier()));
		}
	}

	/**
	 * @return the priceInfoConverter
	 */
	public Converter<PriceInfoModel, PriceInfoData> getPriceInfoConverter()
	{
		return priceInfoConverter;
	}

	/**
	 * @param priceInfoConverter
	 *           the priceInfoConverter to set
	 */
	public void setPriceInfoConverter(final Converter<PriceInfoModel, PriceInfoData> priceInfoConverter)
	{
		this.priceInfoConverter = priceInfoConverter;
	}

}
