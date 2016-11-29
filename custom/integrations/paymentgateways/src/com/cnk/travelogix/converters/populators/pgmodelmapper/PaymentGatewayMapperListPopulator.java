/**
 *
 */
package com.cnk.travelogix.converters.populators.pgmodelmapper;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.PaymentGatewayDetailModel;
import de.hybris.platform.core.model.PaymentGatewayMappingModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.cnk.travelogix.integrations.payment.request.beans.PaymentGatewayDetailData;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentGatewayMappingData;


/**
 * @author C5243355
 *
 */
public class PaymentGatewayMapperListPopulator
		implements Populator<List<PaymentGatewayMappingModel>, List<PaymentGatewayMappingData>>
{
	private Converter<List<PaymentGatewayDetailModel>, List<PaymentGatewayDetailData>> paymentGatewayDetailDataConverter;

	/**
	 * @return the paymentGatewayDetailDataConverter
	 */
	public Converter<List<PaymentGatewayDetailModel>, List<PaymentGatewayDetailData>> getPaymentGatewayDetailDataConverter()
	{
		return paymentGatewayDetailDataConverter;
	}

	/**
	 * @param paymentGatewayDetailDataConverter
	 *           the paymentGatewayDetailDataConverter to set
	 */
	public void setPaymentGatewayDetailDataConverter(
			final Converter<List<PaymentGatewayDetailModel>, List<PaymentGatewayDetailData>> paymentGatewayDetailDataConverter)
	{
		this.paymentGatewayDetailDataConverter = paymentGatewayDetailDataConverter;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final List<PaymentGatewayMappingModel> source, final List<PaymentGatewayMappingData> target)
			throws ConversionException
	{
		for (final PaymentGatewayMappingModel currPaymentGatewayMappingModel : source)
		{
			final PaymentGatewayMappingData paymentGatewayMappingData = new PaymentGatewayMappingData();

			paymentGatewayMappingData.setPaymentGatewayName(currPaymentGatewayMappingModel.getPgName());
			paymentGatewayMappingData.setPaymentGatewayRequestXMLTemplateID(currPaymentGatewayMappingModel.getPgReqTempID());
			paymentGatewayMappingData.setPaymentGatewayResponseXMLTemplateID(currPaymentGatewayMappingModel.getPgResTempID());

			paymentGatewayMappingData.setPaymentGatewayDetailList(
					getPaymentGatewayDetailDataConverter().convert(currPaymentGatewayMappingModel.getPaymentGatewayDetailList()));

			target.add(paymentGatewayMappingData);

		}
	}



}
