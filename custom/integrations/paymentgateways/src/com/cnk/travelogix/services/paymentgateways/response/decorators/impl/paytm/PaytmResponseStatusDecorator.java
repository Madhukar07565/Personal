/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.response.decorators.impl.paytm;

import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import com.cnk.travelogix.integrations.payment.response.beans.ResponseAttribute;
import com.cnk.travelogix.services.paymentgateways.response.decorators.PaymentGatewayResponseDataDecorator;
import com.paytm.merchant.CheckSumServiceHelper;


/**
 * @author C5243355
 *
 */
public class PaytmResponseStatusDecorator extends PaymentGatewayResponseDataDecorator
{
	@Value("#{configurationService.configuration.getProperty('paymentgateway.paytm.hash.checksum.key')}")
	private String CHECKSUMKEY;
	final private String TRANSACTION_SUCCESS_CODE = "01";


	@Override
	public ResponseAttribute processResponseAttibuteValue(final ResponseAttribute responseAttribute,
			final Map<String, ResponseAttribute> valueMap) throws Exception
	{
		final String responseChecksum = valueMap.get("CHECKSUMHASH").getValue();

		final String checkSumVerifyFields = responseAttribute.getRequiredValidationAttributes();
		final String responseCode = valueMap.get("RESPCODE").getValue();

		if (verifyResponseChecksum(CHECKSUMKEY, getTheResponseParams(checkSumVerifyFields, valueMap), responseChecksum.trim())
				&& (TRANSACTION_SUCCESS_CODE.equalsIgnoreCase(responseCode)))
		{
			updateResponseAttrubute(responseAttribute, Boolean.TRUE.booleanValue());

		}
		else
		{

			updateResponseAttrubute(responseAttribute, Boolean.FALSE.booleanValue());
		}

		return responseAttribute;
	}


	private TreeMap<String, String> getTheResponseParams(final String response, final Map<String, ResponseAttribute> valueMap)
	{
		if (StringUtils.isNotEmpty(response))
		{
			final TreeMap<String, String> paramTreeMap = new TreeMap<>();
			for (final String key : response.split(","))
			{
				final String value = valueMap.get(key).getDefaultValue();
				paramTreeMap.put(key, value);
			}

			return paramTreeMap;

		}
		return null;
	}


	private boolean verifyResponseChecksum(final String key, final TreeMap<String, String> paramMap, final String responseChecksum)
			throws Exception
	{
		final CheckSumServiceHelper checksumHelper = CheckSumServiceHelper.getCheckSumServiceHelper();
		return checksumHelper.verifycheckSum(key, paramMap, responseChecksum);

	}

}
