/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProductSubType;
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
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.OperationDuration OperationDuration}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOperationDuration extends GenericItem
{
	/** Qualifier of the <code>OperationDuration.dateRange</code> attribute **/
	public static final String DATERANGE = "dateRange";
	/** Qualifier of the <code>OperationDuration.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>OperationDuration.timeOfDay</code> attribute **/
	public static final String TIMEOFDAY = "timeOfDay";
	/** Qualifier of the <code>OperationDuration.timeFrom</code> attribute **/
	public static final String TIMEFROM = "timeFrom";
	/** Qualifier of the <code>OperationDuration.timeTo</code> attribute **/
	public static final String TIMETO = "timeTo";
	/** Qualifier of the <code>OperationDuration.activityProductSubTypeOperationDuration</code> attribute **/
	public static final String ACTIVITYPRODUCTSUBTYPEOPERATIONDURATION = "activityProductSubTypeOperationDuration";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCTSUBTYPEOPERATIONDURATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedOperationDuration> ACTIVITYPRODUCTSUBTYPEOPERATIONDURATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedOperationDuration>(
	ActivityproductmasterscoreConstants.TC.OPERATIONDURATION,
	false,
	"activityProductSubTypeOperationDuration",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DATERANGE, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(TIMEOFDAY, AttributeMode.INITIAL);
		tmp.put(TIMEFROM, AttributeMode.INITIAL);
		tmp.put(TIMETO, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCTSUBTYPEOPERATIONDURATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.activityProductSubTypeOperationDuration</code> attribute.
	 * @return the activityProductSubTypeOperationDuration
	 */
	public ActivityProductSubType getActivityProductSubTypeOperationDuration(final SessionContext ctx)
	{
		return (ActivityProductSubType)getProperty( ctx, ACTIVITYPRODUCTSUBTYPEOPERATIONDURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.activityProductSubTypeOperationDuration</code> attribute.
	 * @return the activityProductSubTypeOperationDuration
	 */
	public ActivityProductSubType getActivityProductSubTypeOperationDuration()
	{
		return getActivityProductSubTypeOperationDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.activityProductSubTypeOperationDuration</code> attribute. 
	 * @param value the activityProductSubTypeOperationDuration
	 */
	public void setActivityProductSubTypeOperationDuration(final SessionContext ctx, final ActivityProductSubType value)
	{
		ACTIVITYPRODUCTSUBTYPEOPERATIONDURATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.activityProductSubTypeOperationDuration</code> attribute. 
	 * @param value the activityProductSubTypeOperationDuration
	 */
	public void setActivityProductSubTypeOperationDuration(final ActivityProductSubType value)
	{
		setActivityProductSubTypeOperationDuration( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYPRODUCTSUBTYPEOPERATIONDURATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.dateRange</code> attribute.
	 * @return the dateRange - Date range
	 */
	public StandardDateRange getDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, DATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.dateRange</code> attribute.
	 * @return the dateRange - Date range
	 */
	public StandardDateRange getDateRange()
	{
		return getDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.dateRange</code> attribute. 
	 * @param value the dateRange - Date range
	 */
	public void setDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, DATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.dateRange</code> attribute. 
	 * @param value the dateRange - Date range
	 */
	public void setDateRange(final StandardDateRange value)
	{
		setDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - Days of week
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - Days of week
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - Days of week
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - Days of week
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.timeFrom</code> attribute.
	 * @return the timeFrom - Time from
	 */
	public String getTimeFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.timeFrom</code> attribute.
	 * @return the timeFrom - Time from
	 */
	public String getTimeFrom()
	{
		return getTimeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.timeFrom</code> attribute. 
	 * @param value the timeFrom - Time from
	 */
	public void setTimeFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.timeFrom</code> attribute. 
	 * @param value the timeFrom - Time from
	 */
	public void setTimeFrom(final String value)
	{
		setTimeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.timeOfDay</code> attribute.
	 * @return the timeOfDay - Time Of Day
	 */
	public EnumerationValue getTimeOfDay(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TIMEOFDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.timeOfDay</code> attribute.
	 * @return the timeOfDay - Time Of Day
	 */
	public EnumerationValue getTimeOfDay()
	{
		return getTimeOfDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.timeOfDay</code> attribute. 
	 * @param value the timeOfDay - Time Of Day
	 */
	public void setTimeOfDay(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TIMEOFDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.timeOfDay</code> attribute. 
	 * @param value the timeOfDay - Time Of Day
	 */
	public void setTimeOfDay(final EnumerationValue value)
	{
		setTimeOfDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.timeTo</code> attribute.
	 * @return the timeTo - Time to
	 */
	public String getTimeTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.timeTo</code> attribute.
	 * @return the timeTo - Time to
	 */
	public String getTimeTo()
	{
		return getTimeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.timeTo</code> attribute. 
	 * @param value the timeTo - Time to
	 */
	public void setTimeTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.timeTo</code> attribute. 
	 * @param value the timeTo - Time to
	 */
	public void setTimeTo(final String value)
	{
		setTimeTo( getSession().getSessionContext(), value );
	}
	
}
