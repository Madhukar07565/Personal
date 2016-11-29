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
import static org.junit.Assert.assertTrue;

import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.cnk.travelogix.exception.commonlogging.daos.TravelogixErrorMasterDAO;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;


/**
 * This class belongs to the Source Code Trail documented at https://wiki.hybris.com/display/pm/Source+Code+Tutorial
 *
 * The purpose of this test is to illustrate DAO best practices and behaviour.
 *
 * The DAO logic is factored into a separate POJO. Stepping into these will illustrate how to write and execute
 * FlexibleSearchQueries - the basis on which DAOs operate.
 *
 * @see "https://wiki.hybris.com/display/pm/Trail+-+DAOs"
 */

public class DefaultTravelogixErrorMasterDAOIntegrationTest extends ServicelayerTransactionalTest
{
	/** As this is an integration test, the class (object) being tested gets injected here. */
	@Resource
	private TravelogixErrorMasterDAO travelogixErrorMasterDAO;

	/** Platform's ModelService used for creation of test data. */
	@Resource
	private ModelService modelService;

	/** Name of test TravelogixErrorMaster. */
	private static final String TravelogixErrorMaster_CODE = "ERROR004";

	/** Capacity of test TravelogixErrorMaster. */
	private static final String TravelogixErrorMaster_PRESENTATION_MSG = "TEST";

	@Test
	public void travelogixErrorMasterDAOTest()
	{
		List<TravelogixErrorMasterModel> travelogixErrorMastersByCode = travelogixErrorMasterDAO
				.findTravelogixErrorMasterByCode(TravelogixErrorMaster_CODE);
		assertTrue("No TravelogixErrorMaster should be returned", travelogixErrorMastersByCode.isEmpty());

		List<TravelogixErrorMasterModel> allTravelogixErrorMasters = travelogixErrorMasterDAO.findTravelogixErrorMasters();
		final int size = allTravelogixErrorMasters.size();

		final TravelogixErrorMasterModel travelogixErrorMasterModel = new TravelogixErrorMasterModel();
		travelogixErrorMasterModel.setErrorCode(TravelogixErrorMaster_CODE);
		travelogixErrorMasterModel.setPresentationMsg(TravelogixErrorMaster_PRESENTATION_MSG);
		modelService.save(travelogixErrorMasterModel);

		allTravelogixErrorMasters = travelogixErrorMasterDAO.findTravelogixErrorMasters();
		assertEquals(size + 1, allTravelogixErrorMasters.size());
		assertEquals("Unexpected TravelogixErrorMaster found", travelogixErrorMasterModel,
				allTravelogixErrorMasters.get(allTravelogixErrorMasters.size() - 1));

		travelogixErrorMastersByCode = travelogixErrorMasterDAO.findTravelogixErrorMasterByCode(TravelogixErrorMaster_CODE);
		assertEquals("Did not find the TravelogixErrorMaster we just saved", 1, travelogixErrorMastersByCode.size());
		assertEquals("Retrieved TravelogixErrorMaster's name attribute incorrect", TravelogixErrorMaster_CODE,
				travelogixErrorMastersByCode.get(0).getErrorCode());
		assertEquals("Retrieved TravelogixErrorMaster's presentation message attribute is incorrect",
				TravelogixErrorMaster_PRESENTATION_MSG, travelogixErrorMastersByCode.get(0).getPresentationMsg());
	}

	@Test
	public void testFindTravelogixErrorMasters_EmptyStringParam()
	{
		//calling findTravelogixErrorMastersByCode() with an empty String - returns no results
		final List<TravelogixErrorMasterModel> travelogixErrorMasters = travelogixErrorMasterDAO
				.findTravelogixErrorMasterByCode("");
		assertTrue("No TravelogixErrorMaster should be returned", travelogixErrorMasters.isEmpty());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testfindTravelogixErrorMasters_NullParam()
	{
		//calling findTravelogixErrorMasterByCode with null should throw an IllegalArgumentException
		travelogixErrorMasterDAO.findTravelogixErrorMasterByCode(null); //method's return value not captured
	}

}
