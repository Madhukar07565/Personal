package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.HotelResModifyRequestType;

import com.cnk.travelogix.suppliers.acco.data.CancelHotelResModifyRequest;
import com.cnk.travelogix.suppliers.acco.data.CancelHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.CancelHotelResModifyResponse;
import com.cnk.travelogix.suppliers.acco.data.CancelHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelResModify;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRs;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Cancel Passenger Converter
 */
public class CancelPassengerConverter extends AccoBaseConverter {

    /**
     * @param requestWrapperData
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAHotelResModifyRQ(CancelHotelResModifyRequestWrapper requestWrapperData) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAHotelResModifyRQWrapper requestWrapper;
	List<CancelHotelResModifyRequest> passengers = requestWrapperData.getCancelHotelResModifyRequest();
	for (CancelHotelResModifyRequest cancelHotelResModifyRequest : passengers) {
	    requestWrapper = new OTAHotelResModifyRQWrapper();
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(cancelHotelResModifyRequest.getSupplierID().getValue());
	    supplierIDType.setMarketType(cancelHotelResModifyRequest.getSupplierID().getMarketType());
	    requestWrapper.setSupplierID(supplierIDType);
	    requestWrapper.setSequence(cancelHotelResModifyRequest.getSequence());
	    HotelResModify hotelResModify = cancelHotelResModifyRequest.getHotelResModifyRq();
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
    public CancelHotelResModifyResponseWrapper fromOTAHotelResModifyRS(AccoInterfaceRS accoInterfaceRS) {
	CancelHotelResModifyResponseWrapper responseWrapper = new CancelHotelResModifyResponseWrapper();
	CancelHotelResModifyResponse cancelHotelResModifyResponseData;
	List<CancelHotelResModifyResponse> cancelHotelResModifyResponsesData = new ArrayList<>();
	List<OTAHotelResModifyRSWrapper> otaHoteResRsWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelResModifyRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelResModifyRSWrapper otaHotelResModifyRSWrapper : otaHoteResRsWrapperList) {
		cancelHotelResModifyResponseData = new CancelHotelResModifyResponse();
		SupplierIDType supplierId = otaHotelResModifyRSWrapper.getSupplierID();
		cancelHotelResModifyResponseData.setSupplierID(populateGetSupplierId(otaHotelResModifyRSWrapper.getSupplierID()));
		cancelHotelResModifyResponseData.setSequence(otaHotelResModifyRSWrapper.getSequence());
		if (!hasError(otaHotelResModifyRSWrapper.getErrorList())) {
		    org.opentravel.ota._2003._05.HotelResModifyResponseType otaHotelResModifyResponseType = otaHotelResModifyRSWrapper.getOTAHotelResModifyRS();
		    HotelResModifyRs hotelResModifyRs = getHotelModifyData(otaHotelResModifyResponseType);
		    cancelHotelResModifyResponseData.setHotelResModifyRs(hotelResModifyRs);
		}
		cancelHotelResModifyResponseData.setErrors(getErrorsListData(otaHotelResModifyRSWrapper.getErrorList(), supplierId.getValue()));
		cancelHotelResModifyResponsesData.add(cancelHotelResModifyResponseData);
	    }
	}
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	responseWrapper.getCancelHotelResModifyResponse().addAll(cancelHotelResModifyResponsesData);
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return responseWrapper;
    }

}
