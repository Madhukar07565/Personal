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
public class TemplateConfirmationActionJob extends AbstractTemplateApprovalActionJob
{
	private static final Logger LOG = Logger.getLogger(TemplateConfirmationActionJob.class);

	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel action)
	{
		final CommunicationTemplateModel template = getAttachedTemplate(action);

		LOG.info("Template " + template.getUid() + " confirmed. Confirmation email will be sent.");

		if (!(template.getStatus().equals(ArticleApprovalStatus.APPROVED)))
		{
			template.setStatus(ArticleApprovalStatus.APPROVED);
			template.setSaveFormWorkflow(true);
			getModelService().save(template);
		}

		for (final WorkflowDecisionModel decision : action.getDecisions())
		{
			return decision;
		}
		return null;
	}
}
