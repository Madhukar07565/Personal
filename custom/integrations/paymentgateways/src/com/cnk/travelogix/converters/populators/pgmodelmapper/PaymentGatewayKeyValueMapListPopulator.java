/**
 *
 */
package com.cnk.travelogix.converters.populators.pgmodelmapper;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.KeyValueMapModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;

import com.cnk.travelogix.integrations.payment.request.beans.KeyValueMapData;


/**
 * @author C5243355
 *
 */
public class PaymentGatewayKeyValueMapListPopulator implements Populator<List<KeyValueMapModel>, List<KeyValueMapData>>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final List<KeyValueMapModel> source, final List<KeyValueMapData> target) throws ConversionException
	{


		for (final KeyValueMapModel currKeyValueMapModel : source)
		{
			final KeyValueMapData keyValueMapData = new KeyValueMapData();
			keyValueMapData.setPaymentGatewayName(currKeyValueMapModel.getPaymentGatewayName());
			keyValueMapData.setKey(currKeyValueMapModel.getKey());
			keyValueMapData.setValue(currKeyValueMapModel.getValue());

			target.add(keyValueMapData);
		}

	}


}
