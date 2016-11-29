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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cnk.travelogix.exception.commonlogging.TravelogixErrorMasterService;
import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;
import com.cnk.travelogix.exception.commonlogging.data.TravelogixErrorMasterData;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;


public class DefaultTravelogixErrorMasterFacadeUnitTest
{
	private DefaultTravelogixErrorMasterFacade TravelogixErrorMasterFacade;

	private TravelogixErrorMasterService TravelogixErrorMasterService;

	private final static String TravelogixErrorMaster_CODE = "ERROR004";
	private final static String TravelogixErrorMaster_PRESENTATION_MSG = "TEST";

	// Convenience method for returning a list of TravelogixErrorMaster
	private List<TravelogixErrorMasterModel> dummyDataTravelogixErrorMasterList()
	{
		final TravelogixErrorMasterModel wembley = new TravelogixErrorMasterModel();
		wembley.setErrorCode(TravelogixErrorMaster_CODE);
		wembley.setPresentationMsg(TravelogixErrorMaster_PRESENTATION_MSG);
		final List<TravelogixErrorMasterModel> TravelogixErrorMasters = new ArrayList<TravelogixErrorMasterModel>();
		TravelogixErrorMasters.add(wembley);
		return TravelogixErrorMasters;
	}

	// Convenience method for returning a TravelogixErrorMaster with code and capacity set for wembley
	private TravelogixErrorMasterModel dummyDataTravelogixErrorMaster()
	{
		final TravelogixErrorMasterModel wembley = new TravelogixErrorMasterModel();
		wembley.setErrorCode(TravelogixErrorMaster_CODE);
		wembley.setPresentationMsg(TravelogixErrorMaster_PRESENTATION_MSG);
		return wembley;
	}

	@Before
	public void setUp()
	{
		// We will be testing the POJO DefaultTravelogixErrorMasterFacade - the implementation of the TravelogixErrorMasterFacade interface.
		TravelogixErrorMasterFacade = new DefaultTravelogixErrorMasterFacade();

		/**
		 * The facade is expected to make calls to an implementation of TravelogixErrorMasterService but in this test we
		 * want to verify the correct behaviour of DefaultTravelogixErrorMasterFacade itself and not also implicitly test
		 * the behaviour of a TravelogixErrorMasterService. In fact as of writing this class, we do only have the
		 * interface TravelogixErrorMasterService and no implementation. This requires that we mock out the
		 * TravelogixErrorMasterService interface. There are several strong arguments for following this practice:
		 *
		 * If we were to include a real implementation of TravelogixErrorMasterService rather than mocking it out..
		 *
		 * 1) we will not get "false failures" in DefaultTravelogixErrorMasterFacade due to errors in the
		 * TravelogixErrorMasterService implementation. Such errors should be caught in tests that are focusing on
		 * TravelogixErrorMasterService instead.
		 *
		 * 2) The condition could arise where an error in the facade gets hidden by a complimentary error in the
		 * TravelogixErrorMasterService implementation - resulting in a "false positive".
		 *
		 * By mocking out the interface TravelogixErrorMasterService..
		 *
		 * 3) we do not actually need an implementation of it. This therefore helps us to focus our tests on this POJO
		 * before having to implement other POJOs on which it depends - allowing us to write tests early.
		 *
		 * 4) by focusing on the behaviour of the facade and the interfaces it uses, we are forced to focus also on the
		 * those interface, improving them before writing their implementation.
		 *
		 *
		 * Therefore we create a mock of the TravelogixErrorMasterService in the next line.
		 */
		TravelogixErrorMasterService = mock(TravelogixErrorMasterService.class);
		// We then wire this service into the TravelogixErrorMasterFacade implementation.
		TravelogixErrorMasterFacade.setTravelogixErrorMasterService(TravelogixErrorMasterService);
	}

	/**
	 * The aim of this test is to test that:
	 *
	 * 1) The facade's method getTravelogixErrorMasters makes a call to the TravelogixErrorMasterService's method
	 * getTravelogixErrorMasters
	 *
	 * 2) The facade then correctly wraps TravelogixErrorMasterModels that are returned to it from the
	 * TravelogixErrorMasterService's getTravelogixErrorMasters into Data Transfer Objects of type
	 * TravelogixErrorMasterData.
	 */
	@Test
	public void testGetAllTravelogixErrorMasters()
	{
		/**
		 * We instantiate an object that we would like to be returned to TravelogixErrorMasterFacade when the mocked out
		 * TravelogixErrorMasterService's method getTravelogixErrorMasters is called. This will be a list of two
		 * TravelogixErrorMasterModels.
		 */
		final List<TravelogixErrorMasterModel> TravelogixErrorMasters = dummyDataTravelogixErrorMasterList();
		// create wembley TravelogixErrorMaster for the assert comparison
		final TravelogixErrorMasterModel wembley = dummyDataTravelogixErrorMaster();
		// We tell Mockito we expect TravelogixErrorMasterService's method getTravelogixErrorMasters to be called, and that when it is, TravelogixErrorMasters should be returned
		when(TravelogixErrorMasterService.getTravelogixErrorMasters()).thenReturn(TravelogixErrorMasters);

		/**
		 * We now make the call to TravelogixErrorMasterFacade's getTravelogixErrorMasters. If within this method a call
		 * is made to TravelogixErrorMasterService's getTravelogixErrorMasters, Mockito will return the
		 * TravelogixErrorMasters instance to it. Mockito will also remember that the call was made.
		 */
		final List<TravelogixErrorMasterData> dto = TravelogixErrorMasterFacade.getTravelogixErrorMasters();
		// We now check that dto is a DTO version of TravelogixErrorMasters..
		assertNotNull(dto);
		assertEquals(TravelogixErrorMasters.size(), dto.size());
		assertEquals(wembley.getErrorCode(), dto.get(0).getName());
	}

	@Test
	public void testGetTravelogixErrorMaster()
	{
		/**
		 * We instantiate an object that we would like to be returned to TravelogixErrorMasterFacade when the mocked out
		 * TravelogixErrorMasterService's method getTravelogixErrorMaster is called. This will be the
		 * TravelogixErrorMasterModel for wembley TravelogixErrorMaster.
		 */
		// create wembley TravelogixErrorMaster
		final TravelogixErrorMasterModel wembley = dummyDataTravelogixErrorMaster();

		// We tell Mockito we expect TravelogixErrorMasterService's method getTravelogixErrorMasterForCode to be called, and that when it is, wembley should be returned
		try
		{
			when(TravelogixErrorMasterService.getTravelogixErrorMasterForCode("wembley")).thenReturn(wembley);
		}
		catch (AmbiguousIdentifierException | UnknownException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}

		/**
		 * We now make the call to TravelogixErrorMasterFacade's getTravelogixErrorMaster. If within this method a call is
		 * made to TravelogixErrorMasterService's getTravelogixErrorMaster, Mockito will return the wembley instance to
		 * it. Mockito will also remember that the call was made.
		 */
		final TravelogixErrorMasterData TravelogixErrorMaster = TravelogixErrorMasterFacade.getTravelogixErrorMaster("wembley");
		// We now check that TravelogixErrorMaster is a correct DTO representation of the ServiceModel wembley
		assertEquals(wembley.getErrorCode(), TravelogixErrorMaster.getName());
	}

}