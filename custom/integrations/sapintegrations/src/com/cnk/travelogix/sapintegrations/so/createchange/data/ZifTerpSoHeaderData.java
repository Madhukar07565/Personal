
package com.cnk.travelogix.sapintegrations.so.createchange.data;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;


public class ZifTerpSoHeaderData
{

	@XmlElement(name = "Uniqid", required = true)
	protected String uniqid;
	@XmlElement(name = "Trntyp", required = true)
	protected String trntyp;
	@XmlElement(name = "SalesOrg", required = true)
	protected String salesOrg;
	@XmlElement(name = "DistChannel", required = true)
	protected String distChannel;
	@XmlElement(name = "Division", required = true)
	protected String division;
	@XmlElement(name = "SalesOff", required = true)
	protected String salesOff;
	@XmlElement(name = "SalesGrp", required = true)
	protected String salesGrp;
	@XmlElement(name = "DocCurr", required = true)
	protected String docCurr;
	@XmlElement(name = "ExgRate", required = true)
	protected BigDecimal exgRate;
	@XmlElement(name = "ReqDeliDate", required = true)
	protected String reqDeliDate;
	@XmlElement(name = "Pmnttrms", required = true)
	protected String pmnttrms;
	@XmlElement(name = "PoNumberSold", required = true)
	protected String poNumberSold;
	@XmlElement(name = "SoDocNo", required = true)
	protected String soDocNo;
	@XmlElement(name = "YourRefSold", required = true)
	protected String yourRefSold;
	@XmlElement(name = "OrdReason", required = true)
	protected String ordReason;
	@XmlElement(name = "Submission", required = true)
	protected String submission;
	@XmlElement(name = "PoDateSold", required = true)
	protected String poDateSold;
	@XmlElement(name = "NetValue", required = true)
	protected BigDecimal netValue;
	@XmlElement(name = "TaxAmount", required = true)
	protected BigDecimal taxAmount;
	@XmlElement(name = "Status1", required = true)
	protected String status1;
	@XmlElement(name = "SoNo", required = true)
	protected String soNo;
	@XmlElement(name = "CrmtMode", required = true)
	protected String crmtMode;
	@XmlElement(name = "CampaignCode", required = true)
	protected String campaignCode;
	@XmlElement(name = "OpportunityId", required = true)
	protected String opportunityId;

	/**
	 * Gets the value of the uniqid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUniqid()
	{
		return uniqid;
	}

	/**
	 * Sets the value of the uniqid property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setUniqid(final String value)
	{
		this.uniqid = value;
	}

	/**
	 * Gets the value of the trntyp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTrntyp()
	{
		return trntyp;
	}

	/**
	 * Sets the value of the trntyp property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setTrntyp(final String value)
	{
		this.trntyp = value;
	}

	/**
	 * Gets the value of the salesOrg property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSalesOrg()
	{
		return salesOrg;
	}

	/**
	 * Sets the value of the salesOrg property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSalesOrg(final String value)
	{
		this.salesOrg = value;
	}

	/**
	 * Gets the value of the distChannel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDistChannel()
	{
		return distChannel;
	}

	/**
	 * Sets the value of the distChannel property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setDistChannel(final String value)
	{
		this.distChannel = value;
	}

	/**
	 * Gets the value of the division property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDivision()
	{
		return division;
	}

	/**
	 * Sets the value of the division property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setDivision(final String value)
	{
		this.division = value;
	}

	/**
	 * Gets the value of the salesOff property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSalesOff()
	{
		return salesOff;
	}

	/**
	 * Sets the value of the salesOff property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSalesOff(final String value)
	{
		this.salesOff = value;
	}

	/**
	 * Gets the value of the salesGrp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSalesGrp()
	{
		return salesGrp;
	}

	/**
	 * Sets the value of the salesGrp property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSalesGrp(final String value)
	{
		this.salesGrp = value;
	}

	/**
	 * Gets the value of the docCurr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocCurr()
	{
		return docCurr;
	}

	/**
	 * Sets the value of the docCurr property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setDocCurr(final String value)
	{
		this.docCurr = value;
	}

	/**
	 * Gets the value of the exgRate property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getExgRate()
	{
		return exgRate;
	}

	/**
	 * Sets the value of the exgRate property.
	 * 
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 * 
	 */
	public void setExgRate(final BigDecimal value)
	{
		this.exgRate = value;
	}

	/**
	 * Gets the value of the reqDeliDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReqDeliDate()
	{
		return reqDeliDate;
	}

	/**
	 * Sets the value of the reqDeliDate property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setReqDeliDate(final String value)
	{
		this.reqDeliDate = value;
	}

	/**
	 * Gets the value of the pmnttrms property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPmnttrms()
	{
		return pmnttrms;
	}

	/**
	 * Sets the value of the pmnttrms property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setPmnttrms(final String value)
	{
		this.pmnttrms = value;
	}

	/**
	 * Gets the value of the poNumberSold property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPoNumberSold()
	{
		return poNumberSold;
	}

	/**
	 * Sets the value of the poNumberSold property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setPoNumberSold(final String value)
	{
		this.poNumberSold = value;
	}

	/**
	 * Gets the value of the soDocNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSoDocNo()
	{
		return soDocNo;
	}

	/**
	 * Sets the value of the soDocNo property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSoDocNo(final String value)
	{
		this.soDocNo = value;
	}

	/**
	 * Gets the value of the yourRefSold property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getYourRefSold()
	{
		return yourRefSold;
	}

	/**
	 * Sets the value of the yourRefSold property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setYourRefSold(final String value)
	{
		this.yourRefSold = value;
	}

	/**
	 * Gets the value of the ordReason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrdReason()
	{
		return ordReason;
	}

	/**
	 * Sets the value of the ordReason property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setOrdReason(final String value)
	{
		this.ordReason = value;
	}

	/**
	 * Gets the value of the submission property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubmission()
	{
		return submission;
	}

	/**
	 * Sets the value of the submission property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSubmission(final String value)
	{
		this.submission = value;
	}

	/**
	 * Gets the value of the poDateSold property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPoDateSold()
	{
		return poDateSold;
	}

	/**
	 * Sets the value of the poDateSold property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setPoDateSold(final String value)
	{
		this.poDateSold = value;
	}

	/**
	 * Gets the value of the netValue property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getNetValue()
	{
		return netValue;
	}

	/**
	 * Sets the value of the netValue property.
	 * 
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 * 
	 */
	public void setNetValue(final BigDecimal value)
	{
		this.netValue = value;
	}

	/**
	 * Gets the value of the taxAmount property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTaxAmount()
	{
		return taxAmount;
	}

	/**
	 * Sets the value of the taxAmount property.
	 * 
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTaxAmount(final BigDecimal value)
	{
		this.taxAmount = value;
	}

	/**
	 * Gets the value of the status1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus1()
	{
		return status1;
	}

	/**
	 * Sets the value of the status1 property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setStatus1(final String value)
	{
		this.status1 = value;
	}

	/**
	 * Gets the value of the soNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSoNo()
	{
		return soNo;
	}

	/**
	 * Sets the value of the soNo property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSoNo(final String value)
	{
		this.soNo = value;
	}

	/**
	 * Gets the value of the crmtMode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrmtMode()
	{
		return crmtMode;
	}

	/**
	 * Sets the value of the crmtMode property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setCrmtMode(final String value)
	{
		this.crmtMode = value;
	}

	/**
	 * Gets the value of the campaignCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCampaignCode()
	{
		return campaignCode;
	}

	/**
	 * Sets the value of the campaignCode property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setCampaignCode(final String value)
	{
		this.campaignCode = value;
	}

	/**
	 * Gets the value of the opportunityId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOpportunityId()
	{
		return opportunityId;
	}

	/**
	 * Sets the value of the opportunityId property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setOpportunityId(final String value)
	{
		this.opportunityId = value;
	}

}
