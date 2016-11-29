/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.city.jalo;

import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.dump.jalo.AbstractSupplierDumpItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.city.jalo.SupplierCity SupplierCity}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierCity extends AbstractSupplierDumpItem
{
	/** Qualifier of the <code>SupplierCity.stateCode</code> attribute **/
	public static final String STATECODE = "stateCode";
	/** Qualifier of the <code>SupplierCity.stateName</code> attribute **/
	public static final String STATENAME = "stateName";
	/** Qualifier of the <code>SupplierCity.countryCode</code> attribute **/
	public static final String COUNTRYCODE = "countryCode";
	/** Qualifier of the <code>SupplierCity.countryName</code> attribute **/
	public static final String COUNTRYNAME = "countryName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierDumpItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STATECODE, AttributeMode.INITIAL);
		tmp.put(STATENAME, AttributeMode.INITIAL);
		tmp.put(COUNTRYCODE, AttributeMode.INITIAL);
		tmp.put(COUNTRYNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCity.countryCode</code> attribute.
	 * @return the countryCode
	 */
	public String getCountryCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCity.countryCode</code> attribute.
	 * @return the countryCode
	 */
	public String getCountryCode()
	{
		return getCountryCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCity.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCity.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final String value)
	{
		setCountryCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCity.countryName</code> attribute.
	 * @return the countryName
	 */
	public String getCountryName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCity.countryName</code> attribute.
	 * @return the countryName
	 */
	public String getCountryName()
	{
		return getCountryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCity.countryName</code> attribute. 
	 * @param value the countryName
	 */
	public void setCountryName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCity.countryName</code> attribute. 
	 * @param value the countryName
	 */
	public void setCountryName(final String value)
	{
		setCountryName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCity.stateCode</code> attribute.
	 * @return the stateCode
	 */
	public String getStateCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCity.stateCode</code> attribute.
	 * @return the stateCode
	 */
	public String getStateCode()
	{
		return getStateCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCity.stateCode</code> attribute. 
	 * @param value the stateCode
	 */
	public void setStateCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCity.stateCode</code> attribute. 
	 * @param value the stateCode
	 */
	public void setStateCode(final String value)
	{
		setStateCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCity.stateName</code> attribute.
	 * @return the stateName
	 */
	public String getStateName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCity.stateName</code> attribute.
	 * @return the stateName
	 */
	public String getStateName()
	{
		return getStateName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCity.stateName</code> attribute. 
	 * @param value the stateName
	 */
	public void setStateName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCity.stateName</code> attribute. 
	 * @param value the stateName
	 */
	public void setStateName(final String value)
	{
		setStateName( getSession().getSessionContext(), value );
	}
	
}
