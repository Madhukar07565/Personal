/**
 * 
 */
package com.cnk.travelogix.b2c.facades.customer.converters.populator;

import de.hybris.platform.commercefacades.user.converters.populator.AddressReversePopulator;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.user.AddressModel;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;

/**
 * @author i317624
 *
 */
public class TravAddressReversePopulator extends AddressReversePopulator
{
	@Override
	public void populate(final AddressData source, final AddressModel target)
	{
		super.populate(source, target);
		populateCity(source, target);
	}

	private void populateCity(final AddressData source, final AddressModel target)
	{
		final CountryModel countryModel = target.getCountry();
		final String cityIsoCode = source.getCity().getCityIsoCode();

		if (countryModel == null || cityIsoCode == null)
		{
			return;
		}

		for (final CityModel cityModel : countryModel.getCities())
		{
			if (cityIsoCode.equalsIgnoreCase(cityModel.getIsocode()))
			{
				target.setCity(cityModel);
				break;
			}
		}
	}
}
