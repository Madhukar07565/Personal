package com.cnk.travelogix.services.paymentgateways.response.decorators.impl.amex;

import java.util.Map;

import org.apache.log4j.Logger;

import com.cnk.travelogix.integrations.payment.response.beans.ResponseAttribute;
import com.cnk.travelogix.services.paymentgateways.response.decorators.PaymentGatewayResponseDataDecorator;



public class AmexResponseDecorator extends PaymentGatewayResponseDataDecorator
{
	private static final Logger LOG = Logger.getLogger(AmexResponseDecorator.class);


	@Override
	public ResponseAttribute processResponseAttibuteValue(final ResponseAttribute responseAttribute,
			final Map<String, ResponseAttribute> valueMap) throws Exception
	{
		return responseAttribute;
	}

}
