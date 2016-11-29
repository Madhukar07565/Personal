/**
 *
 */
package com.cnk.travelogix.communication.workflow;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import org.apache.log4j.Logger;

import com.cnk.travelogix.communication.model.cms2.pages.CommunicationTemplateModel;


/**
 * @author I319924
 *
 */
public class TemplateDeclineActionJob extends AbstractTemplateApprovalActionJob
{
	private static final Logger LOG = Logger.getLogger(TemplateDeclineActionJob.class);

	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel action)
	{
		final CommunicationTemplateModel template = getAttachedTemplate(action);

		LOG.info("Template " + template.getUid() + " Declined and will be notify.");

		template.setStatus(ArticleApprovalStatus.UNAPPROVED);
		template.setSaveFormWorkflow(true);
		for (final WorkflowDecisionModel decision : action.getDecisions())
		{
			return decision;
		}
		return null;
	}
}
