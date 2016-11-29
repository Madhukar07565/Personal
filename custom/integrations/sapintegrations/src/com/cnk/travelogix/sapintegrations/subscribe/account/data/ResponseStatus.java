
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import javax.xml.bind.annotation.XmlEnumValue;



public enum ResponseStatus
{

	@XmlEnumValue("return") RETURN("return"), @XmlEnumValue("error") ERROR("error"), @XmlEnumValue("inProgress") IN_PROGRESS(
			"inProgress");
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
