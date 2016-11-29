package com.cnk.travelogix.supplier.updaterate.service.impl;

import java.util.List;

import javax.annotation.Resource;

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
import com.cnk.travelogix.supplier.updaterate.dao.impl.UpdateRateDao;

import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.order.price.TaxModel;
import de.hybris.platform.europe1.model.TaxRowModel;
import de.hybris.platform.servicelayer.model.ModelService;

public class DefaultUpdateRateService implements UpdateRateService {

	@Resource(name = "defaultUpdateRateDao")
	UpdateRateDao updateRateDao;

	@Resource(name = "modelService")
	ModelService modelService;

	@Override
	public AccommodationSupplierRateModel fetchAccommodationSupplierRate(String product ,String market) {
		AccommodationSupplierRateModel accommodationSupplierRate ;
		accommodationSupplierRate = updateRateDao.getAccommodationSupplierRate(product,market);
		return accommodationSupplierRate;

	}

	@Override
	public AccommodationRateDefinitionModel fetchAccommodationRateDefinition(String product,
			String market ,int noOfRooms) {
		AccommodationRateDefinitionModel accommodationRateDefinitionModel ;
		accommodationRateDefinitionModel = updateRateDao.getAccommodationRateDefinition(product,market ,noOfRooms);
		return accommodationRateDefinitionModel;
		
	}
	
	@Override
	public TaxModel fetchTaxRow(String product,
			String market ,Double taxValue ) {
		TaxModel taxModel ;
		taxModel = updateRateDao.getTaxRow( product,
				 market , taxValue );
		return taxModel;
		
	}

	@Override
	public AccoRateDetailDefinitionModel fetchAccoRateDetailDefinition(String product, String market,int noOfRooms  , int  minNights) {

		AccoRateDetailDefinitionModel accoRateDetailDefinitionModel ;

		accoRateDetailDefinitionModel = updateRateDao.getAccoRateDetailDefinition(product, market ,noOfRooms ,minNights);
		return accoRateDetailDefinitionModel;

	}
	


	@Override
	public AccoSurchargeSuppDetailModel fetchAccoSurChargeDetail(String productId, String code, int noOfRooms,
			String surchargeId) {
		AccoSurchargeSuppDetailModel accoSurchargeSuppDetail ;

		accoSurchargeSuppDetail = updateRateDao.getAccoSurChargeDetail(productId, code, noOfRooms, surchargeId);

		
			return accoSurchargeSuppDetail;
	
	}

	@Override
	public PassengerLevelSurchargeDetailModel fetchPassengerLevelSurChargeDetail(String product,String market,int noOfRooms ,String surchargeId,Double amount) {

		PassengerLevelSurchargeDetailModel passengerSurchargeSuppDetailModel ;

		passengerSurchargeSuppDetailModel = updateRateDao.getPassengerLevelSurChargeDetail(product, market, noOfRooms,surchargeId,amount
				);
		
			return passengerSurchargeSuppDetailModel;
		

		
	}

	@Override
	public List<DateRangeRestrictionModel> fetchDateRangeRestriction(String productId, String code, String noOfRooms,
			String surchargeId) {

		List<DateRangeRestrictionModel> dateRangeRestrictionList ;

		dateRangeRestrictionList = updateRateDao.getDateRangeRestriction(productId, code, noOfRooms, surchargeId);
		if (dateRangeRestrictionList != null) {
			return dateRangeRestrictionList;
		}

		return  modelService.create(DateRangeRestrictionModel.class);
	}

	@Override
	public List<CompanyRateInvRestrictionModel> fetchCompanyRateInvRestriction()

	{
		List<CompanyRateInvRestrictionModel> companyInvRestrictionList ;

		companyInvRestrictionList = updateRateDao.getCompanyRateInvRestriction();
		if (companyInvRestrictionList != null) {
			return companyInvRestrictionList;
		}

		return  modelService.create(CompanyRateInvRestrictionModel.class);
	}
	
	@Override
	public List<MediaModel> fetchAccoSuplRate2Media()
	
	{
		List<MediaModel> mediaList ;
		
		mediaList = updateRateDao.getAccoSuplRate2Media();
		if (mediaList != null) {
			return mediaList;
		}

		return modelService.create(MediaModel.class);
		
	}
	
	@Override
	public SeasonDetailModel fetchSeasonDetail2AbsSuppRate(String product,String market,String seasonality)
	{
		SeasonDetailModel seasonDetail ;
		seasonDetail = updateRateDao.getSeasonDetail2AbsSuppRate(product, market, seasonality);
		return seasonDetail;
			
	}

//	@Override
//	public PartPrePaymentModel fetchPartPrePayment(String product, String market, int noOfRooms,
//			Double payablePercentage) {
//		
//		PartPrePaymentModel partPrePaymentModel ;
//		
//		partPrePaymentModel = updateRateDao.getPartPrePayment(product, market, noOfRooms, payablePercentage);
//		return partPrePaymentModel;
//			
//	}
//
//	@Override
//	public FullPrePaymentModel fetchFullPrePayment(String product, String market, int noOfRooms,
//			Double payablePercentage) {
//		FullPrePaymentModel fullPrePaymentList ;
//		
//		fullPrePaymentList = updateRateDao.getFullPrePayment(product, market, noOfRooms, payablePercentage);
//	    return fullPrePaymentList;
//		
//
//	}

	@Override
	public List<FareComponentModel> fetchFareComponent() {
		
		List<FareComponentModel> fareComponentList ;
		//fareComponentList = updateRateDao.fetchFareComponent();
		
		/*if (fareComponentList != null) {
			return fareComponentList;
		}
*/
		return  modelService.create(FareComponentModel.class);
	}

	@Override
	public List<RoomTypeRateModel> fetchRoomTypeRate() {
		List<RoomTypeRateModel> roomTypeRateList ;
		roomTypeRateList = updateRateDao.getRoomTypeRate();
		
		if (roomTypeRateList != null) {
			return roomTypeRateList;
		}

		return  modelService.create(RoomTypeRateModel.class);
	}

	@Override
	public List<ChildAgeDetailModel> fetchChildAgeDetail() {
		
		List<ChildAgeDetailModel> childAgeDetailList ;
		childAgeDetailList = updateRateDao.getChildAgeDetail();
		
		if (childAgeDetailList != null) {
			return childAgeDetailList;
		}

		return modelService.create(ChildAgeDetailModel.class);
		
	}

	@Override
	public List<AgeDetailModel> fetchAgeDetail() {
		
		List<AgeDetailModel> ageDetailList ;
		ageDetailList = updateRateDao.getAgeDetail();
		
		if (ageDetailList != null) {
			return ageDetailList;
		}

		return  modelService.create(AgeDetailModel.class);
		
	}

	@Override
	public DiscountPerAgeModel fetchDiscountPerAgeDetail(String product, String market,int noOfRooms,int  minNights,Double discountValue){
		DiscountPerAgeModel discountPerAgeModel ;
		discountPerAgeModel = updateRateDao.getDiscountPerAgeDetail(product, market, noOfRooms, minNights, discountValue);
	    return discountPerAgeModel;
		
	}

	@Override
	public DiscountLongStayModel fetchDiscountLongStay(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		DiscountLongStayModel discountLongStayList ;
		discountLongStayList = updateRateDao.getDiscountLongStay(product, market, noOfRooms, minNights, discountValue);
		
		
			return discountLongStayList;
		

		
	}

	@Override
	public ComplimentaryModel fetchComplimentary(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		ComplimentaryModel complimentaryList ;
		complimentaryList = updateRateDao.getComplimentary(product, market, noOfRooms, minNights, discountValue);
		return complimentaryList;
		
	}

	@Override
	public FOCOfferModel fetchFocOffer(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		FOCOfferModel focOfferList ;
		focOfferList = updateRateDao.getFocOffer(product, market, noOfRooms, minNights, discountValue);
			return focOfferList;
		
	}

	@Override
	public AncillaryFOCModel fetchAncillaryFOC(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		AncillaryFOCModel ancillaryFocOfferList;
		ancillaryFocOfferList = updateRateDao.getAncillaryFOC(product, market, noOfRooms, minNights, discountValue);
			return ancillaryFocOfferList;
		
	}

	@Override
	public AncillaryDiscountModel fetchAncillaryDiscount(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		AncillaryDiscountModel ancillaryDiscountList ;
		ancillaryDiscountList = updateRateDao.getAncillaryDiscount(product, market, noOfRooms, minNights, discountValue);
			return ancillaryDiscountList;
		
	}

	@Override
	public DiscountOnRateModel fetchDiscountOnRate(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		DiscountOnRateModel discountRateList ;
		discountRateList = updateRateDao.getDiscountOnRate(product, market, noOfRooms, minNights, discountValue);
		return discountRateList;
		
	}

	@Override
	public DiscountOnNightModel fetchDiscountOnNight(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		DiscountOnNightModel discountOnNightList ;
		discountOnNightList = updateRateDao.getDiscountOnNight(product, market, noOfRooms, minNights, discountValue);
			return discountOnNightList;
		
	}

	@Override
	public DiscountOnFreeNightModel fetchDiscountOnFreeNight(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		DiscountOnFreeNightModel  discountOnFreeNightList;
		discountOnFreeNightList = updateRateDao.getDiscountOnFreeNight(product, market, noOfRooms, minNights, discountValue);
			return discountOnFreeNightList;
	
	}

	@Override
	public DiscountOnRoomOrCabinModel fetchDiscountOnRoom(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		DiscountOnRoomOrCabinModel discountOnRoomOrCabinList ;
		discountOnRoomOrCabinList = updateRateDao.getDiscountOnRoom(product, market, noOfRooms, minNights, discountValue);
			return discountOnRoomOrCabinList;
		
	}

	@Override
	public DiscountOnPaxModel fetchDiscountOnPax(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		DiscountOnPaxModel discountOnPaxList ;
		discountOnPaxList = updateRateDao.getDiscountOnPax(product, market, noOfRooms, minNights, discountValue);
			return discountOnPaxList;
	
	}

	@Override
	public RoomOrCabinUpgradeModel fetchRoomOrCabinUpgrade(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		RoomOrCabinUpgradeModel roomOrCabinUpgradeList ;
		roomOrCabinUpgradeList = updateRateDao.getRoomOrCabinUpgrade(product, market, noOfRooms, minNights, discountValue);
			return roomOrCabinUpgradeList;
	
	}

	@Override
	public AncillaryOfferRateModel fetchAncillaryOfferRate(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		AncillaryOfferRateModel ancillaryOfferRateList ;
		ancillaryOfferRateList = updateRateDao.getAncillaryOfferRate(product, market, noOfRooms, minNights, discountValue);
		return ancillaryOfferRateList;
		
	}

	@Override
	public OfferRateProductModel fetchOfferRateProduct(String product, String market,int noOfRooms,int  minNights,Double discountValue) {
		OfferRateProductModel offerRateProductList ;
		offerRateProductList = updateRateDao.getOfferRateProduct(product, market, noOfRooms, minNights, discountValue);
		return offerRateProductList;
	}

	@Override
	public SupplierAncillaryRateModel fetchSupplierAncillaryRate() {
		SupplierAncillaryRateModel supplierAncillaryList ;
		supplierAncillaryList = updateRateDao.getSupplierAncillaryRate();
			return supplierAncillaryList;
		}
	
	@Override
	public List<AncillaryRateDefinitionModel> fetchAncillaryRateDefinition()
	{
		List<AncillaryRateDefinitionModel> ancillaryRateDefinitionList;
		ancillaryRateDefinitionList = updateRateDao.getAncillaryRateDefinition();
		
		if (ancillaryRateDefinitionList != null) {
			return ancillaryRateDefinitionList;
		}

		return  modelService.create(AncillaryRateDefinitionModel.class);
	}
	
	@Override
	public List<CommonAncillaryRateDetailModel> fetchCommonAncillaryRateDetail()
	
	{
		List<CommonAncillaryRateDetailModel> commonAncillaryRateDetail ;
		commonAncillaryRateDetail = updateRateDao.getCommonAncillaryRateDetail();
		
		if (commonAncillaryRateDetail != null) {
			return commonAncillaryRateDetail;
		}

		return  modelService.create(CommonAncillaryRateDetailModel.class);
		
	}

	@Override
	public List<SeasonDetailModel> fetchSeasonDetails() {
		List<SeasonDetailModel> seasonDetailList ;
		seasonDetailList = updateRateDao.getSeasonDetails();
		
		if (seasonDetailList != null) {
			return seasonDetailList;
		}

		return  modelService.create(SeasonDetailModel.class);
	}

	@Override
	public List<MediaModel> fetchMediaDetails() {
		List<MediaModel> mediaModelList ;
		mediaModelList = updateRateDao.getMediaDetails();
		
		if (mediaModelList != null) {
			return mediaModelList;
		}

		return  modelService.create(MediaModel.class);
	}

	@Override
	public List<TravelogixPolicyModel> fetchTravelLogixPolicy() {
		List<TravelogixPolicyModel> travelLogixPolicyList ;
		travelLogixPolicyList = updateRateDao.getTravelLogixPolicy();
		
		if (travelLogixPolicyList != null) {
			return travelLogixPolicyList;
		}

		return modelService.create(TravelogixPolicyModel.class);
	}

	@Override
	public List<CommonRateAdvDefinitionModel> fetchCommonAdvDefinition() {
		List<CommonRateAdvDefinitionModel> commonRateAdvDef ;
		commonRateAdvDef = updateRateDao.getCommonAdvDefinition();
		
		if (commonRateAdvDef != null) {
			return commonRateAdvDef;
		}

		return modelService.create(CommonRateAdvDefinitionModel.class);
	}

	

	
	
	
	
	

}
