package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.fOCoffer.model.FOCOfferModel;
import com.cnk.travelogix.masterdata.core.enums.PaxType;
import com.cnk.travelogix.product.accommodation.masters.core.enums.SupplementSurchargeType;
import com.cnk.travelogix.rate.acco.data.FOCOfferData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class FOCOfferReversePopulator implements Populator<FOCOfferData, FOCOfferModel>{

	@Override
	public void populate(FOCOfferData source, FOCOfferModel target) throws ConversionException {
		
		target.setMinPaxOrNight(source.getMinPaxOrNight());
		target.setMaxPaxOrNights(source.getMaxPaxOrNight());
		target.setFocAppliedOnSupplement(source.getFocAppliedOnSuppliement());
	    target.setPassengerType(PaxType.valueOf(source.getPassengerType()));
		//target.setChildAge(value);// TODO model type
	    target.setNoOfChildren(source.getNoOfChildren());
		target.setSupplement(SupplementSurchargeType.valueOf(source.getSupplement()));
	    target.setSupplementMandatory(source.getSupplementMandatory());
	}

}
