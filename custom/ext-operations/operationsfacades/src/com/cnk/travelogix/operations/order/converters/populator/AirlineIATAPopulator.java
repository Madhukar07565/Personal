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

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.AirlineIATAData;
import com.cnk.travelogix.common.core.model.AirlineIATAModel;


/**
 * This populator is used for populate AirlineIATAModel into AirlineIATAData
 *
 * @author C5244543 (Shivraj)
 */
public class AirlineIATAPopulator implements Populator<AirlineIATAModel, AirlineIATAData>
{

	@Override
	public void populate(final AirlineIATAModel source, final AirlineIATAData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setAccountingCode(source.getAccountingCode());
		target.setAirlineName(source.getAirlineName());
		target.setAirlinePrefix(source.getAirlinePrefix());
	}

}
