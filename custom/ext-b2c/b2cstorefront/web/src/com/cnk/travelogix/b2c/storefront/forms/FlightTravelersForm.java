/**
 *
 */
package com.cnk.travelogix.b2c.storefront.forms;

import java.util.ArrayList;
import java.util.List;


/**
 * @author i314031
 *
 */
public class FlightTravelersForm
{
	private List<FlightTraveler> travelers;

	/**
	 * @return the travelers
	 */
	public List<FlightTraveler> getTravelers()
	{
		if (this.travelers == null)
		{
			this.travelers = new ArrayList<FlightTraveler>();
		}
		return travelers;
	}

	/**
	 * @param travelers
	 *           the travelers to set
	 */
	public void setTravelers(final List<FlightTraveler> travelers)
	{
		this.travelers = travelers;
	}
}
