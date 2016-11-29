package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.ancillarydiscount.model.AncillaryDiscountModel;
import com.cnk.travelogix.rate.acco.data.AncillaryDiscountData;
import com.cnk.travelogix.supplier.masters.core.enums.NonAirPriceComponentType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AncillaryDiscountReversePopulator implements Populator<AncillaryDiscountData, AncillaryDiscountModel>{

	@Override
	public void populate(AncillaryDiscountData source, AncillaryDiscountModel target) throws ConversionException {
		
		target.setBookingCount(source.getBookingCount());
		target.setDiscountedBooking(source.getDiscountedBooking());
		target.setDiscountValue(source.getDiscountValue());
		target.setAppliedOnAll(source.getAppliedOnAll());
		//target.setAncillaryComponentType(source.getAncillaryComponentType());
		//target.setAncillaryComponentType(NonAirPriceComponentType.valueOf(source.getAncillaryComponentType()));
	}

}
