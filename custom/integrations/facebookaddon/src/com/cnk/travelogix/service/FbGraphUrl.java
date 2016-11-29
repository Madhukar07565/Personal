package com.cnk.travelogix.service;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.cnk.travelogix.facebook.exceptions.CustomFacebookException;


/**
 * FbGraphUrl
 */
public class FbGraphUrl
{
	private static final Logger LOG = Logger.getLogger(FbGraphUrl.class);
	private final String accessToken;

	/**
	 * @param accessToken
	 */
	public FbGraphUrl(final String accessToken)
	{
		this.accessToken = accessToken;
	}

	public String getFBGraph()
	{
		final String graph = null;
		try
		{
			final String g = "https://graph.facebook.com/me?locale=en_US&fields=name,email&";
			final String concat = g.concat(URLEncoder.encode(accessToken));
			LOG.info("AuthUrl::" + concat);
			final RestTemplate rt = new RestTemplate();
			final String forObject = rt.getForObject(concat, String.class);
			LOG.info(forObject);
		}
		catch (final Exception e)
		{
			LOG.info("Error on requesting for a facebook and generating the FbGraph", e);
			throw new CustomFacebookException("ERROR in getting FB graph data. " + e);
		}
		return graph;
	}

	/**
	 * @param fbGraph
	 * @return fbProfile
	 */
	public Map<String, String> getGraphData(final String fbGraph)
	{
		final Map<String, String> fbProfile = new HashMap<>();
		try
		{
			final JSONObject json = new JSONObject(fbGraph);
			fbProfile.put("id", json.getString("id"));
			fbProfile.put("name", json.getString("name"));
			if (json.has("email"))
			{
				fbProfile.put("email", json.getString("email"));
			}
			if (json.has("gender"))
			{
				fbProfile.put("gender", json.getString("gender"));
			}
		}
		catch (final JSONException e)
		{
			LOG.info("Error on accessing the fields in json", e);
			throw new CustomFacebookException("ERROR in parsing FB graph data. " + e);
		}
		return fbProfile;
	}

}
