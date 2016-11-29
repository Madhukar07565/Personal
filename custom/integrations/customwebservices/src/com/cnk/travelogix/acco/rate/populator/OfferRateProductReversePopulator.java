package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.offerrateproduct.model.OfferRateProductModel;
import com.cnk.travelogix.rate.acco.data.OfferRateProductData;
import com.cnk.travelogix.supplier.rates.enums.DiscountType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class OfferRateProductReversePopulator implements Populator<OfferRateProductData, OfferRateProductModel>{

	@Override
	public void populate(OfferRateProductData source, OfferRateProductModel target) throws ConversionException {
		
		 target.setDiscountType(DiscountType.valueOf(source.getDiscountType()));
		target.setDiscountValue(source.getDiscountValue());
		target.setAdvanceBookingFromDays(source.getAdvanceBookingFromDays());
		target.setAdvanceBookingToDays(source.getAdvanceBookingToDays());
	}

}
