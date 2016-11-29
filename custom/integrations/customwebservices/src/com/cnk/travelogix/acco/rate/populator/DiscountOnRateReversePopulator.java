package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.discountonrate.model.DiscountOnRateModel;
import com.cnk.travelogix.masterdata.core.enums.PaxType;
import com.cnk.travelogix.rate.acco.data.DiscountOnRateData;
import com.cnk.travelogix.supplier.rates.enums.DiscountCalculatedOnType;
import com.cnk.travelogix.supplier.rates.enums.StayDaysOfWeekType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DiscountOnRateReversePopulator implements Populator<DiscountOnRateData, DiscountOnRateModel> {

	@Override
	public void populate(DiscountOnRateData source, DiscountOnRateModel target) throws ConversionException {
		
		target.setMinPaxOrNight(source.getMinPaxOrNight());
		target.setMaximumNights(source.getMaximumNight());
		target.setPassengerType(PaxType.valueOf(source.getPassengerType()));
		target.setDiscountCalculatedOn(DiscountCalculatedOnType.valueOf(source.getDiscountCalculatedOn()));
	    target.setAppliedOnAll(target.getAppliedOnAll());
	    target.setArrivalDaysOfWeek(StayDaysOfWeekType.valueOf(source.getArrivalDayofWeek()));
	    // source.setDaysOfweek(target.getDaysOfWeek());// TODO collection type
	    
	}

}
