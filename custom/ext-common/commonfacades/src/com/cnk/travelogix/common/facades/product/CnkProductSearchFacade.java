/**
 *
 */
package com.cnk.travelogix.common.facades.product;

import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;

import java.util.List;


/**
 * @author i313879
 *
 */
public interface CnkProductSearchFacade<RESULT extends BaseProductData>
{
	/**
	 * Search CNK products with given search parameters.
	 *
	 * @param searchParameters
	 * @return the result pageable beans
	 */
	public CnkProductSearchPageData searchProduct(BasePageableSearchData searchParameters);

	/**
	 * Search single product with given parameters. The parameters should contain the product ID.
	 *
	 * @param searchParameters
	 * @return product bean
	 */
	public RESULT searchProductDetail(BasePageableSearchData searchParameters);

	/**
	 * Search single product with given parameters. The parameters should contain the product ID.
	 *
	 * @param productId
	 *           product ID
	 * @return product bean
	 */
	public RESULT searchProductDetail(String productId);

	/**
	 * Search products with given parameters. The parameters should contain the product ID.
	 *
	 * @param productIds
	 *           product ID array
	 * @return list of product bean
	 */
	default List<RESULT> searchProductDetail(String ... productIds) {
		throw new RuntimeException("Not implemented yet");
	}

}
