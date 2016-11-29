package com.cnk.travelogix.v2.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cnk.travelogix.masterdata.core.enums.ClientType;
import com.cnk.travelogix.rate.acco.data.AbstractTravelogixSupplierOfferData;
import com.cnk.travelogix.rate.acco.data.AccoRateDetailDefinitionData;
import com.cnk.travelogix.rate.acco.data.AccoSurchargeSuppDetailData;
import com.cnk.travelogix.rate.acco.data.AccommodationRateDefinitionData;
import com.cnk.travelogix.rate.acco.data.AccomodationSupplierRateData;
import com.cnk.travelogix.rate.acco.data.AncillaryDiscountData;
import com.cnk.travelogix.rate.acco.data.AncillaryFOCData;
import com.cnk.travelogix.rate.acco.data.ComplimentaryData;
import com.cnk.travelogix.rate.acco.data.DiscountLongStayData;
import com.cnk.travelogix.rate.acco.data.DiscountOnFreeNightData;
import com.cnk.travelogix.rate.acco.data.DiscountOnNightData;
import com.cnk.travelogix.rate.acco.data.DiscountOnPaxData;
import com.cnk.travelogix.rate.acco.data.DiscountOnRateData;
import com.cnk.travelogix.rate.acco.data.DiscountOnRoomOrCabinData;
import com.cnk.travelogix.rate.acco.data.DiscountPerAgeData;
import com.cnk.travelogix.rate.acco.data.FOCOfferData;
import com.cnk.travelogix.rate.acco.data.FullPrePaymentData;
import com.cnk.travelogix.rate.acco.data.PartPrePaymentData;
import com.cnk.travelogix.rate.acco.data.PassengerLevelSurchargeDetailData;
import com.cnk.travelogix.rate.acco.data.RatePaymentDetailData;
import com.cnk.travelogix.rate.acco.data.RoomOrCabinUpgradeData;
import com.cnk.travelogix.rate.acco.data.SeasonDetailData;
import com.cnk.travelogix.rate.acco.data.SupplierData;
import com.cnk.travelogix.rate.acco.data.TaxData;
import com.cnk.travelogix.rate.acco.data.UpdateRateResponseData;
import com.cnk.travelogix.rate.acco.dto.AccomodationSupplierRateWsDTO;
import com.cnk.travelogix.rate.acco.dto.UpdateRateResponseWsDto;
import com.cnk.travelogix.rate.facade.RateFacade;
import com.cnk.travelogix.supplier.masters.core.enums.SeasonType;
import com.cnk.travelogix.supplier.rates.enums.CommissionType;
import com.coxandkings.integ.suppl.acco.OTAHotelAvailRQWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.air.OTAAirAvailRQWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

/**
 * This controller class manages supplier rates
 * 
 * @author I077322
 * 
 */
@Controller
@RequestMapping(value = "/{baseSiteId}/rate")

public class CustomRateController extends BaseCommerceController {

	private static final Logger LOG = LoggerFactory.getLogger(CustomRateController.class);

	@Autowired
	private RateFacade rateFacade;

	@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
	@RequestMapping(value = "/acco/{supplierId}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public UpdateRateResponseWsDto updateRate(@PathVariable("supplierId") final String supplierId,
			@RequestBody final AccomodationSupplierRateWsDTO accoSupplierRate) {
		LOG.info("#updateRate - Start");

		LOG.debug("#supplierInventoryListWsDTO - SupplierId:{}", supplierId);
		final AccomodationSupplierRateData accoSupplierRateData = getDataMapper().map(accoSupplierRate,
				AccomodationSupplierRateData.class);
		final UpdateRateResponseData updateRateResponseData = rateFacade.updateRate(supplierId, accoSupplierRateData);
		final UpdateRateResponseWsDto updateRateResponseDataWsDTO = getDataMapper().map(updateRateResponseData,
				UpdateRateResponseWsDto.class);
		LOG.info("#updateRate - Finish");
		return updateRateResponseDataWsDTO;
	}

	@RequestMapping(value = "/accomsupplierrate", method = RequestMethod.GET)
	public void updateAccommodationSupplierRate(Model model) {
		AccomodationSupplierRateData accoSupplierRateData = new AccomodationSupplierRateData();

		List<AccommodationRateDefinitionData> accommodationRateDefinitionDataList = new ArrayList<>();
		accoSupplierRateData.setProduct("8796127166465");
		accoSupplierRateData.setMarket("8796093075676");
		accoSupplierRateData.setCompany("");
		accoSupplierRateData.setActive(true);

		List<SeasonDetailData> seasonDetailDataList = new ArrayList<>();
		SeasonDetailData seasonDetailData = new SeasonDetailData();
		seasonDetailData.setSeasonality("LOW_SEASON");
		seasonDetailDataList.add(seasonDetailData);
		accoSupplierRateData.setSeasonDetails(seasonDetailDataList);

		// taxData
		TaxData taxData = new TaxData();
		taxData.setCode("54675");
		taxData.setValue(45.0);
		taxData.setName("Service Tax");

		accoSupplierRateData.setTax(taxData);

		AccommodationRateDefinitionData accommodationRateDefinitionData = new AccommodationRateDefinitionData();
		accommodationRateDefinitionData.setNoOfRooms(5);
		accommodationRateDefinitionData.setNet(false);
		accommodationRateDefinitionData.setClientType("B2B");
		accommodationRateDefinitionData.setCommissionType(CommissionType.NET);
		accommodationRateDefinitionData.setCommisionValue(33.00);
		accommodationRateDefinitionDataList.add(accommodationRateDefinitionData);

		accoSupplierRateData.setAccomodationRateDefinition(accommodationRateDefinitionDataList);

		List<FullPrePaymentData> fullPrePaymentDataList = new ArrayList<>();
		FullPrePaymentData fullPrePaymentData = new FullPrePaymentData();
		List<RatePaymentDetailData> ratePaymentDetailDataList = new ArrayList<>();
		RatePaymentDetailData ratePaymentDetailData = new RatePaymentDetailData();
		ratePaymentDetailData.setPayablePercentage(40.0);
		fullPrePaymentData.setRatePaymentDetail(ratePaymentDetailData);
		fullPrePaymentDataList.add(fullPrePaymentData);
		PartPrePaymentData partPrePaymentData = new PartPrePaymentData();
		ratePaymentDetailDataList.add(ratePaymentDetailData);
		partPrePaymentData.setRatePaymentDetails(ratePaymentDetailDataList);
		accommodationRateDefinitionData.setFullPrePayment(fullPrePaymentDataList);

		List<AccoSurchargeSuppDetailData> accoSurchargeSuppDetailDataList = new ArrayList<>();
		AccoSurchargeSuppDetailData accoSurchargeSuppDetailData = new AccoSurchargeSuppDetailData();
		accoSurchargeSuppDetailData.setSurchargeID("111");
		accoSurchargeSuppDetailDataList.add(accoSurchargeSuppDetailData);
		accommodationRateDefinitionData.setSurcharge(accoSurchargeSuppDetailDataList);

		List<AccoRateDetailDefinitionData> accommodationRateDetailDefDataList = new ArrayList<>();
		AccoRateDetailDefinitionData accoRateDetailDefinitionData = new AccoRateDetailDefinitionData();
		accoRateDetailDefinitionData.setMinNight(4);
		accoRateDetailDefinitionData.setCheckInTime("10");
		accoRateDetailDefinitionData.setCheckoutTime("13");

		List<AbstractTravelogixSupplierOfferData> travelLogixSupplierDataList = new ArrayList<>();
		AbstractTravelogixSupplierOfferData discountPerAgeData = new DiscountPerAgeData();
		discountPerAgeData.setDiscountValue(50.0);
		DiscountLongStayData discountLongStayData = new DiscountLongStayData();
		discountLongStayData.setCode("1234");

		ComplimentaryData complimentaryData = new ComplimentaryData();
		SupplierData supplierData = new SupplierData();
		supplierData.setCode("123");
		complimentaryData.setSupplier(supplierData);
		complimentaryData.setDiscountValue(70.0);
		complimentaryData.setCode("123");

		AncillaryFOCData ancillaryFOCData = new AncillaryFOCData();
		ancillaryFOCData.setCode("345");
		ancillaryFOCData.setNoOfChildren(5);

		ancillaryFOCData.setSupplier(supplierData);
		FOCOfferData fOCOfferData = new FOCOfferData();
		fOCOfferData.setDiscountValue(64.0);
		fOCOfferData.setCode("2345");
		fOCOfferData.setSupplier(supplierData);
		AncillaryDiscountData ancillaryDiscountData = new AncillaryDiscountData();
		ancillaryDiscountData.setCode("123");
		ancillaryDiscountData.setSupplier(supplierData);
		ancillaryDiscountData.setDiscountValue(40.0);
		ancillaryDiscountData.setBookingCount(10);
		ancillaryDiscountData.setDiscountedBooking(4);

		DiscountOnRateData discountOnRateData = new DiscountOnRateData();
		discountOnRateData.setCode("7689");
		discountOnRateData.setSupplier(supplierData);
		discountOnRateData.setDiscountValue(34.0);

		DiscountOnNightData discountOnNightData = new DiscountOnNightData();

		discountOnNightData.setCode("32345");
		discountOnNightData.setDiscountValue(56.0);
		discountOnNightData.setNoOfDiscountedNights(5);
		discountOnNightData.setSupplier(supplierData);

		DiscountOnFreeNightData discountOnFreeNightData = new DiscountOnFreeNightData();
		discountOnFreeNightData.setCode("879");
		discountOnFreeNightData.setSupplier(supplierData);
		discountOnFreeNightData.setNoOfNights(6);
		discountOnFreeNightData.setNoOfFreeNights(5);

		DiscountOnRoomOrCabinData discountOnRoomOrCabinData = new DiscountOnRoomOrCabinData();
		discountOnRoomOrCabinData.setCode("2345");
		discountOnRoomOrCabinData.setBookedRoomsCount(6);
		discountOnRoomOrCabinData.setDiscountValue(78.0);
		discountOnRoomOrCabinData.setSupplier(supplierData);

		DiscountOnPaxData discountOnPaxData = new DiscountOnPaxData();
		discountOnPaxData.setCode("2345");
		discountOnPaxData.setDiscountValue(90.0);
		discountOnPaxData.setDiscountedPaxCount(4);
		discountOnPaxData.setPaxBookedCount(4);
		discountOnPaxData.setSupplier(supplierData);

		RoomOrCabinUpgradeData roomOrCabinUpgradeData = new RoomOrCabinUpgradeData();
		roomOrCabinUpgradeData.setCode("123");
		roomOrCabinUpgradeData.setSupplier(supplierData);

		travelLogixSupplierDataList.add(discountPerAgeData);
		travelLogixSupplierDataList.add(discountLongStayData);
		travelLogixSupplierDataList.add(complimentaryData);
		travelLogixSupplierDataList.add(ancillaryFOCData);
		travelLogixSupplierDataList.add(fOCOfferData);
		travelLogixSupplierDataList.add(ancillaryDiscountData);
		travelLogixSupplierDataList.add(discountOnRateData);
		travelLogixSupplierDataList.add(discountOnNightData);
		travelLogixSupplierDataList.add(discountOnFreeNightData);
		travelLogixSupplierDataList.add(discountOnRoomOrCabinData);
		travelLogixSupplierDataList.add(discountOnPaxData);
		travelLogixSupplierDataList.add(roomOrCabinUpgradeData);

		accoRateDetailDefinitionData.setTravelogixSupplierOffer(travelLogixSupplierDataList);

		List<PassengerLevelSurchargeDetailData> passengerLevelSurchargeDetailDataList = new ArrayList<>();
		PassengerLevelSurchargeDetailData passengerLevelSurchargeDetailData = new PassengerLevelSurchargeDetailData();
		passengerLevelSurchargeDetailData.setAmount(100.0);
		passengerLevelSurchargeDetailData.setStdCommissionValue(20.0);
		passengerLevelSurchargeDetailDataList.add(passengerLevelSurchargeDetailData);
		accoSurchargeSuppDetailData.setPassengerLevelSurchargeDetails(passengerLevelSurchargeDetailDataList);

		accommodationRateDetailDefDataList.add(accoRateDetailDefinitionData);
		accommodationRateDefinitionData.setAccoRateDetailDefs(accommodationRateDetailDefDataList);
		rateFacade.updateRate("", accoSupplierRateData);

	}

	
}
