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
package com.cnk.travelogix.b2c.services.order.strategy;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.commerceservices.order.impl.DefaultCommerceCartCalculationStrategy;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.order.CalculationService;
import de.hybris.platform.order.exceptions.CalculationException;
import de.hybris.platform.promotions.jalo.PromotionsManager.AutoApplyMode;


/**
 *
 */
public class EzgCommerceCartCalculationStrategy extends DefaultCommerceCartCalculationStrategy
{

	@Override
	public boolean calculateCart(CommerceCartParameter parameter)
	{

		final CartModel cartModel = parameter.getCart();

		validateParameterNotNull(cartModel, "Cart model cannot be null");

		final CalculationService calcService = getCalculationService();
		boolean recalculated = false;
		if (calcService.requiresCalculation(cartModel))
		{
			try
			{
				parameter.setRecalculate(false);
				beforeCalculate(parameter);
				calcService.calculate(cartModel);
				getPromotionsService().updatePromotions(getPromotionGroups(), cartModel, true, AutoApplyMode.APPLY_ALL,
						AutoApplyMode.APPLY_ALL, getTimeService().getCurrentTime());
			}
			catch (final CalculationException calculationException)
			{
				throw new IllegalStateException("Cart model " + cartModel.getCode() + " was not calculated due to: "
						+ calculationException.getMessage());
			}
			finally
			{
				afterCalculate(parameter);
			}
			recalculated = true;
		}
//		if (calculateExternalTaxes)
//		{
//			getExternalTaxesService().calculateExternalTaxes(cartModel);
//		}
		return recalculated;
	
	}
	
}
