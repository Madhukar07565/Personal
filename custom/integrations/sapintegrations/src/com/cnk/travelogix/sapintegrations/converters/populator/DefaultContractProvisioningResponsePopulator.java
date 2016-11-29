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

import com.cnk.travelogix.commons.error.Error;
import com.cnk.travelogix.contract.provisioning.data.ContractOperationResponseData;
import com.cnk.travelogix.contract.provisioning.data.Failure;
import com.cnk.travelogix.contract.provisioning.data.FailureCategory;
import com.cnk.travelogix.contract.provisioning.data.FailureCause;
import com.cnk.travelogix.contract.provisioning.data.ResponseStatus;
import com.cnk.travelogix.custom.contract.provisioning.ContractOperationResponse;


/**
 *
 */
public class DefaultContractProvisioningResponsePopulator extends AbstractErrorResponsePopulator
		implements Populator<ContractOperationResponse, ContractOperationResponseData>
{

	@Override
	public void populate(final ContractOperationResponse source, final ContractOperationResponseData target)
			throws ConversionException
	{
		final String code = source.getId();
		target.setId(code);
		target.setMessage(source.getMessage());
		target.setReference(source.getReference());
		if (source.getStatus() != null && StringUtils.isNotBlank(source.getStatus().value()))
		{
			target.setStatus(
					com.cnk.travelogix.contract.provisioning.data.ResponseStatus.valueOf(source.getStatus().value().toUpperCase()));
		}
		final Failure failure = new Failure();
		final com.cnk.travelogix.custom.contract.provisioning.Failure f = source.getError();
		failure.setMessage(f.getMessage());
		if (f.getCategory() != null)
		{
			failure.setCategory(FailureCategory.valueOf(f.getCategory().value().toUpperCase()));
		}
		final List<com.cnk.travelogix.custom.contract.provisioning.FailureCause> causedby = f.getCausedBy();
		if (ResponseStatus.ERROR.equals(target.getStatus()))
		{
			for (final com.cnk.travelogix.custom.contract.provisioning.FailureCause cause : causedby)
			{
				final FailureCause fc = new FailureCause();
				fc.setCode(cause.getCode());
				fc.setMessage(cause.getMessage());
				fc.setModule(cause.getModule());
				failure.getCausedBy().add(fc);
				final com.cnk.travelogix.commons.error.Error error = new Error();
				error.setCode(code);
				target.getErrors().add(populateError(error));
			}
		}
		target.setError(failure);
	}

}
