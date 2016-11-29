package com.cnk.travelogix.core.livesupporti.client;

import java.util.List;

import com.cnk.travelogix.core.livesupporti.client.dto.Agent;
import com.cnk.travelogix.core.livesupporti.client.dto.WebHook;

public interface WebHookRestClient {
	
	public List<WebHook> getAllWebHooks();
	
	public WebHook getWebHookByID(String webHookID);
	
	public void deleteWebHook(String webHookID);
}
