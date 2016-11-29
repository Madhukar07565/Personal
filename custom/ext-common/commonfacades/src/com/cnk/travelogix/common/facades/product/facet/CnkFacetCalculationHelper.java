/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.facet.impl.FacetToModelEntry;


/**
 * @author i313879
 *
 */
public interface CnkFacetCalculationHelper<T extends BaseProductData>
{
	public boolean process(final T singleData, CnkFacetData facet, FacetToModelEntry facetEntry);
}
