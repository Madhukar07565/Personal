/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.product.jalo;

import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.dump.jalo.AbstractSupplierDumpItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.product.jalo.SupplierProduct SupplierProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierProduct extends AbstractSupplierDumpItem
{
	/** Qualifier of the <code>SupplierProduct.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>SupplierProduct.telephone</code> attribute **/
	public static final String TELEPHONE = "telephone";
	/** Qualifier of the <code>SupplierProduct.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>SupplierProduct.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>SupplierProduct.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>SupplierProduct.firstBookingEnabled</code> attribute **/
	public static final String FIRSTBOOKINGENABLED = "firstBookingEnabled";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierDumpItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(TELEPHONE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		tmp.put(FIRSTBOOKINGENABLED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.address</code> attribute.
	 * @return the address
	 */
	public String getAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.address</code> attribute.
	 * @return the address
	 */
	public String getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final String value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.firstBookingEnabled</code> attribute.
	 * @return the firstBookingEnabled
	 */
	public Boolean isFirstBookingEnabled(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FIRSTBOOKINGENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.firstBookingEnabled</code> attribute.
	 * @return the firstBookingEnabled
	 */
	public Boolean isFirstBookingEnabled()
	{
		return isFirstBookingEnabled( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.firstBookingEnabled</code> attribute. 
	 * @return the firstBookingEnabled
	 */
	public boolean isFirstBookingEnabledAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFirstBookingEnabled( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.firstBookingEnabled</code> attribute. 
	 * @return the firstBookingEnabled
	 */
	public boolean isFirstBookingEnabledAsPrimitive()
	{
		return isFirstBookingEnabledAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.firstBookingEnabled</code> attribute. 
	 * @param value the firstBookingEnabled
	 */
	public void setFirstBookingEnabled(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FIRSTBOOKINGENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.firstBookingEnabled</code> attribute. 
	 * @param value the firstBookingEnabled
	 */
	public void setFirstBookingEnabled(final Boolean value)
	{
		setFirstBookingEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.firstBookingEnabled</code> attribute. 
	 * @param value the firstBookingEnabled
	 */
	public void setFirstBookingEnabled(final SessionContext ctx, final boolean value)
	{
		setFirstBookingEnabled( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.firstBookingEnabled</code> attribute. 
	 * @param value the firstBookingEnabled
	 */
	public void setFirstBookingEnabled(final boolean value)
	{
		setFirstBookingEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.location</code> attribute.
	 * @return the location
	 */
	public String getLocation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.location</code> attribute.
	 * @return the location
	 */
	public String getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.location</code> attribute. 
	 * @param value the location
	 */
	public void setLocation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.location</code> attribute. 
	 * @param value the location
	 */
	public void setLocation(final String value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.telephone</code> attribute.
	 * @return the telephone
	 */
	public String getTelephone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TELEPHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProduct.telephone</code> attribute.
	 * @return the telephone
	 */
	public String getTelephone()
	{
		return getTelephone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.telephone</code> attribute. 
	 * @param value the telephone
	 */
	public void setTelephone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TELEPHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProduct.telephone</code> attribute. 
	 * @param value the telephone
	 */
	public void setTelephone(final String value)
	{
		setTelephone( getSession().getSessionContext(), value );
	}
	
}
