/**
 *
 */
package com.cnk.travelogix.common.core.interceptors;

import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.masterdata.core.model.BankAccountDetailModel;


/**
 * This Interceptor is used for populating the values for City , State and Country
 * 
 * @author I320212
 *
 */
public class BankAccountDetailPrepareInterceptor implements PrepareInterceptor<BankAccountDetailModel>
{

	private static final Logger LOG = Logger.getLogger(BankAccountDetailPrepareInterceptor.class);


	@Override
	public void onPrepare(final BankAccountDetailModel bankaccdetmodel, final InterceptorContext arg1) throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Populating the values of City , State and Country ");
		}

		if (bankaccdetmodel.getBankAddress() != null)
		{
			final AddressModel addr = bankaccdetmodel.getBankAddress();
			final CityModel city1 = addr.getCity();
			bankaccdetmodel.setCity(city1.getName());
			bankaccdetmodel.setCountry(addr.getCountry().getName());
			bankaccdetmodel.setState(addr.getRegion().getName());
		}
		else
		{
			throw new InterceptorException(" Please fill in the Bank Address Details ");
		}

	}
}