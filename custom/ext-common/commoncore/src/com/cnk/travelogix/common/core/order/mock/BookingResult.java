/**
 * 
 */
package com.cnk.travelogix.common.core.order.mock;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;


/**
 * @author i323801
 * @param <T>
 *
 */
public class BookingResult<T>
{
	private String status;
	private T entry;

	/**
	 * @return the status
	 */
	public String getStatus()
	{
		return status;
	}

	/**
	 * @param status
	 *           the status to set
	 */
	public void setStatus(String status)
	{
		this.status = status;
	}

	/**
	 * @return the entry
	 */
	public T getEntry()
	{
		return entry;
	}

	/**
	 * @param entry the entry to set
	 */
	public void setEntry(T entry)
	{
		this.entry = entry;
	}



}
