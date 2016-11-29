package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.discountperage.model.DiscountPerAgeModel;
import com.cnk.travelogix.masterdata.core.enums.PaxType;
import com.cnk.travelogix.rate.acco.data.DiscountPerAgeData;
import com.cnk.travelogix.supplier.rates.enums.StayDaysOfWeekType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DiscountPerAgeReversePopulator implements Populator<DiscountPerAgeData, DiscountPerAgeModel> {

	@Override
	public void populate(DiscountPerAgeData source, DiscountPerAgeModel target) throws ConversionException {
		
		
	target.setMinPaxOrNight(source.getMinPaxOrNight());
		target.setPassengerType(PaxType.valueOf(source.getPassengerType()));
		//target.setAgeDetails(source.getAgeDeta); //Modeltype
	    target.setArrivalDaysOfWeek(StayDaysOfWeekType.valueOf(source.getArrivalDayofWeek()));
		//target.setDaysOfWeek(); //Collection of enum
	}

}
