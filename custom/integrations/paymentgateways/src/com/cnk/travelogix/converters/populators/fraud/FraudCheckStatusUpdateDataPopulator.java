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
package com.cnk.travelogix.converters.populators.fraud;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.fraud.client.FraudCheckRestClient;
import com.cnk.travelogix.integrations.payment.fraud.beans.FraudCheckResponseUpdateData;


public class FraudCheckStatusUpdateDataPopulator<SOURCE, TARGET> implements Populator<SOURCE, TARGET>
{

	@Autowired
	private ConfigurationService configurationService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final SOURCE source, final TARGET target) throws ConversionException
	{
		final Map<String, String> valueMap = (Map<String, String>) source;

		final FraudCheckResponseUpdateData fraudCheckResponseUpdateData = (FraudCheckResponseUpdateData) target;

		fillFraudCheckStatusUpdateData(fraudCheckResponseUpdateData, valueMap);

	}


	private void fillFraudCheckStatusUpdateData(final FraudCheckResponseUpdateData fraudCheckResponseUpdateData,
			final Map<String, String> valueMap)
	{
		fraudCheckResponseUpdateData
				.setMerchantID(configurationService.getConfiguration().getString(FraudCheckRestClient.RMS_CREDENTIALS_MERCHANTID));
		fraudCheckResponseUpdateData
				.setKey(configurationService.getConfiguration().getString(FraudCheckRestClient.RMS_CREDENTIALS_KEY));
		fraudCheckResponseUpdateData.setTxnLogID(valueMap.get(FraudCheckRestClient.VARIABLE_NAME_TXNLOGID));
		fraudCheckResponseUpdateData.setStatus(valueMap.get(FraudCheckRestClient.VARIABLE_NAME_STATUS));

	}



}
