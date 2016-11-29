package com.cnk.travelogix.core.livesupporti.client.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)

public class Visitor {
	
	@JsonProperty("Name")
	public String name;
	@JsonProperty("Email")
	public String email;
	@JsonProperty("Phone")
	public String phone;
	
	@JsonIgnore
	public String getName() {
		return name;
	}
	@JsonIgnore
	public void setName(String name) {
		this.name = name;
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
	public String getPhone() {
		return phone;
	}
	
	@JsonIgnore
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
