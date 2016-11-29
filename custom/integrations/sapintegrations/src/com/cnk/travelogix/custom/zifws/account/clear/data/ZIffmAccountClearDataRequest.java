package com.cnk.travelogix.custom.zifws.account.clear.data;


public class ZIffmAccountClearDataRequest
{

	protected ZifstDocheadClearData iDocheader;

	protected TableOfZifstAccountData itAccount;

	/**
	 * Gets the value of the iDocheader property.
	 * 
	 * @return possible object is {@link ZifstDocheadClearData }
	 * 
	 */
	public ZifstDocheadClearData getIDocheader()
	{
		return iDocheader;
	}

	/**
	 * Sets the value of the iDocheader property.
	 * 
	 * @param value
	 *           allowed object is {@link ZifstDocheadClearData }
	 * 
	 */
	public void setIDocheader(final ZifstDocheadClearData value)
	{
		this.iDocheader = value;
	}

	/**
	 * Gets the value of the itAccount property.
	 * 
	 * @return possible object is {@link TableOfZifstAccountData }
	 * 
	 */
	public TableOfZifstAccountData getItAccount()
	{
		return itAccount;
	}

	/**
	 * Sets the value of the itAccount property.
	 * 
	 * @param value
	 *           allowed object is {@link TableOfZifstAccountData }
	 * 
	 */
	public void setItAccount(final TableOfZifstAccountData value)
	{
		this.itAccount = value;
	}

}
