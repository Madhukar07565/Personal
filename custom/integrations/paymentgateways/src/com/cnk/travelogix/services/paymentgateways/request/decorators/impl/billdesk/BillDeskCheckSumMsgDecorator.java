/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.billdesk;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import com.billdesk.pgidsk.PGIUtil;
import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


/**
 * @author C5243355
 *
 */
public class BillDeskCheckSumMsgDecorator extends PaymentGatewayRequestFormDecorator
{

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public BillDeskCheckSumMsgDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public BillDeskCheckSumMsgDecorator()
	{
		super();
	}


	private final static String CHECK_SUM_ATTRIBUTE_SEPERATOR = "|";

	@Value("#{configurationService.configuration.getProperty('paymentgateway.billdesk.checksum.key')}")
	private String CHECKSUMKEY;

	private final static String HMAC_SHA256 = "HmacSHA256";

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
		// YTODO Auto-generated method stub



		final StringBuilder requestMSG = new StringBuilder();

		final String[] parmaRequired = formAttribute.getDefaultValue().split(PaymentGatewayService.FIELD_SEPERATOR_COMMA);

		for (final String param : parmaRequired)
		{
			requestMSG.append(valueMap.get(param).getValue());
			requestMSG.append(CHECK_SUM_ATTRIBUTE_SEPERATOR);
		}

		if (requestMSG.length() > 1)
		{
			requestMSG.setLength(requestMSG.length() - 1);
		}

		final String msg = getBillDeskHashValue(CHECKSUMKEY, requestMSG);

		if (msg != null)
		{

			requestMSG.append(CHECK_SUM_ATTRIBUTE_SEPERATOR);

			requestMSG.append(msg);

			if (StringUtils.isNotEmpty(requestMSG.toString()))
			{
				updateFormAttributeFlags(formAttribute, requestMSG.toString());
			}

		}

		return formAttribute;
	}

	private String getBillDeskHashValue(final String secretKey, final StringBuilder requestMSG)
			throws NoSuchAlgorithmException, InvalidKeyException
	{
		return PGIUtil.doDigest(requestMSG.toString(), secretKey);
	}

}
