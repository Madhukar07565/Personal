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
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.TourItinerary TourItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTourItinerary extends GenericItem
{
	/** Qualifier of the <code>TourItinerary.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>TourItinerary.startTime</code> attribute **/
	public static final String STARTTIME = "startTime";
	/** Qualifier of the <code>TourItinerary.endTime</code> attribute **/
	public static final String ENDTIME = "endTime";
	/** Qualifier of the <code>TourItinerary.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>TourItinerary.dayName</code> attribute **/
	public static final String DAYNAME = "dayName";
	/** Qualifier of the <code>TourItinerary.media</code> attribute **/
	public static final String MEDIA = "media";
	/** Qualifier of the <code>TourItinerary.activityProductSubTypeTourItinerary</code> attribute **/
	public static final String ACTIVITYPRODUCTSUBTYPETOURITINERARY = "activityProductSubTypeTourItinerary";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCTSUBTYPETOURITINERARY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTourItinerary> ACTIVITYPRODUCTSUBTYPETOURITINERARYHANDLER = new BidirectionalOneToManyHandler<GeneratedTourItinerary>(
	ActivityproductmasterscoreConstants.TC.TOURITINERARY,
	false,
	"activityProductSubTypeTourItinerary",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(STARTTIME, AttributeMode.INITIAL);
		tmp.put(ENDTIME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(DAYNAME, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCTSUBTYPETOURITINERARY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.activityProductSubTypeTourItinerary</code> attribute.
	 * @return the activityProductSubTypeTourItinerary
	 */
	public ActivityProductSubType getActivityProductSubTypeTourItinerary(final SessionContext ctx)
	{
		return (ActivityProductSubType)getProperty( ctx, ACTIVITYPRODUCTSUBTYPETOURITINERARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.activityProductSubTypeTourItinerary</code> attribute.
	 * @return the activityProductSubTypeTourItinerary
	 */
	public ActivityProductSubType getActivityProductSubTypeTourItinerary()
	{
		return getActivityProductSubTypeTourItinerary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.activityProductSubTypeTourItinerary</code> attribute. 
	 * @param value the activityProductSubTypeTourItinerary
	 */
	public void setActivityProductSubTypeTourItinerary(final SessionContext ctx, final ActivityProductSubType value)
	{
		ACTIVITYPRODUCTSUBTYPETOURITINERARYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.activityProductSubTypeTourItinerary</code> attribute. 
	 * @param value the activityProductSubTypeTourItinerary
	 */
	public void setActivityProductSubTypeTourItinerary(final ActivityProductSubType value)
	{
		setActivityProductSubTypeTourItinerary( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYPRODUCTSUBTYPETOURITINERARYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.dayName</code> attribute.
	 * @return the dayName - Day name
	 */
	public String getDayName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DAYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.dayName</code> attribute.
	 * @return the dayName - Day name
	 */
	public String getDayName()
	{
		return getDayName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.dayName</code> attribute. 
	 * @param value the dayName - Day name
	 */
	public void setDayName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.dayName</code> attribute. 
	 * @param value the dayName - Day name
	 */
	public void setDayName(final String value)
	{
		setDayName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.endTime</code> attribute.
	 * @return the endTime - End time
	 */
	public String getEndTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ENDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.endTime</code> attribute.
	 * @return the endTime - End time
	 */
	public String getEndTime()
	{
		return getEndTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.endTime</code> attribute. 
	 * @param value the endTime - End time
	 */
	public void setEndTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ENDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.endTime</code> attribute. 
	 * @param value the endTime - End time
	 */
	public void setEndTime(final String value)
	{
		setEndTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.media</code> attribute.
	 * @return the media - tour Media
	 */
	public Collection<Media> getMedia(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.media</code> attribute.
	 * @return the media - tour Media
	 */
	public Collection<Media> getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.media</code> attribute. 
	 * @param value the media - tour Media
	 */
	public void setMedia(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.media</code> attribute. 
	 * @param value the media - tour Media
	 */
	public void setMedia(final Collection<Media> value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.startTime</code> attribute.
	 * @return the startTime - Start time
	 */
	public String getStartTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STARTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.startTime</code> attribute.
	 * @return the startTime - Start time
	 */
	public String getStartTime()
	{
		return getStartTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.startTime</code> attribute. 
	 * @param value the startTime - Start time
	 */
	public void setStartTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STARTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.startTime</code> attribute. 
	 * @param value the startTime - Start time
	 */
	public void setStartTime(final String value)
	{
		setStartTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.title</code> attribute.
	 * @return the title - Sub title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TourItinerary.title</code> attribute.
	 * @return the title - Sub title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.title</code> attribute. 
	 * @param value the title - Sub title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TourItinerary.title</code> attribute. 
	 * @param value the title - Sub title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
