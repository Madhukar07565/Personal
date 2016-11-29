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
package com.cnk.travelogix.operations.services.cms;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.core.model.user.UserGroupModel;

/**
 *@author C5244550
 *This service interface is for performing CMSComponent related functionalities. 
 */
public interface TravelogixCmsComponentsService
{
	/**
	 * @param uid
	 * @return AbstractCMSComponentModel if component exists for given uid else null
	 */
	public AbstractCMSComponentModel findCmsComponent(final String uid);
	
	/**
	 * @param compId
	 * @return UserGroupModel, returns UserGroupModel for a ComponentId on current user
	 */
	public UserGroupModel findUserGroupForCmsComp(final String compId);
}
