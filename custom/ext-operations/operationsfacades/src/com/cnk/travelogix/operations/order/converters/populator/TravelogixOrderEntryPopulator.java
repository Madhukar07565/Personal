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

import de.hybris.platform.commercefacades.order.converters.populator.OrderEntryPopulator;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderProductInfoData;
import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.TravellerModel;


/**
 * This populator is used for populate new added field of Order Entry
 *
 * @author C5244543 (Shivraj)
 */
public class TravelogixOrderEntryPopulator extends OrderEntryPopulator
{
	private Converter<OrderFlightDetailInfoModel, OrderFlightDetailInfoData> orderFlightDetailInfoConverter;

	@Resource(name = "orderProductInfoPopulator")
	private OrderProductInfoPopulator orderProductInfoPopulator;

	@Resource(name = "travellerConverter")
	Converter<TravellerModel, TravellerData> travellerConverter;

	@Override
	public void populate(final AbstractOrderEntryModel source, final OrderEntryData target)
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		super.populate(source, target);

		addOrderFlightDetailInfo(source, target);

		addOrderProductInfoDetails(source, target);
		addTravellerDetails(source, target);

	}



	public void addOrderFlightDetailInfo(final AbstractOrderEntryModel source, final OrderEntryData target)
	{
		if (source.getOrderProductInfo() != null)
		{
			//		target.setOrderProductInfo(
			//				getOrderFlightDetailInfoConverter().convert((OrderFlightDetailInfoModel) source.getOrderProductInfo()));
		}
	}

	public void addOrderProductInfoDetails(final AbstractOrderEntryModel source, final OrderEntryData target)
	{
		final OrderProductInfoData orderProductInfoData = new OrderProductInfoData();
		if (null != source.getOrderProductInfo())
		{
			orderProductInfoPopulator.populate(source.getOrderProductInfo(), orderProductInfoData);
			target.setOrderProductInfo(orderProductInfoData);
		}
	}

	public void addTravellerDetails(final AbstractOrderEntryModel source, final OrderEntryData target)
	{
		final List<TravellerData> travellerDatas = new ArrayList<>();
		if (null != source)
		{
			for (final TravellerModel TravellerModel : source.getTraveller())
			{
				travellerDatas.add(travellerConverter.convert(TravellerModel));
			}
		}
		target.setTravellerList(travellerDatas);
	}

	/**
	 * @return the orderFlightDetailInfoConverter
	 */
	public Converter<OrderFlightDetailInfoModel, OrderFlightDetailInfoData> getOrderFlightDetailInfoConverter()
	{
		return orderFlightDetailInfoConverter;
	}

	/**
	 * @param orderFlightDetailInfoConverter
	 *           the orderFlightDetailInfoConverter to set
	 */
	public void setOrderFlightDetailInfoConverter(
			final Converter<OrderFlightDetailInfoModel, OrderFlightDetailInfoData> orderFlightDetailInfoConverter)
	{
		this.orderFlightDetailInfoConverter = orderFlightDetailInfoConverter;
	}

}
