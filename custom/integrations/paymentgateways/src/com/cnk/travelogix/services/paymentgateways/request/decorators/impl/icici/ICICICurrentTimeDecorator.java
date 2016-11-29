package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.icici;


import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


/**
 * @author C5243355
 *
 */
public class ICICICurrentTimeDecorator extends PaymentGatewayRequestFormDecorator
{
	private static final String DECIMAL_FORMAT = "00";
	private static final String DATE_FIELD_SEPERATOR_COLLAN = ":";
	private static final String DATE_FIELD_SEPERATOR_HIFUN = "-";

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public ICICICurrentTimeDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public ICICICurrentTimeDecorator()
	{
		super();
	}

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
		// YTODO Auto-generated method stub YYYY:MM:DD-hh:mm:ss

		final DecimalFormat mFormat = new DecimalFormat(DECIMAL_FORMAT);
		final LocalDateTime now = LocalDateTime.now();
		final String year = mFormat.format(Double.valueOf(now.getYear()));
		final String month = mFormat.format(Double.valueOf(now.getMonthValue()));
		final String day = mFormat.format(Double.valueOf(now.getDayOfMonth()));
		final String hour = mFormat.format(Double.valueOf(now.getHour()));
		final String minute = mFormat.format(Double.valueOf(now.getMinute()));
		final String second = mFormat.format(Double.valueOf(now.getSecond()));
		final String time = String.valueOf(year) + DATE_FIELD_SEPERATOR_COLLAN + String.valueOf(month) + DATE_FIELD_SEPERATOR_COLLAN
				+ String.valueOf(day) + DATE_FIELD_SEPERATOR_HIFUN + String.valueOf(hour) + DATE_FIELD_SEPERATOR_COLLAN
				+ String.valueOf(minute) + DATE_FIELD_SEPERATOR_COLLAN + String.valueOf(second);

		if (StringUtils.isNotEmpty(time))
		{

			updateFormAttributeFlags(formAttribute, time);
		}

		return formAttribute;
	}

}
