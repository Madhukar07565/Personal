package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.HotelResModifyRequestType;

import com.cnk.travelogix.suppliers.acco.data.ChangePeriodOfStayHotelResModifyRequest;
import com.cnk.travelogix.suppliers.acco.data.ChangePeriodOfStayHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.ChangePeriodOfStayHotelResModifyResponse;
import com.cnk.travelogix.suppliers.acco.data.ChangePeriodOfStayHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelResModify;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRs;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Change Period Of Stay Converter
 *
 */
public class ChangePeriodOfStayConverter extends AccoBaseConverter {

    /**
     * @param requestWrapperData
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAHotelResModifyRQ(ChangePeriodOfStayHotelResModifyRequestWrapper requestWrapperData) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAHotelResModifyRQWrapper requestWrapper;
	List<ChangePeriodOfStayHotelResModifyRequest> passengers = requestWrapperData.getChangePeriodOfStayHotelResModifyRequest();
	for (ChangePeriodOfStayHotelResModifyRequest request : passengers) {
	    requestWrapper = new OTAHotelResModifyRQWrapper();
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(request.getSupplierID().getValue());
	    supplierIDType.setMarketType(request.getSupplierID().getMarketType());
	    requestWrapper.setSupplierID(supplierIDType);
	    requestWrapper.setSequence(request.getSequence());
	    HotelResModify hotelResModify = request.getHotelResModifyRq();
	    HotelResModifyRequestType hotelResModifyRequestType = getHotelModify(hotelResModify);
	    requestWrapper.setOTAHotelResModifyRQ(hotelResModifyRequestType);
	    requestBody.getOTAHotelResModifyRQWrapper().add(requestWrapper);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapperData.getRequestHeader()));
	return accoInterfaceRQ;
    }

    /**
     * @param accoInterfaceRS
     * @return responseWrapper
     */
    public ChangePeriodOfStayHotelResModifyResponseWrapper fromOTAHotelResModifyRS(AccoInterfaceRS accoInterfaceRS) {
	ChangePeriodOfStayHotelResModifyResponseWrapper responseWrapper = new ChangePeriodOfStayHotelResModifyResponseWrapper();
	ChangePeriodOfStayHotelResModifyResponse changePeriodOfStayHotelResModifyResponseData;
	List<ChangePeriodOfStayHotelResModifyResponse> addHotelResModifyResponsesData = new ArrayList<>();
	List<OTAHotelResModifyRSWrapper> otaHoteResRsWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelResModifyRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelResModifyRSWrapper otaHotelResModifyRSWrapper : otaHoteResRsWrapperList) {
		changePeriodOfStayHotelResModifyResponseData = new ChangePeriodOfStayHotelResModifyResponse();
		SupplierIDType supplierId = otaHotelResModifyRSWrapper.getSupplierID();
		changePeriodOfStayHotelResModifyResponseData.setSupplierID(populateGetSupplierId(otaHotelResModifyRSWrapper.getSupplierID()));
		changePeriodOfStayHotelResModifyResponseData.setSequence(otaHotelResModifyRSWrapper.getSequence());
		if (!hasError(otaHotelResModifyRSWrapper.getErrorList())) {
		    org.opentravel.ota._2003._05.HotelResModifyResponseType otaHotelResModifyResponseType = otaHotelResModifyRSWrapper.getOTAHotelResModifyRS();
		    HotelResModifyRs hotelResModifyRs = getHotelModifyData(otaHotelResModifyResponseType);
		    changePeriodOfStayHotelResModifyResponseData.setHotelResModifyRs(hotelResModifyRs);
		}
		changePeriodOfStayHotelResModifyResponseData.setErrors(getErrorsListData(otaHotelResModifyRSWrapper.getErrorList(), supplierId.getValue()));
		addHotelResModifyResponsesData.add(changePeriodOfStayHotelResModifyResponseData);
	    }
	}
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	responseWrapper.getChangePeriodOfStayHotelResModifyResponse().addAll(addHotelResModifyResponsesData);
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return responseWrapper;
    }

}
