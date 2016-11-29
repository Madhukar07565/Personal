package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.discountonpax.model.DiscountOnPaxModel;
import com.cnk.travelogix.masterdata.core.enums.PaxType;
import com.cnk.travelogix.rate.acco.data.DiscountOnPaxData;
import com.cnk.travelogix.supplier.rates.enums.StayDaysOfWeekType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DiscountOnPaxReversePopulator implements Populator<DiscountOnPaxData, DiscountOnPaxModel> {

	@Override
	public void populate(DiscountOnPaxData source, DiscountOnPaxModel target) throws ConversionException {
		
		target.setMinPaxOrNight(source.getMinPaxOrNight());
		target.setPassengerType(PaxType.valueOf(source.getPassengerType()));
		target.setPaxBookedCount(source.getPaxBookedCount());
		target.setDiscountedPaxCount(source.getDiscountedPaxCount());
		target.setAppliedOnAll(source.getAppliedOnAll());
		target.setArrivalDaysOfWeek(StayDaysOfWeekType.valueOf(source.getArrivalDayofWeek()));
		//target.setDaysOfWeek(source.getDaysOfweek());//Collection type
	}

}
