/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.listeners;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob;
import de.hybris.platform.workflow.model.WorkflowActionModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.supplier.core.supplier.model.TravelogixROEModel;


/**
 * @author C5244548
 *
 */
public abstract class AbstractTravelogixROEActionJob implements AutomatedWorkflowTemplateJob
{
	@Autowired
	private ModelService modelService;

	protected TravelogixROEModel getAttachedTravelLogic(final WorkflowActionModel action)
	{
		TravelogixROEModel roeModel = null;
		final List<ItemModel> attachments = action.getAttachmentItems();
		if (attachments != null)
		{
			for (final ItemModel item : attachments)
			{
				if (item instanceof TravelogixROEModel)
				{
					return roeModel = (TravelogixROEModel) item;
				}
			}
		}
		return roeModel;
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
