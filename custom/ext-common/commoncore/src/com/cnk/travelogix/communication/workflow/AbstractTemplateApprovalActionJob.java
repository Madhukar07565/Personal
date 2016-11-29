/**
 *
 */
package com.cnk.travelogix.communication.workflow;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.communication.model.cms2.pages.CommunicationTemplateModel;


/**
 * @author I319924
 *
 */
public class AbstractTemplateApprovalActionJob implements AutomatedWorkflowTemplateJob
{

	@Autowired
	private ModelService modelService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob#perform(de.hybris.platform.workflow.model.
	 * WorkflowActionModel)
	 */
	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel paramWorkflowActionModel)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	protected CommunicationTemplateModel getAttachedTemplate(final WorkflowActionModel action)
	{
		final List<ItemModel> attachments = action.getAttachmentItems();
		if (attachments != null)
		{
			for (final ItemModel item : attachments)
			{
				if (item instanceof CommunicationTemplateModel)
				{
					return (CommunicationTemplateModel) item;
				}
			}
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

}
