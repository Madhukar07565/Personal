
package com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data;

import com.cnk.travelogix.custom.chargeable.itemcharging.ChargingOutputContext;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargingResultContext;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargingResultOnErrorContext;
import com.cnk.travelogix.custom.chargeable.itemcharging.SenderContext;


public class ChargeableItemChargeContextData
{

	protected SenderContextData senderInfo;
	protected ChargingOutputContextData chargingOutputContext;
	protected ChargingResultContextData chargingResultContext;
	protected ChargingResultOnErrorContextData chargingResultOnErrorContext;

	/**
	 * Gets the value of the senderInfo property.
	 *
	 * @return possible object is {@link SenderContext }
	 *
	 */
	public SenderContextData getSenderInfo()
	{
		return senderInfo;
	}

	/**
	 * Sets the value of the senderInfo property.
	 *
	 * @param value
	 *           allowed object is {@link SenderContext }
	 *
	 */
	public void setSenderInfo(final SenderContextData value)
	{
		this.senderInfo = value;
	}

	/**
	 * Gets the value of the chargingOutputContext property.
	 *
	 * @return possible object is {@link ChargingOutputContext }
	 *
	 */
	public ChargingOutputContextData getChargingOutputContext()
	{
		return chargingOutputContext;
	}

	/**
	 * Sets the value of the chargingOutputContext property.
	 *
	 * @param value
	 *           allowed object is {@link ChargingOutputContext }
	 *
	 */
	public void setChargingOutputContext(final ChargingOutputContextData value)
	{
		this.chargingOutputContext = value;
	}

	/**
	 * Gets the value of the chargingResultContext property.
	 *
	 * @return possible object is {@link ChargingResultContext }
	 *
	 */
	public ChargingResultContextData getChargingResultContext()
	{
		return chargingResultContext;
	}

	/**
	 * Sets the value of the chargingResultContext property.
	 *
	 * @param value
	 *           allowed object is {@link ChargingResultContext }
	 *
	 */
	public void setChargingResultContext(final ChargingResultContextData value)
	{
		this.chargingResultContext = value;
	}

	/**
	 * Gets the value of the chargingResultOnErrorContext property.
	 *
	 * @return possible object is {@link ChargingResultOnErrorContext }
	 *
	 */
	public ChargingResultOnErrorContextData getChargingResultOnErrorContext()
	{
		return chargingResultOnErrorContext;
	}

	/**
	 * Sets the value of the chargingResultOnErrorContext property.
	 *
	 * @param value
	 *           allowed object is {@link ChargingResultOnErrorContext }
	 *
	 */
	public void setChargingResultOnErrorContext(final ChargingResultOnErrorContextData value)
	{
		this.chargingResultOnErrorContext = value;
	}

}
