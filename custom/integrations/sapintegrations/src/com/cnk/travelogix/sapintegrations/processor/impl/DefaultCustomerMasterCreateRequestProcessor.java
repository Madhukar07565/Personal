package com.cnk.travelogix.sapintegrations.processor.impl;

import javax.xml.bind.JAXBElement;

import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ObjectFactory;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifErpStStatusC;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifErpTtStatusC;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifTerpPartnerSave;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifTerpPartnerSaveResponse;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.CustomerMasterCreateRequestProcessor;


public class DefaultCustomerMasterCreateRequestProcessor extends
		AbstractRequestProcessor<ZifTerpPartnerSave, ZifTerpPartnerSaveResponse>implements CustomerMasterCreateRequestProcessor
{

	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ZifTerpPartnerSave request)
	{
		final RequestMessage requestMessage = new RequestMessage<ZifTerpPartnerSave>();
		requestMessage.setRequestObject(getObjectFactory().createZifTerpPartnerSave(request));
		requestMessage.setServiceInterface(CustomerMasterCreateRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ZifTerpPartnerSaveResponse> createErrorResponse()
	{
		final ZifTerpPartnerSaveResponse zifTerpPartnerSaveResponse = new ZifTerpPartnerSaveResponse();
		final ZifErpTtStatusC zifErpTtStatusC = new ZifErpTtStatusC();
		final ZifErpStStatusC zifErpStStatusC = new ZifErpStStatusC();
		zifErpStStatusC.setStatus(getConfigurationService().getConfiguration().getString(getConnectionErrorStatus()));
		zifErpStStatusC.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));
		zifErpTtStatusC.getItem().add(zifErpStStatusC);
		zifTerpPartnerSaveResponse.setStatus(zifErpTtStatusC);

		return getObjectFactory().createZifTerpPartnerSaveResponse(zifTerpPartnerSaveResponse);
	}


}
