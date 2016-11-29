package com.cnk.travelogix.core.livesupporti.client.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class OfflineMessage {

	@JsonProperty("Id")
	public int id;
	
	@JsonProperty("Email")
	public String email;
	
	@JsonProperty("Message")
	public String message;
	
	@JsonProperty("Date")
	public String date;
	
	@JsonProperty("IsRead")
	public boolean isRead;
	
	@JsonProperty("URI")
	public String uRI;
	
	@JsonProperty("Phone")
	public Object phone;
	
	@JsonIgnore
	public int getId() {
		return id;
	}
	@JsonIgnore
	public void setId(int id) {
		this.id = id;
	}
	@JsonIgnore
	public String getEmail() {
		return email;
	}
	@JsonIgnore
	public void setEmail(String email) {
		this.email = email;
	}
	@JsonIgnore
	public String getMessage() {
		return message;
	}
	@JsonIgnore
	public void setMessage(String message) {
		this.message = message;
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
	public boolean isRead() {
		return isRead;
	}
	@JsonIgnore
	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
	@JsonIgnore
	public String getuRI() {
		return uRI;
	}
	@JsonIgnore
	public void setuRI(String uRI) {
		this.uRI = uRI;
	}
	@JsonIgnore
	public Object getPhone() {
		return phone;
	}
	@JsonIgnore
	public void setPhone(Object phone) {
		this.phone = phone;
	}

}
