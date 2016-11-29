/**
 *
 */
package com.cnk.travelogix.product.activity.masters.core.setup;

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

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;


/**
 *
 */
@SystemSetup(extension = ActivityproductmasterscoreConstants.EXTENSIONNAME)
public class ActivityProductMastersCoreSystemSetup extends AbstractSystemSetup
{
	private static final String IMPORT_SAMPLE_DATA = "importSampleData";

	@Override
	@SystemSetupParameterMethod
	public List<SystemSetupParameter> getInitializationOptions()
	{
		final List<SystemSetupParameter> params = new ArrayList<SystemSetupParameter>();
		params.add(createBooleanSystemSetupParameter(IMPORT_SAMPLE_DATA, "Import Sample Data", true));
		return params;
	}

	@SystemSetup(type = Type.PROJECT, process = Process.ALL)
	public void createProjectData(final SystemSetupContext context)
	{
		if (getBooleanSystemSetupParameter(context, IMPORT_SAMPLE_DATA))
		{
			importCommonData(context, context.getExtensionName());
			importSampleData(context, context.getExtensionName());
		}
	}

	protected void importCommonData(final SystemSetupContext context, final String importDirectory)
	{
		logInfo(context, "Importing Common Data...");

		final String importRoot = "/" + importDirectory + "/import";
		importImpexFile(context, importRoot + "/common/product-types.impex", false);
		importImpexFile(context, importRoot + "/common/activity-brands.impex", false);
		importImpexFile(context, importRoot + "/common/activity-brands_en.impex", false);
		importImpexFile(context, importRoot + "/common/activity-chains.impex", false);
		importImpexFile(context, importRoot + "/common/activity-chains_en.impex", false);
		importImpexFile(context, importRoot + "/common/classification-attributes_activity.impex", false);
		importImpexFile(context, importRoot + "/common/classification-assignment_activity.impex", false);
		importImpexFile(context, importRoot + "/common/classification-classes-categoryrelation_general_activity.impex", false);
	}

	protected void importSampleData(final SystemSetupContext context, final String importDirectory)
	{
		logInfo(context, "Importing Sample Data...");

		final String importRoot = "/" + importDirectory + "/import";
		importImpexFile(context, importRoot + "/sampledata/products-activity.impex", false);
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
