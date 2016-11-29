/**
 *
 */
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.common;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.order.OrderFacade;

import java.util.Map;

import javax.annotation.Resource;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


/**
 * @author C5243355
 *
 */
public class CustomerOrderIDDecorator extends PaymentGatewayRequestFormDecorator
{

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public CustomerOrderIDDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public CustomerOrderIDDecorator()
	{
		super();
	}

	@Resource(name = "orderFacade")
	private OrderFacade orderFacade;

	@Resource(name = "customerFacade")
	private CustomerFacade customerFacade;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.services.paymentgateways.decorators.PaymentGatewayRequestForm#processAttibuteValue(com.cnk.
	 * travelogix.beans.FormAttribute, java.util.Map)
	 */
	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
	{

		final String orderId = "ORDTEST" + System.currentTimeMillis();

		updateFormAttributeFlags(formAttribute, orderId);

		return formAttribute;
	}

}
