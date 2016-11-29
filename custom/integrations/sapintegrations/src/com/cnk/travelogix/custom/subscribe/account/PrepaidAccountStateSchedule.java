
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidAccountStateSchedule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepaidAccountStateSchedule">
 *   &lt;restriction base="{http://schema.ws.highdeal.com/}String256">
 *     &lt;enumeration value="blocked"/>
 *     &lt;enumeration value="locked"/>
 *     &lt;enumeration value="closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrepaidAccountStateSchedule", namespace = "http://suac.ws.highdeal.com/")
@XmlEnum
public enum PrepaidAccountStateSchedule {

    @XmlEnumValue("blocked")
    BLOCKED("blocked"),
    @XmlEnumValue("locked")
    LOCKED("locked"),
    @XmlEnumValue("closed")
    CLOSED("closed");
    private final String value;

    PrepaidAccountStateSchedule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepaidAccountStateSchedule fromValue(String v) {
        for (PrepaidAccountStateSchedule c: PrepaidAccountStateSchedule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
