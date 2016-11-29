package com.cnk.travelogix.supplier.inventory.populator;

import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDetailModel;
import com.cnk.travelogix.inventory.data.AbstractAccoInventoryDetailData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AccoInventoryDetailReversePopulator implements Populator<AbstractAccoInventoryDetailData, AccoInventoryDetailModel>{

	@Override
	public void populate(AbstractAccoInventoryDetailData source, AccoInventoryDetailModel target)
			throws ConversionException {
		
		if(source.getActive() != null){
			target.setActive(source.getActive());
		}
		
	}
}
