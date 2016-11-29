package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.MessageQueueRQType;
import org.opentravel.ota._2003._05.OTAMessageQueueRS;
import org.opentravel.ota._2003._05.OTAMessageQueueRS.MessageItems;
import org.opentravel.ota._2003._05.OTAMessageQueueRS.MessageItems.MessageItem;
import org.opentravel.ota._2003._05.OTAMessageQueueRS.MessageItems.MessageItem.Messages;

import com.cnk.travelogix.suppliers.air.data.MessageQueueRQ;
import com.cnk.travelogix.suppliers.air.data.MessageQueueRS;
import com.cnk.travelogix.suppliers.air.data.MessageQueueRequest;
import com.cnk.travelogix.suppliers.air.data.MessageQueueRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.MessageQueueResponse;
import com.cnk.travelogix.suppliers.air.data.MessageQueueResponseWrapper;
import com.coxandkings.integ.suppl.air.OTAMessageQueueRQWrapper;
import com.coxandkings.integ.suppl.air.OTAMessageQueueRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Get PNR From Queue
 */
public class GetPNRFromQueueConverter extends AirBaseConverter {

    /**
     * @param requestWrapper
     * @return airInterfaceRQ
     */
    public AirInterfaceRQ toOTAMessageQueueRQ(final MessageQueueRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAMessageQueueRQWrapper otaMessageQueueRQWrapper;
	final List<MessageQueueRequest> airBookRequestsData = requestWrapper.getMessageQueueRequest();
	for (MessageQueueRequest messageQueueRequest : airBookRequestsData) {
	    otaMessageQueueRQWrapper = new OTAMessageQueueRQWrapper();
	    otaMessageQueueRQWrapper.setSequence(messageQueueRequest.getSequence());
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(messageQueueRequest.getSupplierID().getValue());
	    supplierIDType.setMarketType(messageQueueRequest.getSupplierID().getMarketType());
	    otaMessageQueueRQWrapper.setSupplierID(supplierIDType);

	    MessageQueueRQ messageQueueRQData = messageQueueRequest.getMessageQueueRQ();
	    MessageQueueRQType messageQueueRQType = new MessageQueueRQType();
	    messageQueueRQType.setCategoryID(messageQueueRQData.getCategoryID());
	    messageQueueRQType.setTarget(messageQueueRQData.getTarget());
	    messageQueueRQType.setUniqueID(messageQueueRQData.getUniqueID());
	    otaMessageQueueRQWrapper.setOTAMessageQueueRQ(messageQueueRQType);
	    requestBody.getOTAMessageQueueRQWrapper().add(otaMessageQueueRQWrapper);
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;
    }

    /**
     * 
     * @param airInterfaceRS
     * @return messageQueueResponseWrapper
     */
    public MessageQueueResponseWrapper fromOTAMessageQueueRS(AirInterfaceRS airInterfaceRS) {
	final MessageQueueResponseWrapper messageQueueResponseWrapper = new MessageQueueResponseWrapper();
	MessageQueueResponse messageQueueResponseData = null;
	final List<OTAMessageQueueRSWrapper> otaMessageQueueRSWrapperList = airInterfaceRS.getResponseBody().getOTAMessageQueueRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAMessageQueueRSWrapper otaMessageQueueRSWrapper : otaMessageQueueRSWrapperList) {
		messageQueueResponseData = new MessageQueueResponse();
		String supplierId = otaMessageQueueRSWrapper.getSupplierID().getValue();
		messageQueueResponseData.setSupplierID(populateGetSupplierId(otaMessageQueueRSWrapper.getSupplierID()));
		messageQueueResponseData.setSequence(otaMessageQueueRSWrapper.getSequence());
		List<MessageQueueRS> messageQueueRSs = new ArrayList<>();
		if (!hasError(otaMessageQueueRSWrapper.getErrorList())) {
		    OTAMessageQueueRS messageQueueRS = otaMessageQueueRSWrapper.getOTAMessageQueueRS();

		    MessageQueueRS messageQueueRSData = new MessageQueueRS();
		    messageQueueRSData.setSuccess(messageQueueRS.isSuccess());
		    messageQueueRSData.setTarget(messageQueueRS.getTarget());
		    messageQueueRSData.setErrors(getErrorsData(messageQueueRS.getErrors(),supplierId));

		    MessageItems messageItems = messageQueueRS.getMessageItems();
		    List<MessageItem> otaMessageItems = messageItems.getMessageItem();
		    List<com.cnk.travelogix.suppliers.air.data.MessageItem> messageItemsListData = new ArrayList<>();
		    for (MessageItem messageItem : otaMessageItems) {
			com.cnk.travelogix.suppliers.air.data.MessageItem messageItemData = new com.cnk.travelogix.suppliers.air.data.MessageItem();
			messageItemData.setRph(messageItem.getRPH());
			messageItemData.setUniqueID(messageItem.getUniqueID());
			List<Messages> messages = messageItem.getMessages();
			List<com.cnk.travelogix.suppliers.air.data.Messages> messagesList = new ArrayList<>();
			for (Messages otaMessages : messages) {
			    com.cnk.travelogix.suppliers.air.data.Messages messagesData = new com.cnk.travelogix.suppliers.air.data.Messages();
			    messagesData.setComment(otaMessages.getComment());
			    messagesList.add(messagesData);
			}
			messageItemData.setMessages(messagesList);
			messageItemsListData.add(messageItemData);
		    }

		    messageQueueRSData.setMessageItems(messageItemsListData);
		    messageQueueRSs.add(messageQueueRSData);
		}
		messageQueueResponseData.setErrors(getErrorsListData(otaMessageQueueRSWrapper.getErrorList(), supplierId));
		messageQueueResponseData.setMessageQueueRS(messageQueueRSs);
	    }
	}
	messageQueueResponseWrapper.setMessageQueueResponse(messageQueueResponseData);
	messageQueueResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	messageQueueResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));
	return messageQueueResponseWrapper;
    }
}
