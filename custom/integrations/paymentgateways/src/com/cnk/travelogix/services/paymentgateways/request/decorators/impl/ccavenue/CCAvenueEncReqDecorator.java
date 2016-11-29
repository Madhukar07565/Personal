package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.ccavenue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import com.ccavenue.security.AesCryptUtil;
import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


public class CCAvenueEncReqDecorator extends PaymentGatewayRequestFormDecorator
{
	@Value("#{configurationService.configuration.getProperty('paymentgateway.ccavenue.payment.hash.working.key')}")
	private String WORKING_KEY;

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public CCAvenueEncReqDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public CCAvenueEncReqDecorator()
	{
		super();
	}

	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
	{

		final StringBuilder encReqValue = new StringBuilder();

		final String[] parmaToSkip = formAttribute.getDefaultValue().split(PaymentGatewayService.FIELD_SEPERATOR_COMMA);
		final List<String> attributeList = new ArrayList<>();
		for (final String attribute : parmaToSkip)
		{
			attributeList.add(attribute);
		}
		for (final Map.Entry<String, FormAttribute> entry : valueMap.entrySet())
		{
			if (!attributeList.contains(entry.getKey()))
			{
				encReqValue.append(entry.getKey());
				encReqValue.append(PaymentGatewayService.STRING_EQUAL_SYMBOL);
				encReqValue.append(entry.getValue().getValue());
				encReqValue.append(PaymentGatewayService.STRING_APPERSENT_SYMBOL);
			}
		}
		encReqValue.deleteCharAt(encReqValue.length() - 1);
		final AesCryptUtil aesUtil = new AesCryptUtil(WORKING_KEY);
		final String encRequest = aesUtil.encrypt(encReqValue.toString());


		if (!StringUtils.isEmpty(encRequest))
		{
			updateFormAttributeFlags(formAttribute, encRequest);
		}

		return formAttribute;
	}

}
