package com.cnk.travelogix.sapintegrations.mappingtable.maintain.data;


public class MappingTableOperationResponseData extends Response
{
	protected String id;
	protected String reference;

	/**
	 * Gets the value of the id property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the value of the id property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setId(final String value)
	{
		this.id = value;
	}

	/**
	 * Gets the value of the reference property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getReference()
	{
		return reference;
	}

	/**
	 * Sets the value of the reference property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setReference(final String value)
	{
		this.reference = value;
	}

}
