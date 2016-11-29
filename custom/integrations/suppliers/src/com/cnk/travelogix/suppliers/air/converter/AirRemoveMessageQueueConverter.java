package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.OTARemoveMessageQueueRQ;
import org.opentravel.ota._2003._05.OTARemoveMessageQueueRQ.Items;
import org.opentravel.ota._2003._05.OTARemoveMessageQueueRQ.Items.Item;
import org.opentravel.ota._2003._05.OTARemoveMessageQueueRS;
import org.opentravel.ota._2003._05.OTARemoveMessageQueueRS.Errors.Error;

import com.cnk.travelogix.suppliers.air.data.AirRemoveMessageQueueRQ;
import com.cnk.travelogix.suppliers.air.data.AirRemoveMessageQueueRS;
import com.cnk.travelogix.suppliers.air.data.AirRemoveMessageQueueRequest;
import com.cnk.travelogix.suppliers.air.data.AirRemoveMessageQueueRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirRemoveMessageQueueResponse;
import com.cnk.travelogix.suppliers.air.data.AirRemoveMessageQueueResponseWrapper;
import com.cnk.travelogix.suppliers.common.data.ErrorType;
import com.coxandkings.integ.suppl.air.OTARemoveMessageQueueRQWrapper;
import com.coxandkings.integ.suppl.air.OTARemoveMessageQueueRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

//Request Converter
public class AirRemoveMessageQueueConverter extends AirBaseConverter {
    public AirInterfaceRQ toOTARemoveMessageQueueRQ(final AirRemoveMessageQueueRequestWrapper request) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTARemoveMessageQueueRQ otaRemoveMessageQueueRQ = new OTARemoveMessageQueueRQ();
	OTARemoveMessageQueueRQWrapper otaRemoveMessageQueueRQWrapper = new OTARemoveMessageQueueRQWrapper();

	AirRemoveMessageQueueRequest airRemoveMessageQueueRequest = request.getAirRemoveMessageQueueRequest();
	OTARemoveMessageQueueRQ messageQueueRQ = new OTARemoveMessageQueueRQ();
	AirRemoveMessageQueueRQ airRemoveMessageQueueRQ = airRemoveMessageQueueRequest.getAirRemoveMessageQueueRQ();
	messageQueueRQ.setTarget(airRemoveMessageQueueRQ.getTarget());

	Items items = new Items();
	List<com.cnk.travelogix.suppliers.air.data.Items> itemsDataList = airRemoveMessageQueueRQ.getItems();
	for (com.cnk.travelogix.suppliers.air.data.Items itemsData : itemsDataList) {

	    Item item = new Item();
	    item.setUniqueID(itemsData.getUniqueID());
	    item.setCategoryID(itemsData.getCategoryID());
	    items.getItem().add(item);
	}
	messageQueueRQ.setItems(items);

	otaRemoveMessageQueueRQWrapper.setOTARemoveMessageQueueRQ(otaRemoveMessageQueueRQ);
	requestBody.getOTARemoveMessageQueueRQWrapper().add(otaRemoveMessageQueueRQWrapper);
	airInterfaceRQ.setRequestBody(requestBody);
	return airInterfaceRQ;
    }

    /**
     * @param airInterfaceRS
     * @return airRemoveMessageQueueResponseWrapper
     */
    public AirRemoveMessageQueueResponseWrapper fromOTARemoveMessageQueueRS(AirInterfaceRS airInterfaceRS) {
	final AirRemoveMessageQueueResponseWrapper airRemoveMessageQueueResponseWrapper = new AirRemoveMessageQueueResponseWrapper();
	AirRemoveMessageQueueResponse airRemoveMessageQueueResponseData;
	final List<AirRemoveMessageQueueResponse> airRemoveMessageQueueResponsesData = new ArrayList<>();
	final List<OTARemoveMessageQueueRSWrapper> otaRemoveMessageQueueRSWrapper = airInterfaceRS.getResponseBody().getOTARemoveMessageQueueRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTARemoveMessageQueueRSWrapper otaAirRePriceRSWrapper : otaRemoveMessageQueueRSWrapper) {
		airRemoveMessageQueueResponseData = new AirRemoveMessageQueueResponse();
		airRemoveMessageQueueResponseData.setSequence(otaAirRePriceRSWrapper.getSequence());
		String supplierId = otaAirRePriceRSWrapper.getSupplierID().getValue();
		airRemoveMessageQueueResponseData.setSupplierID(populateGetSupplierId(otaAirRePriceRSWrapper.getSupplierID()));
		AirRemoveMessageQueueRS airRemoveMessageQueueRS = new AirRemoveMessageQueueRS();
		if (!hasError(otaAirRePriceRSWrapper.getErrorList())) {
		    OTARemoveMessageQueueRS otaRemoveMessageQueueRS = otaAirRePriceRSWrapper.getOTARemoveMessageQueueRS();
		    airRemoveMessageQueueRS.setSuccess(otaRemoveMessageQueueRS.isSuccess());
		    airRemoveMessageQueueRS.setTarget(otaRemoveMessageQueueRS.getTarget());

		    List<ErrorType> errorsDataList = new ArrayList<>();
		    org.opentravel.ota._2003._05.OTARemoveMessageQueueRS.Errors errorsList = otaRemoveMessageQueueRS.getErrors();
		    List<Error> errors = errorsList.getError();
		    for (Error error : errors) {
			ErrorType errorsData = new ErrorType();
			errorsData.setCode(error.getCode());
			errorsData.setMessage(error.getMessage());
			errorsDataList.add(errorsData);
		    }
		    airRemoveMessageQueueRS.setErrors(errorsDataList);
		}
		airRemoveMessageQueueResponseData.setAirRemoveMessageQueueRS(airRemoveMessageQueueRS);
		airRemoveMessageQueueResponseData.setErrors(getErrorsListData(otaAirRePriceRSWrapper.getErrorList(), supplierId));
	    }
	}
	airRemoveMessageQueueResponseWrapper.setAirRemoveMessageQueueRSWrapper(airRemoveMessageQueueResponsesData);
	airRemoveMessageQueueResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airRemoveMessageQueueResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));
	return airRemoveMessageQueueResponseWrapper;
    }
}
