/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort.impl;

import de.hybris.platform.core.Registry;

import java.util.Collections;
import java.util.List;

import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313879
 *
 */
public class SortedToModelMapper
{
	private List<SortedToModelEntry> sortedToModelEntries;


	public SortedToModelEntry getMapperEntryByCode(final String code)
	{
		for (final SortedToModelEntry entry : getSortedToModelEntries())
		{
			if (entry.getCode().equals(code))
			{
				return entry;
			}
		}
		return null;
	}


	public CnkFacetValueProvider getProviderByName(final String beanName)
	{
		return (CnkFacetValueProvider) Registry.getApplicationContext().getBean(beanName);
	}


	/**
	 * @return the sortedToModelEntries
	 */
	public List<SortedToModelEntry> getSortedToModelEntries()
	{
		if (sortedToModelEntries == null)
		{
			sortedToModelEntries = buildMockupEntries();
		}
		return sortedToModelEntries;
	}

	protected List<SortedToModelEntry> buildMockupEntries()
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @param sortedToModelEntries
	 *           the sortedToModelEntries to set
	 */
	public void setSortedToModelEntries(final List<SortedToModelEntry> sortedToModelEntries)
	{
		this.sortedToModelEntries = sortedToModelEntries;
	}



}
