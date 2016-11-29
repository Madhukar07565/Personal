package com.cnk.travelogix.sapintegrations.processor.impl;

import javax.xml.bind.JAXBElement;

import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ObjectFactory;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaints;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaintsResponse;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaintsStatus;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZttTerpComplaintsStatus;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.ComplaintsFeedbackRequestProcessor;


public class DefaultComplaintsFeedbackRequestProcessor
		extends AbstractRequestProcessor<ZifTerpComplaints, ZifTerpComplaintsResponse>implements ComplaintsFeedbackRequestProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ZifTerpComplaints request)
	{
		final RequestMessage requestMessage = new RequestMessage<ZifTerpComplaints>();
		requestMessage.setRequestObject(getObjectFactory().createZifTerpComplaints(request));
		requestMessage.setServiceInterface(ComplaintsFeedbackRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ZifTerpComplaintsResponse> createErrorResponse()
	{
		final ZifTerpComplaintsResponse zifTerpComplaintsResponse = new ZifTerpComplaintsResponse();
		final ZttTerpComplaintsStatus zttTerpComplaintsStatus = new ZttTerpComplaintsStatus();
		final ZifTerpComplaintsStatus zifTerpComplaintsStatus = new ZifTerpComplaintsStatus();
		zifTerpComplaintsStatus.setStatus(getConfigurationService().getConfiguration().getString(getConnectionErrorStatus()));
		zifTerpComplaintsStatus.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));
		zttTerpComplaintsStatus.getItem().add(zifTerpComplaintsStatus);
		zifTerpComplaintsResponse.setStatus(zttTerpComplaintsStatus);

		return getObjectFactory().createZifTerpComplaintsResponse(zifTerpComplaintsResponse);
	}


}
