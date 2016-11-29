/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.workflow;


import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import java.util.Map;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.enums.ApprovalWorkFlowStatus;



public class WorkflowQCApprovedActionJob extends AbstractWorkflowSubmitActionJob
{
	private Map workflowMap;

	private static final Logger LOG = Logger.getLogger(WorkflowQCApprovedActionJob.class);

	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel action)
	{
		final ItemModel itemModel = getSubmitRequest(action);

		//final String code = itemModel.getItemtype();

		//final List workflowList = (List) workflowMap.get(code);

		/*
		 * if (workflowList.size() > 2 && workflowList.contains("Finance_Approval_Workflow")) {
		 * setworkFlowStatus(itemModel, ApprovalWorkFlowStatus.SUPERVISOR_APPROVED);
		 * startTheNextTemplateWorkflow(itemModel, "Finance_Approval_Workflow"); LOG.info("Workflow for  " +
		 * itemModel.getItemtype() + " is SUPERVISOR Approved. Item sent for finance approval."); } else if
		 * (workflowList.size() > 1) {
		 */
		setworkFlowStatus(itemModel, ApprovalWorkFlowStatus.QC_APPROVED);
		startTheNextTemplateWorkflow(itemModel, "Publish_Approval_Workflow");
		LOG.info("Workflow for  " + itemModel.getItemtype() + " is QC Approved. Item sent for publish approval.");
		/* } */

		for (final WorkflowDecisionModel decision : action.getDecisions())
		{
			return decision;
		}
		return null;
	}

	/**
	 * @param workflowMap
	 *           the workflowMap to set
	 */
	public void setWorkflowMap(final Map workflowMap)
	{
		this.workflowMap = workflowMap;
	}


	/**
	 * @return the workflowMap
	 */
	public Map getWorkflowMap()
	{
		return workflowMap;
	}

}
