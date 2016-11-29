package com.cnk.travelogix.custom.zifws.account.clear.data;

import com.cnk.travelogix.common.data.Errors;


public class ZIffmAccountClearDataResponse extends Errors
{
	protected ZifttStatusDocData eStatus;
	protected TableOfZifstAccountData itAccount;

	/**
	 * Gets the value of the eStatus property.
	 *
	 * @return possible object is {@link ZifttStatusDocData }
	 *
	 */
	public ZifttStatusDocData getEStatus()
	{
		return eStatus;
	}

	/**
	 * Sets the value of the eStatus property.
	 *
	 * @param value
	 *           allowed object is {@link ZifttStatusDocData }
	 *
	 */
	public void setEStatus(final ZifttStatusDocData value)
	{
		this.eStatus = value;
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
