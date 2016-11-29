/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.response.decorators.impl.icici;

import java.security.MessageDigest;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import com.cnk.travelogix.integrations.payment.response.beans.ResponseAttribute;
import com.cnk.travelogix.services.paymentgateways.response.decorators.PaymentGatewayResponseDataDecorator;


/**
 * @author C5243355
 *
 */
public class ICICIResponseHashDecorator extends PaymentGatewayResponseDataDecorator
{

	private String sharedSecret;
	private String approval_code;
	private String charge;
	private String currency;
	private String txndatetime;
	private String storeId;

	private static Logger LOG = Logger.getLogger(ICICIResponseHashDecorator.class);

	@Value("#{configurationService.configuration.getProperty('paymentgateway.icici.hash.secert.key')}")
	private String SECRET_KEY;

	private static final String SHA256 = "SHA256";

	private static String FORMAT_DATE_KEY = "fmtDate";
	private static String STOREID_KEY = "storeId";
	private static String CHARGE_KEY = "charge";
	private static String CURRENCY_KEY = "icici_currency_code";


	@Override
	public ResponseAttribute processResponseAttibuteValue(final ResponseAttribute responseAttribute,
			final Map<String, ResponseAttribute> valueMap) throws Exception
	{
		final String responseHash = valueMap.get("response_hash").getValue();

		this.txndatetime = getThisKeyValueFromSession(FORMAT_DATE_KEY, Boolean.TRUE.booleanValue());
		this.storeId = getThisKeyValueFromSession(STOREID_KEY, Boolean.TRUE.booleanValue());
		this.charge = getThisKeyValueFromSession(CHARGE_KEY, Boolean.TRUE.booleanValue());
		this.currency = getThisKeyValueFromSession(CURRENCY_KEY, Boolean.TRUE.booleanValue());
		this.approval_code = valueMap.get("approval_code").getValue();
		this.sharedSecret = SECRET_KEY;

		final String generatedHash = createHash();

		if (!StringUtils.isEmpty(generatedHash))
		{
			updateResponseAttrubute(responseAttribute, responseHash.equalsIgnoreCase(generatedHash));
		}
		return responseAttribute;
	}

	private String createHash()
	{
		final String stringToHash = this.sharedSecret + this.approval_code + this.charge + this.currency + this.txndatetime
				+ this.storeId;
		return calculateHashFromHex(new StringBuilder(stringToHash));
	}

	private String calculateHashFromHex(final StringBuilder Builder)
	{
		final String algorithm = SHA256;

		MessageDigest messageDigest = null;
		try
		{
			messageDigest = MessageDigest.getInstance(algorithm);
		}
		catch (final Exception e)
		{
			LOG.debug(e);
			throw new IllegalArgumentException("Algorithm '" + algorithm + "' not supported");
		}
		final StringBuilder result = new StringBuilder();
		final StringBuilder sb = new StringBuilder();
		final byte[] bytes = Builder.toString().getBytes();

		final int byteLen = bytes.length;
		for (int i = 0; i < byteLen; i++)
		{
			final byte b = bytes[i];
			sb.append(Character.forDigit((b & 0xF0) >> 4, 16));
			sb.append(Character.forDigit(b & 0xF, 16));
		}
		final StringBuilder locBuilder = new StringBuilder(sb.toString());
		messageDigest.update(locBuilder.toString().getBytes());
		final byte[] message = messageDigest.digest();
		final int messageLen = message.length;
		for (int j = 0; j < messageLen; j++)
		{
			final byte b = message[j];
			String apps = Integer.toHexString(b & 0xFF);
			if (apps.length() == 1)
			{
				apps = "0" + apps;
			}
			result.append(apps);
		}
		return result.toString();
	}

	public String getCharge()
	{
		return this.charge;
	}

	public String getSharedSecret()
	{
		return this.sharedSecret;
	}

	public String getStoreId()
	{
		return this.storeId;
	}

	public String getFormattedSysDate()
	{
		return this.txndatetime;
	}

}
