package com.cnk.travelogix.supplier.inventory.facade.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDefinitionModel;
import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDetailModel;
import com.cnk.travelogix.accoinventory.core.model.AccoPenaltyChargesReleaseModel;
import com.cnk.travelogix.accoinventory.core.model.InventoryRoomInfoModel;
import com.cnk.travelogix.inventory.acco.data.UpdateInventoryResponseData;
import com.cnk.travelogix.inventory.data.AbstractAccoInventoryDetailData;
import com.cnk.travelogix.inventory.data.AccoInventoryDefinitionData;
import com.cnk.travelogix.inventory.data.AccoInventoryGridData;
import com.cnk.travelogix.inventory.data.AccoPenaltyChargesReleaseData;
import com.cnk.travelogix.inventory.data.AccoSupplierAdvanceDefinitionData;
import com.cnk.travelogix.inventory.data.InventoryRoomInfoData;
import com.cnk.travelogix.inventory.data.UpdateInventortyData;
import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.masterdata.core.enums.RoomCategory;
import com.cnk.travelogix.masterdata.core.enums.RoomType;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.model.accommodation.AccoSupplierAdvanceDefinitionModel;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.model.accommodation.room.RoomCategoryConfigModel;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.model.accommodation.room.RoomTypeConfigModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.inventory.facade.InventoryFacade;
import com.cnk.travelogix.supplier.inventory.service.InventoryService;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

/**
 * This facade class manages inventory related functionalities
 * 
 * @author I077322
 * 
 */
public class InventoryFacadeImpl implements InventoryFacade {

    private static final Logger LOG = Logger.getLogger(InventoryFacadeImpl.class);

    @Resource(name = "flexibleSearchService")
    private FlexibleSearchService flexibleSearchService;
    
    @Resource(name = "inventoryDefinitionReversePopulator")
    Populator<AccoInventoryDefinitionData , AccoInventoryDefinitionModel> inventoryDefinitionReversePopulator;
    
    @Resource(name = "inventoryService")
    InventoryService inventoryService;
    
    @Resource(name = "modelService")
    ModelService modelService;
    
    @Resource(name = "catalogVersionService")
    CatalogVersionService catalogVersionService;
    
    @Resource(name = "inventoryDetailReversePopulator")
    Populator<AbstractAccoInventoryDetailData, AccoInventoryDetailModel> inventoryDetailReversePopulator;
    
    @Resource(name = "inventoryRoomInfoReversePopulator")
    Populator<InventoryRoomInfoData, InventoryRoomInfoModel> inventoryRoomInfoReversePopulator;
    
    @Resource(name = "accoSupplierAdvanceDefinitionReversePopulator")
    Populator<AccoSupplierAdvanceDefinitionData, AccoSupplierAdvanceDefinitionModel> accoSupplierAdvanceDefinitionReversePopulator;
    
    @Resource(name="accoPenaltyChargesReleaseReversePopulator")
    Populator<AccoPenaltyChargesReleaseData, AccoPenaltyChargesReleaseModel> accoPenaltyChargesReleaseReversePopulator;
    
    @Override
    public UpdateInventoryResponseData updateInventory(String supplierId, AccoInventoryDefinitionData accoInventoryDefinition) {
	LOG.info("#updateInventory- Start");
	LOG.trace("#updateInventory - supplier ID" + accoInventoryDefinition.getSupplierID());
	SupplierModel supplierModel = new SupplierModel();
	supplierModel.setCode(supplierId);
	supplierModel = flexibleSearchService.getModelByExample(supplierModel);

	AccoInventoryDefinitionModel accInvDefModel = new AccoInventoryDefinitionModel();
	accInvDefModel.setSupplier(supplierModel);

	final List<AccoInventoryDefinitionModel> accInvDefModels = flexibleSearchService.getModelsByExample(accInvDefModel);
	LOG.info("Size : "+accInvDefModels.size());
	final UpdateInventoryResponseData response = new UpdateInventoryResponseData();

	LOG.info("#updateInventory - Finish");
	return response;
    }
    
    
    @Override
    public UpdateInventoryResponseData updateInventoryDefinition(UpdateInventortyData updateInventory) {
 	   
 	   final UpdateInventoryResponseData response = new UpdateInventoryResponseData();
 	   List<AccoInventoryDefinitionData> accoInventoryDefinitions = updateInventory.getInventoryDefinition();
 			  
 	   for (AccoInventoryDefinitionData definationData : accoInventoryDefinitions) {	   
 		   AccoInventoryDefinitionModel inventoryDefination ; 
 		   inventoryDefination  = inventoryService.getInventoryDefination(definationData.getSupplierID(),definationData.getCode());
 		   if(inventoryDefination!=null){
 			  if(null != definationData.getIsDelete() && definationData.getIsDelete()){
 				 definationData.setActive(false);
 			  }else{
 				 LOG.info("Updating AccoInventoryDefinitionModel");
 	 			  inventoryDefinitionReversePopulator.populate(definationData, inventoryDefination);
 			  }	     
 		   }else{
 			   inventoryDefination = modelService.create(AccoInventoryDefinitionModel.class);
 			   inventoryDefination.setCatalogVersion(getInventoryDefinationCatlogVersion());
 			   inventoryDefination.setApprovalStatus(ArticleApprovalStatus.APPROVED);
 			   inventoryDefination.setSupplier(getSupplier(definationData.getSupplierID()));
 			   inventoryDefinitionReversePopulator.populate(definationData, inventoryDefination); 
 			   LOG.info("Inserting new  AccoInventoryDefinitionModel instance");
 		   }
 		   try{
 			   modelService.save(inventoryDefination); 
 		   }catch(ModelSavingException e){
 			   LOG.info("Model not saved"+e.getMessage(),e);
 		   }
 		   if(null != updateInventory.getInventoryGrid()){
 			  updateInventoryDetail(updateInventory.getInventoryGrid());   
 		   }
 		   updateAccoSupplierAdvanceDefinition(definationData,inventoryDefination);
 	   }
 	   return response;
    }
    
    public void updateInventoryDetail(AccoInventoryGridData inventoryGrid){
    	if(!inventoryGrid.getInventoryDetails().isEmpty()){  		
    		List<AbstractAccoInventoryDetailData> inventoryDetails = inventoryGrid.getInventoryDetails();
    		updateDetail(inventoryDetails);  		
    	}
    }

    public void updateDetail(List<AbstractAccoInventoryDetailData> inventoryDetails){
    	for (AbstractAccoInventoryDetailData inventoryDetail : inventoryDetails) {
			AccoInventoryDetailModel accoInventoryDetail ;
			accoInventoryDetail = inventoryService.getInventroyDetail(inventoryDetail.getProduct(), inventoryDetail.getCity(), inventoryDetail.getInventoryType());
			if(null != accoInventoryDetail){
				if(inventoryDetail.getIsDelete() != null && inventoryDetail.getIsDelete()){
					inventoryDetail.setActive(false);
				}else{
					LOG.info("Updating AccoInventoryDetailModel");
					inventoryDetailReversePopulator.populate(inventoryDetail, accoInventoryDetail);
				}		
			}else{
				accoInventoryDetail = modelService.create(AccoInventoryDetailModel.class);
				accoInventoryDetail.setCode(accoInventoryDetail.getCode());
				accoInventoryDetail.setCatalogVersion(getInventoryDefinationCatlogVersion());
				accoInventoryDetail.setApprovalStatus(ArticleApprovalStatus.APPROVED);
				accoInventoryDetail.setAccoInventoryGrid(inventoryService.getInventoryGrid()); 
				inventoryDetailReversePopulator.populate(inventoryDetail, accoInventoryDetail);
				LOG.info("Inserting new AccoInventoryDetailModel instance");
			}
			try{
				modelService.save(accoInventoryDetail);
			}catch(ModelSavingException e){
				LOG.info("Model not saved"+e.getMessage(),e);
	 			e.printStackTrace();
			}
			updateRoomInfo(inventoryDetail);
		}
    }
    
    public void updateRoomInfo(AbstractAccoInventoryDetailData inventoryDetail){
    	if(null != inventoryDetail.getInventoryRoomInfos()){
    		InventoryRoomInfoData inventoryRoominfo = inventoryDetail.getInventoryRoomInfos();
    		InventoryRoomInfoModel roomInfo = inventoryService.getInventryRoomInfo(inventoryDetail.getProduct(), inventoryDetail.getCity(), inventoryRoominfo.getRoomCategory(), inventoryRoominfo.getRoomType());
    		if(null != roomInfo){
    			//Cannot do an soft delete for this model
    			LOG.info("Updating InventoryRoomInfoModel");
    			inventoryRoomInfoReversePopulator.populate(inventoryRoominfo, roomInfo);
    		}else{
    			roomInfo = modelService.create(AccoInventoryDetailModel.class);	
    			inventoryRoomInfoReversePopulator.populate(inventoryRoominfo, roomInfo);
    			LOG.info("Insertinf new InventoryRoomInfoModel instance");
    		}
    		try{
    			modelService.save(roomInfo);
    		}catch(Exception e){
    			LOG.info("Model Not saved"+e.getMessage(),e);
    			
    		}
    	}
    }
    
    public void updateAccoSupplierAdvanceDefinition(AccoInventoryDefinitionData definationData , AccoInventoryDefinitionModel inventoryDefination){
    	if(null != definationData.getSupplierAdvanceDefinition()){
    		AccoSupplierAdvanceDefinitionData accoSupplierAdvanceDefination = definationData.getSupplierAdvanceDefinition();
    		AccoSupplierAdvanceDefinitionModel supplierAdvanceDefination =  inventoryService.getAccoSupplierAdvanceDefinition(definationData.getSupplierID(), accoSupplierAdvanceDefination.getRoomCategory(), accoSupplierAdvanceDefination.getRoomType());
    		if(null != supplierAdvanceDefination){
    			//Cannot do an soft delete for this model
    			LOG.info("Updating AccoSupplierAdvanceDefinitionModel");
    			accoSupplierAdvanceDefinitionReversePopulator.populate(accoSupplierAdvanceDefination, supplierAdvanceDefination);
    		}else{
    			supplierAdvanceDefination = modelService.create(AccoSupplierAdvanceDefinitionModel.class);
    			accoSupplierAdvanceDefinitionReversePopulator.populate(accoSupplierAdvanceDefination, supplierAdvanceDefination);
    			supplierAdvanceDefination.setRoomCategories(getRoomCategoryConfig(accoSupplierAdvanceDefination.getRoomCategory()));
    			supplierAdvanceDefination.setRoomTypes(getRoomTypeConfig(accoSupplierAdvanceDefination.getRoomType()));
    			inventoryDefination.setSupplierAdvanceDefinition(supplierAdvanceDefination); // Associating to AccoInventoryDefination
    			LOG.info("Insertinf new AccoSupplierAdvanceDefinitionModel instance");
    		}
    		try{
    			modelService.save(supplierAdvanceDefination);
    		}catch(Exception e){
    			LOG.info("Model Not saved"+e.getMessage(),e);
    			
    		}
    	}
    }
    
    public void updateAccoPenaltyChargesRelease(AccoInventoryDefinitionData definationData , AccoInventoryDefinitionModel inventoryDefination){
     List<AccoPenaltyChargesReleaseData> accoPenaltychargeReleases = definationData.getSupplierAdvanceDefinition().getPenaltyCharges();
    	for (AccoPenaltyChargesReleaseData accoPenaltyChargesRelease : accoPenaltychargeReleases) {
    		AccoPenaltyChargesReleaseModel penaltyChargeRelease = inventoryService.getPenaltychargesRelease(definationData.getSupplierID(), accoPenaltyChargesRelease.getRoomCategory(), accoPenaltyChargesRelease.getRoomType());
    		if(null != penaltyChargeRelease){
    			LOG.info("Updating AccoPenaltyChargesReleaseModel");
    			accoPenaltyChargesReleaseReversePopulator.populate(accoPenaltyChargesRelease, penaltyChargeRelease);
    		}else{
    			penaltyChargeRelease = modelService.create(AccoPenaltyChargesReleaseModel.class);
    			accoPenaltyChargesReleaseReversePopulator.populate(accoPenaltyChargesRelease, penaltyChargeRelease);
    			penaltyChargeRelease.setAccoSupplierAdvanceDefinition(inventoryDefination.getSupplierAdvanceDefinition());
    			LOG.info("Insertinf new AccoPenaltyChargesReleaseModel instance");
    		}
    		try{
    			modelService.save(penaltyChargeRelease);
    		}catch(Exception e){
    			LOG.info("Model Not saved"+e.getMessage(),e);
    			
    		}
		}
    }
    
    public CatalogVersionModel getInventoryDefinationCatlogVersion(){
 	   CatalogVersionModel catalogVersion =null;
 	   try{
 		   catalogVersion = catalogVersionService.getCatalogVersion("EZ-IN",
 				    "Online");	 
 		 }catch(Exception me){
 			   LOG.info("Error while searching model"+me.getMessage(),me);
 		   }
 	   return catalogVersion;
    }
    
    public CityModel getCity(String iso){
 	   CityModel city = null ; 
 	   try{
 		   city = modelService.create(CityModel.class);
 		   city.setIsocode(iso);
 		   city= flexibleSearchService.getModelByExample(city);	   
 	   }catch(Exception e){
 		  LOG.info("No City Found : "+e.getMessage(),e); 
 	   }
 	   return city;
    }  
    
    public SupplierModel getSupplier(String supplierId){
 	   SupplierModel supplier =null;
 	   try{
 		   supplier = modelService.create(SupplierModel.class);
 		   supplier.setCode(supplierId);
 		   supplier= flexibleSearchService.getModelByExample(supplier);	   
 	   }catch(Exception e){
 		   LOG.info("Model not found"+e.getMessage(),e);
 	   }
 	   return supplier;
    }
    
    public RoomCategoryConfigModel getRoomCategoryConfig(RoomCategory roomCategory){
    	RoomCategoryConfigModel roomCategoryConfig = null ;
    	try{
    		roomCategoryConfig = modelService.create(RoomCategoryConfigModel.class);
    		roomCategoryConfig.setRoomCategory(roomCategory);
    		roomCategoryConfig = flexibleSearchService.getModelsByExample(roomCategoryConfig).get(0);
    	}catch(Exception e){
    		LOG.info("Model not found"+e.getMessage(),e);
    	}	
    	return roomCategoryConfig;
    }
    
    public RoomTypeConfigModel getRoomTypeConfig(RoomType roomType){
    	RoomTypeConfigModel roomTypeConfig = null;
    	try{
    		roomTypeConfig = modelService.create(RoomTypeConfigModel.class);
    		roomTypeConfig.setRoomType(roomType);
    		roomTypeConfig = flexibleSearchService.getModelsByExample(roomTypeConfig).get(0);
    	}catch(Exception e){
    		LOG.info("Model not found"+e.getMessage(),e);
    	}
    	return roomTypeConfig ;
    }
     
}
