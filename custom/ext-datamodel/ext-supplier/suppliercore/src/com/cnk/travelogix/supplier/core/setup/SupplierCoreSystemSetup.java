/**
 *
 */
package com.cnk.travelogix.supplier.core.setup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;




/**
 * The class to import the impex of supplier core
 *
 */
@SystemSetup(extension = SuppliercoreConstants.EXTENSIONNAME)
public class SupplierCoreSystemSetup extends AbstractSystemSetup
{

	private static final Logger LOG = Logger.getLogger(SupplierCoreSystemSetup.class);

	/** The Constant IMPORT_ACCESS_RIGHTS. */
	private static final String IMPORT_SAMPLE_DATA = "importSampleData";


	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.commerceservices.setup.AbstractSystemSetup#getInitializationOptions()
	 */
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
			importCommonVehicleData(context, context.getExtensionName());

		}
	}

	@SystemSetup(type = Type.ESSENTIAL, process = Process.ALL)
	public void importCommonVehicleData(final SystemSetupContext context, final String importDirectory)
	{
		logInfo(context, "Importing Common Data...");

		final String importRoot = "/" + importDirectory + "/import";

		importImpexFile(context, importRoot + "/sampledata/suppliercore.impex", false);

		LOG.info("Supplier Core Impex import finished");


	}
}
