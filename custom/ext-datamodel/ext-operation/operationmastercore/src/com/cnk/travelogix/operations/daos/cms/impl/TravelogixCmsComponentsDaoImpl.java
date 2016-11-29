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
package com.cnk.travelogix.operations.daos.cms.impl;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.exceptions.FlexibleSearchException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operations.daos.cms.TravelogixCmsComponentsDao;

/**
 *@author C5244550
 *This Dao Impl class is to perform daos operation on cms components.
 */
public class TravelogixCmsComponentsDaoImpl implements TravelogixCmsComponentsDao
{

	private static final Logger LOG = Logger.getLogger(TravelogixCmsComponentsDaoImpl.class);
	
	@Autowired
	private FlexibleSearchService flexibleSearchService;
	
	/**
	 * Finds CMSComponent for a component uid.
	 * @param uid
	 * @return AbstractCMSComponent 
	 */
	@Override
	public AbstractCMSComponentModel findCmsComponent(String uid)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("from findCmsComponent with uid:: " + uid);
		}
		AbstractCMSComponentModel cmsCompModel = null;
		final String queryString = OperationmastercoreConstants.QUERY_FORCMS_COMP;
		try
		{
			final FlexibleSearchQuery cmsCompQuery = new FlexibleSearchQuery(queryString);
			cmsCompQuery.addQueryParameter(OperationmastercoreConstants.COMP_ID, uid);
			final List<AbstractCMSComponentModel> cmsCompList = flexibleSearchService.<AbstractCMSComponentModel> search(cmsCompQuery).getResult();
			if (CollectionUtils.isNotEmpty(cmsCompList))
			{
				cmsCompModel = cmsCompList.get(0);
				return cmsCompModel;
			}
		}
		catch (final FlexibleSearchException e)
		{
			LOG.debug("FlexibleSearchException Exception while quering CMSComponent for a uid: " + uid + ": " + e.getMessage(), e);
		}
		catch (final Exception e)
		{
			LOG.debug("Other Exceptions while quering CMSComponent for a uid: " + uid + ": " + e.getMessage(), e);
		}
		return cmsCompModel;
	}

}
