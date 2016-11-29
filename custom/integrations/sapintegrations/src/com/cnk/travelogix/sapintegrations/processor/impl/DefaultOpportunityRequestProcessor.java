package com.cnk.travelogix.sapintegrations.processor.impl;

import javax.xml.bind.JAXBElement;

import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ObjectFactory;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifTerpOpportunity;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifTerpOpportunityResponse;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifstStatusOpp;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZttStatusOpp;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.OpportunityRequestProcessor;


public class DefaultOpportunityRequestProcessor extends AbstractRequestProcessor<ZifTerpOpportunity, ZifTerpOpportunityResponse>
		implements OpportunityRequestProcessor
{

	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ZifTerpOpportunity request)
	{
		final RequestMessage requestMessage = new RequestMessage<ZifTerpOpportunity>();
		requestMessage.setRequestObject(getObjectFactory().createZifTerpOpportunity(request));
		requestMessage.setServiceInterface(OpportunityRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ZifTerpOpportunityResponse> createErrorResponse()
	{
		final ZifTerpOpportunityResponse zifTerpOpportunityResponse = new ZifTerpOpportunityResponse();
		final ZttStatusOpp zttStatusOpp = new ZttStatusOpp();
		final ZifstStatusOpp zifstStatusOpp = new ZifstStatusOpp();
		zifstStatusOpp.setStatus(getConfigurationService().getConfiguration().getString(getConnectionErrorStatus()));
		zifstStatusOpp.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));
		zttStatusOpp.getItem().add(zifstStatusOpp);
		zifTerpOpportunityResponse.setStatus(zttStatusOpp);

		return getObjectFactory().createZifTerpOpportunityResponse(zifTerpOpportunityResponse);
	}


}
