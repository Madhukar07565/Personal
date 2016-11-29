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
public class Agents {

	@JsonProperty("Data")
	public List<Agent> data = new ArrayList<>();
	@JsonIgnore
	public List<Agent> getData() {
		return data;
	}
	@JsonIgnore
	public void setData(List<Agent> data) {
		this.data = data;
	}
	
}
