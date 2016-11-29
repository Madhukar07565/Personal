package com.cnk.travelogix.supplier.updaterate.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

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
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

public class DefaultUpdateRateDao implements UpdateRateDao{
	
	private static final Logger LOG = Logger.getLogger(DefaultUpdateRateDao.class);

	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;
	
	public static final String  ACCOM_SUPPL_RATE = "select {asr:pk} from {AccommodationSupplierRate as asr} where ({asr:product}=?product) and ({asr:market}=?market)";
	
	public static final String  ACCOM_RATE_DEF  ="select {ard.pk} from { AccommodationRateDefinition as ard  join AccommodationSupplierRate as asr on {ard.absSupplierRate}={asr.pk} JOIN RateApplicabilityType as rat ON {ard.rateTypeApplicableFor} = {rat.pk} JOIN PriceApplicabilityType as pat ON {pat.pk} = {ard.priceApplicability} } where ({asr:product}=?product)  and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms) ";
	
	public static final String TAX_ROW = "select {tx.pk} from { AccommodationSupplierRate as asr JOIN Tax as tx ON {tx.supplierRate}={asr.pk} JOIN TaxRow as tr ON {tr.tax}={tx.pk} JOIN TaxRow2FareComponentRelation as trfcrel ON {trfcrel.source}={tr.pk} JOIN FareComponent as fcd ON {trfcrel.target}={fcd.pk}} where ({asr:product}=?product)  and ({asr:market}=?market) and  ({tx.value}=?taxValue) ";
	
	public static final String ACCOM_RATE_DETAIL_DEF = "select {ardd:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights)";
	
	public static final String ACCOM_SURCHARGE_DETAIL= "select {assd:pk} from  {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoSurchargeSuppDetail as assd on {assd.supplierRate}={ard.pk} JOIN SurchargeSupplementType as sst ON {assd.type} = {sst.pk} JOIN SupplementType as st ON {st.pk} = {assd.supplement}} where ({asr:product}=?product) and ({asr:code}=?code) and ({ard.noOfRooms}=?noOfRooms) and ({assd.surchargeId}=?surchargeId)";
	
	public static final String PASSENGER_SURCHARGE_DETAIL = "select {assd:pk} from { AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoSurchargeSuppDetail as assd on {assd.supplierRate}={ard.pk} JOIN PassengerLevelSurchargeDetail as plsd ON {plsd.surchargeSuppDetail} = {assd.pk}} where ({asr:product}=?product) and ({asr:code}=?code) and ({ard.noOfRooms}=?noOfRooms) and ({ardd.surchargeId}=?surchargeId) and ({plsd.amount}=?amount)";
	
	
	public static final String DATE_RANGE_RESTRICTION = "select {assd:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoSurchargeSuppDetail as assd on {assd.supplierRate}={ard.pk}   JOIN DateRangeRestriction as drr ON {drr.absSurchargeSuppDetail} = {assd.pk} } where ({asr:product}=?product) and ({asr:code}=?code) and ({ard.noOfRooms}=?noOfRooms)  and ({ardd.surchargeId}=?surchargeId)";
	
	
	public static final String CMPNY_INV_RATE_RES = "select {crir.pk} from {CompanyRateInvRestriction as crir join AccommodationSupplierRate as asr ON {crir.supplierRate} = {asr.pk}}";
	
	
	public static final String MED_SUPPL_RATE_REL = "select {asr.pk} from {AccommodationSupplierRate as asr JOIN AbsSupplierRate2MediaRel as asrmrel ON {asrmrel.source} = {asr.pk} JOIN Media as med ON {asrmrel.target} = {med.pk} }";
	
	
	public static final String SEASON_ABS_SUP_RATE ="select {sd.pk} from { SeasonDetail as sd  JOIN  AccommodationSupplierRate as asr ON {sd.supplierRate}={asr.pk} JOIN SeasonType as st ON {sd.seasonality} = {st.pk} JOIN DateRangeRestriction as drr ON {drr.seasonDetail} = {sd.pk}} where ({asr:product}=?product) and ({asr:market}=?market)   and ({sd:seasonality}=?seasonality)";
	
	public static final String  PART_PRE_PAYMENT = "select {rpd.pk} from { AccommodationRateDefinition as ard join AccommodationSupplierRate as asr on {ard.absSupplierRate}={asr.pk} JOIN PartPrePayment  as ppp ON {ppp.rateDefinition} = {ard.pk} JOIN RatePaymentDetail as rpd ON  {rpd.partPrePayment}={ppp.pk}} where ({asr:product}=?product)  and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms) and ({rpd:payablePercentage}=?payablePercentage)  ";
	
	
	public static final String  FULL_PRE_PAYMENT="select {rpd.pk} from { AccommodationRateDefinition as ard join AccommodationSupplierRate as asr on {ard.absSupplierRate}={asr.pk} JOIN FullPrePayment as fpp ON {fpp.rateDefinition} = {ard.pk}JOIN RatePaymentDetail as rpd ON {fpp.ratePaymentDetail} = {rpd.pk}}where ({asr:product}=?product)  and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms) and ({rpd:payablePercentage}=?payablePercentage)";
	
	public static final String FARE_COMPONENT = "select {ard.pk} from {AccommodationRateDefinition as ard join AccommodationSupplierRate as asr on {ard.absSupplierRate}={asr.pk} JOIN AbstractRateDefinition2FareComponentRelation as ardfcrel ON {ardfcrel.source} = {ard.pk} JOIN FareComponent as fcd ON {ardfcrel.target} = {fcd.pk} }";
	
	public static final String ROOM_TYPE= "select {ardd:pk} from{ AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk} JOIN RoomTypeRate as rtr ON {rtr.accoRateDetailDefinition} = {ardd.pk}} ";
	
	
	public static final String ACCO_DYNAMIC_POLICY= "select {ard.pk} from { AccommodationRateDefinition as ard join AccommodationSupplierRate as asr on {ard.absSupplierRate}={asr.pk} JOIN AccoRateDef2AccoDynamicPolicyRel as ardadprel ON {ardadprel.source} = {ard.pk} JOIN AccoDynamicPolicy as adp ON {ardadprel.target} = {adp.pk}}";
	
	public static final String CHILD_AGE_DETAIL= "select {ardd:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk} JOIN ChildAgeDetail as cad ON {cad.accoRateDetailDefinition} = {ardd.pk} } ";
	
	
	public static final String AGE_DETAIL = "select {ardd:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk} JOIN ChildAgeDetail as cad ON {cad.accoRateDetailDefinition} = {ardd.pk} JOIN AgeDetail  as ad ON {cad.ageDetail} = {ad.pk}} ";
	
	
	public static final String DISCOUNT_PER_AGE="select {dpa:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk}JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN DiscountPerAge as  dpa on {artsrel.target}={dpa.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({dpa:discountValue}=?discountValue) ";
	
	public static final String DISCOUNT_LONG_STAY="select {dls:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk}JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN DiscountLongStay as  dls on {artsrel.target}={dls.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({dls:discountValue}=?discountValue) ";
	
	public static final String COMPLIMENTARY = "select {comp:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk} JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN Complimentary as  comp on {artsrel.target}={comp.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({comp:discountValue}=?discountValue) ";
	
	public static final String FOC_OFFER= "select {foc:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk} JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN FOCOffer as  foc on {artsrel.target}={foc.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({foc:discountValue}=?discountValue)";
	
	public static final String ANC_FOC_OFFER="select {anfoc:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk}JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN AncillaryFOC as  anfoc on {artsrel.target}={anfoc.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({anfoc:discountValue}=?discountValue)";
	
	public static final String ANC_DISCOUNT ="select {asd:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk}JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN AncillaryDiscount as  asd on {artsrel.target}={asd.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({asd:discountValue}=?discountValue)";
	
	public static final String DISCOUNT_ON_RATE="select {dor:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk}JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN DiscountOnRate as  dor on {artsrel.target}={dor.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({dor:discountValue}=?discountValue)";
	
	
	public static final String DISCOUNT_ON_NIGHT= "select {don:pk},{ardd.minnights} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk} JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN DiscountOnNight as  don on {artsrel.target}={don.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({don:discountValue}=?discountValue) ";
	
	public static final String DISCOUNT_FREE_NIGHT="select {dofn:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk} JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN DiscountOnFreeNight as  dofn on {artsrel.target}={dofn.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({dofn:discountValue}=?discountValue) ";
	
	public static final String DISCOUNT_ON_ROOM_OR_CABIN="select {dorc:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk}JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN DiscountOnRoomOrCabin as  dorc on {artsrel.target}={dorc.pk}}where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({dorc:discountValue}=?discountValue) ";
	
	public static final String DISCOUNT_ON_PAX="select {dop:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk} JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN DiscountOnPax as  dopx on {artsrel.target}={dopx.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({dop:discountValue}=?discountValue)";
	
	public static final String ROOM_OR_CABIN_UPGRADE = "select {rcu:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk}JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN RoomOrCabinUpgrade as  rcu on {artsrel.target}={rcu.pk}} where ({asr:product}=?product) and ({asr:market}=?market) and  ({ard:noOfRooms}=?noOfRooms)  and ({ardd:minNights}=?minNights) and ({rcu:discountValue}=?discountValue)";
	
	
	public static final String  ANCIL_OFFER_RATE= "select {ardd:pk} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk} JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN RoomOrCabinUpgrade as  rcu on {artsrel.target}={rcu.pk}} ";
	
	public static final String  OFFER_RATE_PRODUCT= "select {ardd:pk},{ardd.minnights} from {AccommodationRateDefinition as ard JOIN AccommodationSupplierRate as asr on {ard:absSupplierRate}={asr:pk} JOIN  AccoRateDetailDefinition as ardd on {ardd.accoRateDef}={ard.pk}JOIN AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel as artsrel on {artsrel.source}={ardd.pk} JOIN OfferRateProduct as  orp on {artsrel.target}={orp.pk}} ";
	
	public static final String SUPPL_ANCILL_RATE= "select {sar.pk} from {AccommodationSupplierRate as asr JOIN SupplierAncillaryRate as sar ON {asr.ancillary} = {sar.pk}} ";
	
	
	public static final String  ANCL_RATE_DEF = "select {asr.pk} from { AccommodationSupplierRate as asr JOIN SupplierAncillaryRate as sar ON {asr.ancillary} = {sar.pk} JOIN AncillaryRateDefinition as ard ON {ard.supplierAncillaryRate}={sar.pk}} ";
	
	
	public static final String ANC_RATE_DETAIL= "select {asr.pk} from { AccommodationSupplierRate as asr  JOIN SupplierAncillaryRate as sar ON {asr.ancillary} = {sar.pk} JOIN AncillaryRateDefinition as ard ON {ard.supplierAncillaryRate}={sar.pk} JOIN CommonAncillaryRateDetail as card ON {card.ancillaryRateDefinition}={ard.pk}} ";
	
	
	public static final String SEASON_DETAIL = "select {asr.pk}from { AccommodationSupplierRate as asr JOIN SupplierAncillaryRate as sar ON {asr.ancillary} = {sar.pk} JOIN SeasonDetail as sd ON {sd.supplierAncillaryRate}= {sar.pk}} ";
	
	public static final String MEDIA_ANC_REL = "select {asr.pk} from { AccommodationSupplierRate as asr JOIN SupplierAncillaryRate as sar ON {asr.ancillary} = {sar.pk} JOIN SupplierAncRate2MediaRelation as sarmrel ON {sarmrel.source} = {sar.pk} JOIN Media as med ON {sarmrel.target} ={med.pk}} ";
	
	public static final String TRAVEL_LOGIX_POLICY= "select {asr.pk} from { AccommodationSupplierRate as asr JOIN SupplierAncillaryRate as sar ON {asr.ancillary} = {sar.pk} JOIN AncillaryRateDefinition as ard ON {ard.supplierAncillaryRate}={sar.pk} JOIN CommonAncillaryRateDetail as card ON {card.ancillaryRateDefinition}={ard.pk} JOIN AbstractAncillaryRateDetail2TravelogixPolicyRelation as aardtlprel ON {aardtlprel.source} = {card.pk} JOIN TravelogixPolicy as tlp ON {aardtlprel.target} ={tlp.pk} } ";
	
	
	public static final String COMM_RATE_ADV_DEF="select {asr.pk} from  { AccommodationSupplierRate as asr JOIN SupplierAncillaryRate as sar ON {asr.ancillary} = {sar.pk} JOIN AncillaryRateDefinition as ard ON {ard.supplierAncillaryRate}={sar.pk} JOIN CommonAncillaryRateDetail as card ON {card.ancillaryRateDefinition}={ard.pk} JOIN CommonRateAdvDefinition as crad ON {card.definition} = {crad.pk} } ";
	
	@Override
	public AccommodationSupplierRateModel getAccommodationSupplierRate(String product, String market){
		
	
	List<AccommodationSupplierRateModel> accommodationSupplierRateList  = null;
	AccommodationSupplierRateModel accommodationSupplierRateModel = null;
	final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ACCOM_SUPPL_RATE);
	flexibleSearchQuery.addQueryParameter("product", product);
	
	flexibleSearchQuery.addQueryParameter("market", market);
	
	LOG.info("Query :" + flexibleSearchQuery.getQuery());
	try{
		searchRestrictionService.disableSearchRestrictions();
		final SearchResult<AccommodationSupplierRateModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
		accommodationSupplierRateList=searchResult.getResult();
		if(!accommodationSupplierRateList.isEmpty())
		{
			accommodationSupplierRateModel =	accommodationSupplierRateList.get(0);
		}
			
	}catch(Exception e){	
		LOG.info("Error occured while geting Accommodation Supplier Rate Information" + e.getMessage(),e);
	}
	finally
	{
		searchRestrictionService.enableSearchRestrictions();
	}
	return accommodationSupplierRateModel ;

	}
	
	
	
	
	
	@Override
	public AccommodationRateDefinitionModel getAccommodationRateDefinition(String product,
			String market ,int noOfRooms){
		
		List<AccommodationRateDefinitionModel> accommodationRateDefinitionList  = null;
		AccommodationRateDefinitionModel accommodationRateDefinitionModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ACCOM_RATE_DEF);
		flexibleSearchQuery.addQueryParameter("product", product);
		
		flexibleSearchQuery.addQueryParameter("market", market);
		
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AccommodationRateDefinitionModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			accommodationRateDefinitionList=searchResult.getResult();
			if(!accommodationRateDefinitionList.isEmpty())
			{
				accommodationRateDefinitionModel = accommodationRateDefinitionList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Accommodation  Rate Definition" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return accommodationRateDefinitionModel;
		

		}
	
	
	@Override
	public TaxModel getTaxRow(String product,
			String market ,Double taxValue )
	{
		List<TaxModel> taxRowList  = null;
		TaxModel taxModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(TAX_ROW);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("taxValue", taxValue);
		
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<TaxModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			taxRowList=searchResult.getResult();
			if(!taxRowList.isEmpty())
			{
				taxModel = taxRowList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting tax row " + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return taxModel ;
		
		
		
	}
	
	@Override
     public AccoRateDetailDefinitionModel getAccoRateDetailDefinition(String product, String market,int noOfRooms,int  minNights){
		
		List<AccoRateDetailDefinitionModel> accoRateDetailDefinitionList  = null;
		AccoRateDetailDefinitionModel accoRateDetailDefinitionModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ACCOM_RATE_DETAIL_DEF);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AccoRateDetailDefinitionModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			accoRateDetailDefinitionList=searchResult.getResult();
			if(!accoRateDetailDefinitionList.isEmpty())
			{
				accoRateDetailDefinitionModel = accoRateDetailDefinitionList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Accommodation  Rate Detail Definition" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return accoRateDetailDefinitionModel;

		}
     
	 @Override
     public AccoSurchargeSuppDetailModel getAccoSurChargeDetail(String product,String code,int noOfRooms ,String surchargeId){
 		
 		List<AccoSurchargeSuppDetailModel> accoSurchargeDetailList  = null;
 		AccoSurchargeSuppDetailModel accoSurchargeSuppDetailModel = null;
 		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ACCOM_SURCHARGE_DETAIL);
 		flexibleSearchQuery.addQueryParameter("product", product);
 		flexibleSearchQuery.addQueryParameter("code", code);
 		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
 		flexibleSearchQuery.addQueryParameter("surchargeId", surchargeId);
 		
 		LOG.info("Query :" + flexibleSearchQuery.getQuery());
 		try{
 			searchRestrictionService.disableSearchRestrictions();
 			final SearchResult<AccoSurchargeSuppDetailModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
 			accoSurchargeDetailList=searchResult.getResult();
 			if(!accoSurchargeDetailList.isEmpty())
 			{
 				accoSurchargeSuppDetailModel = accoSurchargeDetailList.get(0);
 			}
 				
 		}catch(Exception e){	
 			LOG.info("Error occured while geting Accommodation Surcharge Supp Detail Definition" + e.getMessage(),e);
 		}
 		finally
 		{
 			searchRestrictionService.enableSearchRestrictions();
 		}
 		return accoSurchargeSuppDetailModel;

 		}
     
	 @Override  
     public PassengerLevelSurchargeDetailModel getPassengerLevelSurChargeDetail(String product,String market,int noOfRooms ,String surchargeId,Double amount){
  		
  		List<PassengerLevelSurchargeDetailModel> passengerSurchargeDetailList  = null;
  		
  		PassengerLevelSurchargeDetailModel passengerLevelSurchargeDetailModel = null;
  		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(PASSENGER_SURCHARGE_DETAIL);
  		flexibleSearchQuery.addQueryParameter("product", product);
  		flexibleSearchQuery.addQueryParameter("market", market);
  		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
  		flexibleSearchQuery.addQueryParameter("surchargeId", surchargeId);
  		flexibleSearchQuery.addQueryParameter("amount", amount);
  		
  		LOG.info("Query :" + flexibleSearchQuery.getQuery());
  		try{
  			searchRestrictionService.disableSearchRestrictions();
  			final SearchResult<PassengerLevelSurchargeDetailModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
  			passengerSurchargeDetailList=searchResult.getResult();
  			if(!passengerSurchargeDetailList.isEmpty())
  			{
  				passengerLevelSurchargeDetailModel = passengerSurchargeDetailList.get(0);
  			}
  				
  		}catch(Exception e){	
  			LOG.info("Error occured while geting passenger level Surcharge Supp Detail Definition" + e.getMessage(),e);
  		}
  		finally
  		{
  			searchRestrictionService.enableSearchRestrictions();
  		}
  		return passengerLevelSurchargeDetailModel ;

  		}
     
     
 					
 			
     @Override
public List<DateRangeRestrictionModel> getDateRangeRestriction(String product,String code,String noOfRooms ,String surchargeId){
     
     
	List<DateRangeRestrictionModel> dateRangeRestrictionList  = null;
	
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(DATE_RANGE_RESTRICTION);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("code", code);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
		flexibleSearchQuery.addQueryParameter("surchargeId", surchargeId);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<DateRangeRestrictionModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			dateRangeRestrictionList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Date Range Restriction" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return dateRangeRestrictionList;

		}



@Override
public List<CompanyRateInvRestrictionModel> getCompanyRateInvRestriction(){
    
    
	List<CompanyRateInvRestrictionModel> companyRateInvRestrictionList  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(CMPNY_INV_RATE_RES);
	
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<CompanyRateInvRestrictionModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			companyRateInvRestrictionList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting companyRaeteInventory Restriction " + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return companyRateInvRestrictionList;

		}

@Override
public List<MediaModel> getAccoSuplRate2Media(){
    
    
	List<MediaModel> mediaList  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(MED_SUPPL_RATE_REL);
	
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<MediaModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			mediaList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting AccoSuplRate2Media Rel" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return mediaList;

		}

@Override
public SeasonDetailModel getSeasonDetail2AbsSuppRate(String product,String market,String seasonality){
    
    
	List<SeasonDetailModel> seasonDetailList  = null;
	SeasonDetailModel seasonDetailModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(SEASON_ABS_SUP_RATE);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		
	    flexibleSearchQuery.addQueryParameter("seasonality", seasonality);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<SeasonDetailModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			seasonDetailList=searchResult.getResult();
			if(!seasonDetailList.isEmpty())
			{
				seasonDetailModel = seasonDetailList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting AccoSuplRate2Media Rel" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return seasonDetailModel;

		}

//@Override
//public PartPrePaymentModel getPartPrePayment(String product,
//		String market ,int noOfRooms,Double payablePercentage){
//    
//    
//	List<PartPrePaymentModel> partPrePaymentList  = null;
//	PartPrePaymentModel partPrePaymentModel = null;
//		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(PART_PRE_PAYMENT);
//		flexibleSearchQuery.addQueryParameter("product", product);
//		flexibleSearchQuery.addQueryParameter("market", market);
//		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
//		flexibleSearchQuery.addQueryParameter("payablePercentage", payablePercentage);
//		
//		LOG.info("Query :" + flexibleSearchQuery.getQuery());
//		try{
//			searchRestrictionService.disableSearchRestrictions();
//			final SearchResult<PartPrePaymentModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
//			partPrePaymentList=searchResult.getResult();
//			if(!partPrePaymentList.isEmpty())
//			{
//				partPrePaymentModel = partPrePaymentList.get(0);
//			}
//				
//		}catch(Exception e){	
//			LOG.info("Error occured while geting PartPrePaymentList " + e.getMessage(),e);
//		}
//		finally
//		{
//			searchRestrictionService.enableSearchRestrictions();
//		}
//		return partPrePaymentModel;
//
//		}
//@Override
//public FullPrePaymentModel getFullPrePayment(String product,
//		String market ,int noOfRooms,Double payablePercentage){
//    
//    
//	List<FullPrePaymentModel> fullPrePaymentList  = null;
//	FullPrePaymentModel fullPrePaymentModel = null;
//		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(FULL_PRE_PAYMENT);
//		flexibleSearchQuery.addQueryParameter("product", product);
//		flexibleSearchQuery.addQueryParameter("market", market);
//		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
//		flexibleSearchQuery.addQueryParameter("payablePercentage", payablePercentage);
//		
//		LOG.info("Query :" + flexibleSearchQuery.getQuery());
//		try{
//			searchRestrictionService.disableSearchRestrictions();
//			final SearchResult<FullPrePaymentModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
//			fullPrePaymentList=searchResult.getResult();
//			if(!fullPrePaymentList.isEmpty())
//			{
//				fullPrePaymentModel = fullPrePaymentList.get(0);
//			}
//				
//		}catch(Exception e){	
//			LOG.info("Error occured while geting FullPrePaymentList " + e.getMessage(),e);
//		}
//		finally
//		{
//			searchRestrictionService.enableSearchRestrictions();
//		}
//		return fullPrePaymentModel ;
//
//		}
//

@Override
public List<FareComponentModel> getFareComponent(){
    
    
	List<FareComponentModel> fareComponentList  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(FARE_COMPONENT);
	
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<FareComponentModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			fareComponentList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting fare component " + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return fareComponentList;

		}

@Override
public List<RoomTypeRateModel> getRoomTypeRate(){
    
    
	List<RoomTypeRateModel> roomTypeRateList  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ROOM_TYPE);
	
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<RoomTypeRateModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			roomTypeRateList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting RoomType Rate " + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return roomTypeRateList;

		}

@Override
public List<ChildAgeDetailModel> getChildAgeDetail(){
    
    
	List<ChildAgeDetailModel> childAgeDetailList  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(CHILD_AGE_DETAIL);
		
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<ChildAgeDetailModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			childAgeDetailList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting child age detail " + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return childAgeDetailList;

		}
@Override
public List<AgeDetailModel> getAgeDetail(){
    
    
	List<AgeDetailModel> ageDetailList  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(AGE_DETAIL);
	
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AgeDetailModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			ageDetailList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Age Detail" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return ageDetailList;

		}

@Override
public DiscountPerAgeModel getDiscountPerAgeDetail(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<DiscountPerAgeModel> discountPerAgeList  = null;
	DiscountPerAgeModel discountPerAgeModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(DISCOUNT_PER_AGE);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<DiscountPerAgeModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			discountPerAgeList=searchResult.getResult();
			if(!discountPerAgeList.isEmpty()){
				discountPerAgeModel = discountPerAgeList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Discount per  Age Detail" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return discountPerAgeModel ;

		}
@Override
public DiscountLongStayModel getDiscountLongStay(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<DiscountLongStayModel> discountLongStayList  = null;
	DiscountLongStayModel discountLongStayModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(DISCOUNT_LONG_STAY);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<DiscountLongStayModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			discountLongStayList=searchResult.getResult();
			if(!discountLongStayList.isEmpty())
			{
				discountLongStayModel = discountLongStayList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting discount Long Stay Detail" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return discountLongStayModel ;

		}

@Override
public ComplimentaryModel getComplimentary(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<ComplimentaryModel> complimentaryList  = null;
	ComplimentaryModel complimentaryModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(COMPLIMENTARY);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<ComplimentaryModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			complimentaryList=searchResult.getResult();
			if(!complimentaryList.isEmpty())
			{
				complimentaryModel = complimentaryList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting discount Long Stay Detail" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return complimentaryModel;
		}

@Override
public FOCOfferModel getFocOffer(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<FOCOfferModel> focOfferList  = null;
	FOCOfferModel fOCOfferModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(FOC_OFFER);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<FOCOfferModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			focOfferList=searchResult.getResult();
			if(!focOfferList.isEmpty() )
			{
				fOCOfferModel = focOfferList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Foc offer Detail" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return fOCOfferModel ;
		}

@Override
public AncillaryFOCModel getAncillaryFOC(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<AncillaryFOCModel> ancillaryFocOfferList  = null;
	AncillaryFOCModel  ancillaryFOCModel  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ANC_FOC_OFFER);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AncillaryFOCModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			ancillaryFocOfferList=searchResult.getResult();
			if(!ancillaryFocOfferList.isEmpty())
			{
				ancillaryFOCModel = ancillaryFocOfferList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Foc offer Detail" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return ancillaryFOCModel ;

		}


@Override
public AncillaryDiscountModel getAncillaryDiscount(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<AncillaryDiscountModel> ancillaryDiscountList  = null;
	AncillaryDiscountModel ancillaryDiscountModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ANC_DISCOUNT);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AncillaryDiscountModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			ancillaryDiscountList=searchResult.getResult();
			if(!ancillaryDiscountList.isEmpty())
			{
				ancillaryDiscountModel = ancillaryDiscountList.get(0) ;
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Foc offer Detail" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return ancillaryDiscountModel ;
		}



@Override
public DiscountOnRateModel getDiscountOnRate(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<DiscountOnRateModel> discountOnRateList  = null;
	DiscountOnRateModel discountOnRateModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(DISCOUNT_ON_RATE);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<DiscountOnRateModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			discountOnRateList=searchResult.getResult();
			if(!discountOnRateList.isEmpty())
			{
				discountOnRateModel = discountOnRateList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Foc offer Detail" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return discountOnRateModel ;

		}

@Override
public DiscountOnNightModel getDiscountOnNight(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<DiscountOnNightModel> discountOnNightList  = null;
	DiscountOnNightModel discountOnNightModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(DISCOUNT_ON_NIGHT);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<DiscountOnNightModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			discountOnNightList=searchResult.getResult();
			if(!discountOnNightList.isEmpty())
			{
				discountOnNightModel = discountOnNightList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Discount on Night" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return discountOnNightModel;

		}

@Override
public DiscountOnFreeNightModel getDiscountOnFreeNight(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<DiscountOnFreeNightModel> discountOnFreeNightList  = null;
	DiscountOnFreeNightModel discountOnFreeNightModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(DISCOUNT_FREE_NIGHT);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<DiscountOnFreeNightModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			discountOnFreeNightList=searchResult.getResult();
			if(!discountOnFreeNightList.isEmpty())
			{
				discountOnFreeNightModel = discountOnFreeNightList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Discount on Night" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return discountOnFreeNightModel;

		}

@Override
public DiscountOnRoomOrCabinModel getDiscountOnRoom(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<DiscountOnRoomOrCabinModel> discountOntRoomList  = null;
	DiscountOnRoomOrCabinModel discountOnRoomOrCabinModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(DISCOUNT_ON_ROOM_OR_CABIN);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<DiscountOnRoomOrCabinModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			discountOntRoomList=searchResult.getResult();
			if(!discountOntRoomList.isEmpty())
			{
				discountOnRoomOrCabinModel = discountOntRoomList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Discount on Night" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return discountOnRoomOrCabinModel ;

		}

@Override
public DiscountOnPaxModel getDiscountOnPax(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<DiscountOnPaxModel> discountOnPaxList  = null;
	DiscountOnPaxModel discountOnPaxModel  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(DISCOUNT_ON_PAX);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<DiscountOnPaxModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			discountOnPaxList=searchResult.getResult();
			if(!discountOnPaxList.isEmpty())
				
			{
				discountOnPaxModel = discountOnPaxList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Discount on Night" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return discountOnPaxModel ;

		}



@Override
public RoomOrCabinUpgradeModel getRoomOrCabinUpgrade(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<RoomOrCabinUpgradeModel> roomOrCabinUpgradeList  = null;
	RoomOrCabinUpgradeModel roomOrCabinUpgradeModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ROOM_OR_CABIN_UPGRADE);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<RoomOrCabinUpgradeModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			roomOrCabinUpgradeList=searchResult.getResult();
			if(!roomOrCabinUpgradeList.isEmpty())
			{
				roomOrCabinUpgradeModel = roomOrCabinUpgradeList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Room or Cabin Upgrade" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return roomOrCabinUpgradeModel ;

		}


@Override
public AncillaryOfferRateModel getAncillaryOfferRate(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<AncillaryOfferRateModel> ancillaryOfferRateList  = null;
	AncillaryOfferRateModel ancillaryOfferRateModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ANCIL_OFFER_RATE);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AncillaryOfferRateModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			ancillaryOfferRateList=searchResult.getResult();
			if(!ancillaryOfferRateList.isEmpty())
			{
				ancillaryOfferRateModel = ancillaryOfferRateList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Room or Cabin Upgrade" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return ancillaryOfferRateModel;

		}



@Override
public  OfferRateProductModel getOfferRateProduct(String product, String market,int noOfRooms,int  minNights,Double discountValue){
    
    
	List<OfferRateProductModel> offerRateProductList  = null;
	
	OfferRateProductModel offerRateProductModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(OFFER_RATE_PRODUCT);
		flexibleSearchQuery.addQueryParameter("product", product);
		flexibleSearchQuery.addQueryParameter("market", market);
		flexibleSearchQuery.addQueryParameter("noOfRooms", noOfRooms);
	    flexibleSearchQuery.addQueryParameter("minNights", minNights);
	    flexibleSearchQuery.addQueryParameter("discountValue", discountValue);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<OfferRateProductModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			offerRateProductList=searchResult.getResult();
			if(!offerRateProductList.isEmpty())
			{
				offerRateProductModel = offerRateProductList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Room or Cabin Upgrade" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return offerRateProductModel;

		}
	



@Override
public SupplierAncillaryRateModel getSupplierAncillaryRate(){
    
    
	List<SupplierAncillaryRateModel> supplierAncillaryRateList  = null;
	SupplierAncillaryRateModel supplierAncillaryRateModel = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(SUPPL_ANCILL_RATE);
	
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<SupplierAncillaryRateModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			supplierAncillaryRateList=searchResult.getResult();
			if(!supplierAncillaryRateList.isEmpty())
			{
				supplierAncillaryRateModel = supplierAncillaryRateList.get(0);
			}
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Room or Cabin Upgrade" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return supplierAncillaryRateModel ;

		}



@Override
public List<AncillaryRateDefinitionModel> getAncillaryRateDefinition(){
    
    
	List<AncillaryRateDefinitionModel> ancillaryRateDefinitionList  = null;
	
	
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ANCL_RATE_DEF);
	
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<AncillaryRateDefinitionModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			ancillaryRateDefinitionList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Room or Cabin Upgrade" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return ancillaryRateDefinitionList;

		}


@Override
public List<CommonAncillaryRateDetailModel> getCommonAncillaryRateDetail(){
    
    
	List<CommonAncillaryRateDetailModel> commonAncillaryRateDetailList  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ANC_RATE_DETAIL);
	
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<CommonAncillaryRateDetailModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			commonAncillaryRateDetailList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Room or Cabin Upgrade" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return commonAncillaryRateDetailList;

		}


@Override
public List<SeasonDetailModel> getSeasonDetails(){
    
    
	List<SeasonDetailModel> seasonDetailList  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(SEASON_DETAIL);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<SeasonDetailModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			seasonDetailList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting Room or Cabin Upgrade" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return seasonDetailList;

		}


@Override
public List<MediaModel> getMediaDetails(){
    
    
	List<MediaModel> mediaModelList  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(MEDIA_ANC_REL);
	
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<MediaModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			mediaModelList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting media for ancillary" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return mediaModelList;

		}

@Override
public List<TravelogixPolicyModel> getTravelLogixPolicy(){
    
    
	List<TravelogixPolicyModel> travelLogixPolicyList  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(TRAVEL_LOGIX_POLICY);
		
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<TravelogixPolicyModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			travelLogixPolicyList=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting travel logix policy" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return travelLogixPolicyList;

		}


@Override
public List<CommonRateAdvDefinitionModel> getCommonAdvDefinition(){
    
    
	List<CommonRateAdvDefinitionModel> commonRateAdvDefinition  = null;
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(COMM_RATE_ADV_DEF);
	
		LOG.info("Query :" + flexibleSearchQuery.getQuery());
		try{
			searchRestrictionService.disableSearchRestrictions();
			final SearchResult<CommonRateAdvDefinitionModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
			commonRateAdvDefinition=searchResult.getResult();
				
		}catch(Exception e){	
			LOG.info("Error occured while geting common rate adv definition" + e.getMessage(),e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return commonRateAdvDefinition;

		}

}


//}
