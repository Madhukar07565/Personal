
package com.cnk.travelogix.contract.provisioning.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTaxationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTaxationMode">
 *   &lt;restriction base="{http://schema.ws.highdeal.com/}String256">
 *     &lt;enumeration value="vendorSubjectToPay"/>
 *     &lt;enumeration value="buyerSubjectToPay"/>
 *     &lt;enumeration value="buyerExempted"/>
 *     &lt;enumeration value="noTax"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountTaxationMode", namespace = "http://suac.ws.highdeal.com/")
@XmlEnum
public enum AccountTaxationMode {

    @XmlEnumValue("vendorSubjectToPay")
    VENDOR_SUBJECT_TO_PAY("vendorSubjectToPay"),
    @XmlEnumValue("buyerSubjectToPay")
    BUYER_SUBJECT_TO_PAY("buyerSubjectToPay"),
    @XmlEnumValue("buyerExempted")
    BUYER_EXEMPTED("buyerExempted"),
    @XmlEnumValue("noTax")
    NO_TAX("noTax");
    private final String value;

    AccountTaxationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountTaxationMode fromValue(String v) {
        for (AccountTaxationMode c: AccountTaxationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
