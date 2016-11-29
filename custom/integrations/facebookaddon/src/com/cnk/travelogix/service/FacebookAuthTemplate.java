package com.cnk.travelogix.service;

import com.cnk.travelogix.fb.userdata.FBUserInfo;


/**
 * Facebook Auth Template
 */
public interface FacebookAuthTemplate
{
	/**
	 * @param paramString
	 * @return FBUserInfo
	 */
	public FBUserInfo getUserInfo(String paramString);
}