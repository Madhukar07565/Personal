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
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProductSubType;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.ActivitiesProductDocument ActivitiesProductDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivitiesProductDocument extends AbstractProductDocument
{
	/** Qualifier of the <code>ActivitiesProductDocument.continent</code> attribute **/
	public static final String CONTINENT = "continent";
	/** Qualifier of the <code>ActivitiesProductDocument.productNameSubType</code> attribute **/
	public static final String PRODUCTNAMESUBTYPE = "productNameSubType";
	/** Qualifier of the <code>ActivitiesProductDocument.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>ActivitiesProductDocument.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>ActivitiesProductDocument.city</code> attribute **/
	public static final String CITY = "city";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductDocument.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CONTINENT, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAMESUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesProductDocument.city</code> attribute.
	 * @return the city - Activities Product City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesProductDocument.city</code> attribute.
	 * @return the city - Activities Product City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesProductDocument.city</code> attribute. 
	 * @param value the city - Activities Product City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesProductDocument.city</code> attribute. 
	 * @param value the city - Activities Product City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesProductDocument.continent</code> attribute.
	 * @return the continent - Activities Product Continent
	 */
	public Continent getContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, CONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesProductDocument.continent</code> attribute.
	 * @return the continent - Activities Product Continent
	 */
	public Continent getContinent()
	{
		return getContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesProductDocument.continent</code> attribute. 
	 * @param value the continent - Activities Product Continent
	 */
	public void setContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, CONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesProductDocument.continent</code> attribute. 
	 * @param value the continent - Activities Product Continent
	 */
	public void setContinent(final Continent value)
	{
		setContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesProductDocument.country</code> attribute.
	 * @return the country - Activities Product Country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesProductDocument.country</code> attribute.
	 * @return the country - Activities Product Country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesProductDocument.country</code> attribute. 
	 * @param value the country - Activities Product Country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesProductDocument.country</code> attribute. 
	 * @param value the country - Activities Product Country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesProductDocument.productName</code> attribute.
	 * @return the productName - Activities  Product Name
	 */
	public ActivityProduct getProductName(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesProductDocument.productName</code> attribute.
	 * @return the productName - Activities  Product Name
	 */
	public ActivityProduct getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesProductDocument.productName</code> attribute. 
	 * @param value the productName - Activities  Product Name
	 */
	public void setProductName(final SessionContext ctx, final ActivityProduct value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesProductDocument.productName</code> attribute. 
	 * @param value the productName - Activities  Product Name
	 */
	public void setProductName(final ActivityProduct value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesProductDocument.productNameSubType</code> attribute.
	 * @return the productNameSubType - Activities Product ProductName Sub Type
	 */
	public ActivityProductSubType getProductNameSubType(final SessionContext ctx)
	{
		return (ActivityProductSubType)getProperty( ctx, PRODUCTNAMESUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesProductDocument.productNameSubType</code> attribute.
	 * @return the productNameSubType - Activities Product ProductName Sub Type
	 */
	public ActivityProductSubType getProductNameSubType()
	{
		return getProductNameSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesProductDocument.productNameSubType</code> attribute. 
	 * @param value the productNameSubType - Activities Product ProductName Sub Type
	 */
	public void setProductNameSubType(final SessionContext ctx, final ActivityProductSubType value)
	{
		setProperty(ctx, PRODUCTNAMESUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesProductDocument.productNameSubType</code> attribute. 
	 * @param value the productNameSubType - Activities Product ProductName Sub Type
	 */
	public void setProductNameSubType(final ActivityProductSubType value)
	{
		setProductNameSubType( getSession().getSessionContext(), value );
	}
	
}
