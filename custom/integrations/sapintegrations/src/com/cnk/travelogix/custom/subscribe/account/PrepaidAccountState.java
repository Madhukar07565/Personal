
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidAccountState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepaidAccountState">
 *   &lt;restriction base="{http://schema.ws.highdeal.com/}String256">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="blocked"/>
 *     &lt;enumeration value="locked"/>
 *     &lt;enumeration value="closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrepaidAccountState", namespace = "http://suac.ws.highdeal.com/")
@XmlEnum
public enum PrepaidAccountState {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("blocked")
    BLOCKED("blocked"),
    @XmlEnumValue("locked")
    LOCKED("locked"),
    @XmlEnumValue("closed")
    CLOSED("closed");
    private final String value;

    PrepaidAccountState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepaidAccountState fromValue(String v) {
        for (PrepaidAccountState c: PrepaidAccountState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
