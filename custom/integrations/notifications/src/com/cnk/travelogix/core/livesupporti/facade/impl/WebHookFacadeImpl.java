package com.cnk.travelogix.core.livesupporti.facade.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.core.livesupporti.client.WebHookRestClient;
import com.cnk.travelogix.core.livesupporti.client.dto.WebHook;
import com.cnk.travelogix.core.livesupporti.facade.WebHookFacade;

public class WebHookFacadeImpl implements WebHookFacade {

	Logger LOG = Logger.getLogger(WebHookFacadeImpl.class);

	@Resource(name = "webHookRestClient")
	WebHookRestClient webHookRestClient;

	@Override
	public List<WebHook> getAllWebHooks() {
		List<WebHook> webHooks = null;
		try {
			webHooks = webHookRestClient.getAllWebHooks();
		} catch (Exception e) {
			LOG.info(e.getMessage(), e);
		}
		return webHooks;
	}

	@Override
	public WebHook getWebHookByID(String webHookID) {
		WebHook webHook = null;
		try {
			webHook = webHookRestClient.getWebHookByID(webHookID);
		} catch (Exception e) {
			LOG.info(e.getMessage(), e);
		}
		return webHook;
	}

	@Override
	public void deleteWebHook(String webHookID) {
		try {
			webHookRestClient.deleteWebHook(webHookID);
		} catch (Exception e) {
			LOG.info(e.getMessage(), e);
		}
	}
}
