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
package com.cnk.travelogix.product.transport.masters.core.constants;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;

import java.util.ArrayList;
import java.util.List;


/**
 *
 */
@SystemSetup(extension = TransportproductmasterscoreConstants.EXTENSIONNAME)
public class VehicleMastersCoreSystemSetup extends AbstractSystemSetup
{
	private static final String IMPORT_SAMPLE_DATA = "importSampleData";
	private static final String SITE = "EZ-IN";

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
			//	synchronizeContentCatalog(context, SITE, true);

		}
	}

	@SystemSetup(type = Type.ESSENTIAL, process = Process.ALL)
	public void importCommonVehicleData(final SystemSetupContext context, final String importDirectory)
	{
		logInfo(context, "Importing Common Data...");

		final String importRoot = "/" + importDirectory + "/import";

		importImpexFile(context, importRoot + "/sampledata/classification-attributes_bike.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-attributes_bus.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-attributes_car.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-attributes_rv.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-attributes_train.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-attributes_yatch.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-assignment_bike.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-assignment_bus.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-assignment_car.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-assignment_rv.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-assignment_train.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-assignment_yatch.impex", false);
		importImpexFile(context, importRoot + "/sampledata/classification-classes-categoriesrelation.impex", false);
		importImpexFile(context, importRoot + "/sampledata/products-vehicle-Bike.impex", false);
		importImpexFile(context, importRoot + "/sampledata/products-vehicle-car.impex", false);
		importImpexFile(context, importRoot + "/sampledata/products-vehicle-rv_camper_motorhome_caravan_cantore.impex", false);
		importImpexFile(context, importRoot + "/sampledata/products-vehicle-Train.impex", false);
		importImpexFile(context, importRoot + "/sampledata/products-vehicle-Yatch.impex", false);
		importImpexFile(context, importRoot + "/sampledata/product-vehicle-Bus.impex", false);








	}
}
