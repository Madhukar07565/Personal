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
package com.cnk.travelogix.common.facades.order.populators.hotel;

import de.hybris.platform.basecommerce.enums.OrderEntryStatus;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.cart.data.AccommodationTravellerData;
import com.cnk.travelogix.common.core.cart.data.HotelOrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.InsuranceInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.RoomOrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.TravellerOrderEntryInfoData;
import com.cnk.travelogix.common.core.enums.OrderEntryTypeEnum;
import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.PaymentPlanModel;
import com.cnk.travelogix.common.core.model.TravelInsuranceModel;
import com.cnk.travelogix.common.core.model.TravellerModel;
import com.cnk.travelogix.common.core.payment.data.PaymentPlanData;


/**
 *
 */
public class HotelOrderEntryPopulator implements Populator<AbstractOrderEntryModel, OrderEntryData>
{
	private static final Logger LOG = Logger.getLogger(HotelOrderEntryPopulator.class);

	@Resource(name = "orderHotelConverter")
	private Converter<OrderHotelDetailInfoModel, OrderHotelDetailInfoData> orderHotelConverter;

	@Resource(name = "travelInsuranceConverter")
	private Converter<TravelInsuranceModel, InsuranceInfoData> travelInsuranceConverter;

	@Resource(name = "roomConverter")
	private Converter<OrderRoomDetailInfoModel, OrderRoomDetailInfoData> roomConverter;

	@Resource(name = "hotelTravelerConverter")
	private Converter<TravellerModel, AccommodationTravellerData> hotelTravelerConverter;

	@Resource(name = "paymentPlanConverter")
	private Converter<PaymentPlanModel, PaymentPlanData> paymentPlanConverter;

	@Override
	public void populate(final AbstractOrderEntryModel source, final OrderEntryData target) throws ConversionException
	{
		// Hotel order entry populator only process the order entry whose product type is ROOM.
		if (ProductTypeEnum.ROOM == source.getProductTypeEnum())
		{
			// For the order entry model whose product type is ROOM, its product info model must be OrderRoomDetailInfoModel.
			final OrderProductInfoModel productInfoModel = source.getOrderProductInfo();
			if (productInfoModel instanceof OrderRoomDetailInfoModel)
			{
				final OrderRoomDetailInfoModel roomDetailInfoModel = (OrderRoomDetailInfoModel) productInfoModel;

				// Populate order entry (HOTEL_TRAVELLER level).
				final TravellerOrderEntryInfoData travellerOrderEntryInfoData = new TravellerOrderEntryInfoData();
				final Set<TravellerModel> travels = source.getTraveller();
				if (CollectionUtils.isNotEmpty(travels))
				{
					travellerOrderEntryInfoData.setTravellerData(hotelTravelerConverter.convert(travels.iterator().next()));
				}
				final OrderEntryData travellerOrderEntryData = createOrderEntryData(OrderEntryTypeEnum.HOTEL_TRAVELLER,
						travellerOrderEntryInfoData);


				// Populate order entry (HOTEL_ROOM level).
				final RoomOrderEntryInfoData roomOrderEntryInfoData = new RoomOrderEntryInfoData();

				OrderRoomDetailInfoData roomData = roomConverter.convert(roomDetailInfoModel);
				if(OrderEntryStatus.DEAD.equals(source.getQuantityStatus())){
					roomData.setStatus(OrderStatus.NOT_AVAILABLE);
				}
				
				roomOrderEntryInfoData.setRoomDetailInfoData(roomData);
				
				if (roomDetailInfoModel.getPaymentPlan() != null)
				{
					roomOrderEntryInfoData.setPaymentPlan(paymentPlanConverter.convert(roomDetailInfoModel.getPaymentPlan()));
				}

				final OrderEntryData roomOrderEntryData = SerializationUtils.clone(target);
				populateOrderEntryData(roomOrderEntryData, OrderEntryTypeEnum.HOTEL_ROOM, roomOrderEntryInfoData);
				roomOrderEntryData.getEntries().add(travellerOrderEntryData);


				// Populate order entry (HOTEL level).
				final HotelOrderEntryInfoData hotelOrderEntryInfoData = new HotelOrderEntryInfoData();
				hotelOrderEntryInfoData.setGroupId(roomDetailInfoModel.getGroupId());
				final OrderHotelDetailInfoModel hotelDetailInfoModel = roomDetailInfoModel.getOrderHotelDetailInfo();
				if (hotelDetailInfoModel != null)
				{
					final OrderHotelDetailInfoData hotelDetailInfoData = orderHotelConverter.convert(hotelDetailInfoModel);
					hotelDetailInfoData.setGroupId(roomDetailInfoModel.getGroupId());
					hotelDetailInfoData.setStatus(hotelDetailInfoModel.getOrderStatus());
					hotelOrderEntryInfoData.setHotelDetailInfoData(hotelDetailInfoData);

					final TravelInsuranceModel travelInsuranceModel = source.getTravelInsurance();
					if (travelInsuranceModel != null)
					{
						hotelDetailInfoData.setInsuranceInfo(travelInsuranceConverter.convert(travelInsuranceModel));
					}
				}
				final OrderEntryData hotelOrderEntryData = createOrderEntryData(OrderEntryTypeEnum.HOTEL, hotelOrderEntryInfoData);
				hotelOrderEntryData.getEntries().add(roomOrderEntryData);

				// Now, target is hotel level, rather than room level.
				try
				{
					BeanUtils.copyProperties(target, hotelOrderEntryData);
				}
				catch (IllegalAccessException | InvocationTargetException e)
				{
					LOG.error("Error during copying properties between OrderEntryData. [HOTEL]");
				}

			}
			else
			{
				LOG.error(String.format(
						"Hotel order entry's product info model must be [OrderRoomDetailInfoModel], but the current one is [%s]",
						productInfoModel == null ? "null" : productInfoModel.getClass().getName()));
			}
		}
	}

	private void populateOrderEntryData(final OrderEntryData orderEntryData, final OrderEntryTypeEnum orderEntryType,
			final OrderEntryInfoData orderEntryInfoData)
	{
		if (orderEntryData != null)
		{
			orderEntryData.setOrderEntryType(orderEntryType);
			orderEntryData.setOrderEntryInfoData(orderEntryInfoData);
			orderEntryData.setEntries(new CopyOnWriteArrayList<OrderEntryData>());
		}
		else
		{
			LOG.error("The given order entry data is null.");
		}
	}

	private OrderEntryData createOrderEntryData(final OrderEntryTypeEnum orderEntryType,
			final OrderEntryInfoData orderEntryInfoData)
	{
		final OrderEntryData orderEntryData = new OrderEntryData();
		populateOrderEntryData(orderEntryData, orderEntryType, orderEntryInfoData);
		return orderEntryData;
	}
}
