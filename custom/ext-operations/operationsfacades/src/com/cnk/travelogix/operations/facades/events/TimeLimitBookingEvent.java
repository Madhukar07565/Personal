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
package com.cnk.travelogix.operations.facades.events;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;
import de.hybris.platform.core.model.order.OrderModel;


/**
 * @author C5244544
 */
public class TimeLimitBookingEvent extends AbstractCommerceUserEvent<BaseSiteModel>
{
	private OrderModel order;

	/**
	 * @return the order
	 */
	public OrderModel getOrder()
	{
		return order;
	}

	/**
	 * @param order
	 *           the order to set
	 */
	public void setOrder(final OrderModel order)
	{
		this.order = order;
	}

}
