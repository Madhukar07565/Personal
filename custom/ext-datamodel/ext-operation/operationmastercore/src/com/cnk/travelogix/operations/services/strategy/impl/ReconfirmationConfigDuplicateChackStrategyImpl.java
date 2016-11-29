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
package com.cnk.travelogix.operations.services.strategy.impl;

import java.util.List;

import com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.model.ClientReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.model.ReconfirmationIntervalModel;
import com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.model.SupplierReconfirmationConfigModel;
import com.cnk.travelogix.operation.reconfirmation.dao.TravelogixReconfirmationConfigDao;
import com.cnk.travelogix.operations.services.strategy.ReconfirmationConfigDuplicateChackStrategy;


/**
 * This class is used for checking Duplicate records for Reconfirmation Configure.
 *
 * @author C5244543
 */
public class ReconfirmationConfigDuplicateChackStrategyImpl implements ReconfirmationConfigDuplicateChackStrategy
{
	private TravelogixReconfirmationConfigDao reconfirmationConfigDao;

	@Override
	public boolean isReconfirmationRecordExist(final ReconfirmationConfigModel configData)

	{
		boolean flag = false;
		final List<ReconfirmationConfigModel> allRecords = reconfirmationConfigDao.getAllRecords(configData);
		if (null != allRecords)
		{
			for (final ReconfirmationConfigModel configModel : allRecords)
			{
				if (null != configModel.getSupplierreconfirmationconfigs())
				{
					flag = isSupplierReconfirmationRecordsExist(configModel, configData);
				}
				else if (null != configModel.getClientreconfirmationconfigs())
				{
					flag = isClientReconfirmationRecordsExist(configModel, configData);
				}
				if (flag)
				{
					return flag;
				}
			}
		}
		return flag;
	}

	boolean isClientReconfirmationRecordsExist(final ReconfirmationConfigModel model, final ReconfirmationConfigModel data)
	{
		boolean flag = false;
		for (final ClientReconfirmationConfigModel clientModel : model.getClientreconfirmationconfigs())
		{
			for (final ClientReconfirmationConfigModel clientData : data.getClientreconfirmationconfigs())
			{
				if (clientModel.getClient() == (clientData.getClient()) && isReconfirmationIntervalExist(
						clientData.getClientReconfirmationInterval(), clientModel.getClientReconfirmationInterval()))
				{
					flag = true;
					break;
				}
			}
			if (flag)
			{
				break;
			}
		}
		return flag;
	}

	boolean isSupplierReconfirmationRecordsExist(final ReconfirmationConfigModel model, final ReconfirmationConfigModel data)
	{
		boolean flag = false;
		for (final SupplierReconfirmationConfigModel supplierModel : model.getSupplierreconfirmationconfigs())
		{
			for (final SupplierReconfirmationConfigModel supplierData : data.getSupplierreconfirmationconfigs())
			{
				if (supplierModel.getSupplier() == supplierData.getSupplier() && isReconfirmationIntervalExist(
						supplierData.getSupplierReconfirmationInterval(), supplierModel.getSupplierReconfirmationInterval()))
				{
					flag = true;
					break;
				}
			}
			if (flag)
			{
				break;
			}
		}
		return flag;
	}


	boolean isReconfirmationIntervalExist(final ReconfirmationIntervalModel intervalModel,
			final ReconfirmationIntervalModel intervalData)
	{
		if (null != intervalModel && null != intervalData
				&& intervalModel.getReconfirmationCutOff().equals(intervalData.getReconfirmationCutOff())
				&& intervalModel.getCutoff().equals(intervalData.getCutoff())
				&& intervalModel.getCutOffDaysOrHours().equals(intervalData.getCutOffDaysOrHours()))
		{
			return true;
		}
		return false;
	}

	/**
	 * @return the reconfirmationConfigDao
	 */
	public TravelogixReconfirmationConfigDao getReconfirmationConfigDao()
	{
		return reconfirmationConfigDao;
	}

	/**
	 * @param reconfirmationConfigDao
	 *           the reconfirmationConfigDao to set
	 */
	public void setReconfirmationConfigDao(final TravelogixReconfirmationConfigDao reconfirmationConfigDao)
	{
		this.reconfirmationConfigDao = reconfirmationConfigDao;
	}

}
