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

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.exception.commonlogging.TravelogixErrorMasterService;
import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;
import com.cnk.travelogix.exception.commonlogging.data.TravelogixErrorMasterData;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;
import com.cnk.travelogix.exception.commonlogging.facades.TravelogixErrorMasterFacade;


public class DefaultTravelogixErrorMasterFacade implements TravelogixErrorMasterFacade
{
	private TravelogixErrorMasterService travelogixErrorMasterService;

	@Override
	public List<TravelogixErrorMasterData> getTravelogixErrorMasters()
	{
		final List<TravelogixErrorMasterModel> travelogixErrorMasterModels = travelogixErrorMasterService
				.getTravelogixErrorMasters();
		final List<TravelogixErrorMasterData> travelogixErrorMasterFacadeData = new ArrayList<TravelogixErrorMasterData>();

		for (final TravelogixErrorMasterModel sm : travelogixErrorMasterModels)
		{
			final TravelogixErrorMasterData sfd = new TravelogixErrorMasterData();
			sfd.setName(sm.getErrorCode());
			sfd.setPresentationMessage(sm.getPresentationMsg());
			travelogixErrorMasterFacadeData.add(sfd);
		}
		return travelogixErrorMasterFacadeData;
	}

	@Override
	public TravelogixErrorMasterData getTravelogixErrorMaster(final String name)
	{
		TravelogixErrorMasterModel travelogixErrorMaster = null;
		if (name != null)
		{
			try
			{
				travelogixErrorMaster = travelogixErrorMasterService.getTravelogixErrorMasterForCode(name);
			}
			catch (AmbiguousIdentifierException | UnknownException e)
			{
				// YTODO Auto-generated catch block
				e.printStackTrace();
			}
			if (travelogixErrorMaster == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("TravelogixErrorMaster with name " + name + " not found.");
		}

		// Now we can create the TravelogixErrorMasterData transfer object
		final TravelogixErrorMasterData travelogixErrorMasterData = new TravelogixErrorMasterData();
		travelogixErrorMasterData.setName(travelogixErrorMaster.getErrorCode());
		travelogixErrorMasterData.setPresentationMessage(travelogixErrorMaster.getPresentationMsg());
		return travelogixErrorMasterData;
	}

	@Required
	public void setTravelogixErrorMasterService(final TravelogixErrorMasterService TravelogixErrorMasterService)
	{
		this.travelogixErrorMasterService = TravelogixErrorMasterService;
	}
}