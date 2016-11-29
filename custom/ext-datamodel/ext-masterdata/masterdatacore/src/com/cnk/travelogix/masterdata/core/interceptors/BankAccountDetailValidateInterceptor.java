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
package com.cnk.travelogix.masterdata.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.model.BankAccountDetailModel;
import com.cnk.travelogix.masterdata.core.services.BankDetailService;


/**
 * Validate Duplicate check on Account number while creating new record of BankDetail
 */
public class BankAccountDetailValidateInterceptor implements ValidateInterceptor<BankAccountDetailModel>
{
	private static final Logger LOG = Logger.getLogger(BankAccountDetailValidateInterceptor.class.getName());

	private BankDetailService bankDetailService;

	@Override
	public void onValidate(final BankAccountDetailModel bankAccountDetailModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  BankAccountValidateInterceptor");
		}

		if (ctx.isNew(bankAccountDetailModel) && bankAccountDetailModel.getAccountNumber() != null
				&& !bankDetailService.findBankDetailByAccountNumber(bankAccountDetailModel.getAccountNumber()).isEmpty())
		{
			LOG.debug("Duplicate Account Number for Creating New BankDetail");
			throw new InterceptorException(
					Localization.getLocalizedString("supplier.bankdetail.account.number.duplicte.validation.message"));
		}

		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of  BankAccountValidateInterceptor");
		}

	}

	public BankDetailService getBankDetailService()
	{
		return bankDetailService;
	}

	public void setBankDetailService(final BankDetailService bankDetailService)
	{
		this.bankDetailService = bankDetailService;
	}

}
