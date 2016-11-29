/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.nab;

import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.util.StringUtils;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


/**
 * @author C5243355
 *
 */
public class NABFingerPrintGeneratorDecocator extends PaymentGatewayRequestFormDecorator
{

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public NABFingerPrintGeneratorDecocator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public NABFingerPrintGeneratorDecocator()
	{
		super();
	}


	private static final String SEPERATOR = "|";


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
		final String[] parmaRequired = formAttribute.getDefaultValue().split(PaymentGatewayService.FIELD_SEPERATOR_COMMA);
		final StringBuilder requestParams = new StringBuilder();

		for (final String param : parmaRequired)
		{
			requestParams.append(valueMap.get(param).getValue());
			requestParams.append(SEPERATOR);

		}

		requestParams.setLength(requestParams.length() - 1);

		final String generatedSHA1Hash = getSHA1FringerPrint(requestParams.toString());

		if (!StringUtils.isEmpty(generatedSHA1Hash))
		{
			updateFormAttributeFlags(formAttribute, generatedSHA1Hash);
		}

		return formAttribute;
	}


	private static String getSHA1FringerPrint(final String params)
	{

		return DigestUtils.sha1Hex(params);

	}

}
