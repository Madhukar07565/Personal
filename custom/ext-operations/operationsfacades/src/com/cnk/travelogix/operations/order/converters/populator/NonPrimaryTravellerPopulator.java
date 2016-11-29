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

import com.cnk.travelogix.common.core.cart.data.AccommodationNonPrimaryTravellerData;
import com.cnk.travelogix.common.core.model.NonPrimaryTravellerModel;


/**
 * @author C5244544
 */
public class NonPrimaryTravellerPopulator implements Populator<NonPrimaryTravellerModel, AccommodationNonPrimaryTravellerData>
{

	@Override
	public void populate(final NonPrimaryTravellerModel source, final AccommodationNonPrimaryTravellerData target)
			throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setDateOfBirth(source.getDateOfBirth());
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setMiddleName(source.getMiddleName());
		target.setTitle(source.getTitle());
	}

}
