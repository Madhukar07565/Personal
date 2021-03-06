
package com.cnk.travelogix.custom.mappingtable.maintain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for ResponseStatus.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ResponseStatus">
 *   &lt;restriction base="{http://schema.ws.highdeal.com/}String256">
 *     &lt;enumeration value="return"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="inProgress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ResponseStatus")
@XmlEnum
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
