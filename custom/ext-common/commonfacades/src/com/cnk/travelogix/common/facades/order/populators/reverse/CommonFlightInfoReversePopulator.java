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
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.common.core.cart.data.CommonFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.CommonFlightInfoData;
import com.cnk.travelogix.common.core.model.AirlineIATAModel;
import com.cnk.travelogix.common.core.model.CommonFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.CommonFlightInfoModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;


/**
 *
 */
public class CommonFlightInfoReversePopulator implements Populator<CommonFlightInfoData, CommonFlightInfoModel>
{
	@Resource
	ModelService modelService;

	@Override
	public void populate(final CommonFlightInfoData source, final CommonFlightInfoModel target) throws ConversionException
	{
		final AirlineIATAModel airlineIATAModel = new AirlineIATAModel();
		airlineIATAModel.setAccountingCode(source.getAirlineIATAData() != null ? source.getAirlineIATAData().getAccountingCode()
				: StringUtils.EMPTY);
		airlineIATAModel.setAirlineName(source.getAirlineIATAData() != null ? source.getAirlineIATAData().getAirlineName()
				: StringUtils.EMPTY);
		airlineIATAModel.setAirlinePrefix(source.getAirlineIATAData() != null ? source.getAirlineIATAData().getAirlinePrefix()
				: StringUtils.EMPTY);

		target.setAirlineIATA(airlineIATAModel);
		target.setArrivalTime(source.getArrivalTime());
		target.setCabinClass(source.getCabinClass());
		target.setDepartureTime(source.getDepartureTime());
		target.setDuration(source.getDuration());
		target.setFlightNumber(source.getFlightNumber());
		target.setFromCity(source.getFromCity());
		target.setFromTerminal(source.getFromTerminal());
		target.setNumberOfStops(source.getNumberOfStops());
		final PriceInfoModel priceInfoModel = new PriceInfoModel();
		priceInfoModel.setCostPrice(source.getPriceInfo() != null ? Double.valueOf(source.getPriceInfo().getCostPrice()) : null);
		target.setPriceInfo(priceInfoModel);
		target.setToCity(source.getToCity());
		target.setToTerminal(source.getToTerminal());

		final List<CommonFlightDetailInfoData> CommonFlightDetailInfoDatas = source.getCommonFlightDetailList();
		final List<CommonFlightDetailInfoModel> commonFlightDetailInfoModels = new ArrayList<CommonFlightDetailInfoModel>();
		if (CollectionUtils.isNotEmpty(CommonFlightDetailInfoDatas))
		{
			for (final CommonFlightDetailInfoData CommonFlightDetailInfoData : CommonFlightDetailInfoDatas)
			{
				final CommonFlightDetailInfoModel commonFlightDetailInfoModel = new CommonFlightDetailInfoModel();
				commonFlightDetailInfoModel.setArrivalTime(CommonFlightDetailInfoData.getArrivalTime());
				commonFlightDetailInfoModel.setCabinClass(CommonFlightDetailInfoData.getCabinClass());
				commonFlightDetailInfoModel.setCommonFlightInfo(target);
				commonFlightDetailInfoModel.setDepartureTime(CommonFlightDetailInfoData.getDepartureTime());
				commonFlightDetailInfoModel.setDuration(CommonFlightDetailInfoData.getDuration());
				commonFlightDetailInfoModel.setFlightNumber(CommonFlightDetailInfoData.getFlightNumber());
				commonFlightDetailInfoModel.setFromCity(CommonFlightDetailInfoData.getFromCity());
				commonFlightDetailInfoModel.setFromTerminal(CommonFlightDetailInfoData.getFromTerminal());
				commonFlightDetailInfoModel.setToCity(CommonFlightDetailInfoData.getToCity());
				commonFlightDetailInfoModel.setToTerminal(CommonFlightDetailInfoData.getToTerminal());
				commonFlightDetailInfoModel.setCommonFlightInfo(target);
				commonFlightDetailInfoModels.add(commonFlightDetailInfoModel);
			}
			target.setCommonFlightDetailInfo(commonFlightDetailInfoModels);
		}

	}
}
