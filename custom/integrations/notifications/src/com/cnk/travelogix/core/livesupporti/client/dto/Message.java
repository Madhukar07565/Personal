package com.cnk.travelogix.core.livesupporti.client.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Message {
	@JsonProperty("Username")
	public String username;
	@JsonProperty("Message")
	public String msg;
	
	@JsonProperty("Date")
	public String date;

	@JsonIgnore
	public String getUsername() {
		return username;
	}

	@JsonIgnore
	public void setUsername(String username) {
		this.username = username;
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
	public String getMsg() {
		return msg;
	}

	@JsonIgnore
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
