package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.HotelResModifyRequestType;

import com.cnk.travelogix.suppliers.acco.data.AddRoomHotelResModifyRequest;
import com.cnk.travelogix.suppliers.acco.data.AddRoomHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.AddRoomHotelResModifyResponse;
import com.cnk.travelogix.suppliers.acco.data.AddRoomHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelResModify;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRs;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Add Room Converter
 */
public class AddRoomConverter extends AccoBaseConverter {

    /**
     * @param requestWrapperData
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAHotelResModifyRQ(AddRoomHotelResModifyRequestWrapper requestWrapperData) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAHotelResModifyRQWrapper requestWrapper;
	List<AddRoomHotelResModifyRequest> passengers = requestWrapperData.getAddRoomHotelResModifyRequest();
	for (AddRoomHotelResModifyRequest request : passengers) {
	    requestWrapper = new OTAHotelResModifyRQWrapper();
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(request.getSupplierID().getValue());
	    supplierIDType.setMarketType(request.getSupplierID().getMarketType());
	    requestWrapper.setSupplierID(supplierIDType);
	    requestWrapper.setSequence(request.getSequence());
	    HotelResModify hotelResModify = request.getHotelResModifyRq();
	    if (hotelResModify != null) {
		HotelResModifyRequestType hotelResModifyRequestType = getHotelModify(hotelResModify);
		requestWrapper.setOTAHotelResModifyRQ(hotelResModifyRequestType);
	    }
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
    public AddRoomHotelResModifyResponseWrapper fromOTAHotelResModifyRS(AccoInterfaceRS accoInterfaceRS) {
	AddRoomHotelResModifyResponseWrapper responseWrapper = new AddRoomHotelResModifyResponseWrapper();
	AddRoomHotelResModifyResponse addHotelResModifyResponseData;
	List<AddRoomHotelResModifyResponse> addHotelResModifyResponsesData = new ArrayList<>();
	List<OTAHotelResModifyRSWrapper> otaHoteResRsWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelResModifyRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelResModifyRSWrapper otaHotelResModifyRSWrapper : otaHoteResRsWrapperList) {
		addHotelResModifyResponseData = new AddRoomHotelResModifyResponse();
		SupplierIDType supplierId = otaHotelResModifyRSWrapper.getSupplierID();
		addHotelResModifyResponseData.setSupplierID(populateGetSupplierId(otaHotelResModifyRSWrapper.getSupplierID()));
		addHotelResModifyResponseData.setSequence(otaHotelResModifyRSWrapper.getSequence());

		if (!hasError(otaHotelResModifyRSWrapper.getErrorList())) {
		    org.opentravel.ota._2003._05.HotelResModifyResponseType otaHotelResModifyResponseType = otaHotelResModifyRSWrapper.getOTAHotelResModifyRS();
		    HotelResModifyRs hotelResModifyRs = getHotelModifyData(otaHotelResModifyResponseType);
		    addHotelResModifyResponseData.setHotelResModifyRs(hotelResModifyRs);
		}
		addHotelResModifyResponseData.setErrors(getErrorsListData(otaHotelResModifyRSWrapper.getErrorList(), supplierId.getValue()));
		addHotelResModifyResponsesData.add(addHotelResModifyResponseData);
	    }
	}
	responseWrapper.setAddRoomHotelResModifyResponse(addHotelResModifyResponsesData);
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));

	return responseWrapper;
    }

}
