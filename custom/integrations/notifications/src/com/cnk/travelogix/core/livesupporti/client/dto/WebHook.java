package com.cnk.travelogix.core.livesupporti.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WebHook {
	
	@JsonProperty("Id")
	public String id;
	@JsonProperty("AgentId")
	public int agentId;
	@JsonProperty("Events")
	public List<String> events;
	@JsonProperty("WebHookUri")
	public String webHookUri;
	
	@JsonIgnore
	public String getId() {
		return id;
	}
	@JsonIgnore
	public void setId(String id) {
		this.id = id;
	}
	@JsonIgnore
	public int getAgentId() {
		return agentId;
	}
	@JsonIgnore
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public List<String> getEvents() {
		return events;
	}
	@JsonIgnore
	public void setEvents(List<String> events) {
		this.events = events;
	}
	@JsonIgnore
	public String getWebHookUri() {
		return webHookUri;
	}
	@JsonIgnore
	public void setWebHookUri(String webHookUri) {
		this.webHookUri = webHookUri;
	}
}
