
package com.cnk.travelogix.custom.contract.provisioning;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="subscriberAccountId" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="description" type="{http://schema.ws.highdeal.com/}String2000" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://schema.ws.highdeal.com/}CurrencyCode"/>
 *         &lt;element name="emptyLimit" type="{http://schema.ws.highdeal.com/}Decimal28_6" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://schema.ws.highdeal.com/}Decimal28_6" minOccurs="0"/>
 *         &lt;element name="currentState" type="{http://suac.ws.highdeal.com/}PrepaidAccountState" minOccurs="0"/>
 *         &lt;element name="stateSchedule" type="{http://suac.ws.highdeal.com/}StateSchedule"/>
 *         &lt;element name="amountAlert" type="{http://suac.ws.highdeal.com/}AmountAlert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stateChangeAlert" type="{http://suac.ws.highdeal.com/}StateChangeAlert" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidAccount", namespace = "http://suac.ws.highdeal.com/", propOrder = {
    "id",
    "subscriberAccountId",
    "description",
    "currencyCode",
    "emptyLimit",
    "balance",
    "currentState",
    "stateSchedule",
    "amountAlert",
    "stateChangeAlert"
})
public class PrepaidAccount {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String subscriberAccountId;
    protected String description;
    @XmlElement(required = true)
    protected String currencyCode;
    @XmlElement(defaultValue = "0")
    protected BigDecimal emptyLimit;
    protected BigDecimal balance;
    @XmlSchemaType(name = "string")
    protected PrepaidAccountState currentState;
    @XmlElement(required = true)
    protected StateSchedule stateSchedule;
    protected List<AmountAlert> amountAlert;
    protected List<StateChangeAlert> stateChangeAlert;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the subscriberAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAccountId() {
        return subscriberAccountId;
    }

    /**
     * Sets the value of the subscriberAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAccountId(String value) {
        this.subscriberAccountId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the emptyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmptyLimit() {
        return emptyLimit;
    }

    /**
     * Sets the value of the emptyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmptyLimit(BigDecimal value) {
        this.emptyLimit = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the currentState property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidAccountState }
     *     
     */
    public PrepaidAccountState getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidAccountState }
     *     
     */
    public void setCurrentState(PrepaidAccountState value) {
        this.currentState = value;
    }

    /**
     * Gets the value of the stateSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link StateSchedule }
     *     
     */
    public StateSchedule getStateSchedule() {
        return stateSchedule;
    }

    /**
     * Sets the value of the stateSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateSchedule }
     *     
     */
    public void setStateSchedule(StateSchedule value) {
        this.stateSchedule = value;
    }

    /**
     * Gets the value of the amountAlert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountAlert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAlert }
     * 
     * 
     */
    public List<AmountAlert> getAmountAlert() {
        if (amountAlert == null) {
            amountAlert = new ArrayList<AmountAlert>();
        }
        return this.amountAlert;
    }

    /**
     * Gets the value of the stateChangeAlert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateChangeAlert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateChangeAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateChangeAlert }
     * 
     * 
     */
    public List<StateChangeAlert> getStateChangeAlert() {
        if (stateChangeAlert == null) {
            stateChangeAlert = new ArrayList<StateChangeAlert>();
        }
        return this.stateChangeAlert;
    }

}
