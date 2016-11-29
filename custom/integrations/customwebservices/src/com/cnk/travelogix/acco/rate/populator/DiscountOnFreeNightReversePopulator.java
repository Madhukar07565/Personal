package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.discountonfreenight.model.DiscountOnFreeNightModel;
import com.cnk.travelogix.rate.acco.data.DiscountOnFreeNightData;
import com.cnk.travelogix.supplier.rates.enums.DiscountCalculatedOnType;
import com.cnk.travelogix.supplier.rates.enums.MealPlanType;
import com.cnk.travelogix.supplier.rates.enums.StayDaysOfWeekType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DiscountOnFreeNightReversePopulator implements Populator<DiscountOnFreeNightData, DiscountOnFreeNightModel>{

	@Override
	public void populate(DiscountOnFreeNightData source, DiscountOnFreeNightModel target) throws ConversionException {
		
		target.setFreeNightCalculatedOn(DiscountCalculatedOnType.valueOf(source.getFreeNightCalculatedOn()));
		//target.setMealPlansForFreeNight(MealPlanType.valueOf(source.getMealPlanforFreeNight()));
		target.setNoOfNights(source.getNoOfNights());
		//target.setArrivalDaysOfWeek(StayDaysOfWeekType.valueOf(source.getArrivalDaysOfWeek()));
		//target.setDaysOfWeek(source.getDaysOfweek()); //Collection enum
		target.setAppliedOnAll(source.getAppliedOnAll());
	}
	

}
