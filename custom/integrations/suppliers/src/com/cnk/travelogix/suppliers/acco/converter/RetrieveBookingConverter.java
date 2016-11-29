package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.HotelReservationType;
import org.opentravel.ota._2003._05.OTAReadRQ;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;
import org.opentravel.ota._2003._05.OTAResRetrieveRS.ReservationsList;
import org.opentravel.ota._2003._05.UniqueIDType;

import com.cnk.travelogix.suppliers.acco.data.HotelReservation;
import com.cnk.travelogix.suppliers.acco.data.ResRetrieveRS;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingRQ;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingReadRequest;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingResponse;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingWrapper;
import com.cnk.travelogix.suppliers.acco.data.RoomStay;
import com.cnk.travelogix.suppliers.acco.data.UniqueID;
import com.cnk.travelogix.suppliers.acco.data.Warning;
import com.coxandkings.integ.suppl.acco.OTAReadRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAReadRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Retrieve Booking Converter
 */
public class RetrieveBookingConverter extends AccoBaseConverter {

    /**
     * @param request
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAReadRQ(RetrieveBookingWrapper request) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAReadRQWrapper otaReadRQWrapper = new OTAReadRQWrapper();

	List<RetrieveBookingReadRequest> bookingReadRequests = request.getRetrieveBookingReadRequest();
	for (RetrieveBookingReadRequest retrieveBookingReadRequest : bookingReadRequests) {
	    otaReadRQWrapper.setSequence(retrieveBookingReadRequest.getSequence());

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(retrieveBookingReadRequest.getSupplierID().getValue());
	    supplierIDType.setMarketType(retrieveBookingReadRequest.getSupplierID().getMarketType());
	    otaReadRQWrapper.setSupplierID(supplierIDType);

	    OTAReadRQ otaReadRQ = new OTAReadRQ();
	    RetrieveBookingRQ retrieveBookingRQData = retrieveBookingReadRequest.getRetrieveBookingRQ();

	    UniqueIDType uniqueID = new UniqueIDType();
	    com.cnk.travelogix.suppliers.acco.data.UniqueID uniqueIDData = retrieveBookingRQData.getUniqueID();
	    uniqueID.setID(uniqueIDData.getId());
	    uniqueID.setType(uniqueIDData.getType());

	    otaReadRQ.setTarget(retrieveBookingRQData.getTarget());
	    otaReadRQ.setVersion(retrieveBookingRQData.getVersion());

	    otaReadRQ.setUniqueID(uniqueID);

	    otaReadRQWrapper.setOTAReadRQ(otaReadRQ);
	    requestBody.getOTAReadRQWrapper().add(otaReadRQWrapper);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(request.getRequestHeader()));
	return accoInterfaceRQ;
    }

    /**
     * @param accoInterfaceRS
     * @return responseWrapper
     */
    public RetrieveBookingResponseWrapper fromOTAReadRS(AccoInterfaceRS accoInterfaceRS) {
	RetrieveBookingResponseWrapper responseWrapper = new RetrieveBookingResponseWrapper();
	RetrieveBookingResponse retrieveBookingResponseData;
	final List<RetrieveBookingResponse> retrieveBookingResponsesData = new ArrayList<>();

	final List<OTAReadRSWrapper> otaReadWrapperList = accoInterfaceRS.getResponseBody().getOTAReadRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAReadRSWrapper otaReadRSWrapper : otaReadWrapperList) {
		retrieveBookingResponseData = new RetrieveBookingResponse();
		retrieveBookingResponseData.setSequence(otaReadRSWrapper.getSequence());
		retrieveBookingResponseData.setSupplierID(populateGetSupplierId(otaReadRSWrapper.getSupplierID()));
		ResRetrieveRS retrieveBookingRS = new ResRetrieveRS();
		String supplierId = otaReadRSWrapper.getSupplierID().getValue();
		if (!hasError(otaReadRSWrapper.getErrorList())) {
		    OTAResRetrieveRS otaReadRQ = otaReadRSWrapper.getOTAResRetrieveRS();
		    if (otaReadRQ != null) {
			retrieveBookingRS.setVersion(otaReadRQ.getVersion());
			List<Warning> warningsData = new ArrayList<>();
			List<Warning> warningData = getRetreiveBookingWarning(otaReadRQ.getWarnings());
			warningsData.addAll(warningData);
			retrieveBookingRS.setWarnings(warningsData);

			List<HotelReservation> hotelReservations = new ArrayList<>();
			com.cnk.travelogix.suppliers.acco.data.ReservationsList reservationsListData = new com.cnk.travelogix.suppliers.acco.data.ReservationsList();

			ReservationsList reservationsList = otaReadRQ.getReservationsList();
			List<HotelReservationType> hotelReservationTypes = reservationsList.getHotelReservation();
			for (HotelReservationType hotelReservationType : hotelReservationTypes) {
			    HotelReservation hotelReservationData = new HotelReservation();
			    hotelReservationData.setResStatus(hotelReservationType.getResStatus());
			    hotelReservationData.setCreateDateTime(getDateGregorianCalendar(hotelReservationType.getCreateDateTime()));

			    List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStaysData = new ArrayList<>();
			    List<RoomStay> roomStay = getRetrieveBookingRoomStayData(hotelReservationType);
			    roomStaysData.addAll(roomStay);
			    hotelReservationData.setRoomStays(roomStaysData);

			    List<com.cnk.travelogix.suppliers.acco.data.UniqueID> uniqueIDs = new ArrayList<>();
			    List<UniqueID> uniqueID = getUniqueIDData(hotelReservationType.getUniqueID());
			    uniqueIDs.addAll(uniqueID);
			    hotelReservationData.setUniqueID(uniqueIDs);
			    hotelReservations.add(hotelReservationData);
			}
			reservationsListData.setHotelReservation(hotelReservations);
			retrieveBookingRS.setErrors(getErrorsData(otaReadRQ.getErrors(), supplierId));
			retrieveBookingRS.setReservationsList(reservationsListData);
			retrieveBookingResponseData.setResRetrieveRS(retrieveBookingRS);
		    }
		}
		retrieveBookingResponseData.setErrors(getErrorsListData(otaReadRSWrapper.getErrorList(), supplierId));
		retrieveBookingResponsesData.add(retrieveBookingResponseData);
	    }
	}

	responseWrapper.setRetrieveBookingResponses(retrieveBookingResponsesData);
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return responseWrapper;

    }
}
