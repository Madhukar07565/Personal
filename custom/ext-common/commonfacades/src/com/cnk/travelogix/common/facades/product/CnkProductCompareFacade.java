/**
 * 
 */
package com.cnk.travelogix.common.facades.product;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;

/**
 * @author i313890
 *
 */
public interface CnkProductCompareFacade<RESULT extends BaseProductData>
{
	public List<RESULT> searchProductByIds(String... productId);

}
