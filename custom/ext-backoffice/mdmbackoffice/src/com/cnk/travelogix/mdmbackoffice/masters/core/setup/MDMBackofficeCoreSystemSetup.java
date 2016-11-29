package com.cnk.travelogix.mdmbackoffice.masters.core.setup;

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

import com.cnk.travelogix.mdmbackoffice.constants.MdmbackofficeConstants;


/**
 *
 */
@SystemSetup(extension = MdmbackofficeConstants.EXTENSIONNAME)
public class MDMBackofficeCoreSystemSetup extends AbstractSystemSetup
{
	private static final Logger LOG = Logger.getLogger(MDMBackofficeCoreSystemSetup.class.getName());
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
			importMDMBackOfficeData(context, context.getExtensionName());
		}
	}

	public void importMDMBackOfficeData(final SystemSetupContext context, final String importDirectory)
	{
		logInfo(context, "Importing Common Data...");

		final String importRoot = "/" + importDirectory + "/import";
		if (LOG.isDebugEnabled())
		{

			LOG.debug("Importing Validation Contraints for MDMBackoffice from Directory :" + importRoot);
		}

		importImpexFile(context, importRoot + "/validations/mdmbackoffice-constraints.impex", false);
		importImpexFile(context, importRoot + "/validations/workflow_QC_and_Publsih_Approval.impex", false);

	}
}