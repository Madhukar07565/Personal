/**
 *
 */
package com.cnk.travelogix.converters.populators.pgmodelmapper;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.KeyValueMapModel;
import de.hybris.platform.core.model.PaymentGatewayDetailModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.integrations.payment.request.beans.KeyValueMapData;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentGatewayDetailData;


/**
 * @author C5243355
 *
 */
public class PaymentGatewayDetailListPopulator
		implements Populator<List<PaymentGatewayDetailModel>, List<PaymentGatewayDetailData>>
{
	private Converter<List<KeyValueMapModel>, List<KeyValueMapData>> paymentGatewayKeyValueMapDataConverter;



	/**
	 * @return the paymentGatewayKeyValueMapDataConverter
	 */
	public Converter<List<KeyValueMapModel>, List<KeyValueMapData>> getPaymentGatewayKeyValueMapDataConverter()
	{
		return paymentGatewayKeyValueMapDataConverter;
	}



	/**
	 * @param paymentGatewayKeyValueMapDataConverter
	 *           the paymentGatewayKeyValueMapDataConverter to set
	 */
	public void setPaymentGatewayKeyValueMapDataConverter(
			final Converter<List<KeyValueMapModel>, List<KeyValueMapData>> paymentGatewayKeyValueMapDataConverter)
	{
		this.paymentGatewayKeyValueMapDataConverter = paymentGatewayKeyValueMapDataConverter;
	}



	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final List<PaymentGatewayDetailModel> source, final List<PaymentGatewayDetailData> target)
			throws ConversionException
	{


		for (final PaymentGatewayDetailModel currPaymentGatewayDetailModel : source)
		{
			final PaymentGatewayDetailData paymentGatewayDetailData = new PaymentGatewayDetailData();
			if (currPaymentGatewayDetailModel.getCardType() != null)
			{
				paymentGatewayDetailData.setCardType(getPaymentGatewayKeyValueMapDataConverter()
						.convert(currPaymentGatewayDetailModel.getCardType(), new ArrayList<KeyValueMapData>()));
			}
			if (currPaymentGatewayDetailModel.getCurrency() != null)
			{
				paymentGatewayDetailData.setCurrency(getPaymentGatewayKeyValueMapDataConverter()
						.convert(currPaymentGatewayDetailModel.getCurrency(), new ArrayList<KeyValueMapData>()));
			}
			if (currPaymentGatewayDetailModel.getPaymentMode() != null)
			{
				paymentGatewayDetailData.setPaymentMode(getPaymentGatewayKeyValueMapDataConverter()
						.convert(currPaymentGatewayDetailModel.getPaymentMode(), new ArrayList<KeyValueMapData>()));
			}

			target.add(paymentGatewayDetailData);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */

}
