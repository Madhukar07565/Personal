/**
 *
 */
package com.cnk.travelogix.supplier.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.util.localization.Localization;

import java.util.Collection;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.core.services.SupplierService;
import com.cnk.travelogix.supplier.core.services.impl.DefaultSupplierService;
import com.cnk.travelogix.supplier.core.supplier.model.ProductCategoryInfoModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * Interceptor to inject the service of generated
 * <h6>Common supplier Id</h6> <br>
 * <h6>Company supplier Id</h6>
 */
public class SupplierPreparedInterceptor implements PrepareInterceptor<SupplierModel>
{
	private SupplierService supplierService;

	private KeyGenerator keyGenerator;

	final Logger LOG = Logger.getLogger(DefaultSupplierService.class.getName());

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final SupplierModel supplierModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(supplierModel))
		{
			supplierService.generateSupplierCommonAndCompanyId(supplierModel);
		}
		validateIsDefaultSupplier(supplierModel);

	}

	/*
	 * To check the combination of ProductCategory and isdefault supplier.
	 */
	public void validateIsDefaultSupplier(final SupplierModel supplierModel) throws InterceptorException, NullPointerException
	{
		try
		{
			final Collection<ProductCategoryInfoModel> prodCatInfo = supplierModel.getProductCategoryInfo();

			if (prodCatInfo != null)
			{
				for (final ProductCategoryInfoModel productCategoryInfoModel : prodCatInfo)
				{
					if ((productCategoryInfoModel.getIsDefautlSupplier().booleanValue())
							&& (productCategoryInfoModel.getProductCategorySubType().getCode().equals("C001ST001")))
					{
						supplierModel.setIsDefaultSupplier(supplierModel);
					}
					else
					{

						throw new InterceptorException(Localization.getLocalizedString("supplier.unique.combination"));
					}
				}
			}

		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
			throw new InterceptorException(Localization.getLocalizedString("prodCatInfo.isnull.mandatory"));
		}

	}


	/**
	 * @return the supplierService
	 */
	public SupplierService getSupplierService()
	{
		return supplierService;
	}

	/**
	 * @param supplierService
	 *           the supplierService to set
	 */
	public void setSupplierService(final SupplierService supplierService)
	{
		this.supplierService = supplierService;
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
