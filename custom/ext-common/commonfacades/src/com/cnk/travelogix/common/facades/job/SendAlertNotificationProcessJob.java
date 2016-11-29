
package com.cnk.travelogix.common.facades.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.common.facades.alerts.helper.JobMonitoringLogHelper;



/**
 * This class is meant for invoking workflow in order to send the alerts to the user.
 *
 */
public class SendAlertNotificationProcessJob extends AbstractJobPerformable<CronJobModel>
{
	private static final Logger LOG = Logger.getLogger(SendAlertNotificationJob.class);
	@Autowired
	private FlexibleSearchService flexibleSearchService;
	@Autowired
	private ModelService modelService;
	@Autowired
	private SessionService sessionService;
	@Autowired
	private WorkflowService workflowService;
	@Autowired
	private WorkflowTemplateService workflowTemplateService;
	@Autowired
	private WorkflowProcessingService workflowProcessingService;
	@Autowired
	private UserService userService;
	@Resource(name = "jobMonitoringLogHelper")
	private JobMonitoringLogHelper jobMonitoringLogHelper;
	@Resource(name = "businessProcessService")
	private BusinessProcessService businessProcessService;


	@Override
	public PerformResult perform(final CronJobModel cronJobModel)
	{
		try
		{
			LOG.info("----------Starting business process------");
			final BusinessProcessModel businessProcessModel = businessProcessService
					.createProcess("triggerWorkflow" + System.currentTimeMillis(), "workflowTriggerProcess");
			modelService.save(businessProcessModel);
			businessProcessService.startProcess(businessProcessModel);
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
		catch (final Exception e)
		{
			LOG.error("Exception while executing workflow " + e.getMessage());
			e.printStackTrace();
			return new PerformResult(CronJobResult.FAILURE, CronJobStatus.ABORTED);
		}
	}

	/**
	 * Overridden in order to abort the Cronjob from HMC.
	 */
	@Override
	public boolean isAbortable()
	{
		return true;
	}

	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 */
	@Override
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
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
	 */
	@Override
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the sessionService
	 */
	public SessionService getSessionService()
	{
		return sessionService;
	}

	/**
	 * @param sessionService
	 */
	@Override
	public void setSessionService(final SessionService sessionService)
	{
		this.sessionService = sessionService;
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
	 */
	public void setWorkflowTemplateService(final WorkflowTemplateService workflowTemplateService)
	{
		this.workflowTemplateService = workflowTemplateService;
	}

}

