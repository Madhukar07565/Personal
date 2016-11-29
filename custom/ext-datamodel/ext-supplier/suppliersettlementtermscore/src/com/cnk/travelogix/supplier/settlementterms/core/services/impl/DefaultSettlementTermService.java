/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP Hybris ("Confidential Information"). You shall
 * not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with SAP Hybris.
 *
 * package com.cnk.travelogix.supplier.settlementterms.core.services.impl;
 *
 * import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
 *
 *
 */
package com.cnk.travelogix.supplier.settlementterms.core.services.impl;

import java.util.List;

import com.cnk.travelogix.supplier.credentials.core.model.SupplierCredentialsModel;
import com.cnk.travelogix.supplier.settlementterms.core.services.SettlementTermService;
import com.cnk.travelogix.supplier.settlementterms.dao.SupplierSettlementDao;
import com.cnk.travelogix.supplier.settlementterms.model.CountryCreditLimitModel;
import com.cnk.travelogix.supplier.settlementterms.model.CreditCommSettlementModel;
import com.cnk.travelogix.supplier.settlementterms.model.SupplierSettlementModel;


/**
 * Implementation of SupplierSettlementService
 */

public class DefaultSettlementTermService implements SettlementTermService
{
	private SupplierSettlementDao supplierSettlementDao;

	@Override
	public List<SupplierSettlementModel> findSupplierSettlementBySupplierName(final String supplierName)
	{
		return supplierSettlementDao.findSupplierSettlementBySupplierName(supplierName);
	}

	@Override
	public boolean findCreditCommByCurrencyAndSupplierCredential(final CreditCommSettlementModel creditComm)
	{
		final List<SupplierCredentialsModel> creditSupplierCredential = (List<SupplierCredentialsModel>) creditComm
				.getCredentialNameList();

		final List<SupplierCredentialsModel> supplierCredential = supplierSettlementDao
				.findCreditCommByCurrencyAndSupplierCredential(creditComm);

		for (final SupplierCredentialsModel supplierCredentialsModel : creditSupplierCredential)
		{
			if (supplierCredential.contains(supplierCredentialsModel))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public List<CountryCreditLimitModel> findCountryCreditLimitByCreditLimitAndThreshold(final String creditLimit,
			final String thresholdValue)
	{
		return supplierSettlementDao.findCountryCreditLimitByCreditLimitAndThreshold(creditLimit, thresholdValue);
	}

	public SupplierSettlementDao getSupplierSettlementDao()
	{
		return supplierSettlementDao;
	}

	public void setSupplierSettlementDao(final SupplierSettlementDao supplierSettlementDao)
	{
		this.supplierSettlementDao = supplierSettlementDao;
	}

}
