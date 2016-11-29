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

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.core.cart.data.AirlineIATAData;
import com.cnk.travelogix.common.core.cart.data.CommonFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.CommonFlightInfoData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.model.CommonFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.CommonFlightInfoModel;


/**
 *
 */
public class CommonFlightInfoPopulator implements Populator<CommonFlightInfoModel, CommonFlightInfoData>
{

	@Override
	public void populate(final CommonFlightInfoModel source, final CommonFlightInfoData target) throws ConversionException
	{
		final AirlineIATAData airlineIATAData = new AirlineIATAData();
		airlineIATAData.setAccountingCode(source.getAirlineIATA() != null ? source.getAirlineIATA().getAccountingCode() : null);
		airlineIATAData.setAirlineName(source.getAirlineIATA() != null ? source.getAirlineIATA().getAirlineName() : null);
		airlineIATAData.setAirlinePrefix(source.getAirlineIATA() != null ? source.getAirlineIATA().getAirlinePrefix() : null);
		target.setAirlineIATAData(airlineIATAData);
		target.setArrivalTime(source.getArrivalTime());
		target.setCabinClass(source.getCabinClass());

		target.setDepartureTime(source.getDepartureTime());
		target.setDuration(source.getDuration());
		target.setFlightNumber(source.getFlightNumber());
		target.setFromCity(source.getFromCity());
		target.setFromAirport(source.getFromAirport());
		target.setFromTerminal(source.getFromTerminal());
		target.setNumberOfStops(source.getNumberOfStops());

		final PriceInfoData priceInfoData = new PriceInfoData();
		priceInfoData.setCostPrice(source.getPriceInfo() != null ? source.getPriceInfo().getCostPrice() != null ? source
				.getPriceInfo().getCostPrice().doubleValue() : Double.NaN : Double.NaN);
		//		final CurrencyData currencyData = new CurrencyData();
		//		currencyData.setIsocode(source.getPriceInfo().getCurrency().getIsocode());
		//		currencyData.setName(source.getPriceInfo().getCurrency().getName());
		//		currencyData.setActive(source.getPriceInfo().getCurrency().getActive().booleanValue());
		//		currencyData.setSymbol(source.getPriceInfo().getCurrency().getSymbol());
		//		priceInfoData.setCurrency(currencyData);

		target.setPriceInfo(priceInfoData);
		target.setToCity(source.getToCity());
		target.setToAirport(source.getToAirport());
		target.setToTerminal(source.getToTerminal());


		final List<CommonFlightDetailInfoData> commonFlightDetailList = new ArrayList<CommonFlightDetailInfoData>();
		for (final CommonFlightDetailInfoModel commonFlightDetailInfoModel : source.getCommonFlightDetailInfo())
		{
			final CommonFlightDetailInfoData commonFlightDetailInfoData = new CommonFlightDetailInfoData();
			commonFlightDetailInfoData.setArrivalTime(commonFlightDetailInfoModel.getArrivalTime());
			commonFlightDetailInfoData.setCabinClass(commonFlightDetailInfoModel.getCabinClass());
			commonFlightDetailInfoData.setDepartureTime(commonFlightDetailInfoModel.getDepartureTime());
			commonFlightDetailInfoData.setDuration(commonFlightDetailInfoModel.getDuration());
			commonFlightDetailInfoData.setFlightNumber(commonFlightDetailInfoModel.getFlightNumber());
			commonFlightDetailInfoData.setFromCity(commonFlightDetailInfoModel.getFromCity());
			commonFlightDetailInfoData.setFromAirport(commonFlightDetailInfoModel.getFromAirport());
			commonFlightDetailInfoData.setFromTerminal(commonFlightDetailInfoModel.getFromTerminal());
			commonFlightDetailInfoData.setToCity(commonFlightDetailInfoModel.getToCity());
			commonFlightDetailInfoData.setToAirport(commonFlightDetailInfoModel.getToAirport());
			commonFlightDetailInfoData.setToTerminal(commonFlightDetailInfoModel.getToTerminal());
			commonFlightDetailList.add(commonFlightDetailInfoData);
		}

		target.setCommonFlightDetailList(commonFlightDetailList);
	}

}
