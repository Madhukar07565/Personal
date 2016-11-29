package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.CompanyNameType;
import org.opentravel.ota._2003._05.OTAAirBookModifyRQ;
import org.opentravel.ota._2003._05.OTAAirBookRS;
import org.opentravel.ota._2003._05.OTAAirBookRS.AirReservation;
import org.opentravel.ota._2003._05.SpecialReqDetailsType;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SpecialServiceRequests;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest;
import org.opentravel.ota._2003._05.SuccessType;
import org.opentravel.ota._2003._05.TravelerInfoType;
import org.opentravel.ota._2003._05.WarningsType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cnk.travelogix.suppliers.air.data.AirBookModifyRequest;
import com.cnk.travelogix.suppliers.air.data.AirBookRS;
import com.cnk.travelogix.suppliers.air.data.AirBookResponse;
import com.cnk.travelogix.suppliers.air.data.AirPushSSRRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPushSSRResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.CompanyName;
import com.cnk.travelogix.suppliers.air.data.SpecialReqDetail;
import com.cnk.travelogix.suppliers.air.data.TravelerInfo;
import com.coxandkings.integ.suppl.air.OTAAirBookModifyRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirBookRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

/**
 * Air Push SSR Converter
 */
public class AirPushSSRConverter extends AirBaseConverter {

    private static final Logger LOG = LoggerFactory.getLogger(AirPushSSRConverter.class);

    /**
     * @param requestWrapper
     * @return airInterfaceRQ
     */
    public AirInterfaceRQ toOTAAirPushSSRRQ(AirPushSSRRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAAirBookModifyRQWrapper otaAirBookModifyRQWrapper;

	final List<AirBookModifyRequest> airBookModifyRequestData = requestWrapper.getAirBookModifyRQWrapper();
	for (AirBookModifyRequest airBookModifyRequest : airBookModifyRequestData) {
	    otaAirBookModifyRQWrapper = new OTAAirBookModifyRQWrapper();
	    OTAAirBookModifyRQ otaAirBookModifyRQ = new OTAAirBookModifyRQ();
	    if (airBookModifyRequest.getSequence() != null)
		otaAirBookModifyRQWrapper.setSequence(airBookModifyRequest.getSequence());
	    com.cnk.travelogix.suppliers.air.data.AirBookModifyRQ airBookModifyRq = airBookModifyRequest.getAirBookModifyRQ();

	    otaAirBookModifyRQ.setVersion(airBookModifyRq.getVersion());
	    if (airBookModifyRq.getTimeStamp() != null) {
		otaAirBookModifyRQ.setTimeStamp(toXMLGregorianCalendar(airBookModifyRq.getTimeStamp()));
	    }

	    com.cnk.travelogix.suppliers.air.data.AirReservation airReservationData = airBookModifyRq.getAirReservation();
	    AirReservation airReservation = new AirReservation();
	    TravelerInfo travelerInfoData = airReservationData.getTravelerInfo();
	    TravelerInfoType travelerInfoType = new TravelerInfoType();

	    SpecialReqDetailsType specialReqDetailsType = new SpecialReqDetailsType();
	    List<SpecialReqDetail> specialReqDetailsDataList = travelerInfoData.getSpecialReqDetails();
	    for (SpecialReqDetail specialReqDetail : specialReqDetailsDataList) {
		com.cnk.travelogix.suppliers.air.data.SpecialServiceRequests specialServiceRequestsData = specialReqDetail.getSpecialServiceRequests();
		SpecialServiceRequests specialServiceRequests = new SpecialServiceRequests();
		List<com.cnk.travelogix.suppliers.air.data.SpecialServiceRequest> specialServiceRequestData = specialServiceRequestsData.getSpecialServiceRequest();
		for (com.cnk.travelogix.suppliers.air.data.SpecialServiceRequest specialServiceRequest : specialServiceRequestData) {
		    SpecialServiceRequest otaSpecialServiceRequest = new SpecialServiceRequest();
		    otaSpecialServiceRequest.getTravelerRefNumberRPHList().addAll(specialServiceRequest.getTravelerRefNumberRPHList());

		    CompanyNameType companyNameType = new CompanyNameType();
		    CompanyName companyNameData = specialServiceRequest.getAirline();
		    companyNameType.setCode(companyNameData.getCode());
		    otaSpecialServiceRequest.setAirline(companyNameType);
		    specialServiceRequests.getSpecialServiceRequest().add(otaSpecialServiceRequest);
		}
		specialReqDetailsType.setSpecialServiceRequests(specialServiceRequests);
	    }
	    travelerInfoType.getSpecialReqDetails().add(specialReqDetailsType);
	    airReservation.setTravelerInfo(travelerInfoType);
	    otaAirBookModifyRQ.setAirReservation(airReservation);
	    otaAirBookModifyRQWrapper.setOTAAirBookModifyRQ(otaAirBookModifyRQ);

	    requestBody.getOTAAirBookModifyRQWrapper().add(otaAirBookModifyRQWrapper);
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;
    }

    /**
     * @param airInterfaceRS
     * @return airPushSSRResponseWrapper
     */
    public AirPushSSRResponseWrapper fromOTAAirPushSSRRS(AirInterfaceRS airInterfaceRS) {
	final AirPushSSRResponseWrapper airPushSSRResponseWrapper = new AirPushSSRResponseWrapper();
	AirBookResponse airPushSSRResponseData;
	final List<AirBookResponse> airBookResponsesData = new ArrayList<>();
	final List<OTAAirBookRSWrapper> otaAirBookRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirBookRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirBookRSWrapper otaAirBookRSWrapper : otaAirBookRSWrapperList) {
		airPushSSRResponseData = new AirBookResponse();
		final AirBookRS airPushSSRRSData = new AirBookRS();
		final OTAAirBookRS otaAirBookRS = otaAirBookRSWrapper.getOTAAirBookRS();
		airPushSSRResponseData.setSequence(otaAirBookRSWrapper.getSequence());
		String supplierId = otaAirBookRSWrapper.getSupplierID().getValue();
		if (!hasError(otaAirBookRSWrapper.getErrorList())) {
		    airPushSSRRSData.setVersion(otaAirBookRS.getVersion());
		    airPushSSRRSData.setTransactionStatusCode(otaAirBookRS.getTransactionStatusCode());
		    final List<Object> successAndWarningsAndAirReservation = otaAirBookRS.getSuccessAndWarningsAndAirReservation();
		    for (Object object : successAndWarningsAndAirReservation) {
			if (object instanceof SuccessType) {
			    final SuccessType successType = (SuccessType) object;
			    LOG.debug("SuccessType::{}", successType);
			} else if (object instanceof WarningsType) {
			    final WarningsType warningsType = (WarningsType) object;
			    List<com.cnk.travelogix.suppliers.air.data.Warning> warningTypes = populateWarningType(warningsType.getWarning());
			    airPushSSRRSData.setWarnings(warningTypes);
			}
		    }
		    airPushSSRRSData.setErrors(getErrorsData(otaAirBookRS.getErrors(), supplierId));
		    airPushSSRResponseData.setAirBookRS(airPushSSRRSData);
		}
		airPushSSRResponseData.setErrors(getErrorsListData(otaAirBookRSWrapper.getErrorList(), supplierId));
		airBookResponsesData.add(airPushSSRResponseData);
	    }
	}
	airPushSSRResponseWrapper.setAirBookResponses(airBookResponsesData);
	airPushSSRResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airPushSSRResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airPushSSRResponseWrapper;
    }
}
