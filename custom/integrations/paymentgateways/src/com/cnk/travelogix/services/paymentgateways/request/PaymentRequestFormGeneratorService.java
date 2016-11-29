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
package com.cnk.travelogix.services.paymentgateways.request;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentUserSelectedData;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;



/**
 *
 */
public class PaymentRequestFormGeneratorService
{
	private static final Logger LOG = Logger.getLogger(PaymentRequestFormGeneratorService.class);
	final static String FORM_OPEN = "<form";
	final static String FORM_START_END = ">";
	final static String FORM_CLOSE = "</form>";
	final static String FORM_INPUT_OPEN = "<input type='hidden'";
	final static String FORM_INPUT_CLOSE = "/>";
	final static String FORM_INPUT_ID = "id=";
	final static String FORM_INPUT_NAME = "name=";
	final static String FORM_INPUT_VALUE = "value=";
	final static String FORM_SPACE = " ";
	final static String EQUAL_SYMBOL = "=";
	final static String COMMA_SYMBOL = "'";
	final static String EMPTY_STRING = "";


	final static String HEADER_ATTRIBUTE_TAG = "header-attribute";
	final static String BODY_ATTRIBUTE_TAG = "body-attribute";
	final static String SCRIPT_TAG = "script-tag";
	final static String NAME_TAG = "name";
	final static String Value_TAG = "value";
	final static String DEFAULT_VALUE_TAG = "default-value";
	final static String READ_FROM_LOCAL_PROPERTIES = "read-from-local-properties";
	final static String ADD_TO_HTML_FORM = "add-to-submitform";
	final static String READ_FROM_BEAN = "read-from-bean";
	final static String ATTRIBUTE_PROPERTY = "property";
	final static String USER_SELECTED_VALUE_MAPPED_TO = "mapped-to-user-selected-value";

	final static String HEADER = "header";
	final static String BODY = "body";
	final static String SCRIPT = "script";

	final static String SCRIPT_DEFAULT_VALUE = "defaultSubmitScript";


	final static String DEFAULT_SCRIPT_TAG_START = "<script language='javascript'>document.";
	final static String DEFAULT_SCRIPT_TAG_END = ".submit();</script>";

	final static String DYNAMIC_SCRIPT_TAG_START = "<script language='javascript'>";
	final static String DYNAMIC_SCRIPT_TAG_END = "</script>";


	private Converter<PaymentUserSelectedData, Map<String, FormAttribute>> userSelectedValueUpdatedMapConverter;

	/**
	 * @return the userSelectedValueUpdatedMapConverter
	 */


	@Autowired
	private ApplicationContext appContext;




	/**
	 * @return the userSelectedValueUpdatedMapConverter
	 */
	public Converter<PaymentUserSelectedData, Map<String, FormAttribute>> getUserSelectedValueUpdatedMapConverter()
	{
		return userSelectedValueUpdatedMapConverter;
	}

	/**
	 * @param userSelectedValueUpdatedMapConverter
	 *           the userSelectedValueUpdatedMapConverter to set
	 */
	public void setUserSelectedValueUpdatedMapConverter(
			final Converter<PaymentUserSelectedData, Map<String, FormAttribute>> userSelectedValueUpdatedMapConverter)
	{
		this.userSelectedValueUpdatedMapConverter = userSelectedValueUpdatedMapConverter;
	}

	public Map<String, Map<String, FormAttribute>> getSubmitFormForPaymentProviderUnprocessedMap(
			final org.jsoup.nodes.Document document, final String id) throws IOException
	{
		final Element element = document.getElementById(id);

		final Map<String, Map<String, FormAttribute>> unProcessedMap = getKeysAndDefaultValues(element);

		return unProcessedMap;
	}

	public Map<String, Map<String, FormAttribute>> updateUserSelectionValuesIntoMap(
			final Map<String, Map<String, FormAttribute>> unProccessedMap, final PaymentUserSelectedData paymentUserSelectedData)
	{

		return getUserSelectedValuesUpdateMap(unProccessedMap, paymentUserSelectedData);
	}

	private Map<String, Map<String, FormAttribute>> getUserSelectedValuesUpdateMap(
			final Map<String, Map<String, FormAttribute>> unProccessedMap, final PaymentUserSelectedData paymentUserSelectedData)
	{

		final Map<String, FormAttribute> userValuesUpdatedBodyMap = getUserSelectedValueUpdatedMapConverter()
				.convert(paymentUserSelectedData, unProccessedMap.get(BODY));

		unProccessedMap.put(BODY, userValuesUpdatedBodyMap);
		return unProccessedMap;
	}

	public String getSubmitFormForPaymentProviderForm(final Map<String, Map<String, FormAttribute>> unProccessedMap)
	{
		final Map<String, Map<String, FormAttribute>> finalMap = processTheFormAttributes(unProccessedMap);
		return renderTheForm(finalMap);
	}


	private Map<String, Map<String, FormAttribute>> getKeysAndDefaultValues(final Element element)
	{

		final Map headerMap = getKeyAndDefaultValues(element, HEADER_ATTRIBUTE_TAG);

		final Map bodyMap = getKeyAndDefaultValues(element, BODY_ATTRIBUTE_TAG);

		final Map scriptMap = getKeyAndDefaultValues(element, SCRIPT_TAG);

		final Map preProcessedMap = new LinkedHashMap<String, Map<String, FormAttribute>>();

		preProcessedMap.put(HEADER, headerMap);

		preProcessedMap.put(BODY, bodyMap);

		preProcessedMap.put(SCRIPT, scriptMap);

		return preProcessedMap;

	}

	/**
	 *
	 */
	private Map<String, Map<String, FormAttribute>> processTheFormAttributes(
			final Map<String, Map<String, FormAttribute>> preProcessedMap)
	{
		final Map finalMap = new LinkedHashMap<String, Map<String, FormAttribute>>();
		final Map<String, FormAttribute> bodyMap = preProcessedMap.get(BODY);
		final Map<String, FormAttribute> headerMap = preProcessedMap.get(HEADER);
		final Map<String, FormAttribute> scriptMap = preProcessedMap.get(SCRIPT);

		processDecorators(headerMap);
		processDecorators(bodyMap);
		processDecorators(scriptMap);

		finalMap.put(HEADER, headerMap);
		finalMap.put(BODY, bodyMap);
		finalMap.put(SCRIPT, scriptMap);

		return finalMap;
	}


	private void processDecorators(final Map<String, FormAttribute> valueMap)
	{

		for (final Object key : valueMap.keySet())
		{
			final FormAttribute formAttribute = valueMap.get(key.toString());
			if (formAttribute.isValueReady())
			{
				valueMap.put(key.toString(), formAttribute);
			}
			else if (formAttribute.isDecoratorRequired())
			{

				final PaymentGatewayRequestForm decorator = getDecoratorWithId(formAttribute.getDecoratorName());
				try
				{
					decorator.processRequestAttibuteValue(formAttribute, valueMap);
				}
				catch (final Exception e)
				{
					LOG.error(e);

				}
				if (formAttribute.isValueReady())
				{
					valueMap.put(key.toString(), formAttribute);
				}
			}
		}
	}

	private PaymentGatewayRequestForm getDecoratorWithId(final String decoratorID)
	{

		final Object bean = appContext.getBean(decoratorID);

		if (bean instanceof PaymentGatewayRequestForm)
		{
			return (PaymentGatewayRequestForm) bean;
		}

		return null;
	}


	private String renderTheForm(final Map finalMap)
	{
		// TODO Auto-generated method stub
		final StringBuilder htmlForm = new StringBuilder();

		renderHeaderOfTheForm((Map) finalMap.get(HEADER), htmlForm);
		renderBodyOfTheForm((Map) finalMap.get(BODY), htmlForm);
		renderScriptOfTheForm((Map) finalMap.get(SCRIPT), (Map) finalMap.get(HEADER), htmlForm);
		renderEndOfTheForm(htmlForm);

		return htmlForm.toString();
	}

	/**
	 * @param object
	 * @param map
	 * @param htmlForm
	 */
	private void renderScriptOfTheForm(final Map<String, FormAttribute> scriptMap, final Map<String, FormAttribute> headerMap,
			final StringBuilder htmlForm)
	{
		FormAttribute formAttribute = null;
		for (final Map.Entry entry : scriptMap.entrySet())
		{
			formAttribute = scriptMap.get(entry.getKey());
		}
		final String value = (formAttribute != null && formAttribute.isValueReady()) ? formAttribute.getValue() : EMPTY_STRING;

		if (StringUtils.isEmpty(value) || value.equals(SCRIPT_DEFAULT_VALUE))
		{
			appendDefaultScriptTag(htmlForm, headerMap);
		}
		else
		{

			appendNamedScriptTag(htmlForm, scriptMap);
		}
	}


	private void renderEndOfTheForm(final StringBuilder htmlForm)
	{
		htmlForm.append(FORM_CLOSE);
	}

	private void appendDefaultScriptTag(final StringBuilder htmlForm, final Map scriptMap)
	{
		final FormAttribute formNameAttribute = (FormAttribute) scriptMap.get(NAME_TAG);
		final String formName = formNameAttribute.getValue();


		htmlForm.append(DEFAULT_SCRIPT_TAG_START);
		htmlForm.append(formName);
		htmlForm.append(DEFAULT_SCRIPT_TAG_END);

	}

	private void appendNamedScriptTag(final StringBuilder htmlForm, final Map<String, FormAttribute> scriptMap)
	{
		FormAttribute scriptNameAttribute = null;
		for (final Map.Entry<String, FormAttribute> entry : scriptMap.entrySet())
		{
			scriptNameAttribute = scriptMap.get(entry.getKey());

		}
		if (scriptNameAttribute != null)
		{
			final String scriptName = scriptNameAttribute.getValue();
			htmlForm.append(DYNAMIC_SCRIPT_TAG_START);
			htmlForm.append(SCRIPT + EQUAL_SYMBOL + scriptName);
			htmlForm.append(DYNAMIC_SCRIPT_TAG_END);
		}

	}


	private void renderBodyOfTheForm(final Map<String, FormAttribute> bodyMap, final StringBuilder htmlForm)

	{

		for (final Map.Entry<String, FormAttribute> entry : bodyMap.entrySet())
		{
			final String id = entry.getKey();
			final FormAttribute formAttribute = bodyMap.get(entry.getKey());
			final String value = formAttribute.isValueReady() ? formAttribute.getValue() : EMPTY_STRING;

			if (formAttribute.isRequiredToADDToHTMLForm())
			{
				htmlForm.append(FORM_INPUT_OPEN);
				htmlForm.append(FORM_SPACE);

				htmlForm.append(FORM_INPUT_ID);
				htmlForm.append(COMMA_SYMBOL + id + COMMA_SYMBOL);

				htmlForm.append(FORM_SPACE);

				htmlForm.append(FORM_INPUT_NAME);
				htmlForm.append(COMMA_SYMBOL + id + COMMA_SYMBOL);

				htmlForm.append(FORM_SPACE);

				htmlForm.append(FORM_INPUT_VALUE);
				htmlForm.append(COMMA_SYMBOL + value + COMMA_SYMBOL);

				htmlForm.append(FORM_INPUT_CLOSE);
			}
		}


	}


	private void renderHeaderOfTheForm(final Map<String, FormAttribute> headerMap, final StringBuilder htmlForm)
	{


		htmlForm.append(FORM_OPEN);

		for (final Map.Entry<String, FormAttribute> entry : headerMap.entrySet())
		{
			final String id = entry.getKey();
			final FormAttribute formAttribute = headerMap.get(entry.getKey());
			final String value = formAttribute.isValueReady() ? formAttribute.getValue() : EMPTY_STRING;

			htmlForm.append(FORM_SPACE);
			htmlForm.append(id + EQUAL_SYMBOL + COMMA_SYMBOL + value + COMMA_SYMBOL);
		}

		htmlForm.append(FORM_START_END);

	}


	private Map getKeyAndDefaultValues(final Element element, final String tagKey)
	{

		final Map map = new LinkedHashMap<String, String>();

		final Elements bodyElements = element.getElementsByTag(tagKey);

		fetchKeyValuesFromElements(bodyElements, map);

		return map;
	}


	private void fetchKeyValuesFromElements(final Elements elements, final Map valuesMap)
	{

		for (final Element childlement : elements)
		{

			final Elements propertyElements = childlement.getElementsByTag(ATTRIBUTE_PROPERTY);

			for (final Element property : propertyElements)
			{

				final String key = property.getElementsByTag(NAME_TAG).get(0).text();

				final FormAttribute value = getValueFromElements(property.getElementsByTag(Value_TAG));

				valuesMap.put(key, value);
			}


		}

	}


	private FormAttribute getValueFromElements(final Elements elements)
	{
		FormAttribute formAttribute = null;



		for (final Element childlement : elements)
		{
			formAttribute = new FormAttribute();

			formAttribute = getAddToFormValue(childlement, formAttribute);

			formAttribute = getDefaultValue(childlement, formAttribute);

			formAttribute = getBeanValue(childlement, formAttribute);
			formAttribute = getUserSelectedMapping(childlement, formAttribute);
		}
		return formAttribute;
	}


	/**
	 * @param childlement
	 * @param formAttribute
	 * @return
	 */
	private FormAttribute getUserSelectedMapping(final Element childlement, final FormAttribute formAttribute)
	{
		if (childlement.getElementsByTag(USER_SELECTED_VALUE_MAPPED_TO).hasText())
		{
			formAttribute.setMappedToUserSelectedValue(childlement.getElementsByTag(USER_SELECTED_VALUE_MAPPED_TO).text());

		}
		return formAttribute;
	}

	private FormAttribute getAddToFormValue(final Element childlement, final FormAttribute formAttribute)
	{
		if (childlement.getElementsByTag(ADD_TO_HTML_FORM).hasText())
		{
			final String defaultValue = childlement.getElementsByTag(ADD_TO_HTML_FORM).text().trim();

			if (Boolean.FALSE.equals(Boolean.valueOf(defaultValue)) || Boolean.TRUE.equals(Boolean.valueOf(defaultValue)))
			{
				formAttribute.setRequiredToADDToHTMLForm(Boolean.parseBoolean(defaultValue));
				formAttribute.setAddToSubmitForm(defaultValue);
			}

		}
		else
		{
			if (StringUtils.isEmpty(formAttribute.getAddToSubmitForm()))
			{
				formAttribute.setRequiredToADDToHTMLForm(Boolean.TRUE.booleanValue());
				formAttribute.setAddToSubmitForm(Boolean.TRUE.toString());
			}
		}
		return formAttribute;
	}

	private FormAttribute getDefaultValue(final Element childlement, final FormAttribute formAttribute)

	{

		if (childlement.getElementsByTag(DEFAULT_VALUE_TAG).hasText())
		{
			formAttribute.setDefaultValue(childlement.getElementsByTag(DEFAULT_VALUE_TAG).text());

		}
		return formAttribute;
	}

	private FormAttribute getBeanValue(final Element childlement, final FormAttribute formAttribute)

	{
		if (childlement.getElementsByTag(READ_FROM_BEAN).hasText())
		{
			formAttribute.setDecoratorName(childlement.getElementsByTag(READ_FROM_BEAN).text());
			formAttribute.setDecoratorRequired(true);

		}
		else if (childlement.getElementsByTag(DEFAULT_VALUE_TAG).hasText()
				&& !childlement.getElementsByTag(READ_FROM_BEAN).hasText())
		{
			formAttribute.setDecoratorRequired(false);
			formAttribute.setDefaultValueFlag(true);
			if (formAttribute.isDefaultValueFlag() && !formAttribute.isDecoratorRequired())
			{
				formAttribute.setValue(formAttribute.getDefaultValue());
			}

			formAttribute.setValueReady(true);
		}
		return formAttribute;
	}



}
