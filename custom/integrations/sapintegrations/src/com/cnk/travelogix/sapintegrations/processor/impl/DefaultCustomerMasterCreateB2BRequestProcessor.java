package com.cnk.travelogix.sapintegrations.processor.impl;

import javax.xml.bind.JAXBElement;

import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ObjectFactory;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifErpStStatusC;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifErpTtStatusC;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifTerpPartnerSaveB2B;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifTerpPartnerSaveB2BResponse;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.CustomerMasterCreateB2BRequestProcessor;


public class DefaultCustomerMasterCreateB2BRequestProcessor
		extends AbstractRequestProcessor<ZifTerpPartnerSaveB2B, ZifTerpPartnerSaveB2BResponse>
		implements CustomerMasterCreateB2BRequestProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ZifTerpPartnerSaveB2B request)
	{
		final RequestMessage requestMessage = new RequestMessage<ZifTerpPartnerSaveB2B>();
		requestMessage.setRequestObject(getObjectFactory().createZifTerpPartnerSaveB2B(request));
		requestMessage.setServiceInterface(CustomerMasterCreateB2BRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());
		return requestMessage;
	}

	@Override
	protected JAXBElement<ZifTerpPartnerSaveB2BResponse> createErrorResponse()
	{
		final ZifTerpPartnerSaveB2BResponse zifTerpPartnerSaveB2BResponse = new ZifTerpPartnerSaveB2BResponse();
		final ZifErpTtStatusC zifErpTtStatusC = new ZifErpTtStatusC();
		final ZifErpStStatusC zifErpStStatusC = new ZifErpStStatusC();
		zifErpStStatusC.setStatus(getConfigurationService().getConfiguration().getString(getConnectionErrorStatus()));
		zifErpStStatusC.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));
		zifErpTtStatusC.getItem().add(zifErpStStatusC);
		zifTerpPartnerSaveB2BResponse.setStatus(zifErpTtStatusC);

		return getObjectFactory().createZifTerpPartnerSaveB2BResponse(zifTerpPartnerSaveB2BResponse);
	}


}
