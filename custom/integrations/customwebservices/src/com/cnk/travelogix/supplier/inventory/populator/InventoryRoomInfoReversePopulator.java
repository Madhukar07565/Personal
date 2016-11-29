package com.cnk.travelogix.supplier.inventory.populator;

import com.cnk.travelogix.accoinventory.core.model.InventoryRoomInfoModel;
import com.cnk.travelogix.inventory.data.InventoryRoomInfoData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class InventoryRoomInfoReversePopulator implements Populator<InventoryRoomInfoData, InventoryRoomInfoModel>{
	
	@Override
	public void populate(InventoryRoomInfoData source, InventoryRoomInfoModel target) throws ConversionException {
		// TODO Auto-generated method stub
		
		if(source.getRoomCategory() != null){
			target.setRoomCategory(source.getRoomCategory());
		}
		
		if(source.getRoomType() != null){
			target.setRoomType(source.getRoomType());
		}
	}
}
