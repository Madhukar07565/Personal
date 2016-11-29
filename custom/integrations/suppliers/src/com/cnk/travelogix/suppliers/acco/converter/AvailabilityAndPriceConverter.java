package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AvailRequestSegmentsType.AvailRequestSegment;
import org.opentravel.ota._2003._05.AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria;
import org.opentravel.ota._2003._05.DateTimeSpanType;
import org.opentravel.ota._2003._05.HotelSearchCriteriaType.Criterion;
import org.opentravel.ota._2003._05.HotelSearchCriterionType.RoomStayCandidates;
import org.opentravel.ota._2003._05.ItemSearchCriterionType;
import org.opentravel.ota._2003._05.ItemSearchCriterionType.Address;
import org.opentravel.ota._2003._05.ItemSearchCriterionType.HotelRef;
import org.opentravel.ota._2003._05.ItemSearchCriterionType.Position;
import org.opentravel.ota._2003._05.ItemSearchCriterionType.RefPoint;
import org.opentravel.ota._2003._05.OTAHotelAvailRQ;
import org.opentravel.ota._2003._05.OTAHotelAvailRQ.AvailRequestSegments;
import org.opentravel.ota._2003._05.OTAHotelAvailRS;
import org.opentravel.ota._2003._05.OTAHotelAvailRS.RoomStays.RoomStay;
import org.opentravel.ota._2003._05.ProfilesType.ProfileInfo;
import org.opentravel.ota._2003._05.RoomStayCandidateType;

import com.cnk.travelogix.suppliers.acco.data.HotelAvailRQ;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailRS;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailReadRequest;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailResponse;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.RoomRate;
import com.cnk.travelogix.suppliers.acco.data.Success;
import com.coxandkings.integ.suppl.acco.OTAHotelAvailRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelAvailRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Availability And Price Converter
 */
public class AvailabilityAndPriceConverter extends AccoBaseConverter {

    /**
     * @param requestWrapper
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAHotelAvailRQ(HotelAvailRequestWrapper requestWrapper) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAHotelAvailRQWrapper otaHotelAvailRQWrapper = new OTAHotelAvailRQWrapper();
	HotelAvailReadRequest hotelAvailReadRequesData = requestWrapper.getHotelAvailReadRequest();
	otaHotelAvailRQWrapper.setSequence(hotelAvailReadRequesData.getSequence());

	final SupplierIDType supplierIDType = new SupplierIDType();
	supplierIDType.setValue(hotelAvailReadRequesData.getSupplierID().getValue());
	supplierIDType.setMarketType(hotelAvailReadRequesData.getSupplierID().getMarketType());
	otaHotelAvailRQWrapper.setSupplierID(supplierIDType.toString());

	OTAHotelAvailRQ otaHotelAvailRQ = new OTAHotelAvailRQ();
	HotelAvailRQ hotelAvailRQRequest = hotelAvailReadRequesData.getHotelAvailRQ();
	if (hotelAvailRQRequest != null) {
	    otaHotelAvailRQ.setRequestedCurrency(hotelAvailRQRequest.getRequestedCurrency());
	    otaHotelAvailRQ.setTarget(hotelAvailRQRequest.getTarget());
	    otaHotelAvailRQ.setVersion(hotelAvailRQRequest.getVersion());

	    AvailRequestSegments availRequestSegments = new AvailRequestSegments();
	    AvailRequestSegment otaAvailRequestSegment = new AvailRequestSegment();
	    HotelSearchCriteria hotelSearchCriteriaType = new HotelSearchCriteria();
	    Criterion hotelCriterion;
	    List<com.cnk.travelogix.suppliers.acco.data.AvailRequestSegment> availRequestSegmentsData = hotelAvailRQRequest.getAvailRequestSegments();
	    for (com.cnk.travelogix.suppliers.acco.data.AvailRequestSegment availRequestSegment : availRequestSegmentsData) {

		com.cnk.travelogix.suppliers.acco.data.HotelSearchCriteria hotelSearchCriteria = availRequestSegment.getHotelSearchCriteria();
		if (hotelSearchCriteria.getAvailableOnlyIndicator() != null)
		    hotelSearchCriteriaType.setAvailableOnlyIndicator(hotelSearchCriteria.getAvailableOnlyIndicator());
		hotelCriterion = setCriterion(hotelSearchCriteria);
		hotelSearchCriteriaType.getCriterion().add(hotelCriterion);
	    }
	    otaAvailRequestSegment.setHotelSearchCriteria(hotelSearchCriteriaType);
	    availRequestSegments.getAvailRequestSegment().add(otaAvailRequestSegment);
	    otaHotelAvailRQ.setAvailRequestSegments(availRequestSegments);

	    requestBody.setOTAHotelAvailRQ(otaHotelAvailRQ);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	otaHotelAvailRQWrapper.setOTAHotelAvailRQ(otaHotelAvailRQ);
	return accoInterfaceRQ;
    }

    private Criterion setCriterion(com.cnk.travelogix.suppliers.acco.data.HotelSearchCriteria hotelSearchCriteria) {
	Criterion hotelCriterion = new Criterion();
	List<com.cnk.travelogix.suppliers.acco.data.Criterion> criterionData = hotelSearchCriteria.getCriterion();
	for (com.cnk.travelogix.suppliers.acco.data.Criterion criterion : criterionData) {

	    Address address = setAddressData(criterion);
	    if (address.getCounty() != null)
		hotelCriterion.setAddress(address);

	    RefPoint otarefPoint = setRefPoint(criterion);
	    if (otarefPoint.getCode() != null)
		hotelCriterion.getRefPoint().add(otarefPoint);

	    HotelRef otaHotelRef = setHotelRef(criterion);
	    if (otaHotelRef.getHotelCityCode() != null)
		hotelCriterion.getHotelRef().add(otaHotelRef);

	    Position position = setPosition(criterion);
	    if (position.getLatitude() != null)
		hotelCriterion.setPosition(position);

	    DateTimeSpanType dateTimeSpanType = setDateTimeSpan(criterion);
	    if (dateTimeSpanType.getStart() != null)
		hotelCriterion.setStayDateRange(dateTimeSpanType);

	    RoomStayCandidates candidates = new RoomStayCandidates();
	    RoomStayCandidateType roomStayCandidateType = setRoomStayCandidate(criterion);
	    candidates.getRoomStayCandidate().add(roomStayCandidateType);
	    hotelCriterion.setRoomStayCandidates(candidates);

	    ProfileInfo profileInfo = setProfilesType(criterion);
	    if (hotelCriterion.getProfiles() != null)
		hotelCriterion.getProfiles().getProfileInfo().add(profileInfo);
	}
	return hotelCriterion;
    }

    private Position setPosition(com.cnk.travelogix.suppliers.acco.data.Criterion criterion) {
	Position position = new Position();
	com.cnk.travelogix.suppliers.acco.data.Position positionData = criterion.getPosition();
	if (positionData != null) {
	    position.setLatitude(positionData.getLatitude());
	    position.setLongitude(positionData.getLongitude());
	    position.setAltitudeUnitOfMeasureCode(positionData.getAltitudeUnitOfMeasureCode());
	}
	return position;
    }

    private Address setAddressData(com.cnk.travelogix.suppliers.acco.data.Criterion criterion) {
	Address address = new Address();
	com.cnk.travelogix.suppliers.acco.data.Address addressData = criterion.getAddress();
	if (addressData != null) {
	    address.setCityName(addressData.getCityName());
	}
	return address;
    }

    private RefPoint setRefPoint(com.cnk.travelogix.suppliers.acco.data.Criterion criterion) {
	org.opentravel.ota._2003._05.ItemSearchCriterionType.RefPoint otarefPoint = new ItemSearchCriterionType.RefPoint();
	List<com.cnk.travelogix.suppliers.acco.data.RefPoint> refPointData = criterion.getRefPoint();
	if (refPointData != null) {
	    for (com.cnk.travelogix.suppliers.acco.data.RefPoint refPoint : refPointData) {
		otarefPoint.setCountryCode(refPoint.getCountryCode());
		otarefPoint.setStateProv(refPoint.getStateProv());
	    }
	}
	return otarefPoint;
    }

    /**
     * Response method
     * 
     * @param accoInterfaceRS
     * @return HotelAvailResponseWrapper
     */
    public HotelAvailResponseWrapper fromOTAHotelAvailRS(AccoInterfaceRS accoInterfaceRS) {
	HotelAvailResponseWrapper hotelAvailResponseWrapper = new HotelAvailResponseWrapper();
	HotelAvailResponse hotelAvailResponseData;
	final List<HotelAvailResponse> hotelAvailResponsesData = new ArrayList<>();
	final List<OTAHotelAvailRSWrapper> otaHotelAvailRSWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelAvailRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelAvailRSWrapper otaHotelAvailRSWrapperData : otaHotelAvailRSWrapperList) {
		hotelAvailResponseData = new HotelAvailResponse();
		hotelAvailResponseData.setSequence(otaHotelAvailRSWrapperData.getSequence());
		hotelAvailResponseData.setSupplierID(otaHotelAvailRSWrapperData.getSupplierID());
		if (!hasError(otaHotelAvailRSWrapperData.getErrorList())) {
		    HotelAvailRS response = new HotelAvailRS();
		    OTAHotelAvailRS otaHotelAvailRS = otaHotelAvailRSWrapperData.getOTAHotelAvailRS();
		    response.setVersion(otaHotelAvailRS.getVersion());
		    Success successData = new Success();
		    //No Attributes
		    response.setSuccess(successData);

		    List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStayList = new ArrayList<>();
		    com.cnk.travelogix.suppliers.acco.data.RoomStay roomStayData = getAvailableRoomStayData(otaHotelAvailRS);
		    roomStayList.add(roomStayData);
		    response.setRoomStays(roomStayList);

		    hotelAvailResponseData.setHotelAvailResponse(response);
		}
		hotelAvailResponseData.setErrors(getErrorsListData(otaHotelAvailRSWrapperData.getErrorList(), otaHotelAvailRSWrapperData.getSupplierID()));
		hotelAvailResponsesData.add(hotelAvailResponseData);
	    }
	    hotelAvailResponseWrapper.setHotelAvailResponses(hotelAvailResponsesData);
	}
	hotelAvailResponseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));
	hotelAvailResponseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));

	return hotelAvailResponseWrapper;
    }

    private com.cnk.travelogix.suppliers.acco.data.RoomStay getAvailableRoomStayData(OTAHotelAvailRS otaHotelAvailRS) {
	com.cnk.travelogix.suppliers.acco.data.RoomStay roomStayData = new com.cnk.travelogix.suppliers.acco.data.RoomStay();
	if (otaHotelAvailRS.getRoomStays() != null) {
	    List<RoomStay> otaroomStay = otaHotelAvailRS.getRoomStays().getRoomStay();
	    for (RoomStay roomStay : otaroomStay) {
		roomStayData = new com.cnk.travelogix.suppliers.acco.data.RoomStay();
		roomStayData.setRph(roomStay.getRPH());

		populateRoomAvailableRoomStayData(roomStay, roomStayData);

		List<RoomRate> roomRates = new ArrayList<>();
		List<RoomRate> roomRateData = setRoomRateData(roomStay);
		roomRates.addAll(roomRateData);
		roomStayData.setRoomRates(roomRates);

		com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo basicPropertyInfoData = setBasicPropertyInfoData(roomStay);
		roomStayData.setBasicPropertyInfo(basicPropertyInfoData);
	    }
	}
	return roomStayData;
    }
}
