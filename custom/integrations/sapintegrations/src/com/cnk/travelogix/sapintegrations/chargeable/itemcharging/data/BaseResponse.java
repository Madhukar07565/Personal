
package com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data;

import com.cnk.travelogix.common.data.Errors;


public class BaseResponse extends Errors
{

	protected ResponseStatus status;
	protected String message;

	/**
	 * Gets the value of the status property.
	 *
	 * @return possible object is {@link ResponseStatus }
	 *
	 */
	public ResponseStatus getStatus()
	{
		return status;
	}

	/**
	 * Sets the value of the status property.
	 *
	 * @param value
	 *           allowed object is {@link ResponseStatus }
	 *
	 */
	public void setStatus(final ResponseStatus value)
	{
		this.status = value;
	}

	/**
	 * Gets the value of the message property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * Sets the value of the message property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setMessage(final String value)
	{
		this.message = value;
	}

}
