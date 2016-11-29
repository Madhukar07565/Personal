/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.services.paymentgateways.response;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;
import com.cnk.travelogix.integrations.payment.response.beans.ResponseAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.response.decorators.PaymentGatewayResponseData;


/**
 *
 */
public class PaymentResponseDataGeneratorService
{
	private static final Logger LOG = Logger.getLogger(PaymentResponseDataGeneratorService.class);

	private Converter<Map<String, ResponseAttribute>, PaymentServiceResponseData> paymentTransactionDataConverter;


	/**
	 * @return the paymentTransactionDataConverter
	 */
	public Converter<Map<String, ResponseAttribute>, PaymentServiceResponseData> getPaymentTransactionDataConverter()
	{
		return paymentTransactionDataConverter;
	}

	/**
	 * @param paymentTransactionDataConverter
	 *           the paymentTransactionDataConverter to set
	 */
	public void setPaymentTransactionDataConverter(
			final Converter<Map<String, ResponseAttribute>, PaymentServiceResponseData> paymentTransactionDataConverter)
	{
		this.paymentTransactionDataConverter = paymentTransactionDataConverter;
	}



	final static String RESPONSE_ATTRIBUTES = "response-attributes";
	final static String RESPONSE_ATTRIBUTE = "response-attribute";
	final static String RESPONSE_ATTRIBUTE_NAME = "name";
	final static String RESPONSE_ATTRIBUTE_MAPPED_TO = "mapped-to";
	final static String RESPONSE_ATTRIBUTE_VALIDATION_REQUIRED_ATTRIBUTES = "validation-required-attributes";
	final static String RESPONSE_ATTRIBUTE_READ_FROM_BEAN = "read-from-bean";


	private Map<String, String> responseParameters;

	@Autowired
	private ApplicationContext appContext;

	/**
	 * @return the responseParameters
	 */
	public Map<String, String> getResponseParameters()
	{
		return responseParameters;
	}

	/**
	 * @param responseParameters
	 *           the responseParameters to set
	 */
	public void setResponseParameters(final Map<String, String> responseParameters)
	{
		this.responseParameters = responseParameters;
	}

	/**
	 * @param document
	 * @param paymentProviderID
	 * @param responseParams
	 * @return
	 */
	public PaymentServiceResponseData getPaymentTransactionData(final Document document, final String paymentProviderID,
			final Map<String, String> response)
	{
		setResponseParameters(response);

		final Element element = document.getElementById(paymentProviderID);

		final Map<String, ResponseAttribute> responseMap = getKeysAndDefaultValues(element);

		processDecorators(responseMap);

		return getPaymentTransactionData(responseMap);

	}

	/**
	 * @param responseMap
	 * @return
	 */
	private PaymentServiceResponseData getPaymentTransactionData(final Map<String, ResponseAttribute> responseMap)
	{

		return getPaymentTransactionDataConverter().convert(responseMap, new PaymentServiceResponseData());

	}

	/**
	 * @param currResponseAttribute
	 * @param paymentTransactionData
	 */


	private Map<String, ResponseAttribute> getKeysAndDefaultValues(final Element element)
	{

		final Map responseMap = new LinkedHashMap<String, ResponseAttribute>();

		final Elements elements = element.getElementsByTag(RESPONSE_ATTRIBUTES);

		fetchKeyValuesFromElements(elements, responseMap);

		return responseMap;

	}

	private Map fetchKeyValuesFromElements(final Elements elements, final Map<String, ResponseAttribute> valuesMap)
	{
		for (final Element childlement : elements)
		{

			final Elements responseElements = childlement.getElementsByTag(RESPONSE_ATTRIBUTE);

			for (final Element element : responseElements)
			{
				final ResponseAttribute responseAttribute = new ResponseAttribute();

				setDefaultValue(element, responseAttribute);

				setResponseAttributeMappedTo(element, responseAttribute);

				setResponseAttributeValidationRequired(element, responseAttribute);

				setResponseAttributeReadFromBean(element, responseAttribute);

				setResponseAttributeName(element, responseAttribute);

				setResponseAttributeInValueMap(element, responseAttribute, valuesMap);

			}
		}
		return valuesMap;

	}

	private void setResponseAttributeInValueMap(final Element element, final ResponseAttribute responseAttribute,
			final Map<String, ResponseAttribute> valuesMap)
	{
		final String key = element.getElementsByTag(RESPONSE_ATTRIBUTE_NAME).hasText()
				? element.getElementsByTag(RESPONSE_ATTRIBUTE_NAME).get(0).text()
				: PaymentGatewayService.PAYMENT_GATEWAY_EMPTY_STRING;

		if (StringUtils.isNotBlank(key))
		{
			valuesMap.put(key, responseAttribute);
		}
	}

	private void setResponseAttributeName(final Element element, final ResponseAttribute responseAttribute)
	{

		if (element.getElementsByTag(RESPONSE_ATTRIBUTE_NAME).hasText())
		{
			responseAttribute.setResponseAttributeName(element.getElementsByTag(RESPONSE_ATTRIBUTE_NAME).get(0).text());

		}

	}

	private void setResponseAttributeMappedTo(final Element element, final ResponseAttribute responseAttribute)
	{
		if (element.getElementsByTag(RESPONSE_ATTRIBUTE_MAPPED_TO).hasText())
		{
			responseAttribute.setMappedTo(element.getElementsByTag(RESPONSE_ATTRIBUTE_MAPPED_TO).get(0).text());
			responseAttribute.setRequiredMapping(Boolean.TRUE.booleanValue());

		}
	}

	private void setResponseAttributeValidationRequired(final Element element, final ResponseAttribute responseAttribute)
	{

		if (element.getElementsByTag(RESPONSE_ATTRIBUTE_VALIDATION_REQUIRED_ATTRIBUTES).hasText())
		{
			final String value = element.getElementsByTag(RESPONSE_ATTRIBUTE_VALIDATION_REQUIRED_ATTRIBUTES).get(0).text();

			responseAttribute.setRequiredValidationAttributes(value);

		}
	}

	private void setResponseAttributeReadFromBean(final Element element, final ResponseAttribute responseAttribute)
	{
		if (element.getElementsByTag(RESPONSE_ATTRIBUTE_READ_FROM_BEAN).hasText())
		{

			responseAttribute.setDecoratorName(element.getElementsByTag(RESPONSE_ATTRIBUTE_READ_FROM_BEAN).get(0).text());
			responseAttribute.setDecoratorRequired(Boolean.TRUE.booleanValue());

		}
		else
		{
			if (responseAttribute.isDefaultValueFlag()
					&& org.apache.commons.lang.StringUtils.isNotBlank(responseAttribute.getDefaultValue()))
			{
				responseAttribute.setValue(responseAttribute.getDefaultValue());
				responseAttribute.setValueReady(Boolean.TRUE.booleanValue());
				responseAttribute.setDefaultValueFlag(Boolean.FALSE.booleanValue());
			}
		}
	}

	private void setDefaultValue(final Element element, final ResponseAttribute responseAttribute)

	{
		if (element.getElementsByTag(RESPONSE_ATTRIBUTE_NAME).hasText())
		{
			final String key = element.getElementsByTag(RESPONSE_ATTRIBUTE_NAME).get(0).text();
			responseAttribute.setDefaultValue(getResponseParameters().get(key));
			responseAttribute.setDefaultValueFlag(Boolean.TRUE.booleanValue());
		}
	}

	private void processDecorators(final Map<String, ResponseAttribute> valueMap)
	{

		for (final Object key : valueMap.keySet())
		{
			final ResponseAttribute responseAttribute = valueMap.get(key.toString());
			if (responseAttribute.isValueReady())
			{
				valueMap.put(key.toString(), responseAttribute);
			}
			else if (responseAttribute.isDecoratorRequired())
			{

				final PaymentGatewayResponseData decorator = getDecoratorWithId(responseAttribute.getDecoratorName());
				try
				{
					decorator.processResponseAttibuteValue(responseAttribute, valueMap);
				}
				catch (final Exception e)
				{
					LOG.debug(e);

				}
			}
		}
	}

	private PaymentGatewayResponseData getDecoratorWithId(final String decoratorID)
	{

		final Object bean = appContext.getBean(decoratorID);

		if (bean instanceof PaymentGatewayResponseData)
		{
			return (PaymentGatewayResponseData) bean;
		}

		return null;
	}
}
