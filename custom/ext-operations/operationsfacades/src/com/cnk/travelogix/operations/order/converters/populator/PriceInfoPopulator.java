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

import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.model.PriceInfoModel;


/**
 * @author C5244544
 */
public class PriceInfoPopulator implements Populator<PriceInfoModel, PriceInfoData>
{
	private Converter<CurrencyModel, CurrencyData> currencyConverter;

	@Override
	public void populate(final PriceInfoModel source, final PriceInfoData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		
		if(source.getCostPrice()!=null)
		{
		target.setCostPrice(source.getCostPrice().doubleValue());
		}
		if(source.getCurrency()!=null)
		{
		target.setCurrency(currencyConverter.convert(source.getCurrency()));
		} 

	}

	/**
	 * @return the currencyConverter
	 */
	public Converter<CurrencyModel, CurrencyData> getCurrencyConverter()
	{
		return currencyConverter;
	}

	/**
	 * @param currencyConverter
	 *           the currencyConverter to set
	 */
	public void setCurrencyConverter(final Converter<CurrencyModel, CurrencyData> currencyConverter)
	{
		this.currencyConverter = currencyConverter;
	}



}
