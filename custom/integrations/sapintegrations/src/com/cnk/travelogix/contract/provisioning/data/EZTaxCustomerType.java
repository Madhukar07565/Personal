
package com.cnk.travelogix.contract.provisioning.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EZTaxCustomerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EZTaxCustomerType">
 *   &lt;restriction base="{http://schema.ws.highdeal.com/}String256">
 *     &lt;enumeration value="business"/>
 *     &lt;enumeration value="industrial"/>
 *     &lt;enumeration value="residentialCustomer"/>
 *     &lt;enumeration value="seniorCitizen"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EZTaxCustomerType", namespace = "http://suac.ws.highdeal.com/")
@XmlEnum
public enum EZTaxCustomerType {

    @XmlEnumValue("business")
    BUSINESS("business"),
    @XmlEnumValue("industrial")
    INDUSTRIAL("industrial"),
    @XmlEnumValue("residentialCustomer")
    RESIDENTIAL_CUSTOMER("residentialCustomer"),
    @XmlEnumValue("seniorCitizen")
    SENIOR_CITIZEN("seniorCitizen");
    private final String value;

    EZTaxCustomerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EZTaxCustomerType fromValue(String v) {
        for (EZTaxCustomerType c: EZTaxCustomerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
