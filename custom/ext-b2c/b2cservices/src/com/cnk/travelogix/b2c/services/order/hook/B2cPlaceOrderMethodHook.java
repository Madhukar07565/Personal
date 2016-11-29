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

import de.hybris.platform.commerceservices.order.hook.CommercePlaceOrderMethodHook;
import de.hybris.platform.commerceservices.service.data.CommerceCheckoutParameter;
import de.hybris.platform.commerceservices.service.data.CommerceOrderResult;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.order.InvalidCartException;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;


/**
 *
 */
public class B2cPlaceOrderMethodHook implements CommercePlaceOrderMethodHook
{
	private ModelService modelService;

	@Override
	public void afterPlaceOrder(CommerceCheckoutParameter parameter, CommerceOrderResult orderModel) throws InvalidCartException
	{
		// YTODO Auto-generated method stub

	}

	@Override
	public void beforePlaceOrder(CommerceCheckoutParameter parameter) throws InvalidCartException
	{
		// YTODO Auto-generated method stub

	}

	@Override
	public void beforeSubmitOrder(CommerceCheckoutParameter parameter, CommerceOrderResult result) throws InvalidCartException
	{
		saveTravelerToOrder(parameter, result);
	}

	private void saveTravelerToOrder(CommerceCheckoutParameter parameter, CommerceOrderResult result)
	{
		CartModel cart = parameter.getCart();
		List<AbstractOrderEntryModel> entries = cart.getEntries();

		OrderModel order = result.getOrder();
		List<AbstractOrderEntryModel> orderEntries = order.getEntries();

		for (AbstractOrderEntryModel cartEntry : entries)
		{
			Integer entryNumber = cartEntry.getEntryNumber();

			AbstractOrderEntryModel orderEntry = orderEntries.get(entryNumber.intValue());
			orderEntry.setTraveller(cartEntry.getTraveller());
			modelService.save(orderEntry);
		}
		modelService.save(order);

	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(ModelService modelService)
	{
		this.modelService = modelService;
	}

}
