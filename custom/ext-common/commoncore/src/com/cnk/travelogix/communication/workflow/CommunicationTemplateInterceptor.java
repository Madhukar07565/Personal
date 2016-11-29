/**
 *
 */
package com.cnk.travelogix.communication.workflow;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.type.TypeService;

import java.util.Date;

import org.joda.time.DateTimeComparator;

import com.cnk.travelogix.common.core.enums.CommunicationType;
import com.cnk.travelogix.communication.model.cms2.pages.CommunicationTemplateModel;
import com.cnk.travelogix.communication.services.VersionDetailService;
import com.cnk.travelogix.communication.strategies.CloneCommunicationTemplateStrategy;


/**
 * @author I319924
 *
 */
public class CommunicationTemplateInterceptor implements PrepareInterceptor<CommunicationTemplateModel>
{

	private ModelService modelService;

	private VersionDetailService versionDetailService;

	private CloneCommunicationTemplateStrategy cloneCommunicationTemplateStrategy;

	private TypeService typeService;

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

	/**
	 * @return the cloneCommunicationTemplateStrategy
	 */
	public CloneCommunicationTemplateStrategy getCloneCommunicationTemplateStrategy()
	{
		return cloneCommunicationTemplateStrategy;
	}

	/**
	 * @param cloneCommunicationTemplateStrategy
	 *           the cloneCommunicationTemplateStrategy to set
	 */
	public void setCloneCommunicationTemplateStrategy(final CloneCommunicationTemplateStrategy cloneCommunicationTemplateStrategy)
	{
		this.cloneCommunicationTemplateStrategy = cloneCommunicationTemplateStrategy;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final CommunicationTemplateModel template, final InterceptorContext interceptorContext)
			throws InterceptorException
	{
		//Template name is unique as BU, template uid should be system generated
		if (template.getUid() == null)
		{
			template.setUid(template.getName());
		}
		//effective date should not be older than current system date
		if (DateTimeComparator.getDateOnlyInstance().compare(template.getActiveFrom(), new Date()) < 1 && (!template.isClone()))
		{
			throw new InterceptorException("Active Date Can not be older then Current date ");
		}

		if (template.getCommunicationType().equals(CommunicationType.INTERNAL))
		{
			// Internal Template does not need approval so it will be approved always.
			template.setStatus(ArticleApprovalStatus.APPROVED);
		}

		// Logic to find template saved Approval only form Workflow Approval !!
		if (template.isSaveFormWorkflow())
		{
			template.setSaveFormWorkflow(false);
			return;
		}

		// if unapproved version again submit for approval
		if (template.getStatus().equals(ArticleApprovalStatus.UNAPPROVED))
		{
			template.setStatus(ArticleApprovalStatus.CHECK);
			return;
		}
		// Create new Version if template is not cloned one and having Older version
		if (template.getVersion() != null && (!template.isClone()))
		{
			getCloneCommunicationTemplateStrategy().clone(template);
		}

		// assign init version to new template
		if (template.getVersion() == null)
		{
			template.setVersion(getVersionDetailService().getInitVersion(Double.valueOf(1.0), CommunicationTemplateModel.class));
		}

	}

	/**
	 * @return the typeService
	 */
	public TypeService getTypeService()
	{
		return typeService;
	}

	/**
	 * @param typeService
	 *           the typeService to set
	 */
	public void setTypeService(final TypeService typeService)
	{
		this.typeService = typeService;
	}
}