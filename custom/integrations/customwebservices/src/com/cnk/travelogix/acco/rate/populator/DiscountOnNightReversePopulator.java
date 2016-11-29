package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.discountonnight.model.DiscountOnNightModel;
import com.cnk.travelogix.masterdata.core.enums.PaxType;
import com.cnk.travelogix.rate.acco.data.DiscountOnNightData;
import com.cnk.travelogix.supplier.rates.enums.DiscountCalculatedOnType;
import com.cnk.travelogix.supplier.rates.enums.MealPlanType;
import com.cnk.travelogix.supplier.rates.enums.StayDaysOfWeekType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DiscountOnNightReversePopulator implements Populator<DiscountOnNightData, DiscountOnNightModel>{

	@Override
	public void populate(DiscountOnNightData source, DiscountOnNightModel target) throws ConversionException {
		
		target.setNoOfDiscountedNights(source.getNoOfDiscountedNights());
		target.setMealPlanForDiscountedNights(MealPlanType.valueOf(source.getMealPlanDiscountedNights()));
		target.setMinimumNights(source.getMinimumNights());
		target.setPassengerType(PaxType.valueOf(source.getPassengerType()));
		target.setDiscountCalculatedOn(DiscountCalculatedOnType.valueOf(source.getDiscountCalculatedOn()));
		target.setArrivalDaysOfWeek(StayDaysOfWeekType.valueOf(source.getArrivalDayofWeek()));
	//	target.setDaysOfWeek(source.getDaysOfweek());//collection type
	
	}

}
