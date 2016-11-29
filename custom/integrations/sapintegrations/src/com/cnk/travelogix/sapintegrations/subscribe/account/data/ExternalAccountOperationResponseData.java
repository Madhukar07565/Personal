
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

public class ExternalAccountOperationResponseData extends Response
{

	protected ExternalAccountReference externalAccountReference;

	/**
	 * Gets the value of the externalAccountReference property.
	 *
	 * @return possible object is {@link ExternalAccountReference }
	 *
	 */
	public ExternalAccountReference getExternalAccountReference()
	{
		return externalAccountReference;
	}

	/**
	 * Sets the value of the externalAccountReference property.
	 *
	 * @param value
	 *           allowed object is {@link ExternalAccountReference }
	 *
	 */
	public void setExternalAccountReference(final ExternalAccountReference value)
	{
		this.externalAccountReference = value;
	}

}
