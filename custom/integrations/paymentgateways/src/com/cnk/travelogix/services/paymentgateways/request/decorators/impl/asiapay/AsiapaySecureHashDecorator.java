/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.asiapay;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import com.asiapay.secure.SHAPaydollarSecure;
import com.cnk.travelogix.constants.paymentgateways.asiapay.AsiaPayPaymentGatewayConstants;
import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


/**
 * @author C5243355
 *
 */
public class AsiapaySecureHashDecorator extends PaymentGatewayRequestFormDecorator
{
	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public AsiapaySecureHashDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public AsiapaySecureHashDecorator()
	{
		super();
	}

	final static String ATTRIBUTE_SEPERATOR = "|";
	@Value("#{configurationService.configuration.getProperty('paymentgateway.asiapay.hash.secret.key')}")
	private String SECRET_KEY;
	final String SHA_1 = "SHA-1";
	final String ISO_8859_1 = "iso-8859-1";

	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
			throws Exception
	{

		final String merchantId = valueMap.get(AsiaPayPaymentGatewayConstants.AISIA_PAY_MERCHANT_ID_ATTRIBUTE).getValue();
		final String merchantReferenceNumber = valueMap.get(AsiaPayPaymentGatewayConstants.AISIA_PAY_ORDER_REF_ATTRIBUTE)
				.getValue();
		final String currencyCode = valueMap.get(AsiaPayPaymentGatewayConstants.AISIA_PAY_CURRENCY_CODE_ATTRIBUTE).getValue();
		final String amount = valueMap.get(AsiaPayPaymentGatewayConstants.AISIA_PAY_AMOUNT_ATTRIBUTE).getValue();
		final String paymentType = valueMap.get(AsiaPayPaymentGatewayConstants.AISIA_PAY_TYPE_ATTRIBUTE).getValue();

		final SHAPaydollarSecure shaPaydollarSecure = new SHAPaydollarSecure();

		final String hashValue = shaPaydollarSecure.generatePaymentSecureHash(merchantId, merchantReferenceNumber, currencyCode,
				amount, paymentType, SECRET_KEY);

		if (StringUtils.isNotEmpty(hashValue))
		{
			updateFormAttributeFlags(formAttribute, hashValue);

			setRequestParamsInsession(merchantId, merchantReferenceNumber, currencyCode, amount, paymentType);
		}

		return formAttribute;
	}

	/**
	 * @param merchantId
	 * @param merchantReferenceNumber
	 * @param currencyCode
	 * @param amount
	 * @param paymentType
	 */
	private void setRequestParamsInsession(final String merchantId, final String merchantReferenceNumber,
			final String currencyCode, final String amount, final String paymentType)
	{
		setThisValueInSession(AsiaPayPaymentGatewayConstants.AISIA_PAY_MERCHANT_ID_SESSION_KEY, merchantId);
		setThisValueInSession(AsiaPayPaymentGatewayConstants.AISIA_PAY_ORDER_REF_SESSION_KEY, merchantReferenceNumber);
		setThisValueInSession(AsiaPayPaymentGatewayConstants.AISIA_PAY_CURRENCY_CODE_SESSION_KEY, currencyCode);
		setThisValueInSession(AsiaPayPaymentGatewayConstants.AISIA_PAY_AMOUNT_SESSION_KEY, amount);
		setThisValueInSession(AsiaPayPaymentGatewayConstants.AISIA_PAY_TYPE_SESSION_KEY, paymentType);

	}
}
