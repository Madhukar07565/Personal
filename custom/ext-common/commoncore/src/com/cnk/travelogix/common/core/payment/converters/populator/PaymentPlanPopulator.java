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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.model.PaymentPlanEntryModel;
import com.cnk.travelogix.common.core.model.PaymentPlanModel;
import com.cnk.travelogix.common.core.payment.data.PaymentPlanData;
import com.cnk.travelogix.common.core.payment.data.PaymentPlanEntryData;


public class PaymentPlanPopulator implements Populator<PaymentPlanModel, PaymentPlanData>
{

	private PaymentPlanEntryPopulator paymentPlanEntryPopulator;



	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final PaymentPlanModel source, final PaymentPlanData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		target.setShared(source.getShared());
		target.setPaymentStatus(source.getPaymentStatus());
		target.setType(source.getType());
		final PriceInfoData price = new PriceInfoData();
		if (source.getPrice() != null)
		{
			price.setCostPrice(source.getPrice().getCostPrice().doubleValue());
		}
		target.setPrice(price);
		final List<PaymentPlanEntryData> paymentPlanEntryDataList = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(source.getPaymentPlanEntryList()))
		{
			for (final PaymentPlanEntryModel entry : source.getPaymentPlanEntryList())
			{
				final PaymentPlanEntryData entryTarget = new PaymentPlanEntryData();
				paymentPlanEntryPopulator.populate(entry, entryTarget);
				paymentPlanEntryDataList.add(entryTarget);
			}
		}
		target.setPaymentPlanEntryDataList(paymentPlanEntryDataList);
	}



	/**
	 * @return the paymentPlanEntryPopulator
	 */
	public PaymentPlanEntryPopulator getPaymentPlanEntryPopulator()
	{
		return paymentPlanEntryPopulator;
	}



	/**
	 * @param paymentPlanEntryPopulator
	 *           the paymentPlanEntryPopulator to set
	 */
	public void setPaymentPlanEntryPopulator(final PaymentPlanEntryPopulator paymentPlanEntryPopulator)
	{
		this.paymentPlanEntryPopulator = paymentPlanEntryPopulator;
	}

}