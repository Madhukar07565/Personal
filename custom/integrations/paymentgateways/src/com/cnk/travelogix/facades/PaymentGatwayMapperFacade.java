/**
 *
 */
package com.cnk.travelogix.facades;

import java.util.List;

import com.cnk.travelogix.integrations.payment.request.beans.PaymentGatewayMappingData;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentUserSelectedData;


/**
 * @author C5243355
 *
 */
public interface PaymentGatwayMapperFacade
{
	public PaymentUserSelectedData updateUserSelectedMappedPaymentGatewayData(
			final PaymentUserSelectedData paymentUserSelectedData);

	public List<PaymentGatewayMappingData> getPaymentGatewayDataList();

	public PaymentGatewayMappingData getPaymentGatewayMappingForPGName(final String pgName);


}
