package com.cnk.travelogix.core.livesupporti.client.dto;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ChatHistories {

	@JsonProperty("Paging")
	public Paging paging;

	@JsonProperty("Data")
	public List<ChatHistory> data = new ArrayList<>();

	@JsonIgnore
	public Paging getPaging() {
		return paging;
	}

	@JsonIgnore
	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	@JsonIgnore
	public void setData(List<ChatHistory> data) {
		this.data = data;
	}

	@JsonIgnore
	public List<ChatHistory> getData() {
		return data;
	}

}
