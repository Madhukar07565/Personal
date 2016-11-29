/**
 *
 */
package com.cnk.travelogix.supplier.core.services.impl;

import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.core.services.SupplierService;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * autogenerate key for common supplier id and company supplier id
 *
 */
public class DefaultSupplierService implements SupplierService
{

	private KeyGenerator keyGenerator;

	private ConfigurationService configurationService;

	final Logger LOG = Logger.getLogger(DefaultSupplierService.class.getName());

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.supplier.core.services.SupplierService#generateSupplierCommonAndCompanyId(com.cnk.travelogix.
	 * supplier.core.supplier.model.SupplierModel)
	 */
	@Override
	public void generateSupplierCommonAndCompanyId(final SupplierModel supplierModel) throws InterceptorException
	{
		try
		{
			if (supplierModel.getAddress() != null && supplierModel.getAddress().getCountry() != null
					&& supplierModel.getCatalogVersion() != null && supplierModel.getCatalogVersion().getCatalog() != null
					&& supplierModel.getCatalogVersion().getCatalog().getCompany() != null
					&& supplierModel.getAddress().getCountry().getIsocode() != null
					&& supplierModel.getCatalogVersion().getCatalog().getCompany().getUid() != null)
			{
				final String key = keyGenerator.generate().toString();
				supplierModel.setCommonUid(key);
				supplierModel.setCode(key);

				LOG.info("Generated common supplier id is : " + key);
				LOG.info("Generated code is : " + key);

				supplierModel
						.setCompanySupplierId((supplierModel.getCatalogVersion().getCatalog().getCompany().getUid().substring(0, 3))
								.concat(supplierModel.getAddress().getCountry().getIsocode().toString()).concat(key));
				LOG.info("Generated company supplier id is" + supplierModel.getCompanySupplierId());
			}
			else
			{
				throw new InterceptorException(
						configurationService.getConfiguration().getString("supplier.country.catalog.mandatory"));
			}
		}
		catch (final Exception e)
		{
			throw new InterceptorException(configurationService.getConfiguration().getString("supplier.country.catalog.mandatory"));

		}
	}

	/**
	 * @return the configurationService
	 */
	public ConfigurationService getConfigurationService()
	{
		return configurationService;
	}

	/**
	 * @param configurationService
	 *           the configurationService to set
	 */
	public void setConfigurationService(final ConfigurationService configurationService)
	{
		this.configurationService = configurationService;
	}

	/**
	 * @return the keyGenerator
	 */
	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	/**
	 * @param keyGenerator
	 *           the keyGenerator to set
	 */
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}

}
