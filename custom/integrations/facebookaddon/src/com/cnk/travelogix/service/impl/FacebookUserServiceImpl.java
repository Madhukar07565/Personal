package com.cnk.travelogix.service.impl;

import de.hybris.platform.core.HybrisEnumValue;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.user.impl.DefaultUserService;

import com.cnk.travelogix.fb.userdata.FBUserInfo;
import com.cnk.travelogix.service.FacebookUserService;


/**
 *
 * FacebookUserServiceImpl class is to login in to hybris site using facebook details
 *
 */
public class FacebookUserServiceImpl extends DefaultUserService implements FacebookUserService
{
	private FacebookAuthTemplateImpl facebookAuthTemplate;
	private EnumerationService enumerationService;

	@Override
	public CustomerModel createCustomer(final FBUserInfo info)
	{
		final CustomerModel customerModel = getModelService().create(CustomerModel.class);
		customerModel.setUid(info.getEmail());
		customerModel.setName(info.getName());
		customerModel.setSocialId(info.getId());
		final HybrisEnumValue result = getEnumerationService().getEnumerationValue("SocialType", "Facebook");
		customerModel.setSocialId(result.getCode());
		getModelService().save(customerModel);
		return customerModel;
	}


	@Override
	public boolean isFacebookCustomer(final FBUserInfo info)
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


	@Override
	public FBUserInfo getFacebookUserinfo(final String token)
	{
		return getFacebookAuthTemplate().getUserInfo(token);
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


	/**
	 * @return the facebookAuthTemplate
	 */
	public FacebookAuthTemplateImpl getFacebookAuthTemplate()
	{
		return facebookAuthTemplate;
	}


	/**
	 * @param facebookAuthTemplate
	 *           the facebookAuthTemplate to set
	 */
	public void setFacebookAuthTemplate(final FacebookAuthTemplateImpl facebookAuthTemplate)
	{
		this.facebookAuthTemplate = facebookAuthTemplate;
	}





}
