/**
 *
 */
package com.cnk.travelogix.communication.event;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.core.PK;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.tx.AfterSaveEvent;
import de.hybris.platform.tx.AfterSaveListener;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowModel;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;

import java.util.Collection;

import com.cnk.travelogix.common.core.enums.CommunicationType;
import com.cnk.travelogix.communication.model.cms2.pages.CommunicationTemplateModel;


/**
 * @author I319924
 *
 */
public class CommunicationTemplateAfterSaveListener implements AfterSaveListener
{

	private ModelService modelService;
	private UserService userService;
	private WorkflowTemplateService workflowTemplateService;
	private WorkflowService workflowService;
	private WorkflowProcessingService workflowProcessingService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.tx.AfterSaveListener#afterSave(java.util.Collection)
	 */
	@Override
	public void afterSave(final Collection<AfterSaveEvent> events)
	{
		for (final AfterSaveEvent event : events)
		{
			final int type = event.getType();
			if (AfterSaveEvent.CREATE == type || AfterSaveEvent.UPDATE == type)
			{
				final PK pk = event.getPk();
				//The AccommodationInventoryDefinition deployment code is "21153"
				if (1076 == pk.getTypeCode())
				{
					if (modelService.get(pk) instanceof CommunicationTemplateModel)
					{
						final CommunicationTemplateModel model = modelService.get(pk);

						// Start workflow if it is not internal and Approved one or if it is a new template
						// Also if templated saved than templated is Approved then we no need to start work flow
						//becuase this logic in after save event and it will trigger again if we approve
						//template form workflow than case we should not start workflow again.

						if (model.getCommunicationType().equals(CommunicationType.EXTERNAL) && (!model.isClone())
								&& model.getStatus().equals(ArticleApprovalStatus.CHECK))
						{
							final WorkflowTemplateModel workflowTemplate = this.workflowTemplateService
									.getWorkflowTemplateForCode("communicationWorkflowTemplate");

							final WorkflowModel workflow = this.workflowService.createWorkflow(workflowTemplate, model,
									userService.getAdminUser());
							modelService.save(workflow);
							for (final WorkflowActionModel action : workflow.getActions())
							{
								modelService.save(action);
							}
							this.workflowProcessingService.startWorkflow(workflow);
						}
					}
				}
			}

		}

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
	 * @return the userService
	 */
	public UserService getUserService()
	{
		return userService;
	}

	/**
	 * @param userService
	 *           the userService to set
	 */
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	/**
	 * @return the workflowTemplateService
	 */
	public WorkflowTemplateService getWorkflowTemplateService()
	{
		return workflowTemplateService;
	}

	/**
	 * @param workflowTemplateService
	 *           the workflowTemplateService to set
	 */
	public void setWorkflowTemplateService(final WorkflowTemplateService workflowTemplateService)
	{
		this.workflowTemplateService = workflowTemplateService;
	}

	/**
	 * @return the workflowService
	 */
	public WorkflowService getWorkflowService()
	{
		return workflowService;
	}

	/**
	 * @param workflowService
	 *           the workflowService to set
	 */
	public void setWorkflowService(final WorkflowService workflowService)
	{
		this.workflowService = workflowService;
	}

	/**
	 * @return the workflowProcessingService
	 */
	public WorkflowProcessingService getWorkflowProcessingService()
	{
		return workflowProcessingService;
	}

	/**
	 * @param workflowProcessingService
	 *           the workflowProcessingService to set
	 */
	public void setWorkflowProcessingService(final WorkflowProcessingService workflowProcessingService)
	{
		this.workflowProcessingService = workflowProcessingService;
	}
}
