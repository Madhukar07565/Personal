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
package com.cnk.travelogix.ccintegrationfacade.consumer;

import de.hybris.platform.catalog.model.CompanyModel;

import org.apache.log4j.Logger;

import com.cnk.travelogix.ccintegrationfacade.CCIntegrationContext;
import com.cnk.travelogix.ccintegrationfacade.dto.CCIntegrationDto;
import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationException;
import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;



/**
 * The Class CCIntegrationConsumer.
 */
public class CCIntegrationConsumer
{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(CCIntegrationConsumer.class);

	/**
	 * Consume supplier facade.
	 *
	 * @param pCcIntegrationDto
	 *           the cc integration req res object
	 * @throws CCIntegrationException
	 */
	private static void consumeSupplierFacade(final CCIntegrationDto pCcIntegrationDto) throws CCIntegrationException
	{
		LOGGER.debug("CCIntegrationConsumer : consumeSupplierFacade() : Entering.");

		final SupplierModel lSupplierModel = (SupplierModel) pCcIntegrationDto.getReq();
		CCIntegrationContext.getSupplierIntegrationFacade().createSupplierAccount(lSupplierModel);

		LOGGER.debug("CCIntegrationConsumer : consumeSupplierFacade() : Exiting.");

	}


	/**
	 * Consume company facade.
	 *
	 * @param pCcIntegrationDto
	 *           the cc integration req res object
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */
	private static void consumeCompanyFacade(final CCIntegrationDto pCcIntegrationDto) throws CCIntegrationException
	{
		LOGGER.debug("CCIntegrationConsumer : consumeCompanyFacade() : Entering.");

		final CompanyModel lCompanyModel = (CompanyModel) pCcIntegrationDto.getReq();
		CCIntegrationContext.getCompanyIntegrationFacade().createCompanyAccount(lCompanyModel);

		LOGGER.debug("CCIntegrationConsumer : consumeCompanyFacade() : Exiting.");

	}



	/**
	 * Consume client facade.
	 *
	 * @param pCcIntegrationDto
	 *           the cc integration dto
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */
	private static void consumeClientFacade(final CCIntegrationDto pCcIntegrationDto) throws CCIntegrationException
	{

		LOGGER.debug("CCIntegrationConsumer : consumeClientFacade() : Entering.");

		final TravelogixB2BUnitModel travelogixClientModel = (TravelogixB2BUnitModel) pCcIntegrationDto.getReq();
		CCIntegrationContext.getClientIntegrationFacade().createClientAccount(travelogixClientModel);

		LOGGER.debug("CCIntegrationConsumer : consumeClientFacade() : Exiting.");
	}

	/**
	 * Consume facade.
	 *
	 * @param pCcIntegrationDto
	 *           the cc integration dto
	 * @return the CC integration dto
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */

	public static CCIntegrationDto consumeFacade(final CCIntegrationDto pCcIntegrationDto) throws CCIntegrationException
	{
		LOGGER.debug("CCIntegrationConsumer : consumeFacade() : Entering.");

		if (pCcIntegrationDto.getReq() instanceof SupplierModel)
		{
			LOGGER.debug("CCIntegrationConsumer : consumeFacade() : Calling Suppler Facade.");
			consumeSupplierFacade(pCcIntegrationDto);
		}
		else if (pCcIntegrationDto.getReq() instanceof CompanyModel)
		{
			LOGGER.debug("CCIntegrationConsumer : consumeFacade() : Calling Company facade.");
			consumeCompanyFacade(pCcIntegrationDto);
		}
		else if (pCcIntegrationDto.getReq() instanceof TravelogixB2BUnitModel)
		{
			LOGGER.debug("CCIntegrationConsumer : consumeFacade() : Calling Client facade.");
			consumeClientFacade(pCcIntegrationDto);
		}

		LOGGER.debug("CCIntegrationConsumer : consumeFacade() : Exiting.");
		return pCcIntegrationDto;
	}

}
