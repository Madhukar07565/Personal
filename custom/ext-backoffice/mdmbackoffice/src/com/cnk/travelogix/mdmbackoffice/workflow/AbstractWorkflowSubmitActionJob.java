/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.workflow;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;
import de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowModel;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.enums.ApprovalWorkFlowStatus;




public abstract class AbstractWorkflowSubmitActionJob implements AutomatedWorkflowTemplateJob
{
	private WorkflowTemplateService workflowTemplateService;
	private WorkflowProcessingService workflowProcessingService;
	private UserService userService;
	private ModelService modelService;
	private WorkflowService workflowService;

	private static final Logger LOG = Logger.getLogger(AbstractWorkflowSubmitActionJob.class);

	protected ItemModel getSubmitRequest(final WorkflowActionModel action)
	{
		final List<ItemModel> attachments = action.getAttachmentItems();
		if (attachments != null && attachments.size() == 1)
		{
			return attachments.get(0);
		}
		return null;
	}

	protected void setworkFlowStatus(final ItemModel item, final ApprovalWorkFlowStatus status)
	{
		Method method = null;
		try
		{
			method = item.getClass().getMethod("setWorkFlowStatus", ApprovalWorkFlowStatus.class);
		}
		catch (NoSuchMethodException | SecurityException e1)
		{
			LOG.error(e1);
		}
		try
		{
			if (method != null)
			{
				method.invoke(item, status);
				modelService.save(item);
				modelService.refresh(item);
			}
		}
		catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
		{
			LOG.error(e);
		}
	}

	protected Object getWorkFlowStatus(final ItemModel item)
	{
		Method method = null;
		try
		{
			method = item.getClass().getMethod("getWorkFlowStatus");
		}
		catch (NoSuchMethodException | SecurityException e1)
		{
			LOG.error(e1);
		}

		try
		{
			if (method != null)
			{
				return method.invoke(item);
			}
		}
		catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
		{
			LOG.error(e);
		}
		return null;
	}


	/**
	 *
	 */
	protected void startTheNextTemplateWorkflow(final ItemModel itemModel, final String templateCode)
	{
		final WorkflowTemplateModel workflowTemplate = this.workflowTemplateService.getWorkflowTemplateForCode(templateCode);

		if (workflowTemplate != null)
		{
			final WorkflowModel workflow = workflowService.createWorkflow(workflowTemplate, itemModel,
					userService.getUserForUID(workflowTemplate.getOwner().getUid()));
			modelService.save(itemModel);
			for (final WorkflowActionModel action : workflow.getActions())
			{
				modelService.save(action);
			}
			this.workflowProcessingService.startWorkflow(workflow);
			LOG.info("*********** workflow started ************* ");
		}
		else
		{
			LOG.info("*********** workflow template missing ! ************* ");
		}
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
