package com.cnk.travelogix.suppliers.cronjob;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.suppliers.model.CheckFileStatusCronJobModel;
import com.cnk.travelogix.suppliers.service.CheckFileStatusService;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.model.ModelService;

/**
 * The Class CheckFileStatusJob.
 */
public class CheckFileStatusJob extends AbstractJobPerformable<CheckFileStatusCronJobModel> {

	/** The Constant LOGGER. */
	private static final Logger LOG = Logger.getLogger(CheckFileStatusJob.class);

	/** The CheckFileStatusService. */
	@Autowired
	private CheckFileStatusService checkFileStatusService;

	@Autowired
	private ModelService modelService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable#perform(de
	 * .hybris.platform.cronjob.model.CronJobModel)
	 */

	@Override
	public PerformResult perform(final CheckFileStatusCronJobModel cronJobModel) {

		try {
			LOG.info("Starting the CheckFileStatus job...... ");
			Date endTime = null;
			if (null != cronJobModel.getLastRunTime()) {
				endTime = cronJobModel.getLastRunTime();
			} else {
				endTime = new Date();
			}
			checkFileStatusService.getlistofFile(endTime);
			LOG.info("CheckFileStatus Job is completed successfully.");
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		} catch (final Exception e) {
			LOG.error("Some Error occured while executing the CheckFileStatus Job.", e);
			return new PerformResult(CronJobResult.FAILURE, CronJobStatus.ABORTED);
		} finally {
			cronJobModel.setLastRunTime(cronJobModel.getStartTime());
			try {
				LOG.info("Saving the cron job model after saving the last run time.");
				modelService.save(cronJobModel);
			} catch (final ModelSavingException mse) {
				LOG.error("Error in saving the cron job model.", mse);
			}
		}
	}

	@Override
	public boolean isAbortable() {
		return false;
	}

	@Override
	public boolean isPerformable() {
		return true;
	}
}