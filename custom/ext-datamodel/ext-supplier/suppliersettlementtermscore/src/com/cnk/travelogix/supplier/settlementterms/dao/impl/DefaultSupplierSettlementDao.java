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
package com.cnk.travelogix.supplier.settlementterms.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import com.cnk.travelogix.supplier.credentials.core.model.SupplierCredentialsModel;
import com.cnk.travelogix.supplier.settlementterms.dao.SupplierSettlementDao;
import com.cnk.travelogix.supplier.settlementterms.jalo.CountryCreditLimit;
import com.cnk.travelogix.supplier.settlementterms.model.CountryCreditLimitModel;
import com.cnk.travelogix.supplier.settlementterms.model.CreditCommSettlementModel;
import com.cnk.travelogix.supplier.settlementterms.model.NoCreditDepositCommSettlementModel;
import com.cnk.travelogix.supplier.settlementterms.model.SupplierSettlementModel;



/**
 * Data Access for SupplierSettlement, CreditCommSettlement and CountryCreditLimit
 */
public class DefaultSupplierSettlementDao extends AbstractItemDao implements SupplierSettlementDao
{
	private static final String SELECT = "SELECT {";
	private static final String WHERE = "} WHERE {";
	private static final String FROM = "}FROM {";

	protected static final String SUPPLIERSETTLEMENT_QUERY_SUPPLIERNAME = SELECT + SupplierSettlementModel.PK + FROM
			+ SupplierSettlementModel._TYPECODE + WHERE + SupplierSettlementModel.SUPPLIER + "} = ?supplier";

	protected static final String CREDITCOMMSETTLEMENT_QUERY_CURRENCY = "Select {PK} FROM {SupplierCredentials AS s JOIN CreditCommSettlement AS c ON {c.pk}={s.creditCommSettlement}"
			+ WHERE + "c." + CreditCommSettlementModel.CURRENCY + " } = ?currency";

	protected static final String COUNTRYCREDILIMIT_QUERY_CREDITLIMITANDTHRESHOLD = SELECT + CountryCreditLimitModel.PK + FROM
			+ CountryCreditLimitModel._TYPECODE + WHERE + CountryCreditLimitModel.CREDITLIMITAMOUNT + "} = ?creditLimit AND {"
			+ CountryCreditLimit.THRESHOLDVALUE + "= ?thresholdValue";

	protected static final String NOCREDITDEPOSIT_QUERY_AMOUNTANDTHRESHLODAMOUNT = SELECT + NoCreditDepositCommSettlementModel.PK
			+ FROM + NoCreditDepositCommSettlementModel._TYPECODE + WHERE + NoCreditDepositCommSettlementModel.THRESHOLDAMOUNT
			+ "} > {" + NoCreditDepositCommSettlementModel.AMOUNT + "} And {" + NoCreditDepositCommSettlementModel.CREATEDINDENT
			+ "} = false";

	@Override
	public List<SupplierSettlementModel> findSupplierSettlementBySupplierName(final String supplier)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(SUPPLIERSETTLEMENT_QUERY_SUPPLIERNAME);
		query.addQueryParameter("supplier", supplier);
		final SearchResult<SupplierSettlementModel> result = search(query);
		return result.getResult();
	}

	@Override
	public List<SupplierCredentialsModel> findCreditCommByCurrencyAndSupplierCredential(final CreditCommSettlementModel creditComm)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(CREDITCOMMSETTLEMENT_QUERY_CURRENCY);
		query.addQueryParameter("currency", creditComm.getCurrency());
		final SearchResult<SupplierCredentialsModel> results = search(query);
		return results.getResult();
	}

	@Override
	public List<CountryCreditLimitModel> findCountryCreditLimitByCreditLimitAndThreshold(final String creditLimit,
			final String thresholdValue)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(COUNTRYCREDILIMIT_QUERY_CREDITLIMITANDTHRESHOLD);
		query.addQueryParameter("creditLimit", creditLimit);
		query.addQueryParameter("thresholdValue", thresholdValue);
		final SearchResult<CountryCreditLimitModel> results = search(query);
		return results.getResult();
	}

	@Override
	public List<NoCreditDepositCommSettlementModel> findNoCreditDepositCommByAmmount()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(NOCREDITDEPOSIT_QUERY_AMOUNTANDTHRESHLODAMOUNT);
		final SearchResult<NoCreditDepositCommSettlementModel> results = search(query);
		return results.getResult();
	}

}
