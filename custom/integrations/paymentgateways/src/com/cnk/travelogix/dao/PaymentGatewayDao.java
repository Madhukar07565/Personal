/**
 *
 */
package com.cnk.travelogix.dao;

import de.hybris.platform.core.model.PaymentGatewayMappingModel;

import java.util.List;


/**
 * @author C5243355
 *
 */
public interface PaymentGatewayDao
{
	public PaymentGatewayMappingModel getPaymentGatewayMappingForPGName(final String pgName);

	public List<PaymentGatewayMappingModel> getPaymentGatewayModelList();
}
