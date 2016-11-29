/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.core.flightview.fnbclient.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class FlightViewUpdateDeliverUrlResponse {
	@JsonProperty("UpdateDeliverUrlRequest")
	protected UpdateDeliverUrlRequest updateDeliverUrlRequest;
	@JsonProperty("Success")
	protected String success;
	@JsonProperty("Error")
	protected String error;

	/**
	 * @return the updateDeliverUrlRequest
	 */
	public UpdateDeliverUrlRequest getUpdateDeliverUrlRequest() {
		return updateDeliverUrlRequest;
	}

	/**
	 * @param updateDeliverUrlRequest the updateDeliverUrlRequest to set
	 */
	public void setUpdateDeliverUrlRequest(
			UpdateDeliverUrlRequest updateDeliverUrlRequest) {
		this.updateDeliverUrlRequest = updateDeliverUrlRequest;
	}

	/**
	 * @return the success
	 */
	@JsonIgnore
	public String getSuccess() {
		return success;
	}

	/**
	 * @param success
	 *            the success to set
	 */
	@JsonIgnore
	public void setSuccess(String success) {
		this.success = success;
	}

	/**
	 * @return the error
	 */
	@JsonIgnore
	public String getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	@JsonIgnore
	public void setError(String error) {
		this.error = error;
	}

}
