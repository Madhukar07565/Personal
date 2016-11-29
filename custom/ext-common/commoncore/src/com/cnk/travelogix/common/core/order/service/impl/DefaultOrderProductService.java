/**
 * 
 */
package com.cnk.travelogix.common.core.order.service.impl;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.daos.ProductDao;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.order.service.OrderProductService;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomDetailData;


/**
 * @author i323801
 *
 */
public class DefaultOrderProductService implements OrderProductService
{
	private ModelService modelService;
	private ProductDao productDao;
	/**
	 * create room model before add to cart TODO, for 2 rooms, better save before create entry in stratiges
	 */
	@Override
	public OrderRoomDetailInfoModel createRoomModel(OrderRoomDetailInfoData roomData)
	{
		// TODO get room from SI
		final OrderRoomDetailInfoModel roomModel = modelService.create(OrderRoomDetailInfoModel.class);
		return roomModel;
	}

	@Override
	public List<ProductModel> getProductForCode(final CatalogVersionModel catalogVersion, final String code)
	{
		final List<ProductModel> products = productDao.findProductsByCode(catalogVersion, code);

		return products;
	}

	private RoomDetailData getRoom(HotelData hotel, String roomId)
	{
		List<RoomData> rooms = hotel.getRooms();

		for (RoomData room : rooms)
		{
			List<RoomDetailData> roomDetails = room.getRoomDetails();
			for (RoomDetailData detail : roomDetails)
			{
				String id = detail.getRoomId();
				if (roomId.equals(id))
				{
					return detail;
				}
			}
		}
		return null;
	}




	@Override
	public void populateOrderProductFromSIProduct(HotelData siHotel, OrderRoomDetailInfoData orderRoom)
	{
		RoomDetailData roomDetailData = getRoom(siHotel, orderRoom.getRoomId());
		if (roomDetailData != null)
		{
			siHotel.getAddress();
			siHotel.getBrand();
			orderRoom.setRoomName(roomDetailData.getDescription());
			orderRoom.setDescription(roomDetailData.getDescription());

			PriceInfoData priceInfo = new PriceInfoData();
			priceInfo.setCostPrice(Double.parseDouble(roomDetailData.getPrice().getWebPrice()));
			orderRoom.setPriceInfo(priceInfo);
			//TODO
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

	/**
	 * @return the productDao
	 */
	public ProductDao getProductDao()
	{
		return productDao;
	}

	/**
	 * @param productDao the productDao to set
	 */
	public void setProductDao(ProductDao productDao)
	{
		this.productDao = productDao;
	}
}
