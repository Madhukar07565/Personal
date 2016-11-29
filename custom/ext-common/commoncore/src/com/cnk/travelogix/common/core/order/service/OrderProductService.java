/**
 * 
 */
package com.cnk.travelogix.common.core.order.service;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;

/**
 * @author i323801
 *
 */
public interface OrderProductService
{
	OrderRoomDetailInfoModel createRoomModel(final OrderRoomDetailInfoData roomData);
	
	void populateOrderProductFromSIProduct(HotelData siHotel,OrderRoomDetailInfoData orderRoom);
	
	public List<ProductModel> getProductForCode(final CatalogVersionModel catalogVersion, final String code);
}
