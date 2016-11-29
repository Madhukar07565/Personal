/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.dao.impl;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.model.TopupDetailModel;
import com.cnk.travelogix.supplier.commercials.core.dao.TopupDetailDao;


/* Implementation of TopupDetailDao */
public class DefaultTopupDetailDao extends AbstractItemDao implements TopupDetailDao
{
	protected static final String TOPUPDETAIL_QUERY_FOR_DUPLICATE = "SELECT {" + TopupDetailModel.PK + "} FROM {"
			+ TopupDetailModel._TYPECODE + "} WHERE {" + TopupDetailModel.AMOUNT + "} = ?amount and {" + TopupDetailModel.CURRENCY
			+ "} = ?currency  and {" + TopupDetailModel.INCENTIVEPERCENTAGE + "} = ?incentivePercentage";


	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.supplier.commercials.core.dao.TopupDetailDao#getTopupDetails(com.cnk.travelogix.supplier.
	 * commercials.core.advanced.incentiveontopup.model.TopupDetailModel)
	 */
	@Override
	public TopupDetailModel getTopupDetails(final Double amount, final CurrencyModel currency, final Double percentage)
			throws DuplicateUidException
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(TOPUPDETAIL_QUERY_FOR_DUPLICATE);
		query.addQueryParameter(TopupDetailModel.AMOUNT, amount);
		query.addQueryParameter(TopupDetailModel.CURRENCY, currency);
		query.addQueryParameter(TopupDetailModel.INCENTIVEPERCENTAGE, percentage);
		final SearchResult<TopupDetailModel> result = search(query);

		if (result.getResult().size() >= 1)
		{
			throw new DuplicateUidException("Found Entries");

		}
		return result.getResult().isEmpty() ? null : result.getResult().get(0);
	}
}