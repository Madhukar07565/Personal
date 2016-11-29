/**
 *
 */
package com.cnk.travelogix.b2c.storefront.forms;

import java.util.Date;


/**
 * @author i314031
 *
 */
public class FlightLineDetail
{
	private String flightNumber;

	private String cabinClass;

	private Date departureTime;

	private Date arrivalTime;

	private String fromCity;

	private String toCity;

	private String fromTerminal;

	private String toTerminal;

	private String duration;

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber()
	{
		return flightNumber;
	}

	/**
	 * @param flightNumber
	 *           the flightNumber to set
	 */
	public void setFlightNumber(final String flightNumber)
	{
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the cabinClass
	 */
	public String getCabinClass()
	{
		return cabinClass;
	}

	/**
	 * @param cabinClass
	 *           the cabinClass to set
	 */
	public void setCabinClass(final String cabinClass)
	{
		this.cabinClass = cabinClass;
	}

	/**
	 * @return the departureTime
	 */
	public Date getDepartureTime()
	{
		return departureTime;
	}

	/**
	 * @param departureTime
	 *           the departureTime to set
	 */
	public void setDepartureTime(final Date departureTime)
	{
		this.departureTime = departureTime;
	}

	/**
	 * @return the arrivalTime
	 */
	public Date getArrivalTime()
	{
		return arrivalTime;
	}

	/**
	 * @param arrivalTime
	 *           the arrivalTime to set
	 */
	public void setArrivalTime(final Date arrivalTime)
	{
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the fromCity
	 */
	public String getFromCity()
	{
		return fromCity;
	}

	/**
	 * @param fromCity
	 *           the fromCity to set
	 */
	public void setFromCity(final String fromCity)
	{
		this.fromCity = fromCity;
	}

	/**
	 * @return the toCity
	 */
	public String getToCity()
	{
		return toCity;
	}

	/**
	 * @param toCity
	 *           the toCity to set
	 */
	public void setToCity(final String toCity)
	{
		this.toCity = toCity;
	}

	/**
	 * @return the fromTerminal
	 */
	public String getFromTerminal()
	{
		return fromTerminal;
	}

	/**
	 * @param fromTerminal
	 *           the fromTerminal to set
	 */
	public void setFromTerminal(final String fromTerminal)
	{
		this.fromTerminal = fromTerminal;
	}

	/**
	 * @return the toTerminal
	 */
	public String getToTerminal()
	{
		return toTerminal;
	}

	/**
	 * @param toTerminal
	 *           the toTerminal to set
	 */
	public void setToTerminal(final String toTerminal)
	{
		this.toTerminal = toTerminal;
	}

	/**
	 * @return the duration
	 */
	public String getDuration()
	{
		return duration;
	}

	/**
	 * @param duration
	 *           the duration to set
	 */
	public void setDuration(final String duration)
	{
		this.duration = duration;
	}

}
