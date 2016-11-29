package com.cnk.travelogix.supplier.updaterate.service.impl;

import java.util.List;

import com.cnk.travelogix.datamodel.supplier.rates.ancillarydiscount.model.AncillaryDiscountModel;
import com.cnk.travelogix.datamodel.supplier.rates.ancillaryfOC.model.AncillaryFOCModel;
import com.cnk.travelogix.datamodel.supplier.rates.ancillaryofferrate.model.AncillaryOfferRateModel;
import com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.model.AncillaryRateDefinitionModel;
import com.cnk.travelogix.datamodel.supplier.rates.complimentary.model.ComplimentaryModel;
import com.cnk.travelogix.datamodel.supplier.rates.dateRange.model.DateRangeRestrictionModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountlongstay.model.DiscountLongStayModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountonfreenight.model.DiscountOnFreeNightModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountonnight.model.DiscountOnNightModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountonpax.model.DiscountOnPaxModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountonrate.model.DiscountOnRateModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountonroomorcabin.model.DiscountOnRoomOrCabinModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountperage.model.DiscountPerAgeModel;
import com.cnk.travelogix.datamodel.supplier.rates.fOCoffer.model.FOCOfferModel;
import com.cnk.travelogix.datamodel.supplier.rates.offerrateproduct.model.OfferRateProductModel;
import com.cnk.travelogix.datamodel.supplier.rates.roomorcabinupgrade.model.RoomOrCabinUpgradeModel;
import com.cnk.travelogix.masterdata.core.model.TravelogixPolicyModel;
import com.cnk.travelogix.masterdata.core.products.model.FareComponentModel;
import com.cnk.travelogix.supplier.masters.core.enums.SeasonType;
import com.cnk.travelogix.supplier.rates.model.supplierrates.accommodation.AccommodationRateDefinitionModel;
import com.cnk.travelogix.supplier.rates.model.supplierrates.accommodation.AccommodationSupplierRateModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.accommodation.AccoRateDetailDefinitionModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.accommodation.AccoSurchargeSuppDetailModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.accommodation.CommonRateAdvDefinitionModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.ancillary.CommonAncillaryRateDetailModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.AgeDetailModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.ChildAgeDetailModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.CompanyRateInvRestrictionModel;
//import com.cnk.travelogix.supplier.rates.supplierrate.model.common.FullPrePaymentModel;
//import com.cnk.travelogix.supplier.rates.supplierrate.model.common.PartPrePaymentModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.PassengerLevelSurchargeDetailModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.RoomTypeRateModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.SeasonDetailModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.SupplierAncillaryRateModel;

import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.order.price.TaxModel;

public interface UpdateRateService {
	
	
	
	 
	AccoSurchargeSuppDetailModel fetchAccoSurChargeDetail(String productId,String code,int noOfRooms ,String minNights);
	 
	
	
    List<DateRangeRestrictionModel> fetchDateRangeRestriction(String productId,String code,String noOfRooms ,String surchargeId);
    
    List<CompanyRateInvRestrictionModel> fetchCompanyRateInvRestriction();
    
    List<MediaModel> fetchAccoSuplRate2Media();
    
    SeasonDetailModel fetchSeasonDetail2AbsSuppRate(String product,String market,String seasonality);
    
   /* PartPrePaymentModel fetchPartPrePayment(String productId, String code, int noOfRooms,
			Double payablePercentage);
*/
	List<FareComponentModel> fetchFareComponent();
	 
    List<RoomTypeRateModel> fetchRoomTypeRate();
    
    
    List<ChildAgeDetailModel> fetchChildAgeDetail();
    
    List<AgeDetailModel> fetchAgeDetail();
   
  
    
    SupplierAncillaryRateModel fetchSupplierAncillaryRate();
    
    List<AncillaryRateDefinitionModel> fetchAncillaryRateDefinition();
    
    List<CommonAncillaryRateDetailModel> fetchCommonAncillaryRateDetail();
    
    List<SeasonDetailModel> fetchSeasonDetails();
    
    List<MediaModel> fetchMediaDetails();
    
    List<TravelogixPolicyModel> fetchTravelLogixPolicy();
    
    List<CommonRateAdvDefinitionModel> fetchCommonAdvDefinition();
	
	
  AccommodationRateDefinitionModel fetchAccommodationRateDefinition(String product, String market,
			int noOfRooms);

	 AccommodationSupplierRateModel fetchAccommodationSupplierRate(String product, String market);

	 TaxModel fetchTaxRow(String product, String market, Double taxValue);

	AccoRateDetailDefinitionModel fetchAccoRateDetailDefinition(String product, String market, int noOfRooms,
			 int minNights);

	//FullPrePaymentModel fetchFullPrePayment(String product, String market, int noOfRooms, Double payablePercentage);

	PassengerLevelSurchargeDetailModel fetchPassengerLevelSurChargeDetail(String product, String market,
			int noOfRooms, String surchargeId, Double amount);



	DiscountPerAgeModel fetchDiscountPerAgeDetail(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	DiscountLongStayModel fetchDiscountLongStay(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	ComplimentaryModel fetchComplimentary(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	FOCOfferModel fetchFocOffer(String product, String market, int noOfRooms, int minNights, Double discountValue);



	AncillaryFOCModel fetchAncillaryFOC(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	AncillaryDiscountModel fetchAncillaryDiscount(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	DiscountOnRateModel fetchDiscountOnRate(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	DiscountOnNightModel fetchDiscountOnNight(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	DiscountOnFreeNightModel fetchDiscountOnFreeNight(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	DiscountOnRoomOrCabinModel fetchDiscountOnRoom(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	DiscountOnPaxModel fetchDiscountOnPax(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	RoomOrCabinUpgradeModel fetchRoomOrCabinUpgrade(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	AncillaryOfferRateModel fetchAncillaryOfferRate(String product, String market, int noOfRooms, int minNights,
			Double discountValue);



	OfferRateProductModel fetchOfferRateProduct(String product, String market, int noOfRooms, int minNights,
			Double discountValue);
    
 	

}
