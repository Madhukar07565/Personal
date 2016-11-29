/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.listeners;

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

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.supplier.core.supplier.model.TravelogixROEModel;


/**
 * @author C5244548
 *
 */
public class TravelogixROEAfterSaveListener implements AfterSaveListener
{

	@Autowired
	private ModelService modelService;
	@Autowired
	private UserService userService;
	@Autowired
	private WorkflowTemplateService workflowTemplateService;
	@Autowired
	private WorkflowService workflowService;
	@Autowired
	private WorkflowProcessingService workflowProcessingService;

	final private int DEPLOYEMENT_CODE = 22176;

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
			//The TravelogixROE deployment code is "22176"
			final PK pk = event.getPk();
			if (AfterSaveEvent.CREATE == type && DEPLOYEMENT_CODE == pk.getTypeCode())
			{
				final TravelogixROEModel model = modelService.get(pk);

				final WorkflowTemplateModel workflowTemplate = this.workflowTemplateService
						.getWorkflowTemplateForCode("TravelogixROEWorkflowTemplate");

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
