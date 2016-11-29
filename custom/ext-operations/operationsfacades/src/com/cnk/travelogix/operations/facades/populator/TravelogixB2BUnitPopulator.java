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
package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.operations.data.TravelogixB2BUnitData;


/**
 * @author C5244543
 */
public class TravelogixB2BUnitPopulator implements Populator<TravelogixB2BUnitModel, TravelogixB2BUnitData>
{

	@Override
	public void populate(final TravelogixB2BUnitModel source, final TravelogixB2BUnitData target) throws ConversionException
	{
		if (source != null)
		{
			target.setUid(source.getUid());
			target.setName(source.getName());
			target.setCode(source.getUid());
			target.setClientCategory(source.getClientCategory().getCode());
			target.setClientSubCategory(source.getClientSubCategory().getCode());
			target.setClientGroupCompany(source.getClientGroupCompany().getCode());
			target.setTrvlClientType(source.getTrvlClientType().getCode());
		}
	}
}
