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

import com.cnk.travelogix.client.config.enums.CutOffDaysAndHours;
import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.model.ReconfirmationIntervalModel;
import com.cnk.travelogix.masterdata.core.enums.ReconfirmationCutOffType;
import com.cnk.travelogix.operations.data.ReconfirmationIntervalData;


/**
 *
 */
public class ReconfirmationIntervalReversePopulator implements Populator<ReconfirmationIntervalData, ReconfirmationIntervalModel>
{

	@Override
	public void populate(final ReconfirmationIntervalData source, final ReconfirmationIntervalModel target)
			throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setReconfirmationCutOff(ReconfirmationCutOffType.valueOf(source.getReconfirmationCutOff()));
		target.setCutoff(source.getCutoff());
		target.setCutOffDaysOrHours(CutOffDaysAndHours.valueOf(source.getCutOffDaysOrHours()));

	}

}