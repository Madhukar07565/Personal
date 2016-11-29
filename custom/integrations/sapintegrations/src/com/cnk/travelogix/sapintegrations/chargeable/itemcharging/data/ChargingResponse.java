
package com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data;

public class ChargingResponse extends BaseResponse
{

	protected ChargingResult result;
	protected ChargingFailure error;

	/**
	 * Gets the value of the result property.
	 * 
	 * @return possible object is {@link ChargingResult }
	 * 
	 */
	public ChargingResult getResult()
	{
		return result;
	}

	/**
	 * Sets the value of the result property.
	 * 
	 * @param value
	 *           allowed object is {@link ChargingResult }
	 * 
	 */
	public void setResult(final ChargingResult value)
	{
		this.result = value;
	}

	/**
	 * Gets the value of the error property.
	 * 
	 * @return possible object is {@link ChargingFailure }
	 * 
	 */
	public ChargingFailure getError()
	{
		return error;
	}

	/**
	 * Sets the value of the error property.
	 * 
	 * @param value
	 *           allowed object is {@link ChargingFailure }
	 * 
	 */
	public void setError(final ChargingFailure value)
	{
		this.error = value;
	}

}
