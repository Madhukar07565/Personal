
package com.cnk.travelogix.contract.provisioning.data;

import org.springframework.beans.factory.annotation.Value;


public enum ResponseStatus
{

	@Value("return") RETURN("return"), @Value("error") ERROR("error"), @Value("inProgress") IN_PROGRESS("inProgress");
	private final String value;

	ResponseStatus(final String v)
	{
		value = v;
	}

	public String value()
	{
		return value;
	}

	public static ResponseStatus fromValue(final String v)
	{
		for (final ResponseStatus c : ResponseStatus.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
