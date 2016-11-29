package com.cnk.travelogix.service;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.user.UserService;

import com.cnk.travelogix.fb.userdata.FBUserInfo;


public abstract interface FacebookUserService extends UserService
{
	public abstract CustomerModel createCustomer(final FBUserInfo info);

	public abstract boolean isFacebookCustomer(final FBUserInfo info);

	public abstract FBUserInfo getFacebookUserinfo(final String token);

}
