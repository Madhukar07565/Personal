/**
 *
 */
package com.cnk.travelogix.b2c.storefront.forms;

import com.cnk.travelogix.common.core.wallet.data.CreditCardData;


/**
 * @author i054410
 *
 */
public class CardInfoForm extends CreditCardData implements MetaDataGenerator
{
	private static final long serialVersionUID = 1L;
	

	public boolean validate(final ResponseMessage responseMessage)
	{
		boolean isValid = true;
		if (getCreditCardNumber() == null || !getCreditCardNumber().matches("[0-9]+"))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo("creditCardNumber", "Card Number only accepts positive numeric values");
		}
		if (getCvv() == null || !getCvv().matches("[0-9]+"))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo("cvv", "CVV only accepts positive numeric values");
		}
		if (getCardholderName() == null || !getCardholderName().matches("[a-zA-Z]+[a-zA-Z ]*"))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo("cardholderName", "Card holder only accepts alphanumeric values");
		}
		return isValid;
	}
}
