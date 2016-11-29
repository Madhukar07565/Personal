/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cnk.travelogix.converters.populators.request;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentUserSelectedData;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;




public class PaymentRequestUserSelectedValueDataPopulator<SOURCE, TARGET> implements Populator<SOURCE, TARGET>
{
	private static final Logger LOG = Logger.getLogger(PaymentRequestUserSelectedValueDataPopulator.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final SOURCE source, final TARGET target) throws ConversionException
	{
		final Map<String, FormAttribute> unUpdatedMap = (Map<String, FormAttribute>) target;
		final PaymentUserSelectedData paymentUserSelectedData = (PaymentUserSelectedData) source;

		for (final Map.Entry<String, FormAttribute> formAttribute : unUpdatedMap.entrySet())
		{
			final FormAttribute currFormAttribute = formAttribute.getValue();

			if (StringUtils.isNotBlank(currFormAttribute.getMappedToUserSelectedValue()))
			{
				try
				{
					updateTheUserSelectedValue(currFormAttribute, paymentUserSelectedData);
				}
				catch (final ParseException e)
				{
					LOG.debug(e);
				}
			}
		}
	}

	/**
	 * @param currFormAttribute
	 * @param paymentUserSelectedData
	 * @throws ParseException
	 */
	private void updateTheUserSelectedValue(final FormAttribute currFormAttribute,
			final PaymentUserSelectedData paymentUserSelectedData) throws ParseException
	{
		switch (currFormAttribute.getMappedToUserSelectedValue())
		{
			case PaymentGatewayService.PAYMENT_SERVICE_REQUEST_USER_SELECTED_PAYMENTMODE:
				setPaymentMode(currFormAttribute, paymentUserSelectedData);
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_REQUEST_USER_SELECTED_ORDERID:
				setOrderId(currFormAttribute, paymentUserSelectedData);
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_REQUEST_USER_SELECTED_CURRENCY:
				setCurrency(currFormAttribute, paymentUserSelectedData);
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_REQUEST_USER_SELECTED_CARDTYPE:
				setCardType(currFormAttribute, paymentUserSelectedData);
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_REQUEST_USER_SELECTED_AMOUNT:
				setAmount(currFormAttribute, paymentUserSelectedData);
				break;
			default:
				break;
		}

	}

	private void updateFormAttributeFlags(final FormAttribute currFormAttribute)
	{
		currFormAttribute.setValueReady(true);
		currFormAttribute.setDefaultValueFlag(false);
		currFormAttribute.setDecoratorRequired(false);
	}

	private void setPaymentMode(final FormAttribute currFormAttribute, final PaymentUserSelectedData paymentUserSelectedData)
	{
		if (org.apache.commons.lang.StringUtils.isNotBlank(paymentUserSelectedData.getPaymentMode()))
		{
			currFormAttribute.setValue(paymentUserSelectedData.getPaymentMode());
			updateFormAttributeFlags(currFormAttribute);
		}
	}

	private void setOrderId(final FormAttribute currFormAttribute, final PaymentUserSelectedData paymentUserSelectedData)
	{
		if (org.apache.commons.lang.StringUtils.isNotBlank(paymentUserSelectedData.getOrderId()))
		{
			currFormAttribute.setValue(paymentUserSelectedData.getOrderId());
			updateFormAttributeFlags(currFormAttribute);
		}
	}

	private void setCurrency(final FormAttribute currFormAttribute, final PaymentUserSelectedData paymentUserSelectedData)
	{
		if (org.apache.commons.lang.StringUtils.isNotBlank(paymentUserSelectedData.getCurrency()))
		{
			currFormAttribute.setValue(paymentUserSelectedData.getCurrency());
			updateFormAttributeFlags(currFormAttribute);
		}
	}

	private void setCardType(final FormAttribute currFormAttribute, final PaymentUserSelectedData paymentUserSelectedData)
	{
		if (org.apache.commons.lang.StringUtils.isNotBlank(paymentUserSelectedData.getCardType()))
		{
			currFormAttribute.setValue(paymentUserSelectedData.getCardType());
			updateFormAttributeFlags(currFormAttribute);
		}
	}

	private void setAmount(final FormAttribute currFormAttribute, final PaymentUserSelectedData paymentUserSelectedData)
			throws ParseException
	{
		if (org.apache.commons.lang.StringUtils.isNotBlank(paymentUserSelectedData.getAmount()))
		{
			final Double amount = Double.valueOf(paymentUserSelectedData.getAmount());
			if (amount.intValue() > 0)
			{
				currFormAttribute.setValue(get2DecimalPlacesString(paymentUserSelectedData.getAmount()));
				updateFormAttributeFlags(currFormAttribute);
			}

		}
	}

	private String get2DecimalPlacesString(final String amountString)
	{
		if (org.apache.commons.lang.math.NumberUtils.isNumber(amountString))
		{
			final NumberFormat nf = NumberFormat.getInstance();
			nf.setMinimumFractionDigits(2);
			nf.setMaximumFractionDigits(2);
			nf.setGroupingUsed(false);
			return nf.format(Double.valueOf(amountString));
		}
		return amountString;
	}
}
