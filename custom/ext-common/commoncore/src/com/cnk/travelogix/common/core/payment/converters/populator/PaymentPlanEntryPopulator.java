/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Aug 4, 2016 2:03:33 PM
 * ----------------------------------------------------------------
 *
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
package com.cnk.travelogix.common.core.payment.converters.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.model.PaymentPlanEntryModel;
import com.cnk.travelogix.common.core.payment.data.PaymentPlanEntryData;


public class PaymentPlanEntryPopulator implements Populator<PaymentPlanEntryModel, PaymentPlanEntryData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final PaymentPlanEntryModel source, final PaymentPlanEntryData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setAmount(source.getAmount());
		target.setDueDate(source.getDueDate());
		target.setPayAmount(source.getPayAmount());
		target.setPayDate(source.getPayDate());
	}

}