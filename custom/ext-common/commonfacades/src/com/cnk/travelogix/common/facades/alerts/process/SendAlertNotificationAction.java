package com.cnk.travelogix.common.facades.alerts.process;

import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.task.RetryLaterException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.common.facades.alert.service.AlertNotificationService;
import com.cnk.travelogix.common.facades.alerts.helper.JobMonitoringLogHelper;


/**
 * This class is for invoking workflow to send alert to the customer
 *
 */
@SuppressWarnings("rawtypes")
public class SendAlertNotificationAction extends AbstractSimpleDecisionAction
{
	private static final Logger LOG = Logger.getLogger(SendAlertNotificationAction.class);

	@Autowired
	private UserService userService;
	@Resource(name = "defaultAlertNotificationService")
	private AlertNotificationService defaultAlertNotificationService;
	@Resource(name = "jobMonitoringLogHelper")
	private JobMonitoringLogHelper jobMonitoringLogHelper;

	@Override
	public Transition executeAction(final BusinessProcessModel businessProcessModel) throws RetryLaterException, Exception
	{
		LOG.debug("-----SendAlertNotificationAction : executeAction() called ");
		String jobId = null;
		String alertName = null;
		try
		{
			jobId = businessProcessModel.getCode();
			alertName = businessProcessModel.getCode();

			defaultAlertNotificationService.sendNotification(jobId, alertName, "SUCCESS", null);
			return Transition.OK;
		}
		catch (final Exception e)
		{
			defaultAlertNotificationService.sendNotification(jobId, alertName, "FAILURE", null);
			LOG.error("Exception while saving the JobMonitoring log ", e);
			return Transition.NOK;
		}
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
}
