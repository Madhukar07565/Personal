
package com.cnk.travelogix.contract.provisioning.data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertCode" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="amountThreshold" type="{http://schema.ws.highdeal.com/}Decimal28_6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAlert", namespace = "http://suac.ws.highdeal.com/", propOrder = {
    "alertCode",
    "amountThreshold"
})
public class AmountAlert {

    @XmlElement(required = true)
    protected String alertCode;
    @XmlElement(required = true)
    protected BigDecimal amountThreshold;

    /**
     * Gets the value of the alertCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCode() {
        return alertCode;
    }

    /**
     * Sets the value of the alertCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCode(String value) {
        this.alertCode = value;
    }

    /**
     * Gets the value of the amountThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountThreshold() {
        return amountThreshold;
    }

    /**
     * Sets the value of the amountThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountThreshold(BigDecimal value) {
        this.amountThreshold = value;
    }

}
