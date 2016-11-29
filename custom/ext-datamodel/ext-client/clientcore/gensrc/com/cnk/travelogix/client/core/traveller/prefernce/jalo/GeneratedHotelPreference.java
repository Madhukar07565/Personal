/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.prefernce.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.traveller.jalo.TravellerProfile;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.prefernce.jalo.HotelPreference HotelPreference}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHotelPreference extends GenericItem
{
	/** Qualifier of the <code>HotelPreference.destinationCity</code> attribute **/
	public static final String DESTINATIONCITY = "destinationCity";
	/** Qualifier of the <code>HotelPreference.hotelName</code> attribute **/
	public static final String HOTELNAME = "hotelName";
	/** Qualifier of the <code>HotelPreference.hotelCategory</code> attribute **/
	public static final String HOTELCATEGORY = "hotelCategory";
	/** Qualifier of the <code>HotelPreference.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>HotelPreference.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>HotelPreference.amenities</code> attribute **/
	public static final String AMENITIES = "amenities";
	/** Qualifier of the <code>HotelPreference.roomNumber</code> attribute **/
	public static final String ROOMNUMBER = "roomNumber";
	/** Qualifier of the <code>HotelPreference.travellerProfile</code> attribute **/
	public static final String TRAVELLERPROFILE = "travellerProfile";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELLERPROFILE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedHotelPreference> TRAVELLERPROFILEHANDLER = new BidirectionalOneToManyHandler<GeneratedHotelPreference>(
	ClientcoreConstants.TC.HOTELPREFERENCE,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DESTINATIONCITY, AttributeMode.INITIAL);
		tmp.put(HOTELNAME, AttributeMode.INITIAL);
		tmp.put(HOTELCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(AMENITIES, AttributeMode.INITIAL);
		tmp.put(ROOMNUMBER, AttributeMode.INITIAL);
		tmp.put(TRAVELLERPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.amenities</code> attribute.
	 * @return the amenities
	 */
	public Collection<String> getAmenities(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, AMENITIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.amenities</code> attribute.
	 * @return the amenities
	 */
	public Collection<String> getAmenities()
	{
		return getAmenities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.amenities</code> attribute. 
	 * @param value the amenities
	 */
	public void setAmenities(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, AMENITIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.amenities</code> attribute. 
	 * @param value the amenities
	 */
	public void setAmenities(final Collection<String> value)
	{
		setAmenities( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELLERPROFILEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.destinationCity</code> attribute.
	 * @return the destinationCity
	 */
	public City getDestinationCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, DESTINATIONCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.destinationCity</code> attribute.
	 * @return the destinationCity
	 */
	public City getDestinationCity()
	{
		return getDestinationCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.destinationCity</code> attribute. 
	 * @param value the destinationCity
	 */
	public void setDestinationCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, DESTINATIONCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.destinationCity</code> attribute. 
	 * @param value the destinationCity
	 */
	public void setDestinationCity(final City value)
	{
		setDestinationCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.hotelCategory</code> attribute.
	 * @return the hotelCategory
	 */
	public EnumerationValue getHotelCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, HOTELCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.hotelCategory</code> attribute.
	 * @return the hotelCategory
	 */
	public EnumerationValue getHotelCategory()
	{
		return getHotelCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.hotelCategory</code> attribute. 
	 * @param value the hotelCategory
	 */
	public void setHotelCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, HOTELCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.hotelCategory</code> attribute. 
	 * @param value the hotelCategory
	 */
	public void setHotelCategory(final EnumerationValue value)
	{
		setHotelCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.hotelName</code> attribute.
	 * @return the hotelName
	 */
	public Product getHotelName(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, HOTELNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.hotelName</code> attribute.
	 * @return the hotelName
	 */
	public Product getHotelName()
	{
		return getHotelName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.hotelName</code> attribute. 
	 * @param value the hotelName
	 */
	public void setHotelName(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, HOTELNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.hotelName</code> attribute. 
	 * @param value the hotelName
	 */
	public void setHotelName(final Product value)
	{
		setHotelName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.roomNumber</code> attribute.
	 * @return the roomNumber
	 */
	public String getRoomNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.roomNumber</code> attribute.
	 * @return the roomNumber
	 */
	public String getRoomNumber()
	{
		return getRoomNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.roomNumber</code> attribute. 
	 * @param value the roomNumber
	 */
	public void setRoomNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.roomNumber</code> attribute. 
	 * @param value the roomNumber
	 */
	public void setRoomNumber(final String value)
	{
		setRoomNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx)
	{
		return (TravellerProfile)getProperty( ctx, TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HotelPreference.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile()
	{
		return getTravellerProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final TravellerProfile value)
	{
		TRAVELLERPROFILEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HotelPreference.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), value );
	}
	
}
