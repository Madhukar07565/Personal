/**
 *
 */
package com.cnk.travelogix.services.modelservice.impl;

import de.hybris.platform.core.model.PaymentGatewayMappingModel;

import java.util.List;

import com.cnk.travelogix.dao.PaymentGatewayDao;
import com.cnk.travelogix.services.modelservice.PaymentGatewayMapperService;


/**
 * @author C5243355
 *
 */
public class PaymentGatewayMapperServiceImpl implements PaymentGatewayMapperService
{
	private PaymentGatewayDao paymentGatewayDao;

	/**
	 * @return the paymentGatewayDao
	 */
	public PaymentGatewayDao getPaymentGatewayDao()
	{
		return paymentGatewayDao;
	}

	/**
	 * @param paymentGatewayDao
	 *           the paymentGatewayDao to set
	 */
	public void setPaymentGatewayDao(final PaymentGatewayDao paymentGatewayDao)
	{
		this.paymentGatewayDao = paymentGatewayDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.services.modelservice.PaymentGatewayMapperService#getPaymentGatewayMappingForPGName(java.lang.
	 * String)
	 */
	@Override
	public PaymentGatewayMappingModel getPaymentGatewayMappingForPGName(final String pgName)
	{
		return getPaymentGatewayDao().getPaymentGatewayMappingForPGName(pgName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.services.modelservice.PaymentGatewayMapperService#getPaymentGatewayModelList()
	 */
	@Override
	public List<PaymentGatewayMappingModel> getPaymentGatewayModelList()
	{
		// YTODO Auto-generated method stub
		return getPaymentGatewayDao().getPaymentGatewayModelList();
	}

}
