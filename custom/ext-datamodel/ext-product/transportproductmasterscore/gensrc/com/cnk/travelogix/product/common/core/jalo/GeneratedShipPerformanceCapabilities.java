/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ShipPerformanceCapabilities ShipPerformanceCapabilities}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShipPerformanceCapabilities extends GenericItem
{
	/** Qualifier of the <code>ShipPerformanceCapabilities.maxSpeed</code> attribute **/
	public static final String MAXSPEED = "maxSpeed";
	/** Qualifier of the <code>ShipPerformanceCapabilities.cruisingSpeed</code> attribute **/
	public static final String CRUISINGSPEED = "cruisingSpeed";
	/** Qualifier of the <code>ShipPerformanceCapabilities.range</code> attribute **/
	public static final String RANGE = "range";
	/** Qualifier of the <code>ShipPerformanceCapabilities.fuelCapacity</code> attribute **/
	public static final String FUELCAPACITY = "fuelCapacity";
	/** Qualifier of the <code>ShipPerformanceCapabilities.waterCapacity</code> attribute **/
	public static final String WATERCAPACITY = "waterCapacity";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MAXSPEED, AttributeMode.INITIAL);
		tmp.put(CRUISINGSPEED, AttributeMode.INITIAL);
		tmp.put(RANGE, AttributeMode.INITIAL);
		tmp.put(FUELCAPACITY, AttributeMode.INITIAL);
		tmp.put(WATERCAPACITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipPerformanceCapabilities.cruisingSpeed</code> attribute.
	 * @return the cruisingSpeed - Cruising Speed
	 */
	public String getCruisingSpeed(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CRUISINGSPEED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipPerformanceCapabilities.cruisingSpeed</code> attribute.
	 * @return the cruisingSpeed - Cruising Speed
	 */
	public String getCruisingSpeed()
	{
		return getCruisingSpeed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipPerformanceCapabilities.cruisingSpeed</code> attribute. 
	 * @param value the cruisingSpeed - Cruising Speed
	 */
	public void setCruisingSpeed(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CRUISINGSPEED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipPerformanceCapabilities.cruisingSpeed</code> attribute. 
	 * @param value the cruisingSpeed - Cruising Speed
	 */
	public void setCruisingSpeed(final String value)
	{
		setCruisingSpeed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipPerformanceCapabilities.fuelCapacity</code> attribute.
	 * @return the fuelCapacity - Fuel Capacity
	 */
	public String getFuelCapacity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FUELCAPACITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipPerformanceCapabilities.fuelCapacity</code> attribute.
	 * @return the fuelCapacity - Fuel Capacity
	 */
	public String getFuelCapacity()
	{
		return getFuelCapacity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipPerformanceCapabilities.fuelCapacity</code> attribute. 
	 * @param value the fuelCapacity - Fuel Capacity
	 */
	public void setFuelCapacity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FUELCAPACITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipPerformanceCapabilities.fuelCapacity</code> attribute. 
	 * @param value the fuelCapacity - Fuel Capacity
	 */
	public void setFuelCapacity(final String value)
	{
		setFuelCapacity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipPerformanceCapabilities.maxSpeed</code> attribute.
	 * @return the maxSpeed - max Speed
	 */
	public String getMaxSpeed(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MAXSPEED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipPerformanceCapabilities.maxSpeed</code> attribute.
	 * @return the maxSpeed - max Speed
	 */
	public String getMaxSpeed()
	{
		return getMaxSpeed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipPerformanceCapabilities.maxSpeed</code> attribute. 
	 * @param value the maxSpeed - max Speed
	 */
	public void setMaxSpeed(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MAXSPEED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipPerformanceCapabilities.maxSpeed</code> attribute. 
	 * @param value the maxSpeed - max Speed
	 */
	public void setMaxSpeed(final String value)
	{
		setMaxSpeed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipPerformanceCapabilities.range</code> attribute.
	 * @return the range - Range
	 */
	public String getRange(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipPerformanceCapabilities.range</code> attribute.
	 * @return the range - Range
	 */
	public String getRange()
	{
		return getRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipPerformanceCapabilities.range</code> attribute. 
	 * @param value the range - Range
	 */
	public void setRange(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipPerformanceCapabilities.range</code> attribute. 
	 * @param value the range - Range
	 */
	public void setRange(final String value)
	{
		setRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipPerformanceCapabilities.waterCapacity</code> attribute.
	 * @return the waterCapacity - Water Capacity
	 */
	public String getWaterCapacity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WATERCAPACITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipPerformanceCapabilities.waterCapacity</code> attribute.
	 * @return the waterCapacity - Water Capacity
	 */
	public String getWaterCapacity()
	{
		return getWaterCapacity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipPerformanceCapabilities.waterCapacity</code> attribute. 
	 * @param value the waterCapacity - Water Capacity
	 */
	public void setWaterCapacity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WATERCAPACITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipPerformanceCapabilities.waterCapacity</code> attribute. 
	 * @param value the waterCapacity - Water Capacity
	 */
	public void setWaterCapacity(final String value)
	{
		setWaterCapacity( getSession().getSessionContext(), value );
	}
	
}
