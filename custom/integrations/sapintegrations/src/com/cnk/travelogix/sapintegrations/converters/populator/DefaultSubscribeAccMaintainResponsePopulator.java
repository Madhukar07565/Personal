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

import java.util.List;

import com.cnk.travelogix.custom.subscribe.account.Failure;
import com.cnk.travelogix.custom.subscribe.account.SubscriberAccountOperationResponse;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.FailureCause;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ResponseStatus;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountOperationResponseData;


/**
 *
 */
public class DefaultSubscribeAccMaintainResponsePopulator extends AbstractErrorResponsePopulator
		implements Populator<SubscriberAccountOperationResponse, SubscriberAccountOperationResponseData>
{

	@Override
	public void populate(final SubscriberAccountOperationResponse source, final SubscriberAccountOperationResponseData target)
			throws ConversionException
	{
		target.setStatus(ResponseStatus.fromValue(source.getStatus().value()));

		if (source.getError() != null)
		{
			final com.cnk.travelogix.sapintegrations.subscribe.account.data.Failure failure = new com.cnk.travelogix.sapintegrations.subscribe.account.data.Failure();
			final Failure f = source.getError();
			final List<com.cnk.travelogix.custom.subscribe.account.FailureCause> causedBy = f.getCausedBy();

			for (final com.cnk.travelogix.custom.subscribe.account.FailureCause cause : causedBy)
			{
				final FailureCause fc = new FailureCause();
				fc.setCode(cause.getCode());
				fc.setMessage(cause.getMessage());
				fc.setModule(cause.getModule());
				failure.getCausedBy().add(fc);
				target.getErrors().add(populateError(String.valueOf(cause.getCode()), cause.getMessage()));
			}
			target.setError(failure);
		}
		target.setMessage(source.getMessage());
		target.setSubscriberAccountId(source.getSubscriberAccountId());
		target.setSubscriberAccountReference(source.getSubscriberAccountReference());
	}

}
