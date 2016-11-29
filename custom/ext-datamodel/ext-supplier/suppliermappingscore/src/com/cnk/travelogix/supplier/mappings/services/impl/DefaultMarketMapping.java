package com.cnk.travelogix.supplier.mappings.services.impl;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.enums.ClientType;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;
import com.cnk.travelogix.supplier.core.market.model.SupplierMarketModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.mappings.daos.MarketMappingDao;
import com.cnk.travelogix.supplier.mappings.market.model.MarketMappingModel;
import com.cnk.travelogix.supplier.mappings.services.MarketMappingService;


public class DefaultMarketMapping implements MarketMappingService
{
	private static final Logger LOG = Logger.getLogger(DefaultMarketMapping.class);

	private MarketMappingDao marketMappingDao;

	public MarketMappingDao getMarketMappingDao()
	{
		return marketMappingDao;
	}

	public void setMarketMappingDao(final MarketMappingDao marketMappingDao)
	{
		this.marketMappingDao = marketMappingDao;
	}

	@Override
	public MarketMappingModel getMappingDetails(final SupplierModel supplier, final ClientType clientType,
			final MarketModel companyMarket, final SupplierMarketModel supplierMarket) throws DuplicateUidException
	{
		try
		{
			return marketMappingDao.getMappingDetails(supplier, clientType, companyMarket, supplierMarket);
		}

		catch (final DuplicateUidException e)
		{
			LOG.error(e);
			throw new DuplicateUidException();
		}
	}




}