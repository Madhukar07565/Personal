/**
 *
 */
package com.cnk.travelogix.dao.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.core.model.PaymentGatewayMappingModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import com.cnk.travelogix.dao.PaymentGatewayDao;


/**
 * DefaultCustomerDao
 */
public class PaymentGatewayDaoImpl extends AbstractItemDao implements PaymentGatewayDao
{
	protected static final String PAYMENTGATEWAY_MAPPING_QUERY_FOR_PGNAME = "SELECT {" + PaymentGatewayMappingModel.PK + "} FROM {"
			+ PaymentGatewayMappingModel._TYPECODE + "} WHERE LOWER({" + PaymentGatewayMappingModel.PGNAME + "}) = ?pgName";

	protected static final String ALL_PAYMENTGATEWAY_MAPPING_QUERY = "SELECT {" + PaymentGatewayMappingModel.PK + "} FROM {"
			+ PaymentGatewayMappingModel._TYPECODE + "}";


	@Override
	public PaymentGatewayMappingModel getPaymentGatewayMappingForPGName(final String pgName)
	{
		validateParameterNotNull(pgName, "pgName must not be null");
		final FlexibleSearchQuery query = new FlexibleSearchQuery(PAYMENTGATEWAY_MAPPING_QUERY_FOR_PGNAME);
		query.addQueryParameter("pgName", pgName.toLowerCase());
		final SearchResult<PaymentGatewayMappingModel> result = search(query);
		if (result.getTotalCount() > 0)
		{
			return result.getResult().get(0);
		}
		return null;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.dao.PaymentGatewayDao#getPaymentGatewayModelList()
	 */
	@Override
	public List<PaymentGatewayMappingModel> getPaymentGatewayModelList()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(ALL_PAYMENTGATEWAY_MAPPING_QUERY);
		final SearchResult<PaymentGatewayMappingModel> result = search(query);
		return result.getResult();
	}
}