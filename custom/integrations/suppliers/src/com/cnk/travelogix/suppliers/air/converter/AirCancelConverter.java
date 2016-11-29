/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.opentravel.ota._2003._05.CancelInfoRSType;
import org.opentravel.ota._2003._05.CancelInfoRSType.CancelRules;
import org.opentravel.ota._2003._05.CancelRuleType;
import org.opentravel.ota._2003._05.CompanyNameType;
import org.opentravel.ota._2003._05.LocationType;
import org.opentravel.ota._2003._05.OTACancelRQ;
import org.opentravel.ota._2003._05.OTACancelRQ.OriginAndDestinationSegment;
import org.opentravel.ota._2003._05.OTACancelRQ.UniqueID;
import org.opentravel.ota._2003._05.OTACancelRQ.Verification;
import org.opentravel.ota._2003._05.OTACancelRS;
import org.opentravel.ota._2003._05.OTACancelRS.Segment;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.SpecialReqDetailsType;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SpecialServiceRequests;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TransactionActionType;
import org.opentravel.ota._2003._05.UniqueIDType;
import org.opentravel.ota._2003._05.VerificationType.EndLocation;
import org.opentravel.ota._2003._05.VerificationType.StartLocation;
import org.opentravel.ota._2003._05.WarningType;
import org.opentravel.ota._2003._05.WarningsType;
import org.springframework.util.StringUtils;

import com.cnk.travelogix.suppliers.acco.data.CancelInfoRS;
import com.cnk.travelogix.suppliers.acco.data.CancelRule;
import com.cnk.travelogix.suppliers.air.data.AirCancelRS;
import com.cnk.travelogix.suppliers.air.data.AirCancelResponse;
import com.cnk.travelogix.suppliers.air.data.AirCancelResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirCancellRQ;
import com.cnk.travelogix.suppliers.air.data.AirCancellRequest;
import com.cnk.travelogix.suppliers.air.data.AirCancellRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.CompanyName;
import com.cnk.travelogix.suppliers.air.data.SpecialRequests;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.OTACancelRQWrapper;
import com.coxandkings.integ.suppl.air.OTACancelRSWrapper;
import com.coxandkings.integ.suppl.air.ObjectFactory;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * @author I077988
 */
public class AirCancelConverter extends AirBaseConverter {

    /**
     * @param requestWrapper
     * @return airInterfaceRQ
     */
    public AirInterfaceRQ toOTACancelRQ(final AirCancellRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	final List<AirCancellRequest> airCancellRequestsData = requestWrapper.getAirCancellRequests();
	OTACancelRQWrapper otaCancelRQWrapper;
	for (AirCancellRequest airCancellRequestData : airCancellRequestsData) {
	    otaCancelRQWrapper = new OTACancelRQWrapper();
	    final SupplierIDType supplierIDType = populateSupplierId(airCancellRequestData.getSupplierID());
	    otaCancelRQWrapper.setSupplierID(supplierIDType);
	    otaCancelRQWrapper.setSequence(airCancellRequestData.getSequence());

	    final AirCancellRQ airCancelRQData = airCancellRequestData.getAirCancellRQ();
	    final OTACancelRQ otaCancelRQ = new OTACancelRQ();
	    otaCancelRQ.setVersion(airCancelRQData.getVersion());
	    otaCancelRQ.setTarget(airCancelRQData.getTarget());
	    final String cancelType = airCancelRQData.getCancelType();
	    if (StringUtils.hasText(cancelType)) {
		otaCancelRQ.setCancelType(TransactionActionType.fromValue(cancelType));
	    }

	    final List<com.cnk.travelogix.suppliers.air.data.UniqueID> uniqueIDsData = airCancelRQData.getUniqueIDs();
	    UniqueID uniqueId;
	    for (com.cnk.travelogix.suppliers.air.data.UniqueID uniqueIDdata : uniqueIDsData) {
		uniqueId = new UniqueID();
		uniqueId.setID(uniqueIDdata.getId());
		uniqueId.setType(uniqueIDdata.getType());
		uniqueId.setIDContext(uniqueIDdata.getIdContext());
		uniqueId.setTPAExtensions(populateTPAExtensionsUniqueID(uniqueIDdata.getTpaExtensions()));
		otaCancelRQ.getUniqueID().add(uniqueId);
	    }

	    final POSType pos = new POSType();
	    final SourceType sourceType = new SourceType();
	    pos.getSource().add(sourceType);
	    otaCancelRQ.setPOS(pos);

	    final com.cnk.travelogix.suppliers.air.data.Verification verificationData = airCancelRQData.getVerification();
	    if (verificationData != null) {
		final Verification verification = new Verification();
		final StartLocation startLocation = new StartLocation();
		startLocation.setLocationCode(verificationData.getStartLocation().getLocationCode());
		startLocation.setAssociatedDateTime(toXMLGregorianCalendar(verificationData.getStartLocation().getAssociatedDateTime()));
		verification.setStartLocation(startLocation);
		final EndLocation endLocation = new EndLocation();
		endLocation.setLocationCode(verificationData.getEndLocation().getLocationCode());
		endLocation.setAssociatedDateTime(toXMLGregorianCalendar(verificationData.getEndLocation().getAssociatedDateTime()));
		verification.setEndLocation(endLocation);
		otaCancelRQ.setVerification(verification);
	    }

	    final List<com.cnk.travelogix.suppliers.air.data.OriginAndDestinationSegment> originAndDestSegsData = airCancelRQData.getOriginAndDestinationSegment();
	    if (originAndDestSegsData != null && !originAndDestSegsData.isEmpty()) {
		OriginAndDestinationSegment originAndDestSeg;
		for (com.cnk.travelogix.suppliers.air.data.OriginAndDestinationSegment originAndDestSegData : originAndDestSegsData) {
		    originAndDestSeg = new OriginAndDestinationSegment();
		    final LocationType orignLocation = new LocationType();
		    orignLocation.setLocationCode(originAndDestSegData.getOriginLocation().getLocationCode());
		    originAndDestSeg.setOriginLocation(orignLocation);
		    final LocationType destLocation = new LocationType();
		    destLocation.setLocationCode(originAndDestSegData.getDestinationLocation().getLocationCode());
		    originAndDestSeg.setDestinationLocation(destLocation);
		    otaCancelRQ.getOriginAndDestinationSegment().add(originAndDestSeg);
		}
	    }
	    otaCancelRQWrapper.setOTACancelRQ(otaCancelRQ);
	    requestBody.getOTACancelRQWrapper().add(otaCancelRQWrapper);
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;
    }

    private TPAExtensionsType populateTPAExtensionsUniqueID(final TPAExtensions tpaExtensionsData) {
	TPAExtensionsType tpaExtensions = null;
	if (tpaExtensionsData != null) {
	    tpaExtensions = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);

	    final Map<Class<?>, Object> keyObjectMap = tpaExtensionsData.getKeyObjectMap();
	    final com.cnk.travelogix.suppliers.air.data.SSRs ssrs = (com.cnk.travelogix.suppliers.air.data.SSRs) keyObjectMap.get(com.cnk.travelogix.suppliers.air.data.SSRs.class);
	    if (ssrs != null && !ssrs.getSsrs().isEmpty()) {
		final SpecialReqDetailsType specialReqDetails = populateSpecialServiceRequestTpa(ssrs);
		final ObjectFactory objectFactory = new ObjectFactory();
		final JAXBElement<SpecialReqDetailsType> createSSR = objectFactory.createSSR(specialReqDetails);
		tpaExtensions.getAny().add(getElementFromJaxbObject(createSSR));
	    }
	}
	return tpaExtensions;
    }

    /**
     * @param ssrs
     * @return specialReqDetails
     */
    private SpecialReqDetailsType populateSpecialServiceRequestTpa(final com.cnk.travelogix.suppliers.air.data.SSRs ssrs) {
	SpecialServiceRequest specialServiceRequest;
	final SpecialReqDetailsType specialReqDetails = new SpecialReqDetailsType();
	final SpecialServiceRequests specialServiceRequests = new SpecialServiceRequests();
	for (SpecialRequests specialRequestdata : ssrs.getSsrs()) {
	    specialServiceRequest = new SpecialServiceRequest();
	    final CompanyName companyNameData = specialRequestdata.getCompanyName();
	    if (companyNameData != null) {
		final CompanyNameType companyName = new CompanyNameType();
		companyName.setCompanyShortName(companyNameData.getCompanyShortName());
		specialServiceRequest.setAirline(companyName);
	    }
	    specialServiceRequest.setNumber(specialRequestdata.getNumber());
	    specialServiceRequest.setSSRCode(specialRequestdata.getSsrCode());
	    specialServiceRequest.setServiceQuantity(specialRequestdata.getServiceQuantity());
	    specialServiceRequest.getFlightRefNumberRPHList().addAll(specialRequestdata.getFlightRefNumberRPHList());
	    specialServiceRequest.getTravelerRefNumberRPHList().addAll(specialRequestdata.getTravelerRefNumberRPHList());
	    specialServiceRequests.getSpecialServiceRequest().add(specialServiceRequest);
	}
	specialReqDetails.setSpecialServiceRequests(specialServiceRequests);
	return specialReqDetails;
    }

    /**
     * @param airInterfaceRS
     * @return AirCancelResponseWrapper
     */
    public AirCancelResponseWrapper fromOTACancelRS(AirInterfaceRS airInterfaceRS) {
	AirCancelResponseWrapper airCancelResponseWrapper = new AirCancelResponseWrapper();
	AirCancelResponse airCancelResponseData;
	List<AirCancelResponse> airCancelResponsesData = new ArrayList<>();
	List<OTACancelRSWrapper> otaCancelRSWrapperList = airInterfaceRS.getResponseBody().getOTACancelRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTACancelRSWrapper otaCancelRSWrapper : otaCancelRSWrapperList) {
		airCancelResponseData = new AirCancelResponse();
		String supplierId = otaCancelRSWrapper.getSupplierID().getValue();
		airCancelResponseData.setSequence(otaCancelRSWrapper.getSequence());

		airCancelResponseData.setSupplierID(populateGetSupplierId(otaCancelRSWrapper.getSupplierID()));
		if (!hasError(otaCancelRSWrapper.getErrorList())) {
		    OTACancelRS oTACancelRS = otaCancelRSWrapper.getOTACancelRS();
		    AirCancelRS airCancelRS = new AirCancelRS();
		    airCancelRS.setTarget(oTACancelRS.getTarget());

		    com.cnk.travelogix.suppliers.air.data.Warning warningData;
		    WarningsType warningsType = oTACancelRS.getWarnings();
		    List<com.cnk.travelogix.suppliers.air.data.Warning> warningsData = new ArrayList<>();
		    for (WarningType otaWarningsType : warningsType.getWarning()) {
			warningData = new com.cnk.travelogix.suppliers.air.data.Warning();
			warningData.setShortText(otaWarningsType.getShortText());
			warningData.setStatus(otaWarningsType.getStatus());
			warningData.setType(otaWarningsType.getType());
			warningsData.add(warningData);
		    }
		    airCancelRS.setWarnings(warningsData);

		    List<UniqueIDType> otaUniqueIds = oTACancelRS.getUniqueID();
		    com.cnk.travelogix.suppliers.air.data.UniqueID uniqueIdData;
		    List<com.cnk.travelogix.suppliers.air.data.UniqueID> uniqueIdDatas = new ArrayList<>();
		    for (UniqueIDType uniqueIDType : otaUniqueIds) {
			uniqueIdData = new com.cnk.travelogix.suppliers.air.data.UniqueID();
			uniqueIdData.setId(uniqueIDType.getID());
			uniqueIdDatas.add(uniqueIdData);
		    }
		    airCancelRS.setUniqueIDs(uniqueIdDatas);

		    CancelInfoRS cancelInfoRS = new CancelInfoRS();
		    List<CancelRule> cancelRulesData = new ArrayList<>();
		    CancelRule cancelRule;
		    CancelInfoRSType cancelInfoRSType = oTACancelRS.getCancelInfoRS();
		    CancelRules cancelRules = cancelInfoRSType.getCancelRules();
		    List<CancelRuleType> cancelRuleTypes = cancelRules.getCancelRule();
		    for (CancelRuleType cancelRuleType : cancelRuleTypes) {
			cancelRule = new CancelRule();
			cancelRule.setCurrencyCode(cancelRuleType.getCurrencyCode());
			cancelRule.setType(cancelRuleType.getType());
			cancelRule.setAmount(cancelRuleType.getAmount());
			cancelRulesData.add(cancelRule);
		    }
		    cancelInfoRS.setCancelRules(cancelRulesData);
		    airCancelRS.setCancelInfoRS(cancelInfoRS);

		    List<com.cnk.travelogix.suppliers.air.data.Segment> segmentsData = new ArrayList<>();
		    List<Segment> otaSegments = oTACancelRS.getSegment();
		    for (Segment otaSegment : otaSegments) {
			com.cnk.travelogix.suppliers.air.data.Segment segmentdata = new com.cnk.travelogix.suppliers.air.data.Segment();
			List<com.cnk.travelogix.suppliers.air.data.UniqueID> uniqueIdsData = new ArrayList<>();
			List<UniqueIDType> uniqueIDs = otaSegment.getUniqueID();

			for (UniqueIDType uniqueIDType : uniqueIDs) {
			    com.cnk.travelogix.suppliers.air.data.UniqueID iniqueIdData = new com.cnk.travelogix.suppliers.air.data.UniqueID();
			    iniqueIdData.setId(uniqueIDType.getID());
			    uniqueIdsData.add(iniqueIdData);
			}
			segmentdata.setUniqueID(uniqueIdDatas);
			segmentdata.setItinSegNbr(otaSegment.getItinSegNbr());
			segmentsData.add(segmentdata);
		    }
		    airCancelRS.setSegment(segmentsData);
		    airCancelRS.setErrors(getErrorsData(oTACancelRS.getErrors(), supplierId));
		    airCancelResponseData.setAirCancelRS(airCancelRS);
		}
		airCancelResponseData.setErrors(getErrorsListData(otaCancelRSWrapper.getErrorList(), supplierId));
		airCancelResponsesData.add(airCancelResponseData);
	    }
	}
	airCancelResponseWrapper.setAirCancelResponses(airCancelResponsesData);
	airCancelResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airCancelResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airCancelResponseWrapper;
    }
}
