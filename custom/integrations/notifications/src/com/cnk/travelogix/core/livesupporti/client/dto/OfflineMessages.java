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
public class OfflineMessages {
	@JsonProperty("Data")
	public List<OfflineMessage> data = new ArrayList<>();
	
	@JsonProperty("Paging")
	public Paging paging;
	
	@JsonIgnore
	public List<OfflineMessage> getData() {
		return data;
	}
	@JsonIgnore
	public void setData(List<OfflineMessage> data) {
		this.data = data;
	}
	@JsonIgnore
	public Paging getPaging() {
		return paging;
	}
	@JsonIgnore
	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	
}
