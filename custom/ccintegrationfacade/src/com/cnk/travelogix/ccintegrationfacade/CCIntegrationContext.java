/*
 *
 */
package com.cnk.travelogix.ccintegrationfacade;

import de.hybris.platform.core.Registry;



/**
 * The Class CCIntegrationContext.
 */
public final class CCIntegrationContext
{

	/**
	 * Gets the supplier integration facade.
	 *
	 * @return the supplier integration facade
	 */
	public static SupplierCCIntegrationFacade getSupplierIntegrationFacade()
	{
		return Registry.getApplicationContext().getBean(SupplierCCIntegrationFacade.class);
	}

	/**
	 * Gets the company integration facade.
	 *
	 * @return the company integration facade
	 */
	public static CompanyCCIntegrationFacade getCompanyIntegrationFacade()
	{
		return Registry.getApplicationContext().getBean(CompanyCCIntegrationFacade.class);
	}


	/**
	 * Gets the client integration facade.
	 *
	 * @return the client integration facade
	 */
	public static ClientCCIntegrationFacade getClientIntegrationFacade()
	{
		return Registry.getApplicationContext().getBean(ClientCCIntegrationFacade.class);
	}
}


