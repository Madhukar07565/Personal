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

import com.cnk.travelogix.commons.error.Error;
import com.cnk.travelogix.custom.chargeable.itemcharging.AccountOperation;
import com.cnk.travelogix.custom.chargeable.itemcharging.AccountReference;
import com.cnk.travelogix.custom.chargeable.itemcharging.AccountReferenceType;
import com.cnk.travelogix.custom.chargeable.itemcharging.Amount;
import com.cnk.travelogix.custom.chargeable.itemcharging.AmountAssignment;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemChargeResponse;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargingFailure;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargingResult;
import com.cnk.travelogix.custom.chargeable.itemcharging.ResponseStatus;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargeableItemChargeResponseData;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.FailureCause;


/**
 *
 */
public class DefaultItemChargingResponsePopulator extends AbstractErrorResponsePopulator
		implements Populator<ChargeableItemChargeResponse, ChargeableItemChargeResponseData>
{

	@Override
	public void populate(final ChargeableItemChargeResponse source, final ChargeableItemChargeResponseData target)
			throws ConversionException
	{
		final ResponseStatus status = source.getStatus();
		if (status != null)
		{
			target.setStatus(
					com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ResponseStatus.fromValue(status.value()));
		}
		target.setMessage(source.getMessage());
		final ChargingResult chargingResult = source.getResult();

		final ChargingFailure error = source.getError();
		final com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargingFailure failure = new com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargingFailure();
		failure.setMessage(error.getMessage());
		if (error.getCategory() != null)
		{
			failure.setCategory(com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.FailureCategory
					.valueOf(error.getCategory().value().toUpperCase()));
		}
		final List<com.cnk.travelogix.custom.chargeable.itemcharging.FailureCause> causedby = error.getCausedBy();
		if (ResponseStatus.ERROR.equals(target.getStatus()))
		{
			for (final com.cnk.travelogix.custom.chargeable.itemcharging.FailureCause cause : causedby)
			{
				final FailureCause fc = new FailureCause();
				fc.setCode(cause.getCode());
				fc.setMessage(cause.getMessage());
				fc.setModule(cause.getModule());
				failure.getCausedBy().add(fc);
				final com.cnk.travelogix.commons.error.Error customError = new Error();
				customError.setCode(String.valueOf(cause.getCode()));
				target.getErrors().add(populateError(customError));
			}
		}
		target.setError(failure);
		target.setResult(populateChargingResult(chargingResult));
	}

	private com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargingResult populateChargingResult(
			final ChargingResult source)
	{
		final com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargingResult result = new com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargingResult();
		final List<AccountOperation> accountOperation = source.getAccountOperation();
		for (final AccountOperation accOps : accountOperation)
		{
			final com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.AccountOperation ops = new com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.AccountOperation();
			final Amount amount = accOps.getAmount();

			ops.setAmount(populateAmount(amount));
			final List<AmountAssignment> amountAssignment = accOps.getAmountAssignment();
			for (final AmountAssignment accAssing : amountAssignment)
			{
				final com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.AmountAssignment amountAssignment2 = new com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.AmountAssignment();
				final AccountReference accountReference = accAssing.getAccountReference();
				final com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.AccountReference ref = new com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.AccountReference();
				ref.setId(accountReference.getId());
				final AccountReferenceType type = accountReference.getType();
				if (type != null)
				{
					ref.setType(com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.AccountReferenceType
							.valueOf(type.value().toUpperCase()));
				}
				amountAssignment2.setAccountReference(ref);
				amountAssignment2.setChargedItemKey(accAssing.getChargedItemKey());
				ops.getAmountAssignment().add(amountAssignment2);
			}
			final AccountReference mainAccountReference = accOps.getMainAccountReference();
			final com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.AccountReference mainAcRef = new com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.AccountReference();
			mainAcRef.setId(mainAccountReference.getId());
			if (mainAccountReference.getType() != null)
			{
				mainAcRef.setType(com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.AccountReferenceType
						.valueOf(mainAccountReference.getType().value().toUpperCase()));
			}
			ops.setMainAccountReference(mainAcRef);
			ops.setKey(accOps.getKey());
			ops.setNetAmount(populateAmount(accOps.getNetAmount()));
			ops.setTaxAmount(populateAmount(accOps.getTaxAmount()));

			result.getAccountOperation().add(ops);
		}
		return result;
	}

	private com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.Amount populateAmount(final Amount amount)
	{
		final com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.Amount amt = new com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.Amount();
		amt.setCurrencyCode(amount.getCurrencyCode());
		amt.setValue(amount.getValue());
		return amt;
	}
}
