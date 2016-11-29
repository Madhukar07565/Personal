package com.cnk.travelogix.supplier.inventory.service.impl;

import javax.annotation.Resource;

import com.cnk.travelogix.acco.inventory.core.model.AccoInventoryGridModel;
import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDefinitionModel;
import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDetailModel;
import com.cnk.travelogix.accoinventory.core.model.AccoPenaltyChargesReleaseModel;
import com.cnk.travelogix.accoinventory.core.model.InventoryRoomInfoModel;
import com.cnk.travelogix.common.inventory.core.enums.InventoryType;
import com.cnk.travelogix.masterdata.core.enums.RoomCategory;
import com.cnk.travelogix.masterdata.core.enums.RoomType;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.model.accommodation.AccoSupplierAdvanceDefinitionModel;
import com.cnk.travelogix.supplier.inventory.dao.InventoryDao;
import com.cnk.travelogix.supplier.inventory.service.InventoryService;

import de.hybris.platform.servicelayer.model.ModelService;
public class InventoryServiceImpl implements InventoryService {

	
	@Resource(name = "inventoryDao")
	InventoryDao inventoryDao;

	@Resource(name = "modelService")
	ModelService modelService;

	
	@Override
	public AccoInventoryDefinitionModel getInventoryDefination(String supplier , String code) {
		return inventoryDao.findInventoryDefination(supplier , code);
	}
	
	@Override
	public AccoInventoryGridModel getInventoryGrid() {
		return inventoryDao.findInventoryGrid();
	}

	@Override
	public AccoInventoryDetailModel getInventroyDetail(String productCode, String cityIso,
			InventoryType inventoryType) {
		return inventoryDao.findInventroyDetail(productCode, cityIso, inventoryType);
	}

	@Override
	public InventoryRoomInfoModel getInventryRoomInfo(String productCode, String cityIso, RoomCategory roomCategory,
			RoomType roomType) {
		return inventoryDao.findInventryRoomInfo(productCode, cityIso, roomCategory, roomType);
	}

	@Override
	public AccoSupplierAdvanceDefinitionModel getAccoSupplierAdvanceDefinition(String supplier,
			RoomCategory roomCategory, RoomType roomType) {
		return inventoryDao.findSupplierAdvanceDefination(supplier, roomCategory, roomType);
	}
	
	@Override
	public AccoPenaltyChargesReleaseModel getPenaltychargesRelease(String supplier, RoomCategory roomCategory,
			RoomType roomType) {
		return inventoryDao.findPenaltychargesRelease(supplier, roomCategory, roomType);
	}
	
	
}