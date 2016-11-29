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
package com.cnk.travelogix.common.facades.order.populators.flight;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import com.cnk.travelogix.common.core.cart.data.CommonFlightInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderTicketInfoData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.model.CommonFlightInfoModel;
import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;


/**
 *
 */
public class OrderTicketPopulator implements Populator<OrderTicketInfoModel, OrderTicketInfoData>
{

	private Converter<CommonFlightInfoModel, CommonFlightInfoData> commonFlightInfoConverter;
	private Converter<OrderFlightDetailInfoModel, OrderFlightDetailInfoData> orderFlightInfoConverter;

	@Override
	public void populate(final OrderTicketInfoModel source, final OrderTicketInfoData target) throws ConversionException
	{
		if (source.getCommonFlightInfo() != null)
		{
			target.setCommonFlightInfoData(this.commonFlightInfoConverter.convert(source.getCommonFlightInfo()));
		}
		if (source.getOrderFlightDetailInfo() != null)
		{
			target.setOrderFlightDetailInfoData(this.orderFlightInfoConverter.convert(source.getOrderFlightDetailInfo()));
		}
		target.setPassengerType(source.getPassengerType());
		target.setStatus(source.getOrderStatus());

		final PriceInfoData priceInfoData = new PriceInfoData();
		priceInfoData.setCostPrice(source.getPriceInfo() != null ? source.getPriceInfo().getCostPrice() != null ? source
				.getPriceInfo().getCostPrice().doubleValue() : Double.NaN : Double.NaN);

		target.setPriceInfo(priceInfoData);
		target.setTicketIndex(source.getTicketIndex());
	}

	/**
	 * @return the commonFlightInfoConverter
	 */
	public Converter<CommonFlightInfoModel, CommonFlightInfoData> getCommonFlightInfoConverter()
	{
		return commonFlightInfoConverter;
	}

	/**
	 * @param commonFlightInfoConverter
	 *           the commonFlightInfoConverter to set
	 */
	public void setCommonFlightInfoConverter(final Converter<CommonFlightInfoModel, CommonFlightInfoData> commonFlightInfoConverter)
	{
		this.commonFlightInfoConverter = commonFlightInfoConverter;
	}

	/**
	 * @return the orderFlightInfoConverter
	 */
	public Converter<OrderFlightDetailInfoModel, OrderFlightDetailInfoData> getOrderFlightInfoConverter()
	{
		return orderFlightInfoConverter;
	}

	/**
	 * @param orderFlightInfoConverter
	 *           the orderFlightInfoConverter to set
	 */
	public void setOrderFlightInfoConverter(
			final Converter<OrderFlightDetailInfoModel, OrderFlightDetailInfoData> orderFlightInfoConverter)
	{
		this.orderFlightInfoConverter = orderFlightInfoConverter;
	}

}
