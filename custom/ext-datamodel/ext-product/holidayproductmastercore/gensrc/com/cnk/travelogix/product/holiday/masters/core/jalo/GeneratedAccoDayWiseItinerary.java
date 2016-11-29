/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.Area;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Location;
import com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.AccoDayWiseItinerary AccoDayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoDayWiseItinerary extends AbstractDayWiseItinerary
{
	/** Qualifier of the <code>AccoDayWiseItinerary.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>AccoDayWiseItinerary.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>AccoDayWiseItinerary.area</code> attribute **/
	public static final String AREA = "area";
	/** Qualifier of the <code>AccoDayWiseItinerary.extensionNights</code> attribute **/
	public static final String EXTENSIONNIGHTS = "extensionNights";
	/** Qualifier of the <code>AccoDayWiseItinerary.availDays</code> attribute **/
	public static final String AVAILDAYS = "availDays";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDayWiseItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		tmp.put(AREA, AttributeMode.INITIAL);
		tmp.put(EXTENSIONNIGHTS, AttributeMode.INITIAL);
		tmp.put(AVAILDAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.area</code> attribute.
	 * @return the area - Area
	 */
	public Area getArea(final SessionContext ctx)
	{
		return (Area)getProperty( ctx, AREA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.area</code> attribute.
	 * @return the area - Area
	 */
	public Area getArea()
	{
		return getArea( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.area</code> attribute. 
	 * @param value the area - Area
	 */
	public void setArea(final SessionContext ctx, final Area value)
	{
		setProperty(ctx, AREA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.area</code> attribute. 
	 * @param value the area - Area
	 */
	public void setArea(final Area value)
	{
		setArea( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.availDays</code> attribute.
	 * @return the availDays - Available days
	 */
	public Integer getAvailDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AVAILDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.availDays</code> attribute.
	 * @return the availDays - Available days
	 */
	public Integer getAvailDays()
	{
		return getAvailDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.availDays</code> attribute. 
	 * @return the availDays - Available days
	 */
	public int getAvailDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAvailDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.availDays</code> attribute. 
	 * @return the availDays - Available days
	 */
	public int getAvailDaysAsPrimitive()
	{
		return getAvailDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AVAILDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final Integer value)
	{
		setAvailDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final SessionContext ctx, final int value)
	{
		setAvailDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final int value)
	{
		setAvailDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.extensionNights</code> attribute.
	 * @return the extensionNights - Extension nights
	 */
	public Boolean isExtensionNights(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EXTENSIONNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.extensionNights</code> attribute.
	 * @return the extensionNights - Extension nights
	 */
	public Boolean isExtensionNights()
	{
		return isExtensionNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.extensionNights</code> attribute. 
	 * @return the extensionNights - Extension nights
	 */
	public boolean isExtensionNightsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isExtensionNights( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.extensionNights</code> attribute. 
	 * @return the extensionNights - Extension nights
	 */
	public boolean isExtensionNightsAsPrimitive()
	{
		return isExtensionNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.extensionNights</code> attribute. 
	 * @param value the extensionNights - Extension nights
	 */
	public void setExtensionNights(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EXTENSIONNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.extensionNights</code> attribute. 
	 * @param value the extensionNights - Extension nights
	 */
	public void setExtensionNights(final Boolean value)
	{
		setExtensionNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.extensionNights</code> attribute. 
	 * @param value the extensionNights - Extension nights
	 */
	public void setExtensionNights(final SessionContext ctx, final boolean value)
	{
		setExtensionNights( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.extensionNights</code> attribute. 
	 * @param value the extensionNights - Extension nights
	 */
	public void setExtensionNights(final boolean value)
	{
		setExtensionNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.location</code> attribute.
	 * @return the location - Location
	 */
	public Location getLocation(final SessionContext ctx)
	{
		return (Location)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.location</code> attribute.
	 * @return the location - Location
	 */
	public Location getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.location</code> attribute. 
	 * @param value the location - Location
	 */
	public void setLocation(final SessionContext ctx, final Location value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.location</code> attribute. 
	 * @param value the location - Location
	 */
	public void setLocation(final Location value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.productName</code> attribute.
	 * @return the productName - Product name
	 */
	public Accommodation getProductName(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDayWiseItinerary.productName</code> attribute.
	 * @return the productName - Product name
	 */
	public Accommodation getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.productName</code> attribute. 
	 * @param value the productName - Product name
	 */
	public void setProductName(final SessionContext ctx, final Accommodation value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDayWiseItinerary.productName</code> attribute. 
	 * @param value the productName - Product name
	 */
	public void setProductName(final Accommodation value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
}
