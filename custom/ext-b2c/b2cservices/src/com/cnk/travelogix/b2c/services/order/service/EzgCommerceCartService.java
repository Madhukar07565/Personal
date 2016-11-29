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
package com.cnk.travelogix.b2c.services.order.service;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.order.CommerceCartModificationStatus;
import de.hybris.platform.commerceservices.order.impl.DefaultCommerceCartService;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.core.model.order.CartModel;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.cnk.travelogix.b2c.services.order.strategy.EzgAddHotelToCartStrategy;
import com.cnk.travelogix.b2c.services.order.strategy.EzgAddTicketToCartStrategy;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;


/**
 * Delegation for Ezg hotel and flight strategy.
 *
 */
public class EzgCommerceCartService extends DefaultCommerceCartService
{
	@Resource
	EzgAddTicketToCartStrategy ezgAddTicketToCartStrategy;

	@Resource
	EzgAddHotelToCartStrategy ezgAddHotelToCartStrategy;

	//	@Resource
	//	EzgCartRepricingStrategy ezgCartRepricingStrategy;

	@Override
	public CommerceCartModification addToCart(final CommerceCartParameter parameter) throws CommerceCartModificationException
	{
		CommerceCartModification commerceCartModification = null;
		final OrderProductInfoModel orderProductInfoModel = parameter.getOrderProductInfo();
		if (orderProductInfoModel instanceof OrderTicketInfoModel)
		{
			commerceCartModification = ezgAddTicketToCartStrategy.addToCart(parameter);
		}
		if (orderProductInfoModel instanceof OrderRoomDetailInfoModel)
		{
			commerceCartModification = ezgAddHotelToCartStrategy.addToCart(parameter);
		}
		return commerceCartModification;
	}

	/**
	 * TODO handle success, and other status
	 */
	@Override
	public List<CommerceCartModification> validateCart(final CommerceCartParameter parameter)
			throws CommerceCartModificationException
	{

		final CartModel cartModel = parameter.getCart();
		validateParameterNotNull(cartModel, "Cart model cannot be null");

		final List<CommerceCartModification> modifications = getCartValidationStrategy().validateCart(parameter);

		// We only care about modifications that weren't successful
		// cart: 1, price changed 2, availability gone.
		// payment: 1, price changed less than threshold 2, price changed more than threshold 3, availability gone.
		final List<CommerceCartModification> errorModifications = new ArrayList<CommerceCartModification>(modifications.size());
		for (final CommerceCartModification modification : modifications)
		{
			if (!CommerceCartModificationStatus.SUCCESS.equals(modification.getStatusCode()))
			{
				errorModifications.add(modification);
			}
		}
		
		recalculateCart(parameter);

		return errorModifications;

	}

	@Override
	public boolean calculateCart(final CommerceCartParameter parameters)
	{
		// YTODO Auto-generated method stub
		//this.repricing();
		return super.calculateCart(parameters);
	}

	@Override
	public void recalculateCart(final CommerceCartParameter parameters)
	{
		super.recalculateCart(parameters);
	}
}
