/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.operations.services.impl;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.model.ClientReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationtraveldestination.model.ReconfirmationTravelDestinationModel;
import com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.model.SupplierReconfirmationConfigModel;
import com.cnk.travelogix.operation.reconfirmation.dao.TravelogixReconfirmationConfigDao;
import com.cnk.travelogix.operations.data.ClientReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationSearchParameterData;
import com.cnk.travelogix.operations.data.ReconfirmationTravelDestinationData;
import com.cnk.travelogix.operations.data.SupplierReconfirmationConfigData;
import com.cnk.travelogix.operations.services.TravelogixReconfirmationConfigService;


/**
 * Service Class for Reconfirmation Configuration master.
 *
 * @author C5244543
 */
/**
 *
 */
/**
 *
 */
/**
 *
 */
public class TravelogixReconfirmationConfigServiceImpl implements TravelogixReconfirmationConfigService
{
	private static final Logger LOG = Logger.getLogger(TravelogixReconfirmationConfigServiceImpl.class);

	@Autowired
	private TravelogixReconfirmationConfigDao reconfirmationConfigDao;

	@Autowired
	private ModelService modelService;

	@Autowired
	private Converter<ClientReconfirmationConfigData, ClientReconfirmationConfigModel> clientReconfirmationConfigReverseConverter;
	@Autowired
	private Converter<SupplierReconfirmationConfigData, SupplierReconfirmationConfigModel> supplierReconfirmationConfigReverseConverter;
	@Autowired
	private Converter<ReconfirmationTravelDestinationData, ReconfirmationTravelDestinationModel> reconfirmationTravelDestinationReverseConverter;
	@Autowired
	private Converter<ReconfirmationConfigData, ReconfirmationConfigModel> reconfirmationConfigReverseConverter;

	@Override
	public ReconfirmationConfigModel getReconfirmationConfigForCode(final String code)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Getting Reconfirmation Configure Record for Code [" + code + "]");
		}
		return reconfirmationConfigDao.getReconfirmationConfigForCode(code);
	}

	@Override
	public SearchPageData<ReconfirmationConfigModel> getAllReconfirmationConfigs(
			final ReconfirmationSearchParameterData reconfirmationSearchParameterData, final PageableData pageableData)
	{
		SearchPageData<ReconfirmationConfigModel> searchPageData = new SearchPageData<>();
		if (reconfirmationSearchParameterData != null)
		{
			try
			{
				searchPageData = reconfirmationConfigDao.getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData);
			}
			catch (final Exception e)
			{
				LOG.error("Exception occured at the time of searching reconfirmation configurations records...!! ", e);
			}
		}
		return searchPageData;
	}


	@Override
	public ReconfirmationConfigModel addReconfirmationConfigRecord(final ReconfirmationConfigData configData,
			ReconfirmationConfigModel reconfirmationConfigModel)
	{
		reconfirmationConfigModel = reconfirmationConfigReverseConverter.convert(configData, reconfirmationConfigModel);

		if (null != configData.getClientReconfirmationConfigs())
		{
			clientReconfirmationConfigRecord(configData.getClientReconfirmationConfigs(), reconfirmationConfigModel);
		}
		if (null != configData.getSupplierReconfirmationConfigs())
		{
			supplierReconfirmationConfigRecord(configData.getSupplierReconfirmationConfigs(), reconfirmationConfigModel);
		}
		if (null != configData.getReconfirmationTravelDestinations())
		{
			reconfirmationTravelDestinations(configData.getReconfirmationTravelDestinations(), reconfirmationConfigModel);
		}
		return reconfirmationConfigModel;
	}

	/**
	 * This method is use to set the client Reconfirmation config if recond is already exist then just set the reference.
	 */
	private void clientReconfirmationConfigRecord(final List<ClientReconfirmationConfigData> clientReconfirmations,
			final ReconfirmationConfigModel configModel)
	{
		final List<ClientReconfirmationConfigModel> configModels = new ArrayList<>();
		for (final ClientReconfirmationConfigData clientConfigData : clientReconfirmations)
		{
			final List<ClientReconfirmationConfigModel> clientReconfirmationConfigModels = reconfirmationConfigDao
					.findClientConfigurations(clientConfigData);
			if (null != clientReconfirmationConfigModels && !clientReconfirmationConfigModels.isEmpty())
			{
				configModels.add(clientReconfirmationConfigModels.get(0));
			}
			else
			{
				ClientReconfirmationConfigModel clientReconfirmationConfigModel = modelService
						.create(ClientReconfirmationConfigModel.class);
				clientReconfirmationConfigModel = clientReconfirmationConfigReverseConverter.convert(clientConfigData,
						clientReconfirmationConfigModel);
				configModels.add(clientReconfirmationConfigModel);
			}
		}
		if (!configModels.isEmpty())
		{
			configModel.setClientreconfirmationconfigs(configModels);
		}
	}


	/**
	 * This method is use to set the Supplier Reconfirmation config if recond is already exist then just set the
	 * reference.
	 */
	private void supplierReconfirmationConfigRecord(final List<SupplierReconfirmationConfigData> supplierReconfirmations,
			final ReconfirmationConfigModel configModel)
	{
		final List<SupplierReconfirmationConfigModel> configModels = new ArrayList<>();
		for (final SupplierReconfirmationConfigData supplierConfigData : supplierReconfirmations)
		{
			final List<SupplierReconfirmationConfigModel> supplierReconfirmationConfigModels = reconfirmationConfigDao
					.findSupplierConfigurations(supplierConfigData);
			if (null != supplierReconfirmationConfigModels && !supplierReconfirmationConfigModels.isEmpty())
			{
				configModels.add(supplierReconfirmationConfigModels.get(0));
			}
			else
			{
				SupplierReconfirmationConfigModel supplierReconfirmationConfigModel = modelService
						.create(SupplierReconfirmationConfigModel.class);
				supplierReconfirmationConfigModel = supplierReconfirmationConfigReverseConverter.convert(supplierConfigData,
						supplierReconfirmationConfigModel);
				configModels.add(supplierReconfirmationConfigModel);
			}
		}
		if (!configModels.isEmpty())
		{
			configModel.setSupplierreconfirmationconfigs(configModels);
		}
	}


	/**
	 * This method is use to set the Reconfirmation Travel Destinations if recond is already exist then just set the
	 * reference.
	 */
	private void reconfirmationTravelDestinations(final List<ReconfirmationTravelDestinationData> travelDestinationDatas,
			final ReconfirmationConfigModel configModel)
	{
		final List<ReconfirmationTravelDestinationModel> configModels = new ArrayList<>();
		for (final ReconfirmationTravelDestinationData travelDestinationData : travelDestinationDatas)
		{
			final List<ReconfirmationTravelDestinationModel> travelDestinationModels = reconfirmationConfigDao
					.findTravelDestinations(travelDestinationData);
			if (null != travelDestinationModels && !travelDestinationModels.isEmpty())
			{
				configModels.add(travelDestinationModels.get(0));
			}
			else
			{
				ReconfirmationTravelDestinationModel travelDestinationModel = modelService
						.create(ReconfirmationTravelDestinationModel.class);
				travelDestinationModel = reconfirmationTravelDestinationReverseConverter.convert(travelDestinationData,
						travelDestinationModel);
				configModels.add(travelDestinationModel);
			}
		}
		if (!configModels.isEmpty())
		{
			configModel.setReconfirmationtraveldestinations(configModels);
		}
	}


}
