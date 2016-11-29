package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.rate.acco.data.AccoSurchargeSuppDetailData;
import com.cnk.travelogix.supplier.rates.enums.AccoSurchargeSubType;
import com.cnk.travelogix.supplier.rates.enums.SupplementType;
import com.cnk.travelogix.supplier.rates.enums.SurchargeSupplementType;
import com.cnk.travelogix.supplier.rates.supplierrate.model.accommodation.AccoSurchargeSuppDetailModel;
import com.cnk.travelogix.supplier.settlementterms.core.enums.ThresholdType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AccoSurchargeSuppDetailReversePopulator implements Populator<AccoSurchargeSuppDetailData, AccoSurchargeSuppDetailModel> {

	@Override
	public void populate(AccoSurchargeSuppDetailData source, AccoSurchargeSuppDetailModel target)
			throws ConversionException {
		target.setSurchargeId(source.getSurchargeID());
		target.setSurchargeName(source.getSurchageName());
		target.setType(SurchargeSupplementType.valueOf(source.getType()));
		target.setSupplement(SupplementType.valueOf(source.getSupplement()));
		target.setPriceInclusion(source.getPriceInclusion());
		target.setPriceExclusion(source.getPriceExclusion());
		target.setInternalDescription(source.getInternalDescription());
		target.setExternalDescription(source.getExternalDescription());
		target.setPayOnArrival(source.getPayOnArrival());
		
		target.setSubType(AccoSurchargeSubType.valueOf(source.getSubType()));
		//target.setRoomCategories(source.getRoomCategories());// need to check as it is set type
		//target.setRoomTypes(source.getRoomTypes()); //need to check as it is set type
		//target.setMealPlan(source.getMealPlan());// Collection enum type
		target.setStdCommissionType(ThresholdType.valueOf(source.getStdCommissionType()));
		target.setStdCommissionValue(source.getStdCommissionValue());
		target.setAmount(source.getAmount());
		//target.setPassengerLevelSurchargeDetails(source.getPassengerLevelSurchargeDetails()); TODO Collection type	
	}

}
