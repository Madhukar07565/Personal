
package com.cnk.travelogix.custom.contract.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VATBusinessCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VATBusinessCategory">
 *   &lt;restriction base="{http://schema.ws.highdeal.com/}String256">
 *     &lt;enumeration value="B2B"/>
 *     &lt;enumeration value="B2C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VATBusinessCategory", namespace = "http://suac.ws.highdeal.com/")
@XmlEnum
public enum VATBusinessCategory {

    @XmlEnumValue("B2B")
    B_2_B("B2B"),
    @XmlEnumValue("B2C")
    B_2_C("B2C");
    private final String value;

    VATBusinessCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VATBusinessCategory fromValue(String v) {
        for (VATBusinessCategory c: VATBusinessCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
