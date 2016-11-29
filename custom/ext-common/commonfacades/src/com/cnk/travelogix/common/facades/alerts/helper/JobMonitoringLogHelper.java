/**
 *
 */
package com.cnk.travelogix.common.facades.alerts.helper;

import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.operations.alerts.common.core.model.JobMonitoringLogModel;


/**
 * This class for updating the JobMonitorringLog for Alerts
 *
 */
public class JobMonitoringLogHelper
{
	private static final Logger LOG = Logger.getLogger(JobMonitoringLogHelper.class);

	@Autowired
	private ModelService modelService;

	/**
	 * Updating JobMonitoringLog for Alerts
	 *
	 * @param jobId
	 * @param alertName
	 * @param jobStatus
	 */
	public void updateJobMonitorLog(final String jobId, final String alertMessage, final String jobStatus)
	{
		final JobMonitoringLogModel jobMonitoringLog = getModelService().create(JobMonitoringLogModel.class);

		jobMonitoringLog.setJobTriggeredOn(new Date());
		jobMonitoringLog.setJobId(jobId);
		jobMonitoringLog.setAlertName(alertMessage);
		jobMonitoringLog.setJobStatus(jobStatus);
		jobMonitoringLog.setJobCompletedOn(new Date());

		try
		{
			modelService.save(jobMonitoringLog);
		}
		catch (final ModelSavingException e)
		{
			LOG.error("Exception occured while updating JobMonitorLog ", e);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occured while updating JobMonitorLog ", e);
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
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}
}
