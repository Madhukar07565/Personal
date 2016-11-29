package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRQ;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRQ.RoomClass;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRQ.RoomClass.Rooms;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRQ.RoomClass.Rooms.Room;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRQ.RoomClass.Rooms.Room.ChildsAge;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRQ.RoomClass.Rooms.Room.SupplierRef;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRQ.RoomClass.Rooms.Room.SupplierRef.SupplierRefOne;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRQ.RoomInfo;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRQ.RoomInfo.ChildAges;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRS;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRS.Errors;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRS.Errors.Error;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRS.Policies;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRS.Policies.Policy;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRS.Policies.Policy.Days;
import org.opentravel.ota._2003._05.OTAHotelGetCancellationPolicyRS.Policies.Policy.RoomCatgCode;

import com.cnk.travelogix.suppliers.acco.data.GetPoliciesRQ;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesRS;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesReadRequest;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesResponse;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesResponseWrapper;
import com.cnk.travelogix.suppliers.common.data.ErrorType;
import com.coxandkings.integ.suppl.acco.OTAHotelGetCancellationPolicyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelGetCancellationPolicyRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Get Policies Converter
 */
public class GetPoliciesConverter extends AccoBaseConverter {

    /**
     * @param requestWrapper
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAHotelGetCancellationPolicyRQ(GetPoliciesRequestWrapper requestWrapper) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();

	List<GetPoliciesReadRequest> getPoliciesReadRequests = requestWrapper.getGetPoliciesReadRequest();
	for (GetPoliciesReadRequest getPoliciesReadRequest : getPoliciesReadRequests) {

	    OTAHotelGetCancellationPolicyRQWrapper otaHotelGetCancellationPolicyRQWrapper = new OTAHotelGetCancellationPolicyRQWrapper();
	    otaHotelGetCancellationPolicyRQWrapper.setSequence(getPoliciesReadRequest.getSequence());

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(getPoliciesReadRequest.getSupplierID().getValue());
	    supplierIDType.setMarketType(getPoliciesReadRequest.getSupplierID().getMarketType());
	    otaHotelGetCancellationPolicyRQWrapper.setSupplierID(supplierIDType);

	    OTAHotelGetCancellationPolicyRQ otaHotelAvailRQ = new OTAHotelGetCancellationPolicyRQ();
	    GetPoliciesRQ getPoliciesRQ = getPoliciesReadRequest.getGetPoliciesRQ();
	    otaHotelAvailRQ.setPaxPassport(getPoliciesRQ.getPaxPassport());
	    otaHotelAvailRQ.setHotelID(getPoliciesRQ.getHotelID());
	    otaHotelAvailRQ.setInternalCode(getPoliciesRQ.getInternalCode());
	    otaHotelAvailRQ.setCheckInDate(toXMLGregorianCalendar(getPoliciesRQ.getCheckInDate()));
	    otaHotelAvailRQ.setCheckOutDate(toXMLGregorianCalendar(getPoliciesRQ.getCheckOutDate()));
	    otaHotelAvailRQ.setNationalityID(getPoliciesRQ.getNationalityID());
	    otaHotelAvailRQ.setCancelPolicyID(getPoliciesRQ.getCancelPolicyID());
	    otaHotelAvailRQ.setFlagAvail(getPoliciesRQ.getFlagAvail());
	    otaHotelAvailRQ.setResNo(getPoliciesRQ.getResNo());
	    otaHotelAvailRQ.setHbookingID(getPoliciesRQ.getHbookingID());
	    otaHotelAvailRQ.setAgentID(getPoliciesRQ.getAgentID());
	    otaHotelAvailRQ.setSupplier(getPoliciesRQ.getSupplier());
	    otaHotelAvailRQ.setCountryID(getPoliciesRQ.getCountryID());
	    otaHotelAvailRQ.setCityID(getPoliciesRQ.getCityID());
	    otaHotelAvailRQ.setIsPackageRate(getPoliciesRQ.getIsPackageRate());

	    RoomInfo roomInfo = new RoomInfo();
	    List<com.cnk.travelogix.suppliers.acco.data.RoomInfo> roomInfosData = getPoliciesRQ.getRoomInfo();
	    if (roomInfosData != null) {
		for (com.cnk.travelogix.suppliers.acco.data.RoomInfo roomInfoData : roomInfosData) {
		    roomInfo.setSeqNo(roomInfoData.getSeqNo());
		    roomInfo.setRoomType(roomInfoData.getRoomType());
		    roomInfo.setRoomID(roomInfoData.getRoomID());
		    roomInfo.setAdultNum(roomInfoData.getAdultNum());

		    ChildAges childAges = new ChildAges();
		    ChildsAge childsAge = new ChildsAge();
		    com.cnk.travelogix.suppliers.acco.data.ChildAges childAgesData = roomInfoData.getChildAges();
		    childsAge.getAge().addAll(childAgesData.getChildAge());
		    childAges.getChildAge().addAll(childAgesData.getChildAge());
		    roomInfo.setChildAges(childAges);
		}
	    }
	    otaHotelAvailRQ.getRoomInfo().add(roomInfo);

	    Rooms rooms = new Rooms();
	    RoomClass roomClass = new RoomClass();
	    com.cnk.travelogix.suppliers.acco.data.RoomClass roomClassData = getPoliciesRQ.getRoomClass();
	    roomClass.setTotalPrice(roomClassData.getTotalPrice());
	    roomClass.setCurrencyCode(roomClassData.getCurrencyCode());
	    List<com.cnk.travelogix.suppliers.acco.data.Room> roomsData = roomClassData.getRooms();
	    for (com.cnk.travelogix.suppliers.acco.data.Room roomData : roomsData) {

		Room room = new Room();
		room.setProductID(roomData.getProductID());
		room.setAdults(roomData.getAdults());
		room.setChilds(roomData.getChilds());
		room.setSupplierCode(roomData.getSupplierCode());
		ChildsAge otaChildsAge = new ChildsAge();
		com.cnk.travelogix.suppliers.acco.data.ChildsAge childsAgeData = roomData.getChildsAge();
		if (childsAgeData != null)
		    otaChildsAge.getAge().addAll(childsAgeData.getAge());
		room.setChildsAge(otaChildsAge);
		room.setMapRoomID(roomData.getMapRoomID());
		room.setAgreementID(roomData.getAgreementID());

		SupplierRef supplierRef = new SupplierRef();
		List<com.cnk.travelogix.suppliers.acco.data.SupplierRefOne> supplierRefOne = roomData.getSupplierRef();
		for (com.cnk.travelogix.suppliers.acco.data.SupplierRefOne supplierRefOneData : supplierRefOne) {
		    SupplierRefOne otaSupplierRefOne = new SupplierRefOne();
		    otaSupplierRefOne.setID(supplierRefOneData.getId());
		    otaSupplierRefOne.setValue(supplierRefOneData.getValue());
		    supplierRef.getSupplierRef().add(otaSupplierRefOne);
		}
		room.setSupplierRef(supplierRef);

		rooms.getRoom().add(room);
		roomClass.setRooms(rooms);
	    }
	    otaHotelAvailRQ.setRoomClass(roomClass);
	    otaHotelGetCancellationPolicyRQWrapper.setOTAHotelGetCancellationPolicyRQ(otaHotelAvailRQ);
	    requestBody.getOTAHotelGetCancellationPolicyRQWrapper().add(otaHotelGetCancellationPolicyRQWrapper);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return accoInterfaceRQ;
    }

    /**
     * @param accoInterfaceRS
     * @return getPoliciesResponseWrapper
     */
    public GetPoliciesResponseWrapper fromOTAHotelGetCancellationPolicyRS(AccoInterfaceRS accoInterfaceRS) {
	GetPoliciesResponseWrapper getPoliciesResponseWrapper = new GetPoliciesResponseWrapper();
	GetPoliciesResponse getPoliciesResponseData;

	final List<GetPoliciesResponse> getPoliciesResponsesData = new ArrayList<>();
	final List<OTAHotelGetCancellationPolicyRSWrapper> otaHotelGetCancellationPolicyList = accoInterfaceRS.getResponseBody().getOTAHotelGetCancellationPolicyRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelGetCancellationPolicyRSWrapper otaHotelGetWrapper : otaHotelGetCancellationPolicyList) {
		getPoliciesResponseData = new GetPoliciesResponse();
		getPoliciesResponseData.setSequence(otaHotelGetWrapper.getSequence());
		SupplierIDType supplierIDType = otaHotelGetWrapper.getSupplierID();
		getPoliciesResponseData.setSupplierID(populateGetSupplierId(otaHotelGetWrapper.getSupplierID()));
		if (!hasError(otaHotelGetWrapper.getErrorList())) {
		    GetPoliciesRS getPoliciesRS = new GetPoliciesRS();
		    final OTAHotelGetCancellationPolicyRS otaCancelRS = otaHotelGetWrapper.getOTAHotelGetCancellationPolicyRS();
		    getPoliciesRS.setResNo(otaCancelRS.getResNo());
		    getPoliciesRS.setHBookingID(otaCancelRS.getHBookingID());
		    getPoliciesRS.setHotelId(otaCancelRS.getHotelId());
		    getPoliciesRS.setHotelName(otaCancelRS.getHotelName());
		    getPoliciesRS.setCheckInDate(otaCancelRS.getCheckInDate());
		    getPoliciesRS.setCheckOutDate(otaCancelRS.getCheckOutDate());

		    Policies policies = otaCancelRS.getPolicies();
		    List<com.cnk.travelogix.suppliers.acco.data.Policy> policiesData = getPoliciesData(policies);
		    getPoliciesRS.setPolicies(policiesData);

		    List<ErrorType> errorsData = new ArrayList<>();
		    ErrorType errorTypeData = new ErrorType();
		    List<Errors> errors = otaCancelRS.getErrors();
		    for (Errors otaErrors : errors) {
			Error error = otaErrors.getError();
			errorTypeData.setShortText(error.getShortText());
		    }
		    errorsData.add(errorTypeData);
		    getPoliciesRS.setErrors(errorsData);

		    getPoliciesResponseData.setErrors(errorsData);
		    getPoliciesResponseData.setGetPoliciesRS(getPoliciesRS);
		}
		getPoliciesResponseData.setErrors(getErrorsListData(otaHotelGetWrapper.getErrorList(), supplierIDType.getValue()));
		getPoliciesResponsesData.add(getPoliciesResponseData);
	    }
	}

	getPoliciesResponseWrapper.setGetPoliciesResponses(getPoliciesResponsesData);
	getPoliciesResponseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	getPoliciesResponseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return getPoliciesResponseWrapper;
    }

    /**
     * @param policies
     * @return policiesData
     */
    private List<com.cnk.travelogix.suppliers.acco.data.Policy> getPoliciesData(Policies policies) {
	List<com.cnk.travelogix.suppliers.acco.data.Policy> policiesData = new ArrayList<>();
	if (policies != null) {
	    List<Policy> otaPolicies = policies.getPolicy();
	    for (Policy policy : otaPolicies) {
		com.cnk.travelogix.suppliers.acco.data.Policy policyData = new com.cnk.travelogix.suppliers.acco.data.Policy();
		policyData.setFromDate(getDateGregorianCalendar(policy.getFromDate()));
		policyData.setToDate(getDateGregorianCalendar(policy.getToDate()));

		RoomCatgCode roomCatgCode = policy.getRoomCatgCode();
		com.cnk.travelogix.suppliers.acco.data.RoomCatgCode roomCatgCodeData = new com.cnk.travelogix.suppliers.acco.data.RoomCatgCode();
		roomCatgCodeData.setBfType(roomCatgCode.getBFType());
		roomCatgCodeData.setName(roomCatgCode.getName());

		policyData.setRoomCatgCode(roomCatgCodeData);

		policyData.setExCancelDays(policy.getExCancelDays());
		policyData.setChargeType(policy.getChargeType());
		policyData.setDescription(policy.getDescription());
		policyData.setCurrency(policy.getCurrency());

		List<Days> days = policy.getDays();
		com.cnk.travelogix.suppliers.acco.data.Days daysData = new com.cnk.travelogix.suppliers.acco.data.Days();
		for (Days otaDays : days) {
		    daysData.setCharge(otaDays.getCharge());
		    daysData.setChargeDate(otaDays.getChargeDate());
		}
		policyData.setDays(daysData);
		policiesData.add(policyData);
	    }
	}
	return policiesData;
    }
}
