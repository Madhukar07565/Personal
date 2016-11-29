/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.firstdata;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


/**
 * @author C5243355
 *
 */
public class FirstDataTimeStampDecorator extends PaymentGatewayRequestFormDecorator
{

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public FirstDataTimeStampDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public FirstDataTimeStampDecorator()
	{
		super();
	}

	@Value("#{configurationService.configuration.getProperty('paymentgateway.firstdata.timestamp.date.format')}")
	private String DEFAULTTIMEFORMAT;

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
		// YTODO Auto-generated method stub

		final String timeStamp = getUTCTimeStamp(
				formAttribute.getDefaultValue() != null ? formAttribute.getDefaultValue() : DEFAULTTIMEFORMAT);

		if (StringUtils.isNotBlank(timeStamp))
		{
			updateFormAttributeFlags(formAttribute, timeStamp);
		}

		return formAttribute;
	}

	private String getUTCTimeStamp(final String format)
	{
		final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		return simpleDateFormat.format(new Date());

	}

}
