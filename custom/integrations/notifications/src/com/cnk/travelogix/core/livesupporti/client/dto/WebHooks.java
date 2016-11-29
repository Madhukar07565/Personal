package com.cnk.travelogix.core.livesupporti.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WebHooks {

	@JsonProperty("WebHooks")
	public List<WebHook> webHooks;

	@JsonIgnore
	public List<WebHook> getWebHooks() {
		return webHooks;
	}

	@JsonIgnore
	public void setWebHooks(List<WebHook> webHooks) {
		this.webHooks = webHooks;
	}
	
	
}
