package com.cnk.travelogix.service.impl;

import java.net.URLEncoder;

import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;

import com.google.api.services.oauth2.model.Userinfo;


public class GoogleAuthTemplateImpl extends GoogleAuthTemplate
{

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.air.auth.addon.service.impl.GoogleAuthTemplate#getUserInfo(java.lang.String)
	 */
	private static final String GOOGLE_AUTH_URL = "https://www.googleapis.com/oauth2/v3/tokeninfo?id_token=";

	private final Logger LOG = Logger.getLogger(GoogleAuthTemplateImpl.class);

	@Override
	public Userinfo getUserInfo(final String token)
	{

		try
		{
			final String concat = GOOGLE_AUTH_URL.concat(URLEncoder.encode(token));
			final RestTemplate restTemplate = new RestTemplate();
			final Userinfo forObject = restTemplate.getForObject(concat, Userinfo.class);
			return forObject;
		}
		catch (final Exception e)
		{
			LOG.info(e.getMessage());
		}

		return null;
	}

}
