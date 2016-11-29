/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.opentravel.ota._2003._05.AirTravelerType;
import org.opentravel.ota._2003._05.CompanyNameType;
import org.opentravel.ota._2003._05.OTACancelRQ;
import org.opentravel.ota._2003._05.OTACancelRQ.OriginAndDestinationSegment;
import org.opentravel.ota._2003._05.OTACancelRQ.OriginAndDestinationSegment.Traveler;
import org.opentravel.ota._2003._05.OTACancelRQ.UniqueID;
import org.opentravel.ota._2003._05.OTACancelRS;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TransactionActionType;
import org.opentravel.ota._2003._05.UniqueIDType;
import org.opentravel.ota._2003._05.WarningType;
import org.opentravel.ota._2003._05.WarningsType;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.cnk.travelogix.suppliers.air.data.AirCancelRS;
import com.cnk.travelogix.suppliers.air.data.AirCancelResponse;
import com.cnk.travelogix.suppliers.air.data.AirCancelResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirCancellRQ;
import com.cnk.travelogix.suppliers.air.data.AirCancellRequest;
import com.cnk.travelogix.suppliers.air.data.AirCancellRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.CompanyName;
import com.cnk.travelogix.suppliers.air.data.CustomerInfo;
import com.cnk.travelogix.suppliers.air.data.PersonName;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.OTACancelRQWrapper;
import com.coxandkings.integ.suppl.air.OTACancelRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * @author I077988
 */
public class AirSplitPNRConverter extends AirBaseConverter {

    public AirInterfaceRQ toOTAAirSplitRQ(final AirCancellRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	final List<AirCancellRequest> airCancellRequestsData = requestWrapper.getAirCancellRequests();
	OTACancelRQWrapper otaCancelRQWrapper;
	for (AirCancellRequest airCancellRequestData : airCancellRequestsData) {
	    otaCancelRQWrapper = new OTACancelRQWrapper();
	    final SupplierIDType supplierIDType = populateSupplierId(airCancellRequestData.getSupplierID());
	    otaCancelRQWrapper.setSupplierID(supplierIDType);
	    otaCancelRQWrapper.setSequence(airCancellRequestData.getSequence());

	    final AirCancellRQ airCancellRQData = airCancellRequestData.getAirCancellRQ();
	    final OTACancelRQ otaCancelRQ = new OTACancelRQ();
	    otaCancelRQ.setVersion(airCancellRQData.getVersion());
	    otaCancelRQ.setTarget(airCancellRQData.getTarget());
	    final String cancelType = airCancellRQData.getCancelType();
	    if (StringUtils.hasText(cancelType)) {
		otaCancelRQ.setCancelType(TransactionActionType.fromValue(cancelType));
	    }
	    final POSType pos = new POSType();
	    final SourceType sourceType = new SourceType();
	    pos.getSource().add(sourceType);
	    otaCancelRQ.setPOS(pos);

	    final List<com.cnk.travelogix.suppliers.air.data.UniqueID> uniqueIDsData = airCancellRQData.getUniqueIDs();
	    UniqueID uniqueId;
	    for (com.cnk.travelogix.suppliers.air.data.UniqueID uniqueIDdata : uniqueIDsData) {
		uniqueId = new UniqueID();
		uniqueId.setID(uniqueIDdata.getId());
		uniqueId.setInstance(uniqueIDdata.getInstance());
		final CompanyName companyNameData = uniqueIDdata.getCompanyName();
		if (companyNameData != null) {
		    final CompanyNameType companyName = new CompanyNameType();
		    companyName.setCodeContext(companyNameData.getCodeContext());
		    companyName.setCompanyShortName(companyNameData.getCompanyShortName());
		    uniqueId.setCompanyName(companyName);
		}
		otaCancelRQ.getUniqueID().add(uniqueId);
	    }

	    final List<com.cnk.travelogix.suppliers.air.data.OriginAndDestinationSegment> originAndDestSegsData = airCancellRQData.getOriginAndDestinationSegment();
	    if (originAndDestSegsData != null && !originAndDestSegsData.isEmpty()) {
		final List<OriginAndDestinationSegment> originAndDestSegs = populateOrignDestinationSegment(originAndDestSegsData);
		otaCancelRQ.getOriginAndDestinationSegment().addAll(originAndDestSegs);
	    }
	    otaCancelRQWrapper.setOTACancelRQ(otaCancelRQ);
	    requestBody.getOTACancelRQWrapper().add(otaCancelRQWrapper);
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;
    }

    /**
     * @param originAndDestSegsData
     * @return originAndDestSegs
     */
    private List<OriginAndDestinationSegment> populateOrignDestinationSegment(final List<com.cnk.travelogix.suppliers.air.data.OriginAndDestinationSegment> originAndDestSegsData) {
	OriginAndDestinationSegment originAndDestSeg;
	final List<OriginAndDestinationSegment> originAndDestSegs = new ArrayList<>();
	for (com.cnk.travelogix.suppliers.air.data.OriginAndDestinationSegment originAndDestSegData : originAndDestSegsData) {
	    originAndDestSeg = new OriginAndDestinationSegment();
	    final List<com.cnk.travelogix.suppliers.air.data.Traveler> travelersData = originAndDestSegData.getTravelers();
	    if (travelersData != null && !travelersData.isEmpty()) {
		Traveler traveler;
		for (com.cnk.travelogix.suppliers.air.data.Traveler travelerData : travelersData) {
		    traveler = new Traveler();
		    traveler.setDocID(travelerData.getDocID());
		    traveler.setDocType(travelerData.getDocType());
		    traveler.setTPAExtensions(populateTPAExtensionsTraveller(travelerData.getTpaExtensions()));
		    originAndDestSeg.getTraveler().add(traveler);
		}
	    }
	    originAndDestSegs.add(originAndDestSeg);
	}
	return originAndDestSegs;
    }

    private TPAExtensionsType populateTPAExtensionsTraveller(final TPAExtensions tpaExtensionsData) {
	TPAExtensionsType tpaExtensions = null;
	if (tpaExtensionsData != null) {
	    tpaExtensions = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
	}
	return tpaExtensions;
    }

    /**
     * @param airInterfaceRS
     * @return airCancelResponseWrapper
     */
    public AirCancelResponseWrapper fromOTAAirSplitRS(AirInterfaceRS airInterfaceRS) {

	final AirCancelResponseWrapper airCancelResponseWrapper = new AirCancelResponseWrapper();
	final List<AirCancelResponse> airCancelResponsesData = new ArrayList<>();
	final List<OTACancelRSWrapper> otaCancelRSWrapperList = airInterfaceRS.getResponseBody().getOTACancelRSWrapper();
	AirCancelResponse airCancelResponseData;
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTACancelRSWrapper otaCancelRSWrapper : otaCancelRSWrapperList) {
		airCancelResponseData = new AirCancelResponse();
		airCancelResponseData.setSequence(otaCancelRSWrapper.getSequence());
		airCancelResponseData.setSupplierID(populateGetSupplierId(otaCancelRSWrapper.getSupplierID()));
		String supplierId = otaCancelRSWrapper.getSupplierID().getValue();
		final OTACancelRS oTACancelRS = otaCancelRSWrapper.getOTACancelRS();
		if (!hasError(otaCancelRSWrapper.getErrorList())) {
		    final AirCancelRS airCancelRSData = new AirCancelRS();
		    airCancelRSData.setTarget(oTACancelRS.getTarget());

		    final WarningsType warningsType = oTACancelRS.getWarnings();
		    com.cnk.travelogix.suppliers.air.data.Warning warningData;
		    List<com.cnk.travelogix.suppliers.air.data.Warning> warningsData = new ArrayList<>();
		    for (WarningType otaWarningsType : warningsType.getWarning()) {
			warningData = new com.cnk.travelogix.suppliers.air.data.Warning();
			warningData.setShortText(otaWarningsType.getShortText());
			warningData.setStatus(otaWarningsType.getStatus());
			warningData.setType(otaWarningsType.getType());
			warningsData.add(warningData);
		    }
		    airCancelRSData.setWarnings(warningsData);

		    final List<UniqueIDType> otaUniqueIds = oTACancelRS.getUniqueID();
		    com.cnk.travelogix.suppliers.air.data.UniqueID uniqueIdData;
		    List<com.cnk.travelogix.suppliers.air.data.UniqueID> uniqueIdsData = new ArrayList<>();
		    for (UniqueIDType uniqueIDType : otaUniqueIds) {
			uniqueIdData = new com.cnk.travelogix.suppliers.air.data.UniqueID();
			uniqueIdData.setId(uniqueIDType.getID());
			final CompanyNameType companyName = uniqueIDType.getCompanyName();
			if (companyName != null) {
			    final CompanyName companyNameData = new CompanyName();
			    companyNameData.setCodeContext(companyName.getCodeContext());
			    companyNameData.setCompanyShortName(companyName.getCompanyShortName());
			    uniqueIdData.setCompanyName(companyNameData);
			}
			uniqueIdData.setTpaExtensions(getUniqueIdTpaExtensionsData(uniqueIDType.getTPAExtensions()));
			uniqueIdsData.add(uniqueIdData);
		    }
		    airCancelRSData.setUniqueIDs(uniqueIdsData);

		    airCancelResponseData.setAirCancelRS(airCancelRSData);
		}
		airCancelResponseData.setErrors(getErrorsData(oTACancelRS.getErrors(), supplierId));
		airCancelResponsesData.add(airCancelResponseData);
	    }
	}
	airCancelResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));
	airCancelResponseWrapper.setAirCancelResponses(airCancelResponsesData);
	airCancelResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	return airCancelResponseWrapper;
    }

    private TPAExtensions getUniqueIdTpaExtensionsData(final TPAExtensionsType tpaExtensions) {
	final TPAExtensions tpaExtensionsData = new TPAExtensions();
	final List<Element> elements = tpaExtensions.getAny();
	for (Element element : elements) {
	    if ("CustomerInfo".equals(element.getLocalName())) {
		final AirTravelerType airTravelerType = getJaxbObjectFromElement(AirTravelerType.class, element);
		final PersonNameType personName = airTravelerType.getPersonName();
		final Map<Class<?>, Object> keyObjectMap = new HashMap<>();
		final CustomerInfo customerInfoData = new CustomerInfo();
		final PersonName personNameData = new PersonName();
		personNameData.setSurname(personName.getSurname());
		personNameData.setGivenName(personName.getGivenName());
		personNameData.setNamePrefix(personName.getNamePrefix());
		customerInfoData.setPersonName(personNameData);
		keyObjectMap.put(CustomerInfo.class, customerInfoData);
		tpaExtensionsData.setKeyObjectMap(keyObjectMap);
	    }
	}
	return tpaExtensionsData;
    }
}
