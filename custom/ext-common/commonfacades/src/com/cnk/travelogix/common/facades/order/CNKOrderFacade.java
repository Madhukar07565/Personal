/**
 *
 */
package com.cnk.travelogix.common.facades.order;

import de.hybris.platform.commercefacades.order.OrderFacade;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.enums.OrderStatus;

import com.cnk.travelogix.common.core.order.OrderSearchCondition;


/**
 * @author i054410
 *
 */
public interface CNKOrderFacade extends OrderFacade
{
	public SearchPageData<OrderData> searchOrder(final OrderSearchCondition osc, final PageableData pageableData);

	public OrderData getGroupedOrderDetailsForCode(final String code);

	public void updateOrderStatus(final String code, final OrderStatus orderStatus);
}
