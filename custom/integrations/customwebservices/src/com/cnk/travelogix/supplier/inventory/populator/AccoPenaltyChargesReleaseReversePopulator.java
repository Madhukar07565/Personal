package com.cnk.travelogix.supplier.inventory.populator;

import com.cnk.travelogix.accoinventory.core.model.AccoPenaltyChargesReleaseModel;
import com.cnk.travelogix.inventory.data.AccoPenaltyChargesReleaseData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AccoPenaltyChargesReleaseReversePopulator implements Populator<AccoPenaltyChargesReleaseData, AccoPenaltyChargesReleaseModel>{
	@Override
	public void populate(AccoPenaltyChargesReleaseData source, AccoPenaltyChargesReleaseModel target)
			throws ConversionException {
		if(source.getRoomCategory() != null){
			target.setRoomCategory(source.getRoomCategory());
		}
		
		if(source.getRoomType() != null){
			target.setRoomType(source.getRoomType());
		}	
		
	}
}
