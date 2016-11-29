/**
 *
 */
package com.cnk.travelogix.services.modelservice;

import de.hybris.platform.core.model.PaymentGatewayMappingModel;

import java.util.List;


/**
 * @author C5243355
 *
 */
public interface PaymentGatewayMapperService
{

	public PaymentGatewayMappingModel getPaymentGatewayMappingForPGName(final String pgName);

	public List<PaymentGatewayMappingModel> getPaymentGatewayModelList();
}
