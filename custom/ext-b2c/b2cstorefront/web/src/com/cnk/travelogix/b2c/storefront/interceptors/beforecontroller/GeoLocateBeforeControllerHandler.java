package com.cnk.travelogix.b2c.storefront.interceptors.beforecontroller;

import de.hybris.platform.acceleratorstorefrontcommons.interceptors.BeforeControllerHandler;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.session.SessionService;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;

import com.cnk.travelogix.b2c.facades.constants.B2cfacadesConstants;




public class GeoLocateBeforeControllerHandler implements BeforeControllerHandler
{
	private static final Logger LOG = Logger.getLogger(GeoLocateBeforeControllerHandler.class);
	private static final String GEOPLUGIN_URL = "geopluginurl";
	private static final String SEARCHPARAMS = "searchparams";
	private static final String TIMEOUT = "timeout";
	private static final String GEOLOCATETEST_IPADDRESS = "geolocatetestipaddress";
	private static final String LOADBALANCER_IPADDRESS = "loadbalanceripaddr";

	@Resource(name = "configurationService")
	private ConfigurationService configurationService;

	@Resource(name = "sessionService")
	private SessionService sessionService;

	@Override
	public boolean beforeController(final HttpServletRequest request, final HttpServletResponse response,
			final HandlerMethod handler) throws Exception
	{

		final String latitude = sessionService.getAttribute(B2cfacadesConstants.Latitude);
		final String logitude = sessionService.getAttribute(B2cfacadesConstants.Logitude);
		if (latitude == null && logitude == null)
		{
			String ipAddress = configurationService.getConfiguration().getString(GEOLOCATETEST_IPADDRESS);
			LOG.info("getPostalCountryMap Configured ip Address = " + ipAddress);
			if (StringUtils.isEmpty(ipAddress))
			{
				ipAddress = getIpAddress(request);
				LOG.info("getPostalCountryMap request.getRemoteAddr ip Address = " + ipAddress);
			}
			final String url = configurationService.getConfiguration().getString(GEOPLUGIN_URL) + ipAddress;
			LOG.info("getPostalCountryMap final geo plugin url = " + url);
			final String searchParams = configurationService.getConfiguration().getString(SEARCHPARAMS);
			final String userLocation = getLatitudeLogitide(request, url, searchParams);
			LOG.info("getPostalCountryMap userLocation = " + userLocation);

			final String[] latLong = userLocation.split(" ");
			if (latLong.length > 2)
			{
				sessionService.setAttribute(B2cfacadesConstants.Latitude, latLong[0]);
				sessionService.setAttribute(B2cfacadesConstants.Logitude, latLong[1]);
			}

		}
		return true;
	}

	public String getLatitudeLogitide(final HttpServletRequest request, final String url, final String searchParams)
	{
		LOG.info("start getLatitudeLogitide");
		final HttpClient httpClient = new HttpClient();
		String latitudeLogitude = "";
		try
		{
			httpClient.getHttpConnectionManager().getParams()
					.setConnectionTimeout(configurationService.getConfiguration().getInt(TIMEOUT));
			final PostMethod method = new PostMethod(url);
			method.setRequestHeader("Content-type", "text/xml; charset=ISO-8859-1");
			final int statusCode = httpClient.executeMethod(method);

			final String geoResponse = method.getResponseBodyAsString();
			LOG.info("getLatitudeLogitide statusCode " + statusCode + " geoResponse= " + geoResponse);
			final String[] paramsArray = searchParams.split(",");
			for (final String params : paramsArray)
			{
				latitudeLogitude = latitudeLogitude + StringUtils.substringBetween(geoResponse, params, "<") + " ";
			}
			LOG.info("getLatitudeLogitide latitudeLogitude = " + latitudeLogitude);
			method.releaseConnection();
		}
		catch (final IOException e)
		{
			LOG.error("exception in getLatitudeLogitide()", e);
		}
		return latitudeLogitude;
	}

	/*
	 * To get Postal Code of Corrent Location
	 */
	private String getIpAddress(final HttpServletRequest request)
	{
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null)
		{
			ip = request.getHeader("X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
		{
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
		{
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
		{
			ip = request.getRemoteAddr();
		}

		if (StringUtils.isNotEmpty(ip) && ip.contains(","))
		{
			String loadbalaceripaddr = configurationService.getConfiguration().getString(LOADBALANCER_IPADDRESS);
			if (loadbalaceripaddr == null)
			{
				loadbalaceripaddr = "";
			}
			LOG.debug("Load Balancer Ipaddress = " + loadbalaceripaddr);
			final String[] loadbalanceip = ip.split(",");
			for (final String ipaddr : loadbalanceip)
			{
				if (loadbalaceripaddr.indexOf(ipaddr) >= 0)
				{
					//
				}
				else
				{
					ip = ipaddr.trim();
					break;
				}
			}
		}
		return ip;
	}

}
