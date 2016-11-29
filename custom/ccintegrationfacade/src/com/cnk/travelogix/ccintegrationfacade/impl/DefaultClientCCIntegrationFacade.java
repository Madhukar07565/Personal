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

import com.cnk.travelogix.ccintegrationfacade.ClientCCIntegrationFacade;
import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationErrorCodes;
import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationException;
import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ResponseStatus;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccount;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountOperationResponseData;


/**
 * The Class DefaultClientCCIntegrationFacade.
 */
public class DefaultClientCCIntegrationFacade extends AbstractCCIntegrationFacade implements ClientCCIntegrationFacade
{
	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(DefaultClientCCIntegrationFacade.class);

	/** The client subscriber account converter. */
	private Converter<TravelogixB2BUnitModel, SubscriberAccount> clientSubscriberAccountConverter;

	/**
	 * Creates the client account.
	 *
	 * @param pTravelogixB2BUnitModel
	 *           the travelogix B 2 B unit model
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */
	@Override
	public void createClientAccount(final TravelogixB2BUnitModel pTravelogixB2BUnitModel) throws CCIntegrationException
	{
		LOGGER.debug("DefaultClientCCIntegrationFacade : createClientAccount() : Entering.");
		try
		{
			final SubscriberAccountOperationResponseData lSubscriberAccountOperationResponseData = super.createSubscriberAccount(
					pTravelogixB2BUnitModel, getClientSubscriberAccountConverter());

			if (lSubscriberAccountOperationResponseData != null
					&& lSubscriberAccountOperationResponseData.getStatus().equals(ResponseStatus.RETURN))
			{
				//	RETRIEVE SUBSCRIBER ACC ID OR REF NUMMER AND SAVE TO MODEL
				/*
				 * pTravelogixB2BUnitModel
				 * .setSubscriberAccountRef(lSubscriberAccountOperationResponseData.getSubscriberAccountReference());
				 */
				LOGGER.info("..........Subscriber Response Successfull");

			}
		}
		catch (final CCIntegrationException e)
		{
			throw e;
		}
		catch (final Exception e)
		{
			// Any other exception
			throw new CCIntegrationException(CCIntegrationErrorCodes.ERR_RUNTIME, e);
		}
		finally
		{
			LOGGER.debug("DefaultClientCCIntegrationFacade : createClientAccount() : Exiting");
		}
	}

	public Converter<TravelogixB2BUnitModel, SubscriberAccount> getClientSubscriberAccountConverter()
	{
		return clientSubscriberAccountConverter;
	}


	public void setClientSubscriberAccountConverter(
			final Converter<TravelogixB2BUnitModel, SubscriberAccount> clientSubscriberAccountConverter)
	{
		this.clientSubscriberAccountConverter = clientSubscriberAccountConverter;
	}

}
