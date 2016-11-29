package com.cnk.travelogix.communication.process.strategies.impl;

import de.hybris.platform.acceleratorservices.process.strategies.impl.DefaultProcessContextResolutionStrategy;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.constants.CatalogConstants;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Resource;

import com.cnk.travelogix.communication.model.CommunicationProcessModel;


/**
 *
 */
public class TravelogixProcessContextResolutionStrategy extends DefaultProcessContextResolutionStrategy
{

	@Resource
	private CatalogVersionService catalogVersionService;

	@Override
	public BaseSiteModel getCmsSite(final BusinessProcessModel businessProcess)
	{

		final Collection<CatalogVersionModel> catalogVesions = new ArrayList();
		//	catalogVesions.add(catalogVersionService.getCatalogVersion("operationsContentCatalog", "Online"));
		/* added by Alex Lu for TRAV-142 start */
		//	catalogVesions.add(catalogVersionService.getCatalogVersion("ezgb2cContentCatalog", "Online"));
		/* added by Alex Lu for TRAV-142 end */

		getSessionService().setAttribute(CatalogConstants.SESSION_CATALOG_VERSIONS, catalogVesions);

		if (businessProcess instanceof CommunicationProcessModel)
		{
			return ((CommunicationProcessModel) businessProcess).getCommunication().getSite();
		}
		return super.getCmsSite(businessProcess);
	}
}