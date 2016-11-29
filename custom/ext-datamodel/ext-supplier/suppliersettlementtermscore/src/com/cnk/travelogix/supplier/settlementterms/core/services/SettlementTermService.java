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
 */
package com.cnk.travelogix.supplier.settlementterms.core.services;

import java.util.List;

import com.cnk.travelogix.supplier.settlementterms.model.CountryCreditLimitModel;
import com.cnk.travelogix.supplier.settlementterms.model.CreditCommSettlementModel;
import com.cnk.travelogix.supplier.settlementterms.model.SupplierSettlementModel;


/**
 * Retrieves SupplierSettlement, CreditCommSettlement and CountryCreditLimit Records
 */
public interface SettlementTermService
{
	/**
	 * @param supplierName
	 *
	 * @return List of SupplierSettlement
	 */
	public List<SupplierSettlementModel> findSupplierSettlementBySupplierName(String supplierName);

	/**
	 * @param creditComm
	 *
	 * @return boolean
	 */
	public boolean findCreditCommByCurrencyAndSupplierCredential(CreditCommSettlementModel creditComm);

	/**
	 * @param creditLimit
	 * @param thresholdValue
	 *
	 * @return List of CountryCreditLimitModel
	 */
	public List<CountryCreditLimitModel> findCountryCreditLimitByCreditLimitAndThreshold(String creditLimit,
			String thresholdValue);

}

