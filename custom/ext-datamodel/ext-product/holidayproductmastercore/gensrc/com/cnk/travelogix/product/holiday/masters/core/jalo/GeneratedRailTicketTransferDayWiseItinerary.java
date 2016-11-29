/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.RailTransferDayWiseItinerary;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.RailTicketTransferDayWiseItinerary RailTicketTransferDayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRailTicketTransferDayWiseItinerary extends RailTransferDayWiseItinerary
{
	/** Qualifier of the <code>RailTicketTransferDayWiseItinerary.fromCity</code> attribute **/
	public static final String FROMCITY = "fromCity";
	/** Qualifier of the <code>RailTicketTransferDayWiseItinerary.toCity</code> attribute **/
	public static final String TOCITY = "toCity";
	/** Qualifier of the <code>RailTicketTransferDayWiseItinerary.reservationRequired</code> attribute **/
	public static final String RESERVATIONREQUIRED = "reservationRequired";
	/** Qualifier of the <code>RailTicketTransferDayWiseItinerary.overNight</code> attribute **/
	public static final String OVERNIGHT = "overNight";
	/** Qualifier of the <code>RailTicketTransferDayWiseItinerary.returnDay</code> attribute **/
	public static final String RETURNDAY = "returnDay";
	/** Qualifier of the <code>RailTicketTransferDayWiseItinerary.returnSequence</code> attribute **/
	public static final String RETURNSEQUENCE = "returnSequence";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(RailTransferDayWiseItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FROMCITY, AttributeMode.INITIAL);
		tmp.put(TOCITY, AttributeMode.INITIAL);
		tmp.put(RESERVATIONREQUIRED, AttributeMode.INITIAL);
		tmp.put(OVERNIGHT, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.fromCity</code> attribute.
	 * @return the fromCity - From city
	 */
	public City getFromCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, FROMCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.fromCity</code> attribute.
	 * @return the fromCity - From city
	 */
	public City getFromCity()
	{
		return getFromCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.fromCity</code> attribute. 
	 * @param value the fromCity - From city
	 */
	public void setFromCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, FROMCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.fromCity</code> attribute. 
	 * @param value the fromCity - From city
	 */
	public void setFromCity(final City value)
	{
		setFromCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.overNight</code> attribute.
	 * @return the overNight - Is over night
	 */
	public Boolean isOverNight(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OVERNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.overNight</code> attribute.
	 * @return the overNight - Is over night
	 */
	public Boolean isOverNight()
	{
		return isOverNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.overNight</code> attribute. 
	 * @return the overNight - Is over night
	 */
	public boolean isOverNightAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOverNight( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.overNight</code> attribute. 
	 * @return the overNight - Is over night
	 */
	public boolean isOverNightAsPrimitive()
	{
		return isOverNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.overNight</code> attribute. 
	 * @param value the overNight - Is over night
	 */
	public void setOverNight(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OVERNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.overNight</code> attribute. 
	 * @param value the overNight - Is over night
	 */
	public void setOverNight(final Boolean value)
	{
		setOverNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.overNight</code> attribute. 
	 * @param value the overNight - Is over night
	 */
	public void setOverNight(final SessionContext ctx, final boolean value)
	{
		setOverNight( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.overNight</code> attribute. 
	 * @param value the overNight - Is over night
	 */
	public void setOverNight(final boolean value)
	{
		setOverNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.reservationRequired</code> attribute.
	 * @return the reservationRequired - reservationRequired
	 */
	public Boolean isReservationRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RESERVATIONREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.reservationRequired</code> attribute.
	 * @return the reservationRequired - reservationRequired
	 */
	public Boolean isReservationRequired()
	{
		return isReservationRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.reservationRequired</code> attribute. 
	 * @return the reservationRequired - reservationRequired
	 */
	public boolean isReservationRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReservationRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.reservationRequired</code> attribute. 
	 * @return the reservationRequired - reservationRequired
	 */
	public boolean isReservationRequiredAsPrimitive()
	{
		return isReservationRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.reservationRequired</code> attribute. 
	 * @param value the reservationRequired - reservationRequired
	 */
	public void setReservationRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RESERVATIONREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.reservationRequired</code> attribute. 
	 * @param value the reservationRequired - reservationRequired
	 */
	public void setReservationRequired(final Boolean value)
	{
		setReservationRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.reservationRequired</code> attribute. 
	 * @param value the reservationRequired - reservationRequired
	 */
	public void setReservationRequired(final SessionContext ctx, final boolean value)
	{
		setReservationRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.reservationRequired</code> attribute. 
	 * @param value the reservationRequired - reservationRequired
	 */
	public void setReservationRequired(final boolean value)
	{
		setReservationRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.returnDay</code> attribute.
	 * @return the returnDay - Return day
	 */
	public Integer getReturnDay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETURNDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.returnDay</code> attribute.
	 * @return the returnDay - Return day
	 */
	public Integer getReturnDay()
	{
		return getReturnDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @return the returnDay - Return day
	 */
	public int getReturnDayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getReturnDay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @return the returnDay - Return day
	 */
	public int getReturnDayAsPrimitive()
	{
		return getReturnDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETURNDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final Integer value)
	{
		setReturnDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final SessionContext ctx, final int value)
	{
		setReturnDay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final int value)
	{
		setReturnDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.returnSequence</code> attribute.
	 * @return the returnSequence - Return sequence
	 */
	public Integer getReturnSequence(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETURNSEQUENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.returnSequence</code> attribute.
	 * @return the returnSequence - Return sequence
	 */
	public Integer getReturnSequence()
	{
		return getReturnSequence( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @return the returnSequence - Return sequence
	 */
	public int getReturnSequenceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getReturnSequence( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @return the returnSequence - Return sequence
	 */
	public int getReturnSequenceAsPrimitive()
	{
		return getReturnSequenceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return sequence
	 */
	public void setReturnSequence(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETURNSEQUENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return sequence
	 */
	public void setReturnSequence(final Integer value)
	{
		setReturnSequence( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return sequence
	 */
	public void setReturnSequence(final SessionContext ctx, final int value)
	{
		setReturnSequence( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return sequence
	 */
	public void setReturnSequence(final int value)
	{
		setReturnSequence( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.toCity</code> attribute.
	 * @return the toCity - To city
	 */
	public City getToCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, TOCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTicketTransferDayWiseItinerary.toCity</code> attribute.
	 * @return the toCity - To city
	 */
	public City getToCity()
	{
		return getToCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.toCity</code> attribute. 
	 * @param value the toCity - To city
	 */
	public void setToCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, TOCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTicketTransferDayWiseItinerary.toCity</code> attribute. 
	 * @param value the toCity - To city
	 */
	public void setToCity(final City value)
	{
		setToCity( getSession().getSessionContext(), value );
	}
	
}
