package com.cnk.travelogix.supplier.inventory.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.acco.inventory.core.model.AccoInventoryGridModel;
import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDefinitionModel;
import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDetailModel;
import com.cnk.travelogix.accoinventory.core.model.AccoPenaltyChargesReleaseModel;
import com.cnk.travelogix.accoinventory.core.model.InventoryRoomInfoModel;
import com.cnk.travelogix.accoinventory.core.model.RoomingListCutOffsModel;
import com.cnk.travelogix.common.inventory.core.enums.InventoryType;
import com.cnk.travelogix.common.inventory.model.OverBookingLimitModel;
import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.masterdata.core.enums.RoomCategory;
import com.cnk.travelogix.masterdata.core.enums.RoomType;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.model.accommodation.AccoSupplierAdvanceDefinitionModel;
import com.cnk.travelogix.supplier.inventory.dao.InventoryDao;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

public class InventoryDaoImpl implements InventoryDao{

	private static final Logger LOG = Logger.getLogger(InventoryDaoImpl.class);

	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;
	
	
	private final String INVENTORY_GRID = "Select {"+AccoInventoryGridModel.PK +"} from { "+AccoInventoryGridModel._TYPECODE  
			      +"as aig }" ;
	
	private final String ACCO_INVENTORY_DEFINATION = " SELECT {aid.pk} from {AccoInventoryGrid as aig JOIN AccoInventoryDefinition as aid ON {aid.pk} = {aig.accoInventoryDefinition}JOIN Supplier as sup ON {sup.pk} = {aid.supplier} }WHERE {sup.code} =?supplier and {aid.code} =?code ";
	
	private final String INVENTORY_DETAIL = "SELECT {AID.PK} FROM {AccoInventoryGrid AS AIG JOIN AccoInventoryDetail AS AID ON {AID.accoInventoryGrid} = {AIG.PK} JOIN Product as PRO ON {PRO.pk} = {AID.product} JOIN City as CIT ON {CIT.PK} = {AID.city}  } WHERE {PRO.code} =?productCode and {CIT.isoCode} =?cityIso and {AID.inventoryType} =?inventorytype" ;

	private final String INVENTORY_ROOM_INFO = "SELECT {IRI.PK} FROM { AccoInventoryGrid AS AIG JOIN AccoInventoryDetail AS AID ON {AIG.PK} = {AID.accoInventoryGrid} JOIN Product as PRO ON {PRO.pk} = {AID.product} JOIN City as CIT ON {CIT.PK} = {AID.city} JOIN InventoryRoomInfo as IRI ON {IRI.accoInventoryDetail} = {AID.pk} } WHERE  {PRO.code} =?productCode and {CIT.isoCode} =?cityIso and  {IRI.roomCategory} =?roomCategory and {IRI.roomType} =?roomType ";
    
	private final String SUPPLIER_ADVANCE_DEFINATION = " SELECT {ASAD.pk} FROM  { AccoInventoryGrid as AIG JOIN AccoInventoryDefinition as AID ON {AID.pk} = {AIG.accoInventoryDefinition} JOIN AccoSupplierAdvanceDefinition as ASAD ON {ASAD.pk} = {AID.supplierAdvanceDefinition}  JOIN Supplier as SUP ON {SUP.pk} = {AID.supplier} JOIN RoomCategoryConfig as RCC ON {RCC.pk} = {ASAD.roomCategories} JOIN RoomTypeConfig as RTC ON {RTC.pk} = {ASAD.roomTypes} } WHERE {RCC.roomCategory} =?roomCategory AND {RTC.roomType} =?roomType AND {SUP.code} =?supplier ";			
    
	private final String PENALTY_CHARGES_RELEASE = " SELECT {apcr.pk}  from { AccoInventoryGrid as aig JOIN AccoInventoryDefinition as aid ON {aid.pk} = {aig.accoInventoryDefinition} JOIN OverBookingLimit as obl ON {obl.accoSupplierAdvanceDefinition} = {aid.supplierAdvanceDefinition} JOIN AccoPenaltyChargesRelease as apcr ON {apcr.accoSupplierAdvanceDefinition} ={aid.supplierAdvanceDefinition} JOIN RoomingListCutOffs as rlco ON {rlco.accoSupplierAdvanceDefinition} = {aid.supplierAdvanceDefinition} } WHERE {apcr.roomCategory} =?roomCategory and {apcr.roomType} =?roomtype";
	
	
	@Override
	public AccoInventoryDefinitionModel findInventoryDefination(String supplier , String code){
		
		List<AccoInventoryDefinitionModel> inventoryDefination = null;
		AccoInventoryDefinitionModel accoInventoryDefinitionModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ACCO_INVENTORY_DEFINATION);
		flexibleSearchQuery.addQueryParameter("supplier",supplier);
		flexibleSearchQuery.addQueryParameter("code",code);
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AccoInventoryDefinitionModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			inventoryDefination =searchResult.getResult();
			if(!inventoryDefination.isEmpty())
			{
				accoInventoryDefinitionModel = inventoryDefination.get(0);
			}
			
		}catch(Exception e){
			LOG.info("Error occured while fetching Inventory Defination Information" + e.getMessage(),e);
		}finally{
			searchRestrictionService.enableSearchRestrictions();
		}	
		
		return accoInventoryDefinitionModel ;
	}
	
	
	@Override
	public AccoInventoryGridModel findInventoryGrid(){
		
		List<AccoInventoryGridModel> inventoryGrids = null;
		AccoInventoryGridModel accoInventoryGridModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(INVENTORY_GRID);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AccoInventoryGridModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			inventoryGrids =searchResult.getResult();
			if(!inventoryGrids.isEmpty())
			{
				accoInventoryGridModel =  inventoryGrids.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while fetching Inventory Grid Information" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return accoInventoryGridModel  ;
	}
	

	@Override
	public AccoInventoryDetailModel findInventroyDetail(String productCode, String cityIso,
			InventoryType inventoryType) {
			
		List<AccoInventoryDetailModel> inventoryDetails = null;
		AccoInventoryDetailModel accoInventoryDetailModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(INVENTORY_DETAIL);
		flexibleSearchQuery.addQueryParameter("productCode",productCode);
		flexibleSearchQuery.addQueryParameter("cityIso",cityIso);
		flexibleSearchQuery.addQueryParameter("inventoryType",inventoryType);
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AccoInventoryDetailModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			inventoryDetails =searchResult.getResult();
			if(!inventoryDetails.isEmpty())
			{
				accoInventoryDetailModel = inventoryDetails.get(0);
			}
			
		}catch(Exception e){
			LOG.info("Error occured while fetching Inventory Detail Information" + e.getMessage(),e);
		}finally{
			searchRestrictionService.enableSearchRestrictions();
		}	
		return accoInventoryDetailModel  ;
	}
	
	@Override
	public InventoryRoomInfoModel findInventryRoomInfo(String productCode, String cityIso, RoomCategory roomCategory , RoomType roomType){
		
		List<InventoryRoomInfoModel> inventoryRoomInfo = null;
		InventoryRoomInfoModel inventoryRoomInfoModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(INVENTORY_ROOM_INFO);
		flexibleSearchQuery.addQueryParameter("productCode",productCode);
		flexibleSearchQuery.addQueryParameter("cityIso",cityIso);
		flexibleSearchQuery.addQueryParameter("roomCategory",roomCategory);
		flexibleSearchQuery.addQueryParameter("roomType",roomType);
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<InventoryRoomInfoModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			inventoryRoomInfo =searchResult.getResult();
			if(!inventoryRoomInfo.isEmpty())
			{
				inventoryRoomInfoModel = inventoryRoomInfo.get(0);
			}
			
		}catch(Exception e){
			LOG.info("Error occured while fetching Inventory Room Information" + e.getMessage(),e);
		}finally{
			searchRestrictionService.enableSearchRestrictions();
		}	
		return inventoryRoomInfoModel;
	}
	
	
	@Override
	public AccoSupplierAdvanceDefinitionModel findSupplierAdvanceDefination(String supplier , RoomCategory roomCategory , RoomType roomType){
		
		List<AccoSupplierAdvanceDefinitionModel> supplierAdvanceDefination = null;
		AccoSupplierAdvanceDefinitionModel accoSupplierAdvanceDefinitionModel= null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(SUPPLIER_ADVANCE_DEFINATION);
		flexibleSearchQuery.addQueryParameter("supplier",supplier);
		flexibleSearchQuery.addQueryParameter("roomCategory",roomCategory);
		flexibleSearchQuery.addQueryParameter("roomType",roomType);
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AccoSupplierAdvanceDefinitionModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			supplierAdvanceDefination =searchResult.getResult();
			if(!supplierAdvanceDefination.isEmpty())
			{
				accoSupplierAdvanceDefinitionModel = supplierAdvanceDefination.get(0);
			}
			
		}catch(Exception e){
			LOG.info("Error occured while fetching Supplier Advance Defination Information" + e.getMessage(),e);
		}finally{
			searchRestrictionService.enableSearchRestrictions();
		}
		return accoSupplierAdvanceDefinitionModel ;
	}
	
	@Override
	public AccoPenaltyChargesReleaseModel findPenaltychargesRelease(String supplier, RoomCategory roomCategory,
			RoomType roomType) {
		
		List<AccoPenaltyChargesReleaseModel> penaltychargesRelease = null;
		AccoPenaltyChargesReleaseModel accoPenaltyChargesReleaseModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(PENALTY_CHARGES_RELEASE);
		flexibleSearchQuery.addQueryParameter("supplier",supplier);
		flexibleSearchQuery.addQueryParameter("roomCategory",roomCategory);
		flexibleSearchQuery.addQueryParameter("roomType",roomType);
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AccoPenaltyChargesReleaseModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			penaltychargesRelease =searchResult.getResult();
			if(!penaltychargesRelease.isEmpty())
			{
				accoPenaltyChargesReleaseModel = penaltychargesRelease.get(0);
			}
		}catch(Exception e){
			LOG.info("Error occured while fetching Penalty charges Release Information" + e.getMessage(),e);
		}finally{
			searchRestrictionService.enableSearchRestrictions();
		}
		return accoPenaltyChargesReleaseModel ;
	}
}