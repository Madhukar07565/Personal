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
package com.cnk.travelogix.exception.commonlogging.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;
import com.cnk.travelogix.exception.commonlogging.daos.TravelogixErrorMasterDAO;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;


/**
 * This class belongs to the Source Code Trail documented at https://wiki.hybris.com/display/pm/Source+Code+Tutorial
 *
 * This test file tests and demonstrates the behavior of the TravelogixErrorMasterService's methods
 * getAllTravelogixErrorMaster, getTravelogixErrorMaster and saveTravelogixErrorMaster.
 *
 * We already have a separate file for testing the TravelogixErrorMaster DAO, and we do not want this test to implicitly
 * test that in addition to the TravelogixErrorMasterService. This test therefore mocks out the TravelogixErrorMaster
 * DAO leaving us to test the Service in isolation, whose behavior should be simply to wraps calls to the DAO: forward
 * calls to it, and passing on the results it receives from it.
 */
@UnitTest
public class DefaultTravelogixErrorMasterServiceUnitTest
{
	private DefaultTravelogixErrorMasterService travelogixErrorMasterService;
	private TravelogixErrorMasterDAO travelogixErrorMasterDAO;

	private TravelogixErrorMasterModel travelogixErrorMasterModel;
	private final static String TravelogixErrorMaster_CODE = "ERROR004";
	private final static String TravelogixErrorMaster_PRESENTATION_MSG = "TEST";

	@Before
	public void setUp()
	{
		// We will be testing TravelogixErrorMasterServiceImpl - an implementation of TravelogixErrorMasterService
		travelogixErrorMasterService = new DefaultTravelogixErrorMasterService();
		// So as not to implicitly also test the DAO, we will mock out the DAO using Mockito
		travelogixErrorMasterDAO = mock(TravelogixErrorMasterDAO.class);
		// and inject this mocked DAO into the TravelogixErrorMasterService
		travelogixErrorMasterService.setTravelogixErrorMasterDAO(travelogixErrorMasterDAO);

		// This instance of a TravelogixErrorMasterModel will be used by the tests
		travelogixErrorMasterModel = new TravelogixErrorMasterModel();
		travelogixErrorMasterModel.setErrorCode(TravelogixErrorMaster_CODE);
		travelogixErrorMasterModel.setPresentationMsg(TravelogixErrorMaster_PRESENTATION_MSG);
	}

	/**
	 * This test tests and demonstrates that the Service's getAllTravelogixErrorMasters method calls the DAOs'
	 * getTravelogixErrorMasters method and returns the data it receives from it.
	 */
	@Test
	public void testGetAllTravelogixErrorMasters()
	{
		// We construct the data we would like the mocked out DAO to return when called
		final List<TravelogixErrorMasterModel> TravelogixErrorMasterModels = Arrays.asList(travelogixErrorMasterModel);
		//Use Mockito and compare results
		when(travelogixErrorMasterDAO.findTravelogixErrorMasters()).thenReturn(TravelogixErrorMasterModels);
		// Now we make the call to TravelogixErrorMasterService's getTravelogixErrorMasters() which we expect to call the DAOs' findTravelogixErrorMasters() method
		final List<TravelogixErrorMasterModel> result = travelogixErrorMasterService.getTravelogixErrorMasters();
		// We then verify that the results returned from the service match those returned by the mocked-out DAO
		assertEquals("We should find one", 1, result.size());
		assertEquals("And should equals what the mock returned", travelogixErrorMasterModel, result.get(0));
	}

	@Test
	public void testGetTravelogixErrorMaster()
	{
		// Tell Mockito we expect a call to the DAO's getTravelogixErrorMaster(), and, if it occurs, Mockito should return TravelogixErrorMasterModel instance
		when(travelogixErrorMasterDAO.findTravelogixErrorMasterByCode(TravelogixErrorMaster_CODE))
				.thenReturn(Collections.singletonList(travelogixErrorMasterModel));
		// We make the call to the Service's getTravelogixErrorMasterForCode() which we expect to call the DAO's findTravelogixErrorMastersByCode()
		TravelogixErrorMasterModel result = null;
		try
		{
			result = travelogixErrorMasterService.getTravelogixErrorMasterForCode(TravelogixErrorMaster_CODE);
		}
		catch (AmbiguousIdentifierException | UnknownException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}
		// We then verify that the result returned from the Service is the same as that returned from the DAO
		assertEquals("TravelogixErrorMaster should equals() what the mock returned", travelogixErrorMasterModel, result);
	}
}
