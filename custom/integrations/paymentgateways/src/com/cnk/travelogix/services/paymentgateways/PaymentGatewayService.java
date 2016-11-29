/**
 *
 */
package com.cnk.travelogix.services.paymentgateways;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


/**
 * @author C5243355
 *
 */
public abstract class PaymentGatewayService
{

	public final static String PAYMENT_SERVICE_RESPONSE_DATA_IS_SUCCESS_FLAG = "success";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_MESSAGE = "message";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_GATEWAY_ID = "gatewayId";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_PAYMENT_MODE = "paymentMode";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_CARD_TYPE = "cardType";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_AMOUNT = "amount";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_CURRENCY = "currency";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_RECEIPT_NO = "receiptNo";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_FRAUD_CHECK_DECISION = "decision";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_CARD_NUMBER = "cardNumber";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_CARD_HOLDER = "cardHolder";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_CARD_EXPIRY_MONTH = "cardExpiryMonth";
	public final static String PAYMENT_SERVICE_RESPONSE_DATA_CARD_EXPIRY_YEAR = "cardExpiryYear";

	public final static String PAYMENT_SERVICE_REQUEST_USER_SELECTED_PAYMENTGATEWAYID = "paymentGatewayId";
	public final static String PAYMENT_SERVICE_REQUEST_USER_SELECTED_AMOUNT = "amount";
	public final static String PAYMENT_SERVICE_REQUEST_USER_SELECTED_PAYMENTMODE = "paymentMode";
	public final static String PAYMENT_SERVICE_REQUEST_USER_SELECTED_CARDTYPE = "cardType";
	public final static String PAYMENT_SERVICE_REQUEST_USER_SELECTED_CURRENCY = "currency";
	public final static String PAYMENT_SERVICE_REQUEST_USER_SELECTED_ORDERID = "orderId";



	public final static String PAYMENT_GATEWAY_EMPTY_STRING = "";
	public static final String FIELD_SEPERATOR_COMMA = ",";
	public static final String STRING_EQUAL_SYMBOL = "=";
	public static final String STRING_APPERSENT_SYMBOL = "&";
	public static final String STRING_FORWARD_SLASH = "/";

	public static final String BASE_SITE_URL = "PGCBS_URL";
	public final static String RESPONSE_CONTROLLER_PATTREN = "/payment-provider-response";

	protected String getFile(final String fileName) throws IOException
	{
		final ClassLoader classLoader = getClass().getClassLoader();

		return IOUtils.toString(classLoader.getResourceAsStream(fileName));
	}


	protected Document getJsoupDocumentWithPaymentProviderId(final String id) throws IOException
	{
		return Jsoup.parse(getFile(id));

	}


}
