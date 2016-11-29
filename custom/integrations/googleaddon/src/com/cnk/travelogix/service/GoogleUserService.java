package com.cnk.travelogix.service;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.user.UserService;

import com.google.api.services.oauth2.model.Userinfo;



public abstract interface GoogleUserService extends UserService
{

	public abstract CustomerModel createCustomer(final Userinfo info);

	public abstract boolean isGoogleCustomer(final Userinfo info);

	public abstract Userinfo getGoogleUserinfo(final String token);

}
