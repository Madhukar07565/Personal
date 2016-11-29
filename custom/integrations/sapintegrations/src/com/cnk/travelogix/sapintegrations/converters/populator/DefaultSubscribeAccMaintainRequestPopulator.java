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
package com.cnk.travelogix.sapintegrations.converters.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.BeanUtils;

import com.cnk.travelogix.custom.subscribe.account.SubscriberAccount;
import com.cnk.travelogix.custom.subscribe.account.SubscriberAccountMaintainRequest;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountMaintainData;


/**
 *
 */
public class DefaultSubscribeAccMaintainRequestPopulator
		implements Populator<SubscriberAccountMaintainData, SubscriberAccountMaintainRequest>
{

	@Override
	public void populate(final SubscriberAccountMaintainData source, final SubscriberAccountMaintainRequest target)
			throws ConversionException
	{
		final SubscriberAccount subscriberAcc = new SubscriberAccount();
		BeanUtils.copyProperties(source.getSubscriberAccount(), subscriberAcc);
		target.setSubscriberAccount(subscriberAcc);
	}

}
