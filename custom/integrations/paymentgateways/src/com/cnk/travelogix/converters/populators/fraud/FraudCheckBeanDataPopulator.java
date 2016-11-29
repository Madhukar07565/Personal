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
package com.cnk.travelogix.converters.populators.fraud;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.order.CartFacade;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.fraud.client.FraudCheckRestClient;
import com.cnk.travelogix.integrations.payment.fraud.beans.FraudCheckData;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentUserSelectedData;


public class FraudCheckBeanDataPopulator<SOURCE, TARGET> implements Populator<SOURCE, TARGET>
{
	@Autowired
	private ConfigurationService configurationService;

	@Resource(name = "cartFacade")
	private CartFacade cartFacade;

	@Resource(name = "customerFacade")
	private CustomerFacade customerFacade;

	final String TEST_USER_MD5 = "CFD79B816D8D6CE51904145403545D1C";
	final String TEST_PASSWORD_MD5 = "AB26E07B2EC2501BFA0FFCECFCE8CFB0";
	final String TEST_AMOUNT = "12.00";
	final String TEST_REFERENCE_NO = "test124_";
	final String TEST_CUSTOMER_EMAIL = "test@live.com";
	final String TEST_CUSTOMER_PHONE = "0000000012332199";
	final String TEST_COUNTRY = "IN";
	final String TEST_CARD_NUMBER = "465858******9018";



	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final SOURCE source, final TARGET target) throws ConversionException
	{
		final CartData cartData = cartFacade.getSessionCart();

		final PaymentUserSelectedData paymentUserSelectedData = (PaymentUserSelectedData) source;

		final FraudCheckData fraudCheckData = (FraudCheckData) target;

		if (StringUtils.isNotEmpty(cartData.getCode()))
		{
			fillFraudCheckData(fraudCheckData, cartData, paymentUserSelectedData);
		}
		else
		{
			fillTESTFraudCheckData(fraudCheckData, cartData, paymentUserSelectedData);
		}

	}

	private String getCurrentDateInThisFormat(final String dateFormat)
	{

		final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		return simpleDateFormat.format(new Date());


	}

	private void fillTESTFraudCheckData(final FraudCheckData fraudCheckData, final CartData cartData,
			final PaymentUserSelectedData paymentUserSelectedData)
	{
		fraudCheckData
				.setMerchantID(configurationService.getConfiguration().getString(FraudCheckRestClient.RMS_CREDENTIALS_MERCHANTID));
		fraudCheckData.setKey(configurationService.getConfiguration().getString(FraudCheckRestClient.RMS_CREDENTIALS_KEY));
		fraudCheckData.setTemplateID(
				configurationService.getConfiguration().getString(FraudCheckRestClient.RMS_CREDENTIALS_ECOM_TEMPLATEID));
		fraudCheckData.setCardNumber(TEST_CARD_NUMBER);
		fraudCheckData.setUserMD5(TEST_USER_MD5);
		fraudCheckData.setPassMD5(TEST_PASSWORD_MD5);
		fraudCheckData.setSite(configurationService.getConfiguration().getString(FraudCheckRestClient.RMS_CREDENTIALS_SITE));

		setAmount(fraudCheckData, cartData, paymentUserSelectedData);

		fraudCheckData.setReferenceNo(paymentUserSelectedData.getOrderId());
		fraudCheckData.setCustEmail(TEST_CUSTOMER_EMAIL);
		fraudCheckData.setCustPhone(TEST_CUSTOMER_PHONE);
		fraudCheckData.setCountry(TEST_COUNTRY);
		fraudCheckData.setDateTime(getCurrentDateInThisFormat(FraudCheckRestClient.RMS_DATE_FORMAT));
	}


	private void fillFraudCheckData(final FraudCheckData fraudCheckData, final CartData cartData,
			final PaymentUserSelectedData paymentUserSelectedData)
	{

		fraudCheckData
				.setMerchantID(configurationService.getConfiguration().getString(FraudCheckRestClient.RMS_CREDENTIALS_MERCHANTID));
		fraudCheckData.setKey(configurationService.getConfiguration().getString(FraudCheckRestClient.RMS_CREDENTIALS_KEY));
		fraudCheckData.setTemplateID(
				configurationService.getConfiguration().getString(FraudCheckRestClient.RMS_CREDENTIALS_ECOM_TEMPLATEID));
		fraudCheckData.setCardNumber(TEST_CARD_NUMBER);
		fraudCheckData.setUserMD5(TEST_USER_MD5);
		fraudCheckData.setPassMD5(TEST_PASSWORD_MD5);
		fraudCheckData.setSite(configurationService.getConfiguration().getString(FraudCheckRestClient.RMS_CREDENTIALS_SITE));

		setAmount(fraudCheckData, cartData, paymentUserSelectedData);

		fraudCheckData.setReferenceNo(paymentUserSelectedData.getOrderId());

		final CustomerData customerData = customerFacade.getCurrentCustomer();

		fraudCheckData.setCustEmail(TEST_CUSTOMER_EMAIL.equalsIgnoreCase(customerData.getDisplayUid())
				? customerData.getDisplayUid() : TEST_CUSTOMER_EMAIL);

		fraudCheckData.setCustPhone(
				StringUtils.isNotBlank(customerData.getContactNumber()) ? customerData.getContactNumber() : TEST_CUSTOMER_PHONE);

		fraudCheckData.setCountry(
				StringUtils.isNotBlank(customerData.getDefaultCountryCode()) ? customerData.getDefaultCountryCode() : TEST_COUNTRY);

		fraudCheckData.setDateTime(getCurrentDateInThisFormat(FraudCheckRestClient.RMS_DATE_FORMAT));

	}

	private void setAmount(final FraudCheckData fraudCheckData, final CartData cartData,
			final PaymentUserSelectedData paymentUserSelectedData)
	{
		if (StringUtils.isNotBlank(paymentUserSelectedData.getAmount())
				&& Double.valueOf(paymentUserSelectedData.getAmount()).doubleValue() > 0)
		{
			fraudCheckData.setAmount(String.valueOf(paymentUserSelectedData.getAmount()));
		}
		else
		{
			fraudCheckData.setAmount(String.valueOf(cartData.getTotalPriceWithTax().getValue() != null
					? cartData.getTotalPriceWithTax().getValue().toString() : TEST_AMOUNT));

		}
	}


}
