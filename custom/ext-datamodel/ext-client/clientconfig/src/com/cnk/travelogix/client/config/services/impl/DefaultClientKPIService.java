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
package com.cnk.travelogix.client.config.services.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import com.cnk.travelogix.client.config.core.model.KPIInfoModel;
import com.cnk.travelogix.client.config.services.ClientKPIService;


/**
 * Generates code using keyGenerator and set into kpId attribute.
 */
public class DefaultClientKPIService implements ClientKPIService
{
	private KeyGenerator keyGenerator;


	@Override
	public void generateKPIInfoId(final KPIInfoModel kpiinfomodel)
	{
		if (kpiinfomodel.getKpiId() == null)
		{
			kpiinfomodel.setKpiId("KPI" + keyGenerator.generate().toString());
		}
	}

	/**
	 * @return the keyGenerator
	 */
	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	/**
	 * @param keyGenerator
	 *           the keyGenerator to set
	 */
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}


}
