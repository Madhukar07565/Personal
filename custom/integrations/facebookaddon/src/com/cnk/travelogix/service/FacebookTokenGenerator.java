package com.cnk.travelogix.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.apache.log4j.Logger;

import com.cnk.travelogix.facebook.exceptions.CustomFacebookException;


/**
 * FacebookTokenGenerator class is to get the generated token from Facebook
 */
public class FacebookTokenGenerator
{
	public static final String FB_APP_ID = "263166187382090";
	public static final String FB_APP_SECRET = "de1950c87089f08436f57a3dd3e691ed";
	public static final String REDIRECT_URI = "https://localhost:9002/b2cstorefront/ezginb2c/en/facebookoauth2callback";
	private static final Logger LOG = Logger.getLogger(FacebookTokenGenerator.class);
	private String accessToken = "";

	public String getFBAuthUrl()
	{
		String fbLoginUrl = "";
		try
		{
			fbLoginUrl = "http://www.facebook.com/dialog/oauth?" + "client_id=" + FB_APP_ID + "&redirect_uri="
					+ URLEncoder.encode(REDIRECT_URI, "UTF-8") + "&scope=email";
		}
		catch (final UnsupportedEncodingException e)
		{
			LOG.info("Error on requesting for a facebook oauth for a token", e);
		}
		return fbLoginUrl;
	}

	/**
	 * @param code
	 * @return fbGraphUrl
	 */
	public String getFBGraphUrl(final String code)
	{
		String fbGraphUrl = "";
		try
		{
			fbGraphUrl = "https://graph.facebook.com/oauth/access_token?" + "client_id=" + FB_APP_ID + "&redirect_uri="
					+ URLEncoder.encode(REDIRECT_URI, "UTF-8") + "&client_secret=" + FB_APP_SECRET + "&code=" + code;
		}
		catch (final UnsupportedEncodingException e)
		{
			LOG.info("Error on authenticating the facebook token for a facebook oauth", e);
		}
		return fbGraphUrl;
	}

	/**
	 * @param code
	 * @return accessToken
	 */
	public String getAccessToken(final String code)
	{
		if ("".equals(accessToken))
		{
			URL fbGraphURL;
			try
			{
				fbGraphURL = new URL(getFBGraphUrl(code));
			}
			catch (final MalformedURLException e)
			{
				LOG.info("Error on accessing the token and validating the token", e);
				throw new CustomFacebookException("Invalid code received " + e);
			}
			URLConnection fbConnection;
			StringBuilder buffer = null;
			try
			{
				fbConnection = fbGraphURL.openConnection();
				BufferedReader in;
				in = new BufferedReader(new InputStreamReader(fbConnection.getInputStream()));
				String inputLine;
				buffer = new StringBuilder();
				while ((inputLine = in.readLine()) != null)
				{
					buffer.append(inputLine + "\n");
				}
				in.close();
			}
			catch (final IOException e)
			{
				LOG.info("Error on accessing the token and validating the token", e);
				throw new CustomFacebookException("Unable to connect with Facebook " + e);
			}
			accessToken = buffer.toString();
			if (accessToken.startsWith("{"))
			{
				throw new CustomFacebookException("ERROR: Access Token Invalid: " + accessToken);
			}
		}
		return accessToken;
	}
}
