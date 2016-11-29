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
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.storelocator.model.PointOfServiceModel;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.DummyProductModel;
import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomData;
import com.cnk.travelogix.product.common.core.model.AccommodationModel;


public class EzgAddHotelToCartStrategy extends DefaultCommerceAddToCartStrategy
{
	
	/**
	 * check room number in cart.if 
	 */
	private long checkHotelCartLevel(final OrderProductInfoModel productinfo, final CartModel cartModel)
	{
		OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel) productinfo;
		String hotelId = room.getHotelId();
		String roomId = room.getRoomId();
		//String supplierCode = room.getSupplierCode();
		List<AbstractOrderEntryModel> entries = cartModel.getEntries();
		long cartLevel = 0;

		if (entries != null && !entries.isEmpty())
		{
			for (AbstractOrderEntryModel entry : entries)
			{
				if (entry != null && ProductTypeEnum.ROOM.equals(entry.getProductTypeEnum()))
				{
					OrderRoomDetailInfoModel existingRoom = (OrderRoomDetailInfoModel) entry.getOrderProductInfo();
					if (hotelId.equals(existingRoom.getHotelId()) && roomId.equals(existingRoom.getRoomId()))
							//&& supplierCode.equals(existingRoom.getSupplierCode()))
					{
						cartLevel++;
					}
				}
			}
		}

		return cartLevel;
	}
	
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
		CommerceCartModification modification=new CommerceCartModification();
		List<CnkCartEntryModification> entriesModification = new ArrayList<CnkCartEntryModification>();
		
		final CartModel cartModel = parameter.getCart();
		final ProductModel productModel = parameter.getProduct();
		final long quantityToAdd = parameter.getQuantity();
		OrderProductInfoModel productInfo = parameter.getOrderProductInfo();
		
		this.beforeAddToCart(parameter);
		validateAddToCart(parameter);

		if (validProductForCode(parameter).booleanValue())
		{
			// So now work out what the maximum allowed to be added is (note that this may be negative!)
			final long actualAllowedQuantityChange = getAllowedCartAdjustmentForProduct(cartModel, productInfo, quantityToAdd);
			final Integer maxOrderQuantity = productModel.getMaxOrderQuantity();
			final long cartLevel = checkHotelCartLevel(productInfo, cartModel);
			final long cartLevelAfterQuantityChange = actualAllowedQuantityChange + cartLevel;

			if (actualAllowedQuantityChange > 0)
			{
				// create hotel identified by groupId.
				OrderHotelDetailInfoModel hotelModel = getOrderHotelDetailInfo(productModel, (OrderRoomDetailInfoModel)productInfo,actualAllowedQuantityChange);
				for (int i = 0; i < actualAllowedQuantityChange; i++)
				{
				// We are allowed to add items to the cart, we only add ONE to entry.
					final  CartEntryModel entryModel = addCartEntry(hotelModel,parameter, 1);

					final String statusCode = getStatusCodeAllowedQuantityChange(actualAllowedQuantityChange, maxOrderQuantity,
							quantityToAdd, cartLevelAfterQuantityChange);

					CnkCartEntryModification entryModification = createAddToCartEntryModification( statusCode, entryModel);
					entriesModification.add(entryModification);
				}
				modification =createAddToCartResp(parameter,"status",entriesModification,actualAllowedQuantityChange);
			}
			else
			{
				// Not allowed to add any quantity, or maybe even asked to reduce the quantity
				// Do nothing!
				final String status = getStatusCodeForNotAllowedQuantityChange(maxOrderQuantity, maxOrderQuantity);
				modification = createAddToCartResp(parameter, status, entriesModification,0);
			}
		}
		else
		{
			modification = createAddToCartResp(parameter, CommerceCartModificationStatus.UNAVAILABLE,
					entriesModification,0);
		}

		afterAddToCart(parameter, modification);
		return modification;
	}

	private CnkCartEntryModification createAddToCartEntryModification( final String status,
			final CartEntryModel entry)
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

	 
	private CartEntryModel addCartEntry(final OrderHotelDetailInfoModel hotelModel, final CommerceCartParameter parameter, final long actualAllowedQuantityChange)
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
		CartEntryModel cartEntryModel = getCartService().addNewEntry(cartModel, productModel, actualAllowedQuantityChange,
				orderableUnit, APPEND_AS_LAST, !forceNewEntry);

		// set refer to room/flight product
		OrderProductInfoModel prodClone = getModelService().clone(prodInfo);
		cartEntryModel.setOrderProductInfo(prodClone);
		if (prodClone instanceof OrderRoomDetailInfoModel)
		{
			OrderRoomDetailInfoModel roominfo = (OrderRoomDetailInfoModel) prodClone;
			//TODO room index should be ordered in group
			roominfo.setRoomIndex(cartEntryModel.getEntryNumber());
			cartEntryModel.setProductTypeEnum(ProductTypeEnum.ROOM);
			roominfo.setOrderHotelDetailInfo(hotelModel);
		}
		getModelService().save(cartEntryModel);

		getCommerceCartCalculationStrategy().calculateCart(cartModel);
		getModelService().save(cartEntryModel);

		return cartEntryModel;
	}
	
	/**
	 * get hotel info module
	 * TODO maybe write flexable search 
	 */
	private OrderHotelDetailInfoModel getOrderHotelDetailInfo(ProductModel productModel, OrderRoomDetailInfoModel room, long qty)
	{
		String hotelId = room.getHotelId();
		OrderHotelDetailInfoModel hotel = null;
		CartModel cart = getCartService().getSessionCart();
		List<AbstractOrderEntryModel> entries = cart.getEntries();
		for (AbstractOrderEntryModel entry : entries)
		{
			String grpId = entry.getOrderProductInfo().getGroupId();
			OrderProductInfoModel prod = entry.getOrderProductInfo();

			if (ProductTypeEnum.ROOM.equals(entry.getProductTypeEnum()))
			{
				OrderRoomDetailInfoModel roomModel = (OrderRoomDetailInfoModel) prod;
				OrderHotelDetailInfoModel hotelOnEntry = roomModel.getOrderHotelDetailInfo();
				if (hotelOnEntry != null && hotelId.equals(hotelOnEntry.getHotelId()) && room.getGroupId().equals(grpId))
				{
					hotel = hotelOnEntry;
					String no = hotel.getNumberOfrooms();
					int newNo = Integer.parseInt(no) + 1;
					hotel.setNumberOfrooms(Integer.toString(newNo));
				}
			}
		}

		
		
		if (hotel == null)
		{
			hotel = createOrderHotelDetailInfo(productModel, room,qty);
		}else{
			String numAd = hotel.getNumberOfAdult();
			int newNumAd = Integer.parseInt(numAd) +  Integer.parseInt(room.getNumberOfAdult())*(int) qty;
			hotel.setNumberOfAdult(Integer.toString(newNumAd));
			
			String numCh = hotel.getNumberOfChild();
			int newNumCh = Integer.parseInt(numCh) +  Integer.parseInt(room.getNumberOfChild())*(int) qty;
			hotel.setNumberOfChild(Integer.toString(newNumCh));
		}
		return hotel;
	}
	/**
	 * if first time to add this hotel's room to cart, then create hotel detail info,
	 * if not then get already exist hotel detail info.
	 */
	private OrderHotelDetailInfoModel createOrderHotelDetailInfo(ProductModel productModel,OrderRoomDetailInfoModel room, long qty)
	{
		//TODO move this to after add to cart hook
		OrderHotelDetailInfoModel hotelDetailInfo = getModelService().create(OrderHotelDetailInfoModel.class);
		if (productModel instanceof AccommodationModel)
		{
			AccommodationModel hotelProd = (AccommodationModel) productModel;
			if (hotelProd.getHotelRating() != null)
			{
				hotelDetailInfo.setHotelRate(hotelProd.getHotelRating().getCode());
			}
			//TODO SI need country and city info from SI?
			hotelDetailInfo.setHotelAddress(productModel.getDescription());
//			hotelDetailInfo.setHotelCityName("Delhi");
//			hotelDetailInfo.setHotelCountryName("India");
		}
		if (productModel instanceof DummyProductModel)
		{
			DummyProductModel dummyhotel = (DummyProductModel) productModel;
		 
			//TODO SI need country and city info from SI?
			hotelDetailInfo.setHotelAddress(dummyhotel.getDescription());
		}
		hotelDetailInfo.setHotelId(room.getHotelId());
		hotelDetailInfo.setHotelName(productModel.getName());

		hotelDetailInfo.setNumberOfAdult(""+Integer.parseInt(room.getNumberOfAdult())*(int)qty);
		hotelDetailInfo.setNumberOfChild(""+Integer.parseInt(room.getNumberOfChild())*(int)qty);
		hotelDetailInfo.setNumberOfrooms(Integer.toString((int)qty));
		
		hotelDetailInfo.setHotelCheckinDate(room.getRoomCheckinDate());
		hotelDetailInfo.setHotelCheckoutDate(room.getRoomCheckoutDate());
		hotelDetailInfo.setNumberOfNights(room.getNumberOfNight());

		return hotelDetailInfo;
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
	private Boolean validProductForCode(final CommerceCartParameter parameter)
	{

		final ProductModel productModel = parameter.getProduct();
		try
		{
			//TODO get product, is to validate prod code
			//getProductService().getProductForCode(productModel.getCode());
			productModel.getCode();
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
	 * @param productModel
	 *           the product in the cart
	 * @param quantityToAdd
	 *           the amount to increase the quantity of the product in the cart, may be negative if the request is to
	 *           reduce the quantity
	 * @param pointOfServiceModel
	 *           the PointOfService to check stock at, can be null
	 * @return the allowed adjustment
	 */
	protected long getAllowedCartAdjustmentForProduct(final CartModel cartModel, final OrderProductInfoModel productInfo,
			final long quantityToAdd)
	{
		final long cartLevel = checkHotelCartLevel(productInfo, cartModel);
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
	
	
	 
	
	protected long getAvailableStockLevel(final OrderProductInfoModel productInfo)
	{
		//TODO get stock level from SI
		
		return Long.MAX_VALUE;
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
}