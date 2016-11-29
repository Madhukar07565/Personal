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
package com.cnk.travelogix.operations.services;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.operations.data.ReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationSearchParameterData;


/**
 * This Service Class used for Reconfirmation config master.
 *
 * @author C5244543
 */
public interface TravelogixReconfirmationConfigService
{
	SearchPageData<ReconfirmationConfigModel> getAllReconfirmationConfigs(
			final ReconfirmationSearchParameterData reconfirmationSearchParameterData, final PageableData pageableData);

	ReconfirmationConfigModel getReconfirmationConfigForCode(final String code);

	ReconfirmationConfigModel addReconfirmationConfigRecord(ReconfirmationConfigData configData,
			ReconfirmationConfigModel reconfirmationConfigModel);
}
