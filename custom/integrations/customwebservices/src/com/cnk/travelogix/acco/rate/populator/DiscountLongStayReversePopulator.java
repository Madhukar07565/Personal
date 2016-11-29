package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.discountlongstay.model.DiscountLongStayModel;
import com.cnk.travelogix.masterdata.core.enums.PaxType;
import com.cnk.travelogix.rate.acco.data.DiscountLongStayData;
import com.cnk.travelogix.supplier.rates.enums.StayDaysOfWeekType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DiscountLongStayReversePopulator implements Populator<DiscountLongStayData, DiscountLongStayModel> {

	@Override
	public void populate(DiscountLongStayData source, DiscountLongStayModel target) throws ConversionException {
		
		target.setStayDuration(source.getStayDuration());
		target.setPassengerType(PaxType.valueOf(source.getPassengerType()));
        target.setArrivalDaysOfWeek(StayDaysOfWeekType.valueOf(source.getArrivalDaysOfWeek()));
		//target.setDaysOfWeek(source.getDaysOfweek()); // Collection type need to check //enum
		
	}

}
