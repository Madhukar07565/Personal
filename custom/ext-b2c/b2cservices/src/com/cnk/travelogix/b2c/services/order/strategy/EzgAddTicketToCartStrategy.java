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

import de.hybris.platform.commerceservices.order.CnkCartEntryModification;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.order.CommerceCartModificationStatus;
import de.hybris.platform.commerceservices.order.impl.DefaultCommerceAddToCartStrategy;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;


/**
 *
 */
public class EzgAddTicketToCartStrategy extends DefaultCommerceAddToCartStrategy
{
	/**
	 * Adds an item to the cart for pickup in a given location
	 *
	 * @param parameter
	 *           Cart parameters
	 * @return Cart modification information
	 * @throws de.hybris.platform.commerceservices.order.CommerceCartModificationException
	 *
	 */

	@Override
	public CommerceCartModification addToCart(final CommerceCartParameter parameter) throws CommerceCartModificationException
	{
		CommerceCartModification modification = new CommerceCartModification();
		final List<CnkCartEntryModification> entriesModification = new ArrayList<CnkCartEntryModification>();

		final CartModel cartModel = parameter.getCart();
		final ProductModel productModel = parameter.getProduct();
		final long quantityToAdd = parameter.getQuantity();
		final OrderProductInfoModel productInfo = parameter.getOrderProductInfo();

		this.beforeAddToCart(parameter);
		validateAddToCart(parameter);

		if (isProductForCode(parameter).booleanValue())
		{
			// So now work out what the maximum allowed to be added is (note that this may be negative!)
			final long actualAllowedQuantityChange = getAllowedCartAdjustmentForProduct(cartModel, productInfo, quantityToAdd);
			final Integer maxOrderQuantity = productModel.getMaxOrderQuantity();
			final long cartLevel = checkTicketCartLevel(productInfo, cartModel);
			final long cartLevelAfterQuantityChange = actualAllowedQuantityChange + cartLevel;

			if (actualAllowedQuantityChange > 0)
			{
				for (int i = 0; i < actualAllowedQuantityChange; i++)
				{
					// We are allowed to add items to the cart, we only add ONE to entry.
					final CartEntryModel entryModel = addCartEntry(parameter, 1);

					final String statusCode = getStatusCodeAllowedQuantityChange(actualAllowedQuantityChange, maxOrderQuantity,
							quantityToAdd, cartLevelAfterQuantityChange);

					final CnkCartEntryModification entryModification = createAddToCartEntryModification(statusCode, entryModel);
					entriesModification.add(entryModification);

				}
				modification = createAddToCartResp(parameter, "status", entriesModification, actualAllowedQuantityChange);
			}
			else
			{
				// Not allowed to add any quantity, or maybe even asked to reduce the quantity
				// Do nothing!
				final String status = getStatusCodeForNotAllowedQuantityChange(maxOrderQuantity, maxOrderQuantity);
				modification = createAddToCartResp(parameter, status, entriesModification, 0);
			}
		}
		else
		{
			modification = createAddToCartResp(parameter, CommerceCartModificationStatus.UNAVAILABLE, entriesModification, 0);
		}

		afterAddToCart(parameter, modification);
		return modification;
	}

	@Override
	protected void validateAddToCart(final CommerceCartParameter parameters) throws CommerceCartModificationException
	{
		final CartModel cartModel = parameters.getCart();
		final ProductModel productModel = parameters.getProduct();

		validateParameterNotNull(cartModel, "Cart model cannot be null");
		validateParameterNotNull(productModel, "Product model cannot be null");

		if (parameters.getQuantity() < 1)
		{
			throw new CommerceCartModificationException("Quantity must not be less than one");
		}
	}

	/**
	 * Vefify product by product code.
	 *
	 */
	private Boolean isProductForCode(final CommerceCartParameter parameter)
	{

		final ProductModel productModel = parameter.getProduct();
		try
		{
			getProductService().getProductForCode(productModel.getCode());
		}
		catch (final UnknownIdentifierException e)
		{
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	/**
	 * Work out the allowed quantity adjustment for a product in the cart given a requested quantity change.
	 *
	 * @param cartModel
	 *           the cart
	 * @param productInfo
	 *           the product in the cart
	 * @param quantityToAdd
	 *           the amount to increase the quantity of the product in the cart, may be negative if the request is to
	 *           reduce the quantity
	 * @return the allowed adjustment
	 */
	protected long getAllowedCartAdjustmentForProduct(final CartModel cartModel, final OrderProductInfoModel productInfo,
			final long quantityToAdd)
	{
		final long cartLevel = checkTicketCartLevel(productInfo, cartModel);
		final long stockLevel = getAvailableStockLevel(productInfo);

		// How many will we have in our cart if we add quantity
		final long newTotalQuantity = cartLevel + quantityToAdd;

		// Now limit that to the total available in stock
		final long newTotalQuantityAfterStockLimit = Math.min(newTotalQuantity, stockLevel);

		// So now work out what the maximum allowed to be added is (note that
		// this may be negative!)
		final Integer maxOrderQuantity = productInfo.getMaxQuantity();

		if (isMaxOrderQuantitySet(maxOrderQuantity))
		{
			final long newTotalQuantityAfterProductMaxOrder = Math
					.min(newTotalQuantityAfterStockLimit, maxOrderQuantity.longValue());
			return newTotalQuantityAfterProductMaxOrder - cartLevel;
		}
		return newTotalQuantityAfterStockLimit - cartLevel;
	}

	/**
	 * Check ticket cart level in cart.
	 */
	private long checkTicketCartLevel(final OrderProductInfoModel productinfo, final CartModel cartModel)
	{
		final OrderTicketInfoModel OrderTicketInfoModel = (OrderTicketInfoModel) productinfo;
		final String flightNumber = OrderTicketInfoModel.getCommonFlightInfo().getFlightNumber();
		final Date DepartureTime = OrderTicketInfoModel.getCommonFlightInfo().getDepartureTime();
		final String fromCity = OrderTicketInfoModel.getCommonFlightInfo().getFromCity();

		final List<AbstractOrderEntryModel> entries = cartModel.getEntries();
		long cartLevel = 0;

		if (entries != null && !entries.isEmpty())
		{
			for (final AbstractOrderEntryModel entry : entries)
			{
				if (entry != null && ProductTypeEnum.TICKET.equals(entry.getProductTypeEnum()))
				{
					final OrderTicketInfoModel ticket = (OrderTicketInfoModel) entry.getOrderProductInfo();
					if (flightNumber.equals(ticket.getCommonFlightInfo().getFlightNumber())
							&& DepartureTime == ticket.getCommonFlightInfo().getDepartureTime()
							&& fromCity.equals(ticket.getCommonFlightInfo().getFromCity()))
					{
						cartLevel++;
					}
				}
			}
		}
		return cartLevel;
	}

	protected long getAvailableStockLevel(final OrderProductInfoModel productInfo)
	{
		//TODO get stock level from SI

		return Long.MAX_VALUE;
	}

	private CartEntryModel addCartEntry(final CommerceCartParameter parameter, final long actualAllowedQuantityChange)
			throws CommerceCartModificationException
	{
		final CartModel cartModel = parameter.getCart();
		final ProductModel productModel = parameter.getProduct();
		final OrderProductInfoModel prodInfo = parameter.getOrderProductInfo();
		final boolean forceNewEntry = parameter.isCreateNewEntry();

		final UnitModel unit = parameter.getUnit();
		final UnitModel orderableUnit = (unit != null ? unit : getUnit(parameter));

		// We are allowed to add items to the cart
		// Modify the cart
		final CartEntryModel cartEntryModel = getCartService().addNewEntry(cartModel, productModel, actualAllowedQuantityChange,
				orderableUnit, APPEND_AS_LAST, !forceNewEntry);

		// set refer to room/flight product
		final OrderProductInfoModel prodClone = getModelService().clone(prodInfo);
		cartEntryModel.setOrderProductInfo(prodClone);
		if (prodClone instanceof OrderTicketInfoModel)
		{
			final OrderTicketInfoModel OrderTicketInfoModel = (OrderTicketInfoModel) prodClone;
			OrderTicketInfoModel.setTicketIndex(cartEntryModel.getEntryNumber());
			cartEntryModel.setProductTypeEnum(ProductTypeEnum.TICKET);
			//cartEntryModel.setOrderFlightDetailInfo(((OrderTicketInfoModel) prodClone).getOrderFlightDetailInfo());
		}
		getModelService().save(cartEntryModel);

		getCommerceCartCalculationStrategy().calculateCart(cartModel);
		getModelService().save(cartEntryModel);

		return cartEntryModel;
	}


	private UnitModel getUnit(final CommerceCartParameter parameter) throws CommerceCartModificationException
	{
		final ProductModel productModel = parameter.getProduct();
		try
		{
			return getProductService().getOrderableUnit(productModel);
		}
		catch (final ModelNotFoundException e)
		{
			throw new CommerceCartModificationException(e.getMessage(), e);
		}
	}

	private String getStatusCodeAllowedQuantityChange(final long actualAllowedQuantityChange, final Integer maxOrderQuantity,
			final long quantityToAdd, final long cartLevelAfterQuantityChange)
	{
		// Are we able to add the quantity we requested?
		if (isMaxOrderQuantitySet(maxOrderQuantity) && (actualAllowedQuantityChange < quantityToAdd)
				&& (cartLevelAfterQuantityChange == maxOrderQuantity.longValue()))
		{
			return CommerceCartModificationStatus.MAX_ORDER_QUANTITY_EXCEEDED;
		}
		else if (actualAllowedQuantityChange == quantityToAdd)
		{
			return CommerceCartModificationStatus.SUCCESS;
		}
		else
		{
			return CommerceCartModificationStatus.LOW_STOCK;
		}
	}


	private String getStatusCodeForNotAllowedQuantityChange(final Integer maxOrderQuantity,
			final Integer cartLevelAfterQuantityChange)
	{

		if (isMaxOrderQuantitySet(maxOrderQuantity) && (cartLevelAfterQuantityChange.longValue() == maxOrderQuantity.longValue()))
		{
			return CommerceCartModificationStatus.MAX_ORDER_QUANTITY_EXCEEDED;
		}
		else
		{
			return CommerceCartModificationStatus.NO_STOCK;
		}
	}

	private CnkCartEntryModification createAddToCartEntryModification(final String status, final CartEntryModel entry)
	{
		final CnkCartEntryModification modification = new CnkCartEntryModification();
		modification.setStatusCode(status);
		modification.setEntry(entry);

		return modification;
	}

	private CommerceCartModification createAddToCartResp(final CommerceCartParameter parameter, final String status,
			final List<CnkCartEntryModification> entriesModification, final long quantityAdded)
	{
		final long quantityToAdd = parameter.getQuantity();

		final CommerceCartModification modification = new CommerceCartModification();
		modification.setStatusCode(status);//success, partialAdded,allFailed
		modification.setQuantityAdded(quantityAdded);
		modification.setQuantity(quantityToAdd);

		modification.setEntries(entriesModification);

		return modification;
	}

}
