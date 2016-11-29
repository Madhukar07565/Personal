package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AirItineraryPricingInfoType.ItinTotalFare;
import org.opentravel.ota._2003._05.AirItineraryType;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions.OriginDestinationOption;
import org.opentravel.ota._2003._05.BookingPriceInfoType;
import org.opentravel.ota._2003._05.OTAAirBookModifyRQ;
import org.opentravel.ota._2003._05.OTAAirBookModifyRQ.AirBookModifyRQ;
import org.opentravel.ota._2003._05.OTAAirBookRS;
import org.opentravel.ota._2003._05.OTAAirBookRS.AirReservation;
import org.opentravel.ota._2003._05.OriginDestinationOptionType.FlightSegment;
import org.opentravel.ota._2003._05.SpecialReqDetailsType;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SeatRequests;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SeatRequests.SeatRequest;
import org.opentravel.ota._2003._05.TravelerInfoType;

import com.cnk.travelogix.suppliers.air.data.AirBookModify;
import com.cnk.travelogix.suppliers.air.data.AirBookModifyRequest;
import com.cnk.travelogix.suppliers.air.data.AirBookRS;
import com.cnk.travelogix.suppliers.air.data.AirBookResponse;
import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.AirPushSeatRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPushSeatResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.BookingPriceInfo;
import com.cnk.travelogix.suppliers.air.data.SpecialReqDetail;
import com.cnk.travelogix.suppliers.air.data.TravelerInfo;
import com.coxandkings.integ.suppl.air.OTAAirBookModifyRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirBookRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

/**
 * Air Push Seat Converter
 */
public class AirPushSeatConverter extends AirBaseConverter {

    /**
     * @param requestWrapper
     * @return airInterfaceRQ
     */
    public AirInterfaceRQ toOTAAirPushSeatRQ(AirPushSeatRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAAirBookModifyRQWrapper otaAirBookModifyRQWrapper;

	final List<AirBookModifyRequest> airBookModifyRequestData = requestWrapper.getAirBookModifyRQWrapper();
	for (AirBookModifyRequest airBookModifyRequest : airBookModifyRequestData) {
	    otaAirBookModifyRQWrapper = new OTAAirBookModifyRQWrapper();
	    OTAAirBookModifyRQ otaAirBookModifyRQ = new OTAAirBookModifyRQ();
	    if (airBookModifyRequest.getSequence() != null)
		otaAirBookModifyRQWrapper.setSequence(airBookModifyRequest.getSequence());
	    com.cnk.travelogix.suppliers.air.data.AirBookModifyRQ airBookModifyRqData = airBookModifyRequest.getAirBookModifyRQ();

	    AirBookModify airBookModifyData = airBookModifyRqData.getAirBookModify();
	    AirBookModifyRQ airBookModifyRQ = new AirBookModifyRQ();
	    AirItinerary airItineraryData = airBookModifyData.getAirItinerary();
	    AirItineraryType airItineraryType = new AirItineraryType();
	    OriginDestinationOptions originDestinationOptions = new OriginDestinationOptions();
	    List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestinationOptionsDataList = airItineraryData.getOriginDestinationOptions();
	    for (com.cnk.travelogix.suppliers.air.data.OriginDestinationOption originDestinationOptionData : originDestinationOptionsDataList) {
		OriginDestinationOption originDestinationOption = new OriginDestinationOption();
		List<com.cnk.travelogix.suppliers.air.data.FlightSegment> flightSegmentsDataList = originDestinationOptionData.getFlightSegments();
		for (com.cnk.travelogix.suppliers.air.data.FlightSegment flightSegmentData : flightSegmentsDataList) {
		    FlightSegment flightSegment = new FlightSegment();
		    flightSegment.setDepartureDateTime(toXMLGregorianCalendar(flightSegmentData.getDepartureDateTime()));
		    flightSegment.setOperatingAirline(populateOperatingAirline(flightSegmentData.getOperatingAirline()));
		    flightSegment.setDepartureAirport(populateDepartureAirport(flightSegmentData.getDepartureAirport()));
		    flightSegment.setArrivalAirport(populateArrivalAirport(flightSegmentData.getArrivalAirport()));

		    originDestinationOption.getFlightSegment().add(flightSegment);
		}
		originDestinationOptions.getOriginDestinationOption().add(originDestinationOption);
	    }
	    airItineraryType.setOriginDestinationOptions(originDestinationOptions);
	    airBookModifyRQ.setAirItinerary(airItineraryType);

	    TravelerInfo travelerInfoData = airBookModifyData.getTravelerInfo();
	    TravelerInfoType travelerInfoType = new TravelerInfoType();
	    SpecialReqDetailsType specialReqDetailsType = new SpecialReqDetailsType();
	    List<SpecialReqDetail> specialReqDetailData = travelerInfoData.getSpecialReqDetails();
	    SeatRequests seatRequests = new SeatRequests();
	    for (SpecialReqDetail specialReqDetail : specialReqDetailData) {
		List<com.cnk.travelogix.suppliers.air.data.SeatRequest> seatRequestListData = specialReqDetail.getSeatRequests();
		for (com.cnk.travelogix.suppliers.air.data.SeatRequest seatRequestData : seatRequestListData) {
		    SeatRequest seatRequest = new SeatRequest();
		    seatRequest.getFlightRefNumberRPHList().addAll(seatRequestData.getFlightRefNumberRPH());
		    seatRequest.setSeatNumber(seatRequestData.getSeatNumber());
		    seatRequests.getSeatRequest().add(seatRequest);
		}
	    }
	    specialReqDetailsType.setSeatRequests(seatRequests);
	    travelerInfoType.getSpecialReqDetails().add(specialReqDetailsType);
	    airBookModifyRQ.setTravelerInfo(travelerInfoType);
	    otaAirBookModifyRQ.setAirBookModifyRQ(airBookModifyRQ);
	    otaAirBookModifyRQWrapper.setOTAAirBookModifyRQ(otaAirBookModifyRQ);

	    requestBody.getOTAAirBookModifyRQWrapper().add(otaAirBookModifyRQWrapper);
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;
    }

    /**
     * 
     * @param airInterfaceRS
     * @return airPushSeatResponseWrapper
     */
    public AirPushSeatResponseWrapper fromOTAAirPushSeatRS(AirInterfaceRS airInterfaceRS) {
	final AirPushSeatResponseWrapper airPushSeatResponseWrapper = new AirPushSeatResponseWrapper();
	AirBookResponse airBookResponseData;
	final List<AirBookResponse> airBookResponsesData = new ArrayList<>();
	final List<OTAAirBookRSWrapper> otaAirBookRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirBookRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirBookRSWrapper otaAirBookRSWrapper : otaAirBookRSWrapperList) {
		airBookResponseData = new AirBookResponse();
		final AirBookRS airBookRSData = new AirBookRS();
		airBookResponseData.setSequence(otaAirBookRSWrapper.getSequence());
		String supplierId = otaAirBookRSWrapper.getSupplierID().getValue();
		final OTAAirBookRS otaAirBookRS = otaAirBookRSWrapper.getOTAAirBookRS();
		if (!hasError(otaAirBookRSWrapper.getErrorList())) {
		    final List<Object> successAndWarningsAndAirReservation = otaAirBookRS.getSuccessAndWarningsAndAirReservation();
		    for (Object object : successAndWarningsAndAirReservation) {
			com.cnk.travelogix.suppliers.air.data.AirReservation airReservationData = new com.cnk.travelogix.suppliers.air.data.AirReservation();
			if (object instanceof AirReservation) {
			    final AirReservation airReservation = (AirReservation) object;
			    BookingPriceInfoType bookingPriceInfoType = airReservation.getPriceInfo();
			    BookingPriceInfo bookingPriceInfoData = new BookingPriceInfo();
			    List<com.cnk.travelogix.suppliers.air.data.ItinTotalFare> itinTotalFareListData = populateItinTotalFare(bookingPriceInfoType.getItinTotalFare());
			    bookingPriceInfoData.setItinTotalFares(itinTotalFareListData);
			    airReservationData.setPriceInfo(bookingPriceInfoData);
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
	airPushSeatResponseWrapper.setAirBookResponses(airBookResponsesData);
	airPushSeatResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airPushSeatResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airPushSeatResponseWrapper;
    }

    /**
     * @param itinTotalFares
     * @return itinTotalFareListData
     */
    public List<com.cnk.travelogix.suppliers.air.data.ItinTotalFare> populateItinTotalFare(List<ItinTotalFare> itinTotalFares) {
	List<com.cnk.travelogix.suppliers.air.data.ItinTotalFare> itinTotalFareListData = new ArrayList<>();
	for (ItinTotalFare itinTotalFare : itinTotalFares) {
	    com.cnk.travelogix.suppliers.air.data.ItinTotalFare itinTotalFareData = new com.cnk.travelogix.suppliers.air.data.ItinTotalFare();
	    itinTotalFareData.setEquivFares(getEquivFaresData(itinTotalFare.getEquivFare()));
	    itinTotalFareData.setTotalFare(getTotalFareData(itinTotalFare.getTotalFare()));
	    itinTotalFareListData.add(itinTotalFareData);
	}
	return itinTotalFareListData;
    }
}
