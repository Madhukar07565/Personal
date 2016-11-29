package com.cnk.travelogix.supplier.inventory.populator;

import com.cnk.travelogix.inventory.data.AccoSupplierAdvanceDefinitionData;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.model.accommodation.AccoSupplierAdvanceDefinitionModel;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AccoSupplierAdvanceDefinitionReversePopulator implements Populator<AccoSupplierAdvanceDefinitionData , AccoSupplierAdvanceDefinitionModel>{
	@Override
	public void populate(AccoSupplierAdvanceDefinitionData source, AccoSupplierAdvanceDefinitionModel target)
			throws ConversionException {
		if(source.getMaxNoOfNights() != null){
			target.setMaxNoOfNights(source.getMaxNoOfNights());
		}
		
		if(source.getMinNoOfNights() != null){
			target.setMinNoOfNights(source.getMinNoOfNights());
		}
		
	}
}
