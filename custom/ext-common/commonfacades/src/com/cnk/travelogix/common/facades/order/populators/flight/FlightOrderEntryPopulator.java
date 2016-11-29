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

import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.converters.Populator;
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

import com.cnk.travelogix.common.core.cart.data.FlightGroupOrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.FlightOrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.FlightTravellerData;
import com.cnk.travelogix.common.core.cart.data.OrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderFlightGroupDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderTicketInfoData;
import com.cnk.travelogix.common.core.cart.data.TicketOrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.TravellerOrderEntryInfoData;
import com.cnk.travelogix.common.core.enums.OrderEntryTypeEnum;
import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.FlightTravellerModel;
import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;
import com.cnk.travelogix.common.core.model.PaymentPlanModel;
import com.cnk.travelogix.common.core.model.TravellerModel;
import com.cnk.travelogix.common.core.payment.data.PaymentPlanData;


/**
 *
 */
public class FlightOrderEntryPopulator implements Populator<AbstractOrderEntryModel, OrderEntryData>
{
	private static final Logger LOG = Logger.getLogger(FlightOrderEntryPopulator.class);

	@Resource(name = "orderFlightInfoConverter")
	private Converter<OrderFlightDetailInfoModel, OrderFlightDetailInfoData> orderFlightInfoConverter;

	@Resource(name = "orderTicketConverter")
	private Converter<OrderTicketInfoModel, OrderTicketInfoData> orderTicketConverter;

	@Resource(name = "orderFlightTravelerConverter")
	private Converter<FlightTravellerModel, FlightTravellerData> orderFlightTravelerConverter;

	@Resource(name = "paymentPlanConverter")
	private Converter<PaymentPlanModel, PaymentPlanData> paymentPlanConverter;

	@Override
	public void populate(final AbstractOrderEntryModel source, final OrderEntryData target) throws ConversionException
	{
		// Flight order entry populator only process the order entry whose product type is TICKET.
		if (ProductTypeEnum.TICKET == source.getProductTypeEnum())
		{
			// For the order entry model whose product type is TICKET, its product info model must be OrderTicketInfoModel.
			final OrderProductInfoModel productInfoModel = source.getOrderProductInfo();
			if (productInfoModel instanceof OrderTicketInfoModel)
			{
				final OrderTicketInfoModel ticketInfoModel = (OrderTicketInfoModel) productInfoModel;

				// Populate order entry (FLIGHT_TRAVELLER level).
				final TravellerOrderEntryInfoData travellerOrderEntryInfoData = new TravellerOrderEntryInfoData();
				final Set<TravellerModel> travels = source.getTraveller();
				if (CollectionUtils.isNotEmpty(travels))
				{
					travellerOrderEntryInfoData.setTravellerData(orderFlightTravelerConverter.convert((FlightTravellerModel) travels
							.iterator().next()));
				}

				final OrderEntryData travellerOrderEntryData = createOrderEntryData(OrderEntryTypeEnum.FLIGHT_TRAVELLER,
						travellerOrderEntryInfoData);


				// Populate order entry (FLIGHT_TICKET level).
				final TicketOrderEntryInfoData ticketOrderEntryInfoData = new TicketOrderEntryInfoData();
				final OrderTicketInfoData ticketInfoData = orderTicketConverter.convert(ticketInfoModel);
				ticketInfoData.setTicketIndex(source.getEntryNumber());
				ticketOrderEntryInfoData.setTicketDetailInfoData(ticketInfoData);
				final OrderEntryData ticketOrderEntryData = SerializationUtils.clone(target);
				populateOrderEntryData(ticketOrderEntryData, OrderEntryTypeEnum.FLIGHT_TICKET, ticketOrderEntryInfoData);
				ticketOrderEntryData.getEntries().add(travellerOrderEntryData);


				// Populate order entry (FLIGHT level).
				final OrderFlightDetailInfoModel flightDetailInfoModel = ticketInfoModel.getOrderFlightDetailInfo();
				if (flightDetailInfoModel != null)
				{
					final FlightOrderEntryInfoData flightOrderEntryInfoData = new FlightOrderEntryInfoData();
					flightOrderEntryInfoData.setFlightDetailInfoData(orderFlightInfoConverter.convert(flightDetailInfoModel));
					flightOrderEntryInfoData.setSequence(flightDetailInfoModel.getSequence());
					final OrderEntryData flightOrderEntryData = createOrderEntryData(OrderEntryTypeEnum.FLIGHT,
							flightOrderEntryInfoData);
					flightOrderEntryData.getEntries().add(ticketOrderEntryData);

					// Populate order entry (FLIGHT_GROUP level).
					final FlightGroupOrderEntryInfoData flightGroupOrderEntryInfoData = new FlightGroupOrderEntryInfoData();
					flightGroupOrderEntryInfoData.setFlightGroupDetailInfoData(new OrderFlightGroupDetailInfoData());
					flightGroupOrderEntryInfoData.setGroupId(flightDetailInfoModel.getGroupId());
					if (flightDetailInfoModel.getPaymentPlan() != null)
					{
						flightGroupOrderEntryInfoData
								.setPaymentPlan(paymentPlanConverter.convert(flightDetailInfoModel.getPaymentPlan()));
					}
					final OrderEntryData flightGroupOrderEntryData = createOrderEntryData(OrderEntryTypeEnum.FLIGHT_GROUP,
							flightGroupOrderEntryInfoData);
					flightGroupOrderEntryData.getEntries().add(flightOrderEntryData);


					// Now, target is flight group level, rather than ticket level.
					try
					{
						BeanUtils.copyProperties(target, flightGroupOrderEntryData);
					}
					catch (IllegalAccessException | InvocationTargetException e)
					{
						LOG.error("Error during copying properties between OrderEntryData. [FLIGHT]");
					}
				}
			}
			else
			{
				LOG.error(String.format(
						"Flight order entry's product info model must be [OrderTicketInfoModel], but the current one is [%s]",
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
