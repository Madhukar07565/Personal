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
import de.hybris.platform.servicelayer.dto.converter.Converter;

import com.cnk.travelogix.common.core.cart.data.CommonFlightInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
import com.cnk.travelogix.common.core.model.CommonFlightInfoModel;
import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;


/**
 * Order Flight Info Populator.
 *
 */
public class OrderFlightInfoPopulator implements Populator<OrderFlightDetailInfoModel, OrderFlightDetailInfoData>
{

	private Converter<CommonFlightInfoModel, CommonFlightInfoData> commonFlightInfoConverter;

	@Override
	public void populate(final OrderFlightDetailInfoModel source, final OrderFlightDetailInfoData target)
			throws ConversionException
	{
		target.setCommonFlightInfoData(this.commonFlightInfoConverter.convert(source.getCommonFlightInfo()));
		target.setGroupId(source.getGroupId());
		target.setSequence(source.getSequence());
		target.setJourneyType(source.getJourneyType().toString());
	}

	/**
	 * @return the commonFlightInfoConverter
	 */
	public Converter<CommonFlightInfoModel, CommonFlightInfoData> getCommonFlightInfoConverter()
	{
		return commonFlightInfoConverter;
	}

	/**
	 * @param commonFlightInfoConverter
	 *           the commonFlightInfoConverter to set
	 */
	public void setCommonFlightInfoConverter(final Converter<CommonFlightInfoModel, CommonFlightInfoData> commonFlightInfoConverter)
	{
		this.commonFlightInfoConverter = commonFlightInfoConverter;
	}

}
