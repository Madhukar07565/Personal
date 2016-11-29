/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AirItineraryPricingInfoType.ItinTotalFare;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions.OriginDestinationOption;
import org.opentravel.ota._2003._05.AirReservationType.BookingReferenceID;
import org.opentravel.ota._2003._05.AirTravelerType.Document;
import org.opentravel.ota._2003._05.AirTravelerType.TravelerRefNumber;
import org.opentravel.ota._2003._05.CompanyNameType;
import org.opentravel.ota._2003._05.OTAAirBookRS;
import org.opentravel.ota._2003._05.OTAReadRQ;
import org.opentravel.ota._2003._05.OriginDestinationOptionType.FlightSegment;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.PTCFareBreakdownType;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TicketingInfoType;
import org.opentravel.ota._2003._05.TravelerInfoType.AirTraveler;
import org.opentravel.ota._2003._05.UniqueIDType;
import org.springframework.util.StringUtils;

import com.cnk.travelogix.suppliers.air.data.AirBookRS;
import com.cnk.travelogix.suppliers.air.data.AirBookResponse;
import com.cnk.travelogix.suppliers.air.data.AirBookResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.AirReadRQ;
import com.cnk.travelogix.suppliers.air.data.AirReadReq;
import com.cnk.travelogix.suppliers.air.data.AirReadRequest;
import com.cnk.travelogix.suppliers.air.data.AirReadRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirReservation;
import com.cnk.travelogix.suppliers.air.data.BookingPriceInfo;
import com.cnk.travelogix.suppliers.air.data.CompanyName;
import com.cnk.travelogix.suppliers.air.data.PTCFareBreakdown;
import com.cnk.travelogix.suppliers.air.data.PersonName;
import com.cnk.travelogix.suppliers.air.data.TicketingInfo;
import com.cnk.travelogix.suppliers.air.data.TravelerInfo;
import com.cnk.travelogix.suppliers.air.data.UniqueID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.OTAAirBookRSWrapper;
import com.coxandkings.integ.suppl.air.OTAReadRQWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * @author I077988
 */
public class AirRetrievePNRConverter extends AirBaseConverter {

    /**
     * @param request
     *            AirReadRequest
     * @return AirInterfaceRQ
     */
    public AirInterfaceRQ toOTAReadRQ(final AirReadRequestWrapper request) {

	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	final OTAReadRQWrapper otaReadRQWrapper = new OTAReadRQWrapper();

	final List<AirReadRequest> airReadRequests = request.getAirReadRequests();
	for (AirReadRequest airReadRequestData : airReadRequests) {

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(airReadRequestData.getSupplierID().getValue());
	    supplierIDType.setMarketType(airReadRequestData.getSupplierID().getMarketType());
	    otaReadRQWrapper.setSupplierID(supplierIDType);

	    final OTAReadRQ otaReadRQ = new OTAReadRQ();
	    final AirReadRQ airReadRQ = airReadRequestData.getAirReadRQ();
	    otaReadRQ.setTimeStamp(toXMLGregorianCalendar(airReadRQ.getTimeStamp()));
	    otaReadRQ.setVersion(airReadRQ.getVersion());
	    otaReadRQ.setTarget(airReadRQ.getTarget());
	    otaReadRQ.setTransactionStatusCode(airReadRQ.getTransactionStatusCode());
	    otaReadRQ.setPrimaryLangID(airReadRQ.getPrimaryLangID());

	    final POSType pos = new POSType();
	    final SourceType sourceType = new SourceType();
	    pos.getSource().add(sourceType);
	    otaReadRQ.setPOS(pos);

	    final UniqueIDType uniqueID = new UniqueIDType();
	    final UniqueID uniqueIDData = airReadRQ.getUniqueID();
	    uniqueID.setURL(uniqueIDData.getUrl());
	    uniqueID.setType(uniqueIDData.getType());
	    uniqueID.setInstance(uniqueIDData.getInstance());
	    uniqueID.setID(uniqueIDData.getId());
	    uniqueID.setIDContext(uniqueIDData.getIdContext());
	    final CompanyNameType companyName = new CompanyNameType();
	    final CompanyName companyNameData = uniqueIDData.getCompanyName();
	    companyName.setCompanyShortName(companyNameData.getCompanyShortName());
	    companyName.setTravelSector(companyNameData.getTravelSector());
	    companyName.setCode(companyNameData.getCode());
	    uniqueID.setCompanyName(companyName);
	    otaReadRQ.setUniqueID(uniqueID);

	    final OTAReadRQ.ReadRequests readRequests = new OTAReadRQ.ReadRequests();
	    OTAReadRQ.ReadRequests.AirReadRequest airReadRequest;
	    final List<AirReadReq> airReadReqsData = airReadRQ.getAirReadReqs();
	    for (AirReadReq airReadReqData : airReadReqsData) {
		airReadRequest = new OTAReadRQ.ReadRequests.AirReadRequest();
		airReadRequest.setStart(getDateAsString(airReadReqData.getStart()));
		airReadRequest.setEnd(getDateAsString(airReadReqData.getEnd()));
		final TPAExtensions tpaExtensionsData = airReadReqData.getTpaExtensions();
		if (tpaExtensionsData != null) {
		    final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
		    airReadRequest.setTPAExtensions(tpaExtensionsType);
		}
		readRequests.getAirReadRequest().add(airReadRequest);
	    }
	    otaReadRQ.setReadRequests(readRequests);

	    otaReadRQWrapper.setOTAReadRQ(otaReadRQ);
	    requestBody.getOTAReadRQWrapper().add(otaReadRQWrapper);
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(request.getRequestHeader()));
	return airInterfaceRQ;
    }

    /**
     * @param airInterfaceRS
     *            AirInterfaceRS
     * @return AirBookResponseWrapper
     */
    public AirBookResponseWrapper fromOTAAirBookRS(final AirInterfaceRS airInterfaceRS) {
	final AirBookResponseWrapper airBookResponseWrapper = new AirBookResponseWrapper();
	AirBookResponse airBookResponseData;
	final List<AirBookResponse> airBookResponsesData = new ArrayList<>();
	final List<OTAAirBookRSWrapper> otaAirBookRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirBookRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirBookRSWrapper otaAirBookRSWrapper : otaAirBookRSWrapperList) {
		airBookResponseData = new AirBookResponse();
		airBookResponseData.setSequence(otaAirBookRSWrapper.getSequence());
		String supplierId = otaAirBookRSWrapper.getSupplierID().getValue();
		if (!hasError(otaAirBookRSWrapper.getErrorList())) {
		    final AirBookRS airBookRSData = new AirBookRS();
		    final OTAAirBookRS otaAirBookRS = otaAirBookRSWrapper.getOTAAirBookRS();
		    airBookRSData.setVersion(otaAirBookRS.getVersion());
		    airBookRSData.setPrimaryLangID(otaAirBookRS.getPrimaryLangID());
		    final List<Object> successAndWarningsAndAirReservation = otaAirBookRS.getSuccessAndWarningsAndAirReservation();
		    for (Object object : successAndWarningsAndAirReservation) {
			if (object instanceof OTAAirBookRS.AirReservation) {
			    final OTAAirBookRS.AirReservation airReservation = (OTAAirBookRS.AirReservation) object;
			    final AirReservation airReservationData = getAirReservationData(airReservation);
			    airBookRSData.setAirReservation(airReservationData);
			}
		    }
		    airBookRSData.setErrors(getErrorsData(otaAirBookRS.getErrors(), supplierId));
		    airBookResponseData.setAirBookRS(airBookRSData);
		}
		airBookResponseData.setErrors(getErrorsListData(otaAirBookRSWrapper.getErrorList(), supplierId));
		airBookResponsesData.add(airBookResponseData);
	    }
	}
	airBookResponseWrapper.setAirBookResponses(airBookResponsesData);
	airBookResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airBookResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airBookResponseWrapper;
    }

    /**
     * @param airReservation
     * @return airReservationData
     */
    private AirReservation getAirReservationData(final OTAAirBookRS.AirReservation airReservation) {
	final AirReservation airReservationData = new AirReservation();
	final String createDateTime = airReservation.getCreateDateTime();
	final String lastModified = airReservation.getLastModified();
	if (StringUtils.hasLength(createDateTime) && StringUtils.hasLength(lastModified)) {
	    airReservationData.setCreateDateTime(getStringAsDate(createDateTime));
	    airReservationData.setLastModified(getStringAsDate(lastModified));
	}

	final List<OriginDestinationOption> originDestinationOptions = airReservation.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption();
	final AirItinerary airItineraryData = getAirItineraryData(originDestinationOptions);
	airReservationData.setAirItinerary(airItineraryData);

	final BookingPriceInfo priceInfo = getBookingPriceInfoData(airReservation);

	airReservationData.setPriceInfo(priceInfo);

	final List<BookingReferenceID> bookingReferenceIds = airReservation.getBookingReferenceID();
	com.cnk.travelogix.suppliers.air.data.BookingReferenceID bookingReferenceIdData;
	final List<com.cnk.travelogix.suppliers.air.data.BookingReferenceID> bookingReferenceIdsData = new ArrayList<>();
	if (bookingReferenceIds != null && !bookingReferenceIds.isEmpty()) {
	    for (BookingReferenceID bookingReferenceID : bookingReferenceIds) {
		bookingReferenceIdData = new com.cnk.travelogix.suppliers.air.data.BookingReferenceID();
		bookingReferenceIdData.setId(bookingReferenceID.getID());
		bookingReferenceIdData.setType(bookingReferenceID.getType());
		bookingReferenceIdsData.add(bookingReferenceIdData);
	    }
	    airReservationData.setBookingReferenceIds(bookingReferenceIdsData);
	}

	final List<TicketingInfoType> ticketingInfos = airReservation.getTicketing();
	if (ticketingInfos != null && !ticketingInfos.isEmpty()) {
	    TicketingInfo ticketingInfoData;
	    List<TicketingInfo> ticketingInfosData = new ArrayList<>();
	    for (TicketingInfoType ticketingInfo : ticketingInfos) {
		ticketingInfoData = new TicketingInfo();
		ticketingInfoData.setTicketType(ticketingInfo.getTicketType().toString());
		ticketingInfoData.setTravelerRefNumber(ticketingInfo.getTravelerRefNumber());
		ticketingInfoData.setPassengerTypeCode(ticketingInfo.getPassengerTypeCode());
		ticketingInfoData.setTicketDocumentNbr(ticketingInfo.getTicketDocumentNbr());

		ticketingInfosData.add(ticketingInfoData);
	    }
	    airReservationData.setTicketingInfos(ticketingInfosData);
	}
	return airReservationData;
    }

    /**
     * @param airReservation
     * @return bookingPriceInfoData
     */
    private BookingPriceInfo getBookingPriceInfoData(final OTAAirBookRS.AirReservation airReservation) {
	final BookingPriceInfo bookingPriceInfoData = new BookingPriceInfo();
	final List<ItinTotalFare> itinTotalFares = airReservation.getPriceInfo().getItinTotalFare();
	final List<com.cnk.travelogix.suppliers.air.data.ItinTotalFare> itinTotalFaresData = populateTotalFares(itinTotalFares);
	bookingPriceInfoData.setItinTotalFares(itinTotalFaresData);

	final List<PTCFareBreakdownType> ptcFareBreakdownTypes = airReservation.getPriceInfo().getPTCFareBreakdowns().getPTCFareBreakdown();
	final List<PTCFareBreakdown> ptcFareBreakdownTypesData = getPTCFareBreakdownData(ptcFareBreakdownTypes);
	bookingPriceInfoData.setPtcFareBreakdowns(ptcFareBreakdownTypesData);

	final List<AirTraveler> airTravelers = airReservation.getTravelerInfo().getAirTraveler();
	final TravelerInfo travelerInfoData = new TravelerInfo();
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

	    final List<Document> documents = airTraveler.getDocument();
	    com.cnk.travelogix.suppliers.air.data.Document documentData;
	    final List<com.cnk.travelogix.suppliers.air.data.Document> documentsData = new ArrayList<>();
	    for (Document document : documents) {
		documentData = new com.cnk.travelogix.suppliers.air.data.Document();
		documentData.setDocID(document.getDocID());
		documentData.setDocType(document.getDocType());
		documentsData.add(documentData);
	    }
	    airTravelerData.setDocuments(documentsData);

	    final TravelerRefNumber travelerRefNumber = airTraveler.getTravelerRefNumber();
	    if (travelerRefNumber != null) {
		final com.cnk.travelogix.suppliers.air.data.TravelerRefNumber travelerRefNumberData = new com.cnk.travelogix.suppliers.air.data.TravelerRefNumber();
		travelerRefNumberData.setRph(travelerRefNumber.getRPH());
		airTravelerData.setTravelerRefNumber(travelerRefNumberData);
	    }
	    airTravelersData.add(airTravelerData);
	}
	travelerInfoData.setAirTravelers(airTravelersData);
	bookingPriceInfoData.setTravelerInfo(travelerInfoData);
	return bookingPriceInfoData;
    }

    /**
     * @param originDestinationOptions
     * @return airItineraryData
     */
    private AirItinerary getAirItineraryData(final List<OriginDestinationOption> originDestinationOptions) {
	final AirItinerary airItineraryData = new AirItinerary();
	com.cnk.travelogix.suppliers.air.data.OriginDestinationOption originDestinationOptionData;
	final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestinationOptionsData = new ArrayList<>();
	for (OriginDestinationOption originDestinationOption : originDestinationOptions) {
	    originDestinationOptionData = new com.cnk.travelogix.suppliers.air.data.OriginDestinationOption();
	    originDestinationOptionData.setRph(originDestinationOption.getRPH());
	    final List<FlightSegment> flightSegments = originDestinationOption.getFlightSegment();
	    com.cnk.travelogix.suppliers.air.data.FlightSegment flightSegmentData;
	    final List<com.cnk.travelogix.suppliers.air.data.FlightSegment> flightSegmentsData = new ArrayList<>();
	    for (FlightSegment flightSegment : flightSegments) {
		flightSegmentData = new com.cnk.travelogix.suppliers.air.data.FlightSegment();
		flightSegmentData.setArrivalDateTime(flightSegment.getArrivalDateTime().toGregorianCalendar().getTime());
		flightSegmentData.setDepartureDateTime(flightSegment.getDepartureDateTime().toGregorianCalendar().getTime());
		flightSegmentData.setDepartureAirport(getDepartureAirportData(flightSegment.getDepartureAirport()));
		flightSegmentData.setArrivalAirport(getArrivalAirportData(flightSegment.getArrivalAirport()));
		flightSegmentData.setOperatingAirline(getOperatingAirlineData(flightSegment.getOperatingAirline()));
		flightSegmentsData.add(flightSegmentData);
	    }
	    originDestinationOptionData.setFlightSegments(flightSegmentsData);
	    originDestinationOptionsData.add(originDestinationOptionData);
	}
	airItineraryData.setOriginDestinationOptions(originDestinationOptionsData);
	return airItineraryData;
    }
    /*
     *//**
        * @param ptcFareBreakdownTypes
        * @return ptcFareBreakdownTypesData
        *//*
	  * private List<PTCFareBreakdown> getPTCFareBreakdownData(final
	  * List<PTCFareBreakdownType> ptcFareBreakdownTypes) { PTCFareBreakdown
	  * ptcFareBreakdownData; final List<PTCFareBreakdown>
	  * ptcFareBreakdownTypesData = new ArrayList<>(); for
	  * (PTCFareBreakdownType ptcFareBreakdownType : ptcFareBreakdownTypes)
	  * { ptcFareBreakdownData = new PTCFareBreakdown(); final
	  * PricingSourceType pricingSource =
	  * ptcFareBreakdownType.getPricingSource(); if (pricingSource != null)
	  * { ptcFareBreakdownData.setPricingSource(pricingSource.toString()); }
	  * ptcFareBreakdownData.setFlightRefNumberRPHList(ptcFareBreakdownType.
	  * getFlightRefNumberRPHList());
	  * 
	  * final PassengerTypeQuantityType passengerTypeQuantity =
	  * ptcFareBreakdownType.getPassengerTypeQuantity(); final
	  * PassengerTypeQuantity passengerTypeQuantitydata = new
	  * PassengerTypeQuantity(); passengerTypeQuantity.getCode();
	  * passengerTypeQuantity.getQuantity();
	  * ptcFareBreakdownData.setPassengerTypeQuantity(
	  * passengerTypeQuantitydata);
	  * 
	  * final FareBasisCodes fareBasisCodes =
	  * ptcFareBreakdownType.getFareBasisCodes(); if (fareBasisCodes !=
	  * null) { final List<FareBasisCodeType> fareBasisCodeTypes =
	  * fareBasisCodes.getFareBasisCode();
	  * com.cnk.travelogix.suppliers.air.data.FareBasisCodeType
	  * fareBasisCodeTypeData; final
	  * List<com.cnk.travelogix.suppliers.air.data.FareBasisCodeType>
	  * fareBasisCodeTypesData = new ArrayList<>(); for (FareBasisCodeType
	  * fareBasisCodeType : fareBasisCodeTypes) { fareBasisCodeTypeData =
	  * new com.cnk.travelogix.suppliers.air.data.FareBasisCodeType();
	  * fareBasisCodeTypeData.setFlightSegmentRPH(fareBasisCodeType.
	  * getFlightSegmentRPH());
	  * fareBasisCodeTypeData.setValue(fareBasisCodeType.getValue());
	  * fareBasisCodeTypesData.add(fareBasisCodeTypeData); }
	  * ptcFareBreakdownData.setFareBasisCodeTypes(fareBasisCodeTypesData);
	  * } final List<PassengerFare> passengerFares =
	  * ptcFareBreakdownType.getPassengerFare();
	  * com.cnk.travelogix.suppliers.air.data.PassengerFare
	  * passengerFareData; final
	  * List<com.cnk.travelogix.suppliers.air.data.PassengerFare>
	  * passengerFaresData = new ArrayList<>(); for (PassengerFare
	  * passengerFare : passengerFares) { passengerFareData = new
	  * com.cnk.travelogix.suppliers.air.data.PassengerFare();
	  * passengerFareData.setBaseFare(getBaseFareData(passengerFare.
	  * getBaseFare()));
	  * passengerFareData.setEquivFares(getEquivFaresData(passengerFare.
	  * getEquivFare()));
	  * passengerFareData.setTaxes(getTaxesData(passengerFare.getTaxes()));
	  * passengerFareData.setFees(getFeesData(passengerFare.getFees()));
	  * passengerFareData.setTotalFare(getTotalFareData(passengerFare.
	  * getTotalFare())); passengerFaresData.add(passengerFareData); }
	  * ptcFareBreakdownData.setPassengerFares(passengerFaresData); final
	  * List<FareInfo> fareInfos = ptcFareBreakdownType.getFareInfo();
	  * com.cnk.travelogix.suppliers.air.data.FareInfo fareInfoData; final
	  * List<com.cnk.travelogix.suppliers.air.data.FareInfo> fareInfosData =
	  * new ArrayList<>(); for (FareInfo fareInfo : fareInfos) {
	  * fareInfoData = new com.cnk.travelogix.suppliers.air.data.FareInfo();
	  * fareInfoData.setCurrencyCode(fareInfo.getCurrencyCode()); final
	  * List<FareReference> fareReferences = fareInfo.getFareReference();
	  * com.cnk.travelogix.suppliers.air.data.FareReference
	  * fareReferenceData; final
	  * List<com.cnk.travelogix.suppliers.air.data.FareReference>
	  * fareReferencesData = new ArrayList<>(); for (FareReference
	  * fareReference : fareReferences) { fareReferenceData = new
	  * com.cnk.travelogix.suppliers.air.data.FareReference();
	  * fareReferenceData.setResBookDesigCode(fareReference.
	  * getResBookDesigCode()); fareReferencesData.add(fareReferenceData); }
	  * fareInfoData.setFareReferences(fareReferencesData);
	  * 
	  * final List<org.opentravel.ota._2003._05.FareInfoType.FareInfo>
	  * fareInfoTypes = fareInfo.getFareInfo();
	  * com.cnk.travelogix.suppliers.air.data.FareInfoType fareInfoTypeData;
	  * final List<com.cnk.travelogix.suppliers.air.data.FareInfoType>
	  * fareInfoTypesData = new ArrayList<>(); for
	  * (org.opentravel.ota._2003._05.FareInfoType.FareInfo fareInfoType :
	  * fareInfoTypes) { fareInfoTypeData = new FareInfoType();
	  * fareInfoTypeData.setFareType(fareInfoType.getFareType());
	  * fareInfoTypeData.setFareBasisCode(fareInfoType.getFareBasisCode());
	  * fareInfoTypeData.setFareStatus(fareInfoType.getFareStatus().toString
	  * ()); fareInfoTypesData.add(fareInfoTypeData); }
	  * fareInfoData.setFareInfoTypes(fareInfoTypesData);
	  * 
	  * fareInfosData.add(fareInfoData); }
	  * ptcFareBreakdownData.setFareInfos(fareInfosData);
	  * ptcFareBreakdownTypesData.add(ptcFareBreakdownData); } return
	  * ptcFareBreakdownTypesData; }
	  */
}
