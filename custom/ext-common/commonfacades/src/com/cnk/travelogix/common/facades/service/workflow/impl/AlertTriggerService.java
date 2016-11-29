/**
 *
 */
package com.cnk.travelogix.common.facades.service.workflow.impl;

import de.hybris.platform.core.Registry;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.TriggerModel;
import de.hybris.platform.servicelayer.cronjob.impl.DefaultTriggerService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.workflow.enums.WorkflowActionType;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowModel;

import org.apache.log4j.Logger;


/**
 * This class is for tracking recurrence count for the Workflow
 *
 */
public class AlertTriggerService extends DefaultTriggerService
{
	private static final Logger LOG = Logger.getLogger(AlertTriggerService.class);

	@Override
	public void activate(final TriggerModel trigger)
	{
		final ModelService modelService = Registry.getApplicationContext().getBean("modelService", ModelService.class);
		boolean isActivate = true;

		try
		{
			super.activate(trigger);
		}
		catch (final Exception e)
		{
			isActivate = false;
			LOG.error(
					"Exception occured while activating trigger for workflow model code - " + trigger.getCronJob().getCode() + "-", e);
		}
		if (isActivate)
		{
			final CronJobModel cronJobModel = trigger.getCronJob();
			if (cronJobModel instanceof WorkflowModel)
			{
				final WorkflowModel workflowModel = (WorkflowModel) cronJobModel;
				final WorkflowActionModel action = workflowModel.getActions().stream()
						.filter(x -> x.getActionType() == WorkflowActionType.START).findFirst().orElse(null);
				if (null != action)
				{
					action.setRecurrenceCount(new Integer(action.getRecurrenceCount().intValue() + 1));
					modelService.save(action);
				}
			}
		}
	}
}
