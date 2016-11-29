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

import de.hybris.platform.basecommerce.enums.OrderEntryStatus;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.order.exceptions.CalculationException;
import de.hybris.platform.order.impl.DefaultCalculationService;
import de.hybris.platform.util.DiscountValue;
import de.hybris.platform.util.TaxValue;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;


/**
 *
 */
public class EzgMockCalculationService extends DefaultCalculationService
{

	@Override
	public void calculateEntries(final AbstractOrderModel order, final boolean forceRecalculate) throws CalculationException
	{
		double subtotal = 0.0;
		for (final AbstractOrderEntryModel e : order.getEntries())
		{
			if (!OrderEntryStatus.DEAD.equals(e.getQuantityStatus()))
			{
				recalculateOrderEntryIfNeeded(e, forceRecalculate);
				subtotal += e.getTotalPrice().doubleValue();
			}
		}
		order.setTotalPrice(Double.valueOf(subtotal));
	}

	private void recalculateOrderEntryIfNeeded(final AbstractOrderEntryModel entry, final boolean forceRecalculation)
			throws CalculationException
	{
		this.resetAllValues(entry);
		calculateTotals(entry, true);
	}

	@Override
	protected void resetAllValues(final AbstractOrderEntryModel entry) throws CalculationException
	{
		// taxes
		//			final Collection<TaxValue> entryTaxes = findTaxValues(entry);
		//			entry.setTaxValues(entryTaxes);
		//			final PriceValue pv = findBasePrice(entry);
		//			final AbstractOrderModel order = entry.getOrder();
		//			final PriceValue basePrice = convertPriceIfNecessary(pv, order.getNet().booleanValue(), order.getCurrency(), entryTaxes);
		//			entry.setBasePrice(Double.valueOf(basePrice.getValue()));
		//			final List<DiscountValue> entryDiscounts = findDiscountValues(entry);
		//			entry.setDiscountValues(entryDiscounts);


		final OrderProductInfoModel orderProductInfoModel = entry.getOrderProductInfo();
		if (orderProductInfoModel instanceof OrderRoomDetailInfoModel)
		{
			final OrderRoomDetailInfoModel roomModel = (OrderRoomDetailInfoModel) orderProductInfoModel;
			final double base = roomModel.getPriceInfo().getCostPrice().doubleValue();
			entry.setBasePrice(Double.valueOf(base));
		}
		if (orderProductInfoModel instanceof OrderTicketInfoModel)
		{
			final OrderTicketInfoModel ticketInfo = (OrderTicketInfoModel) orderProductInfoModel;
			final double base = ticketInfo.getPriceInfo().getCostPrice().doubleValue();
			entry.setBasePrice(Double.valueOf(base));
		}

	}

	@Override
	public void calculateTotals(final AbstractOrderEntryModel entry, final boolean recalculate)
	{
		final AbstractOrderModel order = entry.getOrder();
		final CurrencyModel curr = order.getCurrency();
		final int digits = curr.getDigits().intValue();

		final double quantity = entry.getQuantity().doubleValue();
		double totalPriceWithoutDiscount = entry.getBasePrice().doubleValue() * quantity;

		final OrderProductInfoModel prod = entry.getOrderProductInfo();
		if (prod instanceof OrderRoomDetailInfoModel)
		{
			final String nights = ((OrderRoomDetailInfoModel) prod).getNumberOfNight();
			totalPriceWithoutDiscount = totalPriceWithoutDiscount * Double.valueOf(nights).doubleValue();
		}
		/*
		 * apply discounts (will be rounded each) convert absolute discount values in case their currency doesn't match
		 * the order currency
		 */
		//YTODO : use CalculatinService methods to apply discounts
		final List appliedDiscounts = DiscountValue.apply(quantity, totalPriceWithoutDiscount, digits,
				convertDiscountValues(order, entry.getDiscountValues()), curr.getIsocode());
		entry.setDiscountValues(appliedDiscounts);
		double totalPrice = totalPriceWithoutDiscount;
		for (final Iterator it = appliedDiscounts.iterator(); it.hasNext();)
		{
			totalPrice -= ((DiscountValue) it.next()).getAppliedValue();
		}
		// set total price
		entry.setTotalPrice(Double.valueOf(totalPrice));
		// apply tax values too
		//YTODO : use CalculatinService methods to apply taxes
		calculateTotalTaxValues(entry);
		getModelService().save(entry);
		setCalculatedStatus(entry);
	}

	private void setCalculatedStatus(final AbstractOrderEntryModel entry)
	{
		entry.setCalculated(Boolean.TRUE);
		getModelService().save(entry);
	}

	 
	
}
