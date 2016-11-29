









/**
 *
 */
package com.cnk.travelogix.communication.strategies;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import com.cnk.travelogix.common.core.enums.CommunicationType;
import com.cnk.travelogix.communication.model.cms2.pages.CommunicationTemplateModel;
import com.cnk.travelogix.communication.services.VersionDetailService;


/**
 * @author I319924
 *
 */
public class DefaultCloneCommunicationTemplateStrategy implements CloneCommunicationTemplateStrategy
{

	@Resource
	private ModelService modelService;

	@Resource
	private VersionDetailService versionDetailService;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.communication.strategies.CloneCommunicationTemplateStrategy#clone(com.cnk.travelogix.
	 * communication.model.cms2.pages.CommunicationTemplateModel)
	 */

	/**
	 *
	 */
	public DefaultCloneCommunicationTemplateStrategy(final ModelService modelService,
			final VersionDetailService versionDetailService)
	{
		super();
		this.modelService = modelService;
		this.versionDetailService = versionDetailService;
	}


	@Override
	public CommunicationTemplateModel clone(final CommunicationTemplateModel template)
	{
		// fetching original template to clone and assigning current version
		//Assigning new version to same instance and making it new version of template
		final CommunicationTemplateModel original = getModelService().get(template.getPk());
		if (original.getStatus().equals(ArticleApprovalStatus.APPROVED) && (!original.isClone()))
		{
			final CommunicationTemplateModel clone = getModelService().clone(original);
			template.setVersion(
					getVersionDetailService().getRcommVersion(template.getVersion().getVersion(), CommunicationTemplateModel.class));
			// Internal Template will always be approved
			if (!(original.getCommunicationType().equals(CommunicationType.INTERNAL)))
			{
				template.setStatus(ArticleApprovalStatus.CHECK);
			}
			// Cloned Version must be not active as BR20.
			clone.setActive(new Boolean(false));
			clone.setClone(true);
			getModelService().save(clone);
			return clone;
		}
		return null;
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the versionDetailService
	 */
	public VersionDetailService getVersionDetailService()
	{
		return versionDetailService;
	}

	/**
	 * @param versionDetailService
	 *           the versionDetailService to set
	 */
	public void setVersionDetailService(final VersionDetailService versionDetailService)
	{
		this.versionDetailService = versionDetailService;
	}

}