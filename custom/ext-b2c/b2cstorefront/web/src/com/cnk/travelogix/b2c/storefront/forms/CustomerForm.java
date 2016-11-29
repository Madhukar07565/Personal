/**
 * 
 */
package com.cnk.travelogix.b2c.storefront.forms;

import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import de.hybris.platform.commercefacades.user.data.CountryData;

import java.util.List;

/**
 * @author i054410
 *
 */
public class CustomerForm implements MetaDataGenerator
{
	private List<TravellerForm> travellers;
	private CountryData defaultWebSite;
	private LanguageData language;
	private CurrencyData currency;
	private Boolean subscribe;

	/**
	 * @return the travellers
	 */
	public List<TravellerForm> getTravellers()
	{
		return travellers;
	}

	/**
	 * @param travellers the travellers to set
	 */
	public void setTravellers(List<TravellerForm> travellers)
	{
		this.travellers = travellers;
	}

	/**
	 * @return the defaultWebSite
	 */
	public CountryData getDefaultWebSite()
	{
		return defaultWebSite;
	}

	/**
	 * @param defaultWebSite the defaultWebSite to set
	 */
	public void setDefaultWebSite(CountryData defaultWebSite)
	{
		this.defaultWebSite = defaultWebSite;
	}

	/**
	 * @return the language
	 */
	public LanguageData getLanguage()
	{
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(LanguageData language)
	{
		this.language = language;
	}

	/**
	 * @return the currency
	 */
	public CurrencyData getCurrency()
	{
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(CurrencyData currency)
	{
		this.currency = currency;
	}

	/**
	 * @return the subscribe
	 */
	public Boolean getSubscribe()
	{
		return subscribe;
	}

	/**
	 * @param subscribe the subscribe to set
	 */
	public void setSubscribe(Boolean subscribe)
	{
		this.subscribe = subscribe;
	}

}
