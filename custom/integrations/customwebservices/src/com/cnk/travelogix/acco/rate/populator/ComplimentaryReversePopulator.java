package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.complimentary.model.ComplimentaryModel;
import com.cnk.travelogix.masterdata.core.enums.PaxType;
import com.cnk.travelogix.rate.acco.data.ComplimentaryData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class ComplimentaryReversePopulator implements Populator<ComplimentaryData, ComplimentaryModel> {

	@Override
	public void populate(ComplimentaryData source, ComplimentaryModel target) throws ConversionException {
		
		target.setMinPaxOrNight(source.getMinPaxOrNight());
		//target.setPassengerType(source.getPassengerType());// enum
		target.setPassengerType(PaxType.valueOf(source.getPassengerType()));
	//	target.setApplicableDays(source.getApplicableDays()); //TODO Collection type //enum
		
	}

}
