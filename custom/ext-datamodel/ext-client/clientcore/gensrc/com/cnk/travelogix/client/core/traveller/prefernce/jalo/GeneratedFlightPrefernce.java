/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.prefernce.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.traveller.jalo.TravellerProfile;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.AirlineDetail;
import com.cnk.travelogix.client.masters.core.constants.ClientmastercoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.prefernce.jalo.FlightPrefernce FlightPrefernce}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightPrefernce extends GenericItem
{
	/** Qualifier of the <code>FlightPrefernce.mealPreference</code> attribute **/
	public static final String MEALPREFERENCE = "mealPreference";
	/** Qualifier of the <code>FlightPrefernce.seatPreference</code> attribute **/
	public static final String SEATPREFERENCE = "seatPreference";
	/** Qualifier of the <code>FlightPrefernce.destinationCountry</code> attribute **/
	public static final String DESTINATIONCOUNTRY = "destinationCountry";
	/** Qualifier of the <code>FlightPrefernce.travellerProfile</code> attribute **/
	public static final String TRAVELLERPROFILE = "travellerProfile";
	/** Qualifier of the <code>FlightPrefernce.airlineDetail</code> attribute **/
	public static final String AIRLINEDETAIL = "airlineDetail";
	/** Qualifier of the <code>FlightPrefernce.specialRequest</code> attribute **/
	public static final String SPECIALREQUEST = "specialRequest";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELLERPROFILE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFlightPrefernce> TRAVELLERPROFILEHANDLER = new BidirectionalOneToManyHandler<GeneratedFlightPrefernce>(
	ClientcoreConstants.TC.FLIGHTPREFERNCE,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n AIRLINEDETAIL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirlineDetail> AIRLINEDETAILHANDLER = new OneToManyHandler<AirlineDetail>(
	ClientcoreConstants.TC.AIRLINEDETAIL,
	false,
	"flightPrefernce",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SPECIALREQUEST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> SPECIALREQUESTHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.SPECIALREQUEST,
	false,
	"flightPrefernce",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MEALPREFERENCE, AttributeMode.INITIAL);
		tmp.put(SEATPREFERENCE, AttributeMode.INITIAL);
		tmp.put(DESTINATIONCOUNTRY, AttributeMode.INITIAL);
		tmp.put(TRAVELLERPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.airlineDetail</code> attribute.
	 * @return the airlineDetail
	 */
	public Set<AirlineDetail> getAirlineDetail(final SessionContext ctx)
	{
		return (Set<AirlineDetail>)AIRLINEDETAILHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.airlineDetail</code> attribute.
	 * @return the airlineDetail
	 */
	public Set<AirlineDetail> getAirlineDetail()
	{
		return getAirlineDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.airlineDetail</code> attribute. 
	 * @param value the airlineDetail
	 */
	public void setAirlineDetail(final SessionContext ctx, final Set<AirlineDetail> value)
	{
		AIRLINEDETAILHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.airlineDetail</code> attribute. 
	 * @param value the airlineDetail
	 */
	public void setAirlineDetail(final Set<AirlineDetail> value)
	{
		setAirlineDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airlineDetail. 
	 * @param value the item to add to airlineDetail
	 */
	public void addToAirlineDetail(final SessionContext ctx, final AirlineDetail value)
	{
		AIRLINEDETAILHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airlineDetail. 
	 * @param value the item to add to airlineDetail
	 */
	public void addToAirlineDetail(final AirlineDetail value)
	{
		addToAirlineDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airlineDetail. 
	 * @param value the item to remove from airlineDetail
	 */
	public void removeFromAirlineDetail(final SessionContext ctx, final AirlineDetail value)
	{
		AIRLINEDETAILHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airlineDetail. 
	 * @param value the item to remove from airlineDetail
	 */
	public void removeFromAirlineDetail(final AirlineDetail value)
	{
		removeFromAirlineDetail( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELLERPROFILEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.destinationCountry</code> attribute.
	 * @return the destinationCountry
	 */
	public Country getDestinationCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, DESTINATIONCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.destinationCountry</code> attribute.
	 * @return the destinationCountry
	 */
	public Country getDestinationCountry()
	{
		return getDestinationCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.destinationCountry</code> attribute. 
	 * @param value the destinationCountry
	 */
	public void setDestinationCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, DESTINATIONCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.destinationCountry</code> attribute. 
	 * @param value the destinationCountry
	 */
	public void setDestinationCountry(final Country value)
	{
		setDestinationCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.mealPreference</code> attribute.
	 * @return the mealPreference
	 */
	public EnumerationValue getMealPreference(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEALPREFERENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.mealPreference</code> attribute.
	 * @return the mealPreference
	 */
	public EnumerationValue getMealPreference()
	{
		return getMealPreference( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.mealPreference</code> attribute. 
	 * @param value the mealPreference
	 */
	public void setMealPreference(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEALPREFERENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.mealPreference</code> attribute. 
	 * @param value the mealPreference
	 */
	public void setMealPreference(final EnumerationValue value)
	{
		setMealPreference( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.seatPreference</code> attribute.
	 * @return the seatPreference
	 */
	public EnumerationValue getSeatPreference(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEATPREFERENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.seatPreference</code> attribute.
	 * @return the seatPreference
	 */
	public EnumerationValue getSeatPreference()
	{
		return getSeatPreference( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.seatPreference</code> attribute. 
	 * @param value the seatPreference
	 */
	public void setSeatPreference(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEATPREFERENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.seatPreference</code> attribute. 
	 * @param value the seatPreference
	 */
	public void setSeatPreference(final EnumerationValue value)
	{
		setSeatPreference( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.specialRequest</code> attribute.
	 * @return the specialRequest
	 */
	public Set<EnumerationValue> getSpecialRequest(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)SPECIALREQUESTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.specialRequest</code> attribute.
	 * @return the specialRequest
	 */
	public Set<EnumerationValue> getSpecialRequest()
	{
		return getSpecialRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.specialRequest</code> attribute. 
	 * @param value the specialRequest
	 */
	public void setSpecialRequest(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		SPECIALREQUESTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.specialRequest</code> attribute. 
	 * @param value the specialRequest
	 */
	public void setSpecialRequest(final Set<EnumerationValue> value)
	{
		setSpecialRequest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to specialRequest. 
	 * @param value the item to add to specialRequest
	 */
	public void addToSpecialRequest(final SessionContext ctx, final EnumerationValue value)
	{
		SPECIALREQUESTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to specialRequest. 
	 * @param value the item to add to specialRequest
	 */
	public void addToSpecialRequest(final EnumerationValue value)
	{
		addToSpecialRequest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from specialRequest. 
	 * @param value the item to remove from specialRequest
	 */
	public void removeFromSpecialRequest(final SessionContext ctx, final EnumerationValue value)
	{
		SPECIALREQUESTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from specialRequest. 
	 * @param value the item to remove from specialRequest
	 */
	public void removeFromSpecialRequest(final EnumerationValue value)
	{
		removeFromSpecialRequest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx)
	{
		return (TravellerProfile)getProperty( ctx, TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightPrefernce.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile()
	{
		return getTravellerProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final TravellerProfile value)
	{
		TRAVELLERPROFILEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightPrefernce.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), value );
	}
	
}
