/**
 *
 */
package com.cnk.travelogix.b2c.storefront.forms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.common.core.cart.data.AirlineIATAData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;


/**
 * @author i314031
 *
 */
public class FlightLine
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

	private String travellerGroupId;

	private AirlineIATAData airlineIATA;

	private final List<FlightLineDetail> flightDetails = new ArrayList<FlightLineDetail>();

	private String NumberOfStops;

	private PriceInfoData priceInfoData;

	/**
	 *
	 */
	public FlightLine()
	{

	}

	/**
	 * Clone a flightLine object by adding a copy constructor.
	 *
	 * @param flightLine
	 */
	public FlightLine(final FlightLine flightLine)
	{
		this.arrivalTime = flightLine.arrivalTime;
		this.cabinClass = flightLine.cabinClass;
		this.departureTime = flightLine.departureTime;
		this.duration = flightLine.duration;
		this.flightNumber = flightLine.flightNumber;
		this.fromCity = flightLine.fromCity;
		this.fromTerminal = flightLine.fromTerminal;
		this.toCity = flightLine.toCity;
		this.toTerminal = flightLine.toTerminal;
		this.travellerGroupId = flightLine.travellerGroupId;
		final AirlineIATAData airlineIATAData = new AirlineIATAData();
		airlineIATAData.setAccountingCode(flightLine.getAirlineIATA() != null ? flightLine.getAirlineIATA().getAccountingCode()
				: StringUtils.EMPTY);
		airlineIATAData.setAirlineName(flightLine.getAirlineIATA() != null ? flightLine.getAirlineIATA().getAirlineName()
				: StringUtils.EMPTY);
		airlineIATAData.setAirlinePrefix(flightLine.getAirlineIATA() != null ? flightLine.getAirlineIATA().getAirlinePrefix()
				: StringUtils.EMPTY);
		this.airlineIATA = airlineIATAData;
	}


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


	/**
	 * @return the travellerGroupId
	 */
	public String getTravellerGroupId()
	{
		return travellerGroupId;
	}

	/**
	 * @param travellerGroupId
	 *           the travellerGroupId to set
	 */
	public void setTravellerGroupId(final String travellerGroupId)
	{
		this.travellerGroupId = travellerGroupId;
	}

	/**
	 * @return the airlineIATA
	 */
	public AirlineIATAData getAirlineIATA()
	{
		return airlineIATA;
	}

	/**
	 * @param airlineIATA
	 *           the airlineIATA to set
	 */
	public void setAirlineIATA(final AirlineIATAData airlineIATA)
	{
		this.airlineIATA = airlineIATA;
	}

	/**
	 * @return the flightDetails
	 */
	public List<FlightLineDetail> getFlightDetails()
	{
		return flightDetails;
	}

	/**
	 * @return the numberOfStops
	 */
	public String getNumberOfStops()
	{
		return NumberOfStops;
	}

	/**
	 * @param numberOfStops
	 *           the numberOfStops to set
	 */
	public void setNumberOfStops(final String numberOfStops)
	{
		NumberOfStops = numberOfStops;
	}

	/**
	 * @return the priceInfoData
	 */
	public PriceInfoData getPriceInfoData()
	{
		return priceInfoData;
	}

	/**
	 * @param priceInfoData
	 *           the priceInfoData to set
	 */
	public void setPriceInfoData(final PriceInfoData priceInfoData)
	{
		this.priceInfoData = priceInfoData;
	}
}
