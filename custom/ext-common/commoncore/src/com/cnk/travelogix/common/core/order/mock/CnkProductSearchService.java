/**
 *
 */
package com.cnk.travelogix.common.core.order.mock;

import java.util.List;
import java.util.Map;

import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.facades.product.data.BaseProductData;


/**
 *
 */
public interface CnkProductSearchService<RESULT extends BaseProductData>
{

	/**
	 * Search single product with given parameters. The parameters should contain the product ID.
	 *
	 * @param productId
	 *           product ID
	 * @return product bean
	 */
	public RESULT searchProductDetail(String productId);
	
	/**
	 * • HotelCode 
	 * • Date Information – StayDateRange (Start and End Date) 
	 * • Rooms with Guest Information (No of Adults and No of Childs) 
	 * • Any other mandatory details required by supplier
	 * 
	 * @param searchParameters
	 * @return
	 */
	public List<RESULT> getProductsDetail(Map<String, HotelSearchParam> searchParameters);
	
	public Map<OrderHotelDetailInfoModel, HotelValidationResult>  getHotelAvailibilityAndPrice(List<OrderHotelDetailInfoModel> searchParameters);

	
}
