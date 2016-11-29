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

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;

import com.cnk.travelogix.commons.error.Error;
import com.cnk.travelogix.custom.subscribe.account.ExternalAccountOperationResponse;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccountOperationResponseData;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccountReference;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.Failure;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.FailureCause;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ResponseStatus;


/**
 *
 */
public class DefaultExternalAccMaintainResponsePopulator extends AbstractErrorResponsePopulator
		implements Populator<ExternalAccountOperationResponse, ExternalAccountOperationResponseData>
{

	@Override
	public void populate(final ExternalAccountOperationResponse source, final ExternalAccountOperationResponseData target)
			throws ConversionException
	{
		final String respStatus = source.getStatus() == null ? "" : source.getStatus().value();
		if (StringUtils.isNotBlank(respStatus))
		{
			target.setStatus(ResponseStatus.valueOf(respStatus.toUpperCase()));
		}
		final ExternalAccountReference extAccRef = new ExternalAccountReference();

		if (ResponseStatus.ERROR.equals(target.getStatus()) && source.getError() != null)
		{
			if (source.getStatus() != null && StringUtils.isNotBlank(source.getStatus().value()))
			{
				target.setStatus(ResponseStatus.valueOf(source.getStatus().value().toUpperCase()));
			}
			final Failure failure = new Failure();
			final com.cnk.travelogix.custom.subscribe.account.Failure f = source.getError();
			failure.setMessage(f.getMessage());
			if (f.getCategory() != null)
			{
				failure.setCategory(com.cnk.travelogix.sapintegrations.subscribe.account.data.FailureCategory
						.valueOf(f.getCategory().value().toUpperCase()));
			}
			final List<com.cnk.travelogix.custom.subscribe.account.FailureCause> causedby = f.getCausedBy();
			if (ResponseStatus.ERROR.equals(target.getStatus()))
			{
				for (final com.cnk.travelogix.custom.subscribe.account.FailureCause cause : causedby)
				{
					final FailureCause fc = new FailureCause();
					fc.setCode(cause.getCode());
					fc.setMessage(cause.getMessage());
					fc.setModule(cause.getModule());
					failure.getCausedBy().add(fc);
					final com.cnk.travelogix.commons.error.Error error = new Error();
					error.setCode(String.valueOf(fc.getCode()));
					target.getErrors().add(populateError(error));
				}
			}
			target.setError(failure);
		}
		else
		{
			BeanUtils.copyProperties(source.getExternalAccountReference(), extAccRef);
			target.setExternalAccountReference(extAccRef);
		}
		target.setMessage(source.getMessage());
	}

}
