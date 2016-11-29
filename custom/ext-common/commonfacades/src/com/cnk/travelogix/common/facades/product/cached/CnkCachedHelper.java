/**
 *
 */
package com.cnk.travelogix.common.facades.product.cached;

/**
 * @author i313879
 *
 */
public interface CnkCachedHelper
{
	public Object getObject(Object Key);

	public boolean saveObject(Object key, Object value);
}
