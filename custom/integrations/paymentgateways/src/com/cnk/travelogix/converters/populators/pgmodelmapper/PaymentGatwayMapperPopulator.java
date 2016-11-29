/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cnk.travelogix.converters.populators.pgmodelmapper;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.KeyValueMapModel;
import de.hybris.platform.core.model.PaymentGatewayDetailModel;
import de.hybris.platform.core.model.PaymentGatewayMappingModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.integrations.payment.request.beans.PaymentUserSelectedData;




public class PaymentGatwayMapperPopulator<SOURCE, TARGET> implements Populator<SOURCE, TARGET>
{
	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final SOURCE source, final TARGET target) throws ConversionException
	{
		final PaymentGatewayMappingModel paymentGatewayMappingModel = (PaymentGatewayMappingModel) source;
		final PaymentUserSelectedData paymentUserSelectedData = (PaymentUserSelectedData) target;


		setModelValuesToData(paymentGatewayMappingModel, paymentUserSelectedData);

	}

	/**
	 * @param paymentGatewayMappingModel
	 * @param paymentUserSelectedData
	 */
	private void setModelValuesToData(final PaymentGatewayMappingModel paymentGatewayMappingModel,
			final PaymentUserSelectedData paymentUserSelectedData)
	{
		final List<PaymentGatewayDetailModel> paymentDetailsList = paymentGatewayMappingModel.getPaymentGatewayDetailList();

		paymentUserSelectedData.setPaymentGatewayId(paymentGatewayMappingModel.getPgReqTempID());
		setCurrency(paymentDetailsList, paymentUserSelectedData);
		setCardType(paymentDetailsList, paymentUserSelectedData);
		setPaymentMode(paymentDetailsList, paymentUserSelectedData);
	}


	/**
	 * @param paymentDetailsList
	 * @param paymentUserSelectedData
	 */
	private void setPaymentMode(final List<PaymentGatewayDetailModel> paymentDetailsList,
			final PaymentUserSelectedData paymentUserSelectedData)
	{
		Boolean flag = Boolean.FALSE;
		if (StringUtils.isNotBlank(paymentUserSelectedData.getPaymentMode()))
		{
			for (final PaymentGatewayDetailModel paymentGatewayDetailModel : paymentDetailsList)
			{
				if (paymentGatewayDetailModel.getPaymentMode() != null)
				{
					flag = isFoundPaymentMode(paymentUserSelectedData, paymentGatewayDetailModel);
				}
				if (flag.booleanValue())
				{
					break;
				}
			}
		}

	}

	/**
	 * @param paymentUserSelectedData
	 * @param flag
	 * @param paymentGatewayDetailModel
	 * @return
	 */
	private Boolean isFoundPaymentMode(final PaymentUserSelectedData paymentUserSelectedData,
			final PaymentGatewayDetailModel paymentGatewayDetailModel)
	{
		Boolean isFoundFlag = Boolean.FALSE;
		for (final KeyValueMapModel keyValueMap : paymentGatewayDetailModel.getPaymentMode())
		{
			if (StringUtils.isNotBlank(keyValueMap.getValue())
					&& keyValueMap.getKey().equalsIgnoreCase(paymentUserSelectedData.getPaymentMode()))
			{
				isFoundFlag = Boolean.TRUE;
				paymentUserSelectedData.setPaymentMode(keyValueMap.getValue());
				break;
			}
		}
		return isFoundFlag;
	}

	/**
	 * @param string
	 * @param list
	 * @param paymentGatewayMappingModel
	 * @param paymentUserSelectedData
	 * @return
	 */

	/**
	 * @param paymentDetailsList
	 * @param paymentUserSelectedData
	 */
	private void setCardType(final List<PaymentGatewayDetailModel> paymentDetailsList,
			final PaymentUserSelectedData paymentUserSelectedData)
	{
		Boolean flag = Boolean.FALSE;
		if (StringUtils.isNotBlank(paymentUserSelectedData.getCardType()))
		{
			for (final PaymentGatewayDetailModel paymentGatewayDetailModel : paymentDetailsList)
			{
				if (paymentGatewayDetailModel.getCardType() != null)
				{
					flag = isFoundCardType(paymentUserSelectedData, paymentGatewayDetailModel);
				}
				if (flag.booleanValue())
				{
					break;
				}
			}
		}

	}

	/**
	 * @param paymentUserSelectedData
	 * @param flag
	 * @param paymentGatewayDetailModel
	 * @return
	 */
	private Boolean isFoundCardType(final PaymentUserSelectedData paymentUserSelectedData,
			final PaymentGatewayDetailModel paymentGatewayDetailModel)
	{
		Boolean isFoundFlag = Boolean.FALSE;
		for (final KeyValueMapModel keyValueMap : paymentGatewayDetailModel.getCardType())
		{
			if (StringUtils.isNotBlank(keyValueMap.getValue())
					&& keyValueMap.getKey().equalsIgnoreCase(paymentUserSelectedData.getCardType()))
			{
				isFoundFlag = Boolean.TRUE;
				paymentUserSelectedData.setCardType(keyValueMap.getValue());
				break;
			}
		}
		return isFoundFlag;
	}

	/**
	 * @param paymentDetailsList
	 * @param paymentUserSelectedData
	 */
	private void setCurrency(final List<PaymentGatewayDetailModel> paymentDetailsList,
			final PaymentUserSelectedData paymentUserSelectedData)
	{
		Boolean flag = Boolean.FALSE;
		if (StringUtils.isNotBlank(paymentUserSelectedData.getCurrency()))
		{
			for (final PaymentGatewayDetailModel paymentGatewayDetailModel : paymentDetailsList)
			{
				if (paymentGatewayDetailModel.getCurrency() != null)
				{
					flag = isFoundCurrency(paymentUserSelectedData, paymentGatewayDetailModel);
				}
				if (flag.booleanValue())
				{
					break;
				}
			}
		}

	}

	/**
	 * @param paymentUserSelectedData
	 * @param flag
	 * @param paymentGatewayDetailModel
	 * @return
	 */
	private Boolean isFoundCurrency(final PaymentUserSelectedData paymentUserSelectedData,
			final PaymentGatewayDetailModel paymentGatewayDetailModel)
	{
		Boolean isFoundFlag = Boolean.FALSE;
		for (final KeyValueMapModel keyValueMap : paymentGatewayDetailModel.getCurrency())
		{
			if (StringUtils.isNotBlank(keyValueMap.getValue())
					&& keyValueMap.getKey().equalsIgnoreCase(paymentUserSelectedData.getCurrency()))
			{
				isFoundFlag = Boolean.TRUE;
				paymentUserSelectedData.setCurrency(keyValueMap.getValue());
				break;
			}
		}
		return isFoundFlag;
	}

	/**
	 * @param currFormAttribute
	 * @param paymentUserSelectedData
	 */

}
