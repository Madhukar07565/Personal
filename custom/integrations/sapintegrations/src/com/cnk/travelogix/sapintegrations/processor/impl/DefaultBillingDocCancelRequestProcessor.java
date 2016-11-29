package com.cnk.travelogix.sapintegrations.processor.impl;

import javax.xml.bind.JAXBElement;

import com.cnk.travelogix.custom.zifwsb.inv.cancel.ObjectFactory;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.ZIffmBillingdocCancel;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.ZIffmBillingdocCancelResponse;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.ZifstStatusDoc;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.BillingDocCancelRequestProcessor;


public class DefaultBillingDocCancelRequestProcessor extends
		AbstractRequestProcessor<ZIffmBillingdocCancel, ZIffmBillingdocCancelResponse>implements BillingDocCancelRequestProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ZIffmBillingdocCancel request)
	{
		final RequestMessage requestMessage = new RequestMessage<ZIffmBillingdocCancel>();
		requestMessage.setRequestObject(getObjectFactory().createZIffmBillingdocCancel(request));
		requestMessage.setServiceInterface(BillingDocCancelRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ZIffmBillingdocCancelResponse> createErrorResponse()
	{
		final ZIffmBillingdocCancelResponse zIffmBillingdocCancelResponse = new ZIffmBillingdocCancelResponse();
		final ZifstStatusDoc zifstStatusDoc = new ZifstStatusDoc();
		zifstStatusDoc.setStatus(getConfigurationService().getConfiguration().getString(getConnectionErrorStatus()));
		zifstStatusDoc.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));
		zIffmBillingdocCancelResponse.setStatus(zifstStatusDoc);

		return getObjectFactory().createZIffmBillingdocCancelResponse(zIffmBillingdocCancelResponse);
	}


}
