package com.cnk.travelogix.communication;

import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.user.UserService;

import javax.annotation.Resource;

import com.cnk.travelogix.communication.model.CommunicationProcessModel;


public class CommunicationEmailContext extends AbstractEmailContext<CommunicationProcessModel>
{

	@Resource
	private UserService userService;

	@Override
	protected BaseSiteModel getSite(final CommunicationProcessModel businessProcessModel)
	{
		// YTODO Auto-generated method stub
		return businessProcessModel.getCommunication().getSite();
	}

	@Override
	protected CustomerModel getCustomer(final CommunicationProcessModel businessProcessModel)
	{
		// YTODO Auto-generated method stub
		// Needs to remove User with Session user
		return (CustomerModel) userService.getUserForUID("zohan@customer.com");
	}

	@Override
	protected LanguageModel getEmailLanguage(final CommunicationProcessModel businessProcessModel)
	{
		return businessProcessModel.getCommunication().getSite().getDefaultLanguage();
	}
}