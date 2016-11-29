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
public class WorkflowSupervisorApprovedActionJob extends AbstractWorkflowSubmitActionJob
{
	private static final Logger LOG = Logger.getLogger(WorkflowSupervisorApprovedActionJob.class);

	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel action)
	{
		final ItemModel itemModel = getSubmitRequest(action);
		setworkFlowStatus(itemModel, ApprovalWorkFlowStatus.SUPERVISOR_APPROVED);
		startTheNextTemplateWorkflow(itemModel, "Finance_Approval_Workflow");
		LOG.info("Workflow for  " + itemModel.getItemtype() + " is SUPERVISOR Approved. Item sent for finance approval.");
		for (final WorkflowDecisionModel decision : action.getDecisions())
		{
			return decision;
		}
		return null;
	}
}