package com.cnk.travelogix.core.livesupporti.client.dto;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ChatHistory {
	@JsonProperty("AgentId")
	public int agentId;
	@JsonProperty("AgentName")
	public String agentName;
	@JsonProperty("Visitor")
	public Visitor visitor;
	@JsonProperty("Date")
	public String date;
	@JsonProperty("Messages")
	public List<Message> messages = new ArrayList<>();
	@JsonProperty("Vote")
	public String vote;
	
	@JsonIgnore
	public int getAgentId() {
		return agentId;
	}
	@JsonIgnore
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	@JsonIgnore
	public String getAgentName() {
		return agentName;
	}
	@JsonIgnore
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	@JsonIgnore
	public Visitor getVisitor() {
		return visitor;
	}
	@JsonIgnore
	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}
	@JsonIgnore
	public String getDate() {
		return date;
	}
	@JsonIgnore
	public void setDate(String date) {
		this.date = date;
	}
	@JsonIgnore
	public List<Message> getMessages() {
		return messages;
	}
	@JsonIgnore
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	@JsonIgnore
	public String getVote() {
		return vote;
	}
	@JsonIgnore
	public void setVote(String vote) {
		this.vote = vote;
	}
	
}
