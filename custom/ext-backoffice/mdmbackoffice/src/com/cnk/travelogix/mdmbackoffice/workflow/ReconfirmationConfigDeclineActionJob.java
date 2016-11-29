/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.workflow;

import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;


/**
 * @author C5244548
 *
 */
public class ReconfirmationConfigDeclineActionJob extends AbstractReconfirmationConfigActionJob
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
			getModelService().remove(configModel);
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
