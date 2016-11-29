/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.holiday.inventory.jalo;

import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayInventoryDetail;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayRoomInfo HolidayRoomInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayRoomInfo extends GenericItem
{
	/** Qualifier of the <code>HolidayRoomInfo.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>HolidayRoomInfo.checkInDate</code> attribute **/
	public static final String CHECKINDATE = "checkInDate";
	/** Qualifier of the <code>HolidayRoomInfo.checkOutDate</code> attribute **/
	public static final String CHECKOUTDATE = "checkOutDate";
	/** Qualifier of the <code>HolidayRoomInfo.accommodation</code> attribute **/
	public static final String ACCOMMODATION = "accommodation";
	/** Qualifier of the <code>HolidayRoomInfo.rating</code> attribute **/
	public static final String RATING = "rating";
	/** Qualifier of the <code>HolidayRoomInfo.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>HolidayRoomInfo.holidayInventoryDetail</code> attribute **/
	public static final String HOLIDAYINVENTORYDETAIL = "holidayInventoryDetail";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOLIDAYINVENTORYDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedHolidayRoomInfo> HOLIDAYINVENTORYDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedHolidayRoomInfo>(
	HolidayinventorycoreConstants.TC.HOLIDAYROOMINFO,
	false,
	"holidayInventoryDetail",
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
		tmp.put(CHECKINDATE, AttributeMode.INITIAL);
		tmp.put(CHECKOUTDATE, AttributeMode.INITIAL);
		tmp.put(ACCOMMODATION, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(HOLIDAYINVENTORYDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.accommodation</code> attribute.
	 * @return the accommodation - Inventory holiday request accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.accommodation</code> attribute.
	 * @return the accommodation - Inventory holiday request accommodation
	 */
	public Accommodation getAccommodation()
	{
		return getAccommodation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.accommodation</code> attribute. 
	 * @param value the accommodation - Inventory holiday request accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final Accommodation value)
	{
		setProperty(ctx, ACCOMMODATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.accommodation</code> attribute. 
	 * @param value the accommodation - Inventory holiday request accommodation
	 */
	public void setAccommodation(final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.checkInDate</code> attribute.
	 * @return the checkInDate - Room Check In Date
	 */
	public Date getCheckInDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CHECKINDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.checkInDate</code> attribute.
	 * @return the checkInDate - Room Check In Date
	 */
	public Date getCheckInDate()
	{
		return getCheckInDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.checkInDate</code> attribute. 
	 * @param value the checkInDate - Room Check In Date
	 */
	public void setCheckInDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CHECKINDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.checkInDate</code> attribute. 
	 * @param value the checkInDate - Room Check In Date
	 */
	public void setCheckInDate(final Date value)
	{
		setCheckInDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.checkOutDate</code> attribute.
	 * @return the checkOutDate - Room Check Out Date
	 */
	public Date getCheckOutDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CHECKOUTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.checkOutDate</code> attribute.
	 * @return the checkOutDate - Room Check Out Date
	 */
	public Date getCheckOutDate()
	{
		return getCheckOutDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.checkOutDate</code> attribute. 
	 * @param value the checkOutDate - Room Check Out Date
	 */
	public void setCheckOutDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CHECKOUTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.checkOutDate</code> attribute. 
	 * @param value the checkOutDate - Room Check Out Date
	 */
	public void setCheckOutDate(final Date value)
	{
		setCheckOutDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.city</code> attribute.
	 * @return the city - holiday Room Info City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.city</code> attribute.
	 * @return the city - holiday Room Info City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.city</code> attribute. 
	 * @param value the city - holiday Room Info City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.city</code> attribute. 
	 * @param value the city - holiday Room Info City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		HOLIDAYINVENTORYDETAILHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.holidayInventoryDetail</code> attribute.
	 * @return the holidayInventoryDetail
	 */
	public HolidayInventoryDetail getHolidayInventoryDetail(final SessionContext ctx)
	{
		return (HolidayInventoryDetail)getProperty( ctx, HOLIDAYINVENTORYDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.holidayInventoryDetail</code> attribute.
	 * @return the holidayInventoryDetail
	 */
	public HolidayInventoryDetail getHolidayInventoryDetail()
	{
		return getHolidayInventoryDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.holidayInventoryDetail</code> attribute. 
	 * @param value the holidayInventoryDetail
	 */
	public void setHolidayInventoryDetail(final SessionContext ctx, final HolidayInventoryDetail value)
	{
		HOLIDAYINVENTORYDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.holidayInventoryDetail</code> attribute. 
	 * @param value the holidayInventoryDetail
	 */
	public void setHolidayInventoryDetail(final HolidayInventoryDetail value)
	{
		setHolidayInventoryDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.rating</code> attribute.
	 * @return the rating - Inventory holiday request rating
	 */
	public EnumerationValue getRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.rating</code> attribute.
	 * @return the rating - Inventory holiday request rating
	 */
	public EnumerationValue getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.rating</code> attribute. 
	 * @param value the rating - Inventory holiday request rating
	 */
	public void setRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.rating</code> attribute. 
	 * @param value the rating - Inventory holiday request rating
	 */
	public void setRating(final EnumerationValue value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.roomCategory</code> attribute.
	 * @return the roomCategory - Inventory holiday request Room Category
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayRoomInfo.roomCategory</code> attribute.
	 * @return the roomCategory - Inventory holiday request Room Category
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.roomCategory</code> attribute. 
	 * @param value the roomCategory - Inventory holiday request Room Category
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayRoomInfo.roomCategory</code> attribute. 
	 * @param value the roomCategory - Inventory holiday request Room Category
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
}
