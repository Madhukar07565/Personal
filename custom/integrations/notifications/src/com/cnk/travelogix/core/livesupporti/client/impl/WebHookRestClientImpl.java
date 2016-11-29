package com.cnk.travelogix.core.livesupporti.client.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.cnk.travelogix.core.livesupporti.client.WebHookRestClient;
import com.cnk.travelogix.core.livesupporti.client.dto.WebHook;

import de.hybris.platform.servicelayer.config.ConfigurationService;

public class WebHookRestClientImpl extends CommonRestClientImpl<WebHook[], WebHook, String[]> implements WebHookRestClient{

	Logger LOG = Logger.getLogger(WebHookRestClientImpl.class);
	
	private static final String LIVE_SUPPORT_GET_ALL_WEBHOOKS_URL = "livesupport.get.all.webhooks.url";
	private static final String LIVE_SUPPORT_DELETE_AND_WEBHOOK_BY_ID_URL = "livesupport.delete.and.webhook.by.id.url";

	@Autowired
	private ConfigurationService configurationService;
	
	@Override
	public List<WebHook> getAllWebHooks() {
		LOG.info("#getAllWebHooks - START");
		String encodedUrl = encodeGetAllWebhooksUrl();
		WebHook[] webHooks = getAll(encodedUrl, WebHook[].class);
		return Arrays.asList(webHooks); 
	}

	@Override
	public WebHook getWebHookByID(String webHookID) {
		LOG.info("#getWebHookByID - START");
		String encodedUrl = encodeDeleteAndWebhookByIdUrl(webHookID);
		WebHook webHook = getById(encodedUrl, WebHook.class);
		return webHook;
	}

	@Override
	public void deleteWebHook(String webHookID) {
		LOG.info("#deleteWebHook - START");
		String encodedUrl = encodeDeleteAndWebhookByIdUrl(webHookID);
		delete(encodedUrl);	
	}

	public String encodeGetAllWebhooksUrl(){
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_WEBHOOKS_URL);
		final UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(liveSupportRestUrl);
		return builder.build(Boolean.TRUE).toUriString();
	}
	
	public String encodeDeleteAndWebhookByIdUrl(String webhookID){
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_DELETE_AND_WEBHOOK_BY_ID_URL);
		final UriComponents builder = UriComponentsBuilder.fromUriString(liveSupportRestUrl).buildAndExpand(webhookID);
		return builder.toString();
	}
	
}
