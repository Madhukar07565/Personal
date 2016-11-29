package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.FareInfoType.FareReference;
import org.opentravel.ota._2003._05.FareRuleResponseInfoType.FareRuleInfo;
import org.opentravel.ota._2003._05.OTAAirRulesRQ;
import org.opentravel.ota._2003._05.OTAAirRulesRS;
import org.opentravel.ota._2003._05.OTAAirRulesRS.FareRuleResponseInfo;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.SourceType;

import com.cnk.travelogix.suppliers.air.data.AirRuleResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirRulesRQ;
import com.cnk.travelogix.suppliers.air.data.AirRulesRS;
import com.cnk.travelogix.suppliers.air.data.AirRulesRequest;
import com.cnk.travelogix.suppliers.air.data.AirRulesRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirRulesResponse;
import com.cnk.travelogix.suppliers.air.data.ArrivalAirport;
import com.cnk.travelogix.suppliers.air.data.DepartureAirport;
import com.cnk.travelogix.suppliers.air.data.FareInfo;
import com.cnk.travelogix.suppliers.air.data.FareInfoType;
import com.cnk.travelogix.suppliers.air.data.RuleReqInfo;
import com.coxandkings.integ.suppl.air.OTAAirRulesRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirRulesRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

public class AirRulesConverter extends AirBaseConverter {

    /**
     * @param requestWrapper
     * @return AirInterfaceRQ
     */
    public AirInterfaceRQ toOTAAirRulesRQ(final AirRulesRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAAirRulesRQWrapper otaAirRulesRQWrapper;
	final List<AirRulesRequest> airAirRulesRequestsData = requestWrapper.getAirRulesRequest();
	for (AirRulesRequest airRulesRequestData : airAirRulesRequestsData) {
	    otaAirRulesRQWrapper = new OTAAirRulesRQWrapper();

	    otaAirRulesRQWrapper.setSequence(airRulesRequestData.getSequence());

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(airRulesRequestData.getSupplierID().getValue());
	    supplierIDType.setMarketType(airRulesRequestData.getSupplierID().getMarketType());
	    otaAirRulesRQWrapper.setSupplierID(supplierIDType);

	    OTAAirRulesRQ otaAirRulesRQ = new OTAAirRulesRQ();
	    final AirRulesRQ airRulesQData = airRulesRequestData.getAirRulesRQ();

	    otaAirRulesRQ.setEchoToken(airRulesQData.getEchoToken());
	    otaAirRulesRQ.setPrimaryLangID(airRulesQData.getPrimaryLangID());
	    otaAirRulesRQ.setTransactionIdentifier(airRulesQData.getTransactionIdentifier());
	    otaAirRulesRQ.setTransactionStatusCode(airRulesQData.getTransactionStatusCode());
	    otaAirRulesRQ.setRetransmissionIndicator(airRulesQData.getRetransmissionIndicator());
	    otaAirRulesRQ.setVersion(airRulesQData.getVersion());

	    final POSType pos = new POSType();
	    SourceType sourceType;
	    final com.cnk.travelogix.suppliers.common.data.POSType posData = airRulesQData.getPos();
	    final List<com.cnk.travelogix.suppliers.common.data.SourceType> sourcesData = posData.getSource();
	    for (com.cnk.travelogix.suppliers.common.data.SourceType sourceData : sourcesData) {
		sourceType = new SourceType();
		sourceType.setISOCurrency(sourceData.getIsoCurrency());
		pos.getSource().add(sourceType);
	    }
	    otaAirRulesRQ.setPOS(pos);

	    RuleReqInfo rulesReqInfoData = airRulesQData.getRuleReqInfo();
	    org.opentravel.ota._2003._05.OTAAirRulesRQ.RuleReqInfo ruleReqInfo = new org.opentravel.ota._2003._05.OTAAirRulesRQ.RuleReqInfo();
	    ruleReqInfo.setLanguageRequested(rulesReqInfoData.getLanguageRequested());
	    otaAirRulesRQ.setRuleReqInfo(ruleReqInfo);
	    otaAirRulesRQWrapper.setOTAAirRulesRQ(otaAirRulesRQ);
	    requestBody.getOTAAirRulesRQWrapper().add(otaAirRulesRQWrapper);

	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;

    }

    /**
     * @param airInterfaceRS
     * @return AirPriceResponseWrapper
     */
    public AirRuleResponseWrapper fromOTAAirRulesRS(final AirInterfaceRS airInterfaceRS) {
	final AirRuleResponseWrapper airRulesResponseWrapper = new AirRuleResponseWrapper();
	AirRulesResponse airRulesResponseData;
	final List<AirRulesResponse> airRulesResponsesData = new ArrayList<>();
	final List<OTAAirRulesRSWrapper> otaAirRulesRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirRulesRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirRulesRSWrapper otaAirRulesRSWrapper : otaAirRulesRSWrapperList) {
		airRulesResponseData = new AirRulesResponse();
		airRulesResponseData.setSequence(otaAirRulesRSWrapper.getSequence());
		String supplierId = otaAirRulesRSWrapper.getSupplierID().getValue();
		if (!hasError(otaAirRulesRSWrapper.getErrorList())) {
		    final AirRulesRS airRulesRSData = new AirRulesRS();
		    final OTAAirRulesRS otaAirRulesRS = otaAirRulesRSWrapper.getOTAAirRulesRS();
		    airRulesRSData.setTarget(otaAirRulesRS.getTarget());
		    airRulesRSData.setVersion(otaAirRulesRS.getVersion());

		    List<FareRuleResponseInfo> fareRuleResponseInfoList = otaAirRulesRS.getFareRuleResponseInfo();
		    List<com.cnk.travelogix.suppliers.air.data.FareRuleResponseInfo> fareRulesResponseInfoListData = new ArrayList<>();
		    for (FareRuleResponseInfo fareRuleResponseInfo : fareRuleResponseInfoList) {
			com.cnk.travelogix.suppliers.air.data.FareRuleResponseInfo fareRuleResponseInfoData = new com.cnk.travelogix.suppliers.air.data.FareRuleResponseInfo();
			FareInfo fareInfoData = new FareInfo();
			FareRuleInfo fareInfo = fareRuleResponseInfo.getFareRuleInfo();

			List<FareInfoType> fareInfoTypeListData = new ArrayList<>();
			FareInfoType fareInfoTypeData = new FareInfoType();
			ArrivalAirport arrivalAirport = new ArrivalAirport();
			arrivalAirport.setLocationCode(fareInfo.getArrivalAirport().getLocationCode());
			fareInfoTypeData.setArrivalAirport(arrivalAirport);

			DepartureAirport departureAirport = new DepartureAirport();
			departureAirport.setLocationCode(fareInfo.getDepartureAirport().getLocationCode());
			fareInfoTypeData.setDepartureAirport(departureAirport);
			fareInfoTypeListData.add(fareInfoTypeData);
			fareInfoData.setFareInfoTypes(fareInfoTypeListData);

			//flightSegmentData.setArrivalAirport(getArrivalAirportData(flightSegment.getArrivalAirport()));
			List<FareReference> fareReferenceList = fareInfo.getFareReference();
			List<com.cnk.travelogix.suppliers.air.data.FareReference> fareReferenceDataList = new ArrayList<>();

			for (FareReference fareReference : fareReferenceList) {
			    com.cnk.travelogix.suppliers.air.data.FareReference fareReferenceData = new com.cnk.travelogix.suppliers.air.data.FareReference();
			    fareReferenceData.setResBookDesigCode(fareReference.getResBookDesigCode());
			    fareReferenceDataList.add(fareReferenceData);
			}
			fareInfoData.setFareReferences(fareReferenceDataList);
			fareRulesResponseInfoListData.add(fareRuleResponseInfoData);
			fareInfoData.setFareInfoTypes(fareInfoTypeListData);
		    }
		    airRulesRSData.setFareRuleResponseInfo(fareRulesResponseInfoListData);
		    airRulesRSData.setErrors(getErrorsData(otaAirRulesRS.getErrors(), supplierId));
		    airRulesResponseData.setAirRulesRS(airRulesRSData);
		}
		airRulesResponseData.setErrors(getErrorsListData(otaAirRulesRSWrapper.getErrorList(), supplierId));
		airRulesResponsesData.add(airRulesResponseData);
	    }
	}
	airRulesResponseWrapper.setAirRulesResponses(airRulesResponsesData);
	airRulesResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airRulesResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airRulesResponseWrapper;
    }
}
