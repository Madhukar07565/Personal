/**
 *
 */
package com.cnk.travelogix.common.core.captcha.services.impl;

import de.hybris.platform.servicelayer.config.ConfigurationService;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;

import javax.annotation.Resource;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.net.ssl.HttpsURLConnection;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.captcha.services.CaptchaService;


public class DefaultCaptchaService implements CaptchaService
{
	private static final Logger LOG = Logger.getLogger(DefaultCaptchaService.class);
	@Resource
	private ConfigurationService configurationService;

	@Override
	public boolean verify(final String gRecaptchaResponse, final String hostname)
	{
		if (gRecaptchaResponse == null || "".equals(gRecaptchaResponse))
		{
			return false;
		}
		final String url = configurationService.getConfiguration()
				.getString("com.cnk.travelogix.common.core.recaptcha.CaptchaUrlBackEnd");
		final String secret = configurationService.getConfiguration()
				.getString("com.cnk.travelogix.common.core.recaptcha.CaptchaSecretKey");
		final String acceptLanguage = configurationService.getConfiguration()
				.getString("com.cnk.travelogix.common.core.recaptcha.RequestLanguage");
		if (LOG.isDebugEnabled())
		{
			LOG.debug("CapchaUrl = " + url);//"https://www.google.com/recaptcha/api/siteverify"
			LOG.debug("CaptchaSecretKey = " + secret);//"6LcuAycTAAAAANxhvP2qR9-_vFZc8PlOE-Ze8FSU" regist in 'https://developers.google.com/recaptcha/'
		}
		try
		{
			final URL obj = new URL(url);
			final HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
			// add request header
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept-Language", acceptLanguage);
			final String postParams = "secret=" + secret + "&response=" + gRecaptchaResponse;
			// Send post request
			con.setDoOutput(true);
			final DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(postParams);
			wr.flush();
			wr.close();
			final int responseCode = con.getResponseCode();
			if (LOG.isDebugEnabled())
			{
				LOG.debug("\nSending 'POST' request to URL : " + url);
				LOG.debug("Post parameters : " + postParams);
				LOG.debug("Response Code : " + responseCode);
			}
			final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			final StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null)
			{
				response.append(inputLine);
			}
			in.close();
			//parse JSON response and return 'success' value
			final JsonReader jsonReader = Json.createReader(new StringReader(response.toString()));
			final JsonObject jsonObject = jsonReader.readObject();
			jsonReader.close();
			if (!jsonObject.getString("hostname").equals(hostname))
			{
				LOG.error("The hostname is not correct!");
				return false;
			}
			return jsonObject.getBoolean("success");
		}
		catch (final Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void customizeReCaptcha(final RecaptchaAttribute attr, final String val)
	{
		configurationService.getConfiguration().setProperty(attr.getValue(), val);
	}

}
