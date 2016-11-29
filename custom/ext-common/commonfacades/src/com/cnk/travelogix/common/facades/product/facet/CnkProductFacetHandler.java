/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.facet.impl.FacetToModelMapper;


/**
 * @author i313879
 *
 */
public interface CnkProductFacetHandler<RESULT extends BaseProductData>
{
	public boolean handleFacet(RESULT resultData, List<CnkFacetData> facets, FacetToModelMapper facetToModelMapper);
}
