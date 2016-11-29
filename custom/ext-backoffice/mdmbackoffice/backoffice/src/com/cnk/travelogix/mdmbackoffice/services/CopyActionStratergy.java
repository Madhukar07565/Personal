/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.services;

/**
 * After Cloning a Object remove mandatory and unique attributes
 *
 */
public interface CopyActionStratergy<T>
{
	/**
	 * @param clone
	 * @param model
	 * @return T
	 */
	T postCopyAction(T clone, T model);
}
