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
package com.cnk.travelogix.sapintegrations.facade;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.apache.log4j.Logger;

import com.cnk.travelogix.contract.provisioning.data.ContractOperationResponseData;
import com.cnk.travelogix.contract.provisioning.data.MaintainChargingContractRequestData;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemChargeRequest;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemChargeResponse;
import com.cnk.travelogix.custom.contract.provisioning.ContractOperationResponse;
import com.cnk.travelogix.custom.contract.provisioning.MaintainChargingContractRequest;
import com.cnk.travelogix.custom.mappingtable.maintain.MaintainMappingTableRequest;
import com.cnk.travelogix.custom.mappingtable.maintain.MaintainMappingTableRowRequest;
import com.cnk.travelogix.custom.mappingtable.maintain.MappingTableOperationResponse;
import com.cnk.travelogix.custom.mappingtable.maintain.MappingTableRowOperationResponse;
import com.cnk.travelogix.custom.subscribe.account.ExternalAccountMaintainRequest;
import com.cnk.travelogix.custom.subscribe.account.ExternalAccountOperationResponse;
import com.cnk.travelogix.custom.subscribe.account.SubscriberAccountCancelRequest;
import com.cnk.travelogix.custom.subscribe.account.SubscriberAccountMaintainRequest;
import com.cnk.travelogix.custom.subscribe.account.SubscriberAccountOperationResponse;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargeableItemChargeRequestData;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargeableItemChargeResponseData;
import com.cnk.travelogix.sapintegrations.exception.ServiceNotSupportedException;
import com.cnk.travelogix.sapintegrations.factory.SAPWebServicesFactory;
import com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MaintainMappingTableRequestData;
import com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MappingTableOperationResponseData;
import com.cnk.travelogix.sapintegrations.processor.ContractProvisioningProcessor;
import com.cnk.travelogix.sapintegrations.processor.ExternalAccMaintainRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.ItemChargingProcessor;
import com.cnk.travelogix.sapintegrations.processor.MaintainMappingTableRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.MappingTableRowMaintainRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.SubscriberAccMaintainRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.SubscriberAccountCancelProcessor;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccount;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccountMaintainData;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccountOperationResponseData;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ResponseStatus;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountMaintainData;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountOperationResponseData;


/**
 *
 */
public class DefaultCCServicesFacade implements CCServicesFacade
{
	private final Logger LOG = Logger.getLogger(getClass());
	private SAPWebServicesFactory sapWebServicesFactory;
	private Converter<SubscriberAccountMaintainData, SubscriberAccountMaintainRequest> subscriberAccMaintaintRequestDataConverter;
	private Converter<SubscriberAccountOperationResponse, SubscriberAccountOperationResponseData> subscriberAccMaintaintResponseDataConverter;
	private Converter<ExternalAccountMaintainData, ExternalAccountMaintainRequest> externalAccMaintaintRequestDataConverter;
	private Converter<ExternalAccountOperationResponse, ExternalAccountOperationResponseData> externalAccMaintaintResponseDataConverter;
	private Converter<MaintainMappingTableRequestData, MaintainMappingTableRowRequest> mappingTableRowMaintainRequestDataConverter;
	private Converter<MappingTableRowOperationResponse, MappingTableOperationResponseData> mappingTableRowMaintainResponseDataConverter;
	private Converter<MaintainMappingTableRequestData, MaintainMappingTableRequest> maintainMappingTableRequestDataConverter;
	private Converter<MappingTableOperationResponse, MappingTableOperationResponseData> maintainMappingTableResponseDataConverter;
	private Converter<MaintainChargingContractRequestData, MaintainChargingContractRequest> contractProvisioningRequestConverter;
	private Converter<ContractOperationResponse, ContractOperationResponseData> contractProvisioningResponseConverter;
	private Converter<ChargeableItemChargeRequestData, ChargeableItemChargeRequest> itemChargingRequestConverter;
	private Converter<ChargeableItemChargeResponse, ChargeableItemChargeResponseData> itemChargingResponseConverter;

	/**
	 * @return the mappingTableRowMaintainRequestDataConverter
	 */
	public Converter<MaintainMappingTableRequestData, MaintainMappingTableRowRequest> getMappingTableRowMaintainRequestDataConverter()
	{
		return mappingTableRowMaintainRequestDataConverter;
	}

	/**
	 * @param mappingTableRowMaintainRequestDataConverter
	 *           the mappingTableRowMaintainRequestDataConverter to set
	 */
	public void setMappingTableRowMaintainRequestDataConverter(
			final Converter<MaintainMappingTableRequestData, MaintainMappingTableRowRequest> mappingTableRowMaintainRequestDataConverter)
	{
		this.mappingTableRowMaintainRequestDataConverter = mappingTableRowMaintainRequestDataConverter;
	}

	/**
	 * @return the mappingTableRowMaintainResponseDataConverter
	 */
	public Converter<MappingTableRowOperationResponse, MappingTableOperationResponseData> getMappingTableRowMaintainResponseDataConverter()
	{
		return mappingTableRowMaintainResponseDataConverter;
	}

	/**
	 * @param mappingTableRowMaintainResponseDataConverter
	 *           the mappingTableRowMaintainResponseDataConverter to set
	 */
	public void setMappingTableRowMaintainResponseDataConverter(
			final Converter<MappingTableRowOperationResponse, MappingTableOperationResponseData> mappingTableRowMaintainResponseDataConverter)
	{
		this.mappingTableRowMaintainResponseDataConverter = mappingTableRowMaintainResponseDataConverter;
	}

	/**
	 * @return the sapWebServicesFactory
	 */
	public SAPWebServicesFactory getSapWebServicesFactory()
	{
		return sapWebServicesFactory;
	}

	/**
	 * @param sapWebServicesFactory
	 *           the sapWebServicesFactory to set
	 */
	public void setSapWebServicesFactory(final SAPWebServicesFactory sapWebServicesFactory)
	{
		this.sapWebServicesFactory = sapWebServicesFactory;
	}

	/**
	 * @return the subscriberAccMaintaintRequestDataConverter
	 */
	public Converter<SubscriberAccountMaintainData, SubscriberAccountMaintainRequest> getSubscriberAccMaintaintRequestDataConverter()
	{
		return subscriberAccMaintaintRequestDataConverter;
	}

	/**
	 * @param subscriberAccMaintaintRequestDataConverter
	 *           the subscriberAccMaintaintRequestDataConverter to set
	 */
	public void setSubscriberAccMaintaintRequestDataConverter(
			final Converter<SubscriberAccountMaintainData, SubscriberAccountMaintainRequest> subscriberAccMaintaintRequestDataConverter)
	{
		this.subscriberAccMaintaintRequestDataConverter = subscriberAccMaintaintRequestDataConverter;
	}

	/**
	 * @return the subscriberAccMaintaintResponseDataConverter
	 */
	public Converter<SubscriberAccountOperationResponse, SubscriberAccountOperationResponseData> getSubscriberAccMaintaintResponseDataConverter()
	{
		return subscriberAccMaintaintResponseDataConverter;
	}

	/**
	 * @param subscriberAccMaintaintResponseDataConverter
	 *           the subscriberAccMaintaintResponseDataConverter to set
	 */
	public void setSubscriberAccMaintaintResponseDataConverter(
			final Converter<SubscriberAccountOperationResponse, SubscriberAccountOperationResponseData> subscriberAccMaintaintResponseDataConverter)
	{
		this.subscriberAccMaintaintResponseDataConverter = subscriberAccMaintaintResponseDataConverter;
	}

	/**
	 * @return the externalAccMaintaintRequestDataConverter
	 */
	public Converter<ExternalAccountMaintainData, ExternalAccountMaintainRequest> getExternalAccMaintaintRequestDataConverter()
	{
		return externalAccMaintaintRequestDataConverter;
	}

	/**
	 * @param externalAccMaintaintRequestDataConverter
	 *           the externalAccMaintaintRequestDataConverter to set
	 */
	public void setExternalAccMaintaintRequestDataConverter(
			final Converter<ExternalAccountMaintainData, ExternalAccountMaintainRequest> externalAccMaintaintRequestDataConverter)
	{
		this.externalAccMaintaintRequestDataConverter = externalAccMaintaintRequestDataConverter;
	}

	/**
	 * @return the externalAccMaintaintResponseDataConverter
	 */
	public Converter<ExternalAccountOperationResponse, ExternalAccountOperationResponseData> getExternalAccMaintaintResponseDataConverter()
	{
		return externalAccMaintaintResponseDataConverter;
	}

	/**
	 * @param externalAccMaintaintResponseDataConverter
	 *           the externalAccMaintaintResponseDataConverter to set
	 */
	public void setExternalAccMaintaintResponseDataConverter(
			final Converter<ExternalAccountOperationResponse, ExternalAccountOperationResponseData> externalAccMaintaintResponseDataConverter)
	{
		this.externalAccMaintaintResponseDataConverter = externalAccMaintaintResponseDataConverter;
	}

	@Override
	public SubscriberAccountOperationResponseData subscribeAccMaintain(final SubscriberAccountMaintainData request)
	{
		SubscriberAccountOperationResponseData subscriberAccountOperationResponseData = null;
		try
		{
			LOG.info("Creating Subscriber Account");
			final SubscriberAccountMaintainRequest subAccMaintainRequest = getSubscriberAccMaintaintRequestDataConverter()
					.convert(request);
			final SubscriberAccMaintainRequestProcessor processor = getSapWebServicesFactory()
					.createSAPWebService(SubscriberAccMaintainRequestProcessor.class);
			final SubscriberAccountOperationResponse subAccOpResponse = processor.processRequest(subAccMaintainRequest);

			subscriberAccountOperationResponseData = getSubscriberAccMaintaintResponseDataConverter().convert(subAccOpResponse);

			if (!ResponseStatus.ERROR.equals(subscriberAccountOperationResponseData.getStatus()))
			{
				LOG.info("Subscriber Account Created Successfully So Creating External Account ");
				final ExternalAccountMaintainData externalAccountMaintainData = new ExternalAccountMaintainData();
				final ExternalAccount externalAccount = new ExternalAccount();

				externalAccount.setCurrencyCode(request.getSubscriberAccount().getCurrencyCode());
				externalAccount.setDescription(request.getSubscriberAccount().getDescription());
				externalAccount.setId(request.getSubscriberAccount().getId());
				externalAccount.setSubscriberAccountId(request.getSubscriberAccount().getId());
				externalAccountMaintainData.setExternalAccount(externalAccount);

				final ExternalAccountOperationResponseData externalAccountOperationResponseDate = externalAccMaintain(
						externalAccountMaintainData);
				if (ResponseStatus.ERROR.equals(externalAccountOperationResponseDate.getStatus()))
				{
					LOG.info("Creating External Account Failed So Canceling Subscriber Account");
					subscriberAccountOperationResponseData.setStatus(externalAccountOperationResponseDate.getStatus());
					//  Cancel Subscriber Account
					final com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountCancelRequest subscriberAccountCancelRequestData = new com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountCancelRequest();
					subscriberAccountCancelRequestData
							.setSubscriberAccountId(subscriberAccountOperationResponseData.getSubscriberAccountId());
					final SubscriberAccountOperationResponseData cancelResponse = canceSubscriberAccount(
							subscriberAccountCancelRequestData);
					if (ResponseStatus.ERROR.equals(cancelResponse.getStatus()))
					{
						subscriberAccountOperationResponseData.setStatus(cancelResponse.getStatus());
					}
				}
			}
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return subscriberAccountOperationResponseData;
	}

	@Override
	public SubscriberAccountOperationResponseData canceSubscriberAccount(
			final com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountCancelRequest cancelRequestData)
	{
		SubscriberAccountOperationResponse cancelResponse = null;
		try
		{
			final SubscriberAccountCancelRequest cancelRequest = new SubscriberAccountCancelRequest();
			cancelRequest.setSubscriberAccountId(cancelRequestData.getSubscriberAccountId());
			final SubscriberAccountCancelProcessor processor = getSapWebServicesFactory()
					.createSAPWebService(SubscriberAccountCancelProcessor.class);
			cancelResponse = processor.processRequest(cancelRequest);
			return getSubscriberAccMaintaintResponseDataConverter().convert(cancelResponse);
		}
		catch (final ServiceNotSupportedException e)
		{
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

	public ExternalAccountOperationResponseData externalAccMaintain(final ExternalAccountMaintainData request)
	{
		try
		{
			final ExternalAccountMaintainRequest extAccMaintainRequest = getExternalAccMaintaintRequestDataConverter()
					.convert(request);
			final ExternalAccMaintainRequestProcessor processor = getSapWebServicesFactory()
					.createSAPWebService(ExternalAccMaintainRequestProcessor.class);
			final ExternalAccountOperationResponse extAccOpResponse = processor.processRequest(extAccMaintainRequest);

			return getExternalAccMaintaintResponseDataConverter().convert(extAccOpResponse);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return null;

	}

	/**
	 * This method is called to Create Table & Insert records.
	 *
	 * Send
	 *
	 */
	@Override
	public MappingTableOperationResponseData createMappingTableMaintain(final MaintainMappingTableRequestData request)
	{
		try
		{
			final MaintainMappingTableRequest maintainMappingTableRequest = getMaintainMappingTableRequestDataConverter()
					.convert(request);

			final String operation = request.getOperation();
			if ("CREATE_INSERT".equalsIgnoreCase(operation))
			{
				final MaintainMappingTableRequestProcessor processor = getSapWebServicesFactory()
						.createSAPWebService(MaintainMappingTableRequestProcessor.class);
				final MappingTableOperationResponse response = processor.processRequest(maintainMappingTableRequest);
				return getMaintainMappingTableResponseDataConverter().convert(response);
			}
			else if ("INSERT_UPDATE".equalsIgnoreCase(operation))
			{
				final MaintainMappingTableRowRequest mapTbleRowRequest = getMappingTableRowMaintainRequestDataConverter()
						.convert(request);
				final MappingTableRowMaintainRequestProcessor processor = getSapWebServicesFactory()
						.createSAPWebService(MappingTableRowMaintainRequestProcessor.class);
				final MappingTableRowOperationResponse response = processor.processRequest(mapTbleRowRequest);
				return getMappingTableRowMaintainResponseDataConverter().convert(response);
			}
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

	@Override
	public ContractOperationResponseData contractProvisioning(final MaintainChargingContractRequestData request)
	{
		try
		{
			final MaintainChargingContractRequest contractRequest = getContractProvisioningRequestConverter().convert(request);
			final ContractProvisioningProcessor processor = getSapWebServicesFactory()
					.createSAPWebService(ContractProvisioningProcessor.class);
			final ContractOperationResponse response = processor.processRequest(contractRequest);
			return getContractProvisioningResponseConverter().convert(response);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * @return the maintainMappingTableRequestDataConverter
	 */
	public Converter<MaintainMappingTableRequestData, MaintainMappingTableRequest> getMaintainMappingTableRequestDataConverter()
	{
		return maintainMappingTableRequestDataConverter;
	}

	/**
	 * @param maintainMappingTableRequestDataConverter
	 *           the maintainMappingTableRequestDataConverter to set
	 */
	public void setMaintainMappingTableRequestDataConverter(
			final Converter<MaintainMappingTableRequestData, MaintainMappingTableRequest> maintainMappingTableRequestDataConverter)
	{
		this.maintainMappingTableRequestDataConverter = maintainMappingTableRequestDataConverter;
	}

	/**
	 * @return the maintainMappingTableResponseDataConverter
	 */
	public Converter<MappingTableOperationResponse, MappingTableOperationResponseData> getMaintainMappingTableResponseDataConverter()
	{
		return maintainMappingTableResponseDataConverter;
	}

	/**
	 * @param maintainMappingTableResponseDataConverter
	 *           the maintainMappingTableResponseDataConverter to set
	 */
	public void setMaintainMappingTableResponseDataConverter(
			final Converter<MappingTableOperationResponse, MappingTableOperationResponseData> maintainMappingTableResponseDataConverter)
	{
		this.maintainMappingTableResponseDataConverter = maintainMappingTableResponseDataConverter;
	}

	/**
	 * @return the contractProvisioningResponseConverter
	 */
	public Converter<ContractOperationResponse, ContractOperationResponseData> getContractProvisioningResponseConverter()
	{
		return contractProvisioningResponseConverter;
	}

	/**
	 * @param contractProvisioningResponseConverter
	 *           the contractProvisioningResponseConverter to set
	 */
	public void setContractProvisioningResponseConverter(
			final Converter<ContractOperationResponse, ContractOperationResponseData> contractProvisioningResponseConverter)
	{
		this.contractProvisioningResponseConverter = contractProvisioningResponseConverter;
	}

	/**
	 * @return the contractProvisioningRequestConverter
	 */
	public Converter<MaintainChargingContractRequestData, MaintainChargingContractRequest> getContractProvisioningRequestConverter()
	{
		return contractProvisioningRequestConverter;
	}

	/**
	 * @param contractProvisioningRequestConverter
	 *           the contractProvisioningRequestConverter to set
	 */
	public void setContractProvisioningRequestConverter(
			final Converter<MaintainChargingContractRequestData, MaintainChargingContractRequest> contractProvisioningRequestConverter)
	{
		this.contractProvisioningRequestConverter = contractProvisioningRequestConverter;
	}

	/**
	 * @return the itemChargingRequestConverter
	 */
	public Converter<ChargeableItemChargeRequestData, ChargeableItemChargeRequest> getItemChargingRequestConverter()
	{
		return itemChargingRequestConverter;
	}

	/**
	 * @param itemChargingRequestConverter
	 *           the itemChargingRequestConverter to set
	 */
	public void setItemChargingRequestConverter(
			final Converter<ChargeableItemChargeRequestData, ChargeableItemChargeRequest> itemChargingRequestConverter)
	{
		this.itemChargingRequestConverter = itemChargingRequestConverter;
	}

	/**
	 * @return the itemChargingResponseConverter
	 */
	public Converter<ChargeableItemChargeResponse, ChargeableItemChargeResponseData> getItemChargingResponseConverter()
	{
		return itemChargingResponseConverter;
	}

	/**
	 * @param itemChargingResponseConverter
	 *           the itemChargingResponseConverter to set
	 */
	public void setItemChargingResponseConverter(
			final Converter<ChargeableItemChargeResponse, ChargeableItemChargeResponseData> itemChargingResponseConverter)
	{
		this.itemChargingResponseConverter = itemChargingResponseConverter;
	}

	@Override
	public ChargeableItemChargeResponseData itemCharging(final ChargeableItemChargeRequestData request)
	{
		try
		{
			final ChargeableItemChargeRequest requestData = getItemChargingRequestConverter().convert(request);
			final ItemChargingProcessor itemChargingProcessor = getSapWebServicesFactory()
					.createSAPWebService(ItemChargingProcessor.class);
			final ChargeableItemChargeResponse itemChargeResponse = itemChargingProcessor.processRequest(requestData);
			return getItemChargingResponseConverter().convert(itemChargeResponse);
		}
		catch (final Exception e)
		{
			LOG.error(e);
		}
		return null;
	}

}
