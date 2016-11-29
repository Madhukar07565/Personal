/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cnk.travelogix.common.initialdata.setup;

import de.hybris.platform.commerceservices.dataimport.impl.CoreDataImportService;
import de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService;
import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;
import de.hybris.platform.util.JspContext;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.common.initialdata.constants.CommonInitialDataConstants;


/**
 * This class provides hooks into the system's initialization and update processes.
 *
 * @see "https://wiki.hybris.com/display/release4/Hooks+for+Initialization+and+Update+Process"
 */
@SystemSetup(extension = CommonInitialDataConstants.EXTENSIONNAME)
public class InitialDataSystemSetup extends AbstractSystemSetup
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(InitialDataSystemSetup.class);

	private static final String IMPORT_CORE_DATA = "importCoreData";
	private static final String IMPORT_SAMPLE_DATA = "importSampleData";
	private static final String ACTIVATE_SOLR_CRON_JOBS = "activateSolrCronJobs";
	private static final String IMPORT_MOCK_DATA_SITE_STORE_USER = "importMockDataSiteStoreUser";

	private CoreDataImportService coreDataImportService;
	private SampleDataImportService sampleDataImportService;

	/**
	 * Generates the Dropdown and Multi-select boxes for the project data import
	 */
	@Override
	@SystemSetupParameterMethod
	public List<SystemSetupParameter> getInitializationOptions()
	{
		final List<SystemSetupParameter> params = new ArrayList<SystemSetupParameter>();

		params.add(createBooleanSystemSetupParameter(IMPORT_CORE_DATA, "Import Core Data", true));
		params.add(createBooleanSystemSetupParameter(IMPORT_SAMPLE_DATA, "Import Sample Data", true));
		params.add(createBooleanSystemSetupParameter(ACTIVATE_SOLR_CRON_JOBS, "Activate Solr Cron Jobs", true));
		// Add more Parameters here as you require

		params.add(
				createBooleanSystemSetupParameter(IMPORT_MOCK_DATA_SITE_STORE_USER, "Import Mock Data for Site/Store/User", true));

		return params;
	}

	/**
	 * Implement this method to create initial objects. This method will be called by system creator during
	 * initialization and system update. Be sure that this method can be called repeatedly.
	 *
	 * @param context
	 *           the context provides the selected parameters and values
	 */
	@SystemSetup(type = Type.ESSENTIAL, process = Process.ALL)
	public void createEssentialData(final SystemSetupContext context)
	{
		// Add Essential Data here as you require
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2c/constraints.impex");
	}

	/**
	 * Implement this method to create data that is used in your project. This method will be called during the system
	 * initialization. <br>
	 * Add import data for each site you have configured
	 *
	 * <pre>
	 * final List&lt;ImportData&gt; importData = new ArrayList&lt;ImportData&gt;();
	 * final ImportData sampleImportData = new ImportData();
	 * sampleImportData.setProductCatalogName(SAMPLE_PRODUCT_CATALOG_NAME);
	 * sampleImportData.setContentCatalogNames(Arrays.asList(SAMPLE_CONTENT_CATALOG_NAME));
	 * sampleImportData.setStoreNames(Arrays.asList(SAMPLE_STORE_NAME));
	 * importData.add(sampleImportData);
	 *
	 * getCoreDataImportService().execute(this, context, importData);
	 * getEventService().publishEvent(new CoreDataImportedEvent(context, importData));
	 *
	 * getSampleDataImportService().execute(this, context, importData);
	 * getEventService().publishEvent(new SampleDataImportedEvent(context, importData));
	 * </pre>
	 *
	 * @param context
	 *           the context provides the selected parameters and values
	 */
	@SystemSetup(type = Type.PROJECT, process = Process.ALL)
	public void createProjectData(final SystemSetupContext context)
	{
		/*
		 * Add import data for each site you have configured
		 */
		final boolean isImportMockSiteStoreUser = getBooleanSystemSetupParameter(context, IMPORT_MOCK_DATA_SITE_STORE_USER);
		final boolean isImportCoreData = getBooleanSystemSetupParameter(context, IMPORT_CORE_DATA);

		if (isImportCoreData)
		{
			importCoreData(context);
		}

		if (isImportMockSiteStoreUser)
		{
			importMockData(context);
		}

	}

	private void importMockData(final SystemSetupContext context)
	{
		logInfo(context, "Start to import Mock Site/Store/User Data for Dev");
		// cnkinb2b
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/cnkinb2b/store_en.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/cnkinb2b/store-responsive.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/cnkinb2b/store.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/cnkinb2b/site_en.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/cnkinb2b/site.impex");

		// cnkinb2c
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/cnkinb2c/store_en.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/cnkinb2c/store-responsive.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/cnkinb2c/store.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/cnkinb2c/site_en.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/cnkinb2c/site.impex");

		// ezginb2b
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2b/store_en.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2b/store-responsive.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2b/store.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2b/site_en.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2b/site.impex");

		// ezginb2c
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2c/store_en.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2c/store-responsive.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2c/store.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2c/site_en.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2c/site.impex");

		//sample users
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2c/users-sample.impex");

		importImpexFile(context, "/commoninitialdata/import/sampledata/customer/settings.impex");

		//import traveller type
		importImpexFile(context, "/commoninitialdata/import/sampledata/traveller/traveller.impex");

		logInfo(context, "Finish to import Mock Site/Store/User Data for Dev ");
	}

	private void importCoreData(final SystemSetupContext context)
	{
		logInfo(context, "Start to import Essential content Data.");
		// content data
		importImpexFile(context, "/commoninitialdata/import/coredata/contentCatalogs/ezgb2cContentCatalog/catalog.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/contentCatalogs/ezgb2cContentCatalog/cms-content.impex");
		/* Added by Alex Lu for TRAV-142 start */
		importImpexFile(context, "/commoninitialdata/import/coredata/contentCatalogs/ezgb2cContentCatalog/email-content.impex");
		/* Added by Alex Lu for TRAV-142 end */

		importImpexFile(context, "/commoninitialdata/import/coredata/contentCatalogs/ezgb2bContentCatalog/catalog.impex");
		importImpexFile(context, "/commoninitialdata/import/coredata/contentCatalogs/ezgb2bContentCatalog/cms-content.impex");

		//solr for auto complete
		importImpexFile(context, "/commoninitialdata/import/coredata/stores/ezginb2c/solr.impex");

		logInfo(context, "Finish to import Essential content Data.");
	}

	public CoreDataImportService getCoreDataImportService()
	{
		return coreDataImportService;
	}

	@Required
	public void setCoreDataImportService(final CoreDataImportService coreDataImportService)
	{
		this.coreDataImportService = coreDataImportService;
	}

	public SampleDataImportService getSampleDataImportService()
	{
		return sampleDataImportService;
	}

	@Required
	public void setSampleDataImportService(final SampleDataImportService sampleDataImportService)
	{
		this.sampleDataImportService = sampleDataImportService;
	}

	/**
	 * Log an info message in to the jsp context
	 *
	 * @param context
	 *           the system setup context
	 * @param message
	 *           the message to log
	 */
	@Override
	public void logInfo(final SystemSetupContext context, final String message)
	{
		LOG.info(message);

		final JspContext jspContext = context.getJspContext();
		// check if jspContext is not null, this is a hybris bug, should be fixed in next release
		if (jspContext != null)
		{
			jspContext.println(message);
		}
	}
}
