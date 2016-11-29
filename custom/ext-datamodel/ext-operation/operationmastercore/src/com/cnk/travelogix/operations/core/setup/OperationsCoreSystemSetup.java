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
package com.cnk.travelogix.operations.core.setup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;


/**
 * This class will import the core and sample data for operations.
 */
@SystemSetup(extension = OperationmastercoreConstants.EXTENSIONNAME)
public class OperationsCoreSystemSetup extends AbstractSystemSetup
{
	private static final String SITE = "operations";
	private static final String SYNCHRONIZING_MSG = "synchronizing";
	private static final String INITIALIZING_JOB_MSG = "initializing job";

	private static final String IMPORT_CORE_DATA = "importCoreData";
	private static final String IMPORT_SAMPLE_DATA = "importSampleData";



	@SystemSetupParameterMethod
	@Override
	public List<SystemSetupParameter> getInitializationOptions()
	{
		final List<SystemSetupParameter> params = new ArrayList<>();

		params.add(createBooleanSystemSetupParameter(IMPORT_CORE_DATA, "Import Core Data", true));
		params.add(createBooleanSystemSetupParameter(IMPORT_SAMPLE_DATA, "Import Sample Data", true));

		return params;
	}


	/**
	 * This method will be called during the system initialization.
	 *
	 * @param context
	 *           the context provides the selected parameters and values
	 */
	@SystemSetup(type = SystemSetup.Type.PROJECT, process = SystemSetup.Process.ALL)
	public void createProjectData(final SystemSetupContext context)
	{

		if (getBooleanSystemSetupParameter(context, IMPORT_SAMPLE_DATA))
		{
			importCoreData(context, context.getExtensionName());
			synchronizeContentCatalog(context, SITE, true);
		}
		if (getBooleanSystemSetupParameter(context, IMPORT_SAMPLE_DATA))
		{
			importSampleData(context, context.getExtensionName());
			synchronizeContentCatalog(context, SITE, true);
		}
	}

	protected void importCoreData(final SystemSetupContext context, final String importDirectory)
	{
		logInfo(context, "Importing core Data");

		final String importRoot = "/" + importDirectory + "/import";

		importImpexFile(context, importRoot + "/common/essential-data.impex");
		importImpexFile(context, importRoot + "/common/countries.impex");
		importImpexFile(context, importRoot + "/common/delivery-modes.impex");

		importImpexFile(context, importRoot + "/common/themes.impex");
		importImpexFile(context, importRoot + "/common/user-groups.impex");

		importImpexFile(context, importRoot + "/coredata/catalogs.impex", false);
		importImpexFile(context, importRoot + "/coredata/store.impex", false);
		importImpexFile(context, importRoot + "/coredata/cms-content.impex", false);

		importImpexFile(context, importRoot + "/coredata/site.impex", false);
		importImpexFile(context, importRoot + "/coredata/cnkOrderListPageTemplate.impex", false);

		importImpexFile(context, importRoot + "/emails/email-content.impex", false);
		importImpexFile(context, importRoot + "/emails/email-time-limit-booking.impex", false);
		importImpexFile(context, importRoot + "/workflows/reconfirmation_config_workflow_template.impex", false);
		importImpexFile(context, importRoot + "/workflows/time_limit_booking_workflow_template.impex", false);

		importImpexFile(context, importRoot + "/workflows/travelogixRoe_WrokFlow.impex", false);
		importImpexFile(context, importRoot + "/workflows/travelogix_user_groups_restriction_roe.impex", false);

		importImpexFile(context, importRoot + "/coredata/cnkSearchViewFilterPageTemplate.impex", false);
		importImpexFile(context, importRoot + "/coredata/cnkBookingDetailsPageTemplate.impex", false);
		importImpexFile(context, importRoot + "/coredata/reoconfirmation-config-template.impex", false);
		importImpexFile(context, importRoot + "/coredata/serviceorder-template.impex", false);
		importImpexFile(context, importRoot + "/coredata/todo-workflow-data.impex", false);
	}

	protected void importSampleData(final SystemSetupContext context, final String importDirectory)
	{
		logInfo(context, "Importing sample Data");
		final String importRoot = "/" + importDirectory + "/import";
		importImpexFile(context, importRoot + "/sampledata/cms-content.impex", false);
		importImpexFile(context, importRoot + "/sampledata/homePage.impex", false);
		importImpexFile(context, importRoot + "/sampledata/secureLoginPage.impex", false);
		importImpexFile(context, importRoot + "/sampledata/cnkOrderListPage.impex", false);
		importImpexFile(context, importRoot + "/sampledata/todo-workflow-data.impex", false);
		importImpexFile(context, importRoot + "/sampledata/cnkSearchViewFilterBookingPage.impex", false);
		importImpexFile(context, importRoot + "/sampledata/cnkSearchViewLinkComponents.impex", false);
		importImpexFile(context, importRoot + "/sampledata/cnkBookingDetailsPage.impex", false);
		importImpexFile(context, importRoot + "/sampledata/reconfirmaion_config_sample_data.impex", false);
	}

	protected boolean synchronizeContentCatalog(final SystemSetupContext context, final String catalogName, final boolean sync)
	{
		logInfo(context,
				"Begin synchronizing Content Catalog [" + catalogName + "] - " + (sync ? SYNCHRONIZING_MSG : INITIALIZING_JOB_MSG));

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

		logInfo(context, "Done " + (sync ? SYNCHRONIZING_MSG : INITIALIZING_JOB_MSG) + " Content Catalog [" + catalogName + "]");
		return result;
	}


}
