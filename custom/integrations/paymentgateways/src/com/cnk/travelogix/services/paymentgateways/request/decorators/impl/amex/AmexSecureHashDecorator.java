package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.amex;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;



public class AmexSecureHashDecorator extends PaymentGatewayRequestFormDecorator
{
	private static final Logger LOG = Logger.getLogger(AmexSecureHashDecorator.class);


	@Value("#{configurationService.configuration.getProperty('paymentgateway.amex.vpc.secure.hash.key')}")
	private String AMEX_SECURE_HASH_KEY;

	private static final String UTF_8 = "UTF-8";
	private static final String CP850 = "CP850";
	private static final String ISO_8859_1 = "ISO-8859-1";
	private static final String SHA256 = "SHA256";
	private static final String HMAC_SHA256 = "HmacSHA256";
	private static final String VPC_SECURE_HASH = "vpc_SecureHash";
	private static final String VPC_SECURE_HASH_TYPE = "vpc_SecureHashType";



	/**
	 * @param paymentGatewayProviderRequestForm
	 */

	public AmexSecureHashDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
	}

	public AmexSecureHashDecorator()
	{
		super();
	}

	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
			throws Exception
	{
		final StringBuilder hashValue = new StringBuilder();
		final SortedSet<String> keys = new TreeSet<>(valueMap.keySet());
		final String[] parmaToSkip = formAttribute.getDefaultValue().split(PaymentGatewayService.FIELD_SEPERATOR_COMMA);
		final List<String> attributeList = Arrays.asList(parmaToSkip);

		for (final String key : keys)
		{
			if (!attributeList.contains(key))
			{
				hashValue.append(key);
				hashValue.append(PaymentGatewayService.STRING_EQUAL_SYMBOL);
				hashValue.append(valueMap.get(key).getValue());
				hashValue.append(PaymentGatewayService.STRING_APPERSENT_SYMBOL);
			}
		}
		hashValue.deleteCharAt(hashValue.length() - 1);

		final String valueISO = new String(hashValue.toString().getBytes(CP850), ISO_8859_1);
		String hashCode = new String(valueISO.getBytes(), UTF_8);

		final String hexaHashCode = getHashCode(AMEX_SECURE_HASH_KEY, hashCode);

		if (hexaHashCode != null)
		{
			hashValue.append(PaymentGatewayService.STRING_APPERSENT_SYMBOL);
			hashValue.append(VPC_SECURE_HASH);
			hashValue.append(PaymentGatewayService.STRING_EQUAL_SYMBOL + hexaHashCode);
			hashValue.append(PaymentGatewayService.STRING_APPERSENT_SYMBOL);
			hashValue.append(VPC_SECURE_HASH_TYPE);
			hashValue.append(PaymentGatewayService.STRING_EQUAL_SYMBOL + SHA256);
			hashCode = hashValue.toString();

			if (!StringUtils.isEmpty(hashCode))
			{
				updateFormAttributeFlags(formAttribute, hashCode);
			}
		}



		return formAttribute;
	}

	public static String getHashCode(final String secret, final String code)
	{
		Mac sha256_HMAC = null;
		try
		{
			sha256_HMAC = Mac.getInstance(HMAC_SHA256);
			final SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), HMAC_SHA256);
			sha256_HMAC.init(secret_key);

			return Base64.encodeBase64String(sha256_HMAC.doFinal(code.getBytes()));

		}
		catch (final InvalidKeyException | NoSuchAlgorithmException e)
		{
			LOG.debug(e);
		}
		return PaymentGatewayService.PAYMENT_GATEWAY_EMPTY_STRING;
	}
}
