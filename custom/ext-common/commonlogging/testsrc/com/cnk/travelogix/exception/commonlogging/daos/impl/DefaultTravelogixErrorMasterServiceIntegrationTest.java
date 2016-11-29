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
package com.cnk.travelogix.exception.commonlogging.daos.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import com.cnk.travelogix.exception.commonlogging.TravelogixErrorMasterService;
import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;


@IntegrationTest
public class DefaultTravelogixErrorMasterServiceIntegrationTest extends ServicelayerTransactionalTest
{

	@Resource
	private TravelogixErrorMasterService travelogixErrorMasterService;
	@Resource
	private ModelService modelService;

	private TravelogixErrorMasterModel travelogixErrorMasterModel;
	private final static String TravelogixErrorMaster_CODE = "ERROR004";
	private final static String TravelogixErrorMaster_PRESENTATION_MSG = "TEST";

	@Before
	public void setUp()
	{
		// This instance of a TravelogixErrorMasterModel will be used by the tests
		travelogixErrorMasterModel = new TravelogixErrorMasterModel();
		travelogixErrorMasterModel.setErrorCode(TravelogixErrorMaster_CODE);
		travelogixErrorMasterModel.setPresentationMsg(TravelogixErrorMaster_PRESENTATION_MSG);
	}

	@Test(expected = UnknownIdentifierException.class)
	public void testFailBehavior()
	{
		try
		{
			travelogixErrorMasterService.getTravelogixErrorMasterForCode(TravelogixErrorMaster_CODE);
		}
		catch (AmbiguousIdentifierException | UnknownException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This test tests and demonstrates that the Service's getAllTravelogixErrorMaster method calls the DAOs'
	 * getAllTravelogixErrorMaster method and returns the data it receives from it.
	 */
	@Test
	public void testTravelogixErrorMasterService()
	{
		List<TravelogixErrorMasterModel> TravelogixErrorMasterModels = travelogixErrorMasterService.getTravelogixErrorMasters();
		final int size = TravelogixErrorMasterModels.size();

		modelService.save(travelogixErrorMasterModel);

		TravelogixErrorMasterModels = travelogixErrorMasterService.getTravelogixErrorMasters();
		assertEquals(size + 1, TravelogixErrorMasterModels.size());
		assertEquals("Unexpected TravelogixErrorMaster found", travelogixErrorMasterModel,
				TravelogixErrorMasterModels.get(TravelogixErrorMasterModels.size() - 1));

		TravelogixErrorMasterModel persistedTravelogixErrorMasterModel = null;
		try
		{
			persistedTravelogixErrorMasterModel = travelogixErrorMasterService
					.getTravelogixErrorMasterForCode(TravelogixErrorMaster_CODE);
		}
		catch (AmbiguousIdentifierException | UnknownException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull("No TravelogixErrorMaster found", persistedTravelogixErrorMasterModel);
		assertEquals("Different TravelogixErrorMaster found", travelogixErrorMasterModel, persistedTravelogixErrorMasterModel);
	}

}