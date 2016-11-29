/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.response.decorators.impl.asiapay;

import java.util.Map;

import com.cnk.travelogix.integrations.payment.response.beans.ResponseAttribute;
import com.cnk.travelogix.services.paymentgateways.response.decorators.PaymentGatewayResponseDataDecorator;


/**
 * @author C5243355
 *
 */
public class AsiapayResponseDecorator extends PaymentGatewayResponseDataDecorator
{
	@Override
	public ResponseAttribute processResponseAttibuteValue(final ResponseAttribute responseAttribute,
			final Map<String, ResponseAttribute> valueMap) throws Exception
	{
		return responseAttribute;
	}


}
