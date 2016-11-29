package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.CancelInfoRSType;
import org.opentravel.ota._2003._05.CancelRuleType;
import org.opentravel.ota._2003._05.EmailType;
import org.opentravel.ota._2003._05.OTACancelRQ;
import org.opentravel.ota._2003._05.OTACancelRQ.Segment;
import org.opentravel.ota._2003._05.OTACancelRQ.UniqueID;
import org.opentravel.ota._2003._05.OTACancelRQ.Verification;
import org.opentravel.ota._2003._05.OTACancelRS;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TransactionActionType;
import org.opentravel.ota._2003._05.UniqueIDType;
import org.opentravel.ota._2003._05.VerificationType.PersonName;

import com.cnk.travelogix.suppliers.acco.data.CancelInfoRS;
import com.cnk.travelogix.suppliers.acco.data.CancelRule;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelRQ;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelRS;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelReadRequest;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelResponse;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelWrapper;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.acco.OTACancelRQWrapper;
import com.coxandkings.integ.suppl.acco.OTACancelRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Hotel Cancel Converter
 */
public class HotelCancelConverter extends AccoBaseConverter {

    /**
     * @param requestWrapper
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTACancelRQ(HotelCancelWrapper requestWrapper) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTACancelRQWrapper otaCancelRQWrapper = new OTACancelRQWrapper();
	List<HotelCancelReadRequest> cancelWrapper = requestWrapper.getHotelCancelReadRequest();
	for (HotelCancelReadRequest hotelCancelReadRequestData : cancelWrapper) {
	    otaCancelRQWrapper.setSequence(hotelCancelReadRequestData.getSequence());

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(hotelCancelReadRequestData.getSupplierID().getValue());
	    supplierIDType.setMarketType(hotelCancelReadRequestData.getSupplierID().getMarketType());
	    otaCancelRQWrapper.setSupplierID(supplierIDType);

	    OTACancelRQ otaCancelRQ = new OTACancelRQ();
	    HotelCancelRQ hotelCancelRQData = hotelCancelReadRequestData.getHotelCancelRQ();
	    otaCancelRQ.setTarget(hotelCancelRQData.getTarget());
	    otaCancelRQ.setVersion(hotelCancelRQData.getVersion());

	    if (hotelCancelRQData.getCancelType() != null)

		otaCancelRQ.setCancelType(TransactionActionType.CANCEL);

	    Segment segment = setSegmentData(hotelCancelRQData);
	    if (segment.getFirstItinSegNbr() != null)
		otaCancelRQ.getSegment().add(segment);

	    List<UniqueID> uniqueID = setUniqueIDData(hotelCancelRQData.getUniqueID());
	    otaCancelRQ.getUniqueID().addAll(uniqueID);

	    Verification verification = setVerificationData(hotelCancelRQData);
	    if (verification.getPaymentCard() != null)
		otaCancelRQ.setVerification(verification);
	    otaCancelRQWrapper.setOTACancelRQ(otaCancelRQ);
	    requestBody.getOTACancelRQWrapper().add(otaCancelRQWrapper);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return accoInterfaceRQ;
    }

    private Verification setVerificationData(HotelCancelRQ hotelCancelRQData) {
	Verification verification = new Verification();
	com.cnk.travelogix.suppliers.acco.data.Verification verificationData = hotelCancelRQData.getVerification();
	PersonName personNameType = new PersonName();
	if (verificationData != null) {
	    com.cnk.travelogix.suppliers.acco.data.PersonName personNameData = verificationData.getPersonName();
	    personNameType.setSurname(personNameData.getSurname());

	    verification.setPersonName(personNameType);

	    EmailType emailType = new EmailType();
	    verification.setEmail(emailType);

	    final TPAExtensions tpaExtensionsData = verificationData.getTpaExtensions();
	    if (tpaExtensionsData != null) {
		final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_ACCO);
		verification.setTPAExtensions(tpaExtensionsType);
	    }
	}
	return verification;
    }

    private Segment setSegmentData(HotelCancelRQ hotelCancelRQData) {
	Segment segment = new Segment();
	com.cnk.travelogix.suppliers.acco.data.Segment segmentData = hotelCancelRQData.getSegment();
	if (segmentData != null) {
	    segment.setFirstItinSegNbr(segmentData.getFirstItinSegNbr());
	    segment.setItinSegNbr(segmentData.getItinSegNbr());
	    segment.setLastItinSegNbr(segmentData.getLastItinSegNbr());
	}
	return segment;
    }

    /**
     * 
     * @param accoInterfaceRS
     * @return hotelCancelResponseWrapper
     */
    public HotelCancelResponseWrapper fromOTACancelRS(AccoInterfaceRS accoInterfaceRS) {
	HotelCancelResponseWrapper hotelCancelResponseWrapper = new HotelCancelResponseWrapper();
	HotelCancelResponse hotelCancelResponseData;

	final List<HotelCancelResponse> hotelCancelResponsesData = new ArrayList<>();

	final List<OTACancelRSWrapper> otaHotelAvailRSWrapperList = accoInterfaceRS.getResponseBody().getOTACancelRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTACancelRSWrapper otaCancelRSWrapper : otaHotelAvailRSWrapperList) {
		hotelCancelResponseData = new HotelCancelResponse();
		hotelCancelResponseData.setSupplierID(populateGetSupplierId(otaCancelRSWrapper.getSupplierID()));
		hotelCancelResponseData.setSequence(otaCancelRSWrapper.getSequence());

		if (!hasError(otaCancelRSWrapper.getErrorList())) {
		    HotelCancelRS hotelCancelRS = new HotelCancelRS();
		    final OTACancelRS otaCancelRS = otaCancelRSWrapper.getOTACancelRS();
		    if (otaCancelRS != null) {
			hotelCancelRS.setVersion(otaCancelRS.getVersion());
			hotelCancelRS.setErrors(getErrorsData(otaCancelRS.getErrors()));

			com.cnk.travelogix.suppliers.acco.data.UniqueID uniqueIDData = null;
			List<UniqueIDType> uniqueID = otaCancelRS.getUniqueID();
			for (UniqueIDType uniqueIDType : uniqueID) {
			    uniqueIDData = new com.cnk.travelogix.suppliers.acco.data.UniqueID();
			    uniqueIDData.setId(uniqueIDType.getID());
			    uniqueIDData.setType(uniqueIDType.getType());
			}
			hotelCancelRS.setUniqueID(uniqueIDData);

			com.cnk.travelogix.suppliers.acco.data.CancelInfoRS cancelInfoRSData = getCancelInfoRSData(otaCancelRS);
			hotelCancelRS.setCancelInfoRS(cancelInfoRSData);

			com.cnk.travelogix.suppliers.acco.data.Segment segmentData = getCancelSegmentData(otaCancelRS);
			hotelCancelRS.setSegment(segmentData);

			final TPAExtensions tpaExtensionsData = getTpaExtnData(otaCancelRS);
			hotelCancelRS.setTpaExtensions(tpaExtensionsData);

			hotelCancelResponseData.setHotelCancelRS(hotelCancelRS);
		    }
		}
		hotelCancelResponseData.setErrors(getErrorsListData(otaCancelRSWrapper.getErrorList(), otaCancelRSWrapper.getSupplierID().getValue()));
		hotelCancelResponsesData.add(hotelCancelResponseData);
	    }
	}
	hotelCancelResponseWrapper.setHotelCancelResponses(hotelCancelResponsesData);
	hotelCancelResponseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));
	hotelCancelResponseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));

	return hotelCancelResponseWrapper;
    }

    private TPAExtensions getTpaExtnData(OTACancelRS otaCancelRS) {
	final TPAExtensionsType tpaExtensions = otaCancelRS.getTPAExtensions();
	final List<String> elementTypes = new ArrayList<>();
	elementTypes.add("RefundAmount");
	return getTPAExtensionsData(tpaExtensions, elementTypes);
    }

    private com.cnk.travelogix.suppliers.acco.data.Segment getCancelSegmentData(OTACancelRS otaCancelRS) {
	List<org.opentravel.ota._2003._05.OTACancelRS.Segment> otaSegment = otaCancelRS.getSegment();
	com.cnk.travelogix.suppliers.acco.data.Segment segmentData = new com.cnk.travelogix.suppliers.acco.data.Segment();
	for (org.opentravel.ota._2003._05.OTACancelRS.Segment segment : otaSegment) {
	    List<UniqueIDType> otaUniqueID = segment.getUniqueID();
	    com.cnk.travelogix.suppliers.acco.data.UniqueID segmentUniqueIDData = new com.cnk.travelogix.suppliers.acco.data.UniqueID();
	    for (UniqueIDType uniqueIDType : otaUniqueID) {
		segmentUniqueIDData.setId(uniqueIDType.getID());
		segmentUniqueIDData.setType(uniqueIDType.getType());
		segmentData.setUniqueID(segmentUniqueIDData);
	    }
	}
	return segmentData;
    }

    private CancelInfoRS getCancelInfoRSData(OTACancelRS otaCancelRS) {
	CancelInfoRSType cancelInfoRS = otaCancelRS.getCancelInfoRS();
	com.cnk.travelogix.suppliers.acco.data.CancelInfoRS cancelInfoRSData = new com.cnk.travelogix.suppliers.acco.data.CancelInfoRS();

	com.cnk.travelogix.suppliers.acco.data.UniqueID uniqueIDData = new com.cnk.travelogix.suppliers.acco.data.UniqueID();
	UniqueIDType uniqueIDType = new UniqueIDType();
	uniqueIDData.setId(uniqueIDType.getID());
	uniqueIDData.setType(uniqueIDType.getType());

	cancelInfoRSData.setUniqueID(uniqueIDData);

	if (cancelInfoRS != null) {
	    List<CancelRule> cancelRules = new ArrayList<>();
	    List<CancelRuleType> cancelRuleTypes = cancelInfoRS.getCancelRules().getCancelRule();
	    CancelRule cancelRule = new CancelRule();
	    for (CancelRuleType cancelRuleType : cancelRuleTypes) {
		cancelRule.setAmount(cancelRuleType.getAmount());
		cancelRule.setCancelByDate(cancelRuleType.getCancelByDate());
		cancelRule.setCurrencyCode(cancelRuleType.getCurrencyCode());
		cancelRule.setPercent(cancelRuleType.getPercent());
		cancelRule.setType(cancelRuleType.getType());
	    }
	    cancelRules.add(cancelRule);
	    cancelInfoRSData.setCancelRules(cancelRules);
	}
	return cancelInfoRSData;
    }
}
