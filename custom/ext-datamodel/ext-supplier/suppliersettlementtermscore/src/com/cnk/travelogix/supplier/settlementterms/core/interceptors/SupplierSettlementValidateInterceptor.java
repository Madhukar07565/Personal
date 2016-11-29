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
import com.cnk.travelogix.supplier.settlementterms.model.SupplierSettlementModel;


public class SupplierSettlementValidateInterceptor implements ValidateInterceptor<SupplierSettlementModel>
{
	private static final Logger LOG = Logger.getLogger(SupplierSettlementValidateInterceptor.class.getName());
	private SettlementTermService settlementTermService;

	@Override
	public void onValidate(final SupplierSettlementModel supplierSettlementModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  SupplierSettlementValidateInterceptor");
		}

		if (ctx.isNew(supplierSettlementModel) && supplierSettlementModel.getSupplier() != null && !settlementTermService
				.findSupplierSettlementBySupplierName(supplierSettlementModel.getSupplier().getPk().toString()).isEmpty())
		{
			LOG.debug("Duplicate Supplier Name to create SupplierSettlement");
			throw new InterceptorException(Localization.getLocalizedString("suppliersettlement.term.duplicte.validation.message"));
		}

		else if (!ctx.isNew(supplierSettlementModel) && !supplierSettlementModel.getAdvCommercialSettlementPayable().isEmpty()
				&& supplierSettlementModel.getBankDetailList().isEmpty())
		{
			LOG.debug("Missing Bank Detail for Payable Commercial Type");
			throw new InterceptorException(
					Localization.getLocalizedString("suppliersettlement.term.no.bank.detail.payable.commercial.validation.message"));
		}

		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of  SupplierSettlementValidateInterceptor");
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
