/**
 *
 */
package com.cnk.travelogix.product.accommodation.masters.core.setup;

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

import com.cnk.travelogix.product.accommodation.masters.core.constants.AccoproductmasterscoreConstants;


/**
 *
 */
@SystemSetup(extension = AccoproductmasterscoreConstants.EXTENSIONNAME)
public class AccoProductMastersCoreSystemSetup extends AbstractSystemSetup
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
		}
	}

	@SystemSetup(type = Type.ESSENTIAL, process = Process.ALL)
	protected void importCommonData(final SystemSetupContext context, final String importDirectory)
	{
		logInfo(context, "Importing Common Data...");

		final String importRoot = "/" + importDirectory + "/import";
		importImpexFile(context, importRoot + "/common/accommodation-brands.impex", false);
		importImpexFile(context, importRoot + "/common/accommodation-chains.impex", false);
		importImpexFile(context, importRoot + "/common/bath-types.impex", false);
		importImpexFile(context, importRoot + "/common/acco-masters.impex", false);
		importImpexFile(context, importRoot + "/common/classification-attribute_general_info.impex", false);
		importImpexFile(context, importRoot + "/common/classification-attribute_homeStay.impex", false);
		importImpexFile(context, importRoot + "/common/classification-classes-categoryrelation_general_info.impex", false);
		importImpexFile(context, importRoot + "/common/classification-classes-categoryrelation_homestay.impex", false);
		importImpexFile(context, importRoot + "/common/products-accommodation.impex", false);
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
