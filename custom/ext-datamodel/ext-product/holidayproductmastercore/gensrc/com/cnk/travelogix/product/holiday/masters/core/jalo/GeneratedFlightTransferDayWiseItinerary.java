/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.iata.jalo.Airport;
import com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.FlightTransferDayWiseItinerary FlightTransferDayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightTransferDayWiseItinerary extends AbstractDayWiseItinerary
{
	/** Qualifier of the <code>FlightTransferDayWiseItinerary.fromCity</code> attribute **/
	public static final String FROMCITY = "fromCity";
	/** Qualifier of the <code>FlightTransferDayWiseItinerary.toCity</code> attribute **/
	public static final String TOCITY = "toCity";
	/** Qualifier of the <code>FlightTransferDayWiseItinerary.availDays</code> attribute **/
	public static final String AVAILDAYS = "availDays";
	/** Qualifier of the <code>FlightTransferDayWiseItinerary.returnDay</code> attribute **/
	public static final String RETURNDAY = "returnDay";
	/** Qualifier of the <code>FlightTransferDayWiseItinerary.returnSequence</code> attribute **/
	public static final String RETURNSEQUENCE = "returnSequence";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDayWiseItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FROMCITY, AttributeMode.INITIAL);
		tmp.put(TOCITY, AttributeMode.INITIAL);
		tmp.put(AVAILDAYS, AttributeMode.INITIAL);
		tmp.put(RETURNDAY, AttributeMode.INITIAL);
		tmp.put(RETURNSEQUENCE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.availDays</code> attribute.
	 * @return the availDays - Available days
	 */
	public Integer getAvailDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AVAILDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.availDays</code> attribute.
	 * @return the availDays - Available days
	 */
	public Integer getAvailDays()
	{
		return getAvailDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.availDays</code> attribute. 
	 * @return the availDays - Available days
	 */
	public int getAvailDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAvailDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.availDays</code> attribute. 
	 * @return the availDays - Available days
	 */
	public int getAvailDaysAsPrimitive()
	{
		return getAvailDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AVAILDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final Integer value)
	{
		setAvailDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final SessionContext ctx, final int value)
	{
		setAvailDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final int value)
	{
		setAvailDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.fromCity</code> attribute.
	 * @return the fromCity - From city
	 */
	public Airport getFromCity(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, FROMCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.fromCity</code> attribute.
	 * @return the fromCity - From city
	 */
	public Airport getFromCity()
	{
		return getFromCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.fromCity</code> attribute. 
	 * @param value the fromCity - From city
	 */
	public void setFromCity(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, FROMCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.fromCity</code> attribute. 
	 * @param value the fromCity - From city
	 */
	public void setFromCity(final Airport value)
	{
		setFromCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.returnDay</code> attribute.
	 * @return the returnDay - Return day
	 */
	public Integer getReturnDay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETURNDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.returnDay</code> attribute.
	 * @return the returnDay - Return day
	 */
	public Integer getReturnDay()
	{
		return getReturnDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @return the returnDay - Return day
	 */
	public int getReturnDayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getReturnDay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @return the returnDay - Return day
	 */
	public int getReturnDayAsPrimitive()
	{
		return getReturnDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETURNDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final Integer value)
	{
		setReturnDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final SessionContext ctx, final int value)
	{
		setReturnDay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final int value)
	{
		setReturnDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.returnSequence</code> attribute.
	 * @return the returnSequence - Return sequence
	 */
	public Integer getReturnSequence(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETURNSEQUENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.returnSequence</code> attribute.
	 * @return the returnSequence - Return sequence
	 */
	public Integer getReturnSequence()
	{
		return getReturnSequence( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @return the returnSequence - Return sequence
	 */
	public int getReturnSequenceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getReturnSequence( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @return the returnSequence - Return sequence
	 */
	public int getReturnSequenceAsPrimitive()
	{
		return getReturnSequenceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return sequence
	 */
	public void setReturnSequence(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETURNSEQUENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return sequence
	 */
	public void setReturnSequence(final Integer value)
	{
		setReturnSequence( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return sequence
	 */
	public void setReturnSequence(final SessionContext ctx, final int value)
	{
		setReturnSequence( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return sequence
	 */
	public void setReturnSequence(final int value)
	{
		setReturnSequence( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.toCity</code> attribute.
	 * @return the toCity - To city
	 */
	public Airport getToCity(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, TOCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTransferDayWiseItinerary.toCity</code> attribute.
	 * @return the toCity - To city
	 */
	public Airport getToCity()
	{
		return getToCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.toCity</code> attribute. 
	 * @param value the toCity - To city
	 */
	public void setToCity(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, TOCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTransferDayWiseItinerary.toCity</code> attribute. 
	 * @param value the toCity - To city
	 */
	public void setToCity(final Airport value)
	{
		setToCity( getSession().getSessionContext(), value );
	}
	
}
