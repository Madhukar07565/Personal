package com.cnk.travelogix.core.livesupporti.facade;

import java.util.List;

import com.cnk.travelogix.core.livesupporti.client.dto.Agent;
import com.cnk.travelogix.core.livesupporti.client.dto.WebHook;
import com.cnk.travelogix.core.livesupporti.client.dto.WebHooks;

public interface WebHookFacade {

	public List<WebHook> getAllWebHooks();
	
	public WebHook getWebHookByID(String webHookID);
	
	public void deleteWebHook(String webHookID);
}
