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
package com.cnk.travelogix.product.holiday.masters.core.setup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;


/**
 * System setup class for Holiday Product
 */
@SystemSetup(extension = HolidayproductmastercoreConstants.EXTENSIONNAME)
public class HolidayProductSetup extends AbstractSystemSetup
{
	private static final String IMPORT_SAMPLE_DATA = "importSampleData";

	@Override
	@SystemSetupParameterMethod
	public List<SystemSetupParameter> getInitializationOptions()
	{
		final List<SystemSetupParameter> params = new ArrayList();
		params.add(createBooleanSystemSetupParameter(IMPORT_SAMPLE_DATA, "Import Sample Data", true));
		return params;
	}

	/**
	 * Create Project Data
	 *
	 * @param context
	 */
	@SystemSetup(type = Type.PROJECT, process = Process.ALL)
	public void createProjectData(final SystemSetupContext context)
	{
		if (getBooleanSystemSetupParameter(context, IMPORT_SAMPLE_DATA))
		{
			importCommonData(context, context.getExtensionName());
		}
	}

	protected void importCommonData(final SystemSetupContext context, final String importDirectory)
	{
		logInfo(context, "Importing Common Data...");
		final String importRoot = "/" + importDirectory + "/import";
		importImpexFile(context, importRoot + "/sampledata/products-holiday.impex", false);
	}

	protected boolean synchronizeContentCatalog(final SystemSetupContext context, final String catalogName, final boolean sync)
	{
		logInfo(context,
				"Begin synchronizing Content Catalog [" + catalogName + "] - " + (sync ? "synchronizing" : "initializing job"));

		createContentCatalogSyncJob(context, catalogName + "ContentCatalog");
		boolean result = true;
		if (sync)
		{
			final PerformResult syncCronJobResult = executeCatalogSyncJob(context, catalogName + "ContentCatalog");
			if (isSyncRerunNeeded(syncCronJobResult))
			{
				logInfo(context, "Catalog catalog [" + catalogName + "] sync has issues.");
				result = false;
			}
		}
		logInfo(context, "Done " + (sync ? "synchronizing" : "initializing job") + " Content Catalog [" + catalogName + "]");
		return result;
	}
}
