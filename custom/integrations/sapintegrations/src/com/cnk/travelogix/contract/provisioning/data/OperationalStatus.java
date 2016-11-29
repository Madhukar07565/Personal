
package com.cnk.travelogix.contract.provisioning.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationalStatus">
 *   &lt;restriction base="{http://schema.ws.highdeal.com/}String256">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="locked"/>
 *     &lt;enumeration value="closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationalStatus", namespace = "http://operationalstatus.ws.highdeal.com/")
@XmlEnum
public enum OperationalStatus {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("locked")
    LOCKED("locked"),
    @XmlEnumValue("closed")
    CLOSED("closed");
    private final String value;

    OperationalStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationalStatus fromValue(String v) {
        for (OperationalStatus c: OperationalStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
