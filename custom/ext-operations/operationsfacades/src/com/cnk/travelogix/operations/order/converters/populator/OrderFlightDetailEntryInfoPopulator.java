///*
// * [y] hybris Platform
// *
// * Copyright (c) 2000-2016 SAP SE
// * All rights reserved.
// *
// * This software is the confidential and proprietary information of SAP
// * Hybris ("Confidential Information"). You shall not disclose such
// * Confidential Information and shall use it only in accordance with the
// * terms of the license agreement you entered into with SAP Hybris.
// */
//package com.cnk.travelogix.operations.order.converters.populator;
//
//import de.hybris.platform.converters.Populator;
//import de.hybris.platform.servicelayer.dto.converter.ConversionException;
//
//import org.springframework.util.Assert;
//
//import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailEntryInfoData;
//import com.cnk.travelogix.common.core.model.OrderFlightDetailEntryInfoModel;
//
//
///**
// * This populator is used for populate OrderFlightDetailEntryInfoModel into OrderFlightDetailEntryInfoData
// *
// * @author C5244543 (Shivraj)
// */
//public class OrderFlightDetailEntryInfoPopulator
//		implements Populator<OrderFlightDetailEntryInfoModel, OrderFlightDetailEntryInfoData>
//{
//
//	@Override
//	public void populate(final OrderFlightDetailEntryInfoModel source, final OrderFlightDetailEntryInfoData target)
//			throws ConversionException
//	{
//		Assert.notNull(source, "Parameter source cannot be null.");
//		Assert.notNull(target, "Parameter target cannot be null.");
//		target.setFlightNumber(source.getFlightNumber());
//		target.setCabinClass(source.getCabinClass());
//		target.setDepartureTime(source.getDepartureTime());
//		target.setArrivalTime(source.getArrivalTime());
//		target.setFromCity(source.getFromCity());
//		target.setToCity(source.getToCity());
//		target.setToTerminal(source.getToTerminal());
//		target.setFromTerminal(source.getFromTerminal());
//		target.setDuration(source.getDuration() != null ? source.getDuration().toString() : "");
//
//	}
//
//}
