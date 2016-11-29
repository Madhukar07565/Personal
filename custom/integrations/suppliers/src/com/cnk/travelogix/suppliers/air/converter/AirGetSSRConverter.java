package com.cnk.travelogix.suppliers.air.converter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.CompanyNameType;
import org.opentravel.ota._2003._05.ConnectionType;
import org.opentravel.ota._2003._05.FlightLegType;
import org.opentravel.ota._2003._05.OTAAirGetSSRQ;
import org.opentravel.ota._2003._05.OTAAirGetSSRQ.OriginDestinationInformation.OriginDestinationOptions;
import org.opentravel.ota._2003._05.OTAAirGetSSRQ.OriginDestinationInformation.OriginDestinationOptions.OriginDestinationOption;
import org.opentravel.ota._2003._05.OTAAirGetSSRQ.OriginDestinationInformation.OriginDestinationOptions.OriginDestinationOption.FlightSegment;
import org.opentravel.ota._2003._05.OTAAirGetSSRS;
import org.opentravel.ota._2003._05.OTAAirGetSSRS.TravelerInfo;
import org.opentravel.ota._2003._05.OTAAirGetSSRS.TravelerInfo.SSRs;
import org.opentravel.ota._2003._05.OriginDestinationInformationType.DestinationLocation;
import org.opentravel.ota._2003._05.OriginDestinationInformationType.OriginLocation;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.PassengerTypeQuantityType;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.PricingSourceType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.SpecialReqDetailsType;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SeatRequests;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SeatRequests.SeatRequest;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SpecialServiceRequests;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest;
import org.opentravel.ota._2003._05.SpecialRequests;
import org.opentravel.ota._2003._05.SpecialRequests.ServicePrice;
import org.opentravel.ota._2003._05.SpecialRequests.ServicePrice.BasePrice;
import org.opentravel.ota._2003._05.SpecialRequests.ServicePrice.Taxes;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TimeInstantType;
import org.opentravel.ota._2003._05.TravelerInfoSummaryType.PriceRequestInformation;
import org.opentravel.ota._2003._05.TravelerInfoType.AirTraveler;
import org.opentravel.ota._2003._05.TravelerInformationType;
import org.springframework.util.StringUtils;

import com.cnk.travelogix.suppliers.air.data.AirGetSSRQ;
import com.cnk.travelogix.suppliers.air.data.AirGetSSRRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirGetSSRS;
import com.cnk.travelogix.suppliers.air.data.AirGetSSRequest;
import com.cnk.travelogix.suppliers.air.data.AirGetSSResponse;
import com.cnk.travelogix.suppliers.air.data.AirGetSSResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.CompanyName;
import com.cnk.travelogix.suppliers.air.data.ConnectionLocation;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationInformation;
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
import com.cnk.travelogix.suppliers.air.data.PersonName;
import com.cnk.travelogix.suppliers.air.data.SpecialReqDetail;
import com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary;
import com.cnk.travelogix.suppliers.air.data.TravelerInformation;
import com.cnk.travelogix.suppliers.air.data.FlightLeg;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.OTAAirGetSSRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirGetSSRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Air GetSSR Converter
 */
public class AirGetSSRConverter extends AirBaseConverter {

    /**
     * @param requestWrapper
     * @return airInterfaceRQ
     */
    public AirInterfaceRQ toOTAAirGetSSRQ(final AirGetSSRRequestWrapper requestWrapper) {

	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();

	OTAAirGetSSRQWrapper otaAirGetSSRQWrapper = new OTAAirGetSSRQWrapper();

	final List<AirGetSSRequest> airGetSSRequestsData = requestWrapper.getAirGetSSRequests();
	for (AirGetSSRequest airGetSSRequestData : airGetSSRequestsData) {

	    otaAirGetSSRQWrapper.setSequence(airGetSSRequestData.getSequence());

	    final SupplierIDType supplierIDType = this.populateSupplierId(airGetSSRequestData.getSupplierID());
	    otaAirGetSSRQWrapper.setSupplierID(supplierIDType);

	    final OTAAirGetSSRQ otaAirGetSSRQ = new OTAAirGetSSRQ();

	    final AirGetSSRQ airGetSSRQData = airGetSSRequestData.getAirGetSSRQ();
	    otaAirGetSSRQ.setVersion(airGetSSRQData.getVersion());

	    final POSType pos = new POSType();
	    final SourceType sourceType = new SourceType();
	    pos.getSource().add(sourceType);
	    otaAirGetSSRQ.setPOS(pos);

	    final List<OriginDestinationInformation> originDestInfosData = airGetSSRQData.getOriginDestinationInformation();
	    final List<org.opentravel.ota._2003._05.OTAAirGetSSRQ.OriginDestinationInformation> originDestInfos = populateOriginDestInfo(originDestInfosData);
	    otaAirGetSSRQ.getOriginDestinationInformation().add((org.opentravel.ota._2003._05.OTAAirGetSSRQ.OriginDestinationInformation) originDestInfos);

	    final TravelerInfoSummary travelerInfoSummaryData = airGetSSRQData.getTravelerInfoSummary();
	    final OTAAirGetSSRQ.TravelerInfoSummary travelerInfoSummary = populateTravelerInfoSummary(travelerInfoSummaryData);
	    otaAirGetSSRQ.setTravelerInfoSummary(travelerInfoSummary);

	    otaAirGetSSRQWrapper.setOTAAirGetSSRQ(otaAirGetSSRQ);

	}
	requestBody.getOTAAirGetSSRQWrapper().add(otaAirGetSSRQWrapper);
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;
    }

    /**
     * @param airInterfaceRS
     * @return airGetSSResponseWrapper
     */
    public AirGetSSResponseWrapper fromOTAAirGetSSRS(final AirInterfaceRS airInterfaceRS) {
	final AirGetSSResponseWrapper airGetSSResponseWrapper = new AirGetSSResponseWrapper();
	AirGetSSResponse airGetSSResponseData;
	final List<AirGetSSResponse> airGetSSResponsesData = new ArrayList<>();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    final List<OTAAirGetSSRSWrapper> otaAirGetSSRSWrappers = airInterfaceRS.getResponseBody().getOTAAirGetSSRSWrapper();
	    for (OTAAirGetSSRSWrapper otaAirGetSSRSWrapper : otaAirGetSSRSWrappers) {
		airGetSSResponseData = new AirGetSSResponse();
		airGetSSResponseData.setSupplierID(populateGetSupplierId(otaAirGetSSRSWrapper.getSupplierID()));
		String supplierId = otaAirGetSSRSWrapper.getSupplierID().getValue();
		if (!hasError(otaAirGetSSRSWrapper.getErrorList())) {
		    final AirGetSSRS airGetSSRSData = new AirGetSSRS();
		    final OTAAirGetSSRS otaAirGetSSRS = otaAirGetSSRSWrapper.getOTAAirGetSSRS();
		    airGetSSRSData.setAirItinerary(getAirItineraryData(otaAirGetSSRS.getAirItinerary()));

		    airGetSSRSData.setTravelerInfo(getTravelerInfoData(otaAirGetSSRS.getTravelerInfo()));

		    airGetSSResponseData.setAirGetSSRS(airGetSSRSData);
		    airGetSSResponsesData.add(airGetSSResponseData);
		    airGetSSResponseData.setErrors(getErrorsData(otaAirGetSSRS.getErrors(), supplierId));
		}
	    }
	}
	airGetSSResponseWrapper.setAirGetSSResponses(airGetSSResponsesData);
	airGetSSResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airGetSSResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airGetSSResponseWrapper;
    }

    /**
     * @param travelerInfo
     * @return travelerInfoData
     */
    private com.cnk.travelogix.suppliers.air.data.TravelerInfo getTravelerInfoData(final TravelerInfo travelerInfo) {

	final List<AirTraveler> airTravelers = travelerInfo.getAirTraveler();
	final com.cnk.travelogix.suppliers.air.data.TravelerInfo travelerInfoData = new com.cnk.travelogix.suppliers.air.data.TravelerInfo();
	com.cnk.travelogix.suppliers.air.data.AirTraveler airTravelerData;
	final List<com.cnk.travelogix.suppliers.air.data.AirTraveler> airTravelersData = new ArrayList<>();
	for (AirTraveler airTraveler : airTravelers) {
	    airTravelerData = new com.cnk.travelogix.suppliers.air.data.AirTraveler();
	    airTravelerData.setPassengerTypeCode(airTraveler.getPassengerTypeCode());
	    airTravelerData.setGender(airTraveler.getGender());

	    final PersonNameType personName = airTraveler.getPersonName();
	    final PersonName personNameData = new PersonName();
	    personNameData.setGivenName(personName.getGivenName());
	    personNameData.setNameTitle(personName.getNameTitle());
	    personNameData.setSurname(personName.getSurname());
	    airTravelerData.setPersonName(personNameData);

	    List<PassengerTypeQuantity> passengerTypeQuantities = new ArrayList<>();
	    final PassengerTypeQuantityType passengerTypeQuantity = airTraveler.getPassengerTypeQuantity();
	    final PassengerTypeQuantity passengerTypeQuantitydata = new PassengerTypeQuantity();
	    passengerTypeQuantitydata.setCode(passengerTypeQuantity.getCode());
	    passengerTypeQuantitydata.setAge(passengerTypeQuantity.getAge());
	    passengerTypeQuantities.add(passengerTypeQuantitydata);
	    airTravelerData.setPassengerTypeQuantity(passengerTypeQuantities);
	}
	travelerInfoData.setAirTravelers(airTravelersData);

	SpecialReqDetail specialReqDetail = new SpecialReqDetail();
	List<SpecialReqDetail> specialReqDetailsList = new ArrayList<>();
	List<SpecialReqDetailsType> specialReqDetailsTypes = travelerInfo.getSpecialReqDetails();
	for (SpecialReqDetailsType specialReqDetailsType : specialReqDetailsTypes) {
	    com.cnk.travelogix.suppliers.air.data.SeatRequest seatRequestData = new com.cnk.travelogix.suppliers.air.data.SeatRequest();
	    SeatRequests seatRequests = specialReqDetailsType.getSeatRequests();
	    List<SeatRequest> otaSeatRequests = seatRequests.getSeatRequest();
	    for (SeatRequest seatRequest : otaSeatRequests) {
		seatRequestData.setSeatPreference(seatRequest.getSeatPreference());
		seatRequestData.setDeckLevel(seatRequest.getDeckLevel());
		specialReqDetail.getSeatRequests().add(seatRequestData);
	    }

	    com.cnk.travelogix.suppliers.air.data.SpecialServiceRequests specialServiceRequestsData = new com.cnk.travelogix.suppliers.air.data.SpecialServiceRequests();
	    SpecialServiceRequests specialServiceRequests = specialReqDetailsType.getSpecialServiceRequests();
	    List<SpecialServiceRequest> specialServiceRequestsList = specialServiceRequests.getSpecialServiceRequest();
	    List<com.cnk.travelogix.suppliers.air.data.SpecialServiceRequest> specialServiceRequestsDataList = new ArrayList<>();
	    for (SpecialServiceRequest specialServiceRequest : specialServiceRequestsList) {
		com.cnk.travelogix.suppliers.air.data.SpecialServiceRequest specialServiceRequestData = new com.cnk.travelogix.suppliers.air.data.SpecialServiceRequest();
		specialServiceRequestData.setSsrCode(specialServiceRequest.getSSRCode());
		specialServiceRequestData.setNumber(specialServiceRequest.getNumber());
		specialServiceRequestData.setStatus(specialServiceRequest.getStatus());
		specialServiceRequestData.setServiceQuantity(specialServiceRequest.getServiceQuantity());
		CompanyNameType companyNameType = specialServiceRequest.getAirline();
		CompanyName companyNameData = new CompanyName();
		companyNameData.setCompanyShortName(companyNameType.getCompanyShortName());
		companyNameData.setCode(companyNameType.getCode());
		specialServiceRequestData.setAirline(companyNameData);
		specialServiceRequestData.setTpaExtensions(getTpaExtensionsDataResponse(specialServiceRequest.getTPAExtensions()));
		FlightLegType flightLegType = specialServiceRequest.getFlightLeg();
		FlightLeg flightLeg = new FlightLeg();
		flightLeg.setDate(getDateGregorianCalendar(flightLegType.getDate()));
		specialServiceRequestData.setFlightLeg(flightLeg);
		specialServiceRequestsDataList.add(specialServiceRequestData);
	    }
	    specialServiceRequestsData.setSpecialServiceRequest(specialServiceRequestsDataList);
	    specialReqDetail.setSpecialServiceRequests(specialServiceRequestsData);
	    specialReqDetailsList.add(specialReqDetail);
	}
	travelerInfoData.setSpecialReqDetails(specialReqDetailsList);

	SSRs otaSsrs = travelerInfo.getSSRs();
	com.cnk.travelogix.suppliers.air.data.SSRs ssRsData = new com.cnk.travelogix.suppliers.air.data.SSRs();
	List<SpecialRequests> specialRequests = otaSsrs.getSSR();
	for (SpecialRequests otaSpecialRequests : specialRequests) {
	    com.cnk.travelogix.suppliers.air.data.SpecialRequests specialRequestsData = new com.cnk.travelogix.suppliers.air.data.SpecialRequests();

	    specialRequestsData.setCode(otaSpecialRequests.getCode());
	    specialRequestsData.setDescription(otaSpecialRequests.getDescription());
	    specialRequestsData.setName(otaSpecialRequests.getName());
	    specialRequestsData.setCategoryCode(otaSpecialRequests.getCategoryCode());
	    specialRequestsData.setFlightRef(otaSpecialRequests.getFlightRef());
	    specialRequestsData.setTravelerRef(otaSpecialRequests.getTravelerRef());
	    ServicePrice price = otaSpecialRequests.getServicePrice();
	    com.cnk.travelogix.suppliers.air.data.ServicePrice servicePriceData = new com.cnk.travelogix.suppliers.air.data.ServicePrice();
	    servicePriceData.setTotal(price.getTotal());
	    servicePriceData.setCurrencyCode(price.getCurrencyCode());
	    List<BasePrice> basePrices = price.getBasePrice();
	    List<com.cnk.travelogix.suppliers.air.data.BasePrice> basePricesData = new ArrayList<>();
	    for (BasePrice basePrice : basePrices) {
		com.cnk.travelogix.suppliers.air.data.BasePrice basePriceData = new com.cnk.travelogix.suppliers.air.data.BasePrice();
		basePriceData.setAmount(basePrice.getAmount());
		basePricesData.add(basePriceData);
	    }
	    servicePriceData.setBasePrice(basePricesData);
	    Taxes taxes = price.getTaxes();
	    com.cnk.travelogix.suppliers.air.data.Taxes taxesData = new com.cnk.travelogix.suppliers.air.data.Taxes();
	    taxesData.setAmount(new BigDecimal(taxes.getAmount()));
	    servicePriceData.setTaxes(taxesData);
	    specialRequestsData.setServicePrice(servicePriceData);
	    ssRsData.setSsr(specialRequestsData);
	}
	travelerInfoData.setSsRs(ssRsData);
	return travelerInfoData;
    }

    /**
     * @param originDestInfosData
     * @return travelPreferencesList
     */
    private List<OTAAirGetSSRQ.OriginDestinationInformation> populateOriginDestInfo(final List<OriginDestinationInformation> originDestInfosData) {
	final List<OTAAirGetSSRQ.OriginDestinationInformation> originDestinationInformations = new ArrayList<>();
	OTAAirGetSSRQ.OriginDestinationInformation orignDestInfo;
	for (OriginDestinationInformation orignDestInfoData : originDestInfosData) {
	    orignDestInfo = new OTAAirGetSSRQ.OriginDestinationInformation();
	    final TimeInstantType departureDateTime = new TimeInstantType();
	    departureDateTime.setValue(orignDestInfoData.getDepartureDateTime());
	    orignDestInfo.setDepartureDateTime(departureDateTime);
	    final TimeInstantType arrivalDateTime = new TimeInstantType();
	    arrivalDateTime.setValue(orignDestInfoData.getArrivalDateTime());
	    orignDestInfo.setArrivalDateTime(arrivalDateTime);
	    final OriginLocation originLocation = new OriginLocation();
	    originLocation.setLocationCode(orignDestInfoData.getOriginLocationCode());
	    orignDestInfo.setOriginLocation(originLocation);
	    final DestinationLocation destinationLocation = new DestinationLocation();
	    destinationLocation.setLocationCode(orignDestInfoData.getDestinationLocationCode());
	    orignDestInfo.setDestinationLocation(destinationLocation);

	    final List<ConnectionLocation> connectionLocationList = orignDestInfoData.getConnectionLocations();
	    ConnectionType connectionType = new ConnectionType();
	    org.opentravel.ota._2003._05.ConnectionType.ConnectionLocation otaConnectionLocation ;
	    for (ConnectionLocation connectionLocation : connectionLocationList) {
		otaConnectionLocation = new org.opentravel.ota._2003._05.ConnectionType.ConnectionLocation();
		otaConnectionLocation.setCodeContext(connectionLocation.getCodeContext());
		connectionType.getConnectionLocation().add(otaConnectionLocation);
	    }
	    orignDestInfo.setConnectionLocations(connectionType);

	    OriginDestinationOption otaOriginDestinationOption;
	    OriginDestinationOptions originDestinationOptionsList;
	    List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestinationOptionList = orignDestInfoData.getOriginDestinationOptions();

	    for (com.cnk.travelogix.suppliers.air.data.OriginDestinationOption originDestinationOption : originDestinationOptionList) {
		FlightSegment otaFlightSegment;
		otaOriginDestinationOption = new OriginDestinationOption();
		originDestinationOptionsList = new OriginDestinationOptions();
		List<com.cnk.travelogix.suppliers.air.data.FlightSegment> segmentsList = originDestinationOption.getFlightSegments();
		for (com.cnk.travelogix.suppliers.air.data.FlightSegment flightSegment : segmentsList) {
		    otaFlightSegment = new FlightSegment();
		    otaFlightSegment.setFlightNumber(flightSegment.getFlightNumber());
		    otaFlightSegment.setFareBasisCode(flightSegment.getFareBasisCode());
		    otaFlightSegment.setResBookDesigCode(flightSegment.getResBookDesigCode());
		    final TPAExtensions tpaExtensionsData = flightSegment.getTpaExtensions();
		    if (tpaExtensionsData != null) {
			final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
			otaFlightSegment.setTPAExtensions(tpaExtensionsType);
		    }
		    otaOriginDestinationOption.getFlightSegment().add(otaFlightSegment);
		}
		originDestinationOptionsList.getOriginDestinationOption().add(otaOriginDestinationOption);
		orignDestInfo.setOriginDestinationOptions(originDestinationOptionsList);

	    }
	    originDestinationInformations.add(orignDestInfo);
	}
	return originDestinationInformations;
    }

    /**
     * @param travelerInfoSummaryData
     * @return travelerInfoSummary
     */
    private OTAAirGetSSRQ.TravelerInfoSummary populateTravelerInfoSummary(final TravelerInfoSummary travelerInfoSummaryData) {
	final OTAAirGetSSRQ.TravelerInfoSummary travelerInfoSummary = new OTAAirGetSSRQ.TravelerInfoSummary();

	final List<TravelerInformation> travelerInformationsData = travelerInfoSummaryData.getAirTraveler();
	if (travelerInformationsData != null && !travelerInformationsData.isEmpty()) {
	    TravelerInformationType travelerInformation;
	    for (TravelerInformation travelerInformationData : travelerInformationsData) {
		travelerInformation = new TravelerInformationType();
		final List<PassengerTypeQuantity> passengerTypeQuantitiesData = travelerInformationData.getPassengerTypeQuantity();
		travelerInformation.getPassengerTypeQuantity().addAll(populatePassengerTypeQuantity(passengerTypeQuantitiesData));
		travelerInfoSummary.getAirTravelerAvail().add(travelerInformation);

		com.cnk.travelogix.suppliers.air.data.AirTraveler airTravelerData = travelerInformationData.getAirTraveler();
		AirTraveler otaAirTraveler = new AirTraveler();
		PersonNameType personNameType = new PersonNameType();
		PersonName personNameData = airTravelerData.getPersonName();
		personNameType.getNamePrefix().addAll(personNameData.getNamePrefix());
		personNameType.getGivenName().addAll(personNameData.getGivenName());
		personNameType.setSurname(personNameData.getSurname());

		final TPAExtensions tpaExtensionsData = personNameData.getTpaExtensions();
		if (tpaExtensionsData != null) {
		    final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
		    personNameType.setTPAExtensions(tpaExtensionsType);
		}
		otaAirTraveler.setPersonName(personNameType);
		travelerInformation.setAirTraveler(otaAirTraveler);
	    }
	}

	final com.cnk.travelogix.suppliers.air.data.PriceRequestInformation priceReqInfoData = travelerInfoSummaryData.getPriceRequestInformation();
	if (priceReqInfoData != null) {
	    final PriceRequestInformation priceRequestInformation = new PriceRequestInformation();
	    priceRequestInformation.setCurrencyCode(priceReqInfoData.getCurrencyCode());
	    final String pricingSource = priceReqInfoData.getPricingSource();
	    if (StringUtils.hasText(pricingSource)) {
		priceRequestInformation.setPricingSource(PricingSourceType.fromValue(pricingSource));
	    }
	    travelerInfoSummary.setPriceRequestInformation(priceRequestInformation);
	}
	return travelerInfoSummary;
    }

    /**
     * @param passengerTypeQuantitiesData
     * @return passengerTypeQuantities
     */
    public List<PassengerTypeQuantityType> populatePassengerTypeQuantity(final List<PassengerTypeQuantity> passengerTypeQuantitiesData) {
	List<PassengerTypeQuantityType> passengerTypeQuantities = new ArrayList<>();
	if (passengerTypeQuantitiesData != null && !passengerTypeQuantitiesData.isEmpty()) {
	    PassengerTypeQuantityType paxTypeQuantity;
	    for (PassengerTypeQuantity paxTypeQuantityData : passengerTypeQuantitiesData) {
		paxTypeQuantity = new PassengerTypeQuantityType();
		paxTypeQuantity.setCode(paxTypeQuantityData.getCode());
		paxTypeQuantity.setQuantity(paxTypeQuantityData.getQuantity());
		passengerTypeQuantities.add(paxTypeQuantity);
	    }
	}
	return passengerTypeQuantities;
    }

}