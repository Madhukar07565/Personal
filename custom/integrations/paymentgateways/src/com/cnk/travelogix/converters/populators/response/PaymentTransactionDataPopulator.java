package com.cnk.travelogix.converters.populators.response;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;
import com.cnk.travelogix.integrations.payment.response.beans.ResponseAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;




public class PaymentTransactionDataPopulator<SOURCE, TARGET> implements Populator<SOURCE, TARGET>
{
	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final SOURCE source, final TARGET target) throws ConversionException
	{
		final Map<String, ResponseAttribute> responseMap = (Map<String, ResponseAttribute>) source;
		for (final Map.Entry<String, ResponseAttribute> responseAttribute : responseMap.entrySet())
		{
			final ResponseAttribute currResponseAttribute = responseAttribute.getValue();

			if (StringUtils.isNotBlank(currResponseAttribute.getMappedTo()) && currResponseAttribute.isValueReady())
			{
				updatePaymentTransactionData(currResponseAttribute, (PaymentServiceResponseData) target);
			}
		}
	}

	private void updatePaymentTransactionData(final ResponseAttribute currResponseAttribute,
			final PaymentServiceResponseData paymentTransactionData)
	{
		switch (currResponseAttribute.getMappedTo())
		{
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_IS_SUCCESS_FLAG:
				paymentTransactionData.setSuccess(Boolean.valueOf(currResponseAttribute.getValue()).booleanValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_MESSAGE:
				paymentTransactionData.setMessage(currResponseAttribute.getValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_GATEWAY_ID:
				paymentTransactionData.setGatewayId(currResponseAttribute.getValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_PAYMENT_MODE:
				paymentTransactionData.setPaymentMode(currResponseAttribute.getValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_CARD_TYPE:
				paymentTransactionData.setCardType(currResponseAttribute.getValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_AMOUNT:
				paymentTransactionData.setAmount(currResponseAttribute.getValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_CURRENCY:
				paymentTransactionData.setCurrency(currResponseAttribute.getValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_RECEIPT_NO:
				paymentTransactionData.setReceiptNo(currResponseAttribute.getValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_CARD_NUMBER:
				paymentTransactionData.setCardNumber(currResponseAttribute.getValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_CARD_HOLDER:
				paymentTransactionData.setCardHolder(currResponseAttribute.getValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_CARD_EXPIRY_MONTH:
				paymentTransactionData.setCardExpiryMonth(currResponseAttribute.getValue());
				break;
			case PaymentGatewayService.PAYMENT_SERVICE_RESPONSE_DATA_CARD_EXPIRY_YEAR:
				paymentTransactionData.setCardExpiryYear(currResponseAttribute.getValue());
				break;
			default:
				break;
		}

	}

}
