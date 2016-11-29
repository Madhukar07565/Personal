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

import de.hybris.platform.catalog.model.CompanyModel;

import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

import com.cnk.travelogix.ccintegrationfacade.CompanyCCIntegrationFacade;
import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationErrorCodes;
import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationException;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ResponseStatus;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccount;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountOperationResponseData;


/**
 * Create subscriber & external account for Company.
 */
public class DefaultCompanyCCIntegrationFacade extends AbstractCCIntegrationFacade implements CompanyCCIntegrationFacade
{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(DefaultCompanyCCIntegrationFacade.class);

	/** The subscriber account converter. */
	private Converter<CompanyModel, SubscriberAccount> companySubscriberAccountConverter;

	/**
	 * Creates the company account.
	 *
	 * @param pCompanyModel
	 *           the company model
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */
	@Override
	public void createCompanyAccount(final CompanyModel pCompanyModel) throws CCIntegrationException
	{
		LOGGER.debug("DefaultCompanyCCIntegrationFacade : createCompanyAccount() : Entering.");
		try
		{
			final SubscriberAccountOperationResponseData lSubscriberAccountOperationResponseData = super.createSubscriberAccount(
					pCompanyModel, getCompanySubscriberAccountConverter());

			if (lSubscriberAccountOperationResponseData != null
					&& lSubscriberAccountOperationResponseData.getStatus().equals(ResponseStatus.RETURN))
			{
				//	RETRIEVE SUBSCRIBER ACC ID OR REF NUMMER AND SAVE TO MODEL
				//pCompanyModel

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
			LOGGER.debug("DefaultCompanyCCIntegrationFacade : createCompanyAccount() : Exiting.");
		}
	}

	/**
	 * Gets the company subscriber account converter.
	 *
	 * @return the companySubscriberAccountConverter
	 */
	public Converter<CompanyModel, SubscriberAccount> getCompanySubscriberAccountConverter()
	{
		return companySubscriberAccountConverter;
	}

	/**
	 * Sets the company subscriber account converter.
	 *
	 * @param companySubscriberAccountConverter
	 *           the companySubscriberAccountConverter to set
	 */
	public void setCompanySubscriberAccountConverter(
			final Converter<CompanyModel, SubscriberAccount> companySubscriberAccountConverter)
	{
		this.companySubscriberAccountConverter = companySubscriberAccountConverter;
	}
}
