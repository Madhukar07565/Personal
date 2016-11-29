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

import com.cnk.travelogix.custom.mappingtable.maintain.Failure;
import com.cnk.travelogix.custom.mappingtable.maintain.MappingTableOperationResponse;
import com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.FailureCause;
import com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MappingTableOperationResponseData;


/**
 *
 */
public class DefaultMaintainMappingTableResponsePopulator extends AbstractErrorResponsePopulator
		implements Populator<MappingTableOperationResponse, MappingTableOperationResponseData>
{

	@Override
	public void populate(final MappingTableOperationResponse source, final MappingTableOperationResponseData target)
			throws ConversionException
	{
		if (source.getStatus() != null)
		{
			target.setStatus(com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.ResponseStatus
					.fromValue(source.getStatus().value()));
		}
		target.setId(source.getId());
		target.setReference(source.getReference());
		final Failure failure = source.getError();
		if (failure != null)
		{
			final com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.Failure f = new com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.Failure();
			final List<com.cnk.travelogix.custom.mappingtable.maintain.FailureCause> causedBy = failure.getCausedBy();

			for (final com.cnk.travelogix.custom.mappingtable.maintain.FailureCause cause : causedBy)
			{
				final FailureCause fc = new FailureCause();
				fc.setCode(cause.getCode());
				fc.setMessage(cause.getMessage());
				fc.setModule(cause.getModule());
				f.getCausedBy().add(fc);
				target.getErrors().add(populateError(String.valueOf(cause.getCode()), cause.getMessage()));
			}
			target.setError(f);
		}
	}

}
