
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

public class FailureCause
{

	protected String module;
	protected int code;
	protected String message;

	/**
	 * Gets the value of the module property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getModule()
	{
		return module;
	}

	/**
	 * Sets the value of the module property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setModule(final String value)
	{
		this.module = value;
	}

	/**
	 * Gets the value of the code property.
	 *
	 */
	public int getCode()
	{
		return code;
	}

	/**
	 * Sets the value of the code property.
	 *
	 */
	public void setCode(final int value)
	{
		this.code = value;
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
