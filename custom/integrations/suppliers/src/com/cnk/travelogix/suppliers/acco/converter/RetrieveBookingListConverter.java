package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.HotelReservationType;
import org.opentravel.ota._2003._05.OTAReadRQ;
import org.opentravel.ota._2003._05.OTAReadRQ.ReadRequests;
import org.opentravel.ota._2003._05.OTAReadRQ.ReadRequests.HotelReadRequest;
import org.opentravel.ota._2003._05.OTAReadRQ.ReadRequests.HotelReadRequest.SelectionCriteria;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;
import org.opentravel.ota._2003._05.OTAResRetrieveRS.ReservationsList;

import com.cnk.travelogix.suppliers.acco.data.HotelReservation;
import com.cnk.travelogix.suppliers.acco.data.ResRetrieveRS;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingListReadRequest;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingListRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingListResponse;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingListResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingRQ;
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
 * Retrieve Booking List Converter
 */
public class RetrieveBookingListConverter extends AccoBaseConverter {

    /**
     * @param requestWrapper
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAReadRQ(RetrieveBookingListRequestWrapper requestWrapper) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAReadRQWrapper otaReadRQWrapper = new OTAReadRQWrapper();

	List<RetrieveBookingListReadRequest> retrieveBookingListReadRequest = requestWrapper.getRetrieveBookingListReadRequest();
	for (RetrieveBookingListReadRequest retrieveBookingListReadRequestData : retrieveBookingListReadRequest) {
	    otaReadRQWrapper.setSequence(retrieveBookingListReadRequestData.getSequence());

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(retrieveBookingListReadRequestData.getSupplierID().getValue());
	    supplierIDType.setMarketType(retrieveBookingListReadRequestData.getSupplierID().getMarketType());
	    otaReadRQWrapper.setSupplierID(supplierIDType);

	    OTAReadRQ otaReadRQ = new OTAReadRQ();
	    RetrieveBookingRQ retrieveBookingRQData = retrieveBookingListReadRequestData.getRetrieveBookingListRQ();
	    otaReadRQ.setTarget(retrieveBookingRQData.getTarget());
	    otaReadRQ.setVersion(retrieveBookingRQData.getVersion());

	    com.cnk.travelogix.suppliers.acco.data.ReadRequests readRequests = retrieveBookingRQData.getReadRequests();
	    HotelReadRequest otaHotelReadRequest = new HotelReadRequest();
	    ReadRequests otahotelReadRequests = new ReadRequests();
	    List<HotelReadRequest> otahotelReadRequest = new ArrayList<>();

	    List<com.cnk.travelogix.suppliers.acco.data.HotelReadRequest> hotelReadRequest = readRequests.getHotelReadRequest();
	    SelectionCriteria otaselectionCriteria = new SelectionCriteria();
	    for (com.cnk.travelogix.suppliers.acco.data.HotelReadRequest hotelReadRequestData : hotelReadRequest) {
		otaHotelReadRequest.setHotelCode(hotelReadRequestData.getHotelCode());
		List<com.cnk.travelogix.suppliers.acco.data.SelectionCriteria> selectionCriterias = hotelReadRequestData.getSelectionCriteria();
		for (com.cnk.travelogix.suppliers.acco.data.SelectionCriteria selectionCriteriaData : selectionCriterias) {
		    otaselectionCriteria.setDateType(selectionCriteriaData.getDateType());
		    otaselectionCriteria.setEnd(selectionCriteriaData.getEnd());
		    otaselectionCriteria.setResStatus(selectionCriteriaData.getResStatus());
		    otaselectionCriteria.setStart(selectionCriteriaData.getStart());
		}
	    }
	    otaHotelReadRequest.getSelectionCriteria().add(otaselectionCriteria);
	    otahotelReadRequest.add(otaHotelReadRequest);
	    otahotelReadRequests.getHotelReadRequest().add(otaHotelReadRequest);
	    otaReadRQ.setReadRequests(otahotelReadRequests);
	    otaReadRQWrapper.setOTAReadRQ(otaReadRQ);
	    requestBody.getOTAReadRQWrapper().add(otaReadRQWrapper);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return accoInterfaceRQ;
    }

    /**
     * @param accoInterfaceRS
     * @return responseWrapper
     */
    public RetrieveBookingListResponseWrapper fromOTAReadRS(AccoInterfaceRS accoInterfaceRS) {
	RetrieveBookingListResponseWrapper responseWrapper = new RetrieveBookingListResponseWrapper();
	RetrieveBookingListResponse retrieveBookingListResponseData;
	final List<RetrieveBookingListResponse> retrieveBookingListResponsesData = new ArrayList<>();

	final List<OTAReadRSWrapper> otaReadWrapperList = accoInterfaceRS.getResponseBody().getOTAReadRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAReadRSWrapper otaReadRSWrapper : otaReadWrapperList) {
		retrieveBookingListResponseData = new RetrieveBookingListResponse();
		retrieveBookingListResponseData.setSequence(otaReadRSWrapper.getSequence());
		retrieveBookingListResponseData.setSupplierID(populateGetSupplierId(otaReadRSWrapper.getSupplierID()));
		ResRetrieveRS retrieveBookingListRS = new ResRetrieveRS();
		String supplierId = otaReadRSWrapper.getSupplierID().getValue();
		if (!hasError(otaReadRSWrapper.getErrorList())) {
		    OTAResRetrieveRS otaReadRQ = otaReadRSWrapper.getOTAResRetrieveRS();
		    if (otaReadRQ != null) {
			retrieveBookingListRS.setVersion(otaReadRQ.getVersion());

			List<Warning> warningsData = new ArrayList<>();
			List<Warning> warningData = getRetreiveBookingWarning(otaReadRQ.getWarnings());
			warningsData.addAll(warningData);
			retrieveBookingListRS.setWarnings(warningsData);

			List<HotelReservation> hotelReservations = new ArrayList<>();
			com.cnk.travelogix.suppliers.acco.data.ReservationsList reservationsListData = new com.cnk.travelogix.suppliers.acco.data.ReservationsList();

			ReservationsList reservationsList = otaReadRQ.getReservationsList();
			List<HotelReservationType> hotelReservationTypes = reservationsList.getHotelReservation();
			for (HotelReservationType hotelReservationType : hotelReservationTypes) {
			    HotelReservation hotelReservationData = new HotelReservation();
			    hotelReservationData.setResStatus(hotelReservationType.getResStatus());
			    hotelReservationData.setCreateDateTime(getDateGregorianCalendar(hotelReservationType.getCreateDateTime()));

			    List<com.cnk.travelogix.suppliers.acco.data.UniqueID> uniqueIDs = new ArrayList<>();
			    List<UniqueID> uniqueID = getUniqueIDData(hotelReservationType.getUniqueID());
			    uniqueIDs.addAll(uniqueID);
			    hotelReservationData.setUniqueID(uniqueIDs);

			    List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStaysData = new ArrayList<>();
			    hotelReservationType.getRoomStays();
			    List<RoomStay> roomStay = getRetrieveBookingRoomStayData(hotelReservationType);
			    roomStaysData.addAll(roomStay);
			    hotelReservationData.setRoomStays(roomStaysData);
			    hotelReservations.add(hotelReservationData);
			}
			reservationsListData.setHotelReservation(hotelReservations);
			retrieveBookingListRS.setReservationsList(reservationsListData);
			retrieveBookingListResponseData.setErrors(getErrorsData(otaReadRQ.getErrors(), supplierId));
			retrieveBookingListResponseData.setResRetrieveListRS(retrieveBookingListRS);
		    }
		}
		retrieveBookingListResponseData.setErrors(getErrorsListData(otaReadRSWrapper.getErrorList(), supplierId));
		retrieveBookingListResponsesData.add(retrieveBookingListResponseData);
	    }
	}

	responseWrapper.setRetrieveBookingListResponses(retrieveBookingListResponsesData);
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return responseWrapper;

    }

}
