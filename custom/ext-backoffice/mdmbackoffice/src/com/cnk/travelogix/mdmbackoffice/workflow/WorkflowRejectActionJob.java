/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.workflow;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.enums.ApprovalWorkFlowStatus;
import com.cnk.travelogix.product.transport.masters.core.model.AirRouteModel;


/**
 * Work flow rejection Action
 *
 */
public class WorkflowRejectActionJob extends AbstractWorkflowSubmitActionJob
{
	private static final Logger LOG = Logger.getLogger(WorkflowRejectActionJob.class);

	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel action)
	{
		final ItemModel itemModel = getSubmitRequest(action);

		LOG.info("Workflow for " + itemModel.getItemtype() + "is  Rejected.");

		setworkFlowStatus(itemModel, ApprovalWorkFlowStatus.DRAFT);

		if (itemModel instanceof AirRouteModel)
		{
			final AirRouteModel airRouteModel = (AirRouteModel) itemModel;
			airRouteModel.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
		}
		getModelService().save(itemModel);
		getModelService().refresh(itemModel);

		for (final WorkflowDecisionModel decision : action.getDecisions())
		{
			return decision;
		}
		return null;
	}
}
