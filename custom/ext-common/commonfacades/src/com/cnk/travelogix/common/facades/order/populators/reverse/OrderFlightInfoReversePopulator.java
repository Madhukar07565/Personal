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

import com.cnk.travelogix.common.core.cart.data.CommonFlightInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderTicketInfoData;
import com.cnk.travelogix.common.core.model.CommonFlightInfoModel;
import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;
import com.cnk.travelogix.supplier.masters.core.enums.JourneyType;


/**
 *
 */
public class OrderFlightInfoReversePopulator implements Populator<OrderFlightDetailInfoData, OrderFlightDetailInfoModel>
{
	private Converter<CommonFlightInfoData, CommonFlightInfoModel> CommonFlightInfoReverseConverter;

	private Converter<OrderTicketInfoData, OrderTicketInfoModel> orderTicketReverseConverter;

	@Override
	public void populate(final OrderFlightDetailInfoData source, final OrderFlightDetailInfoModel target)
			throws ConversionException
	{
		target.setCommonFlightInfo(this.CommonFlightInfoReverseConverter.convert(source.getCommonFlightInfoData()));
		target.setGroupId(source.getGroupId());
		target.setSequence(source.getSequence());
		target.setJourneyType(JourneyType.valueOf(source.getJourneyType()));
	}

	/**
	 * @return the commonFlightInfoReverseConverter
	 */
	public Converter<CommonFlightInfoData, CommonFlightInfoModel> getCommonFlightInfoReverseConverter()
	{
		return CommonFlightInfoReverseConverter;
	}

	/**
	 * @param commonFlightInfoReverseConverter
	 *           the commonFlightInfoReverseConverter to set
	 */
	public void setCommonFlightInfoReverseConverter(
			final Converter<CommonFlightInfoData, CommonFlightInfoModel> commonFlightInfoReverseConverter)
	{
		CommonFlightInfoReverseConverter = commonFlightInfoReverseConverter;
	}

	/**
	 * @return the orderTicketReverseConverter
	 */
	public Converter<OrderTicketInfoData, OrderTicketInfoModel> getOrderTicketReverseConverter()
	{
		return orderTicketReverseConverter;
	}

	/**
	 * @param orderTicketReverseConverter
	 *           the orderTicketReverseConverter to set
	 */
	public void setOrderTicketReverseConverter(
			final Converter<OrderTicketInfoData, OrderTicketInfoModel> orderTicketReverseConverter)
	{
		this.orderTicketReverseConverter = orderTicketReverseConverter;
	}

}
