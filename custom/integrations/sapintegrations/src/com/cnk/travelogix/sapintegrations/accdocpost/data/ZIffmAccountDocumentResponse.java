
package com.cnk.travelogix.sapintegrations.accdocpost.data;

import com.cnk.travelogix.common.data.Errors;


public class ZIffmAccountDocumentResponse extends Errors
{

	protected ZifttStatusDoc eStatus;
	protected TableOfZifstGlacc itAccountgl;
	protected TableOfZifstCustomer itCustomer;
	protected TableOfZifstVendor itVendor;

	/**
	 * Gets the value of the eStatus property.
	 *
	 * @return possible object is {@link ZifttStatusDoc }
	 *
	 */
	public ZifttStatusDoc getEStatus()
	{
		return eStatus;
	}

	/**
	 * Sets the value of the eStatus property.
	 *
	 * @param value
	 *           allowed object is {@link ZifttStatusDoc }
	 *
	 */
	public void setEStatus(final ZifttStatusDoc value)
	{
		this.eStatus = value;
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
