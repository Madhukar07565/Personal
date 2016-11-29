
package com.cnk.travelogix.contract.provisioning.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EZTaxClientResale.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EZTaxClientResale">
 *   &lt;restriction base="{http://schema.ws.highdeal.com/}String256">
 *     &lt;enumeration value="resale"/>
 *     &lt;enumeration value="sale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EZTaxClientResale", namespace = "http://suac.ws.highdeal.com/")
@XmlEnum
public enum EZTaxClientResale {

    @XmlEnumValue("resale")
    RESALE("resale"),
    @XmlEnumValue("sale")
    SALE("sale");
    private final String value;

    EZTaxClientResale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EZTaxClientResale fromValue(String v) {
        for (EZTaxClientResale c: EZTaxClientResale.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
