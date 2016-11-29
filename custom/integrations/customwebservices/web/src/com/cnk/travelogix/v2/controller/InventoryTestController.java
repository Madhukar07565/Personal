package com.cnk.travelogix.v2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnk.travelogix.common.inventory.core.enums.InventoryType;
import com.cnk.travelogix.inventory.data.AbstractAccoInventoryDetailData;
import com.cnk.travelogix.inventory.data.AccoInventoryDefinitionData;
import com.cnk.travelogix.inventory.data.AccoInventoryGridData;
import com.cnk.travelogix.inventory.data.AccoSupplierAdvanceDefinitionData;
import com.cnk.travelogix.inventory.data.InventoryRoomInfoData;
import com.cnk.travelogix.inventory.data.UpdateInventortyData;
import com.cnk.travelogix.masterdata.core.enums.RoomCategory;
import com.cnk.travelogix.masterdata.core.enums.RoomType;
import com.cnk.travelogix.supplier.inventory.facade.InventoryFacade;

@Controller
@RequestMapping(value = "/{baseSiteId}/inventory")
public class InventoryTestController {
	
	  @Resource(name = "inventoryFacade")
	  InventoryFacade inventoryFacade;
	  
	  @RequestMapping(value = "/checkInventoryDefination", method = RequestMethod.GET)
	    public void testInventory(){
	    	//URL : http://localhost:9001/customwebservices/v2/ezginb2c/inventory/checkInventoryDefination   		
	    	inventoryFacade.updateInventoryDefinition(prepareRequestdata());
	    }
	   
	    public UpdateInventortyData  prepareRequestdata(){
	    	
	    	UpdateInventortyData updateInventory = new UpdateInventortyData();
	    	
	    	// Inventory Defination
	    	List<AccoInventoryDefinitionData> accoInventoryDefinitions = new ArrayList<AccoInventoryDefinitionData>();
	    	AccoInventoryDefinitionData definationData = new AccoInventoryDefinitionData();
	    	//definationData.setIsDelete(true);
	    	definationData.setActive(true);
	    	definationData.setCode("30001");
	    	definationData.setSupplierID("Taj Hotel");
	    	definationData.setInventoryType(InventoryType.FREESALE);
	    	accoInventoryDefinitions.add(definationData);
	    	updateInventory.setInventoryDefinition(accoInventoryDefinitions);
	    	
	    	//SupplierAdvanceDefination
	    	AccoSupplierAdvanceDefinitionData supplierAdvanceDefination = new AccoSupplierAdvanceDefinitionData();
	    	supplierAdvanceDefination.setRoomCategory(RoomCategory.STANDARD);
	    	supplierAdvanceDefination.setRoomType(RoomType.DOUBLE_ROOM);  
	    	supplierAdvanceDefination.setMaxNoOfNights(3);
	    	supplierAdvanceDefination.setMinNoOfNights(2);
	    	definationData.setSupplierAdvanceDefinition(supplierAdvanceDefination);
	    	
	    	// Inventory Grid
	    	AccoInventoryGridData inventoryGrid = new AccoInventoryGridData();
	    	List<AbstractAccoInventoryDetailData> inventoryDetails = new ArrayList<>();
	    	AbstractAccoInventoryDetailData inventoryDetail = new AbstractAccoInventoryDetailData();
	    	inventoryDetail.setActive(true);
	    	inventoryDetail.setCode("0010");
	    	inventoryDetail.setCity("BDQ");
	    	inventoryDetail.setProduct("87762");
	    	//inventoryDetail.setInventoryType(InventoryType.FREESALE);
	    	inventoryDetails.add(inventoryDetail);
	    	
	    	// Inventory Room Info
	    	InventoryRoomInfoData roomInfo = new InventoryRoomInfoData();
	    	roomInfo.setRoomCategory(RoomCategory.STANDARD);
	    	roomInfo.setRoomType(RoomType.DOUBLE_ROOM);
	    	
	    	inventoryDetail.setInventoryRoomInfos(roomInfo);
	    	inventoryGrid.setInventoryDetails(inventoryDetails);
	    	updateInventory.setInventoryGrid(inventoryGrid);
	    	
	    	return updateInventory;
	    }

}
