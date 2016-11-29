/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.hdfc;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


/**
 * @author C5243355
 *
 */
public class HDFCRedirectURLDecorator extends PaymentGatewayRequestFormDecorator
{
	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public HDFCRedirectURLDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public HDFCRedirectURLDecorator()
	{
		super();
	}

	private static final Logger LOG = Logger.getLogger(HDFCRedirectURLDecorator.class);

	private static final String ACTION = "actionURL";

	private String redirectURL;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.services.paymentgateways.decorators.PaymentGatewayRequestForm#processAttibuteValue(com.cnk.
	 * travelogix.beans.FormAttribute, java.util.Map)
	 */
	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
			throws IOException
	{
		final String actionURL = valueMap.get(ACTION).getValue();
		final StringBuilder requestValue = new StringBuilder();
		final String[] requestValueParams = formAttribute.getDefaultValue().split(PaymentGatewayService.FIELD_SEPERATOR_COMMA);

		for (final String key : requestValueParams)
		{
			requestValue.append(key);
			requestValue.append(PaymentGatewayService.STRING_EQUAL_SYMBOL);
			requestValue.append(valueMap.get(key).getValue());
			requestValue.append(PaymentGatewayService.STRING_APPERSENT_SYMBOL);

		}
		requestValue.setLength(requestValue.length() - 1);

		redirectURL = getRedirectURL(actionURL, requestValue);


		if (StringUtils.isNotEmpty(redirectURL))
		{
			updateFormAttributeFlags(formAttribute, redirectURL);


		}
		return formAttribute;
	}

	private String getRedirectURL(final String actionURL, final StringBuilder requestValue) throws IOException
	{
		final URL URL = new URL(actionURL);

		final URLConnection urlConnection = URL.openConnection();

		urlConnection.setDoInput(true);
		urlConnection.setDoOutput(true);
		urlConnection.setUseCaches(false);
		urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

		// Here the HTTPS request URL is created
		final DataOutputStream dataoutputstream = new DataOutputStream(urlConnection.getOutputStream());
		dataoutputstream.writeBytes(requestValue.toString()); // here the request is sent to payment gateway
		dataoutputstream.flush();
		dataoutputstream.close(); //connection closed

		final BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		final String response = bufferedreader.readLine(); //Payment Gateway response is read
		String ErrorCheck;
		try
		{
			ErrorCheck = GetTextBetweenTags(response, "!", "!-");//This line will find Error Keyword in TranResponse
		}
		catch (final Exception e)
		{
			LOG.debug(e);
			ErrorCheck = PaymentGatewayService.PAYMENT_GATEWAY_EMPTY_STRING;
		}

		if (!"ERROR".equals(ErrorCheck))//This block will check for Error in TranResponce
		{
			// If Payment Gateway response has Payment ID & Pay page URL
			final int index = response.indexOf(":");
			final int size = response.length();
			// Merchant MUST map (update) the Payment ID received with the merchant Track Id in his database at this place.
			final String paymentId = response.substring(0, index);
			final String paymentPage = response.substring(index + 1, size);
			// here redirecting the customer browser from ME site to Payment Gateway Page with the Payment ID
			return paymentPage + "?PaymentID=" + paymentId;

		}
		return "error";
	}

	private String GetTextBetweenTags(final String InputText, final String Tag1, final String Tag2)
	{
		String Result;
		int index1 = InputText.indexOf(Tag1);
		final int index2 = InputText.indexOf(Tag2);
		index1 = index1 + Tag1.length();
		Result = InputText.substring(index1, index2);
		return Result;
	}

}
