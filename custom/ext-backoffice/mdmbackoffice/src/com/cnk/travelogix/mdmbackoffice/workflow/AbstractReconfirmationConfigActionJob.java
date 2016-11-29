/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.workflow;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob;
import de.hybris.platform.workflow.model.WorkflowActionModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;


/**
 * Abstract ReconfirmationConfig Action Job for return the ReconfirmationConfigModel object.
 *
 * @author C5244543
 *
 */
public abstract class AbstractReconfirmationConfigActionJob implements AutomatedWorkflowTemplateJob
{
	@Autowired
	private ModelService modelService;

	protected ReconfirmationConfigModel getAttachedTravelLogic(final WorkflowActionModel action)
	{
		final List<ItemModel> attachments = action.getAttachmentItems();
		if (attachments != null)
		{
			for (final ItemModel item : attachments)
			{
				if (item instanceof ReconfirmationConfigModel)
				{
					return (ReconfirmationConfigModel) item;
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
