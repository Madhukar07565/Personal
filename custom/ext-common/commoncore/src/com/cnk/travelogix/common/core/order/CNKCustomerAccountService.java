/**
 *
 */
package com.cnk.travelogix.common.core.order;

import de.hybris.platform.commerceservices.customer.CustomerAccountService;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.store.BaseStoreModel;


/**
 * @author i054410
 *
 */
public interface CNKCustomerAccountService extends CustomerAccountService
{
	public SearchPageData<OrderModel> searchBookingList(final CustomerModel customerModel, final BaseStoreModel store,
			final OrderSearchCondition osc, final PageableData pageableData);
}
