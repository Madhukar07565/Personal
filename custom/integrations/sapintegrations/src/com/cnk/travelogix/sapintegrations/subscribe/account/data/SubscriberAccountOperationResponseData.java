
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

public class SubscriberAccountOperationResponseData extends Response
{

	protected String subscriberAccountId;
	protected String subscriberAccountReference;

	/**
	 * Gets the value of the subscriberAccountId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getSubscriberAccountId()
	{
		return subscriberAccountId;
	}

	/**
	 * Sets the value of the subscriberAccountId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setSubscriberAccountId(final String value)
	{
		this.subscriberAccountId = value;
	}

	/**
	 * Gets the value of the subscriberAccountReference property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getSubscriberAccountReference()
	{
		return subscriberAccountReference;
	}

	/**
	 * Sets the value of the subscriberAccountReference property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setSubscriberAccountReference(final String value)
	{
		this.subscriberAccountReference = value;
	}

}
