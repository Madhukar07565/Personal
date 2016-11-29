package com.cnk.travelogix.communication.process;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.model.email.EmailMessageModel;
import de.hybris.platform.acceleratorservices.process.email.actions.GenerateEmailAction;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.task.RetryLaterException;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.communication.model.CommunicationProcessModel;
import com.cnk.travelogix.communication.model.cms2.pages.CommunicationTemplateModel;


/**
 *
 */
public class CommunicationGenerateEmailAction extends GenerateEmailAction
{
	private static final Logger LOG = Logger.getLogger(CommunicationGenerateEmailAction.class);

	private CommunicationTemplateService communicationTemplateService;

	@Override
	public Transition executeAction(final BusinessProcessModel businessProcessModel) throws RetryLaterException
	{

		final CommunicationTemplateModel communicationModuleModel = ((CommunicationProcessModel) businessProcessModel)
				.getCommunication();


		final CatalogVersionModel contentCatalogVersion = getContextResolutionStrategy()
				.getContentCatalogVersion(businessProcessModel);
		if (contentCatalogVersion != null)
		{
			final EmailPageModel emailPageModel = getCmsEmailPageService()
					.getEmailPageForFrontendTemplate(getFrontendTemplateName(communicationModuleModel), contentCatalogVersion);

			if (emailPageModel != null)
			{
				final EmailMessageModel emailMessageModel = getEmailGenerationService().generate(businessProcessModel,
						emailPageModel);
				if (emailMessageModel != null)
				{
					final List<EmailMessageModel> emails = new ArrayList<EmailMessageModel>();
					emails.addAll(businessProcessModel.getEmails());
					emails.add(emailMessageModel);
					businessProcessModel.setEmails(emails);

					getModelService().save(businessProcessModel);

					LOG.info("Email message generated");
					return Transition.OK;
				}
				else
				{
					LOG.warn("Failed to generate email message");
				}
			}
			else
			{
				LOG.warn("Could not retrieve email page model for " + getFrontendTemplateName() + " and "
						+ contentCatalogVersion.getCatalog().getName() + ":" + contentCatalogVersion.getVersion()
						+ ", cannot generate email content");
			}
		}
		else
		{
			LOG.warn("Could not resolve the content catalog version, cannot generate email content");
		}

		return Transition.NOK;
	}

	protected String getFrontendTemplateName(final CommunicationTemplateModel module)
	{
		if (super.getFrontendTemplateName().endsWith("CommunicationEmailTemplate"))
		{
			return module.getUid();
		}
		return super.getFrontendTemplateName();
	}

	/**
	 * @return the communicationTemplateService
	 */
	public CommunicationTemplateService getCommunicationTemplateService()
	{
		return communicationTemplateService;
	}

	/**
	 * @param communicationTemplateService
	 *           the communicationTemplateService to set
	 */
	public void setCommunicationTemplateService(final CommunicationTemplateService communicationTemplateService)
	{
		this.communicationTemplateService = communicationTemplateService;
	}
}
