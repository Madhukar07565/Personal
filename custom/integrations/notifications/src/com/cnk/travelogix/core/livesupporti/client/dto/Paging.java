package com.cnk.travelogix.core.livesupporti.client.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)

public class Paging {

	@JsonProperty("PageNo")
	public int pageNo;
	
	@JsonProperty("PageSize")
	public int pageSize;
	
	@JsonProperty("PageCount")
	public int pageCount;
	
	@JsonProperty("TotalRecordCount")
	public int totalRecordCount;
	
	@JsonIgnore
	public int getPageNo() {
		return pageNo;
	}

	@JsonIgnore
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	@JsonIgnore
	public int getPageSize() {
		return pageSize;
	}

	@JsonIgnore
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@JsonIgnore
	public int getPageCount() {
		return pageCount;
	}

	@JsonIgnore
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@JsonIgnore
	public int getTotalRecordCount() {
		return totalRecordCount;
	}

	@JsonIgnore
	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	

}
