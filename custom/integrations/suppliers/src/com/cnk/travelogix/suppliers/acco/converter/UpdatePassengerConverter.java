package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.HotelResModifyRequestType;

import com.cnk.travelogix.suppliers.acco.data.HotelResModify;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRs;
import com.cnk.travelogix.suppliers.acco.data.UpdateHotelResModifyRequest;
import com.cnk.travelogix.suppliers.acco.data.UpdateHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.UpdateHotelResModifyResponse;
import com.cnk.travelogix.suppliers.acco.data.UpdateHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Update Passenger Converter
 */
public class UpdatePassengerConverter extends AccoBaseConverter {
    /**
     * @param requestWrapperData
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAHotelResModifyRQ(UpdateHotelResModifyRequestWrapper requestWrapperData) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAHotelResModifyRQWrapper requestWrapper;
	List<UpdateHotelResModifyRequest> passengers = requestWrapperData.getUpdateHotelResModifyRequest();
	for (UpdateHotelResModifyRequest updateHotelResModifyrequest : passengers) {
	    requestWrapper = new OTAHotelResModifyRQWrapper();
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(updateHotelResModifyrequest.getSupplierID().getValue());
	    supplierIDType.setMarketType(updateHotelResModifyrequest.getSupplierID().getMarketType());
	    requestWrapper.setSupplierID(supplierIDType);
	    requestWrapper.setSequence(updateHotelResModifyrequest.getSequence());
	    HotelResModify hotelResModify = updateHotelResModifyrequest.getHotelResModifyRq();
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
    public UpdateHotelResModifyResponseWrapper fromOTAHotelResModifyRS(AccoInterfaceRS accoInterfaceRS) {
	UpdateHotelResModifyResponseWrapper responseWrapper = new UpdateHotelResModifyResponseWrapper();
	UpdateHotelResModifyResponse updatehotelResModifyResponseData;
	List<UpdateHotelResModifyResponse> hotelResModifyResponsesData = new ArrayList<>();
	List<OTAHotelResModifyRSWrapper> otaHoteResRsWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelResModifyRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelResModifyRSWrapper otaHotelResModifyRSWrapper : otaHoteResRsWrapperList) {
		updatehotelResModifyResponseData = new UpdateHotelResModifyResponse();
		updatehotelResModifyResponseData.setSequence(otaHotelResModifyRSWrapper.getSequence());
		updatehotelResModifyResponseData.setSupplierID(populateGetSupplierId(otaHotelResModifyRSWrapper.getSupplierID()));
		SupplierID supplierIdData = new SupplierID();
		SupplierIDType supplierId = otaHotelResModifyRSWrapper.getSupplierID();
		supplierIdData.setValue(supplierId.getValue());
		updatehotelResModifyResponseData.setSupplierID(supplierIdData);
		updatehotelResModifyResponseData.setSequence(otaHotelResModifyRSWrapper.getSequence());
		if (!hasError(otaHotelResModifyRSWrapper.getErrorList())) {
		    org.opentravel.ota._2003._05.HotelResModifyResponseType otaHotelResModifyResponseType = otaHotelResModifyRSWrapper.getOTAHotelResModifyRS();
		    HotelResModifyRs hotelResModifyRs = getHotelModifyData(otaHotelResModifyResponseType);
		    updatehotelResModifyResponseData.setHotelResModifyRs(hotelResModifyRs);
		}
		updatehotelResModifyResponseData.setErrors(getErrorsListData(otaHotelResModifyRSWrapper.getErrorList(), supplierId.getValue()));
		hotelResModifyResponsesData.add(updatehotelResModifyResponseData);
	    }
	}
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	responseWrapper.getUpdateHotelResModifyResponse().addAll(hotelResModifyResponsesData);
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return responseWrapper;
    }
}
