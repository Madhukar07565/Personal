/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.listeners;

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

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;


/**
 * This Implementation class of AfterSaveListener interface interact when Reconfiguration Config will create. And
 * involved the approval workflow.
 *
 * @author C5244543
 *
 */
public class ReconfirmationConfigAfterSaveListener implements AfterSaveListener
{

	@Autowired
	private WorkflowService workflowService;

	@Resource
	private WorkflowTemplateService workflowTemplateService;

	@Resource
	private WorkflowProcessingService workflowProcessingService;

	@Resource
	private UserService userService;

	@Resource
	private ModelService modelService;
	private static final Logger LOG = Logger.getLogger(WorkflowAfterSaveListener.class);

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
			if (AfterSaveEvent.CREATE == type)
			{
				final PK pk = event.getPk();
				//The ReconfirmationConfig deployment code is "22121"
				if (22121 == pk.getTypeCode())
				{
					final ReconfirmationConfigModel reconfirmationConfigModel = (ReconfirmationConfigModel) modelService.get(pk);
					if (!reconfirmationConfigModel.getApprovalStatus().equals(ArticleApprovalStatus.APPROVED))
					{
						LOG.info("*************Reconfirmation Config Workflow Start************");

						final WorkflowTemplateModel workflowTemplate = this.workflowTemplateService
								.getWorkflowTemplateForCode("reconfirmationConfigWorkflowTemplate");

						final WorkflowModel workflow = this.workflowService.createWorkflow(workflowTemplate, reconfirmationConfigModel,
								userService.getAdminUser());
						modelService.save(workflow);
						for (final WorkflowActionModel action : workflow.getActions())
						{
							modelService.save(action);
						}
						this.workflowProcessingService.startWorkflow(workflow);
						LOG.info("*************Reconfirmation Config Workflow End************");
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

}
