/**
 *
 */
package com.cnk.travelogix.setup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;

import java.util.Collections;
import java.util.List;

import com.cnk.travelogix.constants.PaymentgatewaysConstants;


/**
 *
 */
@SystemSetup(extension = PaymentgatewaysConstants.EXTENSIONNAME)
public class PaymentgatewaysCoreSystemSetup extends AbstractSystemSetup
{

	@Override
	public List<SystemSetupParameter> getInitializationOptions()
	{
		return Collections.emptyList();
	}

	@SystemSetup(type = Type.PROJECT, process = Process.ALL)
	public void createEssentialData(final SystemSetupContext context)
	{
		importImpexFile(context, "/paymentgateways/import/paymentgateways/MappingUserSelectedValueToPaymentGatewayCodes.impex");
	}
}
