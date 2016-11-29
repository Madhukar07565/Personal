/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.RoomLevel;
import com.cnk.travelogix.client.core.companyoffer.jalo.AbstractOfferValue;
import com.cnk.travelogix.client.core.companyoffer.jalo.Passenger;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.FreeOrDiscountedOfferType FreeOrDiscountedOfferType}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFreeOrDiscountedOfferType extends AbstractOfferValue
{
	/** Qualifier of the <code>FreeOrDiscountedOfferType.freeOn</code> attribute **/
	public static final String FREEON = "freeOn";
	/** Qualifier of the <code>FreeOrDiscountedOfferType.noOfFrees</code> attribute **/
	public static final String NOOFFREES = "noOfFrees";
	/** Qualifier of the <code>FreeOrDiscountedOfferType.appliedOn</code> attribute **/
	public static final String APPLIEDON = "appliedOn";
	/** Qualifier of the <code>FreeOrDiscountedOfferType.roomLevelFree</code> attribute **/
	public static final String ROOMLEVELFREE = "roomLevelFree";
	/** Qualifier of the <code>FreeOrDiscountedOfferType.passengersFree</code> attribute **/
	public static final String PASSENGERSFREE = "passengersFree";
	/**
	* {@link OneToManyHandler} for handling 1:n ROOMLEVELFREE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RoomLevel> ROOMLEVELFREEHANDLER = new OneToManyHandler<RoomLevel>(
	ClientconfigConstants.TC.ROOMLEVEL,
	false,
	"freeRoomLevels",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PASSENGERSFREE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Passenger> PASSENGERSFREEHANDLER = new OneToManyHandler<Passenger>(
	ClientcoreConstants.TC.PASSENGER,
	false,
	"freePassengers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOfferValue.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FREEON, AttributeMode.INITIAL);
		tmp.put(NOOFFREES, AttributeMode.INITIAL);
		tmp.put(APPLIEDON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.appliedOn</code> attribute.
	 * @return the appliedOn
	 */
	public EnumerationValue getAppliedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPLIEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.appliedOn</code> attribute.
	 * @return the appliedOn
	 */
	public EnumerationValue getAppliedOn()
	{
		return getAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.appliedOn</code> attribute. 
	 * @param value the appliedOn
	 */
	public void setAppliedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.appliedOn</code> attribute. 
	 * @param value the appliedOn
	 */
	public void setAppliedOn(final EnumerationValue value)
	{
		setAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.freeOn</code> attribute.
	 * @return the freeOn
	 */
	public EnumerationValue getFreeOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FREEON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.freeOn</code> attribute.
	 * @return the freeOn
	 */
	public EnumerationValue getFreeOn()
	{
		return getFreeOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.freeOn</code> attribute. 
	 * @param value the freeOn
	 */
	public void setFreeOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FREEON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.freeOn</code> attribute. 
	 * @param value the freeOn
	 */
	public void setFreeOn(final EnumerationValue value)
	{
		setFreeOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.noOfFrees</code> attribute.
	 * @return the noOfFrees
	 */
	public Double getNoOfFrees(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NOOFFREES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.noOfFrees</code> attribute.
	 * @return the noOfFrees
	 */
	public Double getNoOfFrees()
	{
		return getNoOfFrees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.noOfFrees</code> attribute. 
	 * @return the noOfFrees
	 */
	public double getNoOfFreesAsPrimitive(final SessionContext ctx)
	{
		Double value = getNoOfFrees( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.noOfFrees</code> attribute. 
	 * @return the noOfFrees
	 */
	public double getNoOfFreesAsPrimitive()
	{
		return getNoOfFreesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.noOfFrees</code> attribute. 
	 * @param value the noOfFrees
	 */
	public void setNoOfFrees(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, NOOFFREES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.noOfFrees</code> attribute. 
	 * @param value the noOfFrees
	 */
	public void setNoOfFrees(final Double value)
	{
		setNoOfFrees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.noOfFrees</code> attribute. 
	 * @param value the noOfFrees
	 */
	public void setNoOfFrees(final SessionContext ctx, final double value)
	{
		setNoOfFrees( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.noOfFrees</code> attribute. 
	 * @param value the noOfFrees
	 */
	public void setNoOfFrees(final double value)
	{
		setNoOfFrees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.passengersFree</code> attribute.
	 * @return the passengersFree
	 */
	public Collection<Passenger> getPassengersFree(final SessionContext ctx)
	{
		return PASSENGERSFREEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.passengersFree</code> attribute.
	 * @return the passengersFree
	 */
	public Collection<Passenger> getPassengersFree()
	{
		return getPassengersFree( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.passengersFree</code> attribute. 
	 * @param value the passengersFree
	 */
	public void setPassengersFree(final SessionContext ctx, final Collection<Passenger> value)
	{
		PASSENGERSFREEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.passengersFree</code> attribute. 
	 * @param value the passengersFree
	 */
	public void setPassengersFree(final Collection<Passenger> value)
	{
		setPassengersFree( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to passengersFree. 
	 * @param value the item to add to passengersFree
	 */
	public void addToPassengersFree(final SessionContext ctx, final Passenger value)
	{
		PASSENGERSFREEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to passengersFree. 
	 * @param value the item to add to passengersFree
	 */
	public void addToPassengersFree(final Passenger value)
	{
		addToPassengersFree( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from passengersFree. 
	 * @param value the item to remove from passengersFree
	 */
	public void removeFromPassengersFree(final SessionContext ctx, final Passenger value)
	{
		PASSENGERSFREEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from passengersFree. 
	 * @param value the item to remove from passengersFree
	 */
	public void removeFromPassengersFree(final Passenger value)
	{
		removeFromPassengersFree( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.roomLevelFree</code> attribute.
	 * @return the roomLevelFree
	 */
	public Collection<RoomLevel> getRoomLevelFree(final SessionContext ctx)
	{
		return ROOMLEVELFREEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOrDiscountedOfferType.roomLevelFree</code> attribute.
	 * @return the roomLevelFree
	 */
	public Collection<RoomLevel> getRoomLevelFree()
	{
		return getRoomLevelFree( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.roomLevelFree</code> attribute. 
	 * @param value the roomLevelFree
	 */
	public void setRoomLevelFree(final SessionContext ctx, final Collection<RoomLevel> value)
	{
		ROOMLEVELFREEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOrDiscountedOfferType.roomLevelFree</code> attribute. 
	 * @param value the roomLevelFree
	 */
	public void setRoomLevelFree(final Collection<RoomLevel> value)
	{
		setRoomLevelFree( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomLevelFree. 
	 * @param value the item to add to roomLevelFree
	 */
	public void addToRoomLevelFree(final SessionContext ctx, final RoomLevel value)
	{
		ROOMLEVELFREEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomLevelFree. 
	 * @param value the item to add to roomLevelFree
	 */
	public void addToRoomLevelFree(final RoomLevel value)
	{
		addToRoomLevelFree( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomLevelFree. 
	 * @param value the item to remove from roomLevelFree
	 */
	public void removeFromRoomLevelFree(final SessionContext ctx, final RoomLevel value)
	{
		ROOMLEVELFREEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomLevelFree. 
	 * @param value the item to remove from roomLevelFree
	 */
	public void removeFromRoomLevelFree(final RoomLevel value)
	{
		removeFromRoomLevelFree( getSession().getSessionContext(), value );
	}
	
}
