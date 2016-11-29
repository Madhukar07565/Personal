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
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.OfferData;


public class HotelOfferListPopulator implements Populator<SvcIntAccommodation, HotelData>
{

	@Override
	public void populate(final SvcIntAccommodation source, final HotelData target) throws ConversionException
	{
		final List<SvcIntOptionItem> offerList = source.getOfferList();
		 List<OfferData> offers = new ArrayList<>();
		if(CollectionUtils.isNotEmpty(offerList))
		{
			for(final SvcIntOptionItem svcIntOptionItem : offerList)
			{
				OfferData offerData = new OfferData();
				offerData.setTitle(svcIntOptionItem.getName());
				offerData.setContent(svcIntOptionItem.getDescription());
				offerData.setPromoCode(svcIntOptionItem.getCode());
				offers.add(offerData);
			}
			target.setOffers(offers);
		}
	}
}
