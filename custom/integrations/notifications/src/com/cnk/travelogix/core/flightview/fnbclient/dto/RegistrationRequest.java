/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris (Confidential Information). You shall not disclose such 
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
public class RegistrationRequest {
	@JsonProperty("Action")
	protected String action;
	@JsonProperty("EndpointType")
	protected String endpointType;
	@JsonProperty("Airport")
	protected String airport;
	@JsonProperty("Airline")
	protected String airline;
	@JsonProperty("FlightNumber")
	protected String flightNumber;
	@JsonProperty("Year")
	protected String year;
	@JsonProperty("Month")
	protected String month;
	@JsonProperty("Day")
	protected String day;
	@JsonProperty("Time")
	protected String time;
	@JsonProperty("Email")
	protected String email;
	@JsonProperty("EmailDisplayName")
	protected String emailDisplayName;
	@JsonProperty("LanguageCode")
	protected String languageCode;
	@JsonProperty("ContentType")
	protected String contentType;
	@JsonProperty("Phone")
	protected String phone;
	@JsonProperty("SmsCarrier")
	protected String smsCarrier;
	@JsonProperty("AppId")
	protected String appId;
	@JsonProperty("DeliveryUrl")
	protected String deliveryUrl;
	@JsonProperty("VerifyUrl")
	protected String verifyUrl;
	@JsonProperty("VerifyUrlPostData")
	protected String verifyUrlPostData;
	@JsonProperty("VerifyUrlTimeoutSec")
	protected String verifyUrlTimeoutSec;
	/**
	 * @return the action
	 */@JsonIgnore
	public String getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */@JsonIgnore
	public void setAction(String action) {
		this.action = action;
	}
	/**
	 * @return the endpointType
	 */@JsonIgnore
	public String getEndpointType() {
		return endpointType;
	}
	/**
	 * @param endpointType the endpointType to set
	 */@JsonIgnore
	public void setEndpointType(String endpointType) {
		this.endpointType = endpointType;
	}
	/**
	 * @return the airport
	 */@JsonIgnore
	public String getAirport() {
		return airport;
	}
	
	/**
	 * @param airport
	 *            the airport to set
	 */
	@JsonIgnore
	public void setAirport(String airport) {
		this.airport = airport;
	}
	/**
	 * @return the airline
	 */@JsonIgnore
	public String getAirline() {
		return airline;
	}
	/**
	 * @param airline the airline to set
	 */@JsonIgnore
	public void setAirline(String airline) {
		this.airline = airline;
	}
	/**
	 * @return the flightNumber
	 */@JsonIgnore
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */@JsonIgnore
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * @return the year
	 */@JsonIgnore
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */@JsonIgnore
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the month
	 */@JsonIgnore
	public String getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */@JsonIgnore
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */@JsonIgnore
	public String getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */@JsonIgnore
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * @return the time
	 */@JsonIgnore
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */@JsonIgnore
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the email
	 */@JsonIgnore
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */@JsonIgnore
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the emailDisplayName
	 */@JsonIgnore
	public String getEmailDisplayName() {
		return emailDisplayName;
	}
	/**
	 * @param emailDisplayName the emailDisplayName to set
	 */@JsonIgnore
	public void setEmailDisplayName(String emailDisplayName) {
		this.emailDisplayName = emailDisplayName;
	}
	/**
	 * @return the languageCode
	 */@JsonIgnore
	public String getLanguageCode() {
		return languageCode;
	}
	/**
	 * @param languageCode the languageCode to set
	 */@JsonIgnore
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	/**
	 * @return the contentType
	 */@JsonIgnore
	public String getContentType() {
		return contentType;
	}
	/**
	 * @param contentType the contentType to set
	 */@JsonIgnore
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	/**
	 * @return the phone
	 */@JsonIgnore
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */@JsonIgnore
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the smsCarrier
	 */@JsonIgnore
	public String getSmsCarrier() {
		return smsCarrier;
	}
	/**
	 * @param smsCarrier the smsCarrier to set
	 */@JsonIgnore
	public void setSmsCarrier(String smsCarrier) {
		this.smsCarrier = smsCarrier;
	}
	/**
	 * @return the appId
	 */@JsonIgnore
	public String getAppId() {
		return appId;
	}
	/**
	 * @param appId the appId to set
	 */@JsonIgnore
	public void setAppId(String appId) {
		this.appId = appId;
	}
	/**
	 * @return the deliveryUrl
	 */@JsonIgnore
	public String getDeliveryUrl() {
		return deliveryUrl;
	}
	/**
	 * @param deliveryUrl the deliveryUrl to set
	 */@JsonIgnore
	public void setDeliveryUrl(String deliveryUrl) {
		this.deliveryUrl = deliveryUrl;
	}
	/**
	 * @return the verifyUrl
	 */@JsonIgnore
	public String getVerifyUrl() {
		return verifyUrl;
	}
	/**
	 * @param verifyUrl the verifyUrl to set
	 */@JsonIgnore
	public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}
	/**
	 * @return the verifyUrlPostData
	 */@JsonIgnore
	public String getVerifyUrlPostData() {
		return verifyUrlPostData;
	}
	/**
	 * @param verifyUrlPostData the verifyUrlPostData to set
	 */@JsonIgnore
	public void setVerifyUrlPostData(String verifyUrlPostData) {
		this.verifyUrlPostData = verifyUrlPostData;
	}
	/**
	 * @return the verifyUrlTimeoutSec
	 */@JsonIgnore
	public String getVerifyUrlTimeoutSec() {
		return verifyUrlTimeoutSec;
	}
	/**
	 * @param verifyUrlTimeoutSec the verifyUrlTimeoutSec to set
	 */@JsonIgnore
	public void setVerifyUrlTimeoutSec(String verifyUrlTimeoutSec) {
		this.verifyUrlTimeoutSec = verifyUrlTimeoutSec;
	}

	

}
