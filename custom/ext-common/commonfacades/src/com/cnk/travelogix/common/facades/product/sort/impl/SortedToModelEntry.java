/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort.impl;

import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313879
 *
 */
public class SortedToModelEntry
{
	private String code;
	private String name;
	private boolean isDesc;
	private CnkFacetValueProvider sortedValueProvider;

	/**
	 * @return the code
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * @param code
	 *           the code to set
	 */
	public void setCode(final String code)
	{
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *           the name to set
	 */
	public void setName(final String name)
	{
		this.name = name;
	}

	/**
	 * @return the isDesc
	 */
	public boolean isDesc()
	{
		return isDesc;
	}

	/**
	 * @param isDesc
	 *           the isDesc to set
	 */
	public void setDesc(final boolean isDesc)
	{
		this.isDesc = isDesc;
	}

	/**
	 * @return the sortedValueProvider
	 */
	public CnkFacetValueProvider getSortedValueProvider()
	{
		return sortedValueProvider;
	}

	/**
	 * @param sortedValueProvider
	 *           the sortedValueProvider to set
	 */
	public void setSortedValueProvider(final CnkFacetValueProvider sortedValueProvider)
	{
		this.sortedValueProvider = sortedValueProvider;
	}


}
