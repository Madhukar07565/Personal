/**
 *
 */
package com.cnk.travelogix.supplier.rates.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.rates.model.supplierrates.accommodation.AccommodationSupplierRateModel;


public class AccommodationSupplierRatePrepareInterceptor implements PrepareInterceptor<AccommodationSupplierRateModel>
{
	private KeyGenerator keyGenerator;

	private static final Logger LOG = Logger.getLogger(AccommodationSupplierRatePrepareInterceptor.class);

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

	@Override
	public void onPrepare(final AccommodationSupplierRateModel accommodationSupplierRate, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (ctx.isNew(accommodationSupplierRate))
		{
			final String key = keyGenerator.generate().toString();
			accommodationSupplierRate.setCode("RATE" + key);
			LOG.debug("Generated value for code in Accommodation supplier rate " + accommodationSupplierRate.getCode());
		}
	}
}
