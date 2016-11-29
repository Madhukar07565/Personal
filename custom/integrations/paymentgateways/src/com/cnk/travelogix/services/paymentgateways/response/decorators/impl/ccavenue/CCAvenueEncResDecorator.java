/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.response.decorators.impl.ccavenue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import com.ccavenue.security.AesCryptUtil;
import com.cnk.travelogix.integrations.payment.response.beans.ResponseAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.response.decorators.PaymentGatewayResponseDataDecorator;


/**
 * @author C5243355
 *
 */
public class CCAvenueEncResDecorator extends PaymentGatewayResponseDataDecorator
{
	private Map<String, String> responseMap;

	@Value("#{configurationService.configuration.getProperty('paymentgateway.ccavenue.payment.hash.working.key')}")
	private String WORKING_KEY;

	private static final String CCAVENUE_ENC_RESP = "encResp";
	private static final String CCAVENUE_RESPONSE_CODE = "response_code";
	private static final String CCAVENUE_ORDER_STATUS = "order_status";
	private static final String CCAVENUE_STATUS_MESSAGE = "status_message";


	@Override
	public ResponseAttribute processResponseAttibuteValue(final ResponseAttribute responseAttribute,
			final Map<String, ResponseAttribute> valueMap) throws Exception
	{
		final String responseChecksum = valueMap.get(CCAVENUE_ENC_RESP).getDefaultValue().trim();

		final List<String> validteFieldsList = Arrays.asList(responseAttribute.getRequiredValidationAttributes().split(","));

		final AesCryptUtil aesUtil = new AesCryptUtil(WORKING_KEY);
		final String encResponse = aesUtil.decrypt(responseChecksum);

		this.responseMap = getKeyValueMap(encResponse);

		setValuesFromresponseMap(validteFieldsList, valueMap);

		return responseAttribute;
	}

	private void setValuesFromresponseMap(final List<String> validteFieldsList, final Map<String, ResponseAttribute> valueMap)
	{
		for (final String curKey : validteFieldsList)
		{
			if (isTransactionSuccessField(valueMap.get(curKey)))
			{
				updateResponseAttrubute(valueMap.get(curKey), this.responseMap.get(curKey));
			}

		}
	}

	private boolean isTransactionSuccessField(final ResponseAttribute responseAttribute)
	{
		if (PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_IS_SUCCESS_FLAG.equalsIgnoreCase(responseAttribute.getMappedTo()))
		{
			final String response_code = this.responseMap.get(CCAVENUE_RESPONSE_CODE);
			final String order_status = this.responseMap.get(CCAVENUE_ORDER_STATUS);
			final String status_message = this.responseMap.get(CCAVENUE_STATUS_MESSAGE);
			if ("0".equalsIgnoreCase(response_code) && "success".equalsIgnoreCase(order_status)
					&& "Y".equalsIgnoreCase(status_message))
			{
				updateResponseAttrubute(responseAttribute, Boolean.TRUE.booleanValue());
			}
			else
			{
				updateResponseAttrubute(responseAttribute, Boolean.FALSE.booleanValue());
			}
			return Boolean.FALSE.booleanValue();
		}
		return Boolean.TRUE.booleanValue();
	}

	private Map<String, String> getKeyValueMap(final String responseString)
	{

		final List<String> responseList = Arrays.asList(responseString.split(PaymentGatewayService.STRING_APPERSENT_SYMBOL));

		final Map<String, String> localResponseMap = new HashMap<>();

		for (final String responseFeild : responseList)
		{
			if (responseFeild.contains(PaymentGatewayService.STRING_EQUAL_SYMBOL))
			{
				final List<String> responseFeildListTemp = Arrays
						.asList(responseFeild.split(PaymentGatewayService.STRING_EQUAL_SYMBOL));
				if (!responseFeildListTemp.isEmpty())
				{
					localResponseMap.put(responseFeildListTemp.get(0), responseFeildListTemp.get(responseFeildListTemp.size() - 1));
				}
			}
		}
		return localResponseMap.isEmpty() ? Collections.emptyMap() : localResponseMap;
	}
}
