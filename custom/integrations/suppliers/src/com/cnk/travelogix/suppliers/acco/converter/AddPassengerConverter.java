package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.HotelResModifyRequestType;

import com.cnk.travelogix.suppliers.acco.data.HotelResModify;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRequest;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyResponse;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRs;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.ErrorListType;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Add passenger converter
 */
public class AddPassengerConverter extends AccoBaseConverter {

    /**
     * @param requestWrapperData
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAHotelResModifyRQ(HotelResModifyRequestWrapper requestWrapperData) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAHotelResModifyRQWrapper requestWrapper;
	List<HotelResModifyRequest> passengers = requestWrapperData.getHotelResModifyRequest();
	for (HotelResModifyRequest hotelResModifyRequest : passengers) {
	    requestWrapper = new OTAHotelResModifyRQWrapper();
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(hotelResModifyRequest.getSupplierID().getValue());
	    supplierIDType.setMarketType(hotelResModifyRequest.getSupplierID().getMarketType());
	    requestWrapper.setSupplierID(supplierIDType);
	    requestWrapper.setSequence(hotelResModifyRequest.getSequence());
	    HotelResModify hotelResModify = hotelResModifyRequest.getHotelResModifyRq();
	    HotelResModifyRequestType hotelResModifyRequestType = getHotelModify(hotelResModify);
	    requestWrapper.setOTAHotelResModifyRQ(hotelResModifyRequestType);
	    requestBody.getOTAHotelResModifyRQWrapper().add(requestWrapper);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapperData.getRequestHeader()));
	return accoInterfaceRQ;
    }

    /**
     * This method is to get the response form Add passenger request
     * 
     * @param accoInterfaceRS
     * @return responseWrapper
     */
    public HotelResModifyResponseWrapper fromOTAHotelResModifyRS(AccoInterfaceRS accoInterfaceRS) {
	HotelResModifyResponseWrapper responseWrapper = new HotelResModifyResponseWrapper();
	HotelResModifyResponse hotelResModifyResponseData;
	List<HotelResModifyResponse> hotelResModifyResponsesData = new ArrayList<>();
	List<OTAHotelResModifyRSWrapper> otaHoteResRsWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelResModifyRSWrapper();
	ErrorListType responseBodyErrors = accoInterfaceRS.getResponseBody().getErrorList();
	if (!hasError(responseBodyErrors)) {
	    for (OTAHotelResModifyRSWrapper otaHotelResModifyRSWrapper : otaHoteResRsWrapperList) {
		hotelResModifyResponseData = new HotelResModifyResponse();
		SupplierIDType supplierId = otaHotelResModifyRSWrapper.getSupplierID();
		hotelResModifyResponseData.setSequence(otaHotelResModifyRSWrapper.getSequence());
		if (!hasError(otaHotelResModifyRSWrapper.getErrorList())) {
		    org.opentravel.ota._2003._05.HotelResModifyResponseType otaHotelResModifyResponseType = otaHotelResModifyRSWrapper.getOTAHotelResModifyRS();
		    HotelResModifyRs hotelResModifyRs = getHotelModifyData(otaHotelResModifyResponseType);
		    hotelResModifyResponseData.setHotelResModifyRs(hotelResModifyRs);
		}
		hotelResModifyResponseData.setErrors(getErrorsListData(otaHotelResModifyRSWrapper.getErrorList(), supplierId.getValue()));
		hotelResModifyResponsesData.add(hotelResModifyResponseData);
	    }
	}
	responseWrapper.getHotelResModifyResponse().addAll(hotelResModifyResponsesData);
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));

	return responseWrapper;
    }
}
