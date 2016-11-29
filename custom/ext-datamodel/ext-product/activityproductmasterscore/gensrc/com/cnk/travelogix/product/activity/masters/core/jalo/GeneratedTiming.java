/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.DiningInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.Timing Timing}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTiming extends GenericItem
{
	/** Qualifier of the <code>Timing.eventType</code> attribute **/
	public static final String EVENTTYPE = "eventType";
	/** Qualifier of the <code>Timing.mealType</code> attribute **/
	public static final String MEALTYPE = "mealType";
	/** Qualifier of the <code>Timing.validity</code> attribute **/
	public static final String VALIDITY = "validity";
	/** Qualifier of the <code>Timing.openingTime</code> attribute **/
	public static final String OPENINGTIME = "openingTime";
	/** Qualifier of the <code>Timing.notesOnOpeningTime</code> attribute **/
	public static final String NOTESONOPENINGTIME = "notesOnOpeningTime";
	/** Qualifier of the <code>Timing.closingTime</code> attribute **/
	public static final String CLOSINGTIME = "closingTime";
	/** Qualifier of the <code>Timing.notesOnClosingTime</code> attribute **/
	public static final String NOTESONCLOSINGTIME = "notesOnClosingTime";
	/** Qualifier of the <code>Timing.lastOrderTime</code> attribute **/
	public static final String LASTORDERTIME = "lastOrderTime";
	/** Qualifier of the <code>Timing.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>Timing.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>Timing.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Timing.restaurant</code> attribute **/
	public static final String RESTAURANT = "restaurant";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RESTAURANT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTiming> RESTAURANTHANDLER = new BidirectionalOneToManyHandler<GeneratedTiming>(
	ActivityproductmasterscoreConstants.TC.TIMING,
	false,
	"restaurant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(EVENTTYPE, AttributeMode.INITIAL);
		tmp.put(MEALTYPE, AttributeMode.INITIAL);
		tmp.put(VALIDITY, AttributeMode.INITIAL);
		tmp.put(OPENINGTIME, AttributeMode.INITIAL);
		tmp.put(NOTESONOPENINGTIME, AttributeMode.INITIAL);
		tmp.put(CLOSINGTIME, AttributeMode.INITIAL);
		tmp.put(NOTESONCLOSINGTIME, AttributeMode.INITIAL);
		tmp.put(LASTORDERTIME, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(RESTAURANT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.closingTime</code> attribute.
	 * @return the closingTime - Closing Time
	 */
	public String getClosingTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLOSINGTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.closingTime</code> attribute.
	 * @return the closingTime - Closing Time
	 */
	public String getClosingTime()
	{
		return getClosingTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.closingTime</code> attribute. 
	 * @param value the closingTime - Closing Time
	 */
	public void setClosingTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLOSINGTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.closingTime</code> attribute. 
	 * @param value the closingTime - Closing Time
	 */
	public void setClosingTime(final String value)
	{
		setClosingTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RESTAURANTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - Days Of Week
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - Days Of Week
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - Days Of Week
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - Days Of Week
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.eventType</code> attribute.
	 * @return the eventType - Event Type
	 */
	public EnumerationValue getEventType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, EVENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.eventType</code> attribute.
	 * @return the eventType - Event Type
	 */
	public EnumerationValue getEventType()
	{
		return getEventType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.eventType</code> attribute. 
	 * @param value the eventType - Event Type
	 */
	public void setEventType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, EVENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.eventType</code> attribute. 
	 * @param value the eventType - Event Type
	 */
	public void setEventType(final EnumerationValue value)
	{
		setEventType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.lastOrderTime</code> attribute.
	 * @return the lastOrderTime - Notes On Closing Time.
	 */
	public String getLastOrderTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTORDERTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.lastOrderTime</code> attribute.
	 * @return the lastOrderTime - Notes On Closing Time.
	 */
	public String getLastOrderTime()
	{
		return getLastOrderTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.lastOrderTime</code> attribute. 
	 * @param value the lastOrderTime - Notes On Closing Time.
	 */
	public void setLastOrderTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTORDERTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.lastOrderTime</code> attribute. 
	 * @param value the lastOrderTime - Notes On Closing Time.
	 */
	public void setLastOrderTime(final String value)
	{
		setLastOrderTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.mealType</code> attribute.
	 * @return the mealType - Meal Type
	 */
	public EnumerationValue getMealType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.mealType</code> attribute.
	 * @return the mealType - Meal Type
	 */
	public EnumerationValue getMealType()
	{
		return getMealType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.mealType</code> attribute. 
	 * @param value the mealType - Meal Type
	 */
	public void setMealType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.mealType</code> attribute. 
	 * @param value the mealType - Meal Type
	 */
	public void setMealType(final EnumerationValue value)
	{
		setMealType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.notesOnClosingTime</code> attribute.
	 * @return the notesOnClosingTime - Notes On Closing Time.
	 */
	public String getNotesOnClosingTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTESONCLOSINGTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.notesOnClosingTime</code> attribute.
	 * @return the notesOnClosingTime - Notes On Closing Time.
	 */
	public String getNotesOnClosingTime()
	{
		return getNotesOnClosingTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.notesOnClosingTime</code> attribute. 
	 * @param value the notesOnClosingTime - Notes On Closing Time.
	 */
	public void setNotesOnClosingTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTESONCLOSINGTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.notesOnClosingTime</code> attribute. 
	 * @param value the notesOnClosingTime - Notes On Closing Time.
	 */
	public void setNotesOnClosingTime(final String value)
	{
		setNotesOnClosingTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.notesOnOpeningTime</code> attribute.
	 * @return the notesOnOpeningTime - Notes On Opening Time.
	 */
	public String getNotesOnOpeningTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTESONOPENINGTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.notesOnOpeningTime</code> attribute.
	 * @return the notesOnOpeningTime - Notes On Opening Time.
	 */
	public String getNotesOnOpeningTime()
	{
		return getNotesOnOpeningTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.notesOnOpeningTime</code> attribute. 
	 * @param value the notesOnOpeningTime - Notes On Opening Time.
	 */
	public void setNotesOnOpeningTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTESONOPENINGTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.notesOnOpeningTime</code> attribute. 
	 * @param value the notesOnOpeningTime - Notes On Opening Time.
	 */
	public void setNotesOnOpeningTime(final String value)
	{
		setNotesOnOpeningTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.openingTime</code> attribute.
	 * @return the openingTime - Opening Time.
	 */
	public String getOpeningTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OPENINGTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.openingTime</code> attribute.
	 * @return the openingTime - Opening Time.
	 */
	public String getOpeningTime()
	{
		return getOpeningTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.openingTime</code> attribute. 
	 * @param value the openingTime - Opening Time.
	 */
	public void setOpeningTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OPENINGTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.openingTime</code> attribute. 
	 * @param value the openingTime - Opening Time.
	 */
	public void setOpeningTime(final String value)
	{
		setOpeningTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.remark</code> attribute.
	 * @return the remark - Notes On Closing Time.
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.remark</code> attribute.
	 * @return the remark - Notes On Closing Time.
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.remark</code> attribute. 
	 * @param value the remark - Notes On Closing Time.
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.remark</code> attribute. 
	 * @param value the remark - Notes On Closing Time.
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.restaurant</code> attribute.
	 * @return the restaurant
	 */
	public DiningInfo getRestaurant(final SessionContext ctx)
	{
		return (DiningInfo)getProperty( ctx, RESTAURANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.restaurant</code> attribute.
	 * @return the restaurant
	 */
	public DiningInfo getRestaurant()
	{
		return getRestaurant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.restaurant</code> attribute. 
	 * @param value the restaurant
	 */
	public void setRestaurant(final SessionContext ctx, final DiningInfo value)
	{
		RESTAURANTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.restaurant</code> attribute. 
	 * @param value the restaurant
	 */
	public void setRestaurant(final DiningInfo value)
	{
		setRestaurant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.validity</code> attribute.
	 * @return the validity - Validity
	 */
	public StandardDateRange getValidity(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, VALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Timing.validity</code> attribute.
	 * @return the validity - Validity
	 */
	public StandardDateRange getValidity()
	{
		return getValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.validity</code> attribute. 
	 * @param value the validity - Validity
	 */
	public void setValidity(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, VALIDITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Timing.validity</code> attribute. 
	 * @param value the validity - Validity
	 */
	public void setValidity(final StandardDateRange value)
	{
		setValidity( getSession().getSessionContext(), value );
	}
	
}
