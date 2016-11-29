/**
 *
 */
package com.cnk.travelogix.operations.workflow;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import org.apache.log4j.Logger;


/**
 * @author C5244544
 *
 */
public class DefaultTimeLimitBookingDeclineJob extends AbstractTimeLimitBookingActionJob
{
	private static final Logger LOG = Logger.getLogger(DefaultTimeLimitBookingDeclineJob.class);


	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob#perform(de.hybris.platform.workflow.model.
	 * WorkflowActionModel)
	 */
	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel action)
	{
		final OrderModel orderModel = getAttachedOrderModel(action);
		LOG.info("Workflow for " + orderModel.getItemtype() + "is  Rejected.");

		for (final WorkflowDecisionModel decision : action.getDecisions())
		{
			return decision;
		}
		// YTODO Auto-generated method stub
		return null;
	}

}
