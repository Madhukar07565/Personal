/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.Location;
import com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails;
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
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.PickupAndDropOff PickupAndDropOff}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPickupAndDropOff extends GenericItem
{
	/** Qualifier of the <code>PickupAndDropOff.transferType</code> attribute **/
	public static final String TRANSFERTYPE = "transferType";
	/** Qualifier of the <code>PickupAndDropOff.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>PickupAndDropOff.fromTo</code> attribute **/
	public static final String FROMTO = "fromTo";
	/** Qualifier of the <code>PickupAndDropOff.locationType</code> attribute **/
	public static final String LOCATIONTYPE = "locationType";
	/** Qualifier of the <code>PickupAndDropOff.locationName</code> attribute **/
	public static final String LOCATIONNAME = "locationName";
	/** Qualifier of the <code>PickupAndDropOff.pickUpAddress</code> attribute **/
	public static final String PICKUPADDRESS = "pickUpAddress";
	/** Qualifier of the <code>PickupAndDropOff.contactDetails</code> attribute **/
	public static final String CONTACTDETAILS = "contactDetails";
	/** Qualifier of the <code>PickupAndDropOff.activityProductSubTypePickAndDropDetails</code> attribute **/
	public static final String ACTIVITYPRODUCTSUBTYPEPICKANDDROPDETAILS = "activityProductSubTypePickAndDropDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCTSUBTYPEPICKANDDROPDETAILS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPickupAndDropOff> ACTIVITYPRODUCTSUBTYPEPICKANDDROPDETAILSHANDLER = new BidirectionalOneToManyHandler<GeneratedPickupAndDropOff>(
	ActivityproductmasterscoreConstants.TC.PICKUPANDDROPOFF,
	false,
	"activityProductSubTypePickAndDropDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TRANSFERTYPE, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(FROMTO, AttributeMode.INITIAL);
		tmp.put(LOCATIONTYPE, AttributeMode.INITIAL);
		tmp.put(LOCATIONNAME, AttributeMode.INITIAL);
		tmp.put(PICKUPADDRESS, AttributeMode.INITIAL);
		tmp.put(CONTACTDETAILS, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCTSUBTYPEPICKANDDROPDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.activityProductSubTypePickAndDropDetails</code> attribute.
	 * @return the activityProductSubTypePickAndDropDetails
	 */
	public ActivityProductSubType getActivityProductSubTypePickAndDropDetails(final SessionContext ctx)
	{
		return (ActivityProductSubType)getProperty( ctx, ACTIVITYPRODUCTSUBTYPEPICKANDDROPDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.activityProductSubTypePickAndDropDetails</code> attribute.
	 * @return the activityProductSubTypePickAndDropDetails
	 */
	public ActivityProductSubType getActivityProductSubTypePickAndDropDetails()
	{
		return getActivityProductSubTypePickAndDropDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.activityProductSubTypePickAndDropDetails</code> attribute. 
	 * @param value the activityProductSubTypePickAndDropDetails
	 */
	public void setActivityProductSubTypePickAndDropDetails(final SessionContext ctx, final ActivityProductSubType value)
	{
		ACTIVITYPRODUCTSUBTYPEPICKANDDROPDETAILSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.activityProductSubTypePickAndDropDetails</code> attribute. 
	 * @param value the activityProductSubTypePickAndDropDetails
	 */
	public void setActivityProductSubTypePickAndDropDetails(final ActivityProductSubType value)
	{
		setActivityProductSubTypePickAndDropDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.contactDetails</code> attribute.
	 * @return the contactDetails - Contact Details
	 */
	public ContactDetails getContactDetails(final SessionContext ctx)
	{
		return (ContactDetails)getProperty( ctx, CONTACTDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.contactDetails</code> attribute.
	 * @return the contactDetails - Contact Details
	 */
	public ContactDetails getContactDetails()
	{
		return getContactDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.contactDetails</code> attribute. 
	 * @param value the contactDetails - Contact Details
	 */
	public void setContactDetails(final SessionContext ctx, final ContactDetails value)
	{
		setProperty(ctx, CONTACTDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.contactDetails</code> attribute. 
	 * @param value the contactDetails - Contact Details
	 */
	public void setContactDetails(final ContactDetails value)
	{
		setContactDetails( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYPRODUCTSUBTYPEPICKANDDROPDETAILSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.fromTo</code> attribute.
	 * @return the fromTo - Pick up from and drop off to
	 */
	public EnumerationValue getFromTo(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FROMTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.fromTo</code> attribute.
	 * @return the fromTo - Pick up from and drop off to
	 */
	public EnumerationValue getFromTo()
	{
		return getFromTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.fromTo</code> attribute. 
	 * @param value the fromTo - Pick up from and drop off to
	 */
	public void setFromTo(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FROMTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.fromTo</code> attribute. 
	 * @param value the fromTo - Pick up from and drop off to
	 */
	public void setFromTo(final EnumerationValue value)
	{
		setFromTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.locationName</code> attribute.
	 * @return the locationName - Location Name
	 */
	public Location getLocationName(final SessionContext ctx)
	{
		return (Location)getProperty( ctx, LOCATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.locationName</code> attribute.
	 * @return the locationName - Location Name
	 */
	public Location getLocationName()
	{
		return getLocationName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.locationName</code> attribute. 
	 * @param value the locationName - Location Name
	 */
	public void setLocationName(final SessionContext ctx, final Location value)
	{
		setProperty(ctx, LOCATIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.locationName</code> attribute. 
	 * @param value the locationName - Location Name
	 */
	public void setLocationName(final Location value)
	{
		setLocationName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.locationType</code> attribute.
	 * @return the locationType - Location Type
	 */
	public EnumerationValue getLocationType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, LOCATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.locationType</code> attribute.
	 * @return the locationType - Location Type
	 */
	public EnumerationValue getLocationType()
	{
		return getLocationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.locationType</code> attribute. 
	 * @param value the locationType - Location Type
	 */
	public void setLocationType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, LOCATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.locationType</code> attribute. 
	 * @param value the locationType - Location Type
	 */
	public void setLocationType(final EnumerationValue value)
	{
		setLocationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.pickUpAddress</code> attribute.
	 * @return the pickUpAddress - PickUp Address
	 */
	public Address getPickUpAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, PICKUPADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.pickUpAddress</code> attribute.
	 * @return the pickUpAddress - PickUp Address
	 */
	public Address getPickUpAddress()
	{
		return getPickUpAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.pickUpAddress</code> attribute. 
	 * @param value the pickUpAddress - PickUp Address
	 */
	public void setPickUpAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, PICKUPADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.pickUpAddress</code> attribute. 
	 * @param value the pickUpAddress - PickUp Address
	 */
	public void setPickUpAddress(final Address value)
	{
		setPickUpAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.transferType</code> attribute.
	 * @return the transferType - Transfer type
	 */
	public EnumerationValue getTransferType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRANSFERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.transferType</code> attribute.
	 * @return the transferType - Transfer type
	 */
	public EnumerationValue getTransferType()
	{
		return getTransferType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.transferType</code> attribute. 
	 * @param value the transferType - Transfer type
	 */
	public void setTransferType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRANSFERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.transferType</code> attribute. 
	 * @param value the transferType - Transfer type
	 */
	public void setTransferType(final EnumerationValue value)
	{
		setTransferType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.type</code> attribute.
	 * @return the type - Type of pick up and drop off
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.type</code> attribute.
	 * @return the type - Type of pick up and drop off
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.type</code> attribute. 
	 * @param value the type - Type of pick up and drop off
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.type</code> attribute. 
	 * @param value the type - Type of pick up and drop off
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
