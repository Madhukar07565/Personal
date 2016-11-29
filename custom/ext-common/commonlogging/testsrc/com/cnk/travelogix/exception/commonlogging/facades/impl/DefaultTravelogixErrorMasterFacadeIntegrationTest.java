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
package com.cnk.travelogix.exception.commonlogging.facades.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import com.cnk.travelogix.exception.commonlogging.aop.Auditable;
import com.cnk.travelogix.exception.commonlogging.aop.Auditable.AuditingActionType;
import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;
import com.cnk.travelogix.exception.commonlogging.data.TravelogixErrorMasterData;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;
import com.cnk.travelogix.exception.commonlogging.facades.TravelogixErrorMasterFacade;


/**
 * This test file tests and demonstrates the behavior of the TravelogixErrorMasterFacade's methods
 * getAllTravelogixErrorMasters and getTravelogixErrorMaster.
 */
public class DefaultTravelogixErrorMasterFacadeIntegrationTest extends ServicelayerTransactionalTest
{
	@Resource
	private TravelogixErrorMasterFacade travelogixErrorMasterFacade;

	@Resource
	private ModelService modelService;

	private TravelogixErrorMasterModel travelogixErrorMasterModel;
	/** Name of test TravelogixErrorMaster. */
	private static final String TravelogixErrorMaster_CODE = "ERROR004";

	/** Capacity of test TravelogixErrorMaster. */
	private static final String TravelogixErrorMaster_PRESENTATION_MSG = "TEST";

	@Before
	public void setUp()
	{
		// This instance of a TravelogixErrorMasterModel will be used by the tests
		System.out.println("Inside TravelogixErrorMasterModel SetUp method ...........");
		travelogixErrorMasterModel = new TravelogixErrorMasterModel();
		travelogixErrorMasterModel.setErrorCode(TravelogixErrorMaster_CODE);
		travelogixErrorMasterModel.setPresentationMsg(TravelogixErrorMaster_PRESENTATION_MSG);
		travelogixErrorMasterModel.setOperationRequired(Boolean.TRUE);
		modelService.save(travelogixErrorMasterModel);

		travelogixErrorMasterModel.setErrorCode("ERROR003");
		travelogixErrorMasterModel.setPresentationMsg(TravelogixErrorMaster_PRESENTATION_MSG);
		travelogixErrorMasterModel.setOperationRequired(Boolean.TRUE);
		modelService.save(travelogixErrorMasterModel);
	}

	/**
	 * Tests exception behavior by getting a TravelogixErrorMaster which doesn't exist
	 */
	@Test
	@Auditable(actionType = AuditingActionType.USER_LOGGED_IN)
	public void testInvalidParameter()
	{
		final TravelogixErrorMasterData travelogixErrorMasterData = travelogixErrorMasterFacade
				.getTravelogixErrorMaster(TravelogixErrorMaster_CODE);
		if (travelogixErrorMasterData != null)
		{
			try
			{
				throw new UnknownException("TESTERROR", "test testNullParameter");
			}
			catch (final UnknownException e)
			{
				// YTODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}

	/**
	 * Tests exception behavior by passing in a null parameter
	 *
	 * @throws Exception
	 */
	@Test(expected = UnknownException.class)
	public void testNullParameter() throws Exception
	{
		travelogixErrorMasterFacade.getTravelogixErrorMaster(null);

	}

	/**
	 * Tests and demonstrates the Facade's methods
	 */
	@Test
	public void testTravelogixErrorMasterFacade()
	{
		List<TravelogixErrorMasterData> travelogixErrorMasterListData = travelogixErrorMasterFacade.getTravelogixErrorMasters();
		assertNotNull(travelogixErrorMasterListData);
		final int size = travelogixErrorMasterListData.size();
		modelService.save(travelogixErrorMasterModel);

		travelogixErrorMasterListData = travelogixErrorMasterFacade.getTravelogixErrorMasters();
		assertNotNull(travelogixErrorMasterListData);
		assertEquals(size + 1, travelogixErrorMasterListData.size());
		//assertEquals(TravelogixErrorMaster_CODE, travelogixErrorMasterListData.get(size).getName());
		assertEquals(TravelogixErrorMaster_PRESENTATION_MSG.toString(),
				travelogixErrorMasterListData.get(size).getPresentationMessage());

		final TravelogixErrorMasterData persistedTravelogixErrorMasterData = travelogixErrorMasterFacade
				.getTravelogixErrorMaster(TravelogixErrorMaster_CODE);
		assertNotNull(persistedTravelogixErrorMasterData);
		assertEquals(TravelogixErrorMaster_CODE, persistedTravelogixErrorMasterData.getName());
		assertEquals(TravelogixErrorMaster_PRESENTATION_MSG.toString(),
				persistedTravelogixErrorMasterData.getPresentationMessage());
	}
}

