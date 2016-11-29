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
package com.cnk.travelogix.operations.services.cms.impl;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.cms2.model.restrictions.AbstractRestrictionModel;
import de.hybris.platform.cms2.model.restrictions.CMSInverseRestrictionModel;
import de.hybris.platform.cms2.model.restrictions.CMSUserGroupRestrictionModel;
import de.hybris.platform.core.model.user.UserGroupModel;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.operations.daos.cms.TravelogixCmsComponentsDao;
import com.cnk.travelogix.operations.services.cms.TravelogixCmsComponentsService;

/**
 *@author C5244550
 *This service class is for performing CMSComponents related functionalities.
 */
public class TravelogixCmsComponentsServiceImpl implements TravelogixCmsComponentsService
{

	private static final Logger LOG = Logger.getLogger(TravelogixCmsComponentsServiceImpl.class);
	
	@Resource(name="travelogixCmsComponentsDao")
	private TravelogixCmsComponentsDao travelogixCmsComponentsDao;
	
	/**
	 * Gets AbstractCMSComponentModel for a given uid.
	 * @param uid 
	 * @return AbstractCMSComponentModel if component exists for a given uid else null.
	 */
	@Override
	public AbstractCMSComponentModel findCmsComponent(final String uid)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("from service, find CMS component for comp id: " + uid);
		}
		//call dao to get AbstractComponentModel for given uid
		return travelogixCmsComponentsDao.findCmsComponent(uid);
	}

	/**
	 * To find out UserGroup for a compId
	 * @param compId , input to find out UserGroup 
	 * @return UserGroupModel , UserGroupModel if group exists for compId else null
	 */
	@Override
	public UserGroupModel findUserGroupForCmsComp(final String compId)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("from service, findUserGroupForCmsComp method to findUserGroup for ComponentId :"+compId);
		}
		//call to get AbstractCMSComponentModel for compId
		final AbstractCMSComponentModel cmsComponent = findCmsComponent(compId);
		UserGroupModel userGroup = null;
		if (null != cmsComponent)
		{
			final CMSInverseRestrictionModel invRestrictionModel = getInverseRestriction(cmsComponent);
			if (null != invRestrictionModel)
			{
				userGroup = getUserGroupModel(invRestrictionModel);
			}
		}
		return userGroup;
	}
	
	/**
	 * Gets InverseRestriction for given component.
	 * @param cmsComponent
	 * @return CMSInverseRestriction
	 */
	protected CMSInverseRestrictionModel getInverseRestriction(final AbstractCMSComponentModel cmsComponent)
	{
		//get inverse restriction 
		CMSInverseRestrictionModel invRestrictionModel = null;
		for (AbstractRestrictionModel absRestrictionModel : cmsComponent.getRestrictions())
		{
			if (absRestrictionModel instanceof CMSInverseRestrictionModel)
			{
				//inverse restriction
				invRestrictionModel = (CMSInverseRestrictionModel) absRestrictionModel;
			}
		}
		return invRestrictionModel;
	}
	
	/**
	 * Gets UserGroup for given inverse restriction.
	 * @param invRestrictionModel
	 * @return userGroup
	 */
	protected  UserGroupModel getUserGroupModel(final CMSInverseRestrictionModel invRestrictionModel)
	{
		UserGroupModel userGroup = null;
		//get CMSUserGroupRestriction from InverseRestriction
		final AbstractRestrictionModel abstractResModel = invRestrictionModel.getOriginalRestriction();
		if (abstractResModel instanceof CMSUserGroupRestrictionModel)
		{
			LOG.info("CMSUserGroupRestriction with");
			final CMSUserGroupRestrictionModel cmsUserGroupResModel = (CMSUserGroupRestrictionModel) abstractResModel;
			userGroup = cmsUserGroupResModel.getUserGroups().iterator().next();
		}
		return userGroup;
	}

}
