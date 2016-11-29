/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.holiday.inventory.jalo;

import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryDetail;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.holiday.inventory.jalo.AbstractHolidayInventoryDetail AbstractHolidayInventoryDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractHolidayInventoryDetail extends AbstractInventoryDetail
{
	/** Qualifier of the <code>AbstractHolidayInventoryDetail.noOfPax</code> attribute **/
	public static final String NOOFPAX = "noOfPax";
	/** Qualifier of the <code>AbstractHolidayInventoryDetail.anyRooms</code> attribute **/
	public static final String ANYROOMS = "anyRooms";
	/** Qualifier of the <code>AbstractHolidayInventoryDetail.roomTypeSingle</code> attribute **/
	public static final String ROOMTYPESINGLE = "roomTypeSingle";
	/** Qualifier of the <code>AbstractHolidayInventoryDetail.roomTypeDouble</code> attribute **/
	public static final String ROOMTYPEDOUBLE = "roomTypeDouble";
	/** Qualifier of the <code>AbstractHolidayInventoryDetail.roomTypeTriple</code> attribute **/
	public static final String ROOMTYPETRIPLE = "roomTypeTriple";
	/** Qualifier of the <code>AbstractHolidayInventoryDetail.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>AbstractHolidayInventoryDetail.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>AbstractHolidayInventoryDetail.specificDates</code> attribute **/
	public static final String SPECIFICDATES = "specificDates";
	/** Qualifier of the <code>AbstractHolidayInventoryDetail.travelDateRange</code> attribute **/
	public static final String TRAVELDATERANGE = "travelDateRange";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFPAX, AttributeMode.INITIAL);
		tmp.put(ANYROOMS, AttributeMode.INITIAL);
		tmp.put(ROOMTYPESINGLE, AttributeMode.INITIAL);
		tmp.put(ROOMTYPEDOUBLE, AttributeMode.INITIAL);
		tmp.put(ROOMTYPETRIPLE, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		tmp.put(SPECIFICDATES, AttributeMode.INITIAL);
		tmp.put(TRAVELDATERANGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.anyRooms</code> attribute.
	 * @return the anyRooms - Any Rooms
	 */
	public Integer getAnyRooms(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ANYROOMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.anyRooms</code> attribute.
	 * @return the anyRooms - Any Rooms
	 */
	public Integer getAnyRooms()
	{
		return getAnyRooms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.anyRooms</code> attribute. 
	 * @return the anyRooms - Any Rooms
	 */
	public int getAnyRoomsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAnyRooms( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.anyRooms</code> attribute. 
	 * @return the anyRooms - Any Rooms
	 */
	public int getAnyRoomsAsPrimitive()
	{
		return getAnyRoomsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.anyRooms</code> attribute. 
	 * @param value the anyRooms - Any Rooms
	 */
	public void setAnyRooms(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ANYROOMS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.anyRooms</code> attribute. 
	 * @param value the anyRooms - Any Rooms
	 */
	public void setAnyRooms(final Integer value)
	{
		setAnyRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.anyRooms</code> attribute. 
	 * @param value the anyRooms - Any Rooms
	 */
	public void setAnyRooms(final SessionContext ctx, final int value)
	{
		setAnyRooms( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.anyRooms</code> attribute. 
	 * @param value the anyRooms - Any Rooms
	 */
	public void setAnyRooms(final int value)
	{
		setAnyRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - days of week
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - days of week
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - days of week
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - days of week
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.noOfPax</code> attribute.
	 * @return the noOfPax - no Of Pax
	 */
	public Integer getNoOfPax(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFPAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.noOfPax</code> attribute.
	 * @return the noOfPax - no Of Pax
	 */
	public Integer getNoOfPax()
	{
		return getNoOfPax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.noOfPax</code> attribute. 
	 * @return the noOfPax - no Of Pax
	 */
	public int getNoOfPaxAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfPax( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.noOfPax</code> attribute. 
	 * @return the noOfPax - no Of Pax
	 */
	public int getNoOfPaxAsPrimitive()
	{
		return getNoOfPaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.noOfPax</code> attribute. 
	 * @param value the noOfPax - no Of Pax
	 */
	public void setNoOfPax(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFPAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.noOfPax</code> attribute. 
	 * @param value the noOfPax - no Of Pax
	 */
	public void setNoOfPax(final Integer value)
	{
		setNoOfPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.noOfPax</code> attribute. 
	 * @param value the noOfPax - no Of Pax
	 */
	public void setNoOfPax(final SessionContext ctx, final int value)
	{
		setNoOfPax( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.noOfPax</code> attribute. 
	 * @param value the noOfPax - no Of Pax
	 */
	public void setNoOfPax(final int value)
	{
		setNoOfPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeDouble</code> attribute.
	 * @return the roomTypeDouble - Room Type Double
	 */
	public Integer getRoomTypeDouble(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ROOMTYPEDOUBLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeDouble</code> attribute.
	 * @return the roomTypeDouble - Room Type Double
	 */
	public Integer getRoomTypeDouble()
	{
		return getRoomTypeDouble( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeDouble</code> attribute. 
	 * @return the roomTypeDouble - Room Type Double
	 */
	public int getRoomTypeDoubleAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRoomTypeDouble( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeDouble</code> attribute. 
	 * @return the roomTypeDouble - Room Type Double
	 */
	public int getRoomTypeDoubleAsPrimitive()
	{
		return getRoomTypeDoubleAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeDouble</code> attribute. 
	 * @param value the roomTypeDouble - Room Type Double
	 */
	public void setRoomTypeDouble(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ROOMTYPEDOUBLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeDouble</code> attribute. 
	 * @param value the roomTypeDouble - Room Type Double
	 */
	public void setRoomTypeDouble(final Integer value)
	{
		setRoomTypeDouble( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeDouble</code> attribute. 
	 * @param value the roomTypeDouble - Room Type Double
	 */
	public void setRoomTypeDouble(final SessionContext ctx, final int value)
	{
		setRoomTypeDouble( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeDouble</code> attribute. 
	 * @param value the roomTypeDouble - Room Type Double
	 */
	public void setRoomTypeDouble(final int value)
	{
		setRoomTypeDouble( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeSingle</code> attribute.
	 * @return the roomTypeSingle - Room Type Single
	 */
	public Integer getRoomTypeSingle(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ROOMTYPESINGLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeSingle</code> attribute.
	 * @return the roomTypeSingle - Room Type Single
	 */
	public Integer getRoomTypeSingle()
	{
		return getRoomTypeSingle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeSingle</code> attribute. 
	 * @return the roomTypeSingle - Room Type Single
	 */
	public int getRoomTypeSingleAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRoomTypeSingle( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeSingle</code> attribute. 
	 * @return the roomTypeSingle - Room Type Single
	 */
	public int getRoomTypeSingleAsPrimitive()
	{
		return getRoomTypeSingleAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeSingle</code> attribute. 
	 * @param value the roomTypeSingle - Room Type Single
	 */
	public void setRoomTypeSingle(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ROOMTYPESINGLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeSingle</code> attribute. 
	 * @param value the roomTypeSingle - Room Type Single
	 */
	public void setRoomTypeSingle(final Integer value)
	{
		setRoomTypeSingle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeSingle</code> attribute. 
	 * @param value the roomTypeSingle - Room Type Single
	 */
	public void setRoomTypeSingle(final SessionContext ctx, final int value)
	{
		setRoomTypeSingle( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeSingle</code> attribute. 
	 * @param value the roomTypeSingle - Room Type Single
	 */
	public void setRoomTypeSingle(final int value)
	{
		setRoomTypeSingle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeTriple</code> attribute.
	 * @return the roomTypeTriple - Room Type Triple
	 */
	public Integer getRoomTypeTriple(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ROOMTYPETRIPLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeTriple</code> attribute.
	 * @return the roomTypeTriple - Room Type Triple
	 */
	public Integer getRoomTypeTriple()
	{
		return getRoomTypeTriple( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeTriple</code> attribute. 
	 * @return the roomTypeTriple - Room Type Triple
	 */
	public int getRoomTypeTripleAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRoomTypeTriple( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.roomTypeTriple</code> attribute. 
	 * @return the roomTypeTriple - Room Type Triple
	 */
	public int getRoomTypeTripleAsPrimitive()
	{
		return getRoomTypeTripleAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeTriple</code> attribute. 
	 * @param value the roomTypeTriple - Room Type Triple
	 */
	public void setRoomTypeTriple(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ROOMTYPETRIPLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeTriple</code> attribute. 
	 * @param value the roomTypeTriple - Room Type Triple
	 */
	public void setRoomTypeTriple(final Integer value)
	{
		setRoomTypeTriple( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeTriple</code> attribute. 
	 * @param value the roomTypeTriple - Room Type Triple
	 */
	public void setRoomTypeTriple(final SessionContext ctx, final int value)
	{
		setRoomTypeTriple( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.roomTypeTriple</code> attribute. 
	 * @param value the roomTypeTriple - Room Type Triple
	 */
	public void setRoomTypeTriple(final int value)
	{
		setRoomTypeTriple( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.specificDates</code> attribute.
	 * @return the specificDates - specific date
	 */
	public Collection<Date> getSpecificDates(final SessionContext ctx)
	{
		Collection<Date> coll = (Collection<Date>)getProperty( ctx, SPECIFICDATES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.specificDates</code> attribute.
	 * @return the specificDates - specific date
	 */
	public Collection<Date> getSpecificDates()
	{
		return getSpecificDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.specificDates</code> attribute. 
	 * @param value the specificDates - specific date
	 */
	public void setSpecificDates(final SessionContext ctx, final Collection<Date> value)
	{
		setProperty(ctx, SPECIFICDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.specificDates</code> attribute. 
	 * @param value the specificDates - specific date
	 */
	public void setSpecificDates(final Collection<Date> value)
	{
		setSpecificDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.time</code> attribute.
	 * @return the time - time
	 */
	public String getTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.time</code> attribute.
	 * @return the time - time
	 */
	public String getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.time</code> attribute. 
	 * @param value the time - time
	 */
	public void setTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.time</code> attribute. 
	 * @param value the time - time
	 */
	public void setTime(final String value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.travelDateRange</code> attribute.
	 * @return the travelDateRange - travel date range
	 */
	public StandardDateRange getTravelDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, TRAVELDATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractHolidayInventoryDetail.travelDateRange</code> attribute.
	 * @return the travelDateRange - travel date range
	 */
	public StandardDateRange getTravelDateRange()
	{
		return getTravelDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.travelDateRange</code> attribute. 
	 * @param value the travelDateRange - travel date range
	 */
	public void setTravelDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, TRAVELDATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractHolidayInventoryDetail.travelDateRange</code> attribute. 
	 * @param value the travelDateRange - travel date range
	 */
	public void setTravelDateRange(final StandardDateRange value)
	{
		setTravelDateRange( getSession().getSessionContext(), value );
	}
	
}
