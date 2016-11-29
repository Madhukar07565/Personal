package com.cnk.travelogix.supplier.mappings.daos.impl;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import com.cnk.travelogix.masterdata.core.enums.ClientType;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;
import com.cnk.travelogix.supplier.core.market.model.SupplierMarketModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.mappings.daos.MarketMappingDao;
import com.cnk.travelogix.supplier.mappings.market.model.MarketMappingModel;


public class DefaultMarketMappingDao extends AbstractItemDao implements MarketMappingDao
{
	protected static final String MARKETMAPPING_QUERY_FOR_DUPLICATE = "SELECT {" + MarketMappingModel.PK + "} FROM {"
			+ MarketMappingModel._TYPECODE + "} WHERE {" + MarketMappingModel.CLIENTTYPE + "} = ?clientType and {"
			+ MarketMappingModel.COMPANYMARKET + "} = ?companyMarket and {" + MarketMappingModel.SUPPLIERMARKET
			+ "} = ?supplierMarket  and {" + MarketMappingModel.SUPPLIER + "} = ?supplier";

	@Override
	public MarketMappingModel getMappingDetails(final SupplierModel supplier, final ClientType clientType,
			final MarketModel companyMarket, final SupplierMarketModel supplierMarket) throws DuplicateUidException
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(MARKETMAPPING_QUERY_FOR_DUPLICATE);
		query.addQueryParameter(MarketMappingModel.CLIENTTYPE, clientType);
		query.addQueryParameter(MarketMappingModel.COMPANYMARKET, companyMarket);
		query.addQueryParameter(MarketMappingModel.SUPPLIERMARKET, supplierMarket);
		query.addQueryParameter(MarketMappingModel.SUPPLIER, supplier);
		final SearchResult<MarketMappingModel> result = search(query);

		if (result.getResult().size() > 1)
		{
			throw new DuplicateUidException("Found Entries");

		}
		return result.getResult().isEmpty() ? null : result.getResult().get(0);
	}
}