/**
 *
 */
package com.cnk.travelogix.common.facades.populators.hotelDataPopulator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccommodation;
import com.cnk.travelogix.common.core.storefront.svcint.dto.general.SvcIntOptionItem;
import com.cnk.travelogix.common.facades.product.data.hotel.BookingPolicyData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;


public class HotelBookingPolicyListPopulator implements Populator<SvcIntAccommodation, HotelData>
{

	@Override
	public void populate(final SvcIntAccommodation source, final HotelData target) throws ConversionException
	{
		final List<SvcIntOptionItem> bookingPolicyList = source.getBookingPolicyList();
		final List<BookingPolicyData> bookingPolicies = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(bookingPolicyList))
		{
			for (final SvcIntOptionItem svcIntOptionItem : bookingPolicyList)
			{
				final BookingPolicyData bookingPolicyData = new BookingPolicyData();
				bookingPolicyData.setTitle(svcIntOptionItem.getName());
				bookingPolicyData.setContent(svcIntOptionItem.getDescription());
				bookingPolicies.add(bookingPolicyData);
			}
			target.setBookingPolicies(bookingPolicies);
		}
	}

}
