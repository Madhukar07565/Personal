package com.cnk.travelogix.core.livesupporti.client.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BannedVisitor {
	@JsonProperty("Id")
	public int id;
	@JsonProperty("AgentId")
	public int agentId;
	@JsonProperty("IP")
	public String ip;
	@JsonProperty("Reason")
	public String reason;
	@JsonProperty("DateAdded")
	public String dateAdded;

	@JsonIgnore
	public int getId() {
		return id;
	}

	@JsonIgnore
	public void setId(int id) {
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

	@JsonIgnore
	public String getIp() {
		return ip;
	}

	@JsonIgnore
	public void setIp(String ip) {
		this.ip = ip;
	}

	@JsonIgnore
	public String getReason() {
		return reason;
	}

	@JsonIgnore
	public void setReason(String reason) {
		this.reason = reason;
	}

	@JsonIgnore
	public String getDateAdded() {
		return dateAdded;
	}

	@JsonIgnore
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
}
