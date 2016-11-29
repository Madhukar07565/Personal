/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import com.cnk.travelogix.product.common.core.jalo.AccommodationBrand;
import com.cnk.travelogix.product.common.core.jalo.AccommodationChain;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.AccommodationProductDocument AccommodationProductDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccommodationProductDocument extends AbstractProductDocument
{
	/** Qualifier of the <code>AccommodationProductDocument.continent</code> attribute **/
	public static final String CONTINENT = "continent";
	/** Qualifier of the <code>AccommodationProductDocument.chain</code> attribute **/
	public static final String CHAIN = "chain";
	/** Qualifier of the <code>AccommodationProductDocument.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>AccommodationProductDocument.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>AccommodationProductDocument.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>AccommodationProductDocument.brand</code> attribute **/
	public static final String BRAND = "brand";
	/** Qualifier of the <code>AccommodationProductDocument.rating</code> attribute **/
	public static final String RATING = "rating";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductDocument.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CONTINENT, AttributeMode.INITIAL);
		tmp.put(CHAIN, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(BRAND, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.brand</code> attribute.
	 * @return the brand - Accommodation Product Brand
	 */
	public AccommodationBrand getBrand(final SessionContext ctx)
	{
		return (AccommodationBrand)getProperty( ctx, BRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.brand</code> attribute.
	 * @return the brand - Accommodation Product Brand
	 */
	public AccommodationBrand getBrand()
	{
		return getBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.brand</code> attribute. 
	 * @param value the brand - Accommodation Product Brand
	 */
	public void setBrand(final SessionContext ctx, final AccommodationBrand value)
	{
		setProperty(ctx, BRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.brand</code> attribute. 
	 * @param value the brand - Accommodation Product Brand
	 */
	public void setBrand(final AccommodationBrand value)
	{
		setBrand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.chain</code> attribute.
	 * @return the chain - Accommodation Product Chain
	 */
	public AccommodationChain getChain(final SessionContext ctx)
	{
		return (AccommodationChain)getProperty( ctx, CHAIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.chain</code> attribute.
	 * @return the chain - Accommodation Product Chain
	 */
	public AccommodationChain getChain()
	{
		return getChain( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.chain</code> attribute. 
	 * @param value the chain - Accommodation Product Chain
	 */
	public void setChain(final SessionContext ctx, final AccommodationChain value)
	{
		setProperty(ctx, CHAIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.chain</code> attribute. 
	 * @param value the chain - Accommodation Product Chain
	 */
	public void setChain(final AccommodationChain value)
	{
		setChain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.city</code> attribute.
	 * @return the city - Accommodation Product City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.city</code> attribute.
	 * @return the city - Accommodation Product City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.city</code> attribute. 
	 * @param value the city - Accommodation Product City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.city</code> attribute. 
	 * @param value the city - Accommodation Product City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.continent</code> attribute.
	 * @return the continent - Accommodation Product Continent
	 */
	public Continent getContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, CONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.continent</code> attribute.
	 * @return the continent - Accommodation Product Continent
	 */
	public Continent getContinent()
	{
		return getContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.continent</code> attribute. 
	 * @param value the continent - Accommodation Product Continent
	 */
	public void setContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, CONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.continent</code> attribute. 
	 * @param value the continent - Accommodation Product Continent
	 */
	public void setContinent(final Continent value)
	{
		setContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.country</code> attribute.
	 * @return the country - Accommodation Product Country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.country</code> attribute.
	 * @return the country - Accommodation Product Country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.country</code> attribute. 
	 * @param value the country - Accommodation Product Country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.country</code> attribute. 
	 * @param value the country - Accommodation Product Country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.productName</code> attribute.
	 * @return the productName - Accommodation  Product Name
	 */
	public Accommodation getProductName(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.productName</code> attribute.
	 * @return the productName - Accommodation  Product Name
	 */
	public Accommodation getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.productName</code> attribute. 
	 * @param value the productName - Accommodation  Product Name
	 */
	public void setProductName(final SessionContext ctx, final Accommodation value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.productName</code> attribute. 
	 * @param value the productName - Accommodation  Product Name
	 */
	public void setProductName(final Accommodation value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.rating</code> attribute.
	 * @return the rating - Accommodation Product Rating
	 */
	public EnumerationValue getRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationProductDocument.rating</code> attribute.
	 * @return the rating - Accommodation Product Rating
	 */
	public EnumerationValue getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.rating</code> attribute. 
	 * @param value the rating - Accommodation Product Rating
	 */
	public void setRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationProductDocument.rating</code> attribute. 
	 * @param value the rating - Accommodation Product Rating
	 */
	public void setRating(final EnumerationValue value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
}
