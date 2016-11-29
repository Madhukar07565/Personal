package com.cnk.travelogix.sapintegrations.processor.impl;

import javax.xml.bind.JAXBElement;

import com.cnk.travelogix.custom.zifws.accdocpost.ObjectFactory;
import com.cnk.travelogix.custom.zifws.accdocpost.ZIffmAccountDocument;
import com.cnk.travelogix.custom.zifws.accdocpost.ZIffmAccountDocumentResponse;
import com.cnk.travelogix.custom.zifws.accdocpost.ZifstStatusDoc;
import com.cnk.travelogix.custom.zifws.accdocpost.ZifttStatusDoc;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.AccountDocumentRequestProcessor;


public class DefaultAccountDocumentRequestProcessor extends
		AbstractRequestProcessor<ZIffmAccountDocument, ZIffmAccountDocumentResponse>implements AccountDocumentRequestProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ZIffmAccountDocument request)
	{
		final RequestMessage requestMessage = new RequestMessage<ZIffmAccountDocument>();
		requestMessage.setRequestObject(getObjectFactory().createZIffmAccountDocument(request));
		requestMessage.setServiceInterface(AccountDocumentRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ZIffmAccountDocumentResponse> createErrorResponse()
	{
		final ZIffmAccountDocumentResponse zIffmAccountDocumentResponse = new ZIffmAccountDocumentResponse();
		final ZifttStatusDoc zifttStatusDoc = new ZifttStatusDoc();
		final ZifstStatusDoc zifstStatusDoc = new ZifstStatusDoc();
		zifstStatusDoc.setStatus(getConfigurationService().getConfiguration().getString(getConnectionErrorStatus()));
		zifstStatusDoc.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));
		zifttStatusDoc.getItem().add(zifstStatusDoc);
		zIffmAccountDocumentResponse.setEStatus(zifttStatusDoc);

		return getObjectFactory().createZIffmAccountDocumentResponse(zIffmAccountDocumentResponse);
	}


}
