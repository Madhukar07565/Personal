package com.cnk.travelogix.sapintegrations.processor.impl;

import javax.xml.bind.JAXBElement;

import com.cnk.travelogix.custom.zifws.account.clear.ObjectFactory;
import com.cnk.travelogix.custom.zifws.account.clear.ZIffmAccountClear;
import com.cnk.travelogix.custom.zifws.account.clear.ZIffmAccountClearResponse;
import com.cnk.travelogix.custom.zifws.account.clear.ZifstStatusDoc;
import com.cnk.travelogix.custom.zifws.account.clear.ZifttStatusDoc;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.AccountClearRequestProcessor;


public class DefaultAccountClearRequestProcessor extends AbstractRequestProcessor<ZIffmAccountClear, ZIffmAccountClearResponse>
		implements AccountClearRequestProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ZIffmAccountClear request)
	{
		final RequestMessage requestMessage = new RequestMessage<ZIffmAccountClear>();
		requestMessage.setRequestObject(getObjectFactory().createZIffmAccountClear(request));
		requestMessage.setServiceInterface(AccountClearRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ZIffmAccountClearResponse> createErrorResponse()
	{
		final ZIffmAccountClearResponse zIffmAccountClearResponse = new ZIffmAccountClearResponse();
		final ZifttStatusDoc zifttStatusDoc = new ZifttStatusDoc();
		final ZifstStatusDoc zifstStatusDoc = new ZifstStatusDoc();
		zifstStatusDoc.setStatus(getConfigurationService().getConfiguration().getString(getConnectionErrorStatus()));
		zifstStatusDoc.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));
		zifttStatusDoc.getItem().add(zifstStatusDoc);
		zIffmAccountClearResponse.setEStatus(zifttStatusDoc);

		return getObjectFactory().createZIffmAccountClearResponse(zIffmAccountClearResponse);
	}


}
