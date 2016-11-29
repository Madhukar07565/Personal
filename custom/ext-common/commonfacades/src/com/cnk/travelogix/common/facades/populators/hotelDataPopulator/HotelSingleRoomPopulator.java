/**
 *
 */
package com.cnk.travelogix.common.facades.populators.hotelDataPopulator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccoDateSpecificRoomInfo;
import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccoRoomInfo;
import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntPriceCalendar;
import com.cnk.travelogix.common.facades.product.data.hotel.PriceCalendarData;
import com.cnk.travelogix.common.facades.product.data.hotel.PriceCalendarEntryData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomDetailData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomPriceInfo;


/**
 * @author i313890
 *
 */
public class HotelSingleRoomPopulator implements Populator<SvcIntAccoRoomInfo, RoomDetailData>
{

	@Override
	public void populate(final SvcIntAccoRoomInfo source, final RoomDetailData target) throws ConversionException
	{
		target.setFreeCancelation(null != source.getFreeCancelUntil() ? true : false);
		target.setCancelDate(source.getFreeCancelUntil());
		final SvcIntAccoDateSpecificRoomInfo svcIntDateRoomInfo = source.getDateSpecificRoomInfo();
		svcIntDateRoomInfo.getAncillaryCategoryList();
		//target.setOption();
		target.setPayAtHotel(source.getPayAtHotel().booleanValue());
		final PriceCalendarData priceCalendarData = new PriceCalendarData();
		final int roomNumLeft = convertToPriceCalendarData(source.getPriceCalendar(), priceCalendarData);
		target.setNumLeft(Integer.valueOf(roomNumLeft));
		target.setPriceCalendar(priceCalendarData);

	}

	/**
	 * convert price calendar
	 *
	 * @param source
	 * @param target
	 * @return current Date room number left
	 */
	protected int convertToPriceCalendarData(final List<SvcIntPriceCalendar> source, final PriceCalendarData target)
	{
		int roomNumLeft = 0;
		final List<PriceCalendarEntryData> entryList = new ArrayList<PriceCalendarEntryData>();
		for (final SvcIntPriceCalendar item : source)
		{
			if (item.getDate().equals(new Date()))
			{
				roomNumLeft = item.getAvailableRooms().intValue();
			}
			final PriceCalendarEntryData priceEntryData = new PriceCalendarEntryData();
			convertToPriceCalendarEntryData(item, priceEntryData);
			entryList.add(priceEntryData);
		}
		target.setPriceEntries(entryList);
		return roomNumLeft;
	}

	protected void convertToPriceCalendarEntryData(final SvcIntPriceCalendar source, final PriceCalendarEntryData target)
	{
		target.setDate(source.getDate());
		final RoomPriceInfo roomPriceInfo = new RoomPriceInfo();
		roomPriceInfo.setCurrency(source.getCurreny().getDisplayName());
		roomPriceInfo.setListPrice(String.valueOf(source.getListPrice()));
		roomPriceInfo.setWebPrice(String.valueOf(source.getWebPrice()));
		target.setPrice(roomPriceInfo);
	}

}
