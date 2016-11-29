/**
 *
 */
package com.cnk.travelogix.b2c.storefront.forms;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;


/**
 * @author i322561
 *
 */
public class EzgRegisterForm extends RegisterForm
{
	private boolean tAndC;
	private boolean subscribe;

	/**
	 * @return the tAndC
	 */
	public boolean istAndC()
	{
		return tAndC;
	}

	/**
	 * @param tAndC
	 *           the tAndC to set
	 */
	public void settAndC(final boolean tAndC)
	{
		this.tAndC = tAndC;
	}

	/**
	 * @return the subscribe
	 */
	public boolean isSubscribe()
	{
		return subscribe;
	}

	/**
	 * @param subscribe
	 *           the subscribe to set
	 */
	public void setSubscribe(final boolean subscribe)
	{
		this.subscribe = subscribe;
	}


}
