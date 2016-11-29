/**
 *
 */
package com.cnk.travelogix.common.facades.i18n.impl;

import de.hybris.platform.commercefacades.i18n.impl.DefaultI18NFacade;
import de.hybris.platform.commerceservices.util.AbstractComparator;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.core.cart.data.CityData;
import com.cnk.travelogix.common.facades.i18n.CnkI18NFacade;
import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;


/**
 * @author i317624
 *
 */
public class ExtI18NFacade extends DefaultI18NFacade implements CnkI18NFacade
{
	@Resource
	private Converter<CityModel, CityData> cityConverter;
	
	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.i18n.CnkI18NFacade#getCitiesForRegionIso(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public List<CityData> getCitiesForRegionIso(final String countryIso, final String regionIso)
	{
		try
		{
			final CountryModel countryModel = getCommonI18NService().getCountry(countryIso);
			if (countryModel != null && CollectionUtils.isNotEmpty(countryModel.getRegions()))
			{
				final RegionModel regionModel = getCommonI18NService().getRegion(countryModel, regionIso);
				if (regionModel != null)
				{
					final List<CityModel> cities = new ArrayList<CityModel>(regionModel.getCities());
					Collections.sort(cities, CityNameComparator.INSTANCE);
					return Converters.convertAll(cities, cityConverter);
				}
			}
			return Collections.emptyList();
		}
		catch (final UnknownIdentifierException e)
		{
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.i18n.CnkI18NFacade#getCitiesForRegionIso(java.lang.String)
	 */
	@Override
	public List<CityData> getCitiesForCountryIso(final String countryIso)
	{
		try
		{
			final CountryModel countryModel = getCommonI18NService().getCountry(countryIso);
			if (countryModel != null)
			{
				final List<CityModel> cities = new ArrayList<CityModel>(countryModel.getCities());
				Collections.sort(cities, CityNameComparator.INSTANCE);
				return Converters.convertAll(cities, cityConverter);
			}
			return Collections.emptyList();
		}
		catch (final UnknownIdentifierException e)
		{
			return null;
		}
	}

	private static class CityNameComparator extends AbstractComparator<CityModel>
	{
		public static final CityNameComparator INSTANCE = new CityNameComparator();

		@Override
		protected int compareInstances(final CityModel cityModel1, final CityModel cityModel2)
		{
			// Compare based on city name
			return compareValues(cityModel1.getName(), cityModel2.getName(), Boolean.TRUE.booleanValue());
		}
	}
}
