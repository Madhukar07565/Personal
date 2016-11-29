
package com.cnk.travelogix.custom.contract.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EZTaxIncorporatedCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EZTaxIncorporatedCode">
 *   &lt;restriction base="{http://schema.ws.highdeal.com/}String256">
 *     &lt;enumeration value="inside"/>
 *     &lt;enumeration value="outside"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EZTaxIncorporatedCode", namespace = "http://suac.ws.highdeal.com/")
@XmlEnum
public enum EZTaxIncorporatedCode {

    @XmlEnumValue("inside")
    INSIDE("inside"),
    @XmlEnumValue("outside")
    OUTSIDE("outside");
    private final String value;

    EZTaxIncorporatedCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EZTaxIncorporatedCode fromValue(String v) {
        for (EZTaxIncorporatedCode c: EZTaxIncorporatedCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
