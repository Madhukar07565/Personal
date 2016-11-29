/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.Entertainment;
import com.cnk.travelogix.product.activity.masters.core.jalo.EventsAndTourInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.ShoppingInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.DayOfOperation DayOfOperation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDayOfOperation extends GenericItem
{
	/** Qualifier of the <code>DayOfOperation.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>DayOfOperation.timeFrom</code> attribute **/
	public static final String TIMEFROM = "timeFrom";
	/** Qualifier of the <code>DayOfOperation.timeTo</code> attribute **/
	public static final String TIMETO = "timeTo";
	/** Qualifier of the <code>DayOfOperation.dateRange</code> attribute **/
	public static final String DATERANGE = "dateRange";
	/** Qualifier of the <code>DayOfOperation.media</code> attribute **/
	public static final String MEDIA = "media";
	/** Qualifier of the <code>DayOfOperation.entertainment</code> attribute **/
	public static final String ENTERTAINMENT = "entertainment";
	/** Qualifier of the <code>DayOfOperation.shoppingInfo</code> attribute **/
	public static final String SHOPPINGINFO = "shoppingInfo";
	/** Qualifier of the <code>DayOfOperation.eventsAndTourInfo</code> attribute **/
	public static final String EVENTSANDTOURINFO = "eventsAndTourInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ENTERTAINMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDayOfOperation> ENTERTAINMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedDayOfOperation>(
	ActivityproductmasterscoreConstants.TC.DAYOFOPERATION,
	false,
	"entertainment",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SHOPPINGINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDayOfOperation> SHOPPINGINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedDayOfOperation>(
	ActivityproductmasterscoreConstants.TC.DAYOFOPERATION,
	false,
	"shoppingInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n EVENTSANDTOURINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDayOfOperation> EVENTSANDTOURINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedDayOfOperation>(
	ActivityproductmasterscoreConstants.TC.DAYOFOPERATION,
	false,
	"eventsAndTourInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(TIMEFROM, AttributeMode.INITIAL);
		tmp.put(TIMETO, AttributeMode.INITIAL);
		tmp.put(DATERANGE, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		tmp.put(ENTERTAINMENT, AttributeMode.INITIAL);
		tmp.put(SHOPPINGINFO, AttributeMode.INITIAL);
		tmp.put(EVENTSANDTOURINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ENTERTAINMENTHANDLER.newInstance(ctx, allAttributes);
		SHOPPINGINFOHANDLER.newInstance(ctx, allAttributes);
		EVENTSANDTOURINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.dateRange</code> attribute.
	 * @return the dateRange - Date Range
	 */
	public StandardDateRange getDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, DATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.dateRange</code> attribute.
	 * @return the dateRange - Date Range
	 */
	public StandardDateRange getDateRange()
	{
		return getDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.dateRange</code> attribute. 
	 * @param value the dateRange - Date Range
	 */
	public void setDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, DATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.dateRange</code> attribute. 
	 * @param value the dateRange - Date Range
	 */
	public void setDateRange(final StandardDateRange value)
	{
		setDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - Days Of Week
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - Days Of Week
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - Days Of Week
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - Days Of Week
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.entertainment</code> attribute.
	 * @return the entertainment
	 */
	public Entertainment getEntertainment(final SessionContext ctx)
	{
		return (Entertainment)getProperty( ctx, ENTERTAINMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.entertainment</code> attribute.
	 * @return the entertainment
	 */
	public Entertainment getEntertainment()
	{
		return getEntertainment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.entertainment</code> attribute. 
	 * @param value the entertainment
	 */
	public void setEntertainment(final SessionContext ctx, final Entertainment value)
	{
		ENTERTAINMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.entertainment</code> attribute. 
	 * @param value the entertainment
	 */
	public void setEntertainment(final Entertainment value)
	{
		setEntertainment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.eventsAndTourInfo</code> attribute.
	 * @return the eventsAndTourInfo
	 */
	public EventsAndTourInfo getEventsAndTourInfo(final SessionContext ctx)
	{
		return (EventsAndTourInfo)getProperty( ctx, EVENTSANDTOURINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.eventsAndTourInfo</code> attribute.
	 * @return the eventsAndTourInfo
	 */
	public EventsAndTourInfo getEventsAndTourInfo()
	{
		return getEventsAndTourInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.eventsAndTourInfo</code> attribute. 
	 * @param value the eventsAndTourInfo
	 */
	public void setEventsAndTourInfo(final SessionContext ctx, final EventsAndTourInfo value)
	{
		EVENTSANDTOURINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.eventsAndTourInfo</code> attribute. 
	 * @param value the eventsAndTourInfo
	 */
	public void setEventsAndTourInfo(final EventsAndTourInfo value)
	{
		setEventsAndTourInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.media</code> attribute.
	 * @return the media - Media
	 */
	public Collection<Media> getMedia(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.media</code> attribute.
	 * @return the media - Media
	 */
	public Collection<Media> getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.media</code> attribute. 
	 * @param value the media - Media
	 */
	public void setMedia(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.media</code> attribute. 
	 * @param value the media - Media
	 */
	public void setMedia(final Collection<Media> value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.shoppingInfo</code> attribute.
	 * @return the shoppingInfo
	 */
	public ShoppingInfo getShoppingInfo(final SessionContext ctx)
	{
		return (ShoppingInfo)getProperty( ctx, SHOPPINGINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.shoppingInfo</code> attribute.
	 * @return the shoppingInfo
	 */
	public ShoppingInfo getShoppingInfo()
	{
		return getShoppingInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.shoppingInfo</code> attribute. 
	 * @param value the shoppingInfo
	 */
	public void setShoppingInfo(final SessionContext ctx, final ShoppingInfo value)
	{
		SHOPPINGINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.shoppingInfo</code> attribute. 
	 * @param value the shoppingInfo
	 */
	public void setShoppingInfo(final ShoppingInfo value)
	{
		setShoppingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.timeFrom</code> attribute.
	 * @return the timeFrom - Opening Time
	 */
	public String getTimeFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.timeFrom</code> attribute.
	 * @return the timeFrom - Opening Time
	 */
	public String getTimeFrom()
	{
		return getTimeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.timeFrom</code> attribute. 
	 * @param value the timeFrom - Opening Time
	 */
	public void setTimeFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.timeFrom</code> attribute. 
	 * @param value the timeFrom - Opening Time
	 */
	public void setTimeFrom(final String value)
	{
		setTimeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.timeTo</code> attribute.
	 * @return the timeTo - Closing Time
	 */
	public String getTimeTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DayOfOperation.timeTo</code> attribute.
	 * @return the timeTo - Closing Time
	 */
	public String getTimeTo()
	{
		return getTimeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.timeTo</code> attribute. 
	 * @param value the timeTo - Closing Time
	 */
	public void setTimeTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DayOfOperation.timeTo</code> attribute. 
	 * @param value the timeTo - Closing Time
	 */
	public void setTimeTo(final String value)
	{
		setTimeTo( getSession().getSessionContext(), value );
	}
	
}
