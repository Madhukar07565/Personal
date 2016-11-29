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
//import de.hybris.platform.servicelayer.dto.converter.Converter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.util.Assert;
//
//import com.cnk.travelogix.common.core.cart.data.AirlineIATAData;
//import com.cnk.travelogix.common.core.cart.data.FlightTravellerData;
//import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailEntryInfoData;
//import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
//import com.cnk.travelogix.common.core.cart.data.SupplierData;
//import com.cnk.travelogix.common.core.model.AirlineIATAModel;
//import com.cnk.travelogix.common.core.model.FlightTravellerModel;
//import com.cnk.travelogix.common.core.model.OrderFlightDetailEntryInfoModel;
//import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;
//import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
//
//
///**
// * This populator is used for populate OrderFlightDetailInfoModel into OrderFlightDetailInfoData
// *
// * @author C5244543 (Shivraj)
// */
//public class OrderFlightDetailInfoPopulator implements Populator<OrderFlightDetailInfoModel, OrderFlightDetailInfoData>
//{
//	private Converter<AirlineIATAModel, AirlineIATAData> airlineIATAConverter;
//	private Converter<FlightTravellerModel, FlightTravellerData> flightTravellerConverter;
//	private Converter<OrderFlightDetailEntryInfoModel, OrderFlightDetailEntryInfoData> orderFlightDetailEntryInfoConverter;
//	private Converter<SupplierModel, SupplierData> supplierConverter;
//
//	@Override
//	public void populate(final OrderFlightDetailInfoModel source, final OrderFlightDetailInfoData target)
//			throws ConversionException
//	{
//		Assert.notNull(source, "Parameter source cannot be null.");
//		Assert.notNull(target, "Parameter target cannot be null.");
//		if (source.getAirlineIATA() != null)
//		{
//			target.setAirlineIATAData(getAirlineIATAConverter().convert(source.getAirlineIATA()));
//		}
//		target.setFlightNumber(source.getFlightNumber());
//		target.setCabinClass(source.getCabinClass());
//		target.setDepartureTime(source.getDepartureTime());
//		target.setArrivalTime(source.getArrivalTime());
//		target.setFromCity(source.getFromCity());
//		target.setToCity(source.getToCity());
//		target.setToTerminal(source.getToTerminal());
//		target.setFromTerminal(source.getFromTerminal());
//		target.setDuration(source.getDuration() != null ? source.getDuration().toString() : "");
//		target.setFlightTravelers(getFlightTravellers(source));
//		target.setChildEntries(getOrderFlightDetailEntryInfos(source));
//		if (source.getSupplier() != null)
//		{
//			target.setSupplier(supplierConverter.convert(source.getSupplier()));
//		}
//
//
//	}
//
//	public List<FlightTravellerData> getFlightTravellers(final OrderFlightDetailInfoModel source)
//	{
//		final List<FlightTravellerModel> flightTravellerModels = source.getFlightTraveller();
//		final List<FlightTravellerData> flightTravellerDatas = new ArrayList<>();
//		for (final FlightTravellerModel flightTravellerModel : flightTravellerModels)
//		{
//			flightTravellerDatas.add(getFlightTravellerConverter().convert(flightTravellerModel));
//		}
//		return flightTravellerDatas;
//	}
//
//	public List<OrderFlightDetailEntryInfoData> getOrderFlightDetailEntryInfos(final OrderFlightDetailInfoModel source)
//	{
//		final List<OrderFlightDetailEntryInfoData> flightDetailEntryInfoDatas = new ArrayList<>();
//
//		for (final OrderFlightDetailEntryInfoModel detailEntryInfoModel : source.getOrderFlightDetailEntryInfo())
//		{
//			flightDetailEntryInfoDatas.add(getOrderFlightDetailEntryInfoConverter().convert(detailEntryInfoModel));
//		}
//		return flightDetailEntryInfoDatas;
//	}
//
//	/**
//	 * @return the airlineIATAConverter
//	 */
//	public Converter<AirlineIATAModel, AirlineIATAData> getAirlineIATAConverter()
//	{
//		return airlineIATAConverter;
//	}
//
//	/**
//	 * @param airlineIATAConverter
//	 *           the airlineIATAConverter to set
//	 */
//	public void setAirlineIATAConverter(final Converter<AirlineIATAModel, AirlineIATAData> airlineIATAConverter)
//	{
//		this.airlineIATAConverter = airlineIATAConverter;
//	}
//
//
//	/**
//	 * @return the flightTravellerConverter
//	 */
//	public Converter<FlightTravellerModel, FlightTravellerData> getFlightTravellerConverter()
//	{
//		return flightTravellerConverter;
//	}
//
//
//	/**
//	 * @param flightTravellerConverter
//	 *           the flightTravellerConverter to set
//	 */
//	public void setFlightTravellerConverter(final Converter<FlightTravellerModel, FlightTravellerData> flightTravellerConverter)
//	{
//		this.flightTravellerConverter = flightTravellerConverter;
//	}
//
//	/**
//	 * @return the orderFlightDetailEntryInfoConverter
//	 */
//	public Converter<OrderFlightDetailEntryInfoModel, OrderFlightDetailEntryInfoData> getOrderFlightDetailEntryInfoConverter()
//	{
//		return orderFlightDetailEntryInfoConverter;
//	}
//
//	/**
//	 * @param orderFlightDetailEntryInfoConverter
//	 *           the orderFlightDetailEntryInfoConverter to set
//	 */
//	public void setOrderFlightDetailEntryInfoConverter(
//			final Converter<OrderFlightDetailEntryInfoModel, OrderFlightDetailEntryInfoData> orderFlightDetailEntryInfoConverter)
//	{
//		this.orderFlightDetailEntryInfoConverter = orderFlightDetailEntryInfoConverter;
//	}
//
//	/**
//	 * @return the supplierConverter
//	 */
//	public Converter<SupplierModel, SupplierData> getSupplierConverter()
//	{
//		return supplierConverter;
//	}
//
//	/**
//	 * @param supplierConverter
//	 *           the supplierConverter to set
//	 */
//	public void setSupplierConverter(final Converter<SupplierModel, SupplierData> supplierConverter)
//	{
//		this.supplierConverter = supplierConverter;
//	}
//
//}
