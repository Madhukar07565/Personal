package com.cnk.travelogix.supplier.inventory.populator;

import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDefinitionModel;
import com.cnk.travelogix.inventory.data.AccoInventoryDefinitionData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AccoInventoryDefinitionReversePopulator implements Populator<AccoInventoryDefinitionData , AccoInventoryDefinitionModel>{

	@Override
	public void populate(AccoInventoryDefinitionData source, AccoInventoryDefinitionModel target)
			throws ConversionException {
		
		if(source.getCode() != null){
			target.setCode(source.getCode());
		}
		
		if(source.getActive() != null){
			target.setActive(source.getActive());
		}
		
		if(source.getInventoryType() != null){
			target.setInventoryType(source.getInventoryType());
		}	
	}
}
