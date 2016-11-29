package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.HotelResModifyRequestType;

import com.cnk.travelogix.suppliers.acco.data.HotelResModify;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRs;
import com.cnk.travelogix.suppliers.acco.data.UpdateRoomHotelResModifyRequest;
import com.cnk.travelogix.suppliers.acco.data.UpdateRoomHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.UpdateRoomHotelResModifyResponse;
import com.cnk.travelogix.suppliers.acco.data.UpdateRoomHotelResModifyResponseWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Update Room Converter
 */
public class UpdateRoomConverter extends AccoBaseConverter {

    /**
     * @param requestWrapperData
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAHotelResModifyRQ(UpdateRoomHotelResModifyRequestWrapper requestWrapperData) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAHotelResModifyRQWrapper requestWrapper;
	List<UpdateRoomHotelResModifyRequest> passengers = requestWrapperData.getUpdateRoomHotelResModifyRequest();
	for (UpdateRoomHotelResModifyRequest updateRoomHotelResModifyRequest : passengers) {
	    requestWrapper = new OTAHotelResModifyRQWrapper();
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(updateRoomHotelResModifyRequest.getSupplierID().getValue());
	    supplierIDType.setMarketType(updateRoomHotelResModifyRequest.getSupplierID().getMarketType());
	    requestWrapper.setSupplierID(supplierIDType);
	    requestWrapper.setSequence(updateRoomHotelResModifyRequest.getSequence());
	    HotelResModify hotelResModify = updateRoomHotelResModifyRequest.getHotelResModifyRq();
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
    public UpdateRoomHotelResModifyResponseWrapper fromOTAHotelResModifyRS(AccoInterfaceRS accoInterfaceRS) {
	UpdateRoomHotelResModifyResponseWrapper responseWrapper = new UpdateRoomHotelResModifyResponseWrapper();
	UpdateRoomHotelResModifyResponse addHotelResModifyResponseData;
	List<UpdateRoomHotelResModifyResponse> addHotelResModifyResponsesData = new ArrayList<>();
	List<OTAHotelResModifyRSWrapper> otaHoteResRsWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelResModifyRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelResModifyRSWrapper otaHotelResModifyRSWrapper : otaHoteResRsWrapperList) {
		addHotelResModifyResponseData = new UpdateRoomHotelResModifyResponse();
		SupplierIDType supplierId = otaHotelResModifyRSWrapper.getSupplierID();
		addHotelResModifyResponseData.setSupplierID(populateGetSupplierId(otaHotelResModifyRSWrapper.getSupplierID()));
		addHotelResModifyResponseData.setSequence(otaHotelResModifyRSWrapper.getSequence());
		if (!hasError(otaHotelResModifyRSWrapper.getErrorList())) {
		    org.opentravel.ota._2003._05.HotelResModifyResponseType otaHotelResModifyResponseType = otaHotelResModifyRSWrapper.getOTAHotelResModifyRS();
		    HotelResModifyRs hotelResModifyRs = getHotelModifyData(otaHotelResModifyResponseType, supplierId.getValue());
		    addHotelResModifyResponseData.setHotelResModifyRs(hotelResModifyRs);
		}
		addHotelResModifyResponseData.setErrors(getErrorsListData(otaHotelResModifyRSWrapper.getErrorList(), supplierId.getValue()));
		addHotelResModifyResponsesData.add(addHotelResModifyResponseData);
	    }
	}
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	responseWrapper.getUpdateRoomHotelResModifyResponse().addAll(addHotelResModifyResponsesData);
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return responseWrapper;
    }

}
