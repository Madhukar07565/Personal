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
package com.cnk.travelogix.common.facades.order.populators.reverse;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import com.cnk.travelogix.common.core.cart.data.CommonFlightInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderTicketInfoData;
import com.cnk.travelogix.common.core.model.CommonFlightInfoModel;
import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;


/**
 * Order Ticket Reverse Populator.
 */
public class OrderTicketReversePopulator implements Populator<OrderTicketInfoData, OrderTicketInfoModel>
{
	@Resource
	private ModelService modelService;


	private Converter<CommonFlightInfoData, CommonFlightInfoModel> commonFlightInfoReverseConverter;

	private Converter<OrderFlightDetailInfoData, OrderFlightDetailInfoModel> orderFlightInfoReverseConverter;

	@Override
	public void populate(final OrderTicketInfoData source, final OrderTicketInfoModel target) throws ConversionException
	{
		target.setCommonFlightInfo(this.commonFlightInfoReverseConverter.convert(source.getCommonFlightInfoData()));
		target.setOrderFlightDetailInfo(this.orderFlightInfoReverseConverter.convert(source.getOrderFlightDetailInfoData()));
		target.setPassengerType(source.getPassengerType());
		final PriceInfoModel priceInfoModel = new PriceInfoModel();
		priceInfoModel.setCostPrice(source.getPriceInfo() != null ? Double.valueOf(source.getPriceInfo().getCostPrice()) : null);
		target.setPriceInfo(priceInfoModel);
		target.setTicketIndex(source.getTicketIndex() == null ? null : source.getTicketIndex());
	}

	/**
	 * @return the orderFlightInfoReverseConverter
	 */
	public Converter<OrderFlightDetailInfoData, OrderFlightDetailInfoModel> getOrderFlightInfoReverseConverter()
	{
		return orderFlightInfoReverseConverter;
	}

	/**
	 * @param orderFlightInfoReverseConverter
	 *           the orderFlightInfoReverseConverter to set
	 */
	public void setOrderFlightInfoReverseConverter(
			final Converter<OrderFlightDetailInfoData, OrderFlightDetailInfoModel> orderFlightInfoReverseConverter)
	{
		this.orderFlightInfoReverseConverter = orderFlightInfoReverseConverter;
	}

	/**
	 * @return the commonFlightInfoReverseConverter
	 */
	public Converter<CommonFlightInfoData, CommonFlightInfoModel> getCommonFlightInfoReverseConverter()
	{
		return commonFlightInfoReverseConverter;
	}

	/**
	 * @param commonFlightInfoReverseConverter
	 *           the commonFlightInfoReverseConverter to set
	 */
	public void setCommonFlightInfoReverseConverter(
			final Converter<CommonFlightInfoData, CommonFlightInfoModel> commonFlightInfoReverseConverter)
	{
		this.commonFlightInfoReverseConverter = commonFlightInfoReverseConverter;
	}

}
