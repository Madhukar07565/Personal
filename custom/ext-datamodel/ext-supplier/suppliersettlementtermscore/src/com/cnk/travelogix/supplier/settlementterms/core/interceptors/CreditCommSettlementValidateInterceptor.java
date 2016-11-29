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

package com.cnk.travelogix.supplier.settlementterms.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.settlementterms.core.services.SettlementTermService;
import com.cnk.travelogix.supplier.settlementterms.model.CreditCommSettlementModel;


public class CreditCommSettlementValidateInterceptor implements ValidateInterceptor<CreditCommSettlementModel>
{
	private static final Logger LOG = Logger.getLogger(CreditCommSettlementValidateInterceptor.class.toString());

	private SettlementTermService settlementTermService;

	@Override
	public void onValidate(final CreditCommSettlementModel creditCommSettlement, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside OnValidate of CreditCommSettlementValidateInterceptor");
		}

		if (ctx.isNew(creditCommSettlement) && creditCommSettlement.getCurrency() != null
				&& creditCommSettlement.getCredentialNameList() != null)
		{
			if (settlementTermService.findCreditCommByCurrencyAndSupplierCredential(creditCommSettlement))
			{
				throw new InterceptorException(
						Localization.getLocalizedString("suppliercredential.creditcomm.duplicte.validation.message"));
			}
		}
	}

	public SettlementTermService getSettlementTermService()
	{
		return settlementTermService;
	}

	public void setSettlementTermService(final SettlementTermService settlementTermService)
	{
		this.settlementTermService = settlementTermService;
	}

}
