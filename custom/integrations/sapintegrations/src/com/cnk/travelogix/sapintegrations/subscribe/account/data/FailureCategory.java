
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import javax.xml.bind.annotation.XmlEnumValue;



public enum FailureCategory
{

	@XmlEnumValue("alreadyExists") ALREADY_EXISTS("alreadyExists"), @XmlEnumValue("doesNotExist") DOES_NOT_EXIST(
			"doesNotExist"), @XmlEnumValue("invalid") INVALID("invalid"), @XmlEnumValue("prerequisiteMissing") PREREQUISITE_MISSING(
					"prerequisiteMissing"), @XmlEnumValue("incompatibleConfiguration") INCOMPATIBLE_CONFIGURATION(
							"incompatibleConfiguration"), @XmlEnumValue("illegalState") ILLEGAL_STATE(
									"illegalState"), @XmlEnumValue("temporaryIllegalState") TEMPORARY_ILLEGAL_STATE(
											"temporaryIllegalState");
	private final String value;

	FailureCategory(final String v)
	{
		value = v;
	}

	public String value()
	{
		return value;
	}

	public static FailureCategory fromValue(final String v)
	{
		for (final FailureCategory c : FailureCategory.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
