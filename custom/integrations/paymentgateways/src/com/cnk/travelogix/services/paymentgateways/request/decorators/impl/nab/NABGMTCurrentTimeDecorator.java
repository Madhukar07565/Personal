/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.nab;

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
public class NABGMTCurrentTimeDecorator extends PaymentGatewayRequestFormDecorator
{
	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public NABGMTCurrentTimeDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public NABGMTCurrentTimeDecorator()
	{
		super();
	}

	@Value("#{configurationService.configuration.getProperty('paymentgateway.nab.eps.timestamp.date.format')}")
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

		final String timeStamp = getGMTCurrentTime(
				formAttribute.getDefaultValue() != null ? formAttribute.getDefaultValue() : DEFAULTTIMEFORMAT);

		if (StringUtils.isNotBlank(timeStamp))
		{
			updateFormAttributeFlags(formAttribute, timeStamp);
		}

		return formAttribute;
	}

	private String getGMTCurrentTime(final String format)
	{
		final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		return simpleDateFormat.format(new Date());

	}

}
