/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.facet.impl.AccesserFactory;
import com.cnk.travelogix.common.facades.product.facet.impl.IAccess;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313879
 *
 */
public class DefaultCnkFacetValueProvider implements CnkFacetValueProvider
{

	private AccesserFactory accessFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.facet.provider.CnkFacetValueProvider#getFacetValue(com.cnk.travelogix
	 * .common.facades.product.data.BaseProductData, java.lang.String)
	 */
	@Override
	public Object getFacetValue(final BaseProductData bean, final String propertyName)
	{
		// YTODO Auto-generated method stub
		final IAccess accessor = accessFactory.getAccessor(bean.getClass().getName(), propertyName);
		return accessor.getValue(bean);
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
