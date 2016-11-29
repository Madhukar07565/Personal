/**
 *
 */
package com.cnk.travelogix.common.core.order.dao;

import de.hybris.platform.commerceservices.customer.dao.CustomerAccountDao;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.store.BaseStoreModel;

import com.cnk.travelogix.common.core.order.OrderSearchCondition;


/**
 * @author i054410
 *
 */
public interface CNKCustomerAccountDao extends CustomerAccountDao
{
	public SearchPageData<OrderModel> searchBookingList(final CustomerModel customerModel, final BaseStoreModel store,
			final OrderSearchCondition osc, final PageableData pageableData);
}
