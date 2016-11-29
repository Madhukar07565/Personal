/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package com.cnk.travelogix.common.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.cnk.travelogix.common.fulfilmentprocess.constants.CommonFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class CommonFulfilmentProcessManager extends GeneratedCommonFulfilmentProcessManager
{
	public static final CommonFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CommonFulfilmentProcessManager) em.getExtension(CommonFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
