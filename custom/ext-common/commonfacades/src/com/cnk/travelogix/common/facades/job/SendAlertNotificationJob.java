/**
 *
 */
package com.cnk.travelogix.common.facades.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.session.SessionService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.common.facades.alert.service.AlertNotificationService;


/**
 * This class is for invoking workflow in order to send the alerts to the user.
 *
 */
public class SendAlertNotificationJob extends AbstractJobPerformable<CronJobModel>
{
	private static final Logger LOG = Logger.getLogger(SendAlertNotificationJob.class);
	@Autowired
	private FlexibleSearchService flexibleSearchService;
	@Autowired
	private ModelService modelService;
	@Autowired
	private SessionService sessionService;
	@Resource(name = "defaultAlertNotificationService")
	private AlertNotificationService defaultAlertNotificationService;

	@Override
	public PerformResult perform(final CronJobModel cronJobModel)
	{
		LOG.debug("----------SendAlertNotificationJob : perform() called---------- ");
		final String jobId = cronJobModel.getJob().getCode();
		final String alertName = cronJobModel.getJob().getCode();

		try
		{
			defaultAlertNotificationService.sendNotification(jobId, alertName, "SUCCESS", null);
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
		catch (final Exception e)
		{
			defaultAlertNotificationService.sendNotification(jobId, alertName, "FAILURE", null);
			LOG.error("Exception while sending notification ", e);
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
}
