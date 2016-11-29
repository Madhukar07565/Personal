
package com.cnk.travelogix.custom.ziffm.vendor.createchange;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZvendorInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZvendorInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uniqid" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="Lifnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Bukrs" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Ekorg" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Ktokk" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="UseZav" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="TitleMedi" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Name1" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Name2" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Sort1" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="Sort2" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="Street" type="{urn:sap-com:document:sap:rfc:functions}char60"/>
 *         &lt;element name="StrSuppl3" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Location" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="PostCode1" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="City1" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Country" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Region" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Langu" type="{urn:sap-com:document:sap:rfc:functions}lang"/>
 *         &lt;element name="TelNumber" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="MobNumber" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="FaxNumber" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="SmtpAddr" type="{urn:sap-com:document:sap:rfc:functions}char241"/>
 *         &lt;element name="Kunnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Begru" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Vbund" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Konzs" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Brsch" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Bank" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZbankDetailTt"/>
 *         &lt;element name="Akont" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Zuawa" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Lnrze" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Begru1" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Fdgrv" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Altkn" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Zterm" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Reprf" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Zwels" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Waers" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="ZtermP" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Kalsk" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Webre" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Lebre" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Witht" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Witht02" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="WtWithcd" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Qsrec" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="WtExnr" type="{urn:sap-com:document:sap:rfc:functions}char25"/>
 *         &lt;element name="WtExrt" type="{urn:sap-com:document:sap:rfc:functions}decimal5.2"/>
 *         &lt;element name="WtWtexrs" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="WtExdf" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="WtExdt" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="J1ipanno" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="J1isern" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="J1icstno" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="J1ilstno" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Sperr" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Sperm" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Sperq" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Pernr" type="{urn:sap-com:document:sap:soap:functions:mc-style}numeric8"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZvendorInput", propOrder = {
    "uniqid",
    "lifnr",
    "bukrs",
    "ekorg",
    "ktokk",
    "useZav",
    "titleMedi",
    "name1",
    "name2",
    "sort1",
    "sort2",
    "street",
    "strSuppl3",
    "location",
    "postCode1",
    "city1",
    "country",
    "region",
    "langu",
    "telNumber",
    "mobNumber",
    "faxNumber",
    "smtpAddr",
    "kunnr",
    "begru",
    "vbund",
    "konzs",
    "brsch",
    "bank",
    "akont",
    "zuawa",
    "lnrze",
    "begru1",
    "fdgrv",
    "altkn",
    "zterm",
    "reprf",
    "zwels",
    "waers",
    "ztermP",
    "kalsk",
    "webre",
    "lebre",
    "witht",
    "witht02",
    "wtWithcd",
    "qsrec",
    "wtExnr",
    "wtExrt",
    "wtWtexrs",
    "wtExdf",
    "wtExdt",
    "j1Ipanno",
    "j1Isern",
    "j1Icstno",
    "j1Ilstno",
    "sperr",
    "sperm",
    "sperq",
    "pernr"
})
public class ZvendorInput {

    @XmlElement(name = "Uniqid", required = true)
    protected String uniqid;
    @XmlElement(name = "Lifnr", required = true)
    protected String lifnr;
    @XmlElement(name = "Bukrs", required = true)
    protected String bukrs;
    @XmlElement(name = "Ekorg", required = true)
    protected String ekorg;
    @XmlElement(name = "Ktokk", required = true)
    protected String ktokk;
    @XmlElement(name = "UseZav", required = true)
    protected String useZav;
    @XmlElement(name = "TitleMedi", required = true)
    protected String titleMedi;
    @XmlElement(name = "Name1", required = true)
    protected String name1;
    @XmlElement(name = "Name2", required = true)
    protected String name2;
    @XmlElement(name = "Sort1", required = true)
    protected String sort1;
    @XmlElement(name = "Sort2", required = true)
    protected String sort2;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "StrSuppl3", required = true)
    protected String strSuppl3;
    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElement(name = "PostCode1", required = true)
    protected String postCode1;
    @XmlElement(name = "City1", required = true)
    protected String city1;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "Langu", required = true)
    protected String langu;
    @XmlElement(name = "TelNumber", required = true)
    protected String telNumber;
    @XmlElement(name = "MobNumber", required = true)
    protected String mobNumber;
    @XmlElement(name = "FaxNumber", required = true)
    protected String faxNumber;
    @XmlElement(name = "SmtpAddr", required = true)
    protected String smtpAddr;
    @XmlElement(name = "Kunnr", required = true)
    protected String kunnr;
    @XmlElement(name = "Begru", required = true)
    protected String begru;
    @XmlElement(name = "Vbund", required = true)
    protected String vbund;
    @XmlElement(name = "Konzs", required = true)
    protected String konzs;
    @XmlElement(name = "Brsch", required = true)
    protected String brsch;
    @XmlElement(name = "Bank", required = true)
    protected ZbankDetailTt bank;
    @XmlElement(name = "Akont", required = true)
    protected String akont;
    @XmlElement(name = "Zuawa", required = true)
    protected String zuawa;
    @XmlElement(name = "Lnrze", required = true)
    protected String lnrze;
    @XmlElement(name = "Begru1", required = true)
    protected String begru1;
    @XmlElement(name = "Fdgrv", required = true)
    protected String fdgrv;
    @XmlElement(name = "Altkn", required = true)
    protected String altkn;
    @XmlElement(name = "Zterm", required = true)
    protected String zterm;
    @XmlElement(name = "Reprf", required = true)
    protected String reprf;
    @XmlElement(name = "Zwels", required = true)
    protected String zwels;
    @XmlElement(name = "Waers", required = true)
    protected String waers;
    @XmlElement(name = "ZtermP", required = true)
    protected String ztermP;
    @XmlElement(name = "Kalsk", required = true)
    protected String kalsk;
    @XmlElement(name = "Webre", required = true)
    protected String webre;
    @XmlElement(name = "Lebre", required = true)
    protected String lebre;
    @XmlElement(name = "Witht", required = true)
    protected String witht;
    @XmlElement(name = "Witht02", required = true)
    protected String witht02;
    @XmlElement(name = "WtWithcd", required = true)
    protected String wtWithcd;
    @XmlElement(name = "Qsrec", required = true)
    protected String qsrec;
    @XmlElement(name = "WtExnr", required = true)
    protected String wtExnr;
    @XmlElement(name = "WtExrt", required = true)
    protected BigDecimal wtExrt;
    @XmlElement(name = "WtWtexrs", required = true)
    protected String wtWtexrs;
    @XmlElement(name = "WtExdf", required = true)
    protected String wtExdf;
    @XmlElement(name = "WtExdt", required = true)
    protected String wtExdt;
    @XmlElement(name = "J1ipanno", required = true)
    protected String j1Ipanno;
    @XmlElement(name = "J1isern", required = true)
    protected String j1Isern;
    @XmlElement(name = "J1icstno", required = true)
    protected String j1Icstno;
    @XmlElement(name = "J1ilstno", required = true)
    protected String j1Ilstno;
    @XmlElement(name = "Sperr", required = true)
    protected String sperr;
    @XmlElement(name = "Sperm", required = true)
    protected String sperm;
    @XmlElement(name = "Sperq", required = true)
    protected String sperq;
    @XmlElement(name = "Pernr", required = true)
    protected String pernr;

    /**
     * Gets the value of the uniqid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqid() {
        return uniqid;
    }

    /**
     * Sets the value of the uniqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqid(String value) {
        this.uniqid = value;
    }

    /**
     * Gets the value of the lifnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifnr() {
        return lifnr;
    }

    /**
     * Sets the value of the lifnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifnr(String value) {
        this.lifnr = value;
    }

    /**
     * Gets the value of the bukrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * Sets the value of the bukrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBukrs(String value) {
        this.bukrs = value;
    }

    /**
     * Gets the value of the ekorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEkorg() {
        return ekorg;
    }

    /**
     * Sets the value of the ekorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEkorg(String value) {
        this.ekorg = value;
    }

    /**
     * Gets the value of the ktokk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtokk() {
        return ktokk;
    }

    /**
     * Sets the value of the ktokk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtokk(String value) {
        this.ktokk = value;
    }

    /**
     * Gets the value of the useZav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseZav() {
        return useZav;
    }

    /**
     * Sets the value of the useZav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseZav(String value) {
        this.useZav = value;
    }

    /**
     * Gets the value of the titleMedi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleMedi() {
        return titleMedi;
    }

    /**
     * Sets the value of the titleMedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleMedi(String value) {
        this.titleMedi = value;
    }

    /**
     * Gets the value of the name1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Sets the value of the name1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the sort1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort1() {
        return sort1;
    }

    /**
     * Sets the value of the sort1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort1(String value) {
        this.sort1 = value;
    }

    /**
     * Gets the value of the sort2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort2() {
        return sort2;
    }

    /**
     * Sets the value of the sort2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort2(String value) {
        this.sort2 = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the strSuppl3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSuppl3() {
        return strSuppl3;
    }

    /**
     * Sets the value of the strSuppl3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSuppl3(String value) {
        this.strSuppl3 = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the postCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode1() {
        return postCode1;
    }

    /**
     * Sets the value of the postCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode1(String value) {
        this.postCode1 = value;
    }

    /**
     * Gets the value of the city1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity1() {
        return city1;
    }

    /**
     * Sets the value of the city1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity1(String value) {
        this.city1 = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the langu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangu() {
        return langu;
    }

    /**
     * Sets the value of the langu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangu(String value) {
        this.langu = value;
    }

    /**
     * Gets the value of the telNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNumber() {
        return telNumber;
    }

    /**
     * Sets the value of the telNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNumber(String value) {
        this.telNumber = value;
    }

    /**
     * Gets the value of the mobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobNumber() {
        return mobNumber;
    }

    /**
     * Sets the value of the mobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobNumber(String value) {
        this.mobNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the smtpAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpAddr() {
        return smtpAddr;
    }

    /**
     * Sets the value of the smtpAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpAddr(String value) {
        this.smtpAddr = value;
    }

    /**
     * Gets the value of the kunnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKunnr() {
        return kunnr;
    }

    /**
     * Sets the value of the kunnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKunnr(String value) {
        this.kunnr = value;
    }

    /**
     * Gets the value of the begru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegru() {
        return begru;
    }

    /**
     * Sets the value of the begru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegru(String value) {
        this.begru = value;
    }

    /**
     * Gets the value of the vbund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbund() {
        return vbund;
    }

    /**
     * Sets the value of the vbund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbund(String value) {
        this.vbund = value;
    }

    /**
     * Gets the value of the konzs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonzs() {
        return konzs;
    }

    /**
     * Sets the value of the konzs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonzs(String value) {
        this.konzs = value;
    }

    /**
     * Gets the value of the brsch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrsch() {
        return brsch;
    }

    /**
     * Sets the value of the brsch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrsch(String value) {
        this.brsch = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link ZbankDetailTt }
     *     
     */
    public ZbankDetailTt getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZbankDetailTt }
     *     
     */
    public void setBank(ZbankDetailTt value) {
        this.bank = value;
    }

    /**
     * Gets the value of the akont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkont() {
        return akont;
    }

    /**
     * Sets the value of the akont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkont(String value) {
        this.akont = value;
    }

    /**
     * Gets the value of the zuawa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZuawa() {
        return zuawa;
    }

    /**
     * Sets the value of the zuawa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZuawa(String value) {
        this.zuawa = value;
    }

    /**
     * Gets the value of the lnrze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnrze() {
        return lnrze;
    }

    /**
     * Sets the value of the lnrze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnrze(String value) {
        this.lnrze = value;
    }

    /**
     * Gets the value of the begru1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegru1() {
        return begru1;
    }

    /**
     * Sets the value of the begru1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegru1(String value) {
        this.begru1 = value;
    }

    /**
     * Gets the value of the fdgrv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdgrv() {
        return fdgrv;
    }

    /**
     * Sets the value of the fdgrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdgrv(String value) {
        this.fdgrv = value;
    }

    /**
     * Gets the value of the altkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltkn() {
        return altkn;
    }

    /**
     * Sets the value of the altkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltkn(String value) {
        this.altkn = value;
    }

    /**
     * Gets the value of the zterm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZterm() {
        return zterm;
    }

    /**
     * Sets the value of the zterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZterm(String value) {
        this.zterm = value;
    }

    /**
     * Gets the value of the reprf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReprf() {
        return reprf;
    }

    /**
     * Sets the value of the reprf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReprf(String value) {
        this.reprf = value;
    }

    /**
     * Gets the value of the zwels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwels() {
        return zwels;
    }

    /**
     * Sets the value of the zwels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwels(String value) {
        this.zwels = value;
    }

    /**
     * Gets the value of the waers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaers() {
        return waers;
    }

    /**
     * Sets the value of the waers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaers(String value) {
        this.waers = value;
    }

    /**
     * Gets the value of the ztermP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZtermP() {
        return ztermP;
    }

    /**
     * Sets the value of the ztermP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZtermP(String value) {
        this.ztermP = value;
    }

    /**
     * Gets the value of the kalsk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKalsk() {
        return kalsk;
    }

    /**
     * Sets the value of the kalsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKalsk(String value) {
        this.kalsk = value;
    }

    /**
     * Gets the value of the webre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebre() {
        return webre;
    }

    /**
     * Sets the value of the webre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebre(String value) {
        this.webre = value;
    }

    /**
     * Gets the value of the lebre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLebre() {
        return lebre;
    }

    /**
     * Sets the value of the lebre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLebre(String value) {
        this.lebre = value;
    }

    /**
     * Gets the value of the witht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitht() {
        return witht;
    }

    /**
     * Sets the value of the witht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitht(String value) {
        this.witht = value;
    }

    /**
     * Gets the value of the witht02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitht02() {
        return witht02;
    }

    /**
     * Sets the value of the witht02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitht02(String value) {
        this.witht02 = value;
    }

    /**
     * Gets the value of the wtWithcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtWithcd() {
        return wtWithcd;
    }

    /**
     * Sets the value of the wtWithcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtWithcd(String value) {
        this.wtWithcd = value;
    }

    /**
     * Gets the value of the qsrec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQsrec() {
        return qsrec;
    }

    /**
     * Sets the value of the qsrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQsrec(String value) {
        this.qsrec = value;
    }

    /**
     * Gets the value of the wtExnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtExnr() {
        return wtExnr;
    }

    /**
     * Sets the value of the wtExnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtExnr(String value) {
        this.wtExnr = value;
    }

    /**
     * Gets the value of the wtExrt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWtExrt() {
        return wtExrt;
    }

    /**
     * Sets the value of the wtExrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWtExrt(BigDecimal value) {
        this.wtExrt = value;
    }

    /**
     * Gets the value of the wtWtexrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtWtexrs() {
        return wtWtexrs;
    }

    /**
     * Sets the value of the wtWtexrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtWtexrs(String value) {
        this.wtWtexrs = value;
    }

    /**
     * Gets the value of the wtExdf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtExdf() {
        return wtExdf;
    }

    /**
     * Sets the value of the wtExdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtExdf(String value) {
        this.wtExdf = value;
    }

    /**
     * Gets the value of the wtExdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtExdt() {
        return wtExdt;
    }

    /**
     * Sets the value of the wtExdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtExdt(String value) {
        this.wtExdt = value;
    }

    /**
     * Gets the value of the j1Ipanno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJ1Ipanno() {
        return j1Ipanno;
    }

    /**
     * Sets the value of the j1Ipanno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJ1Ipanno(String value) {
        this.j1Ipanno = value;
    }

    /**
     * Gets the value of the j1Isern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJ1Isern() {
        return j1Isern;
    }

    /**
     * Sets the value of the j1Isern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJ1Isern(String value) {
        this.j1Isern = value;
    }

    /**
     * Gets the value of the j1Icstno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJ1Icstno() {
        return j1Icstno;
    }

    /**
     * Sets the value of the j1Icstno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJ1Icstno(String value) {
        this.j1Icstno = value;
    }

    /**
     * Gets the value of the j1Ilstno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJ1Ilstno() {
        return j1Ilstno;
    }

    /**
     * Sets the value of the j1Ilstno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJ1Ilstno(String value) {
        this.j1Ilstno = value;
    }

    /**
     * Gets the value of the sperr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSperr() {
        return sperr;
    }

    /**
     * Sets the value of the sperr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSperr(String value) {
        this.sperr = value;
    }

    /**
     * Gets the value of the sperm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSperm() {
        return sperm;
    }

    /**
     * Sets the value of the sperm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSperm(String value) {
        this.sperm = value;
    }

    /**
     * Gets the value of the sperq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSperq() {
        return sperq;
    }

    /**
     * Sets the value of the sperq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSperq(String value) {
        this.sperq = value;
    }

    /**
     * Gets the value of the pernr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPernr() {
        return pernr;
    }

    /**
     * Sets the value of the pernr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPernr(String value) {
        this.pernr = value;
    }

}
