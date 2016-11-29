/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.workflow;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.enums.ApprovalWorkFlowStatus;


/**
 *
 */
public class WorkflowFinanceApprovedActionJob extends AbstractWorkflowSubmitActionJob
{
	private static final Logger LOG = Logger.getLogger(WorkflowFinanceApprovedActionJob.class);

	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel action)
	{
		final ItemModel itemModel = getSubmitRequest(action);
		setworkFlowStatus(itemModel, ApprovalWorkFlowStatus.FINANCE_APPROVED);
		getModelService().save(itemModel);
		getModelService().refresh(itemModel);

		LOG.info("Workflow for  " + itemModel.getItemtype() + " is FINANCE Approved.");

		for (final WorkflowDecisionModel decision : action.getDecisions())
		{
			return decision;
		}
		return null;
	}
}