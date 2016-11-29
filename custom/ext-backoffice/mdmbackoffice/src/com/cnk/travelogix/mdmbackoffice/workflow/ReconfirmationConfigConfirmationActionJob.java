/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.workflow;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;


/**
 * This Confirmation Action Job will Approve ReconfirmationConfig.
 *
 * @author C5244543
 *
 */
public class ReconfirmationConfigConfirmationActionJob extends AbstractReconfirmationConfigActionJob
{

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
			final ReconfirmationConfigModel configModel = getAttachedTravelLogic(actionModel);
			configModel.setApprovalStatus(ArticleApprovalStatus.APPROVED);
			getModelService().save(configModel);
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
}
