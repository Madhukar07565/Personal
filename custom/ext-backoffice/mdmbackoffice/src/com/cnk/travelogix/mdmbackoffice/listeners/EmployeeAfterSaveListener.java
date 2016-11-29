/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.listeners;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.cms2.servicelayer.services.CMSSiteService;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;
import de.hybris.platform.tx.AfterSaveEvent;
import de.hybris.platform.tx.AfterSaveListener;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.mdmbackoffice.process.model.EmployeeRegistrationProcessModel;


/** This AfterSaveListener implementation class user when creating the  EmployeeModel.
 * @author C5244543
 *
 */
public class EmployeeAfterSaveListener implements AfterSaveListener
{
	private BaseStoreService baseStoreService;
	private CMSSiteService cmsSiteService;
	private ModelService modelService;
	private BusinessProcessService businessProcessService;

	@Override
	public void afterSave(final Collection<AfterSaveEvent> events)
	{
		for (final AfterSaveEvent event : events)
		{
			final int type = event.getType();
			if (AfterSaveEvent.CREATE == type)
			{
				final PK pk = event.getPk();
				//The Users deployment code is "4"
				if (4 == pk.getTypeCode())
				{
					final UserModel user = (UserModel) modelService.get(pk);
					if (user instanceof EmployeeModel)
					{
						final EmployeeModel employee = (EmployeeModel) user;
						final EmployeeRegistrationProcessModel employeeRegistrationProcessModel = (EmployeeRegistrationProcessModel) getBusinessProcessService()
								.createProcess("employeeRegistration-" + employee.getUid() + "-" + System.currentTimeMillis(),
										"employeeRegistrationEmailProcess");
						BaseSiteModel baseSite = getCmsSiteService().getCurrentSite();
						final List<CMSSiteModel> allSites = (List<CMSSiteModel>) getCmsSiteService().getSites();
						if (allSites != null && allSites.size() > 0)
						{
							for (final CMSSiteModel cmssite : allSites)
							{
								if (cmssite.getUid().equalsIgnoreCase("operations"))
								{
									baseSite = cmssite;
								}
							}
						}
						BaseStoreModel baseStore = null;
						final List<BaseStoreModel> baseStores = baseStoreService.getAllBaseStores();
						if (baseStores != null && baseStores.size() > 0)
						{
							for (final BaseStoreModel storeModel : baseStores)
							{
								if (storeModel.getUid().equalsIgnoreCase("operations"))
								{
									baseStore = storeModel;
								}
							}
						}
						employeeRegistrationProcessModel.setEmployee(employee);
						employeeRegistrationProcessModel.setSite(baseSite);
						employeeRegistrationProcessModel.setStore(baseStore);
						modelService.save(employeeRegistrationProcessModel);
						getBusinessProcessService().startProcess(employeeRegistrationProcessModel);
					}
				}
			}
		}
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @param businessProcessService
	 *           the businessProcessService to set
	 */
	public void setBusinessProcessService(final BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}

	protected BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}

	/**
	 * @return the cmsSiteService
	 */
	public CMSSiteService getCmsSiteService()
	{
		return cmsSiteService;
	}

	/**
	 * @param cmsSiteService
	 *           the cmsSiteService to set
	 */
	public void setCmsSiteService(final CMSSiteService cmsSiteService)
	{
		this.cmsSiteService = cmsSiteService;
	}

	/**
	 * @param baseStoreService
	 *           the baseStoreService to set
	 */
	public void setBaseStoreService(final BaseStoreService baseStoreService)
	{
		this.baseStoreService = baseStoreService;
	}

}
