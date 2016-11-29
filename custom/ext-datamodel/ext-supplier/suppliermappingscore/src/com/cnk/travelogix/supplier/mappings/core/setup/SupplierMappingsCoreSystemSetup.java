/**
 *
 */
package com.cnk.travelogix.supplier.mappings.core.setup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.type.TypeService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;


/**
 * The Class SupplierMappingsCoreSystemSetup.
 *
 * @author admin
 */
@SystemSetup(extension = SuppliermappingscoreConstants.EXTENSIONNAME)
public class SupplierMappingsCoreSystemSetup extends AbstractSystemSetup
{

	/** The Constant LOG. */
	private static final Logger LOG = Logger.getLogger(SupplierMappingsCoreSystemSetup.class);

	/** The Constant IMPORT_ACCESS_RIGHTS. */
	public static final String IMPORT_ACCESS_RIGHTS = "importSampleData";

	/** The type service. */
	private TypeService typeService;

	/** The model service. */
	private ModelService modelService;

	/** The user service. */
	private UserService userService;

	/**
	 * This method will be called by system creator during initialization and system update. Be sure that this method can
	 * be called repeatedly.
	 *
	 * @param context
	 *           the context provides the selected parameters and values
	 */
	@SystemSetup(type = Type.ESSENTIAL, process = Process.ALL)
	public void createEssentialData(final SystemSetupContext context)
	{
		//
	}

	/**
	 * Generates the Dropdown and Multi-select boxes for the project data import.
	 */
	@Override
	@SystemSetupParameterMethod
	public List<SystemSetupParameter> getInitializationOptions()
	{
		final List<SystemSetupParameter> params = new ArrayList<SystemSetupParameter>();

		params.add(createBooleanSystemSetupParameter(IMPORT_ACCESS_RIGHTS,
				"Import Supplier Mappings (Product / Country / City) Sample Data", true));

		return params;
	}

	/**
	 * This method will be called during the system initialization.
	 *
	 * @param context
	 *           the context provides the selected parameters and values
	 */
	@SystemSetup(type = Type.PROJECT, process = Process.ALL)
	public void createProjectData(final SystemSetupContext context)
	{

		LOG.info("Supplier Mappings Sample data import Start ###########");

		final boolean importAccessRights = getBooleanSystemSetupParameter(context, IMPORT_ACCESS_RIGHTS);
		if (importAccessRights)
		{
			importImpexFile(context, "/import/sampledata/suppliermappings.impex");
			importImpexFile(context, "/import/validations/suppliermappingscore-constraints.impex");
		}
		LOG.info("########## Supplier Mappings Sample data import Finish ##########");
	}

	protected List<String> getExtensionNames()
	{
		return Registry.getCurrentTenant().getTenantSpecificExtensionNames();
	}

	protected <T> T getBeanForName(final String name)
	{
		return (T) Registry.getApplicationContext().getBean(name);
	}

	/**
	 * @return the typeService
	 */
	protected TypeService getTypeService()
	{
		return typeService;
	}

	@Required
	public void setTypeService(final TypeService typeService)
	{
		this.typeService = typeService;
	}

	protected ModelService getModelService()
	{
		return modelService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	protected UserService getUserService()
	{
		return userService;
	}

	@Required
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}
}
