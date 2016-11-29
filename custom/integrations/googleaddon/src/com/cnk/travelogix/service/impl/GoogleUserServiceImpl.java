package com.cnk.travelogix.service.impl;

import de.hybris.platform.core.HybrisEnumValue;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.user.impl.DefaultUserService;

import org.apache.log4j.Logger;

import com.cnk.travelogix.service.GoogleUserService;
import com.google.api.services.oauth2.model.Userinfo;


/**
 *
 * GoogleUserServiceImpl class is to create a user using google user details
 *
 */
public class GoogleUserServiceImpl extends DefaultUserService implements GoogleUserService
{
	private GoogleAuthTemplate googleAuthTemplate;
	private EnumerationService enumerationService;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.air.auth.addon.service.GooglePlusUserService#createCustomer(java.lang.String)
	 */
	@Override
	public CustomerModel createCustomer(final Userinfo info)
	{
		final CustomerModel customerModel = getModelService().create(CustomerModel.class);
		customerModel.setUid(info.getEmail());
		customerModel.setName(info.getName());
		customerModel.setSocialId(info.getId());
		final HybrisEnumValue result = getEnumerationService().getEnumerationValue("SocialType", "GooglePlus");
		customerModel.setSocialId(result.getCode());
		getModelService().save(customerModel);
		return customerModel;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.air.auth.addon.service.GooglePlusUserService#isGoogleCustomer(java.lang.String)
	 */
	@Override
	public boolean isGoogleCustomer(final Userinfo info)
	{
		final UserModel user = getUserForUID(info.getEmail());
		if (user instanceof CustomerModel)
		{
			final HybrisEnumValue result = enumerationService.getEnumerationValue("SocialType", "GooglePlus");
			if (result.getCode().equals(((CustomerModel) user).getSocialType()))
			{
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.air.auth.addon.service.GooglePlusUserService#getGoogleUserinfo(java.lang.String)
	 */
	@Override
	public Userinfo getGoogleUserinfo(final String token)
	{
		return googleAuthTemplate.getUserInfo(token);
	}

	/**
	 * @return the googleAuthTemplate
	 */
	public GoogleAuthTemplate getGoogleAuthTemplate()
	{
		return googleAuthTemplate;
	}

	/**
	 * @param googleAuthTemplate
	 *           the googleAuthTemplate to set
	 */
	public void setGoogleAuthTemplate(final GoogleAuthTemplate googleAuthTemplate)
	{
		this.googleAuthTemplate = googleAuthTemplate;
	}

	/**
	 * @return the enumerationService
	 */
	public EnumerationService getEnumerationService()
	{
		return enumerationService;
	}

	/**
	 * @param enumerationService
	 *           the enumerationService to set
	 */
	public void setEnumerationService(final EnumerationService enumerationService)
	{
		this.enumerationService = enumerationService;
	}
}
