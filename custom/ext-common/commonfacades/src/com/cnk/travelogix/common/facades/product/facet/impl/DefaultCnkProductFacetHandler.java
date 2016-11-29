/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.facet.CnkProductFacetHandler;


/**
 * @author i313879
 *
 */
public class DefaultCnkProductFacetHandler implements CnkProductFacetHandler
{



	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.facet.CnkProductFacetHandler#handleFacet(com.cnk.travelogix.common.facades
	 * .product.data.CnkProductSearchPageData, de.hybris.platform.commerceservices.search.facetdata.FacetData)
	 */
	@Override
	public boolean handleFacet(final BaseProductData signleData, final List facets, final FacetToModelMapper facetToModelMapper)
	{
		// YTODO Auto-generated method stub
		boolean result = true;

		for (final CnkFacetData facet : (List<CnkFacetData>) facets)
		{
			final String code = facet.getCode();

			final FacetToModelEntry entry = facetToModelMapper.getMapperEntryByCode(code);
			if (entry == null)
			{
				throw new RuntimeException("You need to configure the facet mapper before using it!");
			}

			final boolean entryResult = entry.process(signleData, facet);

			result = entryResult && result;

		}

		return result;
	}


}
