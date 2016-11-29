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
package com.cnk.travelogix.ccintegrationfacade.impl;

import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationErrorCodes;
import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationException;
import com.cnk.travelogix.contract.provisioning.data.ResponseStatus;
import com.cnk.travelogix.sapintegrations.facade.DefaultCCServicesFacade;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.FailureCategory;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccount;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountMaintainData;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountOperationResponseData;



// TODO: Auto-generated Javadoc
/**
 * The Class AbstracttCCIntegrationFacade.
 */
public class AbstractCCIntegrationFacade
{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(AbstractCCIntegrationFacade.class);

	/** The cc services facade. */
	private DefaultCCServicesFacade ccServicesFacade;

	/**
	 * Creates the subscriber acc.
	 *
	 * @param <T>
	 *           the generic type
	 * @param pSupplierModel
	 *           the supplier model
	 * @param pConverter
	 *           the converter
	 * @return the subscriber account operation response data
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */
	protected <T> SubscriberAccountOperationResponseData createSubscriberAccount(final T pSupplierModel,
			final Converter<T, SubscriberAccount> pConverter) throws CCIntegrationException
	{
		LOGGER.debug("AbstractCCIntegrationFacade : createSubscriberAccount() : Entering.");

		final SubscriberAccountMaintainData lSubscriberAccountMaintainData = new SubscriberAccountMaintainData();
		final SubscriberAccount lSubscriberAccount = pConverter.convert(pSupplierModel);

		lSubscriberAccountMaintainData.setSubscriberAccount(lSubscriberAccount);

		final SubscriberAccountOperationResponseData lSubscriberAccountOperationResponseData = handleSubscriberAccountResponse(
				lSubscriberAccountMaintainData);

		LOGGER.debug("AbstractCCIntegrationFacade : createSubscriberAccount() : Exiting.");
		return lSubscriberAccountOperationResponseData;
	}

	/**
	 * Creates the subscriber account.
	 *
	 * @param pSubscriberAccountMaintainData
	 *           the subscriber account maintain data
	 * @return the subscriber account operation response data
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */
	protected SubscriberAccountOperationResponseData handleSubscriberAccountResponse(
			final SubscriberAccountMaintainData pSubscriberAccountMaintainData) throws CCIntegrationException
	{
		LOGGER.debug("AbstractCCIntegrationFacade : handleSubscriberAccountResponse() : Entering.");
		try
		{
			final SubscriberAccountOperationResponseData lSubscriberAccountOperationResponseData = getCcServicesFacade()
					.subscribeAccMaintain(pSubscriberAccountMaintainData);

			if (lSubscriberAccountOperationResponseData != null)
			{
				if (ResponseStatus.ERROR.equals(lSubscriberAccountOperationResponseData.getStatus()))
				{
					if (lSubscriberAccountOperationResponseData.getError().getCategory().equals(FailureCategory.PREREQUISITE_MISSING))
					{
						throw new CCIntegrationException(lSubscriberAccountOperationResponseData.getError().getCause().getMessage(),
								CCIntegrationErrorCodes.ERR_REQUIRED_PARAM);
					}
					else
					{
						throw new CCIntegrationException(lSubscriberAccountOperationResponseData.getError().getCause().getMessage(),
								CCIntegrationErrorCodes.ERR_RUNTIME);
					}
				}
				else
				{
					LOGGER.debug(
							"AbstractCCIntegrationFacade : handleSubscriberAccountResponse() : Subscriber A/c successfully created with reference number : "
									+ lSubscriberAccountOperationResponseData.getSubscriberAccountReference());
				}
			}

			LOGGER.debug("AbstractCCIntegrationFacade : handleSubscriberAccountResponse() : Exiting.");

			return lSubscriberAccountOperationResponseData;
		}

		catch (final CCIntegrationException e)
		{
			throw e;
		}
		catch (final Exception e)
		{
			throw new CCIntegrationException(CCIntegrationErrorCodes.ERR_RUNTIME, e);
		}
		finally
		{
			LOGGER.debug("AbstractCCIntegrationFacade : handleSubscriberAccountResponse() : Exiting.");
		}

	}


	/**
	 * Gets the cc services facade.
	 *
	 * @return the cc services facade
	 */
	public DefaultCCServicesFacade getCcServicesFacade()
	{
		return ccServicesFacade;
	}

	/**
	 * Sets the cc services facade.
	 *
	 * @param ccServicesFacade
	 *           the new cc services facade
	 */
	public void setCcServicesFacade(final DefaultCCServicesFacade ccServicesFacade)
	{
		this.ccServicesFacade = ccServicesFacade;
	}

}
