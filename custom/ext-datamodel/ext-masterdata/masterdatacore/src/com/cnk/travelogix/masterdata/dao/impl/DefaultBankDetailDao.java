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
package com.cnk.travelogix.masterdata.dao.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import com.cnk.travelogix.masterdata.core.model.BankAccountDetailModel;
import com.cnk.travelogix.masterdata.dao.BankDetailDao;



/**
 * Data Access for looking up AccountNumer in BankDetail
 */
public class DefaultBankDetailDao extends AbstractItemDao implements BankDetailDao
{

	protected static final String BANKDETAIL_QUERY_ACCOUNTNUMBER = "SELECT {" + BankAccountDetailModel.PK + "} FROM {"
			+ BankAccountDetailModel._TYPECODE + "} WHERE {" + BankAccountDetailModel.ACCOUNTNUMBER + "} = ?accountNumber";

	@Override
	public List<BankAccountDetailModel> findSupplierBankByAccountNumber(final String accountNumber)
	{
		validateParameterNotNull(accountNumber, "Account Number must not be null");
		final FlexibleSearchQuery query = new FlexibleSearchQuery(BANKDETAIL_QUERY_ACCOUNTNUMBER);
		query.addQueryParameter("accountNumber", accountNumber);
		final SearchResult<BankAccountDetailModel> result = search(query);
		return result.getResult();
	}
}