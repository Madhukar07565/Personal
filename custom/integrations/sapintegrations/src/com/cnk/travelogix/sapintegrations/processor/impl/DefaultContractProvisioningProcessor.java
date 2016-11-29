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

import com.cnk.travelogix.custom.contract.provisioning.ContractOperationResponse;
import com.cnk.travelogix.custom.contract.provisioning.MaintainChargingContractRequest;
import com.cnk.travelogix.custom.contract.provisioning.ResponseStatus;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.ContractProvisioningProcessor;


/**
 *
 */
public class DefaultContractProvisioningProcessor
		extends AbstractRequestProcessor<MaintainChargingContractRequest, ContractOperationResponse>
		implements ContractProvisioningProcessor
{

	public com.cnk.travelogix.custom.contract.provisioning.ObjectFactory getObjectFactory()
	{
		return (com.cnk.travelogix.custom.contract.provisioning.ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final MaintainChargingContractRequest request)
	{
		final RequestMessage requestMessage = new RequestMessage<MaintainChargingContractRequest>();
		requestMessage.setRequestObject(getObjectFactory().createChargingContractMaintainRequest(request));
		requestMessage.setServiceInterface(ContractProvisioningProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ContractOperationResponse> createErrorResponse()
	{
		final ContractOperationResponse contractOperationResponse = new ContractOperationResponse();
		contractOperationResponse.setStatus(ResponseStatus.ERROR);
		contractOperationResponse.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));

		return getObjectFactory().createChargingContractCancelResponse(contractOperationResponse);
	}
}
