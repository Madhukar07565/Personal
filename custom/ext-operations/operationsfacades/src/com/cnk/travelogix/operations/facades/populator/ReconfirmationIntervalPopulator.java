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

import org.springframework.util.Assert;

import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.model.ReconfirmationIntervalModel;
import com.cnk.travelogix.operations.data.ReconfirmationIntervalData;


/**
 * Populating ReconfirmationInternal model into data.
 *
 * @author C5244543
 */
public class ReconfirmationIntervalPopulator implements Populator<ReconfirmationIntervalModel, ReconfirmationIntervalData>
{

	@Override
	public void populate(final ReconfirmationIntervalModel source, final ReconfirmationIntervalData target)
			throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setReconfirmationCutOff(source.getReconfirmationCutOff().getCode());
		target.setCutoff(source.getCutoff());
		target.setCutOffDaysOrHours(source.getCutOffDaysOrHours().getCode());
	}

}
