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

package com.cnk.travelogix.masterdata.core.services.impl;

import java.util.List;

import com.cnk.travelogix.masterdata.core.model.BankAccountDetailModel;
import com.cnk.travelogix.masterdata.core.services.BankDetailService;
import com.cnk.travelogix.masterdata.dao.BankDetailDao;


/**
 * Implementation of BankDetailService
 */

public class DefaultBankDetailService implements BankDetailService
{
	private BankDetailDao bankDetailDao;

	@Override
	public List<BankAccountDetailModel> findBankDetailByAccountNumber(final String accountNumber)
	{
		return bankDetailDao.findSupplierBankByAccountNumber(accountNumber);
	}

	public void setBankDetailDao(final BankDetailDao bankDetailDao)
	{
		this.bankDetailDao = bankDetailDao;
	}

	public BankDetailDao getBankDetailDao()
	{
		return bankDetailDao;
	}



}
