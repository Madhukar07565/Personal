/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air;

import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.SupplierCommercialAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.flight.inclusionexclusion.FlightNumbersConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.flight.inclusionexclusion.FlightTimingsConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.BookingClassConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.DealCodeConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.FareBasisConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.passenger.SupCommAdvDefPassengerConfig;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.AirSupplierAdvanceDefinition AirSupplierAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirSupplierAdvanceDefinition extends SupplierCommercialAdvanceDefinition
{
	/** Qualifier of the <code>AirSupplierAdvanceDefinition.fareTypes</code> attribute **/
	public static final String FARETYPES = "fareTypes";
	/** Qualifier of the <code>AirSupplierAdvanceDefinition.flightTimings</code> attribute **/
	public static final String FLIGHTTIMINGS = "flightTimings";
	/** Qualifier of the <code>AirSupplierAdvanceDefinition.flightNumbers</code> attribute **/
	public static final String FLIGHTNUMBERS = "flightNumbers";
	/** Qualifier of the <code>AirSupplierAdvanceDefinition.bookingClasses</code> attribute **/
	public static final String BOOKINGCLASSES = "bookingClasses";
	/** Qualifier of the <code>AirSupplierAdvanceDefinition.fareClasses</code> attribute **/
	public static final String FARECLASSES = "fareClasses";
	/** Qualifier of the <code>AirSupplierAdvanceDefinition.dealCodes</code> attribute **/
	public static final String DEALCODES = "dealCodes";
	/** Qualifier of the <code>AirSupplierAdvanceDefinition.passengerTypes</code> attribute **/
	public static final String PASSENGERTYPES = "passengerTypes";
	/**
	* {@link OneToManyHandler} for handling 1:n FLIGHTTIMINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FlightTimingsConfig> FLIGHTTIMINGSHANDLER = new OneToManyHandler<FlightTimingsConfig>(
	SuppliercommercialscoreConstants.TC.FLIGHTTIMINGSCONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FLIGHTNUMBERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FlightNumbersConfig> FLIGHTNUMBERSHANDLER = new OneToManyHandler<FlightNumbersConfig>(
	SuppliercommercialscoreConstants.TC.FLIGHTNUMBERSCONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BOOKINGCLASSES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BookingClassConfig> BOOKINGCLASSESHANDLER = new OneToManyHandler<BookingClassConfig>(
	SuppliercommercialscoreConstants.TC.BOOKINGCLASSESCONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FARECLASSES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FareBasisConfig> FARECLASSESHANDLER = new OneToManyHandler<FareBasisConfig>(
	SuppliercommercialscoreConstants.TC.FARECLASSESCONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DEALCODES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DealCodeConfig> DEALCODESHANDLER = new OneToManyHandler<DealCodeConfig>(
	SuppliercommercialscoreConstants.TC.DEALCODECONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PASSENGERTYPES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirSupplierAdvanceDefinition> PASSENGERTYPESHANDLER = new BidirectionalOneToManyHandler<GeneratedAirSupplierAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.AIRSUPPLIERADVANCEDEFINITION,
	false,
	"passengerTypes",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SupplierCommercialAdvanceDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FARETYPES, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.bookingClasses</code> attribute.
	 * @return the bookingClasses
	 */
	public Collection<BookingClassConfig> getBookingClasses(final SessionContext ctx)
	{
		return BOOKINGCLASSESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.bookingClasses</code> attribute.
	 * @return the bookingClasses
	 */
	public Collection<BookingClassConfig> getBookingClasses()
	{
		return getBookingClasses( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.bookingClasses</code> attribute. 
	 * @param value the bookingClasses
	 */
	public void setBookingClasses(final SessionContext ctx, final Collection<BookingClassConfig> value)
	{
		BOOKINGCLASSESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.bookingClasses</code> attribute. 
	 * @param value the bookingClasses
	 */
	public void setBookingClasses(final Collection<BookingClassConfig> value)
	{
		setBookingClasses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingClasses. 
	 * @param value the item to add to bookingClasses
	 */
	public void addToBookingClasses(final SessionContext ctx, final BookingClassConfig value)
	{
		BOOKINGCLASSESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingClasses. 
	 * @param value the item to add to bookingClasses
	 */
	public void addToBookingClasses(final BookingClassConfig value)
	{
		addToBookingClasses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingClasses. 
	 * @param value the item to remove from bookingClasses
	 */
	public void removeFromBookingClasses(final SessionContext ctx, final BookingClassConfig value)
	{
		BOOKINGCLASSESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingClasses. 
	 * @param value the item to remove from bookingClasses
	 */
	public void removeFromBookingClasses(final BookingClassConfig value)
	{
		removeFromBookingClasses( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PASSENGERTYPESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.dealCodes</code> attribute.
	 * @return the dealCodes
	 */
	public Collection<DealCodeConfig> getDealCodes(final SessionContext ctx)
	{
		return DEALCODESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.dealCodes</code> attribute.
	 * @return the dealCodes
	 */
	public Collection<DealCodeConfig> getDealCodes()
	{
		return getDealCodes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.dealCodes</code> attribute. 
	 * @param value the dealCodes
	 */
	public void setDealCodes(final SessionContext ctx, final Collection<DealCodeConfig> value)
	{
		DEALCODESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.dealCodes</code> attribute. 
	 * @param value the dealCodes
	 */
	public void setDealCodes(final Collection<DealCodeConfig> value)
	{
		setDealCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealCodes. 
	 * @param value the item to add to dealCodes
	 */
	public void addToDealCodes(final SessionContext ctx, final DealCodeConfig value)
	{
		DEALCODESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealCodes. 
	 * @param value the item to add to dealCodes
	 */
	public void addToDealCodes(final DealCodeConfig value)
	{
		addToDealCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealCodes. 
	 * @param value the item to remove from dealCodes
	 */
	public void removeFromDealCodes(final SessionContext ctx, final DealCodeConfig value)
	{
		DEALCODESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealCodes. 
	 * @param value the item to remove from dealCodes
	 */
	public void removeFromDealCodes(final DealCodeConfig value)
	{
		removeFromDealCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.fareClasses</code> attribute.
	 * @return the fareClasses
	 */
	public Collection<FareBasisConfig> getFareClasses(final SessionContext ctx)
	{
		return FARECLASSESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.fareClasses</code> attribute.
	 * @return the fareClasses
	 */
	public Collection<FareBasisConfig> getFareClasses()
	{
		return getFareClasses( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.fareClasses</code> attribute. 
	 * @param value the fareClasses
	 */
	public void setFareClasses(final SessionContext ctx, final Collection<FareBasisConfig> value)
	{
		FARECLASSESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.fareClasses</code> attribute. 
	 * @param value the fareClasses
	 */
	public void setFareClasses(final Collection<FareBasisConfig> value)
	{
		setFareClasses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to fareClasses. 
	 * @param value the item to add to fareClasses
	 */
	public void addToFareClasses(final SessionContext ctx, final FareBasisConfig value)
	{
		FARECLASSESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to fareClasses. 
	 * @param value the item to add to fareClasses
	 */
	public void addToFareClasses(final FareBasisConfig value)
	{
		addToFareClasses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from fareClasses. 
	 * @param value the item to remove from fareClasses
	 */
	public void removeFromFareClasses(final SessionContext ctx, final FareBasisConfig value)
	{
		FARECLASSESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from fareClasses. 
	 * @param value the item to remove from fareClasses
	 */
	public void removeFromFareClasses(final FareBasisConfig value)
	{
		removeFromFareClasses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.fareTypes</code> attribute.
	 * @return the fareTypes - Defines the fare Types
	 */
	public String getFareTypes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FARETYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.fareTypes</code> attribute.
	 * @return the fareTypes - Defines the fare Types
	 */
	public String getFareTypes()
	{
		return getFareTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.fareTypes</code> attribute. 
	 * @param value the fareTypes - Defines the fare Types
	 */
	public void setFareTypes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FARETYPES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.fareTypes</code> attribute. 
	 * @param value the fareTypes - Defines the fare Types
	 */
	public void setFareTypes(final String value)
	{
		setFareTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.flightNumbers</code> attribute.
	 * @return the flightNumbers
	 */
	public Collection<FlightNumbersConfig> getFlightNumbers(final SessionContext ctx)
	{
		return FLIGHTNUMBERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.flightNumbers</code> attribute.
	 * @return the flightNumbers
	 */
	public Collection<FlightNumbersConfig> getFlightNumbers()
	{
		return getFlightNumbers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.flightNumbers</code> attribute. 
	 * @param value the flightNumbers
	 */
	public void setFlightNumbers(final SessionContext ctx, final Collection<FlightNumbersConfig> value)
	{
		FLIGHTNUMBERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.flightNumbers</code> attribute. 
	 * @param value the flightNumbers
	 */
	public void setFlightNumbers(final Collection<FlightNumbersConfig> value)
	{
		setFlightNumbers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightNumbers. 
	 * @param value the item to add to flightNumbers
	 */
	public void addToFlightNumbers(final SessionContext ctx, final FlightNumbersConfig value)
	{
		FLIGHTNUMBERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightNumbers. 
	 * @param value the item to add to flightNumbers
	 */
	public void addToFlightNumbers(final FlightNumbersConfig value)
	{
		addToFlightNumbers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightNumbers. 
	 * @param value the item to remove from flightNumbers
	 */
	public void removeFromFlightNumbers(final SessionContext ctx, final FlightNumbersConfig value)
	{
		FLIGHTNUMBERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightNumbers. 
	 * @param value the item to remove from flightNumbers
	 */
	public void removeFromFlightNumbers(final FlightNumbersConfig value)
	{
		removeFromFlightNumbers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.flightTimings</code> attribute.
	 * @return the flightTimings
	 */
	public Collection<FlightTimingsConfig> getFlightTimings(final SessionContext ctx)
	{
		return FLIGHTTIMINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.flightTimings</code> attribute.
	 * @return the flightTimings
	 */
	public Collection<FlightTimingsConfig> getFlightTimings()
	{
		return getFlightTimings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.flightTimings</code> attribute. 
	 * @param value the flightTimings
	 */
	public void setFlightTimings(final SessionContext ctx, final Collection<FlightTimingsConfig> value)
	{
		FLIGHTTIMINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.flightTimings</code> attribute. 
	 * @param value the flightTimings
	 */
	public void setFlightTimings(final Collection<FlightTimingsConfig> value)
	{
		setFlightTimings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightTimings. 
	 * @param value the item to add to flightTimings
	 */
	public void addToFlightTimings(final SessionContext ctx, final FlightTimingsConfig value)
	{
		FLIGHTTIMINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightTimings. 
	 * @param value the item to add to flightTimings
	 */
	public void addToFlightTimings(final FlightTimingsConfig value)
	{
		addToFlightTimings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightTimings. 
	 * @param value the item to remove from flightTimings
	 */
	public void removeFromFlightTimings(final SessionContext ctx, final FlightTimingsConfig value)
	{
		FLIGHTTIMINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightTimings. 
	 * @param value the item to remove from flightTimings
	 */
	public void removeFromFlightTimings(final FlightTimingsConfig value)
	{
		removeFromFlightTimings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.passengerTypes</code> attribute.
	 * @return the passengerTypes
	 */
	public SupCommAdvDefPassengerConfig getPassengerTypes(final SessionContext ctx)
	{
		return (SupCommAdvDefPassengerConfig)getProperty( ctx, PASSENGERTYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirSupplierAdvanceDefinition.passengerTypes</code> attribute.
	 * @return the passengerTypes
	 */
	public SupCommAdvDefPassengerConfig getPassengerTypes()
	{
		return getPassengerTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.passengerTypes</code> attribute. 
	 * @param value the passengerTypes
	 */
	public void setPassengerTypes(final SessionContext ctx, final SupCommAdvDefPassengerConfig value)
	{
		PASSENGERTYPESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirSupplierAdvanceDefinition.passengerTypes</code> attribute. 
	 * @param value the passengerTypes
	 */
	public void setPassengerTypes(final SupCommAdvDefPassengerConfig value)
	{
		setPassengerTypes( getSession().getSessionContext(), value );
	}
	
}
