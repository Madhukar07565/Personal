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
package com.cnk.travelogix.operations.facades;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

import java.util.List;

import com.cnk.travelogix.operations.data.ActivateParameterData;
import com.cnk.travelogix.operations.data.EnumerationDto;
import com.cnk.travelogix.operations.data.ReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationSearchParameterData;


/**
 * @author C5244543
 */
public interface TravelogixReconfirmationConfigFacade
{
	SearchPageData<ReconfirmationConfigData> getAllReconfirmationConfigs(
			final ReconfirmationSearchParameterData reconfirmationSearchParameterData, final PageableData pageableData);

	List<EnumerationDto> getConfirmationFor();

	List<EnumerationDto> getRecofirmationToBeSentTo();

	List<EnumerationDto> getRecofirmationCutOffType();

	ReconfirmationConfigData getReconfirmationConfigForCode(final String code);

	boolean deleteReconfirmationRecordForCode(final String code);

	boolean activateReconfirmationRecord(final ActivateParameterData activateData);

	boolean releaseLockReconfirmationRecord(final String code);

	boolean lockReconfirmationRecord(String code);

	String addRecofirmationRecord(ReconfirmationConfigData configData);

	String updateReconfirmationRecordForCode(ReconfirmationConfigData configData);

	boolean approvalReconfirmationRecord(final String code, final String remark);

	boolean rejectReconfirmationRecord(final String code, final String remark);

	boolean isReconfirmationApprover();

	boolean isReconfirmationCreator();

}
