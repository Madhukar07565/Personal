/**
 *
 */
package com.cnk.travelogix.common.core.order.hook;

import de.hybris.platform.commerceservices.order.hook.CommerceCartCalculationMethodHook;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;


/**
 * @author i323801
 *
 */
public class HotelLevelPriceCalculationMethodHook implements CommerceCartCalculationMethodHook
{
	ModelService modelService;

	@Override
	public void afterCalculate(final CommerceCartParameter parameter)
	{
		//TODO how to apply order level discount here?
		final CartModel cart = parameter.getCart();

		final Map<String, PriceInfoModel> hotelPriceMap = new HashMap<String, PriceInfoModel>();
		if (cart != null)
		{
			final List<AbstractOrderEntryModel> entries = cart.getEntries();
			for (final AbstractOrderEntryModel entry : entries)
			{
				if (entry.getProductTypeEnum().equals(ProductTypeEnum.ROOM))
				{
					final OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel) entry.getOrderProductInfo();
					final OrderHotelDetailInfoModel hotel = room.getOrderHotelDetailInfo();
					final String grpId = room.getGroupId();

					PriceInfoModel price;
					if (hotelPriceMap.get(grpId) != null)
					{
						price = hotelPriceMap.get(grpId);
						final Double p = price.getCostPrice();
						price.setCostPrice(p + entry.getTotalPrice());
					}
					else
					{
						price = modelService.create(PriceInfoModel.class);
						price.setCostPrice(entry.getTotalPrice());
						hotelPriceMap.put(grpId, price);
					}
					hotel.setPriceInfo(price);
					modelService.save(price);
					modelService.save(hotel);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.commerceservices.order.hook.CommerceCartCalculationMethodHook#beforeCalculate(de.hybris.
	 * platform.commerceservices.service.data.CommerceCartParameter)
	 */
	@Override
	public void beforeCalculate(final CommerceCartParameter parameter)
	{
		// YTODO Auto-generated method stub

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
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

}
