package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AvailRequestSegmentsType.AvailRequestSegment;
import org.opentravel.ota._2003._05.AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria;
import org.opentravel.ota._2003._05.DateTimeSpanType;
import org.opentravel.ota._2003._05.HotelSearchCriteriaType.Criterion;
import org.opentravel.ota._2003._05.HotelSearchCriterionType.RoomStayCandidates;
import org.opentravel.ota._2003._05.ItemSearchCriterionType.HotelRef;
import org.opentravel.ota._2003._05.OTAHotelAvailRQ;
import org.opentravel.ota._2003._05.OTAHotelAvailRQ.AvailRequestSegments;
import org.opentravel.ota._2003._05.OTAHotelAvailRS;
import org.opentravel.ota._2003._05.ProfilesType.ProfileInfo;
import org.opentravel.ota._2003._05.RoomStayCandidateType;

import com.cnk.travelogix.suppliers.acco.data.GetDetailsReadRequest;
import com.cnk.travelogix.suppliers.acco.data.GetDetailsRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.GetDetailsResponse;
import com.cnk.travelogix.suppliers.acco.data.GetDetailsResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailRQ;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailRS;
import com.cnk.travelogix.suppliers.acco.data.RoomStay;
import com.coxandkings.integ.suppl.acco.OTAHotelAvailRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelAvailRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;

/**
 * Get Details Converter
 */
public class GetDetailsConverter extends AccoBaseConverter {

    /**
     * @param requestWrapper
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAGetDetailRQ(GetDetailsRequestWrapper requestWrapper) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	List<GetDetailsReadRequest> getDetailsReadRequesesData = requestWrapper.getGetDetailsReadRequest();
	for (GetDetailsReadRequest getDetailsReadRequest : getDetailsReadRequesesData) {
	    OTAHotelAvailRQWrapper otaHotelAvailRQWrapper = new OTAHotelAvailRQWrapper();
	    otaHotelAvailRQWrapper.setSequence(getDetailsReadRequest.getSequence());
	    otaHotelAvailRQWrapper.setSupplierID(getDetailsReadRequest.getSupplierID());

	    OTAHotelAvailRQ otaHotelAvailRQ = new OTAHotelAvailRQ();
	    HotelAvailRQ request = getDetailsReadRequest.getHotelAvailRQ();

	    otaHotelAvailRQ.setRequestedCurrency(request.getRequestedCurrency());
	    otaHotelAvailRQ.setTarget(request.getTarget());
	    otaHotelAvailRQ.setVersion(request.getVersion());

	    AvailRequestSegments otaAvailRequestSegments = new AvailRequestSegments();
	    AvailRequestSegment otaAvailRequestSegment = new AvailRequestSegment();
	    HotelSearchCriteria hotelSearchCriteriaType = new HotelSearchCriteria();

	    Criterion hotelCriterion;
	    List<com.cnk.travelogix.suppliers.acco.data.AvailRequestSegment> availRequestSegmentsData = request.getAvailRequestSegments();
	    for (com.cnk.travelogix.suppliers.acco.data.AvailRequestSegment availRequestSegment : availRequestSegmentsData) {

		com.cnk.travelogix.suppliers.acco.data.HotelSearchCriteria hotelSearchCriteria = availRequestSegment.getHotelSearchCriteria();
		if (hotelSearchCriteria.getAvailableOnlyIndicator() != null)
		    hotelSearchCriteriaType.setAvailableOnlyIndicator(hotelSearchCriteria.getAvailableOnlyIndicator());

		hotelCriterion = setCriterion(hotelSearchCriteria);
		hotelSearchCriteriaType.getCriterion().add(hotelCriterion);

	    }
	    otaAvailRequestSegment.setHotelSearchCriteria(hotelSearchCriteriaType);
	    otaAvailRequestSegments.getAvailRequestSegment().add(otaAvailRequestSegment);
	    otaHotelAvailRQ.setAvailRequestSegments(otaAvailRequestSegments);

	    otaHotelAvailRQWrapper.setOTAHotelAvailRQ(otaHotelAvailRQ);
	    requestBody.getOTAHotelAvailRQWrapper().add(otaHotelAvailRQWrapper);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return accoInterfaceRQ;
    }

    private Criterion setCriterion(com.cnk.travelogix.suppliers.acco.data.HotelSearchCriteria hotelSearchCriteria) {
	Criterion hotelCriterion = new Criterion();
	List<com.cnk.travelogix.suppliers.acco.data.Criterion> criterionData = hotelSearchCriteria.getCriterion();
	for (com.cnk.travelogix.suppliers.acco.data.Criterion criterion : criterionData) {

	    HotelRef otaHotelRef = setHotelRef(criterion);
	    hotelCriterion.getHotelRef().add(otaHotelRef);

	    DateTimeSpanType dateTimeSpanType = setDateTimeSpan(criterion);
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

    /**
     * This is response method where it will accept the ota as parameter and set
     * it to generated bean
     * 
     * @param accoInterfaceRS
     * @return GetDetailsResponseWrapper
     */
    public GetDetailsResponseWrapper fromOTAGetDetailRS(AccoInterfaceRS accoInterfaceRS) {
	GetDetailsResponseWrapper getDetailsResponseWrapper = new GetDetailsResponseWrapper();
	GetDetailsResponse getDetailsResponseData;
	final List<GetDetailsResponse> getDetailsResponsesData = new ArrayList<>();
	final List<OTAHotelAvailRSWrapper> otaHotelAvailRSWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelAvailRSWrapper();

	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelAvailRSWrapper otaHotelAvailRSWrapperData : otaHotelAvailRSWrapperList) {
		getDetailsResponseData = new GetDetailsResponse();
		getDetailsResponseData.setSequence(otaHotelAvailRSWrapperData.getSequence());
		getDetailsResponseData.setSupplierID(otaHotelAvailRSWrapperData.getSupplierID());
		if (!hasError(otaHotelAvailRSWrapperData.getErrorList())) {
		    HotelAvailRS response = new HotelAvailRS();

		    OTAHotelAvailRS otaHotelAvailRS = otaHotelAvailRSWrapperData.getOTAHotelAvailRS();
		    if (otaHotelAvailRS != null) {
			response.setVersion(otaHotelAvailRS.getVersion());

			List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStays = new ArrayList<>();
			List<RoomStay> roomStayData = getRoomStayData(otaHotelAvailRS);
			roomStays.addAll(roomStayData);
			response.setRoomStays(roomStays);

			getDetailsResponseData.setGetDetailResponse(response);
		    }
		}
		getDetailsResponseData.setErrors(getErrorsListData(otaHotelAvailRSWrapperData.getErrorList(), otaHotelAvailRSWrapperData.getSupplierID()));
		getDetailsResponsesData.add(getDetailsResponseData);
	    }
	}
	getDetailsResponseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	getDetailsResponseWrapper.setGetDetailsResponses(getDetailsResponsesData);
	getDetailsResponseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return getDetailsResponseWrapper;
    }
}
