/**
 *
 */
package com.cnk.travelogix.b2c.storefront.forms;

import de.hybris.platform.acceleratorstorefrontcommons.forms.AddToCartForm;

import java.util.ArrayList;
import java.util.List;


/**
 * @author i314031
 *
 */
public class AddFlightToCartForm extends AddToCartForm
{
	private final List<FlightLine> flights = new ArrayList<FlightLine>();

	private final List<String> flightIds = new ArrayList<String>();

	private final List<String> selectedFareTypes = new ArrayList<String>();

	private int numberOfAdult;

	private int numberOfChild;

	private int numberOfInfant;

	private boolean booking = false;

	private String originalGroupId;

	private boolean editMode;

	private String journeyType;

	/**
	 * @return the numberOfAdult
	 */
	public int getNumberOfAdult()
	{
		return numberOfAdult;
	}



	/**
	 * @return the booking
	 */
	public boolean isBooking()
	{
		return booking;
	}



	public void setBooking(final boolean booking)
	{
		this.booking = booking;
	}

	/**
	 * @param numberOfAdult
	 *           the numberOfAdult to set
	 */
	public void setNumberOfAdult(final int numberOfAdult)
	{
		this.numberOfAdult = numberOfAdult;
	}

	/**
	 * @return the numberOfChild
	 */
	public int getNumberOfChild()
	{
		return numberOfChild;
	}

	/**
	 * @param numberOfChild
	 *           the numberOfChild to set
	 */
	public void setNumberOfChild(final int numberOfChild)
	{
		this.numberOfChild = numberOfChild;
	}

	/**
	 * @return the numberOfInfant
	 */
	public int getNumberOfInfant()
	{
		return numberOfInfant;
	}

	/**
	 * @param numberOfInfant
	 *           the numberOfInfant to set
	 */
	public void setNumberOfInfant(final int numberOfInfant)
	{
		this.numberOfInfant = numberOfInfant;
	}

	/**
	 * @return the flights
	 */
	public List<FlightLine> getFlights()
	{
		return flights;
	}

	/**
	 * @return the flightIds
	 */
	public List<String> getFlightIds()
	{
		return flightIds;
	}



	/**
	 * @return the originalGroupId
	 */
	public String getOriginalGroupId()
	{
		return originalGroupId;
	}



	/**
	 * @param originalGroupId
	 *           the originalGroupId to set
	 */
	public void setOriginalGroupId(final String originalGroupId)
	{
		this.originalGroupId = originalGroupId;
	}



	/**
	 * @return the editMode
	 */
	public boolean isEditMode()
	{
		return editMode;
	}



	/**
	 * @param editMode
	 *           the editMode to set
	 */
	public void setEditMode(final boolean editMode)
	{
		this.editMode = editMode;
	}



	/**
	 * @return the journeyType
	 */
	public String getJourneyType()
	{
		return journeyType;
	}



	/**
	 * @param journeyType
	 *           the journeyType to set
	 */
	public void setJourneyType(final String journeyType)
	{
		this.journeyType = journeyType;
	}



	/**
	 * @return the selectedFareTypes
	 */
	public List<String> getSelectedFareTypes()
	{
		return selectedFareTypes;
	}
}
