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
package com.cnk.travelogix.operations.services.strategy;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;


/**
 * This interface is used for checking Duplicate records for Reconfirmation Configure
 *
 * @author C5244543
 */
@FunctionalInterface
public interface ReconfirmationConfigDuplicateChackStrategy
{
	public boolean isReconfirmationRecordExist(final ReconfirmationConfigModel configData);
}
