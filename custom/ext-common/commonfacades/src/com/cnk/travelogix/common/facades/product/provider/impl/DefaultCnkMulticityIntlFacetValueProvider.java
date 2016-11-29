/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;
import com.cnk.travelogix.common.facades.product.facet.impl.AccesserFactory;
import com.cnk.travelogix.common.facades.product.facet.impl.IAccess;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i323616
 *
 */
public class DefaultCnkMulticityIntlFacetValueProvider implements CnkFacetValueProvider<FlightResultData>
{

	private AccesserFactory accessFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider#getFacetValue(com.cnk.travelogix.common.
	 * facades.product.data.BaseProductData, java.lang.String)
	 */
	@Override
	public Object getFacetValue(final FlightResultData bean, final String propertyName)
	{
		// YTODO Auto-generated method stub
		if (bean.getListOfFlights().isEmpty())
		{
			return null;
		}
		final IAccess accessor = accessFactory.getAccessor(bean.getListOfFlights().get(0).getClass().getName(), propertyName);
		return accessor.getValue(bean.getListOfFlights().get(0));
	}

	/**
	 * @return the accessFactory
	 */
	public AccesserFactory getAccessFactory()
	{
		return accessFactory;
	}

	/**
	 * @param accessFactory
	 *           the accessFactory to set
	 */
	public void setAccessFactory(final AccesserFactory accessFactory)
	{
		this.accessFactory = accessFactory;
	}

}
