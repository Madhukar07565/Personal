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
public class FlightRegisterResponse {
	@JsonProperty("RegistrationRequest")
	protected RegistrationRequest registrationRequest;
	@JsonProperty("FlightIdentifiers")
	protected FlightIdentifiers[] flightIdentifiers;
	@JsonProperty("Success")
	protected String success;
	@JsonProperty("Error")
	protected String error;

	/**
	 * @return the registrationRequest
	 */
	@JsonIgnore
	public RegistrationRequest getRegistrationRequest() {
		return registrationRequest;
	}

	/**
	 * @param registrationRequest
	 *            the registrationRequest to set
	 */
	@JsonIgnore
	public void setRegistrationRequest(RegistrationRequest registrationRequest) {
		this.registrationRequest = registrationRequest;
	}

	/**
	 * @return the flightIdentifiers
	 */
	@JsonIgnore
	public FlightIdentifiers[] getFlightIdentifiers() {
		return flightIdentifiers;
	}

	/**
	 * @param flightIdentifiers
	 *            the flightIdentifiers to set
	 */
	@JsonIgnore
	public void setFlightIdentifiers(FlightIdentifiers[] flightIdentifiers) {
		this.flightIdentifiers = flightIdentifiers;
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
		success = success;
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
		error = error;
	}

}
