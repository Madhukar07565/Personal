/**
 *
 */
package com.cnk.travelogix.operations.workflow;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import java.util.Date;

import com.cnk.travelogix.operations.services.TimeLimitBookingService;


/**
 * @author C5244544
 *
 */
public class DefaultTimeLimitBookingConfirmationJob extends AbstractTimeLimitBookingActionJob
{
	private TimeLimitBookingService timeLimitBookingService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob#perform(de.hybris.platform.workflow.model.
	 * WorkflowActionModel)
	 */
	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel actionModel)
	{
		try
		{
			final OrderModel orderModel = getAttachedOrderModel(actionModel);
			// Date is the temporary date coming from front End.
			final Date date = orderModel.getTempTimeLimit();
			timeLimitBookingService.updateTimeLimit(orderModel, date);
			for (final WorkflowDecisionModel decision : actionModel.getDecisions())
			{
				return decision;
			}
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param timeLimitBookingService
	 *           the timeLimitBookingService to set
	 */
	public void setTimeLimitBookingService(final TimeLimitBookingService timeLimitBookingService)
	{
		this.timeLimitBookingService = timeLimitBookingService;
	}

	/**
	 * @return the timeLimitBookingService
	 */
	public TimeLimitBookingService getTimeLimitBookingService()
	{
		return timeLimitBookingService;
	}


}