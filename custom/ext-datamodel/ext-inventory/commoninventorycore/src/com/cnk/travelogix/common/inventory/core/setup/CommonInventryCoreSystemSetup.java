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
package com.cnk.travelogix.common.inventory.core.setup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;


/**
 *
 */
@SystemSetup(extension = CommoninventorycoreConstants.EXTENSIONNAME)
public class CommonInventryCoreSystemSetup extends AbstractSystemSetup
{
	@Override
	@SystemSetupParameterMethod
	public List<SystemSetupParameter> getInitializationOptions()
	{
		return new ArrayList<SystemSetupParameter>();
	}

	@SystemSetup(type = Type.PROJECT, process = Process.ALL)
	public void createProjectData(final SystemSetupContext context)
	{
		importCommonData(context, context.getExtensionName());
	}

	protected void importCommonData(final SystemSetupContext context, final String importDirectory)
	{
		logInfo(context, "Importing Common Data...");

		final String importRoot = "/" + importDirectory + "/sampledata";
		importImpexFile(context, importRoot + "/air-inventory-request.impex", false);
		importImpexFile(context, importRoot + "/air-inventory-definition.impex", false);
		importImpexFile(context, importRoot + "/acco-inventory-request.impex", false);
		importImpexFile(context, importRoot + "/sampledata/acco-inventory-definition.impex", false);
		importImpexFile(context, importRoot + "/air-indent-coupon-request.impex", false);
		importImpexFile(context, importRoot + "/air-coupon.impex", false);
		importImpexFile(context, importRoot + "/payment-advice.impex", false);
		importImpexFile(context, importRoot + "/inventory-definition-activities.impex", false);
		importImpexFile(context, importRoot + "/inventory-definition-holiday.impex", false);
		importImpexFile(context, importRoot + "/Inventory-definition-Cruise.impex", false);

		final String importRoot1 = "/" + importDirectory + "/validation";
		importImpexFile(context, importRoot1 + "/Inventory-constraints.impex", false);
	}
}
