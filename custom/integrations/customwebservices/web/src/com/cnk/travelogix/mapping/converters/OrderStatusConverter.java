/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package com.cnk.travelogix.mapping.converters;

import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.webservicescommons.mapping.WsDTOMapping;

import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;


/**
 * Bidirectional converter between {@link OrderStatus} and String
 */
@WsDTOMapping
public class OrderStatusConverter extends BidirectionalConverter<OrderStatus, String>
{
	@Override
	public OrderStatus convertFrom(final String source, final Type<OrderStatus> destinationType)
	{
		return OrderStatus.valueOf(source);
	}

	@Override
	public String convertTo(final OrderStatus source, final Type<String> destinationType)
	{
		return source.toString();
	}
}
