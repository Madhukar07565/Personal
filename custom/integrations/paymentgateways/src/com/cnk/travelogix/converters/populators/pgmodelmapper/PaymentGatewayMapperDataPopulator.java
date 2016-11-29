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
public class PaymentGatewayMapperDataPopulator implements Populator<PaymentGatewayMappingModel, PaymentGatewayMappingData>
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
	public void populate(final PaymentGatewayMappingModel source, final PaymentGatewayMappingData target)
			throws ConversionException
	{
		target.setPaymentGatewayName(source.getPgName());
		target.setPaymentGatewayRequestXMLTemplateID(source.getPgReqTempID());
		target.setPaymentGatewayResponseXMLTemplateID(source.getPgResTempID());
		target.setPaymentGatewayDetailList(getPaymentGatewayDetailDataConverter().convert(source.getPaymentGatewayDetailList()));

	}



}
