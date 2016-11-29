
package com.cnk.travelogix.sapintegrations.mappingtable.maintain.data;

public class MappingTableRowOperationResponseData extends Response
{

	protected String mappingTableId;
	protected String reference;

	/**
	 * Gets the value of the mappingTableId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMappingTableId()
	{
		return mappingTableId;
	}

	/**
	 * Sets the value of the mappingTableId property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setMappingTableId(final String value)
	{
		this.mappingTableId = value;
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
