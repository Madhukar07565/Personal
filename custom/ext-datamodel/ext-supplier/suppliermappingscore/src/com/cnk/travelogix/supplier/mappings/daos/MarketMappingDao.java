package com.cnk.travelogix.supplier.mappings.daos;


import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import com.cnk.travelogix.masterdata.core.enums.ClientType;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;
import com.cnk.travelogix.supplier.core.market.model.SupplierMarketModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.mappings.market.model.MarketMappingModel;



public interface MarketMappingDao
{
	/**
	 * Checks for Duplicate Entries for MarketMapping based on Supplier,ClientType,ComapanyMarket and SupplierMarket
	 *
	 * @param supplier
	 * @param clientType
	 * @param companyMarket
	 * @param supplierMarket
	 * @return MarketMappingModel
	 * @throws AmbiguousIdentifierException
	 */
	public MarketMappingModel getMappingDetails(SupplierModel supplier, ClientType clientType, MarketModel companyMarket,
			SupplierMarketModel supplierMarket) throws DuplicateUidException;

}