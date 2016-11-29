package com.cnk.travelogix.supplier.accommodation.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.product.common.core.model.AccommodationModel;
import com.cnk.travelogix.supplier.accommodation.dao.AccommodationSearchDao;

import de.hybris.platform.commerceservices.search.flexiblesearch.PagedFlexibleSearchService;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.search.restriction.SearchRestrictionService;

public class AccommodationSearchDaoImpl implements AccommodationSearchDao{
 
	private static final Logger LOG = Logger.getLogger(AccommodationSearchDaoImpl.class);
	
	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;
	
	@Resource(name = "pagedFlexibleSearchService")
	private PagedFlexibleSearchService pagedFlexibleSearchService;

	@Override
	public SearchPageData<AccommodationModel> searchAccommodation(PageableData pageableData) {
		
		LOG.info("Search All Protections executed and executing the query ");
		SearchPageData<AccommodationModel> accommodations = new SearchPageData<>();
		try{
			searchRestrictionService.disableSearchRestrictions();
			final Map<String, Object> params = new HashMap<>();

			final StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("SELECT {aid.pk} FROM { AccoInventoryGrid as aig JOIN AccoInventoryDefinition as aidf");
			stringBuilder.append("ON {aidf.pk} = {aig.accoInventoryDefinition} JOIN Supplier as sup ON {sup.pk} = {aidf.supplier} JOIN AccoInventoryDetail AS aid");
			stringBuilder.append("ON {aid.accoInventoryGrid} = {aig.PK} JOIN City as cit ON {cit.PK} = {aid.city} JOIN InventoryRoomInfo as iri ON {iri.accoInventoryDetail} = {aid.pk}");
			stringBuilder.append("JOIN Accommodation as acco ON {acco.pk} = {aid.product} JOIN RoomPaxOccupancy as rpo ON {rpo.accommodation} = {acco.pk} JOIN AccommodationSupplierRate as asr");
			stringBuilder.append("ON {asr.supplier}={sup.pk} JOIN AccommodationRateDefinition as ard  ON  {ard.absSupplierRate}={asr.pk}");
			stringBuilder.append("JOIN AccoRateDetailDefinition as ardd  ON {ardd.accoRateDef}={ard.pk} JOIN MealPlanType as mp ON {mp.pk} = {ardd.mealplan}");
			stringBuilder.append("JOIN RoomCategory as rc ON {rc.pk} = {ardd.roomCategory} JOIN RateCode  as rccode ON {rccode.pk} = {ard.supplierRateCode}");
			stringBuilder.append("} WHERE {sup.code} =?supplierId and {cit.isoCode} =?cityIso and {aid.arrivalDate} =?arrivaldate and {aid.departureDate} =?departureDate and");
			stringBuilder.append("{iri.noOfRoomRequested} =?roomRequested and {acco.hotelRating} =?hotelRating");
			stringBuilder.append("and {rpo.maxPaxWithExtraBed} =?maxPaxWithExtraBed and {iri.roomType} =?roomType and 	{iri.roomCategory} =?roomCategory AND {ard.noOfRooms} =?noOfRooms");
			stringBuilder.append("AND  {mp.code} =?mealPlan AND {rccode.code}=?rccode AND {ardd.checkInTime}=?checkInTime AND {ardd.checkOutTime}=?checkOutTime AND {ard.supplierRateCode}=?supplierRateCode");
						
			params.put("supplierId", "Taj Hotel");
			params.put("cityIso", "BDQ");
			params.put("arrivalDate", "2016-07-14");
			params.put("departuredate", "2016-07-30");
			params.put("roomRequested","10" );
			params.put("hotelRating", "8796125134939");
			params.put("maxPaxWithExtraBed","2" );
			params.put("roomType", "8796115796059");
			params.put("roomCategory", "8796115533915");
			params.put("noOfRooms", "5");
			params.put("mealPlan", "BB");
			params.put("rccode", "DELUXE");
			params.put("checkInTime", "12");
			params.put("checkOutTime", "11");
			params.put("supplierRateCode", "8796127546917");

			accommodations = pagedFlexibleSearchService.search(stringBuilder.toString(), params, pageableData);
		}
		catch (final Exception e){
			LOG.error("Error occured while searching protection " + e.getMessage(),e);
		}
		finally{
			searchRestrictionService.enableSearchRestrictions();
		}
		return accommodations;
	}
}
