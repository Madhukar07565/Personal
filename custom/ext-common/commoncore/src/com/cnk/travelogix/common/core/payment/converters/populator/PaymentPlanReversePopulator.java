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
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.model.PaymentPlanEntryModel;
import com.cnk.travelogix.common.core.model.PaymentPlanModel;
import com.cnk.travelogix.common.core.payment.data.PaymentPlanData;
import com.cnk.travelogix.common.core.payment.data.PaymentPlanEntryData;


public class PaymentPlanReversePopulator implements Populator<PaymentPlanData, PaymentPlanModel>
{

	private PaymentPlanEntryReversePopulator paymentPlanEntryReversePopulator;

	private ModelService modelService;


	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final PaymentPlanData source, final PaymentPlanModel target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		target.setShared(source.getShared());

		final List<PaymentPlanEntryModel> paymentPlanEntryList = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(source.getPaymentPlanEntryDataList()))
		{
			for (final PaymentPlanEntryData entry : source.getPaymentPlanEntryDataList())
			{
				final PaymentPlanEntryModel entryTarget = getModelService().create(PaymentPlanEntryModel.class);
				paymentPlanEntryReversePopulator.populate(entry, entryTarget);
				paymentPlanEntryList.add(entryTarget);
			}
		}
		target.setPaymentPlanEntryList(paymentPlanEntryList);

	}



	/**
	 * @return the paymentPlanEntryReversePopulator
	 */
	public PaymentPlanEntryReversePopulator getPaymentPlanEntryReversePopulator()
	{
		return paymentPlanEntryReversePopulator;
	}



	/**
	 * @param paymentPlanEntryReversePopulator
	 *           the paymentPlanEntryReversePopulator to set
	 */
	public void setPaymentPlanEntryReversePopulator(final PaymentPlanEntryReversePopulator paymentPlanEntryReversePopulator)
	{
		this.paymentPlanEntryReversePopulator = paymentPlanEntryReversePopulator;
	}



	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}



	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

}