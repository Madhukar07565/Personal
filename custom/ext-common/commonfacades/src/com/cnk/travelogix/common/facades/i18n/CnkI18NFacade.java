/**
 *
 */
package com.cnk.travelogix.common.facades.i18n;

import de.hybris.platform.commercefacades.i18n.I18NFacade;

import java.util.List;

import com.cnk.travelogix.common.core.cart.data.CityData;



/**
 * @author i317624
 *
 */
public interface CnkI18NFacade extends I18NFacade
{
	List<CityData> getCitiesForRegionIso(final String countryIso, final String regionIso);
	
	List<CityData> getCitiesForCountryIso(final String countryIso);
}
