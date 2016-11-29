
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.mashreq;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
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


public class MashreqSecureHashDecorator extends PaymentGatewayRequestFormDecorator
{
	private static final Logger LOG = Logger.getLogger(MashreqSecureHashDecorator.class);

	private static final String CP850 = "CP850";
	private static final String ISO_8859_1 = "ISO-8859-1";
	@Value("#{configurationService.configuration.getProperty('paymentgateway.mashreq.vpc.secure.hash.secert.key')}")
	private String MASHREQ_SECURE_HASH_SECERT_KEY;
	private static final String HMAC_SHA256 = "HmacSHA256";
	private static final String UTF_8 = "UTF-8";

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public MashreqSecureHashDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public MashreqSecureHashDecorator()
	{
		super();
	}

	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
			throws InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException
	{
		final StringBuilder hashValue = new StringBuilder();
		final SortedSet<String> keys = new TreeSet<>(valueMap.keySet());
		final String[] parmaToSkip = formAttribute.getDefaultValue().split(PaymentGatewayService.FIELD_SEPERATOR_COMMA);
		final List<String> attributeList = new ArrayList<>();
		for (final String attribute : parmaToSkip)
		{
			attributeList.add(attribute);
		}

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
		String hashCode = hashValue.toString();

		final String valueISO = new String(hashCode.getBytes(CP850), ISO_8859_1);

		hashCode = new String(valueISO.getBytes(), UTF_8);

		final String hexaHashCode = getHashCode(MASHREQ_SECURE_HASH_SECERT_KEY, hashCode);


		if (!StringUtils.isEmpty(hexaHashCode))
		{
			updateFormAttributeFlags(formAttribute, hexaHashCode);
		}

		return formAttribute;
	}

	public static String getHashCode(final String secret, final String code)
	{

		try
		{
			final Mac sha256_HMAC = Mac.getInstance(HMAC_SHA256);
			final SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), HMAC_SHA256);
			sha256_HMAC.init(secret_key);
			return Base64.encodeBase64String(sha256_HMAC.doFinal(code.getBytes()));
		}
		catch (final InvalidKeyException | NoSuchAlgorithmException e)
		{
			LOG.debug(e);
		}
		return "error";
	}
}
