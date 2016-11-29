package com.cnk.travelogix.service.impl;

import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;

import com.cnk.travelogix.fb.userdata.FBUserInfo;
import com.cnk.travelogix.service.FacebookAuthTemplate;


/**
 * FacebookAuthTemplateImpl class is to authenticate the token
 */
public class FacebookAuthTemplateImpl implements FacebookAuthTemplate
{
	private static final String FACEBOOK_AUTH_URL = "https://graph.facebook.com/me?locale=en_US&fields=name,email&";
	private static final Logger LOG = Logger.getLogger(FacebookAuthTemplateImpl.class);

	@Override
	public FBUserInfo getUserInfo(final String token)
	{
		try
		{
			LOG.info("accessToken" + token);
			final String concat = FACEBOOK_AUTH_URL.concat(token);
			LOG.info("AuthUrl::" + concat);
			final RestTemplate restTemplate = new RestTemplate();
			return restTemplate.getForObject(concat, FBUserInfo.class);
		}
		catch (final Exception e)
		{
			LOG.info("Error on reading the user information from facebook oauth" + e);
		}
		return null;
	}

}
