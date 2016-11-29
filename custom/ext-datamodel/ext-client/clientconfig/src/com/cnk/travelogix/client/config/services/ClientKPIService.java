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
package com.cnk.travelogix.client.config.services;

import com.cnk.travelogix.client.config.core.model.KPIInfoModel;


/**
 * To generate kpiId
 */
public interface ClientKPIService
{
	public void generateKPIInfoId(final KPIInfoModel kpiinfomodel);

}
