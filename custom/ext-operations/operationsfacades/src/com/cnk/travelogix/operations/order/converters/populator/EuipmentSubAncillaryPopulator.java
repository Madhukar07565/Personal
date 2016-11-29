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

import com.cnk.travelogix.common.core.cart.data.EquipmentSubAncillaryData;
import com.cnk.travelogix.common.core.model.EquipmentSubAncillaryModel;


/**
 * @author C5244544
 */
public class EuipmentSubAncillaryPopulator implements Populator<EquipmentSubAncillaryModel, EquipmentSubAncillaryData>
{

	@Override
	public void populate(final EquipmentSubAncillaryModel source, final EquipmentSubAncillaryData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setAncillaryType(source.getAncillaryType());
		target.setDuration(source.getDuration());
		target.setEndDate(source.getEndDate());
		target.setEquipmentName(source.getEquipmentName());
		target.setQuantity(source.getQuantity());
		target.setStartDate(source.getStartDate());
		target.setVehicleType(source.getVehicleType());

	}

}
