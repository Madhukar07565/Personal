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
package com.cnk.travelogix.operations.daos.impl;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.user.daos.impl.DefaultUserDao;

import java.util.List;

import com.cnk.travelogix.operations.daos.OperationUserDao;


/**
 *
 */
public class DefaultOperationUserDao extends DefaultUserDao implements OperationUserDao
{
	private final String QUERY_FIND_GROUP_MEMBERS = "SELECT {PK} from {Employee}";

	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<EmployeeModel> findAllEmployee()
	{
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(QUERY_FIND_GROUP_MEMBERS);
		final SearchResult<EmployeeModel> result = getFlexibleSearchService().search(fQuery);
		return result.getResult();
	}

	/**
	 * @return the flexibleSearchService
	 */
	@Override
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	@Override
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

}
