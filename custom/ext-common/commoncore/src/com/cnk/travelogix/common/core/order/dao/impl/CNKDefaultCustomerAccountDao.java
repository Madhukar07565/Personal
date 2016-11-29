/**
 *
 */
package com.cnk.travelogix.common.core.order.dao.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.commerceservices.customer.dao.impl.DefaultCustomerAccountDao;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.store.BaseStoreModel;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.common.core.order.OrderSearchCondition;
import com.cnk.travelogix.common.core.order.dao.CNKCustomerAccountDao;


/**
 * @author i054410
 *
 */
public class CNKDefaultCustomerAccountDao extends DefaultCustomerAccountDao implements CNKCustomerAccountDao
{



	/**
	 * only handle order and order entry related condition currently
	 */
	public SearchPageData<OrderModel> searchBookingList(final CustomerModel customerModel, final BaseStoreModel store,
			final OrderSearchCondition osc, final PageableData pageableData)
	{

		validateParameterNotNull(customerModel, "Customer must not be null");
		validateParameterNotNull(store, "Store must not be null");

		final Map<String, Object> queryParams = new HashMap<String, Object>();
		queryParams.put("customer", customerModel);
		queryParams.put("store", store);
		String queryString = "select distinct ({oo.pk}) from {Order as oo ";
		String whereClause = "where {oo.versionID} IS NULL AND {oo.user} = ?customer AND {oo.store} = ?store ";

		if (StringUtils.isNotBlank(osc.getBookingID()))
		{
			whereClause = whereClause + "  AND {oo.code} = ?code ";
			queryParams.put("code", osc.getBookingID());
		}

		if (osc.getBookingStatus() != null)
		{
			//queryString += " JOIN {orderstatus} as oos on {oo.status} = {oos.pk}";
			whereClause += " AND {oo.status} = ?statusCode ";
			queryParams.put("statusCode", osc.getBookingStatus());
		}

		if (osc.getProductType() != null)
		{
			queryString += " left join orderentry as ooe on {ooe.order} = {oo.pk}";
			whereClause += " AND {ooe.producttypeenum} = ?productType ";
			queryParams.put("productType", osc.getProductType());
		}

		queryString = queryString + "}" + whereClause;

		return getPagedFlexibleSearchService().search(queryString, queryParams, pageableData);
	}
}
