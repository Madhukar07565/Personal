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
package com.cnk.travelogix.operations.facades.cms;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;

import java.util.Map;

/**
 * @author 
 * 
 */
public interface TravelogixCmsComponentFacade
{
	/**
	 * @param compId
	 * @param check
	 *           that indicates user performs check/uncheck action
	 * @return success or fail
	 */
	public String saveComponentToUserGroup(final String compId, final boolean check);

	/**
	 * @return all the home page components along with a flag indicating user belongs to a group or not
	 */
	public Map<AbstractCMSComponentModel, String> getAllComponentsOnHomepage();
}
