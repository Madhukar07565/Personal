/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.Prices;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.OtherDayWiseItinerary OtherDayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOtherDayWiseItinerary extends AbstractDayWiseItinerary
{
	/** Qualifier of the <code>OtherDayWiseItinerary.service</code> attribute **/
	public static final String SERVICE = "service";
	/** Qualifier of the <code>OtherDayWiseItinerary.availDays</code> attribute **/
	public static final String AVAILDAYS = "availDays";
	/** Qualifier of the <code>OtherDayWiseItinerary.quantity</code> attribute **/
	public static final String QUANTITY = "quantity";
	/** Qualifier of the <code>OtherDayWiseItinerary.valueAdded</code> attribute **/
	public static final String VALUEADDED = "valueAdded";
	/** Qualifier of the <code>OtherDayWiseItinerary.numberOfItems</code> attribute **/
	public static final String NUMBEROFITEMS = "numberOfItems";
	/** Qualifier of the <code>OtherDayWiseItinerary.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>OtherDayWiseItinerary.prices</code> attribute **/
	public static final String PRICES = "prices";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDayWiseItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SERVICE, AttributeMode.INITIAL);
		tmp.put(AVAILDAYS, AttributeMode.INITIAL);
		tmp.put(QUANTITY, AttributeMode.INITIAL);
		tmp.put(VALUEADDED, AttributeMode.INITIAL);
		tmp.put(NUMBEROFITEMS, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(PRICES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.availDays</code> attribute.
	 * @return the availDays - Available days
	 */
	public Integer getAvailDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AVAILDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.availDays</code> attribute.
	 * @return the availDays - Available days
	 */
	public Integer getAvailDays()
	{
		return getAvailDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.availDays</code> attribute. 
	 * @return the availDays - Available days
	 */
	public int getAvailDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAvailDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.availDays</code> attribute. 
	 * @return the availDays - Available days
	 */
	public int getAvailDaysAsPrimitive()
	{
		return getAvailDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AVAILDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final Integer value)
	{
		setAvailDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final SessionContext ctx, final int value)
	{
		setAvailDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final int value)
	{
		setAvailDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.numberOfItems</code> attribute.
	 * @return the numberOfItems - Number of items
	 */
	public Integer getNumberOfItems(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFITEMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.numberOfItems</code> attribute.
	 * @return the numberOfItems - Number of items
	 */
	public Integer getNumberOfItems()
	{
		return getNumberOfItems( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.numberOfItems</code> attribute. 
	 * @return the numberOfItems - Number of items
	 */
	public int getNumberOfItemsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfItems( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.numberOfItems</code> attribute. 
	 * @return the numberOfItems - Number of items
	 */
	public int getNumberOfItemsAsPrimitive()
	{
		return getNumberOfItemsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.numberOfItems</code> attribute. 
	 * @param value the numberOfItems - Number of items
	 */
	public void setNumberOfItems(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFITEMS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.numberOfItems</code> attribute. 
	 * @param value the numberOfItems - Number of items
	 */
	public void setNumberOfItems(final Integer value)
	{
		setNumberOfItems( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.numberOfItems</code> attribute. 
	 * @param value the numberOfItems - Number of items
	 */
	public void setNumberOfItems(final SessionContext ctx, final int value)
	{
		setNumberOfItems( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.numberOfItems</code> attribute. 
	 * @param value the numberOfItems - Number of items
	 */
	public void setNumberOfItems(final int value)
	{
		setNumberOfItems( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.prices</code> attribute.
	 * @return the prices - Prices
	 */
	public Prices getPrices(final SessionContext ctx)
	{
		return (Prices)getProperty( ctx, PRICES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.prices</code> attribute.
	 * @return the prices - Prices
	 */
	public Prices getPrices()
	{
		return getPrices( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.prices</code> attribute. 
	 * @param value the prices - Prices
	 */
	public void setPrices(final SessionContext ctx, final Prices value)
	{
		setProperty(ctx, PRICES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.prices</code> attribute. 
	 * @param value the prices - Prices
	 */
	public void setPrices(final Prices value)
	{
		setPrices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.quantity</code> attribute.
	 * @return the quantity - Quantity
	 */
	public Long getQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.quantity</code> attribute.
	 * @return the quantity - Quantity
	 */
	public Long getQuantity()
	{
		return getQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.quantity</code> attribute. 
	 * @return the quantity - Quantity
	 */
	public long getQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.quantity</code> attribute. 
	 * @return the quantity - Quantity
	 */
	public long getQuantityAsPrimitive()
	{
		return getQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.quantity</code> attribute. 
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, QUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.quantity</code> attribute. 
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final Long value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.quantity</code> attribute. 
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final SessionContext ctx, final long value)
	{
		setQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.quantity</code> attribute. 
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final long value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.service</code> attribute.
	 * @return the service - Service
	 */
	public Product getService(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, SERVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.service</code> attribute.
	 * @return the service - Service
	 */
	public Product getService()
	{
		return getService( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.service</code> attribute. 
	 * @param value the service - Service
	 */
	public void setService(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, SERVICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.service</code> attribute. 
	 * @param value the service - Service
	 */
	public void setService(final Product value)
	{
		setService( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.valueAdded</code> attribute.
	 * @return the valueAdded - Value added
	 */
	public Boolean isValueAdded(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, VALUEADDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.valueAdded</code> attribute.
	 * @return the valueAdded - Value added
	 */
	public Boolean isValueAdded()
	{
		return isValueAdded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.valueAdded</code> attribute. 
	 * @return the valueAdded - Value added
	 */
	public boolean isValueAddedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isValueAdded( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherDayWiseItinerary.valueAdded</code> attribute. 
	 * @return the valueAdded - Value added
	 */
	public boolean isValueAddedAsPrimitive()
	{
		return isValueAddedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.valueAdded</code> attribute. 
	 * @param value the valueAdded - Value added
	 */
	public void setValueAdded(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, VALUEADDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.valueAdded</code> attribute. 
	 * @param value the valueAdded - Value added
	 */
	public void setValueAdded(final Boolean value)
	{
		setValueAdded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.valueAdded</code> attribute. 
	 * @param value the valueAdded - Value added
	 */
	public void setValueAdded(final SessionContext ctx, final boolean value)
	{
		setValueAdded( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherDayWiseItinerary.valueAdded</code> attribute. 
	 * @param value the valueAdded - Value added
	 */
	public void setValueAdded(final boolean value)
	{
		setValueAdded( getSession().getSessionContext(), value );
	}
	
}
