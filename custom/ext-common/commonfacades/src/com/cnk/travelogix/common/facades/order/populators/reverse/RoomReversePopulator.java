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
package com.cnk.travelogix.common.facades.order.populators.reverse;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.model.ModelService;

import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;


/**
 *
 */
public class RoomReversePopulator implements Populator<OrderRoomDetailInfoData, OrderRoomDetailInfoModel>
{
	private ModelService modelService;

	@Override
	public void populate(OrderRoomDetailInfoData roomData, OrderRoomDetailInfoModel roomModel) throws ConversionException
	{
		roomModel.setHotelId(roomData.getHotelId());
		roomModel.setNumberOfAdult(roomData.getNumberOfAdult());
		roomModel.setNumberOfChild(roomData.getNumberOfChild());
		roomModel.setNumberOfNight(roomData.getNumberOfNight());
		roomModel.setRoomName(roomData.getRoomName());
		roomModel.setRoomId(roomData.getRoomId());
		roomModel.setGroupId(roomData.getGroupId());
		roomModel.setRoomType(roomData.getRoomType());
		roomModel.setRoomCheckinDate(roomData.getRoomCheckinDate());
		roomModel.setRoomCheckoutDate(roomData.getRoomCheckoutDate());
		//TODO get price from SI
		if (roomData.getPriceInfo() != null)
		{
			PriceInfoModel priceModel = modelService.create(PriceInfoModel.class);
			priceModel.setCostPrice(Double.valueOf(roomData.getPriceInfo().getCostPrice()));
			roomModel.setPriceInfo(priceModel);
		}else{
			PriceInfoModel priceModel = modelService.create(PriceInfoModel.class);
			priceModel.setCostPrice(Double.valueOf(4000));
			roomModel.setPriceInfo(priceModel);
		}

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
