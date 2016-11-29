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
package com.cnk.travelogix.b2c.services.order.hook;

import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;


/**
 *
 */
public class CartItemOrderHandler
{
	private static final Logger LOG = Logger.getLogger(CartItemOrderHandler.class);

	private void doAfter(final JoinPoint joinPoint)
	{
		final HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		final HttpSession session = request.getSession();

		if (session == null)
		{
			LOG.error("can not get HTTP session in order handler");
			return;
		}

		final Object attribute = session.getAttribute("typeOrder");
		if (attribute == null)
		{
			LOG.debug("no cart item order in current session");
			return;
		}
		final Object[] args = joinPoint.getArgs();

		for (int i = 0; i < args.length; i++)
		{
			if (args[i] instanceof CommerceCartParameter)
			{
				String currentType = null;
				final OrderProductInfoModel orderProductInfo = ((CommerceCartParameter) args[i]).getOrderProductInfo();
				if (orderProductInfo instanceof OrderTicketInfoModel)
				{
					currentType = "FLIGHT_GROUP";
				}
				else if (orderProductInfo instanceof OrderRoomDetailInfoModel)
				{
					currentType = "HOTEL";
				}
				if (StringUtils.isNotEmpty(currentType) && !ArrayUtils.contains((String[]) attribute, currentType))
				{
					final String[] copyOf = Arrays.copyOf((String[]) attribute, ((String[]) attribute).length + 1);
					copyOf[copyOf.length - 1] = currentType;
					session.setAttribute("typeOrder", copyOf);
				}
			}

		}

	}

}
