/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.FlightTimings FlightTimings}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightTimings extends GenericItem
{
	/** Qualifier of the <code>FlightTimings.includeorExclude</code> attribute **/
	public static final String INCLUDEOREXCLUDE = "includeorExclude";
	/** Qualifier of the <code>FlightTimings.flightTimeFrom</code> attribute **/
	public static final String FLIGHTTIMEFROM = "flightTimeFrom";
	/** Qualifier of the <code>FlightTimings.flightTimeTo</code> attribute **/
	public static final String FLIGHTTIMETO = "flightTimeTo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INCLUDEOREXCLUDE, AttributeMode.INITIAL);
		tmp.put(FLIGHTTIMEFROM, AttributeMode.INITIAL);
		tmp.put(FLIGHTTIMETO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimings.flightTimeFrom</code> attribute.
	 * @return the flightTimeFrom - Company Policy flight Time From
	 */
	public Date getFlightTimeFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FLIGHTTIMEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimings.flightTimeFrom</code> attribute.
	 * @return the flightTimeFrom - Company Policy flight Time From
	 */
	public Date getFlightTimeFrom()
	{
		return getFlightTimeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimings.flightTimeFrom</code> attribute. 
	 * @param value the flightTimeFrom - Company Policy flight Time From
	 */
	public void setFlightTimeFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FLIGHTTIMEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimings.flightTimeFrom</code> attribute. 
	 * @param value the flightTimeFrom - Company Policy flight Time From
	 */
	public void setFlightTimeFrom(final Date value)
	{
		setFlightTimeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimings.flightTimeTo</code> attribute.
	 * @return the flightTimeTo - Company Policy flight Time To
	 */
	public Date getFlightTimeTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FLIGHTTIMETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimings.flightTimeTo</code> attribute.
	 * @return the flightTimeTo - Company Policy flight Time To
	 */
	public Date getFlightTimeTo()
	{
		return getFlightTimeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimings.flightTimeTo</code> attribute. 
	 * @param value the flightTimeTo - Company Policy flight Time To
	 */
	public void setFlightTimeTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FLIGHTTIMETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimings.flightTimeTo</code> attribute. 
	 * @param value the flightTimeTo - Company Policy flight Time To
	 */
	public void setFlightTimeTo(final Date value)
	{
		setFlightTimeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimings.includeorExclude</code> attribute.
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public Boolean isIncludeorExclude(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDEOREXCLUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimings.includeorExclude</code> attribute.
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public Boolean isIncludeorExclude()
	{
		return isIncludeorExclude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimings.includeorExclude</code> attribute. 
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public boolean isIncludeorExcludeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIncludeorExclude( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimings.includeorExclude</code> attribute. 
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public boolean isIncludeorExcludeAsPrimitive()
	{
		return isIncludeorExcludeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimings.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDEOREXCLUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimings.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final Boolean value)
	{
		setIncludeorExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimings.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final SessionContext ctx, final boolean value)
	{
		setIncludeorExclude( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimings.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final boolean value)
	{
		setIncludeorExclude( getSession().getSessionContext(), value );
	}
	
}
