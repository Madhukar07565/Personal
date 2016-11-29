/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProductSubType;
import com.cnk.travelogix.product.activity.masters.core.jalo.DiningInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.Inclusion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
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
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.SeatingInfo SeatingInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSeatingInfo extends GenericItem
{
	/** Qualifier of the <code>SeatingInfo.seatType</code> attribute **/
	public static final String SEATTYPE = "seatType";
	/** Qualifier of the <code>SeatingInfo.seatingArrangments</code> attribute **/
	public static final String SEATINGARRANGMENTS = "seatingArrangments";
	/** Qualifier of the <code>SeatingInfo.purpose</code> attribute **/
	public static final String PURPOSE = "purpose";
	/** Qualifier of the <code>SeatingInfo.roomName</code> attribute **/
	public static final String ROOMNAME = "roomName";
	/** Qualifier of the <code>SeatingInfo.seatingCapacity</code> attribute **/
	public static final String SEATINGCAPACITY = "seatingCapacity";
	/** Qualifier of the <code>SeatingInfo.dateRange</code> attribute **/
	public static final String DATERANGE = "dateRange";
	/** Qualifier of the <code>SeatingInfo.media</code> attribute **/
	public static final String MEDIA = "media";
	/** Qualifier of the <code>SeatingInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>SeatingInfo.rowNumber</code> attribute **/
	public static final String ROWNUMBER = "rowNumber";
	/** Qualifier of the <code>SeatingInfo.seatFrom</code> attribute **/
	public static final String SEATFROM = "seatFrom";
	/** Qualifier of the <code>SeatingInfo.seatTo</code> attribute **/
	public static final String SEATTO = "seatTo";
	/** Qualifier of the <code>SeatingInfo.screenName</code> attribute **/
	public static final String SCREENNAME = "screenName";
	/** Qualifier of the <code>SeatingInfo.seatingClass</code> attribute **/
	public static final String SEATINGCLASS = "seatingClass";
	/** Qualifier of the <code>SeatingInfo.restaurant</code> attribute **/
	public static final String RESTAURANT = "restaurant";
	/** Qualifier of the <code>SeatingInfo.activityProductSubTypeSeatingArrangement</code> attribute **/
	public static final String ACTIVITYPRODUCTSUBTYPESEATINGARRANGEMENT = "activityProductSubTypeSeatingArrangement";
	/** Qualifier of the <code>SeatingInfo.inclusionSeatingInfo</code> attribute **/
	public static final String INCLUSIONSEATINGINFO = "inclusionSeatingInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RESTAURANT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSeatingInfo> RESTAURANTHANDLER = new BidirectionalOneToManyHandler<GeneratedSeatingInfo>(
	ActivityproductmasterscoreConstants.TC.SEATINGINFO,
	false,
	"restaurant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCTSUBTYPESEATINGARRANGEMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSeatingInfo> ACTIVITYPRODUCTSUBTYPESEATINGARRANGEMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedSeatingInfo>(
	ActivityproductmasterscoreConstants.TC.SEATINGINFO,
	false,
	"activityProductSubTypeSeatingArrangement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INCLUSIONSEATINGINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSeatingInfo> INCLUSIONSEATINGINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedSeatingInfo>(
	ActivityproductmasterscoreConstants.TC.SEATINGINFO,
	false,
	"inclusionSeatingInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SEATTYPE, AttributeMode.INITIAL);
		tmp.put(SEATINGARRANGMENTS, AttributeMode.INITIAL);
		tmp.put(PURPOSE, AttributeMode.INITIAL);
		tmp.put(ROOMNAME, AttributeMode.INITIAL);
		tmp.put(SEATINGCAPACITY, AttributeMode.INITIAL);
		tmp.put(DATERANGE, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(ROWNUMBER, AttributeMode.INITIAL);
		tmp.put(SEATFROM, AttributeMode.INITIAL);
		tmp.put(SEATTO, AttributeMode.INITIAL);
		tmp.put(SCREENNAME, AttributeMode.INITIAL);
		tmp.put(SEATINGCLASS, AttributeMode.INITIAL);
		tmp.put(RESTAURANT, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCTSUBTYPESEATINGARRANGEMENT, AttributeMode.INITIAL);
		tmp.put(INCLUSIONSEATINGINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.activityProductSubTypeSeatingArrangement</code> attribute.
	 * @return the activityProductSubTypeSeatingArrangement
	 */
	public ActivityProductSubType getActivityProductSubTypeSeatingArrangement(final SessionContext ctx)
	{
		return (ActivityProductSubType)getProperty( ctx, ACTIVITYPRODUCTSUBTYPESEATINGARRANGEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.activityProductSubTypeSeatingArrangement</code> attribute.
	 * @return the activityProductSubTypeSeatingArrangement
	 */
	public ActivityProductSubType getActivityProductSubTypeSeatingArrangement()
	{
		return getActivityProductSubTypeSeatingArrangement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.activityProductSubTypeSeatingArrangement</code> attribute. 
	 * @param value the activityProductSubTypeSeatingArrangement
	 */
	public void setActivityProductSubTypeSeatingArrangement(final SessionContext ctx, final ActivityProductSubType value)
	{
		ACTIVITYPRODUCTSUBTYPESEATINGARRANGEMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.activityProductSubTypeSeatingArrangement</code> attribute. 
	 * @param value the activityProductSubTypeSeatingArrangement
	 */
	public void setActivityProductSubTypeSeatingArrangement(final ActivityProductSubType value)
	{
		setActivityProductSubTypeSeatingArrangement( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RESTAURANTHANDLER.newInstance(ctx, allAttributes);
		ACTIVITYPRODUCTSUBTYPESEATINGARRANGEMENTHANDLER.newInstance(ctx, allAttributes);
		INCLUSIONSEATINGINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.dateRange</code> attribute.
	 * @return the dateRange - Date Range
	 */
	public StandardDateRange getDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, DATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.dateRange</code> attribute.
	 * @return the dateRange - Date Range
	 */
	public StandardDateRange getDateRange()
	{
		return getDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.dateRange</code> attribute. 
	 * @param value the dateRange - Date Range
	 */
	public void setDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, DATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.dateRange</code> attribute. 
	 * @param value the dateRange - Date Range
	 */
	public void setDateRange(final StandardDateRange value)
	{
		setDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.description</code> attribute.
	 * @return the description - Description.
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSeatingInfo.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.description</code> attribute.
	 * @return the description - Description.
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.description</code> attribute. 
	 * @return the localized description - Description.
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.description</code> attribute. 
	 * @return the localized description - Description.
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSeatingInfo.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.inclusionSeatingInfo</code> attribute.
	 * @return the inclusionSeatingInfo
	 */
	public Inclusion getInclusionSeatingInfo(final SessionContext ctx)
	{
		return (Inclusion)getProperty( ctx, INCLUSIONSEATINGINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.inclusionSeatingInfo</code> attribute.
	 * @return the inclusionSeatingInfo
	 */
	public Inclusion getInclusionSeatingInfo()
	{
		return getInclusionSeatingInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.inclusionSeatingInfo</code> attribute. 
	 * @param value the inclusionSeatingInfo
	 */
	public void setInclusionSeatingInfo(final SessionContext ctx, final Inclusion value)
	{
		INCLUSIONSEATINGINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.inclusionSeatingInfo</code> attribute. 
	 * @param value the inclusionSeatingInfo
	 */
	public void setInclusionSeatingInfo(final Inclusion value)
	{
		setInclusionSeatingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.media</code> attribute.
	 * @return the media - Media.
	 */
	public Collection<Media> getMedia(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.media</code> attribute.
	 * @return the media - Media.
	 */
	public Collection<Media> getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.media</code> attribute. 
	 * @param value the media - Media.
	 */
	public void setMedia(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.media</code> attribute. 
	 * @param value the media - Media.
	 */
	public void setMedia(final Collection<Media> value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.purpose</code> attribute.
	 * @return the purpose - Purpose
	 */
	public EnumerationValue getPurpose(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PURPOSE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.purpose</code> attribute.
	 * @return the purpose - Purpose
	 */
	public EnumerationValue getPurpose()
	{
		return getPurpose( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.purpose</code> attribute. 
	 * @param value the purpose - Purpose
	 */
	public void setPurpose(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PURPOSE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.purpose</code> attribute. 
	 * @param value the purpose - Purpose
	 */
	public void setPurpose(final EnumerationValue value)
	{
		setPurpose( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.restaurant</code> attribute.
	 * @return the restaurant
	 */
	public DiningInfo getRestaurant(final SessionContext ctx)
	{
		return (DiningInfo)getProperty( ctx, RESTAURANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.restaurant</code> attribute.
	 * @return the restaurant
	 */
	public DiningInfo getRestaurant()
	{
		return getRestaurant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.restaurant</code> attribute. 
	 * @param value the restaurant
	 */
	public void setRestaurant(final SessionContext ctx, final DiningInfo value)
	{
		RESTAURANTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.restaurant</code> attribute. 
	 * @param value the restaurant
	 */
	public void setRestaurant(final DiningInfo value)
	{
		setRestaurant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.roomName</code> attribute.
	 * @return the roomName - Name
	 */
	public String getRoomName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSeatingInfo.getRoomName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, ROOMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.roomName</code> attribute.
	 * @return the roomName - Name
	 */
	public String getRoomName()
	{
		return getRoomName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.roomName</code> attribute. 
	 * @return the localized roomName - Name
	 */
	public Map<Language,String> getAllRoomName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,ROOMNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.roomName</code> attribute. 
	 * @return the localized roomName - Name
	 */
	public Map<Language,String> getAllRoomName()
	{
		return getAllRoomName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.roomName</code> attribute. 
	 * @param value the roomName - Name
	 */
	public void setRoomName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSeatingInfo.setRoomName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ROOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.roomName</code> attribute. 
	 * @param value the roomName - Name
	 */
	public void setRoomName(final String value)
	{
		setRoomName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.roomName</code> attribute. 
	 * @param value the roomName - Name
	 */
	public void setAllRoomName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,ROOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.roomName</code> attribute. 
	 * @param value the roomName - Name
	 */
	public void setAllRoomName(final Map<Language,String> value)
	{
		setAllRoomName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.rowNumber</code> attribute.
	 * @return the rowNumber - Row Number.
	 */
	public String getRowNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROWNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.rowNumber</code> attribute.
	 * @return the rowNumber - Row Number.
	 */
	public String getRowNumber()
	{
		return getRowNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.rowNumber</code> attribute. 
	 * @param value the rowNumber - Row Number.
	 */
	public void setRowNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROWNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.rowNumber</code> attribute. 
	 * @param value the rowNumber - Row Number.
	 */
	public void setRowNumber(final String value)
	{
		setRowNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.screenName</code> attribute.
	 * @return the screenName - Screen Name
	 */
	public String getScreenName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SCREENNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.screenName</code> attribute.
	 * @return the screenName - Screen Name
	 */
	public String getScreenName()
	{
		return getScreenName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.screenName</code> attribute. 
	 * @param value the screenName - Screen Name
	 */
	public void setScreenName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SCREENNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.screenName</code> attribute. 
	 * @param value the screenName - Screen Name
	 */
	public void setScreenName(final String value)
	{
		setScreenName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatFrom</code> attribute.
	 * @return the seatFrom - Seat From.
	 */
	public String getSeatFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEATFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatFrom</code> attribute.
	 * @return the seatFrom - Seat From.
	 */
	public String getSeatFrom()
	{
		return getSeatFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatFrom</code> attribute. 
	 * @param value the seatFrom - Seat From.
	 */
	public void setSeatFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEATFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatFrom</code> attribute. 
	 * @param value the seatFrom - Seat From.
	 */
	public void setSeatFrom(final String value)
	{
		setSeatFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatingArrangments</code> attribute.
	 * @return the seatingArrangments - Seating Arrangement
	 */
	public EnumerationValue getSeatingArrangments(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEATINGARRANGMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatingArrangments</code> attribute.
	 * @return the seatingArrangments - Seating Arrangement
	 */
	public EnumerationValue getSeatingArrangments()
	{
		return getSeatingArrangments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatingArrangments</code> attribute. 
	 * @param value the seatingArrangments - Seating Arrangement
	 */
	public void setSeatingArrangments(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEATINGARRANGMENTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatingArrangments</code> attribute. 
	 * @param value the seatingArrangments - Seating Arrangement
	 */
	public void setSeatingArrangments(final EnumerationValue value)
	{
		setSeatingArrangments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatingCapacity</code> attribute.
	 * @return the seatingCapacity - Seating Capacity.
	 */
	public String getSeatingCapacity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEATINGCAPACITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatingCapacity</code> attribute.
	 * @return the seatingCapacity - Seating Capacity.
	 */
	public String getSeatingCapacity()
	{
		return getSeatingCapacity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatingCapacity</code> attribute. 
	 * @param value the seatingCapacity - Seating Capacity.
	 */
	public void setSeatingCapacity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEATINGCAPACITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatingCapacity</code> attribute. 
	 * @param value the seatingCapacity - Seating Capacity.
	 */
	public void setSeatingCapacity(final String value)
	{
		setSeatingCapacity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatingClass</code> attribute.
	 * @return the seatingClass - Seating Class
	 */
	public String getSeatingClass(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEATINGCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatingClass</code> attribute.
	 * @return the seatingClass - Seating Class
	 */
	public String getSeatingClass()
	{
		return getSeatingClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatingClass</code> attribute. 
	 * @param value the seatingClass - Seating Class
	 */
	public void setSeatingClass(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEATINGCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatingClass</code> attribute. 
	 * @param value the seatingClass - Seating Class
	 */
	public void setSeatingClass(final String value)
	{
		setSeatingClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatTo</code> attribute.
	 * @return the seatTo - Seat To.
	 */
	public String getSeatTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEATTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatTo</code> attribute.
	 * @return the seatTo - Seat To.
	 */
	public String getSeatTo()
	{
		return getSeatTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatTo</code> attribute. 
	 * @param value the seatTo - Seat To.
	 */
	public void setSeatTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEATTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatTo</code> attribute. 
	 * @param value the seatTo - Seat To.
	 */
	public void setSeatTo(final String value)
	{
		setSeatTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatType</code> attribute.
	 * @return the seatType - Seat Type
	 */
	public EnumerationValue getSeatType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEATTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeatingInfo.seatType</code> attribute.
	 * @return the seatType - Seat Type
	 */
	public EnumerationValue getSeatType()
	{
		return getSeatType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatType</code> attribute. 
	 * @param value the seatType - Seat Type
	 */
	public void setSeatType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEATTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeatingInfo.seatType</code> attribute. 
	 * @param value the seatType - Seat Type
	 */
	public void setSeatType(final EnumerationValue value)
	{
		setSeatType( getSession().getSessionContext(), value );
	}
	
}
