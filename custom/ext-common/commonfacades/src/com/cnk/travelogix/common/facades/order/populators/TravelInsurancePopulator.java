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
package com.cnk.travelogix.common.facades.order.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.cnk.travelogix.common.core.cart.data.InsuranceInfoData;
import com.cnk.travelogix.common.core.model.TravelInsuranceModel;


/**
 *
 */
public class TravelInsurancePopulator implements Populator<TravelInsuranceModel, InsuranceInfoData>
{
	@Override
	public void populate(TravelInsuranceModel travelInsuranceModel, InsuranceInfoData travelInsuranceData) throws ConversionException
	{
		travelInsuranceData.setCode(travelInsuranceModel.getCode());
		travelInsuranceData.setCostPrice(travelInsuranceModel.getCostPrice());
		travelInsuranceData.setTotalPrice(travelInsuranceModel.getTotalPrice());
	}

}
