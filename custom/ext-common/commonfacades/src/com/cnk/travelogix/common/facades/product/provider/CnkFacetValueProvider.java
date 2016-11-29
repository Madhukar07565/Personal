/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;


/**
 * @author i313879
 *
 */
public interface CnkFacetValueProvider<T extends BaseProductData>
{
	public Object getFacetValue(T bean, String propertyName);
}
