/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.firstdata;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


/**
 * @author C5243355
 *
 */
public class FirstDataHashGeneratorDecorator extends PaymentGatewayRequestFormDecorator
{

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public FirstDataHashGeneratorDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public FirstDataHashGeneratorDecorator()
	{
		super();
	}


	final static String ATTRIBUTE_SEPERATOR = "^";

	@Value("#{configurationService.configuration.getProperty('paymentgateway.firstdata.hash.transaction.key')}")
	private String TRANSACTION_KEY;

	final String HMAC_SHA1 = "HmacSHA1";


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.services.paymentgateways.decorators.PaymentGatewayRequestForm#processAttibuteValue(com.cnk.
	 * travelogix.beans.FormAttribute, java.util.Map)
	 */
	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
			throws InvalidKeyException, NoSuchAlgorithmException
	{
		final StringBuilder inputParams = new StringBuilder();

		final String[] parmaRequired = formAttribute.getDefaultValue().split(PaymentGatewayService.FIELD_SEPERATOR_COMMA);

		for (final String param : parmaRequired)
		{
			inputParams.append(valueMap.get(param).getValue());
			inputParams.append(ATTRIBUTE_SEPERATOR);
		}

		inputParams.setLength(inputParams.length() - 1);

		if (inputParams.length() > 1)
		{



			final String hashValue = getFirstDatakHashValue(inputParams.toString());

			if (StringUtils.isNotEmpty(hashValue))
			{
				updateFormAttributeFlags(formAttribute, hashValue);
			}
		}

		return formAttribute;
	}


	/**
	 * @param tRANSACTION_KEY2
	 * @param string
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	private String getFirstDatakHashValue(final String valueString) throws NoSuchAlgorithmException, InvalidKeyException
	{


		final SecretKey key = new SecretKeySpec(TRANSACTION_KEY.getBytes(), HMAC_SHA1);
		final Mac mac = Mac.getInstance(HMAC_SHA1);
		mac.init(key);

		final byte[] result = mac.doFinal(valueString.getBytes());

		final StringBuilder strbuf = new StringBuilder(result.length * 2);
		for (int i = 0; i < result.length; i++)
		{
			if ((result[i] & 0xff) < 0x10)
			{
				strbuf.append("0");
			}
			strbuf.append(Long.toString(result[i] & 0xff, 16));
		}

		return strbuf.toString();
	}



}
