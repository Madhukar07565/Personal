/**
 *
 */
package com.cnk.travelogix.masterdata.core.setup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;

import java.util.Collections;
import java.util.List;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;


/**
 *
 */
@SystemSetup(extension = MasterdatacoreConstants.EXTENSIONNAME)
public class MasterDataCoreSystemSetup extends AbstractSystemSetup
{

	@Override
	public List<SystemSetupParameter> getInitializationOptions()
	{
		return Collections.emptyList();
	}

	@SystemSetup(type = Type.ESSENTIAL, process = Process.ALL)
	public void createEssentialData(final SystemSetupContext context)
	{
		importImpexFile(context, "/masterdatacore/import/common/essential-data.impex");
		importImpexFile(context, "/masterdatacore/import/common/continents.impex");
		importImpexFile(context, "/masterdatacore/import/common/countries.impex");
		importImpexFile(context, "/masterdatacore/import/common/regions.impex");
		importImpexFile(context, "/masterdatacore/import/common/cities.impex");
		importImpexFile(context, "/masterdatacore/import/common/locations.impex");
		importImpexFile(context, "/masterdatacore/import/common/airports.impex");
		importImpexFile(context, "/masterdatacore/import/common/banks.impex");
	}

}
