package com.cnk.travelogix.supplier.inventory.service;

import com.cnk.travelogix.acco.inventory.core.model.AccoInventoryGridModel;
import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDefinitionModel;
import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDetailModel;
import com.cnk.travelogix.accoinventory.core.model.AccoPenaltyChargesReleaseModel;
import com.cnk.travelogix.accoinventory.core.model.InventoryRoomInfoModel;
import com.cnk.travelogix.common.inventory.core.enums.InventoryType;
import com.cnk.travelogix.masterdata.core.enums.RoomCategory;
import com.cnk.travelogix.masterdata.core.enums.RoomType;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.model.accommodation.AccoSupplierAdvanceDefinitionModel;

public interface InventoryService {
	
	public AccoInventoryDefinitionModel getInventoryDefination(String supplier , String code);
	
	public AccoInventoryGridModel getInventoryGrid();
	
	public AccoInventoryDetailModel getInventroyDetail(String productCode ,String cityIso,InventoryType inventoryType);
	
	public InventoryRoomInfoModel getInventryRoomInfo(String productCode, String cityIso, RoomCategory roomCategory , RoomType roomType);
	
	public AccoSupplierAdvanceDefinitionModel getAccoSupplierAdvanceDefinition(String supplier, RoomCategory roomCategory , RoomType roomType);
	
	public AccoPenaltyChargesReleaseModel getPenaltychargesRelease(String supplier, RoomCategory roomCategory,RoomType roomType);
}