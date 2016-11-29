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
package com.cnk.travelogix.operation.reconfirmation.dao;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

import java.util.List;

import com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.model.ClientReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationtraveldestination.model.ReconfirmationTravelDestinationModel;
import com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.model.SupplierReconfirmationConfigModel;
import com.cnk.travelogix.operations.data.ClientReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationSearchParameterData;
import com.cnk.travelogix.operations.data.ReconfirmationTravelDestinationData;
import com.cnk.travelogix.operations.data.SupplierReconfirmationConfigData;


/**
 * @author C5244543
 */
public interface TravelogixReconfirmationConfigDao
{
	ReconfirmationConfigModel getReconfirmationConfigForCode(final String code);

	SearchPageData<ReconfirmationConfigModel> getAllReconfirmationConfigs(
			final ReconfirmationSearchParameterData reconfirmationSearchParameterData, final PageableData pageableData);

	List<ReconfirmationConfigModel> allReconfirmationRecords();

	List<ReconfirmationConfigModel> getAllRecords(final ReconfirmationConfigModel configModel);

	List<SupplierReconfirmationConfigModel> findSupplierConfigurations(final SupplierReconfirmationConfigData configData);

	List<ClientReconfirmationConfigModel> findClientConfigurations(final ClientReconfirmationConfigData configData);

	List<ReconfirmationTravelDestinationModel> findTravelDestinations(final ReconfirmationTravelDestinationData configData);
}
