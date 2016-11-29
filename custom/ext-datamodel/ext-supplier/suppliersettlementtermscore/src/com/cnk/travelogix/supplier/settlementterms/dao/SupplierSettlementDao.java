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
package com.cnk.travelogix.supplier.settlementterms.dao;

import java.util.List;

import com.cnk.travelogix.supplier.credentials.core.model.SupplierCredentialsModel;
import com.cnk.travelogix.supplier.settlementterms.model.CountryCreditLimitModel;
import com.cnk.travelogix.supplier.settlementterms.model.CreditCommSettlementModel;
import com.cnk.travelogix.supplier.settlementterms.model.NoCreditDepositCommSettlementModel;
import com.cnk.travelogix.supplier.settlementterms.model.SupplierSettlementModel;


/**
 * Data Access for SupplierSettlement, CreditCommSettlement and CountryCreditLimit
 */
public interface SupplierSettlementDao
{

	/**
	 * Retrieves SupplierSettlement
	 *
	 * @param supplier
	 */
	List<SupplierSettlementModel> findSupplierSettlementBySupplierName(String supplier);

	/**
	 * Retrieves SupplierCredentialsModel
	 *
	 * @param currency
	 *
	 */
	List<SupplierCredentialsModel> findCreditCommByCurrencyAndSupplierCredential(CreditCommSettlementModel creditComm);

	/**
	 * Retrieves CountryCreditLimit
	 *
	 * @param creditLimit
	 * @param thresholdValue
	 *
	 */

	List<CountryCreditLimitModel> findCountryCreditLimitByCreditLimitAndThreshold(String creditLimit, String thresholdValue);

	/**
	 * Retrieves NoCreditDepositCommSettlement
	 *
	 */
	List<NoCreditDepositCommSettlementModel> findNoCreditDepositCommByAmmount();

}
