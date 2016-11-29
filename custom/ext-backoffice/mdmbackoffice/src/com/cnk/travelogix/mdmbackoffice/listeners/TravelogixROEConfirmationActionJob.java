/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.listeners;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.core.supplier.model.TravelogixROEModel;


/**
 * @author C5244548
 *
 */
public class TravelogixROEConfirmationActionJob extends AbstractTravelogixROEActionJob
{
	private static final Logger LOG = Logger.getLogger(TravelogixROEDeclineActionJob.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob#perform(de.hybris.platform.workflow.model.
	 * WorkflowActionModel)
	 */
	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel actionModel)
	{
		WorkflowDecisionModel decisionModel = null;
		if (LOG.isDebugEnabled())
		{
			LOG.debug("In Cofirm action in TravelogixROEConfirmationActionJob");
		}
		try
		{
			final TravelogixROEModel tRoeModel = getAttachedTravelLogic(actionModel);
			tRoeModel.setApprovalStatus(ArticleApprovalStatus.APPROVED);
			getModelService().save(tRoeModel);
			for (final WorkflowDecisionModel decision : actionModel.getDecisions())
			{
				return decisionModel = decision;
			}
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage() + "Exception in TravelogixROEConfirmationActionJob", e);
		}
		return decisionModel;
	}
}
