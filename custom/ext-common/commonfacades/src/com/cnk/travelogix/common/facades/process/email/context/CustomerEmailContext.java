/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package com.cnk.travelogix.common.facades.process.email.context;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.model.process.StoreFrontCustomerProcessModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.processengine.model.BusinessProcessParameterModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Required;


/**
 * Velocity context for a customer email.
 */
public class CustomerEmailContext extends AbstractEmailContext<StoreFrontCustomerProcessModel>
{
	private ModelService modelService;

	private Converter<UserModel, CustomerData> customerConverter;
	private CustomerData customerData;
	private String password;
	private String randomCode;

	@Override
	public void init(final StoreFrontCustomerProcessModel storeFrontCustomerProcessModel, final EmailPageModel emailPageModel)
	{
		super.init(storeFrontCustomerProcessModel, emailPageModel);
		customerData = getCustomerConverter().convert(getCustomer(storeFrontCustomerProcessModel));
		final Iterator<BusinessProcessParameterModel> iter = storeFrontCustomerProcessModel.getContextParameters().iterator();
		while (iter.hasNext())
		{
			final BusinessProcessParameterModel para = iter.next();
			final String name = para.getName();
			final String value = para.getValue().toString();
			if ("password".equals(name))
			{
				password = value;
				modelService.remove(para);
			}
			else if ("randomCode".equals(name))
			{
				randomCode = value;
			}
		}
		modelService.refresh(storeFrontCustomerProcessModel);
	}

	@Override
	protected BaseSiteModel getSite(final StoreFrontCustomerProcessModel storeFrontCustomerProcessModel)
	{
		return storeFrontCustomerProcessModel.getSite();
	}

	@Override
	protected CustomerModel getCustomer(final StoreFrontCustomerProcessModel storeFrontCustomerProcessModel)
	{
		return storeFrontCustomerProcessModel.getCustomer();
	}

	protected Converter<UserModel, CustomerData> getCustomerConverter()
	{
		return customerConverter;
	}

	@Required
	public void setCustomerConverter(final Converter<UserModel, CustomerData> customerConverter)
	{
		this.customerConverter = customerConverter;
	}

	public CustomerData getCustomer()
	{
		return customerData;
	}

	@Override
	protected LanguageModel getEmailLanguage(final StoreFrontCustomerProcessModel businessProcessModel)
	{
		return businessProcessModel.getLanguage();
	}

	public String getPassword()
	{
		return password;
	}

	@Override
	public String getToDisplayName()
	{
		return super.getToEmail();
	}

	public String getSecureActivateAccountUrl() throws UnsupportedEncodingException
	{
		return getSiteBaseUrlResolutionService().getWebsiteUrlForSite(getBaseSite(), getUrlEncodingAttributes(), true,
				"/register/activeAccount", "email=" + super.getToEmail() + "&strVer=" + randomCode);
	}

	public ModelService getModelService()
	{
		return modelService;
	}

	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}
}
