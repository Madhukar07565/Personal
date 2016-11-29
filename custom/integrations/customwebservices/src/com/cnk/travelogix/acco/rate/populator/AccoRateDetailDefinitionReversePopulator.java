package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.masterdata.core.enums.RoomCategory;
import com.cnk.travelogix.masterdata.core.enums.RoomType;
import com.cnk.travelogix.rate.acco.data.AccoRateDetailDefinitionData;
import com.cnk.travelogix.supplier.rates.enums.MealPlanType;
import com.cnk.travelogix.supplier.rates.enums.RateFor;
import com.cnk.travelogix.supplier.rates.supplierrate.model.accommodation.AccoRateDetailDefinitionModel;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AccoRateDetailDefinitionReversePopulator implements Populator<AccoRateDetailDefinitionData, AccoRateDetailDefinitionModel> {

	@Override
	public void populate(AccoRateDetailDefinitionData source, AccoRateDetailDefinitionModel target)
			throws ConversionException {
		
		target.setMinNights(target.getMinNights());
		
		target.setRoomCategory(RoomCategory.valueOf(source.getRoomCategory()));
	   target.setProRata(source.getProRata());
		target.setStayDuration(source.getStaryDuration());
		target.setMealPlan(MealPlanType.valueOf(source.getMealPlan()));
		target.setCheckInTime(source.getCheckInTime());
		target.setCheckOutTime(source.getCheckoutTime());
		
		target.setCommissionExcluded(RoomType.valueOf(source.getCommissionExcluded()));
		
		target.setRateFor(RateFor.valueOf(source.getRateFor()));
		target.setNoOfAdults(source.getNoOfAdult());
		target.setNoOfAdults(source.getNoOfAdult());
		target.setMinPaxOccupancy(source.getMinPaxOccupancy());
		target.setMaxPaxOccupancy(source.getMaxPaxOccupancy());
		target.setNoOfChild(source.getNoOfChild());
		target.setPayOnArrival(source.getPayOnArrival());
	
		
		
		
		
	}

}
