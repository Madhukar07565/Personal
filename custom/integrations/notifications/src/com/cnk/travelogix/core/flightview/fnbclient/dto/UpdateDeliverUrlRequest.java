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
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

/**
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class UpdateDeliverUrlRequest {

	@JsonProperty("DeliveryUrl")
	protected String deliveryUrl;

	/**
	 * @return the deliveryUrl
	 */
	@JsonIgnore
	public String getDeliveryUrl() {
		return deliveryUrl;
	}

	/**
	 * @param deliveryUrl
	 *            the deliveryUrl to set
	 */
	@JsonIgnore
	public void setDeliveryUrl(String deliveryUrl) {
		this.deliveryUrl = deliveryUrl;
	}

}
