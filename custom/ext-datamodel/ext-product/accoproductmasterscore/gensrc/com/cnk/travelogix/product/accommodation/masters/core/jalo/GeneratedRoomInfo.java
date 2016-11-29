/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.accommodation.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.amenity.jalo.AmenityType;
import com.cnk.travelogix.masterdata.core.bath.jalo.BathType;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.product.accommodation.masters.core.constants.AccoproductmasterscoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
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
 * Generated class for type {@link com.cnk.travelogix.product.accommodation.masters.core.jalo.RoomInfo RoomInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoomInfo extends GenericItem
{
	/** Qualifier of the <code>RoomInfo.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>RoomInfo.roomView</code> attribute **/
	public static final String ROOMVIEW = "roomView";
	/** Qualifier of the <code>RoomInfo.noOfRooms</code> attribute **/
	public static final String NOOFROOMS = "noOfRooms";
	/** Qualifier of the <code>RoomInfo.roomName</code> attribute **/
	public static final String ROOMNAME = "roomName";
	/** Qualifier of the <code>RoomInfo.noOfInterconnectingRooms</code> attribute **/
	public static final String NOOFINTERCONNECTINGROOMS = "noOfInterconnectingRooms";
	/** Qualifier of the <code>RoomInfo.companyRoomCategory</code> attribute **/
	public static final String COMPANYROOMCATEGORY = "companyRoomCategory";
	/** Qualifier of the <code>RoomInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>RoomInfo.roomSize</code> attribute **/
	public static final String ROOMSIZE = "roomSize";
	/** Qualifier of the <code>RoomInfo.bathroomType</code> attribute **/
	public static final String BATHROOMTYPE = "bathroomType";
	/** Qualifier of the <code>RoomInfo.bedType</code> attribute **/
	public static final String BEDTYPE = "bedType";
	/** Qualifier of the <code>RoomInfo.roomDecor</code> attribute **/
	public static final String ROOMDECOR = "roomDecor";
	/** Qualifier of the <code>RoomInfo.smoking</code> attribute **/
	public static final String SMOKING = "smoking";
	/** Qualifier of the <code>RoomInfo.floorName</code> attribute **/
	public static final String FLOORNAME = "floorName";
	/** Qualifier of the <code>RoomInfo.floorNumber</code> attribute **/
	public static final String FLOORNUMBER = "floorNumber";
	/** Qualifier of the <code>RoomInfo.mysteryRoom</code> attribute **/
	public static final String MYSTERYROOM = "mysteryRoom";
	/** Qualifier of the <code>RoomInfo.roomId</code> attribute **/
	public static final String ROOMID = "roomId";
	/** Qualifier of the <code>RoomInfo.accommodation</code> attribute **/
	public static final String ACCOMMODATION = "accommodation";
	/** Qualifier of the <code>RoomInfo.amenityTypes</code> attribute **/
	public static final String AMENITYTYPES = "amenityTypes";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOMMODATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRoomInfo> ACCOMMODATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedRoomInfo>(
	AccoproductmasterscoreConstants.TC.ROOMINFO,
	false,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n AMENITYTYPES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AmenityType> AMENITYTYPESHANDLER = new OneToManyHandler<AmenityType>(
	MasterdatacoreConstants.TC.AMENITYTYPE,
	true,
	"roomInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMVIEW, AttributeMode.INITIAL);
		tmp.put(NOOFROOMS, AttributeMode.INITIAL);
		tmp.put(ROOMNAME, AttributeMode.INITIAL);
		tmp.put(NOOFINTERCONNECTINGROOMS, AttributeMode.INITIAL);
		tmp.put(COMPANYROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(ROOMSIZE, AttributeMode.INITIAL);
		tmp.put(BATHROOMTYPE, AttributeMode.INITIAL);
		tmp.put(BEDTYPE, AttributeMode.INITIAL);
		tmp.put(ROOMDECOR, AttributeMode.INITIAL);
		tmp.put(SMOKING, AttributeMode.INITIAL);
		tmp.put(FLOORNAME, AttributeMode.INITIAL);
		tmp.put(FLOORNUMBER, AttributeMode.INITIAL);
		tmp.put(MYSTERYROOM, AttributeMode.INITIAL);
		tmp.put(ROOMID, AttributeMode.INITIAL);
		tmp.put(ACCOMMODATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation()
	{
		return getAccommodation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final Accommodation value)
	{
		ACCOMMODATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.amenityTypes</code> attribute.
	 * @return the amenityTypes
	 */
	public Collection<AmenityType> getAmenityTypes(final SessionContext ctx)
	{
		return AMENITYTYPESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.amenityTypes</code> attribute.
	 * @return the amenityTypes
	 */
	public Collection<AmenityType> getAmenityTypes()
	{
		return getAmenityTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.amenityTypes</code> attribute. 
	 * @param value the amenityTypes
	 */
	public void setAmenityTypes(final SessionContext ctx, final Collection<AmenityType> value)
	{
		AMENITYTYPESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.amenityTypes</code> attribute. 
	 * @param value the amenityTypes
	 */
	public void setAmenityTypes(final Collection<AmenityType> value)
	{
		setAmenityTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to amenityTypes. 
	 * @param value the item to add to amenityTypes
	 */
	public void addToAmenityTypes(final SessionContext ctx, final AmenityType value)
	{
		AMENITYTYPESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to amenityTypes. 
	 * @param value the item to add to amenityTypes
	 */
	public void addToAmenityTypes(final AmenityType value)
	{
		addToAmenityTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from amenityTypes. 
	 * @param value the item to remove from amenityTypes
	 */
	public void removeFromAmenityTypes(final SessionContext ctx, final AmenityType value)
	{
		AMENITYTYPESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from amenityTypes. 
	 * @param value the item to remove from amenityTypes
	 */
	public void removeFromAmenityTypes(final AmenityType value)
	{
		removeFromAmenityTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.bathroomType</code> attribute.
	 * @return the bathroomType - Bathroom Type
	 */
	public BathType getBathroomType(final SessionContext ctx)
	{
		return (BathType)getProperty( ctx, BATHROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.bathroomType</code> attribute.
	 * @return the bathroomType - Bathroom Type
	 */
	public BathType getBathroomType()
	{
		return getBathroomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.bathroomType</code> attribute. 
	 * @param value the bathroomType - Bathroom Type
	 */
	public void setBathroomType(final SessionContext ctx, final BathType value)
	{
		setProperty(ctx, BATHROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.bathroomType</code> attribute. 
	 * @param value the bathroomType - Bathroom Type
	 */
	public void setBathroomType(final BathType value)
	{
		setBathroomType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.bedType</code> attribute.
	 * @return the bedType - Bed Type
	 */
	public EnumerationValue getBedType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BEDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.bedType</code> attribute.
	 * @return the bedType - Bed Type
	 */
	public EnumerationValue getBedType()
	{
		return getBedType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.bedType</code> attribute. 
	 * @param value the bedType - Bed Type
	 */
	public void setBedType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BEDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.bedType</code> attribute. 
	 * @param value the bedType - Bed Type
	 */
	public void setBedType(final EnumerationValue value)
	{
		setBedType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.category</code> attribute.
	 * @return the category - Category
	 */
	public EnumerationValue getCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.category</code> attribute.
	 * @return the category - Category
	 */
	public EnumerationValue getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.category</code> attribute. 
	 * @param value the category - Category
	 */
	public void setCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.category</code> attribute. 
	 * @param value the category - Category
	 */
	public void setCategory(final EnumerationValue value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.companyRoomCategory</code> attribute.
	 * @return the companyRoomCategory - Company Room Category
	 */
	public EnumerationValue getCompanyRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.companyRoomCategory</code> attribute.
	 * @return the companyRoomCategory - Company Room Category
	 */
	public EnumerationValue getCompanyRoomCategory()
	{
		return getCompanyRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.companyRoomCategory</code> attribute. 
	 * @param value the companyRoomCategory - Company Room Category
	 */
	public void setCompanyRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.companyRoomCategory</code> attribute. 
	 * @param value the companyRoomCategory - Company Room Category
	 */
	public void setCompanyRoomCategory(final EnumerationValue value)
	{
		setCompanyRoomCategory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOMMODATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRoomInfo.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRoomInfo.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.floorName</code> attribute.
	 * @return the floorName - Floor Name
	 */
	public String getFloorName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLOORNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.floorName</code> attribute.
	 * @return the floorName - Floor Name
	 */
	public String getFloorName()
	{
		return getFloorName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.floorName</code> attribute. 
	 * @param value the floorName - Floor Name
	 */
	public void setFloorName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLOORNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.floorName</code> attribute. 
	 * @param value the floorName - Floor Name
	 */
	public void setFloorName(final String value)
	{
		setFloorName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.floorNumber</code> attribute.
	 * @return the floorNumber - Floor Number
	 */
	public String getFloorNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLOORNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.floorNumber</code> attribute.
	 * @return the floorNumber - Floor Number
	 */
	public String getFloorNumber()
	{
		return getFloorNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.floorNumber</code> attribute. 
	 * @param value the floorNumber - Floor Number
	 */
	public void setFloorNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLOORNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.floorNumber</code> attribute. 
	 * @param value the floorNumber - Floor Number
	 */
	public void setFloorNumber(final String value)
	{
		setFloorNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.mysteryRoom</code> attribute.
	 * @return the mysteryRoom - Mystery Room
	 */
	public Boolean isMysteryRoom(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MYSTERYROOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.mysteryRoom</code> attribute.
	 * @return the mysteryRoom - Mystery Room
	 */
	public Boolean isMysteryRoom()
	{
		return isMysteryRoom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.mysteryRoom</code> attribute. 
	 * @return the mysteryRoom - Mystery Room
	 */
	public boolean isMysteryRoomAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMysteryRoom( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.mysteryRoom</code> attribute. 
	 * @return the mysteryRoom - Mystery Room
	 */
	public boolean isMysteryRoomAsPrimitive()
	{
		return isMysteryRoomAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.mysteryRoom</code> attribute. 
	 * @param value the mysteryRoom - Mystery Room
	 */
	public void setMysteryRoom(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MYSTERYROOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.mysteryRoom</code> attribute. 
	 * @param value the mysteryRoom - Mystery Room
	 */
	public void setMysteryRoom(final Boolean value)
	{
		setMysteryRoom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.mysteryRoom</code> attribute. 
	 * @param value the mysteryRoom - Mystery Room
	 */
	public void setMysteryRoom(final SessionContext ctx, final boolean value)
	{
		setMysteryRoom( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.mysteryRoom</code> attribute. 
	 * @param value the mysteryRoom - Mystery Room
	 */
	public void setMysteryRoom(final boolean value)
	{
		setMysteryRoom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.noOfInterconnectingRooms</code> attribute.
	 * @return the noOfInterconnectingRooms - No Of Inter connecting Rooms
	 */
	public Integer getNoOfInterconnectingRooms(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFINTERCONNECTINGROOMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.noOfInterconnectingRooms</code> attribute.
	 * @return the noOfInterconnectingRooms - No Of Inter connecting Rooms
	 */
	public Integer getNoOfInterconnectingRooms()
	{
		return getNoOfInterconnectingRooms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.noOfInterconnectingRooms</code> attribute. 
	 * @return the noOfInterconnectingRooms - No Of Inter connecting Rooms
	 */
	public int getNoOfInterconnectingRoomsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfInterconnectingRooms( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.noOfInterconnectingRooms</code> attribute. 
	 * @return the noOfInterconnectingRooms - No Of Inter connecting Rooms
	 */
	public int getNoOfInterconnectingRoomsAsPrimitive()
	{
		return getNoOfInterconnectingRoomsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.noOfInterconnectingRooms</code> attribute. 
	 * @param value the noOfInterconnectingRooms - No Of Inter connecting Rooms
	 */
	public void setNoOfInterconnectingRooms(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFINTERCONNECTINGROOMS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.noOfInterconnectingRooms</code> attribute. 
	 * @param value the noOfInterconnectingRooms - No Of Inter connecting Rooms
	 */
	public void setNoOfInterconnectingRooms(final Integer value)
	{
		setNoOfInterconnectingRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.noOfInterconnectingRooms</code> attribute. 
	 * @param value the noOfInterconnectingRooms - No Of Inter connecting Rooms
	 */
	public void setNoOfInterconnectingRooms(final SessionContext ctx, final int value)
	{
		setNoOfInterconnectingRooms( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.noOfInterconnectingRooms</code> attribute. 
	 * @param value the noOfInterconnectingRooms - No Of Inter connecting Rooms
	 */
	public void setNoOfInterconnectingRooms(final int value)
	{
		setNoOfInterconnectingRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.noOfRooms</code> attribute.
	 * @return the noOfRooms - no Of Rooms
	 */
	public Integer getNoOfRooms(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFROOMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.noOfRooms</code> attribute.
	 * @return the noOfRooms - no Of Rooms
	 */
	public Integer getNoOfRooms()
	{
		return getNoOfRooms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.noOfRooms</code> attribute. 
	 * @return the noOfRooms - no Of Rooms
	 */
	public int getNoOfRoomsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfRooms( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.noOfRooms</code> attribute. 
	 * @return the noOfRooms - no Of Rooms
	 */
	public int getNoOfRoomsAsPrimitive()
	{
		return getNoOfRoomsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.noOfRooms</code> attribute. 
	 * @param value the noOfRooms - no Of Rooms
	 */
	public void setNoOfRooms(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFROOMS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.noOfRooms</code> attribute. 
	 * @param value the noOfRooms - no Of Rooms
	 */
	public void setNoOfRooms(final Integer value)
	{
		setNoOfRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.noOfRooms</code> attribute. 
	 * @param value the noOfRooms - no Of Rooms
	 */
	public void setNoOfRooms(final SessionContext ctx, final int value)
	{
		setNoOfRooms( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.noOfRooms</code> attribute. 
	 * @param value the noOfRooms - no Of Rooms
	 */
	public void setNoOfRooms(final int value)
	{
		setNoOfRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomDecor</code> attribute.
	 * @return the roomDecor - Room Decor
	 */
	public String getRoomDecor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMDECOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomDecor</code> attribute.
	 * @return the roomDecor - Room Decor
	 */
	public String getRoomDecor()
	{
		return getRoomDecor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomDecor</code> attribute. 
	 * @param value the roomDecor - Room Decor
	 */
	public void setRoomDecor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMDECOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomDecor</code> attribute. 
	 * @param value the roomDecor - Room Decor
	 */
	public void setRoomDecor(final String value)
	{
		setRoomDecor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomId</code> attribute.
	 * @return the roomId - Room ID
	 */
	public String getRoomId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomId</code> attribute.
	 * @return the roomId - Room ID
	 */
	public String getRoomId()
	{
		return getRoomId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomId</code> attribute. 
	 * @param value the roomId - Room ID
	 */
	public void setRoomId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomId</code> attribute. 
	 * @param value the roomId - Room ID
	 */
	public void setRoomId(final String value)
	{
		setRoomId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomName</code> attribute.
	 * @return the roomName - Room Name
	 */
	public String getRoomName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRoomInfo.getRoomName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, ROOMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomName</code> attribute.
	 * @return the roomName - Room Name
	 */
	public String getRoomName()
	{
		return getRoomName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomName</code> attribute. 
	 * @return the localized roomName - Room Name
	 */
	public Map<Language,String> getAllRoomName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,ROOMNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomName</code> attribute. 
	 * @return the localized roomName - Room Name
	 */
	public Map<Language,String> getAllRoomName()
	{
		return getAllRoomName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomName</code> attribute. 
	 * @param value the roomName - Room Name
	 */
	public void setRoomName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRoomInfo.setRoomName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ROOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomName</code> attribute. 
	 * @param value the roomName - Room Name
	 */
	public void setRoomName(final String value)
	{
		setRoomName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomName</code> attribute. 
	 * @param value the roomName - Room Name
	 */
	public void setAllRoomName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,ROOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomName</code> attribute. 
	 * @param value the roomName - Room Name
	 */
	public void setAllRoomName(final Map<Language,String> value)
	{
		setAllRoomName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomSize</code> attribute.
	 * @return the roomSize - Room Size
	 */
	public String getRoomSize(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomSize</code> attribute.
	 * @return the roomSize - Room Size
	 */
	public String getRoomSize()
	{
		return getRoomSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomSize</code> attribute. 
	 * @param value the roomSize - Room Size
	 */
	public void setRoomSize(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMSIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomSize</code> attribute. 
	 * @param value the roomSize - Room Size
	 */
	public void setRoomSize(final String value)
	{
		setRoomSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomView</code> attribute.
	 * @return the roomView - RoomView
	 */
	public String getRoomView(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMVIEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.roomView</code> attribute.
	 * @return the roomView - RoomView
	 */
	public String getRoomView()
	{
		return getRoomView( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomView</code> attribute. 
	 * @param value the roomView - RoomView
	 */
	public void setRoomView(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMVIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.roomView</code> attribute. 
	 * @param value the roomView - RoomView
	 */
	public void setRoomView(final String value)
	{
		setRoomView( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.smoking</code> attribute.
	 * @return the smoking - Smoking
	 */
	public Boolean isSmoking(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SMOKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.smoking</code> attribute.
	 * @return the smoking - Smoking
	 */
	public Boolean isSmoking()
	{
		return isSmoking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.smoking</code> attribute. 
	 * @return the smoking - Smoking
	 */
	public boolean isSmokingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSmoking( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomInfo.smoking</code> attribute. 
	 * @return the smoking - Smoking
	 */
	public boolean isSmokingAsPrimitive()
	{
		return isSmokingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.smoking</code> attribute. 
	 * @param value the smoking - Smoking
	 */
	public void setSmoking(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SMOKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.smoking</code> attribute. 
	 * @param value the smoking - Smoking
	 */
	public void setSmoking(final Boolean value)
	{
		setSmoking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.smoking</code> attribute. 
	 * @param value the smoking - Smoking
	 */
	public void setSmoking(final SessionContext ctx, final boolean value)
	{
		setSmoking( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomInfo.smoking</code> attribute. 
	 * @param value the smoking - Smoking
	 */
	public void setSmoking(final boolean value)
	{
		setSmoking( getSession().getSessionContext(), value );
	}
	
}
