/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import de.hybris.platform.core.Registry;

import java.util.List;

import com.cnk.travelogix.common.facades.product.facet.CnkFacetCalculationHelper;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313879
 *
 */
public abstract class FacetToModelMapper
{
	//	private static final FacetToModelMapper INSTANCE = new FacetToModelMapper();

	private List<FacetToModelEntry> FacetToModelEntries;

	private CnkFacetCalculationHelper defaultFacetCalculationHelper;

	private CnkFacetValueProvider defaultCnkFacetValueProvider;


	//	public static FacetToModelMapper getInstance()
	//	{
	//		return INSTANCE;
	//	}

	public CnkFacetValueProvider getProviderByName(final String beanName)
	{
		return (CnkFacetValueProvider) Registry.getApplicationContext().getBean(beanName);
	}

	public CnkFacetCalculationHelper getFacetHelperByName(final String beanName)
	{
		return (CnkFacetCalculationHelper) Registry.getApplicationContext().getBean(beanName);
	}


	public FacetToModelEntry getMapperEntryByCode(final String code)
	{
		for (final FacetToModelEntry entry : getFacetToModelEntries())
		{
			if (entry.getFacetCode().equals(code))
			{
				return entry;
			}
		}
		return null;
	}

	protected abstract List<FacetToModelEntry> buildMockupEntrys();


	/**
	 * @return the facetToModelEntries
	 */
	public List<FacetToModelEntry> getFacetToModelEntries()
	{
		//TODO: delete mockup
		FacetToModelEntries = buildMockupEntrys();
		return FacetToModelEntries;
	}

	/**
	 * @param facetToModelEntries
	 *           the facetToModelEntries to set
	 */
	public void setFacetToModelEntries(final List<FacetToModelEntry> facetToModelEntries)
	{
		FacetToModelEntries = facetToModelEntries;
	}

	/**
	 * @return the defaultFacetCalculationHelper
	 */
	public CnkFacetCalculationHelper getDefaultFacetCalculationHelper()
	{
		return defaultFacetCalculationHelper;
	}

	/**
	 * @param defaultFacetCalculationHelper
	 *           the defaultFacetCalculationHelper to set
	 */
	public void setDefaultFacetCalculationHelper(final CnkFacetCalculationHelper defaultFacetCalculationHelper)
	{
		this.defaultFacetCalculationHelper = defaultFacetCalculationHelper;
	}




	/**
	 * @return the defaultCnkFacetValueProvider
	 */
	public CnkFacetValueProvider getDefaultCnkFacetValueProvider()
	{
		return defaultCnkFacetValueProvider;
	}

	/**
	 * @param defaultCnkFacetValueProvider
	 *           the defaultCnkFacetValueProvider to set
	 */
	public void setDefaultCnkFacetValueProvider(final CnkFacetValueProvider defaultCnkFacetValueProvider)
	{
		this.defaultCnkFacetValueProvider = defaultCnkFacetValueProvider;
	}




}
