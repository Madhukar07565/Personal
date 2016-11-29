package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.model.AbstractTravelogixSupplierOfferModel;
import com.cnk.travelogix.rate.acco.data.AbstractTravelogixSupplierOfferData;
import com.cnk.travelogix.supplier.rates.enums.DiscountType;
import com.cnk.travelogix.supplier.rates.enums.OfferSubType;
import com.cnk.travelogix.supplier.settlementterms.core.enums.ThresholdType;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AbstractTravelogixSupplierOfferReversePopulator implements Populator<AbstractTravelogixSupplierOfferData,AbstractTravelogixSupplierOfferModel > {

	@Override
	public void populate(AbstractTravelogixSupplierOfferData source, AbstractTravelogixSupplierOfferModel target)
			throws ConversionException {
		target.setOfferSubType(OfferSubType.valueOf(source.getOfferSubType()));
		target.setDiscountType(DiscountType.valueOf(source.getDiscountType()));
		target.setApprovalStatus(ArticleApprovalStatus.valueOf(source.getApprovalStatus()));;
		target.setReason(source.getReason());
		target.setRemarks(source.getRemarks());
		target.setAdvanceBookingFromDays(source.getAdvanceBookingFromDays());
		target.setThresholdType(ThresholdType.valueOf(source.getThresholdType()));
		target.setDiscountValue(source.getDiscountValue());	
		//target.setRateApplicabilityType(source.getRateApplicabilityType());//Collection of enum
		target.setOfferInclusion(source.getOfferInclusion());
		target.setOfferExclusion(source.getOfferExclusion());
	
		
		
	}

}
