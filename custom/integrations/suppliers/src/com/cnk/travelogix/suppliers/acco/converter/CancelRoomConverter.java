package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.ErrorType;
import org.opentravel.ota._2003._05.ErrorsType;
import org.opentravel.ota._2003._05.HotelResModifyRequestType;
import org.opentravel.ota._2003._05.HotelResModifyResponseType;
import org.opentravel.ota._2003._05.HotelResModifyType;
import org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify;
import org.opentravel.ota._2003._05.RateType;
import org.opentravel.ota._2003._05.RateType.Rate;
import org.opentravel.ota._2003._05.RoomStayType.RoomRates;
import org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate;
import org.opentravel.ota._2003._05.RoomStayType.RoomTypes;
import org.opentravel.ota._2003._05.RoomStaysType;
import org.opentravel.ota._2003._05.RoomStaysType.RoomStay;
import org.opentravel.ota._2003._05.RoomTypeType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.UniqueIDType;
import org.opentravel.ota._2003._05.WarningType;
import org.opentravel.ota._2003._05.WarningsType;

import com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo;
import com.cnk.travelogix.suppliers.acco.data.CancelRoomReadRequest;
import com.cnk.travelogix.suppliers.acco.data.CancelRoomRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.CancelRoomResponse;
import com.cnk.travelogix.suppliers.acco.data.CancelRoomResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelReservation;
import com.cnk.travelogix.suppliers.acco.data.RoomType;
import com.cnk.travelogix.suppliers.acco.data.UniqueID;
import com.cnk.travelogix.suppliers.acco.data.Warning;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Cancel Room Converter
 */
public class CancelRoomConverter extends AccoBaseConverter {

    /**
     * @param request
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTACancelRQ(CancelRoomRequestWrapper request) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAHotelResModifyRQWrapper otaHotelResModifyWrapper = new OTAHotelResModifyRQWrapper();

	List<CancelRoomReadRequest> cancelRoomReadRequests = request.getCancelRoomReadRequest();
	for (CancelRoomReadRequest cancelRoomReadRequest : cancelRoomReadRequests) {
	    otaHotelResModifyWrapper.setSequence(cancelRoomReadRequest.getSequence());

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(cancelRoomReadRequest.getSupplierID().getValue());
	    supplierIDType.setMarketType(cancelRoomReadRequest.getSupplierID().getMarketType());
	    otaHotelResModifyWrapper.setSupplierID(supplierIDType);

	    HotelResModifyRequestType otaReadRQ = new HotelResModifyRequestType();
	    com.cnk.travelogix.suppliers.acco.data.HotelResModify hotelResModifyRQData = cancelRoomReadRequest.getHotelResModifyRQ();

	    UniqueIDType uniqueID = new UniqueIDType();
	    List<com.cnk.travelogix.suppliers.acco.data.UniqueID> uniqueIDsData = hotelResModifyRQData.getUniqueID();
	    for (UniqueID uniqueIDData : uniqueIDsData) {
		uniqueID.setID(uniqueIDData.getId());
		uniqueID.setType(uniqueIDData.getType());
	    }
	    otaReadRQ.getUniqueID().add(uniqueID);

	    otaReadRQ.setTarget(hotelResModifyRQData.getTarget());
	    otaReadRQ.setVersion(hotelResModifyRQData.getVersion());

	    HotelResModifyType hotelResModifyType = new HotelResModifyType();
	    List<HotelResModifyType> hotelResModifyTypes = new ArrayList<>();
	    HotelResModify hotelResModify = new HotelResModify();

	    List<HotelReservation> hotelResModifysData = hotelResModifyRQData.getHotelResModifies();
	    RoomStaysType roomStaysTypes = populateRoomStayTypes(hotelResModifysData);
	    hotelResModify.setRoomStays(roomStaysTypes);
	    hotelResModifyType.getHotelResModify().add(hotelResModify);
	    hotelResModifyTypes.add(hotelResModifyType);
	    otaHotelResModifyWrapper.setOTAHotelResModifyRQ(otaReadRQ);
	    requestBody.getOTAHotelResModifyRQWrapper().add(otaHotelResModifyWrapper);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(request.getRequestHeader()));
	return accoInterfaceRQ;
    }

    /**
     * @param hotelResModifysData
     * @return roomStaysType
     */
    private RoomStaysType populateRoomStayTypes(List<HotelReservation> hotelResModifysData) {
	RoomStaysType roomStaysType = new RoomStaysType();
	for (HotelReservation hotelResModifyData : hotelResModifysData) {
	    org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStayType = new org.opentravel.ota._2003._05.RoomStaysType.RoomStay();

	    List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStayTypeData = hotelResModifyData.getRoomStays();
	    for (com.cnk.travelogix.suppliers.acco.data.RoomStay roomStay : roomStayTypeData) {
		roomStayType.setIndexNumber(roomStay.getIndexNumber());

		org.opentravel.ota._2003._05.RoomStayType.RoomTypes roomTypes = new org.opentravel.ota._2003._05.RoomStayType.RoomTypes();
		RoomTypeType roomTypeType = new RoomTypeType();
		List<RoomType> roomsTypes = roomStay.getRoomTypes();
		for (RoomType roomType : roomsTypes) {
		    roomTypeType.setRoomID(roomType.getRoomID());
		}
		roomTypes.getRoomType().add(roomTypeType);
		roomStayType.setRoomTypes(roomTypes);

		org.opentravel.ota._2003._05.RoomStayType.BasicPropertyInfo basicPropertyInfo = new org.opentravel.ota._2003._05.RoomStayType.BasicPropertyInfo();
		BasicPropertyInfo basicPropertyInfoData = roomStay.getBasicPropertyInfo();
		basicPropertyInfo.setHotelCode(basicPropertyInfoData.getHotelCode());
		roomStayType.setBasicPropertyInfo(basicPropertyInfo);
	    }

	    roomStaysType.getRoomStay().add(roomStayType);
	}
	return roomStaysType;
    }

    /**
     * @param accoInterfaceRS
     * @return responseWrapper
     */
    public CancelRoomResponseWrapper fromOTACancelRS(AccoInterfaceRS accoInterfaceRS) {
	CancelRoomResponseWrapper responseWrapper = new CancelRoomResponseWrapper();
	CancelRoomResponse cancelRoomResponseData;
	final List<CancelRoomResponse> cancelRoomResponsesData = new ArrayList<>();

	final List<OTAHotelResModifyRSWrapper> otaHotelResModifyRSWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelResModifyRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelResModifyRSWrapper otaHotelResModifyRSWrapper : otaHotelResModifyRSWrapperList) {
		cancelRoomResponseData = new CancelRoomResponse();
		cancelRoomResponseData.setSequence(otaHotelResModifyRSWrapper.getSequence());
		cancelRoomResponseData.setSupplierID(populateGetSupplierId(otaHotelResModifyRSWrapper.getSupplierID()));

		if (!hasError(otaHotelResModifyRSWrapper.getErrorList())) {
		    com.cnk.travelogix.suppliers.acco.data.HotelResModify hotelResModifyRS = new com.cnk.travelogix.suppliers.acco.data.HotelResModify();
		    List<com.cnk.travelogix.suppliers.acco.data.HotelResModify> hotelResModifyRSs = new ArrayList<>();
		    HotelResModifyResponseType otahotelResModifyResponse = otaHotelResModifyRSWrapper.getOTAHotelResModifyRS();
		    hotelResModifyRS.setVersion(otahotelResModifyResponse.getVersion());

		    hotelResModifyRS.setErrors(getErrorsData(otahotelResModifyResponse.getErrors()));

		    List<Warning> warningsData = new ArrayList<>();
		    WarningsType oraWarningType = otahotelResModifyResponse.getWarnings();
		    if (oraWarningType != null) {
			List<WarningType> warningTypes = oraWarningType.getWarning();
			for (WarningType warningType : warningTypes) {
			    Warning warningData = new Warning();
			    warningData.setShortText(warningType.getShortText());
			    warningData.setStatus(warningType.getStatus());
			    warningData.setType(warningType.getType());
			    warningsData.add(warningData);
			}
		    }
		    hotelResModifyRS.setWarnings(warningsData);

		    com.cnk.travelogix.suppliers.acco.data.HotelResModify hotelResModifyData = new com.cnk.travelogix.suppliers.acco.data.HotelResModify();
		    HotelResModifyType hotelResModifies = otahotelResModifyResponse.getHotelResModifies();

		    List<HotelResModify> hotelResModifiesList = hotelResModifies.getHotelResModify();
		    List<HotelReservation> hotelReservations = new ArrayList<>();
		    for (HotelResModify hotelResModify : hotelResModifiesList) {
			hotelResModifyData.setResStatus(hotelResModify.getResStatus());
			hotelResModifyData.setCreateDateTime(getDateGregorianCalendar(hotelResModify.getCreateDateTime()));

			List<com.cnk.travelogix.suppliers.acco.data.UniqueID> uniqueIDs = new ArrayList<>();
			List<UniqueID> uniqueID = getUniqueIDData(hotelResModify.getUniqueID());
			uniqueIDs.addAll(uniqueID);
			hotelResModifyData.setUniqueID(uniqueIDs);

			RoomStaysType roomStays = hotelResModify.getRoomStays();
			List<RoomStay> otaRoomStay = roomStays.getRoomStay();
			List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStaysData = getRoomStayData(otaRoomStay);
			hotelResModifyData.setRoomStays(roomStaysData);
			hotelResModifyRSs.add(hotelResModifyData);
		    }
		    hotelReservations.add(hotelResModifyRS);
		    hotelResModifyRS.setHotelResModifies(hotelReservations);
		    cancelRoomResponseData.setHotelResModifyRS(hotelResModifyRS);
		}
		cancelRoomResponseData.setErrors(getErrorsListData(otaHotelResModifyRSWrapper.getErrorList(), otaHotelResModifyRSWrapper.getSupplierID().getValue()));
		cancelRoomResponsesData.add(cancelRoomResponseData);
	    }
	}
	responseWrapper.setCancelRoomResponses(cancelRoomResponsesData);
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return responseWrapper;
    }

    /**
     * @param otaRoomStay
     * @return roomStaysData
     */
    private List<com.cnk.travelogix.suppliers.acco.data.RoomStay> getRoomStayData(List<RoomStay> otaRoomStay) {
	List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStaysData = new ArrayList<>();
	com.cnk.travelogix.suppliers.acco.data.RoomStay roomStayData = new com.cnk.travelogix.suppliers.acco.data.RoomStay();
	for (RoomStay roomStay : otaRoomStay) {
	    roomStayData.setRoomStayStatus(roomStay.getRoomStayStatus());
	    roomStayData.setRoomTypes(setRoomTypeData(roomStay.getRoomTypes()));
	    RoomRates otaRoomRate = roomStay.getRoomRates();
	    List<com.cnk.travelogix.suppliers.acco.data.RoomRate> roomRates = getRoomRatesData(otaRoomRate);
	    roomStayData.setRoomRates(roomRates);
	}
	roomStaysData.add(roomStayData);
	return roomStaysData;
    }

    /**
     * @param otaRoomRate
     * @return roomRates
     */
    private List<com.cnk.travelogix.suppliers.acco.data.RoomRate> getRoomRatesData(RoomRates otaRoomRate) {
	List<RoomRate> otaRoomRates = otaRoomRate.getRoomRate();
	List<com.cnk.travelogix.suppliers.acco.data.RoomRate> roomRates = new ArrayList<>();
	com.cnk.travelogix.suppliers.acco.data.RoomRate roomRateData = new com.cnk.travelogix.suppliers.acco.data.RoomRate();
	for (RoomRate roomRate : otaRoomRates) {
	    RateType rates = roomRate.getRates();
	    List<Rate> ratesList = rates.getRate();
	    List<com.cnk.travelogix.suppliers.acco.data.Rate> ratesListData = new ArrayList<>();
	    for (Rate rate : ratesList) {
		com.cnk.travelogix.suppliers.acco.data.Rate rateData = new com.cnk.travelogix.suppliers.acco.data.Rate();
		final TPAExtensionsType tpaExtensions = rate.getTPAExtensions();
		if (tpaExtensions != null) {
		    final List<String> elementTypes = new ArrayList<>();
		    elementTypes.add("Rate");
		    elementTypes.add("amountAfterTax");
		    elementTypes.add("currencyCode");
		    elementTypes.add("rateType");
		    final TPAExtensions tpaExtensionsData = getTPAExtensionsData(tpaExtensions, elementTypes);
		    rateData.setTpaExtensions(tpaExtensionsData);
		    ratesListData.add(rateData);
		}
	    }
	    roomRateData.setRates(ratesListData);
	    roomRates.add(roomRateData);
	}
	return roomRates;
    }

    private List<RoomType> setRoomTypeData(RoomTypes otaRoomTypes) {
	List<RoomType> roomTypesData = new ArrayList<>();
	List<RoomTypeType> otaRoomTypeTypes = otaRoomTypes.getRoomType();
	for (RoomTypeType roomTypeType : otaRoomTypeTypes) {
	    RoomType roomTypeData = new RoomType();
	    roomTypeData.setRoomID(roomTypeType.getRoomID());
	    roomTypesData.add(roomTypeData);
	}
	return roomTypesData;
    }
}
