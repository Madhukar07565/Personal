package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.OTAAirSeatMapRQ.AirTravelers;
import org.opentravel.ota._2003._05.OTAAirSeatMapRQ.AirTravelers.AirTraveler;
import org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests.SeatMapRequest;
import org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests.SeatMapRequest.FlightSegmentInfo;
import org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests.SeatMapRequest.SeatDetails;
import org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests.SeatMapRequest.SeatDetails.CabinClass;
import org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests.SeatMapRequest.SeatDetails.ResBookDesignations;
import org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests.SeatMapRequest.SeatDetails.ResBookDesignations.ResBookDesignation;
import org.opentravel.ota._2003._05.OTAAirSeatMapRS;
import org.opentravel.ota._2003._05.OTAAirSeatMapRS.SeatMapResponses;
import org.opentravel.ota._2003._05.OTAAirSeatMapRS.SeatMapResponses.SeatMapResponse;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.TPAExtensionsType;

import com.cnk.travelogix.suppliers.air.data.AirSeatMapRS;
import com.cnk.travelogix.suppliers.air.data.AirSeatMapRequest;
import com.cnk.travelogix.suppliers.air.data.AirSeatMapRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirSeatMapResponse;
import com.cnk.travelogix.suppliers.air.data.AirSeatMapResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.SeatMapDetailsType;
import com.cnk.travelogix.suppliers.air.data.SeatMapRequests;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.OTAAirSeatMapRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirSeatMapRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

public class AirSeatMapConverter extends AirBaseConverter {

    public AirInterfaceRQ otaAirSeatMapRQ(final AirSeatMapRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAAirSeatMapRQWrapper airSeatMapRQWrapper;
	final List<AirSeatMapRequest> airSeatMapRequestsData = requestWrapper.getAirSeatMapRequests();
	for (AirSeatMapRequest airSeatMapRequestData : airSeatMapRequestsData) {
	    airSeatMapRQWrapper = new OTAAirSeatMapRQWrapper();

	    final SupplierIDType supplierIDType = populateSupplierId(airSeatMapRequestData.getSupplierID());
	    airSeatMapRQWrapper.setSupplierID(supplierIDType);
	    airSeatMapRQWrapper.setSequence(airSeatMapRequestData.getSequence());

	    SeatMapRequests airSeatMapRequestsDatas = airSeatMapRequestData.getAirSeatMapRQ().getSeatMapRequests();
	    org.opentravel.ota._2003._05.OTAAirSeatMapRQ otaAirSeatMapRQ = new org.opentravel.ota._2003._05.OTAAirSeatMapRQ();

	    otaAirSeatMapRQ.setEchoToken(airSeatMapRequestData.getAirSeatMapRQ().getEchoToken());
	    otaAirSeatMapRQ.setVersion(airSeatMapRequestData.getAirSeatMapRQ().getVersion());
	    otaAirSeatMapRQ.setTransactionIdentifier(airSeatMapRequestData.getAirSeatMapRQ().getTransactionIdentifier());
	    otaAirSeatMapRQ.setTransactionStatusCode(airSeatMapRequestData.getAirSeatMapRQ().getTransactionStatusCode());
	    otaAirSeatMapRQ.setRetransmissionIndicator(airSeatMapRequestData.getAirSeatMapRQ().getRetransmissionIndicator());
	    otaAirSeatMapRQ.setPrimaryLangID(airSeatMapRequestData.getAirSeatMapRQ().getPrimaryLangID());
	    otaAirSeatMapRQ.setAltLangID(airSeatMapRequestData.getAirSeatMapRQ().getAltLangID());

	    final POSType pos = new POSType();
	    final SourceType sourceType = new SourceType();
	    pos.getSource().add(sourceType);
	    otaAirSeatMapRQ.setPOS(pos);

	    if (null != airSeatMapRequestData.getAirSeatMapRQ().getAirTravelers()) {
		AirTravelers airTravelers = new AirTravelers();
		for (com.cnk.travelogix.suppliers.air.data.AirTraveler airTravelerData : airSeatMapRequestData.getAirSeatMapRQ().getAirTravelers()) {
		    AirTraveler airTraveler = new AirTraveler();
		    airTraveler.setCurrencyCode(airTravelerData.getCurrencyCode());
		    airTravelers.getAirTraveler().add(airTraveler);
		}
		otaAirSeatMapRQ.setAirTravelers(airTravelers);
	    }
	    org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests seatMapRequests = populateSeatMapRequests(airSeatMapRequestsDatas);
	    otaAirSeatMapRQ.setSeatMapRequests(seatMapRequests);

	    airSeatMapRQWrapper.setOTAAirSeatMapRQ(otaAirSeatMapRQ);
	    requestBody.getOTAAirSeatMapRQWrapper().add(airSeatMapRQWrapper);
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;
    }

    private org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests populateSeatMapRequests(SeatMapRequests seatMapRequestsData) {
	org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests seatMapRequests = new org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests();

	for (com.cnk.travelogix.suppliers.air.data.SeatMapRequest eachSeatMapRequest : seatMapRequestsData.getSeatMapRequest()) {
	    SeatMapRequest seatMapRequest = new SeatMapRequest();

	    com.cnk.travelogix.suppliers.air.data.FlightSegment flightSegmentinfoData = eachSeatMapRequest.getFlightSegmentInfo();
	    FlightSegmentInfo flightSegmentInfo = new FlightSegmentInfo();
	    flightSegmentInfo.setFlightNumber(flightSegmentinfoData.getFlightNumber());
	    if (null != flightSegmentinfoData.getDepartureDateTime()) {
		flightSegmentInfo.setDepartureDateTime(toXMLGregorianCalendar(flightSegmentinfoData.getDepartureDateTime()));
	    }
	    if (null != flightSegmentinfoData.getArrivalDateTime()) {
		flightSegmentInfo.setArrivalDateTime(toXMLGregorianCalendar(flightSegmentinfoData.getArrivalDateTime()));
	    }

	    flightSegmentInfo.setArrivalAirport(populateArrivalAirport(flightSegmentinfoData.getArrivalAirport()));
	    flightSegmentInfo.setDepartureAirport(populateDepartureAirport(flightSegmentinfoData.getDepartureAirport()));
	    flightSegmentInfo.setOperatingAirline(populateOperatingAirline(flightSegmentinfoData.getOperatingAirline()));

	    final TPAExtensions tpaExtensionsData = flightSegmentinfoData.getTpaExtensions();
	    if (tpaExtensionsData != null) {
		final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
		flightSegmentInfo.setTPAExtensions(tpaExtensionsType);
	    }

	    seatMapRequest.setFlightSegmentInfo(flightSegmentInfo);
	    com.cnk.travelogix.suppliers.air.data.SeatDetails seatDetailsData = eachSeatMapRequest.getSeatDetails();

	    final SeatDetails seatDetails = populateSeatDetails(seatDetailsData);
	    seatMapRequest.setSeatDetails(seatDetails);
	    seatMapRequests.getSeatMapRequest().add(seatMapRequest);
	}
	return seatMapRequests;
    }

    /**
     * @param seatDetailsData
     */
    private SeatDetails populateSeatDetails(com.cnk.travelogix.suppliers.air.data.SeatDetails seatDetailsData) {
	SeatDetails seatDetails = null;
	if (null != seatDetailsData) {
	    seatDetails = new SeatDetails();
	    final ResBookDesignations resBookDesignations = new ResBookDesignations();
	    com.cnk.travelogix.suppliers.air.data.ResBookDesignations resBookDesignationsData = seatDetailsData.getResBookDesignations();
	    if (null != resBookDesignationsData) {
		for (com.cnk.travelogix.suppliers.air.data.ResBookDesignation resBookDesignationData : resBookDesignationsData.getResBookDesignation()) {
		    ResBookDesignation resBookDesignation = new ResBookDesignation();
		    resBookDesignation.setResBookDesigCode(resBookDesignationData.getResBookDesigCode());
		    resBookDesignations.getResBookDesignation().add(resBookDesignation);
		}
		seatDetails.setResBookDesignations(resBookDesignations);
	    }
	    final CabinClass cabinClass = new CabinClass();
	    if (null != seatDetailsData.getCabinClass()) {
		for (com.cnk.travelogix.suppliers.air.data.CabinClass cabinClassData : seatDetailsData.getCabinClass()) {
		    cabinClass.setCabinType(cabinClassData.getCabinType());
		    seatDetails.getCabinClass().add(cabinClass);
		}
	    }
	}
	return seatDetails;
    }

    public AirSeatMapResponseWrapper fromOTAAirSeatMapRS(final AirInterfaceRS airInterfaceRS) {
	final AirSeatMapResponseWrapper airSeatMapResponseWrapper = new AirSeatMapResponseWrapper();
	AirSeatMapResponse airSeatMapResponse;
	final List<AirSeatMapResponse> airSeatMapResponsesData = new ArrayList<>();
	final List<OTAAirSeatMapRSWrapper> otaSeatMapRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirSeatMapRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirSeatMapRSWrapper otaAirSeatMapRSWrapper : otaSeatMapRSWrapperList) {
		airSeatMapResponse = new AirSeatMapResponse();
		airSeatMapResponse.setSequence(otaAirSeatMapRSWrapper.getSequence());
		String supplierId = otaAirSeatMapRSWrapper.getSupplierID().getValue();
		if (!hasError(otaAirSeatMapRSWrapper.getErrorList())) {
		    final AirSeatMapRS airSeatMapRSData = new AirSeatMapRS();
		    final OTAAirSeatMapRS otaSeatMapRS = otaAirSeatMapRSWrapper.getOTAAirSeatMapRS();
		    airSeatMapRSData.setTarget(otaSeatMapRS.getTarget());
		    airSeatMapRSData.setVersion(otaSeatMapRS.getVersion());
		    airSeatMapRSData.setPrimaryLangID(otaSeatMapRS.getPrimaryLangID());
		    airSeatMapRSData.setAltLangID(otaSeatMapRS.getAltLangID());

		    SeatMapResponses seatMapResponses = otaSeatMapRS.getSeatMapResponses();
		    com.cnk.travelogix.suppliers.air.data.SeatMapResponses seatMapResponsesData = populateSeatMapResponses(seatMapResponses);
		    airSeatMapRSData.setSeatMapResponses(seatMapResponsesData);
		    airSeatMapRSData.setErrors(getErrorsData(otaSeatMapRS.getErrors(), supplierId));
		    airSeatMapResponse.setAirSeatMap(airSeatMapRSData);
		}
		airSeatMapResponse.setErrors(getErrorsListData(otaAirSeatMapRSWrapper.getErrorList(), supplierId));
		airSeatMapResponsesData.add(airSeatMapResponse);
	    }
	}
	airSeatMapResponseWrapper.setAirSeatMapResponses(airSeatMapResponsesData);
	airSeatMapResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airSeatMapResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airSeatMapResponseWrapper;
    }

    private com.cnk.travelogix.suppliers.air.data.SeatMapResponses populateSeatMapResponses(SeatMapResponses seatMapResponses) {
	com.cnk.travelogix.suppliers.air.data.SeatMapResponses seatMapResponsesData = new com.cnk.travelogix.suppliers.air.data.SeatMapResponses();

	List<com.cnk.travelogix.suppliers.air.data.SeatMapResponse> listSeatMapResponse = new ArrayList<>();
	for (SeatMapResponse seatMapResponse : seatMapResponses.getSeatMapResponse()) {
	    com.cnk.travelogix.suppliers.air.data.SeatMapResponse seatMapResponseData = new com.cnk.travelogix.suppliers.air.data.SeatMapResponse();
	    org.opentravel.ota._2003._05.OTAAirSeatMapRS.SeatMapResponses.SeatMapResponse.FlightSegmentInfo flightSegmentinfo = seatMapResponse.getFlightSegmentInfo();
	    com.cnk.travelogix.suppliers.air.data.FlightSegment flightSegment = new com.cnk.travelogix.suppliers.air.data.FlightSegment();
	    flightSegment.setFlightNumber(flightSegmentinfo.getFlightNumber());

	    seatMapResponseData.setFlightSegmentInfo(flightSegment);
	    List<org.opentravel.ota._2003._05.SeatMapDetailsType> seatMapDetails = seatMapResponse.getSeatMapDetails();

	    List<SeatMapDetailsType> seatMapDetailsData = new ArrayList<>();
	    for (org.opentravel.ota._2003._05.SeatMapDetailsType seatMapDetail : seatMapDetails) {
		SeatMapDetailsType seatMapDetailsTypeData = new SeatMapDetailsType();
		List<String> travelerRefNumberRPHs = seatMapDetail.getTravelerRefNumberRPHs();
		seatMapDetailsTypeData.setTravelerRefNumberRPHs(travelerRefNumberRPHs);
		seatMapDetailsData.add(seatMapDetailsTypeData);
	    }
	    seatMapResponseData.setSeatMapDetails(seatMapDetailsData);
	    listSeatMapResponse.add(seatMapResponseData);
	}
	seatMapResponsesData.setSeatMapResponse(listSeatMapResponse);
	return seatMapResponsesData;
    }
}
