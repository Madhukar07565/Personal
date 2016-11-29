package com.cnk.travelogix.supplier.inventory.dao;

import com.cnk.travelogix.acco.inventory.core.model.AccoInventoryGridModel;
import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDefinitionModel;
import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDetailModel;
import com.cnk.travelogix.accoinventory.core.model.AccoPenaltyChargesReleaseModel;
import com.cnk.travelogix.accoinventory.core.model.InventoryRoomInfoModel;
import com.cnk.travelogix.common.inventory.core.enums.InventoryType;
import com.cnk.travelogix.masterdata.core.enums.RoomCategory;
import com.cnk.travelogix.masterdata.core.enums.RoomType;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.model.accommodation.AccoSupplierAdvanceDefinitionModel;

public interface InventoryDao {
	
	public AccoInventoryDefinitionModel findInventoryDefination(String supplier , String code);
	
	public AccoInventoryGridModel findInventoryGrid();
	
	public AccoInventoryDetailModel findInventroyDetail(String productCode ,String cityIso,InventoryType inventoryType);
	
	public InventoryRoomInfoModel findInventryRoomInfo(String productCode, String cityIso, RoomCategory roomCategory , RoomType roomType);
	
	public AccoSupplierAdvanceDefinitionModel findSupplierAdvanceDefination(String supplier, RoomCategory roomCategory , RoomType roomType);
	
	public AccoPenaltyChargesReleaseModel findPenaltychargesRelease(String supplier, RoomCategory roomCategory , RoomType roomType);
}