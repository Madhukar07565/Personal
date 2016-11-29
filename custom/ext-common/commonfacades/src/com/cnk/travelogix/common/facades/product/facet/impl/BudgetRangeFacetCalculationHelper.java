/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetValueData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomDetailData;
import com.cnk.travelogix.common.facades.product.util.AchievePropertiesUtil;


/**
 * @author i313879
 *
 */
public class BudgetRangeFacetCalculationHelper extends PriceRangeFacetCalculationHelper
{
	//budget range facet for hotel
	@Override
	public boolean process(final BaseProductData singleData, final CnkFacetData facet, final FacetToModelEntry facetEntry)
	{
		final Map<Object, CnkFacetValueData> facetMap = getFacetMap(facet);
		final double price = facetEntry.getCaculatedPrice(singleData);
		final CnkFacetValueData minPrice = this.getOrCreateMinPrice(facetMap);
		final CnkFacetValueData maxPrice = this.getOrCreateMaxPrice(facetMap);
		CnkFacetValueData freeCancleation = createCnkFacetValueData("freeCancelation", "hotel.facet.freeCancel", "freeCancelation");
		CnkFacetValueData payAtHotel = createCnkFacetValueData("payAtHotel", "hotel.facet.payAtHotel", "payAtHotel");
		List<CnkFacetValueData> facetValueList = facet.getValues();
		if (CollectionUtils.isEmpty(facetValueList))
		{
			facetValueList = new ArrayList();
			facetValueList.add(minPrice);
			facetValueList.add(maxPrice);
			facetValueList.add(freeCancleation);
			facetValueList.add(payAtHotel);
			facet.setValues(facetValueList);
		}

		if (minPrice.isSelected() && maxPrice.isSelected())
		{
			if (Double.compare(price, maxPrice.getDoubleValue()) > 0 || Double.compare(price, minPrice.getDoubleValue()) < 0)
			{
				return false;
			}
		}
		else
		{
			if (Double.compare(price, maxPrice.getDoubleValue()) < 0 && Double.compare(price, minPrice.getDoubleValue()) > 0)
			{
				minPrice.setDoubleValue(price);
				maxPrice.setDoubleValue(price);
			}

			if (Double.compare(price, maxPrice.getDoubleValue()) > 0)
			{
				maxPrice.setDoubleValue(price);
			}
			if (Double.compare(price, minPrice.getDoubleValue()) < 0)
			{
				minPrice.setDoubleValue(price);
			}
		}

		freeCancleation = facetMap.get("freeCancelation");
		payAtHotel = facetMap.get("payAtHotel");
		if (null != freeCancleation && freeCancleation.isSelected() && !isFreeCancelation(singleData))
		{
			return false;
		}
		if (null != payAtHotel && payAtHotel.isSelected() && !isPayAtHotel(singleData))
		{
			return false;
		}
		return true;
	}

	private CnkFacetValueData createCnkFacetValueData(final String code, final String name, final String value)
	{
		final CnkFacetValueData cnkFacetValueData = new CnkFacetValueData();
		cnkFacetValueData.setCode(code);
		cnkFacetValueData.setSelected(false);
		cnkFacetValueData.setName(AchievePropertiesUtil.getProperties(name));
		cnkFacetValueData.setValue(value);
		cnkFacetValueData.setCount(cnkFacetValueData.getCount() + 1);
		return cnkFacetValueData;
	}


	private boolean isFreeCancelation(final BaseProductData singleData)
	{
		if (singleData instanceof HotelData)
		{
			final HotelData hotelData = (HotelData) singleData;
			final List<RoomData> rooms = hotelData.getRooms();
			for (final RoomData room : rooms)
			{
				final List<RoomDetailData> roomDetails = room.getRoomDetails();
				for (final RoomDetailData roomDetail : roomDetails)
				{
					if (roomDetail.isFreeCancelation())
					{
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}

	private boolean isPayAtHotel(final BaseProductData singleData)
	{
		if (singleData instanceof HotelData)
		{
			final HotelData hotelData = (HotelData) singleData;
			final List<RoomData> rooms = hotelData.getRooms();
			for (final RoomData room : rooms)
			{
				final List<RoomDetailData> roomDetails = room.getRoomDetails();
				for (final RoomDetailData roomDetail : roomDetails)
				{
					if (roomDetail.isPayAtHotel())
					{
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}
}
