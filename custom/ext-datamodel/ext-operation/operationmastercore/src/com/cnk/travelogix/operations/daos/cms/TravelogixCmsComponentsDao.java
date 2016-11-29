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
package com.cnk.travelogix.operations.daos.cms;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;

/**
 *@author C5244550
 *
 */
@FunctionalInterface
public interface TravelogixCmsComponentsDao
{
	/**
	 * @param uid
	 * @return abstractCMSComponent
	 */
	public AbstractCMSComponentModel findCmsComponent(final String uid);
}
