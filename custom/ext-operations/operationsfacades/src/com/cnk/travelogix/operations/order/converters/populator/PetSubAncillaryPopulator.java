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

import com.cnk.travelogix.common.core.cart.data.PetSubAncillaryData;
import com.cnk.travelogix.common.core.model.PetSubAncillaryModel;


/**
 * @author C5244544
 */
public class PetSubAncillaryPopulator implements Populator<PetSubAncillaryModel, PetSubAncillaryData>
{

	@Override
	public void populate(final PetSubAncillaryModel source, final PetSubAncillaryData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setAncillaryType(source.getAncillaryType());
		target.setNumberOfPets(source.getNumberOfPets());

	}

}
