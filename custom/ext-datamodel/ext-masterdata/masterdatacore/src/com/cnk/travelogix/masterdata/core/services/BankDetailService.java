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
package com.cnk.travelogix.masterdata.core.services;

import java.util.List;

import com.cnk.travelogix.masterdata.core.model.BankAccountDetailModel;


/**
 * Return List of BankDetail
 *
 */
public interface BankDetailService
{

	/**
	 * Find BankDetail by accountNumber
	 *
	 * @param accountNumber
	 *
	 * @return List<BankAccountDetailModel>
	 */
	public List<BankAccountDetailModel> findBankDetailByAccountNumber(String accountNumber);

}

