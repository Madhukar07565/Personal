package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.discountonroomorcabin.model.DiscountOnRoomOrCabinModel;
import com.cnk.travelogix.rate.acco.data.DiscountOnRoomOrCabinData;
import com.cnk.travelogix.supplier.rates.enums.StayDaysOfWeekType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DiscountOnRoomOrCabinReversePopulator implements Populator<DiscountOnRoomOrCabinData, DiscountOnRoomOrCabinModel> {

	@Override
	public void populate(DiscountOnRoomOrCabinData source, DiscountOnRoomOrCabinModel target)
			throws ConversionException {
		target.setNoOfNights(source.getNoOfNights());
		target.setBookedRoomsCount(source.getBookedRoomsCount());
		target.setAppliedOnAll(source.getAppliedOnAll());
		target.setArrivalDaysOfWeek(StayDaysOfWeekType.valueOf(source.getArrivalDaysOfWeek()));
		//target.setDaysOfWeek(source.getDaysOfweek()); //collection type
		
	}

}
