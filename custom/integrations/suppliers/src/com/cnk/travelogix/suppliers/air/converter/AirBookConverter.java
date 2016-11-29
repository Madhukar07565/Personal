package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.opentravel.ota._2003._05.AirItineraryPricingInfoType;
import org.opentravel.ota._2003._05.AirItineraryType;
import org.opentravel.ota._2003._05.AirTravelerType;
import org.opentravel.ota._2003._05.AirTravelerType.Email;
import org.opentravel.ota._2003._05.AirTravelerType.Telephone;
import org.opentravel.ota._2003._05.CountryNameType;
import org.opentravel.ota._2003._05.FareType;
import org.opentravel.ota._2003._05.FlightSegmentBaseType;
import org.opentravel.ota._2003._05.FlightSegmentType;
import org.opentravel.ota._2003._05.FulfillmentType;
import org.opentravel.ota._2003._05.OTAAirBookRQ;
import org.opentravel.ota._2003._05.OTAAirBookRS;
import org.opentravel.ota._2003._05.OperatingAirlineType;
import org.opentravel.ota._2003._05.OriginDestinationOptionType;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.PaymentDetailType;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.StateProvType;
import org.opentravel.ota._2003._05.SuccessType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TravelerInfoType;

import com.cnk.travelogix.suppliers.air.data.Address;
import com.cnk.travelogix.suppliers.air.data.AirBookRS;
import com.cnk.travelogix.suppliers.air.data.AirBookRequest;
import com.cnk.travelogix.suppliers.air.data.AirBookRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirBookResponse;
import com.cnk.travelogix.suppliers.air.data.AirBookResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.AirReservation;
import com.cnk.travelogix.suppliers.air.data.AirTraveler;
import com.cnk.travelogix.suppliers.air.data.ArrivalAirport;
import com.cnk.travelogix.suppliers.air.data.BookingReferenceID;
import com.cnk.travelogix.suppliers.air.data.DepartureAirport;
import com.cnk.travelogix.suppliers.air.data.Document;
import com.cnk.travelogix.suppliers.air.data.FlightSegment;
import com.cnk.travelogix.suppliers.air.data.Fulfillment;
import com.cnk.travelogix.suppliers.air.data.ItinTotalFare;
import com.cnk.travelogix.suppliers.air.data.OperatingAirline;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationOption;
import com.cnk.travelogix.suppliers.air.data.PaymentAmount;
import com.cnk.travelogix.suppliers.air.data.PaymentDetail;
import com.cnk.travelogix.suppliers.air.data.PaymentDetails;
import com.cnk.travelogix.suppliers.air.data.PersonName;
import com.cnk.travelogix.suppliers.air.data.TotalFare;
import com.cnk.travelogix.suppliers.air.data.TravelerInfo;
import com.cnk.travelogix.suppliers.air.data.TravelerRefNumber;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
// added
import com.coxandkings.integ.suppl.air.OTAAirBookRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirBookRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

public class AirBookConverter extends AirBaseConverter {

    public AirInterfaceRQ toOTAAirBookRQ(final AirBookRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAAirBookRQWrapper otaAirBookRQWrapper;
	final List<AirBookRequest> airBookRequestsData = requestWrapper.getAirBookRequests();
	for (AirBookRequest airBookRequestData : airBookRequestsData) {
	    otaAirBookRQWrapper = new OTAAirBookRQWrapper();
	    otaAirBookRQWrapper.setSequence(airBookRequestData.getSequence());
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(airBookRequestData.getSupplierID().getValue());
	    supplierIDType.setMarketType(airBookRequestData.getSupplierID().getMarketType());
	    otaAirBookRQWrapper.setSupplierID(supplierIDType);

	    final OTAAirBookRQ otaAirBookRQ = new OTAAirBookRQ();
	    otaAirBookRQ.setTransactionIdentifier(airBookRequestData.getAirBookRQ().getTransactionIdentifier());
	    otaAirBookRQ.setVersion(airBookRequestData.getAirBookRQ().getVersion());
	    otaAirBookRQ.setTarget(airBookRequestData.getAirBookRQ().getTarget());
	    otaAirBookRQ.setPrimaryLangID(airBookRequestData.getAirBookRQ().getPrimaryLangID());
	    otaAirBookRQ.setPriceInd(airBookRequestData.getAirBookRQ().getPriceInd());

	    final POSType pos = new POSType();
	    final SourceType sourceType = new SourceType();
	    pos.getSource().add(sourceType);
	    otaAirBookRQ.setPOS(pos);

	    //Air itinerary
	    AirItineraryType airItineraryType;
	    final AirItinerary airItinerary = airBookRequestData.getAirBookRQ().getAirItinerary();
	    airItineraryType = getAirItineraryType(airItinerary);
	    otaAirBookRQ.setAirItinerary(airItineraryType);

	    //PriceInfo
	    OTAAirBookRQ.PriceInfo priceInfoType;
	    if (airBookRequestData.getAirBookRQ().getPriceInfo() != null) {
		List<ItinTotalFare> itinTotalFares = airBookRequestData.getAirBookRQ().getPriceInfo();
		priceInfoType = getPriceInfoType(itinTotalFares);
		otaAirBookRQ.setPriceInfo(priceInfoType);
	    }

	    //TravelerInfo	
	    TravelerInfoType travelerInfoType;
	    if (airBookRequestData.getAirBookRQ().getTravelerInfo() != null) {
		List<AirTraveler> airTravelers = airBookRequestData.getAirBookRQ().getTravelerInfo();
		travelerInfoType = getAirTravelerType(airTravelers);
		otaAirBookRQ.setTravelerInfo(travelerInfoType);
	    }

	    //Fulfillment
	    FulfillmentType fulfillmentType;
	    if (airBookRequestData.getAirBookRQ().getFulfillment() != null) {
		Fulfillment fulfillment = airBookRequestData.getAirBookRQ().getFulfillment();
		fulfillmentType = getFulfillmentType(fulfillment);
		otaAirBookRQ.setFulfillment(fulfillmentType);
	    }

	    final TPAExtensions tpaExtensionsData = airBookRequestData.getAirBookRQ().getTpaExtensions();
	    if (tpaExtensionsData != null) {
		final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
		otaAirBookRQ.setTPAExtensions(tpaExtensionsType);
	    }
	    otaAirBookRQWrapper.setOTAAirBookRQ(otaAirBookRQ);
	    requestBody.getOTAAirBookRQWrapper().add(otaAirBookRQWrapper);

	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;
    }

    public AirBookResponseWrapper fromOTAAirBookRS(final AirInterfaceRS airInterfaceRS) {
	final AirBookResponseWrapper airBookResponseWrapper = new AirBookResponseWrapper();
	AirBookResponse airBookResponseData;
	final List<AirBookResponse> airBookResponsesData = new ArrayList<>();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    final List<OTAAirBookRSWrapper> otaAirBookRSWrappers = airInterfaceRS.getResponseBody().getOTAAirBookRSWrapper();
	    for (OTAAirBookRSWrapper otaAirBookRSWrapper : otaAirBookRSWrappers) {
		String supplierId = otaAirBookRSWrapper.getSupplierID().getValue();
		OTAAirBookRS otaAirBookRS = otaAirBookRSWrapper.getOTAAirBookRS();
		airBookResponseData = new AirBookResponse();
		airBookResponseData.setSequence(otaAirBookRSWrapper.getSequence());
		airBookResponseData.setSupplierID(populateGetSupplierId(otaAirBookRSWrapper.getSupplierID()));

		if (!hasError(otaAirBookRSWrapper.getErrorList())) {
		    final AirBookRS airBookRSData = new AirBookRS();
		    airBookRSData.setTarget(otaAirBookRS.getTarget());
		    airBookRSData.setTransactionIdentifier(otaAirBookRS.getTransactionIdentifier());
		    airBookRSData.setVersion(otaAirBookRS.getVersion());
		    airBookRSData.setTransactionStatusCode(otaAirBookRS.getTransactionStatusCode());
		    //airItinerary

		    List<Object> successAndWarningsAndAirReservations = otaAirBookRS.getSuccessAndWarningsAndAirReservation();
		    OTAAirBookRS.AirReservation airReservationType = null;
		    for (Object object : successAndWarningsAndAirReservations) {
			if (object instanceof SuccessType) {
			    airBookRSData.setSuccess("true");
			}
			if (object instanceof OTAAirBookRS.AirReservation) {
			    airReservationType = (OTAAirBookRS.AirReservation) object;
			}
		    }
		    //Air Reservation air Itinerary , air Traveler
		    airBookRSData.setAirReservation(getAirReservationData(airReservationType));
		    airBookRSData.setErrors(getErrorsData(otaAirBookRS.getErrors(), supplierId));
		    airBookResponseData.setAirBookRS(airBookRSData);
		}
		airBookResponseData.setErrors(getErrorsListData(otaAirBookRSWrapper.getErrorList(), supplierId));
		airBookResponsesData.add(airBookResponseData);
	    }
	}
	airBookResponseWrapper.setAirBookResponses(airBookResponsesData);
	airBookResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));
	airBookResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));

	return airBookResponseWrapper;
    }

    private AirReservation getAirReservationData(OTAAirBookRS.AirReservation airReservationType) {
	AirReservation airReservation = new AirReservation();
	airReservation.setCreateDateTime(getStringAsDate(airReservationType.getCreateDateTime()));
	AirItinerary airItinerary = getAirItineraryData(airReservationType);
	airReservation.setAirItinerary(airItinerary);
	TravelerInfo travelerInfo = getTravelerInfoData(airReservationType);
	airReservation.setTravelerInfo(travelerInfo);
	BookingReferenceID bookingReferenceIDData;
	final List<BookingReferenceID> bookingReferenceIdsData = new ArrayList<>();
	final List<org.opentravel.ota._2003._05.AirReservationType.BookingReferenceID> bookingReferenceIDs = airReservationType.getBookingReferenceID();
	for (org.opentravel.ota._2003._05.AirReservationType.BookingReferenceID bookingReferenceID : bookingReferenceIDs) {
	    bookingReferenceIDData = new BookingReferenceID();
	    bookingReferenceIDData.setId(bookingReferenceID.getID());
	    bookingReferenceIDData.setType(bookingReferenceID.getType());
	    bookingReferenceIDData.setIdContext(bookingReferenceID.getIDContext());
	}
	airReservation.setBookingReferenceIds(bookingReferenceIdsData);
	return airReservation;
    }

    private AirItinerary getAirItineraryData(OTAAirBookRS.AirReservation airReservationType) {
	AirItineraryType airItineraryType = airReservationType.getAirItinerary();
	AirItineraryType.OriginDestinationOptions originDestinationOptionsType = airItineraryType.getOriginDestinationOptions();
	List<OriginDestinationOption> originDestinationOptions = new ArrayList<>();
	OriginDestinationOption originDestinationOption = new OriginDestinationOption();
	for (AirItineraryType.OriginDestinationOptions.OriginDestinationOption originDestinationOptionType : originDestinationOptionsType.getOriginDestinationOption()) {

	    List<FlightSegment> flightSegments = new ArrayList<>();
	    for (OriginDestinationOptionType.FlightSegment flightSegmentType : originDestinationOptionType.getFlightSegment()) {
		FlightSegment flightSegment = new FlightSegment();
		flightSegment.setFlightNumber(flightSegmentType.getFlightNumber());
		Date departureDate = flightSegmentType.getDepartureDateTime().toGregorianCalendar().getTime();
		Date arrivalDate = flightSegmentType.getArrivalDateTime().toGregorianCalendar().getTime();
		flightSegment.setDepartureDateTime(departureDate);
		flightSegment.setStatus(flightSegmentType.getStatus());
		flightSegment.setConnectionType(flightSegmentType.getConnectionType());
		flightSegment.setResBookDesigCode(flightSegmentType.getResBookDesigCode());
		flightSegment.setArrivalDateTime(arrivalDate);
		flightSegment.setResBookDesigCode(flightSegmentType.getResBookDesigCode());
		flightSegment.setStopQuantity(flightSegmentType.getStopQuantity());
		FlightSegmentBaseType.DepartureAirport departureAirportType = flightSegmentType.getDepartureAirport();
		DepartureAirport departureAirport = new DepartureAirport();
		departureAirport.setLocationCode(departureAirportType.getLocationCode());
		departureAirport.setTerminal(departureAirportType.getTerminal());
		flightSegment.setDepartureAirport(departureAirport);
		FlightSegmentBaseType.ArrivalAirport arrivalAirportType = flightSegmentType.getArrivalAirport();
		ArrivalAirport arrivalAirport = new ArrivalAirport();
		arrivalAirport.setLocationCode(arrivalAirportType.getLocationCode());
		arrivalAirport.setTerminal(arrivalAirportType.getTerminal());
		flightSegment.setArrivalAirport(arrivalAirport);
		OperatingAirlineType operatingAirlineType = flightSegmentType.getOperatingAirline();
		OperatingAirline operatingAirline = new OperatingAirline();
		operatingAirline.setCode(operatingAirlineType.getCode());
		operatingAirline.setCompanyShortName(operatingAirlineType.getCompanyShortName());
		operatingAirline.setFlightNumber(operatingAirlineType.getFlightNumber());
		flightSegment.setOperatingAirline(operatingAirline);
		flightSegments.add(flightSegment);
	    }
	    originDestinationOption.setFlightSegments(flightSegments);

	}
	originDestinationOptions.add(originDestinationOption);
	AirItinerary airItinerary = new AirItinerary();
	airItinerary.setOriginDestinationOptions(originDestinationOptions);
	return airItinerary;
    }

    private TravelerInfo getTravelerInfoData(OTAAirBookRS.AirReservation airReservationType) {
	TravelerInfoType travelerInfoType = airReservationType.getTravelerInfo();
	List<AirTraveler> airTravelers = new ArrayList<>();
	for (TravelerInfoType.AirTraveler airTravelerType : travelerInfoType.getAirTraveler()) {
	    AirTraveler airTraveler = new AirTraveler();
	    PersonNameType personNameType = airTravelerType.getPersonName();
	    PersonName personName = new PersonName();
	    personName.setNamePrefix(personNameType.getNamePrefix());
	    personName.setGivenName(personNameType.getGivenName());
	    personName.setSurname(personNameType.getSurname());
	    List<Document> documents = new ArrayList<>();
	    for (AirTravelerType.Document documentType : airTravelerType.getDocument()) {
		Document document = new Document();
		document.setDocIssueAuthority(documentType.getDocIssueAuthority());
		document.setDocHolderNationality(documentType.getDocHolderNationality());
		document.setDocIssueLocation(documentType.getDocIssueLocation());
		document.setDocID(documentType.getDocID());
		document.setBirthDate(getDateGregorianCalendar(documentType.getBirthDate()));
		document.setDocType(documentType.getDocType());
		document.setGender(documentType.getGender());
		document.setEffectiveDate(getDateGregorianCalendar(documentType.getEffectiveDate()));
		document.setExpireDate(getDateGregorianCalendar(documentType.getExpireDate()));
		document.setDocIssueCountry(documentType.getDocIssueCountry());
		document.setDocHolderName(documentType.getDocHolderName());
		documents.add(document);
	    }
	    airTraveler.setPersonName(personName);
	    airTraveler.setDocuments(documents);
	    airTravelers.add(airTraveler);
	}
	TravelerInfo travelerInfo = new TravelerInfo();
	travelerInfo.setAirTravelers(airTravelers);
	return travelerInfo;
    }

    private AirItineraryType getAirItineraryType(AirItinerary airItinerary) {
	AirItineraryType airItineraryType = new AirItineraryType();
	final AirItineraryType.OriginDestinationOptions originDestinationOptionsType = new AirItineraryType.OriginDestinationOptions();
	for (OriginDestinationOption originDestOptionData : airItinerary.getOriginDestinationOptions()) {
	    final AirItineraryType.OriginDestinationOptions.OriginDestinationOption originDestinationOptionType = new AirItineraryType.OriginDestinationOptions.OriginDestinationOption();
	    for (FlightSegment flightSegment : originDestOptionData.getFlightSegments()) {

		OriginDestinationOptionType.FlightSegment flightSegmentType = new OriginDestinationOptionType.FlightSegment();
		flightSegmentType.setFlightNumber(flightSegment.getFlightNumber());
		flightSegmentType.setDepartureDateTime(toXMLGregorianCalendar(flightSegment.getDepartureDateTime()));
		flightSegmentType.setArrivalDateTime(toXMLGregorianCalendar(flightSegment.getArrivalDateTime()));
		flightSegmentType.setResBookDesigCode(flightSegment.getResBookDesigCode());
		flightSegmentType.setStopQuantity(flightSegment.getStopQuantity());
		DepartureAirport departureAirport = flightSegment.getDepartureAirport();
		FlightSegmentType.DepartureAirport departureAirportType = new FlightSegmentType.DepartureAirport();
		departureAirportType.setLocationCode(departureAirport.getLocationCode());
		departureAirportType.setTerminal(departureAirport.getTerminal());
		flightSegmentType.setDepartureAirport(departureAirportType);
		ArrivalAirport arrivalAirport = flightSegment.getArrivalAirport();
		FlightSegmentType.ArrivalAirport arrivalAirportType = new FlightSegmentType.ArrivalAirport();
		arrivalAirportType.setLocationCode(arrivalAirport.getLocationCode());
		arrivalAirportType.setTerminal(arrivalAirport.getTerminal());
		flightSegmentType.setArrivalAirport(arrivalAirportType);
		flightSegmentType.setMarketingAirline(populateMarketingAirline(flightSegment.getMarketingAirline()));
		OperatingAirline operatingAirline = flightSegment.getOperatingAirline();
		OperatingAirlineType operatingAirlineType = new OperatingAirlineType();
		operatingAirlineType.setCode(operatingAirline.getCode());
		operatingAirlineType.setCompanyShortName(operatingAirline.getCompanyShortName());
		operatingAirlineType.setFlightNumber(operatingAirline.getFlightNumber());
		flightSegmentType.setOperatingAirline(operatingAirlineType);
		OriginDestinationOptionType.FlightSegment flightSegmentOptionType = (OriginDestinationOptionType.FlightSegment) flightSegmentType;
		originDestinationOptionType.getFlightSegment().add(flightSegmentOptionType);
	    }
	    originDestinationOptionsType.getOriginDestinationOption().add(originDestinationOptionType);
	}
	airItineraryType.setOriginDestinationOptions(originDestinationOptionsType);
	return airItineraryType;

    }

    private OTAAirBookRQ.PriceInfo getPriceInfoType(List<ItinTotalFare> itinTotalFares) {

	OTAAirBookRQ.PriceInfo priceInfoType = new OTAAirBookRQ.PriceInfo();
	for (ItinTotalFare itinTotalFare : itinTotalFares) {
	    AirItineraryPricingInfoType.ItinTotalFare itinTotalFaretype;
	    itinTotalFaretype = new AirItineraryPricingInfoType.ItinTotalFare();
	    TotalFare totalFare = itinTotalFare.getTotalFare();
	    FareType.TotalFare totalFareType = new FareType.TotalFare();
	    totalFareType.setCurrencyCode(totalFare.getCurrencyCode());
	    totalFareType.setAmount(totalFare.getAmount());
	    itinTotalFaretype.setTotalFare(totalFareType);
	    priceInfoType.getItinTotalFare().add(itinTotalFaretype);
	}
	return priceInfoType;
    }

    private TravelerInfoType getAirTravelerType(List<AirTraveler> airTravelers) {
	TravelerInfoType travelerInfoType = new TravelerInfoType();
	TravelerInfoType.AirTraveler airTravelerType;
	for (AirTraveler airTraveler : airTravelers) {
	    airTravelerType = new TravelerInfoType.AirTraveler();
	    airTravelerType.setGender(airTraveler.getGender());
	    airTravelerType.setPassengerTypeCode(airTraveler.getPassengerTypeCode());
	    airTravelerType.setBirthDate(toXMLGregorianCalendar(airTraveler.getBirthDate()));
	    //personName
	    PersonName personName = airTraveler.getPersonName();
	    PersonNameType personNameType = new PersonNameType();
	    if (personName.getNamePrefix() != null) {
		personNameType.getNamePrefix().addAll(personName.getNamePrefix());
	    }
	    if (personName.getGivenName() != null) {
		personNameType.getGivenName().addAll(personName.getGivenName());
	    }
	    personNameType.setSurname(personName.getSurname());
	    airTravelerType.setPersonName(personNameType);
	    //document
	    AirTravelerType.Document documentType;
	    if (airTraveler.getDocuments() != null) {
		for (Document document : airTraveler.getDocuments()) {
		    documentType = new AirTravelerType.Document();
		    documentType.setDocIssueAuthority(document.getDocIssueAuthority());
		    documentType.setDocHolderNationality(document.getDocHolderNationality());
		    documentType.setDocIssueLocation(document.getDocIssueLocation());
		    documentType.setDocID(document.getDocID());
		    documentType.setBirthDate(toXMLGregorianCalendar(document.getBirthDate()));
		    documentType.setDocType(document.getDocType());
		    documentType.setGender(document.getGender());
		    documentType.setEffectiveDate(toXMLGregorianCalendar(document.getEffectiveDate()));
		    documentType.setExpireDate(toXMLGregorianCalendar(document.getExpireDate()));
		    documentType.setDocIssueCountry(document.getDocIssueCountry());
		    documentType.setDocHolderName(document.getDocHolderName());
		    airTravelerType.getDocument().add(documentType);
		}
	    }
	    AirTravelerType.Address addressType;
	    for (Address address : airTraveler.getAddresses()) {

		addressType = new AirTravelerType.Address();
		addressType.setCityName(address.getCityName());
		addressType.setPostalCode(address.getPostalCode());
		if (address.getAddressLine() != null) {
		    addressType.getAddressLine().addAll(address.getAddressLine());
		}
		com.cnk.travelogix.suppliers.air.data.StateProv stateProv = address.getStateProv();

		StateProvType stateProvType = new StateProvType();
		if (stateProv != null) {
		    stateProvType.setStateCode(stateProv.getStateCode());
		    addressType.setStateProv(stateProvType);
		}
		com.cnk.travelogix.suppliers.air.data.CountryName countryName = address.getCountryName();
		CountryNameType countryNameType = new CountryNameType();
		countryNameType.setCode(countryName.getCode());
		countryNameType.setValue(countryName.getValue());
		addressType.setCountryName(countryNameType);
		airTravelerType.getAddress().add(addressType);
	    }
	    Telephone telephoneType;
	    if (airTraveler.getTelephones() != null) {
		for (com.cnk.travelogix.suppliers.air.data.Telephone telephone : airTraveler.getTelephones()) {
		    telephoneType = new Telephone();
		    telephoneType.setLocationCode(telephone.getLocationCode());
		    telephoneType.setPhoneUseType(telephone.getPhoneUseType());
		    telephoneType.setCountryAccessCode(telephone.getCountryAccessCode());
		    telephoneType.setPhoneNumber(telephone.getPhoneNumber());
		    airTravelerType.getTelephone().add(telephoneType);
		}
	    }
	    Email email;
	    if (airTraveler.getEmails() != null) {
		for (com.cnk.travelogix.suppliers.air.data.Email emailData : airTraveler.getEmails()) {
		    email = new Email();
		    email.setValue(emailData.getValue());
		    airTravelerType.getEmail().add(email);
		}
	    }
	    AirTravelerType.TravelerRefNumber travelerRefNumberType = new AirTravelerType.TravelerRefNumber();
	    TravelerRefNumber travelerRefNumber = airTraveler.getTravelerRefNumber();
	    travelerRefNumberType.setRPH(travelerRefNumber.getRph());
	    airTravelerType.setTravelerRefNumber(travelerRefNumberType);
	    travelerInfoType.getAirTraveler().add(airTravelerType);

	}
	return travelerInfoType;
    }

    private FulfillmentType getFulfillmentType(Fulfillment fulfillment) {
	FulfillmentType fulfillmentType = new FulfillmentType();
	FulfillmentType.PaymentDetails paymentDetailsType = new FulfillmentType.PaymentDetails();

	PaymentDetails paymentDetails = fulfillment.getPaymentDetails();
	for (PaymentDetail paymentDetail : paymentDetails.getPaymentDetail()) {
	    FulfillmentType.PaymentDetails.PaymentDetail paymentDetailType = new FulfillmentType.PaymentDetails.PaymentDetail();
	    paymentDetailType.setPaymentType(paymentDetail.getPaymentType());
	    paymentDetailType.setGuaranteeID(paymentDetail.getGuaranteeID());
	    paymentDetailType.setCostCenterID(paymentDetail.getCostCenterID());
	    PaymentAmount paymentAmount = paymentDetail.getPaymentAmount();
	    PaymentDetailType.PaymentAmount paymentAmountType = new PaymentDetailType.PaymentAmount();
	    paymentAmountType.setCurrencyCode(paymentAmount.getCurrencyCode());
	    paymentAmountType.setAmount(paymentAmount.getAmount());
	    paymentDetailType.getPaymentAmount().add(paymentAmountType);
	    paymentDetailsType.getPaymentDetail().add(paymentDetailType);
	}
	fulfillmentType.setPaymentDetails(paymentDetailsType);
	return fulfillmentType;
    }
}