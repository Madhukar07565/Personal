/**
 *
 */
package com.cnk.travelogix.orgstructure.core.setup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;

import java.util.Collections;
import java.util.List;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;


/**
 *
 */
@SystemSetup(extension = OrgstructurecoreConstants.EXTENSIONNAME)
public class OrgStructureCoreSystemSetup extends AbstractSystemSetup
{

	@Override
	public List<SystemSetupParameter> getInitializationOptions()
	{
		return Collections.emptyList();
	}

	@SystemSetup(type = Type.PROJECT, process = Process.ALL)
	public void createEssentialData(final SystemSetupContext context)
	{
		importImpexFile(context, "/orgstructurecore/import/common/organizations.impex");
		importImpexFile(context, "/orgstructurecore/import/catalogs/catalog.impex");
		importImpexFile(context, "/orgstructurecore/import/catalogs/categories.impex");
		createProductCatalogSyncJob(context, "EZ-IN");
		executeCatalogSyncJob(context, "EZ-IN");
	}
}
