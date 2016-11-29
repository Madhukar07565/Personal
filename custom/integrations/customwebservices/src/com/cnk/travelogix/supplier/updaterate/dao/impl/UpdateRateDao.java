package com.cnk.travelogix.supplier.updaterate.dao.impl;

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

public interface UpdateRateDao {

	AccoSurchargeSuppDetailModel getAccoSurChargeDetail(String productId, String code, int noOfRooms,
			String surchargeId);

	List<DateRangeRestrictionModel> getDateRangeRestriction(String productId, String code, String noOfRooms,
			String surchargeId);
	 List<MediaModel> getAccoSuplRate2Media();
	List<CompanyRateInvRestrictionModel> getCompanyRateInvRestriction();

	//List<FareComponentModel> fetchFareComponent();

	//List<RoomTypeRateModel> fetchRoomTypeRate();

	//List<ChildAgeDetailModel> fetchChildAgeDetail();

	SeasonDetailModel getSeasonDetail2AbsSuppRate(String product, String market, String seasonality);

	List<FareComponentModel> getFareComponent();

	List<RoomTypeRateModel> getRoomTypeRate();

	List<ChildAgeDetailModel> getChildAgeDetail();

	List<AgeDetailModel> getAgeDetail();

	SupplierAncillaryRateModel getSupplierAncillaryRate();

	List<AncillaryRateDefinitionModel> getAncillaryRateDefinition();

	List<CommonAncillaryRateDetailModel> getCommonAncillaryRateDetail();

	List<SeasonDetailModel> getSeasonDetails();

	List<MediaModel> getMediaDetails();

	List<TravelogixPolicyModel> getTravelLogixPolicy();

	List<CommonRateAdvDefinitionModel> getCommonAdvDefinition();

	RoomOrCabinUpgradeModel getRoomOrCabinUpgrade(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	DiscountOnPaxModel getDiscountOnPax(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	DiscountOnRoomOrCabinModel getDiscountOnRoom(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	DiscountOnFreeNightModel getDiscountOnFreeNight(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	DiscountOnNightModel getDiscountOnNight(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	DiscountOnRateModel getDiscountOnRate(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	AncillaryDiscountModel getAncillaryDiscount(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	AncillaryFOCModel getAncillaryFOC(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	AccommodationSupplierRateModel getAccommodationSupplierRate(String product, String market);

	AccommodationRateDefinitionModel getAccommodationRateDefinition(String product, String market, int noOfRooms);

	TaxModel getTaxRow(String product, String market, Double taxValue);

	AccoRateDetailDefinitionModel getAccoRateDetailDefinition(String product, String market, int noOfRooms,
			int minNights);

//	PartPrePaymentModel getPartPrePayment(String product, String market, int noOfRooms, Double payablePercentage);
//
//	FullPrePaymentModel getFullPrePayment(String product, String market, int noOfRooms, Double payablePercentage);

	PassengerLevelSurchargeDetailModel getPassengerLevelSurChargeDetail(String product, String market, int noOfRooms,
			String surchargeId, Double amount);

	DiscountPerAgeModel getDiscountPerAgeDetail(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	DiscountLongStayModel getDiscountLongStay(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	ComplimentaryModel getComplimentary(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	FOCOfferModel getFocOffer(String product, String market, int noOfRooms, int minNights, Double discountValue);

	OfferRateProductModel getOfferRateProduct(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

	AncillaryOfferRateModel getAncillaryOfferRate(String product, String market, int noOfRooms, int minNights,
			Double discountValue);

}
