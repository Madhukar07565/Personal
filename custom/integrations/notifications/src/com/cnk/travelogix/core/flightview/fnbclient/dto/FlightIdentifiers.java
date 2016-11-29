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
public class FlightIdentifiers {
	@JsonProperty("AirlineCode")
	protected String airlineCode;
	@JsonProperty("FlightNumber")
	protected String flightNumber;
	@JsonProperty("DepartureAirportCode")
	protected String departureAirportCode;
	@JsonProperty("ArrivalAirportCode")
	protected String arrivalAirportCode;
	@JsonProperty("SchedDepartureLocal")
	protected String schedDepartureLocal;
	/**
	 * @return the airlineCode
	 */@JsonIgnore
	public String getAirlineCode() {
		return airlineCode;
	}
	/**
	 * @param airlineCode the airlineCode to set
	 */@JsonIgnore
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
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
	 * @return the departureAirportCode
	 */@JsonIgnore
	public String getDepartureAirportCode() {
		return departureAirportCode;
	}
	/**
	 * @param departureAirportCode the departureAirportCode to set
	 */@JsonIgnore
	public void setDepartureAirportCode(String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}
	/**
	 * @return the arrivalAirportCode
	 */@JsonIgnore
	public String getArrivalAirportCode() {
		return arrivalAirportCode;
	}
	/**
	 * @param arrivalAirportCode the arrivalAirportCode to set
	 */@JsonIgnore
	public void setArrivalAirportCode(String arrivalAirportCode) {
		this.arrivalAirportCode = arrivalAirportCode;
	}
	/**
	 * @return the schedDepartureLocal
	 */@JsonIgnore
	public String getSchedDepartureLocal() {
		return schedDepartureLocal;
	}
	/**
	 * @param schedDepartureLocal the schedDepartureLocal to set
	 */@JsonIgnore
	public void setSchedDepartureLocal(String schedDepartureLocal) {
		this.schedDepartureLocal = schedDepartureLocal;
	}

}
