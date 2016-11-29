/**
 *
 */
package com.cnk.travelogix.common.facades.populators.hotelDataPopulator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccommodation;
import com.cnk.travelogix.common.core.storefront.svcint.dto.general.SvcIntDefaultCategoryItem;
import com.cnk.travelogix.common.core.storefront.svcint.dto.general.SvcIntOptionItem;
import com.cnk.travelogix.common.facades.product.data.hotel.AmentyData;
import com.cnk.travelogix.common.facades.product.data.hotel.DescriptionData;
import com.cnk.travelogix.common.facades.product.data.hotel.FacilityData;
import com.cnk.travelogix.common.facades.product.data.hotel.FacilityDetailData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;


public class HotelFacilityListPopulator implements Populator<SvcIntAccommodation, HotelData>
{

	@Override
	public void populate(final SvcIntAccommodation source, final HotelData target) throws ConversionException
	{
		final List<SvcIntDefaultCategoryItem> facilityList = source.getFacilityList();
		final FacilityData facilityData = new FacilityData();
		final List<FacilityDetailData> facilityies = facilityData.getFacilitydetails();
		final List<AmentyData> hotelAmenties = facilityData.getHotelAmenities();
		final List<AmentyData> otherAmenties = facilityData.getOtherAmenities();
		final List<DescriptionData> others = facilityData.getOtherDescriptions();
		final List<AmentyData> businessAmenties = facilityData.getBusinessService();
		if (CollectionUtils.isNotEmpty(facilityList))
		{
			for (final SvcIntDefaultCategoryItem svcIntDefaultCategoryItem : facilityList)
			{
				final String type = svcIntDefaultCategoryItem.getType();
				//TODO:confirm the type code???????????
				if (StringUtils.equalsIgnoreCase(type, "facility"))
				{
					final List<SvcIntOptionItem> optionItems = svcIntDefaultCategoryItem.getOptionList();
					for (final SvcIntOptionItem item : optionItems)
					{
						final FacilityDetailData facilityDetailData = new FacilityDetailData();
						facilityDetailData.setName(item.getName());
						facilityDetailData.setIcon(item.getCode());
						facilityies.add(facilityDetailData);
					}
				}
				else if (StringUtils.equalsIgnoreCase(type, "hotelAmenty"))
				{
					this.convertAmenty(svcIntDefaultCategoryItem.getOptionList(), hotelAmenties);
				}
				else if (StringUtils.equalsIgnoreCase(type, "otherAmenty"))
				{
					this.convertAmenty(svcIntDefaultCategoryItem.getOptionList(), otherAmenties);
				}
				else if (StringUtils.equalsIgnoreCase(type, "others"))
				{
					final List<SvcIntOptionItem> optionItems = svcIntDefaultCategoryItem.getOptionList();
					for (final SvcIntOptionItem item : optionItems)
					{
						final DescriptionData sescriptionData = new DescriptionData();
						sescriptionData.setTitle(item.getName());
						sescriptionData.setDescription(item.getDescription());
						others.add(sescriptionData);
					}
				}
				else if (StringUtils.equalsIgnoreCase(type, "businessAmenty"))
				{
					this.convertAmenty(svcIntDefaultCategoryItem.getOptionList(), businessAmenties);
				}
			}
			facilityData.setFacilitydetails(facilityies);
			facilityData.setBusinessService(businessAmenties);
			facilityData.setHotelAmenities(hotelAmenties);
			facilityData.setOtherAmenities(otherAmenties);
			facilityData.setOtherDescriptions(others);
			target.setFacilities(facilityData);
		}
	}

	public void convertAmenty(final List<SvcIntOptionItem> optionItems, final List<AmentyData> targetAmenity)
	{
		for (final SvcIntOptionItem item : optionItems)
		{
			final AmentyData amentyData = new AmentyData();
			amentyData.setName(item.getName());
			targetAmenity.add(amentyData);
		}
	}
}
