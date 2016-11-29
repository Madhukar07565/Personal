
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OppHeader" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifTerpOppHeader" minOccurs="0"/>
 *         &lt;element name="OppItem" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZttTerpOppItemData" minOccurs="0"/>
 *         &lt;element name="OppPartner" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZttTerpOppPartner" minOccurs="0"/>
 *         &lt;element name="ProdCatAccommodation" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatAccommodation" minOccurs="0"/>
 *         &lt;element name="ProdCatActivities" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatActivities" minOccurs="0"/>
 *         &lt;element name="ProdCatAircraft" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatAircraft" minOccurs="0"/>
 *         &lt;element name="ProdCatBus" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatBus" minOccurs="0"/>
 *         &lt;element name="ProdCatCruise" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatCruise" minOccurs="0"/>
 *         &lt;element name="ProdCatFlights" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatFlights" minOccurs="0"/>
 *         &lt;element name="ProdCatForex" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatForex" minOccurs="0"/>
 *         &lt;element name="ProdCatHolidays" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatHolidays" minOccurs="0"/>
 *         &lt;element name="ProdCatInsurance" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatInsurance" minOccurs="0"/>
 *         &lt;element name="ProdCatMotorBike" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatMotorBike" minOccurs="0"/>
 *         &lt;element name="ProdCatRail" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatRail" minOccurs="0"/>
 *         &lt;element name="ProdCatRvSbTuktukLimousin" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdRvSbTuktukLimousin" minOccurs="0"/>
 *         &lt;element name="ProdCatVehicleRental" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatVehicleRental" minOccurs="0"/>
 *         &lt;element name="ProdCatVehicleSelfDrive" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatVehSelfDrive" minOccurs="0"/>
 *         &lt;element name="ProdCatVehicleTransfer" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatVehicleTransfer" minOccurs="0"/>
 *         &lt;element name="ProdCatVisa" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifProdCatVisa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oppHeader",
    "oppItem",
    "oppPartner",
    "prodCatAccommodation",
    "prodCatActivities",
    "prodCatAircraft",
    "prodCatBus",
    "prodCatCruise",
    "prodCatFlights",
    "prodCatForex",
    "prodCatHolidays",
    "prodCatInsurance",
    "prodCatMotorBike",
    "prodCatRail",
    "prodCatRvSbTuktukLimousin",
    "prodCatVehicleRental",
    "prodCatVehicleSelfDrive",
    "prodCatVehicleTransfer",
    "prodCatVisa"
})
@XmlRootElement(name = "ZifTerpOpportunity", namespace = "urn:sap-com:document:sap:rfc:functions")
public class ZifTerpOpportunity {

    @XmlElement(name = "OppHeader")
    protected ZifTerpOppHeader oppHeader;
    @XmlElement(name = "OppItem")
    protected ZttTerpOppItemData oppItem;
    @XmlElement(name = "OppPartner")
    protected ZttTerpOppPartner oppPartner;
    @XmlElement(name = "ProdCatAccommodation")
    protected ZifProdCatAccommodation prodCatAccommodation;
    @XmlElement(name = "ProdCatActivities")
    protected ZifProdCatActivities prodCatActivities;
    @XmlElement(name = "ProdCatAircraft")
    protected ZifProdCatAircraft prodCatAircraft;
    @XmlElement(name = "ProdCatBus")
    protected ZifProdCatBus prodCatBus;
    @XmlElement(name = "ProdCatCruise")
    protected ZifProdCatCruise prodCatCruise;
    @XmlElement(name = "ProdCatFlights")
    protected ZifProdCatFlights prodCatFlights;
    @XmlElement(name = "ProdCatForex")
    protected ZifProdCatForex prodCatForex;
    @XmlElement(name = "ProdCatHolidays")
    protected ZifProdCatHolidays prodCatHolidays;
    @XmlElement(name = "ProdCatInsurance")
    protected ZifProdCatInsurance prodCatInsurance;
    @XmlElement(name = "ProdCatMotorBike")
    protected ZifProdCatMotorBike prodCatMotorBike;
    @XmlElement(name = "ProdCatRail")
    protected ZifProdCatRail prodCatRail;
    @XmlElement(name = "ProdCatRvSbTuktukLimousin")
    protected ZifProdRvSbTuktukLimousin prodCatRvSbTuktukLimousin;
    @XmlElement(name = "ProdCatVehicleRental")
    protected ZifProdCatVehicleRental prodCatVehicleRental;
    @XmlElement(name = "ProdCatVehicleSelfDrive")
    protected ZifProdCatVehSelfDrive prodCatVehicleSelfDrive;
    @XmlElement(name = "ProdCatVehicleTransfer")
    protected ZifProdCatVehicleTransfer prodCatVehicleTransfer;
    @XmlElement(name = "ProdCatVisa")
    protected ZifProdCatVisa prodCatVisa;

    /**
     * Gets the value of the oppHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ZifTerpOppHeader }
     *     
     */
    public ZifTerpOppHeader getOppHeader() {
        return oppHeader;
    }

    /**
     * Sets the value of the oppHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifTerpOppHeader }
     *     
     */
    public void setOppHeader(ZifTerpOppHeader value) {
        this.oppHeader = value;
    }

    /**
     * Gets the value of the oppItem property.
     * 
     * @return
     *     possible object is
     *     {@link ZttTerpOppItemData }
     *     
     */
    public ZttTerpOppItemData getOppItem() {
        return oppItem;
    }

    /**
     * Sets the value of the oppItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZttTerpOppItemData }
     *     
     */
    public void setOppItem(ZttTerpOppItemData value) {
        this.oppItem = value;
    }

    /**
     * Gets the value of the oppPartner property.
     * 
     * @return
     *     possible object is
     *     {@link ZttTerpOppPartner }
     *     
     */
    public ZttTerpOppPartner getOppPartner() {
        return oppPartner;
    }

    /**
     * Sets the value of the oppPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZttTerpOppPartner }
     *     
     */
    public void setOppPartner(ZttTerpOppPartner value) {
        this.oppPartner = value;
    }

    /**
     * Gets the value of the prodCatAccommodation property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatAccommodation }
     *     
     */
    public ZifProdCatAccommodation getProdCatAccommodation() {
        return prodCatAccommodation;
    }

    /**
     * Sets the value of the prodCatAccommodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatAccommodation }
     *     
     */
    public void setProdCatAccommodation(ZifProdCatAccommodation value) {
        this.prodCatAccommodation = value;
    }

    /**
     * Gets the value of the prodCatActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatActivities }
     *     
     */
    public ZifProdCatActivities getProdCatActivities() {
        return prodCatActivities;
    }

    /**
     * Sets the value of the prodCatActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatActivities }
     *     
     */
    public void setProdCatActivities(ZifProdCatActivities value) {
        this.prodCatActivities = value;
    }

    /**
     * Gets the value of the prodCatAircraft property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatAircraft }
     *     
     */
    public ZifProdCatAircraft getProdCatAircraft() {
        return prodCatAircraft;
    }

    /**
     * Sets the value of the prodCatAircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatAircraft }
     *     
     */
    public void setProdCatAircraft(ZifProdCatAircraft value) {
        this.prodCatAircraft = value;
    }

    /**
     * Gets the value of the prodCatBus property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatBus }
     *     
     */
    public ZifProdCatBus getProdCatBus() {
        return prodCatBus;
    }

    /**
     * Sets the value of the prodCatBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatBus }
     *     
     */
    public void setProdCatBus(ZifProdCatBus value) {
        this.prodCatBus = value;
    }

    /**
     * Gets the value of the prodCatCruise property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatCruise }
     *     
     */
    public ZifProdCatCruise getProdCatCruise() {
        return prodCatCruise;
    }

    /**
     * Sets the value of the prodCatCruise property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatCruise }
     *     
     */
    public void setProdCatCruise(ZifProdCatCruise value) {
        this.prodCatCruise = value;
    }

    /**
     * Gets the value of the prodCatFlights property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatFlights }
     *     
     */
    public ZifProdCatFlights getProdCatFlights() {
        return prodCatFlights;
    }

    /**
     * Sets the value of the prodCatFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatFlights }
     *     
     */
    public void setProdCatFlights(ZifProdCatFlights value) {
        this.prodCatFlights = value;
    }

    /**
     * Gets the value of the prodCatForex property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatForex }
     *     
     */
    public ZifProdCatForex getProdCatForex() {
        return prodCatForex;
    }

    /**
     * Sets the value of the prodCatForex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatForex }
     *     
     */
    public void setProdCatForex(ZifProdCatForex value) {
        this.prodCatForex = value;
    }

    /**
     * Gets the value of the prodCatHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatHolidays }
     *     
     */
    public ZifProdCatHolidays getProdCatHolidays() {
        return prodCatHolidays;
    }

    /**
     * Sets the value of the prodCatHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatHolidays }
     *     
     */
    public void setProdCatHolidays(ZifProdCatHolidays value) {
        this.prodCatHolidays = value;
    }

    /**
     * Gets the value of the prodCatInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatInsurance }
     *     
     */
    public ZifProdCatInsurance getProdCatInsurance() {
        return prodCatInsurance;
    }

    /**
     * Sets the value of the prodCatInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatInsurance }
     *     
     */
    public void setProdCatInsurance(ZifProdCatInsurance value) {
        this.prodCatInsurance = value;
    }

    /**
     * Gets the value of the prodCatMotorBike property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatMotorBike }
     *     
     */
    public ZifProdCatMotorBike getProdCatMotorBike() {
        return prodCatMotorBike;
    }

    /**
     * Sets the value of the prodCatMotorBike property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatMotorBike }
     *     
     */
    public void setProdCatMotorBike(ZifProdCatMotorBike value) {
        this.prodCatMotorBike = value;
    }

    /**
     * Gets the value of the prodCatRail property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatRail }
     *     
     */
    public ZifProdCatRail getProdCatRail() {
        return prodCatRail;
    }

    /**
     * Sets the value of the prodCatRail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatRail }
     *     
     */
    public void setProdCatRail(ZifProdCatRail value) {
        this.prodCatRail = value;
    }

    /**
     * Gets the value of the prodCatRvSbTuktukLimousin property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdRvSbTuktukLimousin }
     *     
     */
    public ZifProdRvSbTuktukLimousin getProdCatRvSbTuktukLimousin() {
        return prodCatRvSbTuktukLimousin;
    }

    /**
     * Sets the value of the prodCatRvSbTuktukLimousin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdRvSbTuktukLimousin }
     *     
     */
    public void setProdCatRvSbTuktukLimousin(ZifProdRvSbTuktukLimousin value) {
        this.prodCatRvSbTuktukLimousin = value;
    }

    /**
     * Gets the value of the prodCatVehicleRental property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatVehicleRental }
     *     
     */
    public ZifProdCatVehicleRental getProdCatVehicleRental() {
        return prodCatVehicleRental;
    }

    /**
     * Sets the value of the prodCatVehicleRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatVehicleRental }
     *     
     */
    public void setProdCatVehicleRental(ZifProdCatVehicleRental value) {
        this.prodCatVehicleRental = value;
    }

    /**
     * Gets the value of the prodCatVehicleSelfDrive property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatVehSelfDrive }
     *     
     */
    public ZifProdCatVehSelfDrive getProdCatVehicleSelfDrive() {
        return prodCatVehicleSelfDrive;
    }

    /**
     * Sets the value of the prodCatVehicleSelfDrive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatVehSelfDrive }
     *     
     */
    public void setProdCatVehicleSelfDrive(ZifProdCatVehSelfDrive value) {
        this.prodCatVehicleSelfDrive = value;
    }

    /**
     * Gets the value of the prodCatVehicleTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatVehicleTransfer }
     *     
     */
    public ZifProdCatVehicleTransfer getProdCatVehicleTransfer() {
        return prodCatVehicleTransfer;
    }

    /**
     * Sets the value of the prodCatVehicleTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatVehicleTransfer }
     *     
     */
    public void setProdCatVehicleTransfer(ZifProdCatVehicleTransfer value) {
        this.prodCatVehicleTransfer = value;
    }

    /**
     * Gets the value of the prodCatVisa property.
     * 
     * @return
     *     possible object is
     *     {@link ZifProdCatVisa }
     *     
     */
    public ZifProdCatVisa getProdCatVisa() {
        return prodCatVisa;
    }

    /**
     * Sets the value of the prodCatVisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifProdCatVisa }
     *     
     */
    public void setProdCatVisa(ZifProdCatVisa value) {
        this.prodCatVisa = value;
    }

}
