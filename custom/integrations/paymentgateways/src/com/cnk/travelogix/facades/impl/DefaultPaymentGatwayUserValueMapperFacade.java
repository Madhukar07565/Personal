/**
 *
 */
package com.cnk.travelogix.facades.impl;

import de.hybris.platform.core.model.PaymentGatewayMappingModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.facades.PaymentGatwayMapperFacade;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentGatewayMappingData;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentUserSelectedData;
import com.cnk.travelogix.services.modelservice.PaymentGatewayMapperService;


/**
 * @author C5243355
 *
 */
public class DefaultPaymentGatwayUserValueMapperFacade implements PaymentGatwayMapperFacade
{
	private PaymentGatewayMapperService paymentGatewayMapperService;
	private Converter<PaymentGatewayMappingModel, PaymentUserSelectedData> paymentGatwayMapperConverter;
	private Converter<List<PaymentGatewayMappingModel>, List<PaymentGatewayMappingData>> paymentGatwayMapperListConverter;
	private Converter<PaymentGatewayMappingModel, PaymentGatewayMappingData> paymentGatwayMapperDataConverter;

	/**
	 * @return the paymentGatwayMapperDataConverter
	 */
	public Converter<PaymentGatewayMappingModel, PaymentGatewayMappingData> getPaymentGatwayMapperDataConverter()
	{
		return paymentGatwayMapperDataConverter;
	}

	/**
	 * @param paymentGatwayMapperDataConverter
	 *           the paymentGatwayMapperDataConverter to set
	 */
	public void setPaymentGatwayMapperDataConverter(
			final Converter<PaymentGatewayMappingModel, PaymentGatewayMappingData> paymentGatwayMapperDataConverter)
	{
		this.paymentGatwayMapperDataConverter = paymentGatwayMapperDataConverter;
	}

	/**
	 * @return the paymentGatwayMapperListConverter
	 */
	public Converter<List<PaymentGatewayMappingModel>, List<PaymentGatewayMappingData>> getPaymentGatwayMapperListConverter()
	{
		return paymentGatwayMapperListConverter;
	}

	/**
	 * @param paymentGatwayMapperListConverter
	 *           the paymentGatwayMapperListConverter to set
	 */
	public void setPaymentGatwayMapperListConverter(
			final Converter<List<PaymentGatewayMappingModel>, List<PaymentGatewayMappingData>> paymentGatwayMapperListConverter)
	{
		this.paymentGatwayMapperListConverter = paymentGatwayMapperListConverter;
	}

	/**
	 * @return the paymentGatwayMapperConverter
	 */
	public Converter<PaymentGatewayMappingModel, PaymentUserSelectedData> getPaymentGatwayMapperConverter()
	{
		return paymentGatwayMapperConverter;
	}

	/**
	 * @param paymentGatwayMapperConverter
	 *           the paymentGatwayMapperConverter to set
	 */
	public void setPaymentGatwayMapperConverter(
			final Converter<PaymentGatewayMappingModel, PaymentUserSelectedData> paymentGatwayMapperConverter)
	{
		this.paymentGatwayMapperConverter = paymentGatwayMapperConverter;
	}

	/**
	 * @return the paymentGatewayMapperService
	 */
	public PaymentGatewayMapperService getPaymentGatewayMapperService()
	{
		return paymentGatewayMapperService;
	}

	/**
	 * @param paymentGatewayMapperService
	 *           the paymentGatewayMapperService to set
	 */
	public void setPaymentGatewayMapperService(final PaymentGatewayMapperService paymentGatewayMapperService)
	{
		this.paymentGatewayMapperService = paymentGatewayMapperService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.facades.PaymentGatwayUserValueMapper#getUserSelectedMappedPaymentGatewayData(com.cnk.travelogix
	 * .integrations.payment.response.beans.PaymentUserSelectedData)
	 */
	@Override
	public PaymentUserSelectedData updateUserSelectedMappedPaymentGatewayData(
			final PaymentUserSelectedData paymentUserSelectedData)
	{
		// YTODO Auto-generated method stub
		final PaymentGatewayMappingModel paymentGatewayMappingModel = getPaymentGatewayMapperService()
				.getPaymentGatewayMappingForPGName(paymentUserSelectedData.getPaymentGatewayId());
		if (paymentGatewayMappingModel != null)
		{
			return getPaymentGatwayMapperConverter().convert(paymentGatewayMappingModel, paymentUserSelectedData);
		}
		return paymentUserSelectedData;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.facades.PaymentGatwayMapperFacade#getPaymentGatewayDataList()
	 */
	@Override
	public List<PaymentGatewayMappingData> getPaymentGatewayDataList()
	{
		final List<PaymentGatewayMappingModel> paymentGatewayMappingModelList = getPaymentGatewayMapperService()
				.getPaymentGatewayModelList();
		return getPaymentGatwayMapperListConverter().convert(paymentGatewayMappingModelList,
				new ArrayList<PaymentGatewayMappingData>());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.facades.PaymentGatwayMapperFacade#getPaymentGatewayMappingForPGName(java.lang.String)
	 */
	@Override
	public PaymentGatewayMappingData getPaymentGatewayMappingForPGName(final String pgName)
	{
		final PaymentGatewayMappingModel paymentGatewayMappingModel = getPaymentGatewayMapperService()
				.getPaymentGatewayMappingForPGName(pgName);
		return getPaymentGatwayMapperDataConverter().convert(paymentGatewayMappingModel, new PaymentGatewayMappingData());
	}

}
