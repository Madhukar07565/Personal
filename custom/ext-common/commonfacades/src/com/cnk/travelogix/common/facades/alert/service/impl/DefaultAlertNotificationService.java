/**
 *
 */
package com.cnk.travelogix.common.facades.alert.service.impl;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.util.Config;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;
import de.hybris.platform.workflow.enums.WorkflowActionType;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowModel;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.common.facades.alert.service.AlertNotificationService;
import com.cnk.travelogix.common.facades.alerts.helper.JobMonitoringLogHelper;


/**
 * This class is for invoking workflow in order to send the alerts to the user.
 *
 */
public class DefaultAlertNotificationService implements AlertNotificationService
{
	private static final Logger LOG = Logger.getLogger(DefaultAlertNotificationService.class);

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
	@Resource(name = "jobMonitoringLogHelper")
	private JobMonitoringLogHelper jobMonitoringLogHelper;

	/**
	 * Invoking the Alert Notification Workflow
	 */
	@Override
	public void sendNotification(final String jobId, final String alertMessage, final String jobStatus,
			final EmployeeModel employeeModel)
	{
		LOG.debug("---AlertNotificationService : sendNotification() called ");

		final WorkflowTemplateModel workflowTemplate = workflowTemplateService
				.getWorkflowTemplateForCode(Config.getParameter("alert.notification.template.code"));
		final WorkflowModel workflow = workflowService.createWorkflow(workflowTemplate, workflowTemplate.getOwner());

		final WorkflowActionModel action = workflow.getActions().stream().filter(x -> x.getActionType() == WorkflowActionType.START)
				.findFirst().orElse(null);

		if (null != action && null != employeeModel)
		{
			try
			{
				action.setPrincipalAssigned(employeeModel);
				action.setIsAlert(Boolean.TRUE);
				action.setName(alertMessage);
				modelService.save(action);
			}
			catch (final Exception e)
			{
				LOG.error("Exception occured while setting PrincipalAssigned  to action - ", e);
			}
		}
		try
		{
			modelService.save(workflow);
			workflowProcessingService.startWorkflow(workflow);
			jobMonitoringLogHelper.updateJobMonitorLog(jobId, alertMessage, jobStatus);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while sending alert - ", e);
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



}
