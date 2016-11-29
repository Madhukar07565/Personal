/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.FlightNumber FlightNumber}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightNumber extends GenericItem
{
	/** Qualifier of the <code>FlightNumber.rangeFrom</code> attribute **/
	public static final String RANGEFROM = "rangeFrom";
	/** Qualifier of the <code>FlightNumber.rangeTo</code> attribute **/
	public static final String RANGETO = "rangeTo";
	/** Qualifier of the <code>FlightNumber.includeorExclude</code> attribute **/
	public static final String INCLUDEOREXCLUDE = "includeorExclude";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RANGEFROM, AttributeMode.INITIAL);
		tmp.put(RANGETO, AttributeMode.INITIAL);
		tmp.put(INCLUDEOREXCLUDE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumber.includeorExclude</code> attribute.
	 * @return the includeorExclude - Flight Number Exclude Include
	 */
	public Boolean isIncludeorExclude(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDEOREXCLUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumber.includeorExclude</code> attribute.
	 * @return the includeorExclude - Flight Number Exclude Include
	 */
	public Boolean isIncludeorExclude()
	{
		return isIncludeorExclude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumber.includeorExclude</code> attribute. 
	 * @return the includeorExclude - Flight Number Exclude Include
	 */
	public boolean isIncludeorExcludeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIncludeorExclude( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumber.includeorExclude</code> attribute. 
	 * @return the includeorExclude - Flight Number Exclude Include
	 */
	public boolean isIncludeorExcludeAsPrimitive()
	{
		return isIncludeorExcludeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumber.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Flight Number Exclude Include
	 */
	public void setIncludeorExclude(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDEOREXCLUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumber.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Flight Number Exclude Include
	 */
	public void setIncludeorExclude(final Boolean value)
	{
		setIncludeorExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumber.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Flight Number Exclude Include
	 */
	public void setIncludeorExclude(final SessionContext ctx, final boolean value)
	{
		setIncludeorExclude( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumber.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Flight Number Exclude Include
	 */
	public void setIncludeorExclude(final boolean value)
	{
		setIncludeorExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumber.rangeFrom</code> attribute.
	 * @return the rangeFrom
	 */
	public String getRangeFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RANGEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumber.rangeFrom</code> attribute.
	 * @return the rangeFrom
	 */
	public String getRangeFrom()
	{
		return getRangeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumber.rangeFrom</code> attribute. 
	 * @param value the rangeFrom
	 */
	public void setRangeFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RANGEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumber.rangeFrom</code> attribute. 
	 * @param value the rangeFrom
	 */
	public void setRangeFrom(final String value)
	{
		setRangeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumber.rangeTo</code> attribute.
	 * @return the rangeTo
	 */
	public String getRangeTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RANGETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumber.rangeTo</code> attribute.
	 * @return the rangeTo
	 */
	public String getRangeTo()
	{
		return getRangeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumber.rangeTo</code> attribute. 
	 * @param value the rangeTo
	 */
	public void setRangeTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RANGETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumber.rangeTo</code> attribute. 
	 * @param value the rangeTo
	 */
	public void setRangeTo(final String value)
	{
		setRangeTo( getSession().getSessionContext(), value );
	}
	
}
