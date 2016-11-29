/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayFlavor;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayItineraryDetails;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.DayWiseItinerary DayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDayWiseItinerary extends GenericItem
{
	/** Qualifier of the <code>DayWiseItinerary.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>DayWiseItinerary.sequenceNumber</code> attribute **/
	public static final String SEQUENCENUMBER = "sequenceNumber";
	/** Qualifier of the <code>DayWiseItinerary.day</code> attribute **/
	public static final String DAY = "day";
	/** Qualifier of the <code>DayWiseItinerary.standardPrice</code> attribute **/
	public static final String STANDARDPRICE = "standardPrice";
	/** Qualifier of the <code>DayWiseItinerary.deluxePrice</code> attribute **/
	public static final String DELUXEPRICE = "deluxePrice";
	/** Qualifier of the <code>DayWiseItinerary.superiorPrice</code> attribute **/
	public static final String SUPERIORPRICE = "superiorPrice";
	/** Qualifier of the <code>DayWiseItinerary.service</code> attribute **/
	public static final String SERVICE = "service";
	/** Qualifier of the <code>DayWiseItinerary.timeFrom</code> attribute **/
	public static final String TIMEFROM = "timeFrom";
	/** Qualifier of the <code>DayWiseItinerary.timeTo</code> attribute **/
	public static final String TIMETO = "timeTo";
	/** Qualifier of the <code>DayWiseItinerary.lunchIncluded</code> attribute **/
	public static final String LUNCHINCLUDED = "lunchIncluded";
	/** Qualifier of the <code>DayWiseItinerary.breakfastIncluded</code> attribute **/
	public static final String BREAKFASTINCLUDED = "breakfastIncluded";
	/** Qualifier of the <code>DayWiseItinerary.dinnerIncluded</code> attribute **/
	public static final String DINNERINCLUDED = "dinnerIncluded";
	/** Qualifier of the <code>DayWiseItinerary.sessionName</code> attribute **/
	public static final String SESSIONNAME = "sessionName";
	/** Qualifier of the <code>DayWiseItinerary.itineraryDetails</code> attribute **/
	public static final String ITINERARYDETAILS = "itineraryDetails";
	/** Qualifier of the <code>DayWiseItinerary.holidayFlavor</code> attribute **/
	public static final String HOLIDAYFLAVOR = "holidayFlavor";
	/**
	* {@link OneToManyHandler} for handling 1:n ITINERARYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<HolidayItineraryDetails> ITINERARYDETAILSHANDLER = new OneToManyHandler<HolidayItineraryDetails>(
	HolidayproductmastercoreConstants.TC.HOLIDAYITINERARYDETAILS,
	false,
	"dayWiseItinerary",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOLIDAYFLAVOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDayWiseItinerary> HOLIDAYFLAVORHANDLER = new BidirectionalOneToManyHandler<GeneratedDayWiseItinerary>(
	HolidayproductmastercoreConstants.TC.DAYWISEITINERARY,
	false,
	"holidayFlavor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(SEQUENCENUMBER, AttributeMode.INITIAL);
		tmp.put(DAY, AttributeMode.INITIAL);
		tmp.put(STANDARDPRICE, AttributeMode.INITIAL);
		tmp.put(DELUXEPRICE, AttributeMode.INITIAL);
		tmp.put(SUPERIORPRICE, AttributeMode.INITIAL);
		tmp.put(SERVICE, AttributeMode.INITIAL);
		tmp.put(TIMEFROM, AttributeMode.INITIAL);
		tmp.put(TIMETO, AttributeMode.INITIAL);
		tmp.put(LUNCHINCLUDED, AttributeMode.INITIAL);
		tmp.put(BREAKFASTINCLUDED, AttributeMode.INITIAL);
		tmp.put(DINNERINCLUDED, AttributeMode.INITIAL);
		tmp.put(SESSIONNAME, AttributeMode.INITIAL);
		tmp.put(HOLIDAYFLAVOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.breakfastIncluded</code> attribute.
	 * @return the breakfastIncluded - Is breakfast included
	 */
	public Boolean isBreakfastIncluded(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BREAKFASTINCLUDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.breakfastIncluded</code> attribute.
	 * @return the breakfastIncluded - Is breakfast included
	 */
	public Boolean isBreakfastIncluded()
	{
		return isBreakfastIncluded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.breakfastIncluded</code> attribute. 
	 * @return the breakfastIncluded - Is breakfast included
	 */
	public boolean isBreakfastIncludedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBreakfastIncluded( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.breakfastIncluded</code> attribute. 
	 * @return the breakfastIncluded - Is breakfast included
	 */
	public boolean isBreakfastIncludedAsPrimitive()
	{
		return isBreakfastIncludedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.breakfastIncluded</code> attribute. 
	 * @param value the breakfastIncluded - Is breakfast included
	 */
	public void setBreakfastIncluded(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BREAKFASTINCLUDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.breakfastIncluded</code> attribute. 
	 * @param value the breakfastIncluded - Is breakfast included
	 */
	public void setBreakfastIncluded(final Boolean value)
	{
		setBreakfastIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.breakfastIncluded</code> attribute. 
	 * @param value the breakfastIncluded - Is breakfast included
	 */
	public void setBreakfastIncluded(final SessionContext ctx, final boolean value)
	{
		setBreakfastIncluded( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.breakfastIncluded</code> attribute. 
	 * @param value the breakfastIncluded - Is breakfast included
	 */
	public void setBreakfastIncluded(final boolean value)
	{
		setBreakfastIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		HOLIDAYFLAVORHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.day</code> attribute.
	 * @return the day - Day
	 */
	public Integer getDay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.day</code> attribute.
	 * @return the day - Day
	 */
	public Integer getDay()
	{
		return getDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.day</code> attribute. 
	 * @return the day - Day
	 */
	public int getDayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.day</code> attribute. 
	 * @return the day - Day
	 */
	public int getDayAsPrimitive()
	{
		return getDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final Integer value)
	{
		setDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final SessionContext ctx, final int value)
	{
		setDay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final int value)
	{
		setDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.deluxePrice</code> attribute.
	 * @return the deluxePrice - Deluxe price
	 */
	public PriceRow getDeluxePrice(final SessionContext ctx)
	{
		return (PriceRow)getProperty( ctx, DELUXEPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.deluxePrice</code> attribute.
	 * @return the deluxePrice - Deluxe price
	 */
	public PriceRow getDeluxePrice()
	{
		return getDeluxePrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.deluxePrice</code> attribute. 
	 * @param value the deluxePrice - Deluxe price
	 */
	public void setDeluxePrice(final SessionContext ctx, final PriceRow value)
	{
		setProperty(ctx, DELUXEPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.deluxePrice</code> attribute. 
	 * @param value the deluxePrice - Deluxe price
	 */
	public void setDeluxePrice(final PriceRow value)
	{
		setDeluxePrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.dinnerIncluded</code> attribute.
	 * @return the dinnerIncluded - Is dinner included
	 */
	public Boolean isDinnerIncluded(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DINNERINCLUDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.dinnerIncluded</code> attribute.
	 * @return the dinnerIncluded - Is dinner included
	 */
	public Boolean isDinnerIncluded()
	{
		return isDinnerIncluded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.dinnerIncluded</code> attribute. 
	 * @return the dinnerIncluded - Is dinner included
	 */
	public boolean isDinnerIncludedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDinnerIncluded( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.dinnerIncluded</code> attribute. 
	 * @return the dinnerIncluded - Is dinner included
	 */
	public boolean isDinnerIncludedAsPrimitive()
	{
		return isDinnerIncludedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.dinnerIncluded</code> attribute. 
	 * @param value the dinnerIncluded - Is dinner included
	 */
	public void setDinnerIncluded(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DINNERINCLUDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.dinnerIncluded</code> attribute. 
	 * @param value the dinnerIncluded - Is dinner included
	 */
	public void setDinnerIncluded(final Boolean value)
	{
		setDinnerIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.dinnerIncluded</code> attribute. 
	 * @param value the dinnerIncluded - Is dinner included
	 */
	public void setDinnerIncluded(final SessionContext ctx, final boolean value)
	{
		setDinnerIncluded( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.dinnerIncluded</code> attribute. 
	 * @param value the dinnerIncluded - Is dinner included
	 */
	public void setDinnerIncluded(final boolean value)
	{
		setDinnerIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.holidayFlavor</code> attribute.
	 * @return the holidayFlavor
	 */
	public HolidayFlavor getHolidayFlavor(final SessionContext ctx)
	{
		return (HolidayFlavor)getProperty( ctx, HOLIDAYFLAVOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.holidayFlavor</code> attribute.
	 * @return the holidayFlavor
	 */
	public HolidayFlavor getHolidayFlavor()
	{
		return getHolidayFlavor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.holidayFlavor</code> attribute. 
	 * @param value the holidayFlavor
	 */
	public void setHolidayFlavor(final SessionContext ctx, final HolidayFlavor value)
	{
		HOLIDAYFLAVORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.holidayFlavor</code> attribute. 
	 * @param value the holidayFlavor
	 */
	public void setHolidayFlavor(final HolidayFlavor value)
	{
		setHolidayFlavor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.itineraryDetails</code> attribute.
	 * @return the itineraryDetails
	 */
	public Collection<HolidayItineraryDetails> getItineraryDetails(final SessionContext ctx)
	{
		return ITINERARYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.itineraryDetails</code> attribute.
	 * @return the itineraryDetails
	 */
	public Collection<HolidayItineraryDetails> getItineraryDetails()
	{
		return getItineraryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.itineraryDetails</code> attribute. 
	 * @param value the itineraryDetails
	 */
	public void setItineraryDetails(final SessionContext ctx, final Collection<HolidayItineraryDetails> value)
	{
		ITINERARYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.itineraryDetails</code> attribute. 
	 * @param value the itineraryDetails
	 */
	public void setItineraryDetails(final Collection<HolidayItineraryDetails> value)
	{
		setItineraryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraryDetails. 
	 * @param value the item to add to itineraryDetails
	 */
	public void addToItineraryDetails(final SessionContext ctx, final HolidayItineraryDetails value)
	{
		ITINERARYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraryDetails. 
	 * @param value the item to add to itineraryDetails
	 */
	public void addToItineraryDetails(final HolidayItineraryDetails value)
	{
		addToItineraryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraryDetails. 
	 * @param value the item to remove from itineraryDetails
	 */
	public void removeFromItineraryDetails(final SessionContext ctx, final HolidayItineraryDetails value)
	{
		ITINERARYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraryDetails. 
	 * @param value the item to remove from itineraryDetails
	 */
	public void removeFromItineraryDetails(final HolidayItineraryDetails value)
	{
		removeFromItineraryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.lunchIncluded</code> attribute.
	 * @return the lunchIncluded - Is lunch included
	 */
	public Boolean isLunchIncluded(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, LUNCHINCLUDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.lunchIncluded</code> attribute.
	 * @return the lunchIncluded - Is lunch included
	 */
	public Boolean isLunchIncluded()
	{
		return isLunchIncluded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.lunchIncluded</code> attribute. 
	 * @return the lunchIncluded - Is lunch included
	 */
	public boolean isLunchIncludedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isLunchIncluded( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.lunchIncluded</code> attribute. 
	 * @return the lunchIncluded - Is lunch included
	 */
	public boolean isLunchIncludedAsPrimitive()
	{
		return isLunchIncludedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.lunchIncluded</code> attribute. 
	 * @param value the lunchIncluded - Is lunch included
	 */
	public void setLunchIncluded(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, LUNCHINCLUDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.lunchIncluded</code> attribute. 
	 * @param value the lunchIncluded - Is lunch included
	 */
	public void setLunchIncluded(final Boolean value)
	{
		setLunchIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.lunchIncluded</code> attribute. 
	 * @param value the lunchIncluded - Is lunch included
	 */
	public void setLunchIncluded(final SessionContext ctx, final boolean value)
	{
		setLunchIncluded( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.lunchIncluded</code> attribute. 
	 * @param value the lunchIncluded - Is lunch included
	 */
	public void setLunchIncluded(final boolean value)
	{
		setLunchIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.sequenceNumber</code> attribute.
	 * @return the sequenceNumber - Sequence number
	 */
	public Integer getSequenceNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SEQUENCENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.sequenceNumber</code> attribute.
	 * @return the sequenceNumber - Sequence number
	 */
	public Integer getSequenceNumber()
	{
		return getSequenceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.sequenceNumber</code> attribute. 
	 * @return the sequenceNumber - Sequence number
	 */
	public int getSequenceNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSequenceNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.sequenceNumber</code> attribute. 
	 * @return the sequenceNumber - Sequence number
	 */
	public int getSequenceNumberAsPrimitive()
	{
		return getSequenceNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.sequenceNumber</code> attribute. 
	 * @param value the sequenceNumber - Sequence number
	 */
	public void setSequenceNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SEQUENCENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.sequenceNumber</code> attribute. 
	 * @param value the sequenceNumber - Sequence number
	 */
	public void setSequenceNumber(final Integer value)
	{
		setSequenceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.sequenceNumber</code> attribute. 
	 * @param value the sequenceNumber - Sequence number
	 */
	public void setSequenceNumber(final SessionContext ctx, final int value)
	{
		setSequenceNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.sequenceNumber</code> attribute. 
	 * @param value the sequenceNumber - Sequence number
	 */
	public void setSequenceNumber(final int value)
	{
		setSequenceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.service</code> attribute.
	 * @return the service - Service
	 */
	public Category getService(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, SERVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.service</code> attribute.
	 * @return the service - Service
	 */
	public Category getService()
	{
		return getService( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.service</code> attribute. 
	 * @param value the service - Service
	 */
	public void setService(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, SERVICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.service</code> attribute. 
	 * @param value the service - Service
	 */
	public void setService(final Category value)
	{
		setService( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.sessionName</code> attribute.
	 * @return the sessionName - Session
	 */
	public EnumerationValue getSessionName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SESSIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.sessionName</code> attribute.
	 * @return the sessionName - Session
	 */
	public EnumerationValue getSessionName()
	{
		return getSessionName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.sessionName</code> attribute. 
	 * @param value the sessionName - Session
	 */
	public void setSessionName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SESSIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.sessionName</code> attribute. 
	 * @param value the sessionName - Session
	 */
	public void setSessionName(final EnumerationValue value)
	{
		setSessionName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.standardPrice</code> attribute.
	 * @return the standardPrice - Standard price
	 */
	public PriceRow getStandardPrice(final SessionContext ctx)
	{
		return (PriceRow)getProperty( ctx, STANDARDPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.standardPrice</code> attribute.
	 * @return the standardPrice - Standard price
	 */
	public PriceRow getStandardPrice()
	{
		return getStandardPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.standardPrice</code> attribute. 
	 * @param value the standardPrice - Standard price
	 */
	public void setStandardPrice(final SessionContext ctx, final PriceRow value)
	{
		setProperty(ctx, STANDARDPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.standardPrice</code> attribute. 
	 * @param value the standardPrice - Standard price
	 */
	public void setStandardPrice(final PriceRow value)
	{
		setStandardPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.superiorPrice</code> attribute.
	 * @return the superiorPrice - Superior price
	 */
	public PriceRow getSuperiorPrice(final SessionContext ctx)
	{
		return (PriceRow)getProperty( ctx, SUPERIORPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.superiorPrice</code> attribute.
	 * @return the superiorPrice - Superior price
	 */
	public PriceRow getSuperiorPrice()
	{
		return getSuperiorPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.superiorPrice</code> attribute. 
	 * @param value the superiorPrice - Superior price
	 */
	public void setSuperiorPrice(final SessionContext ctx, final PriceRow value)
	{
		setProperty(ctx, SUPERIORPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.superiorPrice</code> attribute. 
	 * @param value the superiorPrice - Superior price
	 */
	public void setSuperiorPrice(final PriceRow value)
	{
		setSuperiorPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.timeFrom</code> attribute.
	 * @return the timeFrom - Time from
	 */
	public String getTimeFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.timeFrom</code> attribute.
	 * @return the timeFrom - Time from
	 */
	public String getTimeFrom()
	{
		return getTimeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.timeFrom</code> attribute. 
	 * @param value the timeFrom - Time from
	 */
	public void setTimeFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.timeFrom</code> attribute. 
	 * @param value the timeFrom - Time from
	 */
	public void setTimeFrom(final String value)
	{
		setTimeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.timeTo</code> attribute.
	 * @return the timeTo - Time to
	 */
	public String getTimeTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayWiseItinerary.timeTo</code> attribute.
	 * @return the timeTo - Time to
	 */
	public String getTimeTo()
	{
		return getTimeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.timeTo</code> attribute. 
	 * @param value the timeTo - Time to
	 */
	public void setTimeTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayWiseItinerary.timeTo</code> attribute. 
	 * @param value the timeTo - Time to
	 */
	public void setTimeTo(final String value)
	{
		setTimeTo( getSession().getSessionContext(), value );
	}
	
}
