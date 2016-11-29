/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.sapintegrations.processor.impl;

import javax.xml.bind.JAXBElement;

import com.cnk.travelogix.custom.mappingtable.maintain.MaintainMappingTableRowRequest;
import com.cnk.travelogix.custom.mappingtable.maintain.MappingTableRowOperationResponse;
import com.cnk.travelogix.custom.mappingtable.maintain.ObjectFactory;
import com.cnk.travelogix.custom.mappingtable.maintain.ResponseStatus;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.MappingTableRowMaintainRequestProcessor;


/**
 *
 */
public class DefaultMappingTableRowMaintainRequestProcessor
		extends AbstractRequestProcessor<MaintainMappingTableRowRequest, MappingTableRowOperationResponse>
		implements MappingTableRowMaintainRequestProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final MaintainMappingTableRowRequest request)
	{
		final RequestMessage requestMessage = new RequestMessage<MaintainMappingTableRowRequest>();
		requestMessage.setRequestObject(getObjectFactory().createMappingTableRowMaintainRequest(request));
		requestMessage.setServiceInterface(MappingTableRowMaintainRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<MappingTableRowOperationResponse> createErrorResponse()
	{
		final MappingTableRowOperationResponse mappingTableRowOperationResponse = new MappingTableRowOperationResponse();
		mappingTableRowOperationResponse.setStatus(ResponseStatus.ERROR);
		mappingTableRowOperationResponse
				.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));

		return getObjectFactory().createMappingTableRowCancelResponse(mappingTableRowOperationResponse);
	}


}
