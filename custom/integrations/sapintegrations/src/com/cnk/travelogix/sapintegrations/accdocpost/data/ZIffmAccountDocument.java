
package com.cnk.travelogix.sapintegrations.accdocpost.data;

import javax.xml.bind.annotation.XmlElement;


public class ZIffmAccountDocument
{

	@XmlElement(name = "IDocheader", required = true)
	protected ZifstDochead iDocheader;
	@XmlElement(name = "ItAccountgl")
	protected TableOfZifstGlacc itAccountgl;
	@XmlElement(name = "ItCustomer")
	protected TableOfZifstCustomer itCustomer;
	@XmlElement(name = "ItVendor")
	protected TableOfZifstVendor itVendor;

	/**
	 * Gets the value of the iDocheader property.
	 * 
	 * @return possible object is {@link ZifstDochead }
	 * 
	 */
	public ZifstDochead getIDocheader()
	{
		return iDocheader;
	}

	/**
	 * Sets the value of the iDocheader property.
	 * 
	 * @param value
	 *           allowed object is {@link ZifstDochead }
	 * 
	 */
	public void setIDocheader(final ZifstDochead value)
	{
		this.iDocheader = value;
	}

	/**
	 * Gets the value of the itAccountgl property.
	 * 
	 * @return possible object is {@link TableOfZifstGlacc }
	 * 
	 */
	public TableOfZifstGlacc getItAccountgl()
	{
		return itAccountgl;
	}

	/**
	 * Sets the value of the itAccountgl property.
	 * 
	 * @param value
	 *           allowed object is {@link TableOfZifstGlacc }
	 * 
	 */
	public void setItAccountgl(final TableOfZifstGlacc value)
	{
		this.itAccountgl = value;
	}

	/**
	 * Gets the value of the itCustomer property.
	 * 
	 * @return possible object is {@link TableOfZifstCustomer }
	 * 
	 */
	public TableOfZifstCustomer getItCustomer()
	{
		return itCustomer;
	}

	/**
	 * Sets the value of the itCustomer property.
	 * 
	 * @param value
	 *           allowed object is {@link TableOfZifstCustomer }
	 * 
	 */
	public void setItCustomer(final TableOfZifstCustomer value)
	{
		this.itCustomer = value;
	}

	/**
	 * Gets the value of the itVendor property.
	 * 
	 * @return possible object is {@link TableOfZifstVendor }
	 * 
	 */
	public TableOfZifstVendor getItVendor()
	{
		return itVendor;
	}

	/**
	 * Sets the value of the itVendor property.
	 * 
	 * @param value
	 *           allowed object is {@link TableOfZifstVendor }
	 * 
	 */
	public void setItVendor(final TableOfZifstVendor value)
	{
		this.itVendor = value;
	}

}
