
package com.cnk.travelogix.sapintegrations.so.createchange.data;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;


public class ZifTerpSoItemData
{

	@XmlElement(name = "ItmNumber", required = true)
	protected String itmNumber;
	@XmlElement(name = "Material", required = true)
	protected String material;
	@XmlElement(name = "Quantity", required = true)
	protected BigDecimal quantity;
	@XmlElement(name = "Adult", required = true)
	protected String adult;
	@XmlElement(name = "Child", required = true)
	protected String child;
	@XmlElement(name = "Infant", required = true)
	protected String infant;
	@XmlElement(name = "RejectionReason", required = true)
	protected String rejectionReason;
	@XmlElement(name = "ProfitCenter", required = true)
	protected String profitCenter;
	@XmlElement(name = "MatGrp1", required = true)
	protected String matGrp1;
	@XmlElement(name = "MatGrp2", required = true)
	protected String matGrp2;
	@XmlElement(name = "MatGrp3", required = true)
	protected String matGrp3;
	@XmlElement(name = "MatGrp4", required = true)
	protected String matGrp4;
	@XmlElement(name = "MatGrp5", required = true)
	protected String matGrp5;
	@XmlElement(name = "Category", required = true)
	protected String category;
	@XmlElement(name = "CrmtMode", required = true)
	protected String crmtMode;

	/**
	 * Gets the value of the itmNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getItmNumber()
	{
		return itmNumber;
	}

	/**
	 * Sets the value of the itmNumber property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setItmNumber(final String value)
	{
		this.itmNumber = value;
	}

	/**
	 * Gets the value of the material property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaterial()
	{
		return material;
	}

	/**
	 * Sets the value of the material property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setMaterial(final String value)
	{
		this.material = value;
	}

	/**
	 * Gets the value of the quantity property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getQuantity()
	{
		return quantity;
	}

	/**
	 * Sets the value of the quantity property.
	 * 
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 * 
	 */
	public void setQuantity(final BigDecimal value)
	{
		this.quantity = value;
	}

	/**
	 * Gets the value of the adult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdult()
	{
		return adult;
	}

	/**
	 * Sets the value of the adult property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setAdult(final String value)
	{
		this.adult = value;
	}

	/**
	 * Gets the value of the child property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChild()
	{
		return child;
	}

	/**
	 * Sets the value of the child property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setChild(final String value)
	{
		this.child = value;
	}

	/**
	 * Gets the value of the infant property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInfant()
	{
		return infant;
	}

	/**
	 * Sets the value of the infant property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setInfant(final String value)
	{
		this.infant = value;
	}

	/**
	 * Gets the value of the rejectionReason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRejectionReason()
	{
		return rejectionReason;
	}

	/**
	 * Sets the value of the rejectionReason property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setRejectionReason(final String value)
	{
		this.rejectionReason = value;
	}

	/**
	 * Gets the value of the profitCenter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProfitCenter()
	{
		return profitCenter;
	}

	/**
	 * Sets the value of the profitCenter property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setProfitCenter(final String value)
	{
		this.profitCenter = value;
	}

	/**
	 * Gets the value of the matGrp1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMatGrp1()
	{
		return matGrp1;
	}

	/**
	 * Sets the value of the matGrp1 property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setMatGrp1(final String value)
	{
		this.matGrp1 = value;
	}

	/**
	 * Gets the value of the matGrp2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMatGrp2()
	{
		return matGrp2;
	}

	/**
	 * Sets the value of the matGrp2 property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setMatGrp2(final String value)
	{
		this.matGrp2 = value;
	}

	/**
	 * Gets the value of the matGrp3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMatGrp3()
	{
		return matGrp3;
	}

	/**
	 * Sets the value of the matGrp3 property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setMatGrp3(final String value)
	{
		this.matGrp3 = value;
	}

	/**
	 * Gets the value of the matGrp4 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMatGrp4()
	{
		return matGrp4;
	}

	/**
	 * Sets the value of the matGrp4 property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setMatGrp4(final String value)
	{
		this.matGrp4 = value;
	}

	/**
	 * Gets the value of the matGrp5 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMatGrp5()
	{
		return matGrp5;
	}

	/**
	 * Sets the value of the matGrp5 property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setMatGrp5(final String value)
	{
		this.matGrp5 = value;
	}

	/**
	 * Gets the value of the category property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCategory()
	{
		return category;
	}

	/**
	 * Sets the value of the category property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setCategory(final String value)
	{
		this.category = value;
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

}
