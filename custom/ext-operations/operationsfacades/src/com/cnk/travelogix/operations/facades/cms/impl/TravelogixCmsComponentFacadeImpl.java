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
package com.cnk.travelogix.operations.facades.cms.impl;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.cms2.model.relations.ContentSlotForPageModel;
import de.hybris.platform.cms2.servicelayer.services.CMSPageService;
import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.operations.facades.cms.TravelogixCmsComponentFacade;
import com.cnk.travelogix.operations.facades.constants.OperationsfacadesConstants;
import com.cnk.travelogix.operations.services.cms.TravelogixCmsComponentsService;

/**
 * @author C5244550 
 * This facade class is for, displaying components at home page based on user preferences at profile
 * page.
 */
public class TravelogixCmsComponentFacadeImpl implements TravelogixCmsComponentFacade
{

	private static final Logger LOG = Logger.getLogger(TravelogixCmsComponentFacadeImpl.class);

	@Resource(name = "travelogixCmsComponentsService")
	private TravelogixCmsComponentsService travelogixCmsComponentsService;

	@Resource(name = "userService")
	private UserService userService;

	@Resource(name = "modelService")
	private ModelService modelService;

	@Resource(name = "cmsPageService")
	private CMSPageService cmsPageService;
	
	/**
	 * This method is called when a user check/uncheck component at edit profile section If unchecks then adds user to a
	 * group if he is not member of that group If checks then removes if he is member of that group
	 *
	 * @param compId
	 * @return returns success or fail
	 */
	@Override
	public String saveComponentToUserGroup(final String compId, final boolean check)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("in facade when user checks/uncheck comp at profile page" + compId);
		}
		String status = OperationsfacadesConstants.STATUS_FAIL;
		final UserModel userModel = userService.getCurrentUser();
		try
		{
			//find userGroup for given componentId
			final UserGroupModel userGroupModel = travelogixCmsComponentsService.findUserGroupForCmsComp(compId);

			if (null != userGroupModel)
			{
				Set<PrincipalGroupModel> userGroups = new HashSet<>();
				//check for user belongs to this group
				final boolean isMember = userService.isMemberOfGroup(userModel, userGroupModel);
				userGroups.addAll(userModel.getAllGroups());
				//add or remove user from group
				userGroups = addOrRemoveUserFromGroup(check, userGroupModel, userGroups, isMember);
				userModel.setGroups(userGroups);
				//save the userModel
				modelService.save(userModel);
				status = OperationsfacadesConstants.STATUS_SUCCESS;
			}
		}
		catch (final ModelSavingException e)
		{
			LOG.error("Exception while saving UserModel", e);
			status = OperationsfacadesConstants.STATUS_FAIL;
		}
		catch (final Exception ex)
		{
			LOG.error("Exception other than model saving" + ex.getMessage(), ex);
			status = OperationsfacadesConstants.STATUS_FAIL;
		}
		return status;
	}

	/**
	 * Gets all the components of home page
	 *
	 * @return map which holds component and flag indicating user belong to user group or not.
	 */
	@Override
	public Map<AbstractCMSComponentModel, String> getAllComponentsOnHomepage()
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("in facade from getAllComponentsOnHomepag, when user navigates to edit profile");
		}
		//get ContentPage
		final ContentPageModel contentPage = cmsPageService.getHomepage();
		Map<AbstractCMSComponentModel, String> compWithUserGroupMemberFlag = new HashMap<>();
		if (null != contentPage)
		{
			for (final ContentSlotForPageModel contentSlotForPage : contentPage.getContentSlots())
			{
				compWithUserGroupMemberFlag = putCompAndUserGroupFlagToMap(contentSlotForPage, compWithUserGroupMemberFlag);
			}
		}
		return compWithUserGroupMemberFlag;
	}
	
	/**
	 * Put the component and user group flag into the map.
	 * @param contentSlotForPage
	 * @param compWithUserGroupMemberFlag
	 * @return Map holds component and user group flag.
	 */
	private Map<AbstractCMSComponentModel, String> putCompAndUserGroupFlagToMap(final ContentSlotForPageModel contentSlotForPage,
			final Map<AbstractCMSComponentModel, String> compWithUserGroupMemberFlag)
	{
		final UserModel userModel = userService.getCurrentUser();
		for (final AbstractCMSComponentModel abstractCMSComponentModel : contentSlotForPage.getContentSlot()
				.getCmsComponents())
		{
			boolean memberFlag = false;
			String memberFlagString;
			try
			{
				final UserGroupModel userGroupModel = travelogixCmsComponentsService
						.findUserGroupForCmsComp(abstractCMSComponentModel.getUid());
				memberFlag = userService.isMemberOfGroup(userModel, userGroupModel);
			}
			catch (final NullPointerException e)
			{
				LOG.error("There is no user group for the component:::: " + abstractCMSComponentModel.getUid(), e);
			}
			catch (final Exception e) 
			{
				LOG.error("Exceptions :::: " + e.getMessage(), e);
			}
			if (memberFlag)
			{
				memberFlagString = OperationsfacadesConstants.UNCHECKED;
			}
			else
			{
				memberFlagString = OperationsfacadesConstants.CHECKED;
			}
			compWithUserGroupMemberFlag.put(abstractCMSComponentModel, memberFlagString);
		}
		return compWithUserGroupMemberFlag;
	}
	
	/**
	 * Adds or removes user to usergroup based on check boolean
	 * @param check
	 * @param userGroupModel
	 * @param userGroups
	 * @param isMember
	 * @return Set of PrincipalGroup
	 */
	protected Set<PrincipalGroupModel> addOrRemoveUserFromGroup(final boolean check, final UserGroupModel userGroupModel, 
			final Set<PrincipalGroupModel> userGroups, final boolean isMember)
	{
		if (check)
		{
			userGroups.remove(userGroupModel);
		}
		else if (!isMember) 
		{
			userGroups.add(userGroupModel);
		}
		return userGroups;
	}

}
