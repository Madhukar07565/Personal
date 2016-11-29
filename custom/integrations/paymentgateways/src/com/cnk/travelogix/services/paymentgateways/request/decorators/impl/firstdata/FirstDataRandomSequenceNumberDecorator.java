/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.firstdata;

import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


/**
 * @author C5243355
 *
 */
public class FirstDataRandomSequenceNumberDecorator extends PaymentGatewayRequestFormDecorator
{

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public FirstDataRandomSequenceNumberDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public FirstDataRandomSequenceNumberDecorator()
	{
		super();
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.services.paymentgateways.decorators.PaymentGatewayRequestForm#processAttibuteValue(com.cnk.
	 * travelogix.beans.FormAttribute, java.util.Map)
	 */
	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
	{

		final String randomSequence = getRandomNumberAsString();

		if (StringUtils.isNotBlank(randomSequence))
		{
			updateFormAttributeFlags(formAttribute, randomSequence);
		}
		return formAttribute;
	}


	private String getRandomNumberAsString()
	{

		final Random generator = new Random();
		final int randomSequence = generator.nextInt(1000);

		return String.valueOf(randomSequence);
	}

}
