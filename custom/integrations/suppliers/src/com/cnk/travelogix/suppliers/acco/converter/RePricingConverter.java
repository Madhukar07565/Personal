package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AvailRequestSegmentsType.AvailRequestSegment;
import org.opentravel.ota._2003._05.AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria;
import org.opentravel.ota._2003._05.CustomerType;
import org.opentravel.ota._2003._05.CustomerType.CitizenCountryName;
import org.opentravel.ota._2003._05.DateTimeSpanType;
import org.opentravel.ota._2003._05.HotelSearchCriteriaType.Criterion;
import org.opentravel.ota._2003._05.HotelSearchCriterionType.RoomStayCandidates;
import org.opentravel.ota._2003._05.OTAHotelAvailRQ;
import org.opentravel.ota._2003._05.OTAHotelAvailRQ.AvailRequestSegments;
import org.opentravel.ota._2003._05.OTAHotelAvailRS;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.ProfileType;
import org.opentravel.ota._2003._05.ProfilesType.ProfileInfo;
import org.opentravel.ota._2003._05.RoomStayCandidateType;
import org.opentravel.ota._2003._05.TPAExtensionsType;

import com.cnk.travelogix.suppliers.acco.data.HotelAvailRQ;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailRS;
import com.cnk.travelogix.suppliers.acco.data.PersonName;
import com.cnk.travelogix.suppliers.acco.data.Profile;
import com.cnk.travelogix.suppliers.acco.data.RePricingReadRequest;
import com.cnk.travelogix.suppliers.acco.data.RePricingRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.RePricingResponse;
import com.cnk.travelogix.suppliers.acco.data.RePricingResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.RoomStay;
import com.coxandkings.integ.suppl.acco.OTAHotelAvailRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelAvailRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;

/**
 * Re Pricing Converter
 */
public class RePricingConverter extends AccoBaseConverter {

    /**
     * @param requestWrapper
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTARePricingRQ(RePricingRequestWrapper requestWrapper) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();

	List<RePricingReadRequest> rePricingReadRequesesData = requestWrapper.getRePricingReadRequest();
	for (RePricingReadRequest getDetailsReadRequest : rePricingReadRequesesData) {
	    OTAHotelAvailRQWrapper otaHotelAvailRQWrapper = new OTAHotelAvailRQWrapper();
	    otaHotelAvailRQWrapper.setSequence(getDetailsReadRequest.getSequence());
	    otaHotelAvailRQWrapper.setSupplierID(getDetailsReadRequest.getSupplierID());

	    OTAHotelAvailRQ otaHotelAvailRQ = new OTAHotelAvailRQ();
	    HotelAvailRQ rePricingHotelRequest = getDetailsReadRequest.getHotelAvailRQ();

	    otaHotelAvailRQ.setRequestedCurrency(rePricingHotelRequest.getRequestedCurrency());
	    otaHotelAvailRQ.setTarget(rePricingHotelRequest.getTarget());
	    otaHotelAvailRQ.setVersion(rePricingHotelRequest.getVersion());

	    AvailRequestSegments availRequestSegments = new AvailRequestSegments();
	    AvailRequestSegment otaAvailRequestSegment = new AvailRequestSegment();
	    HotelSearchCriteria hotelSearchCriteriaType = new HotelSearchCriteria();

	    Criterion hotelCriterion;

	    List<com.cnk.travelogix.suppliers.acco.data.AvailRequestSegment> availRequestSegmentsData = rePricingHotelRequest.getAvailRequestSegments();
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

	    org.opentravel.ota._2003._05.ItemSearchCriterionType.HotelRef otaHotelRef = setHotelRef(criterion);
	    hotelCriterion.getHotelRef().add(otaHotelRef);

	    DateTimeSpanType dateTimeSpanType = setDateTimeSpan(criterion);
	    hotelCriterion.setStayDateRange(dateTimeSpanType);

	    RoomStayCandidates candidates = new RoomStayCandidates();
	    RoomStayCandidateType roomStayCandidateType = setRoomStayCandidate(criterion);
	    candidates.getRoomStayCandidate().add(roomStayCandidateType);
	    hotelCriterion.setRoomStayCandidates(candidates);

	    ProfileInfo profileInfo = setProfilesTypeResponse(criterion);
	    if (hotelCriterion.getProfiles() != null)
		hotelCriterion.getProfiles().getProfileInfo().add(profileInfo);
	}
	return hotelCriterion;

    }

    private ProfileInfo setProfilesTypeResponse(com.cnk.travelogix.suppliers.acco.data.Criterion criterion) {
	ProfileInfo profileInfo = new ProfileInfo();
	List<com.cnk.travelogix.suppliers.acco.data.ProfileInfo> profiles = criterion.getProfiles();
	if (profiles != null) {
	    for (com.cnk.travelogix.suppliers.acco.data.ProfileInfo profileInfoData : profiles) {
		PersonNameType otaPersonNameType = new PersonNameType();
		Profile profileData = profileInfoData.getProfile();
		List<PersonName> personNameTypes = profileData.getPersonName();
		for (PersonName personName : personNameTypes) {
		    otaPersonNameType.getGivenName().add(personName.getGivenName().toString());
		    otaPersonNameType.setSurname(personName.getSurname());

		    profileData.getPersonName().add(personName);
		}
		ProfileType profileType = new ProfileType();

		CitizenCountryName otaCitizenCountryName = new CitizenCountryName();
		CustomerType otaCustomerType = new CustomerType();
		com.cnk.travelogix.suppliers.acco.data.CustomerType customerType = profileData.getCustomer();

		List<com.cnk.travelogix.suppliers.acco.data.CitizenCountryName> citizenCountryNameData = customerType.getCitizenCountryName();
		for (com.cnk.travelogix.suppliers.acco.data.CitizenCountryName citizenCountryName : citizenCountryNameData) {
		    otaCitizenCountryName.setCode(citizenCountryName.getCode());
		}
		otaCustomerType.getCitizenCountryName().add(otaCitizenCountryName);
		profileType.setCustomer(otaCustomerType);

		TPAExtensionsType tpaExtensions = setTPAExtensions(profileInfoData);
		profileType.setTPAExtensions(tpaExtensions);

		profileInfo.setProfile(profileType);
	    }
	}
	return profileInfo;
    }

    /**
     * This is response method where it will accept the ota as parameter and set
     * it to generated bean
     * 
     * @param accoInterfaceRS
     * @return RePricingResponseWrapper
     */
    public RePricingResponseWrapper fromOTARePricingRS(AccoInterfaceRS accoInterfaceRS) {
	RePricingResponseWrapper rePricingResponseWrapper = new RePricingResponseWrapper();
	RePricingResponse rePricingResponseData;
	final List<RePricingResponse> rePricingResponsesData = new ArrayList<>();

	final List<OTAHotelAvailRSWrapper> otaHotelAvailRSWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelAvailRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelAvailRSWrapper otaHotelAvailRSWrapperData : otaHotelAvailRSWrapperList) {
		rePricingResponseData = new RePricingResponse();
		rePricingResponseData.setSequence(otaHotelAvailRSWrapperData.getSequence());
		rePricingResponseData.setSupplierID(otaHotelAvailRSWrapperData.getSupplierID());
		if (!hasError(otaHotelAvailRSWrapperData.getErrorList())) {
		    HotelAvailRS response = new HotelAvailRS();

		    OTAHotelAvailRS otaHotelAvailRS = otaHotelAvailRSWrapperData.getOTAHotelAvailRS();
		    if (otaHotelAvailRS != null) {
			response.setVersion(otaHotelAvailRS.getVersion());
			List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStays = new ArrayList<>();
			List<RoomStay> roomStayData = getRoomStayData(otaHotelAvailRS);
			roomStays.addAll(roomStayData);
			response.setRoomStays(roomStays);

			rePricingResponseData.setRePricingResponse(response);
		    }
		}
		rePricingResponseData.setErrors(getErrorsListData(otaHotelAvailRSWrapperData.getErrorList(), otaHotelAvailRSWrapperData.getSupplierID()));
		rePricingResponsesData.add(rePricingResponseData);
	    }
	}
	rePricingResponseWrapper.setRePricingResponses(rePricingResponsesData);
	rePricingResponseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	rePricingResponseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return rePricingResponseWrapper;
    }
}
