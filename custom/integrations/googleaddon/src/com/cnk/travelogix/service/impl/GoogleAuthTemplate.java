package com.cnk.travelogix.service.impl;

import com.google.api.services.oauth2.model.Userinfo;



public abstract class GoogleAuthTemplate
{
	public abstract Userinfo getUserInfo(String paramString);
}
