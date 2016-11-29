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
//import de.hybris.platform.commercefacades.user.data.CountryData;
//import de.hybris.platform.converters.Populator;
//import de.hybris.platform.core.model.c2l.CountryModel;
//import de.hybris.platform.servicelayer.dto.converter.ConversionException;
//
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.util.Assert;
//
////import com.cnk.travelogix.common.core.cart.data.SectorData;
//import com.cnk.travelogix.common.facades.product.data.flight.AirportData;
//import com.cnk.travelogix.masterdata.core.iata.model.AirportModel;
//import com.cnk.travelogix.product.common.core.model.SectorModel;
//
//
///**
// * This populator is used for populate Sector model data into Sector DTO
// *
// * @author C5244543 (Shivraj)
// */
//public class SectorPopulator implements Populator<SectorModel, SectorData>
//{
//	private Converter<AirportModel, AirportData> airportConverter;
//	private Converter<CountryModel, CountryData> countryConverter;
//
//	@Override
//	public void populate(final SectorModel source, final SectorData target) throws ConversionException
//	{
//		Assert.notNull(source, "Parameter source cannot be null.");
//		Assert.notNull(target, "Parameter target cannot be null.");
//		if(source.getFromCountry()!=null)
//		{
//		target.setFromCountry(countryConverter.convert(source.getFromCountry()));
//		}
//		if(source.getFromCity()!=null)
//		{
//		target.setFromCity(airportConverter.convert(source.getFromCity()));
//		}
//		if(source.getToCountry()!=null)
//		{
//		target.setToCountry(countryConverter.convert(source.getToCountry()));
//		}
//		if(source.getToCity()!=null)
//		{
//		target.setToCity(airportConverter.convert(source.getToCity()));
//		} 
//
//	}
//
//	/**
//	 * @return the airportConverter
//	 */
//	public Converter<AirportModel, AirportData> getAirportConverter()
//	{
//		return airportConverter;
//	}
//
//	/**
//	 * @param airportConverter
//	 *           the airportConverter to set
//	 */
//	public void setAirportConverter(final Converter<AirportModel, AirportData> airportConverter)
//	{
//		this.airportConverter = airportConverter;
//	}
//
//	/**
//	 * @return the countryConverter
//	 */
//	public Converter<CountryModel, CountryData> getCountryConverter()
//	{
//		return countryConverter;
//	}
//
//	/**
//	 * @param countryConverter
//	 *           the countryConverter to set
//	 */
//	public void setCountryConverter(final Converter<CountryModel, CountryData> countryConverter)
//	{
//		this.countryConverter = countryConverter;
//	}
//
//}
