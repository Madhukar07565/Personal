/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo.definition;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.client.commercials.core.jalo.definition.AbstractClientCompanyAdvanceDefinition;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.FlightNumber;
import com.cnk.travelogix.company.commercials.core.jalo.definition.FareDetail;
import com.cnk.travelogix.masterdata.core.deals.jalo.DealCode;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.definition.FlightClientCompanyAdvanceDefinition FlightClientCompanyAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightClientCompanyAdvanceDefinition extends AbstractClientCompanyAdvanceDefinition
{
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.productInclusion</code> attribute **/
	public static final String PRODUCTINCLUSION = "productInclusion";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.flightNumberInclusion</code> attribute **/
	public static final String FLIGHTNUMBERINCLUSION = "flightNumberInclusion";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.bookingClassInclusion</code> attribute **/
	public static final String BOOKINGCLASSINCLUSION = "bookingClassInclusion";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.cabinclass</code> attribute **/
	public static final String CABINCLASS = "cabinclass";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.rbd</code> attribute **/
	public static final String RBD = "rbd";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.fareClassInclusion</code> attribute **/
	public static final String FARECLASSINCLUSION = "fareClassInclusion";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.fareType</code> attribute **/
	public static final String FARETYPE = "fareType";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.dealCodes</code> attribute **/
	public static final String DEALCODES = "dealCodes";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.tourCodes</code> attribute **/
	public static final String TOURCODES = "tourCodes";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.journeyType</code> attribute **/
	public static final String JOURNEYTYPE = "journeyType";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.directFlights</code> attribute **/
	public static final String DIRECTFLIGHTS = "directFlights";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.via</code> attribute **/
	public static final String VIA = "via";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.online</code> attribute **/
	public static final String ONLINE = "online";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.interline</code> attribute **/
	public static final String INTERLINE = "interline";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.codeShareFlightInclued</code> attribute **/
	public static final String CODESHAREFLIGHTINCLUED = "codeShareFlightInclued";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.flightTiming</code> attribute **/
	public static final String FLIGHTTIMING = "flightTiming";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.flightNumbers</code> attribute **/
	public static final String FLIGHTNUMBERS = "flightNumbers";
	/** Qualifier of the <code>FlightClientCompanyAdvanceDefinition.fareDetails</code> attribute **/
	public static final String FAREDETAILS = "fareDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n FLIGHTNUMBERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FlightNumber> FLIGHTNUMBERSHANDLER = new OneToManyHandler<FlightNumber>(
	ClientcoreConstants.TC.FLIGHTNUMBER,
	false,
	"flightCompanyAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FAREDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FareDetail> FAREDETAILSHANDLER = new OneToManyHandler<FareDetail>(
	ClientcommercialsConstants.TC.FAREDETAIL,
	false,
	"flightCompAdvDefFare",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractClientCompanyAdvanceDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTINCLUSION, AttributeMode.INITIAL);
		tmp.put(FLIGHTNUMBERINCLUSION, AttributeMode.INITIAL);
		tmp.put(BOOKINGCLASSINCLUSION, AttributeMode.INITIAL);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(RBD, AttributeMode.INITIAL);
		tmp.put(FARECLASSINCLUSION, AttributeMode.INITIAL);
		tmp.put(FARETYPE, AttributeMode.INITIAL);
		tmp.put(DEALCODES, AttributeMode.INITIAL);
		tmp.put(TOURCODES, AttributeMode.INITIAL);
		tmp.put(JOURNEYTYPE, AttributeMode.INITIAL);
		tmp.put(DIRECTFLIGHTS, AttributeMode.INITIAL);
		tmp.put(VIA, AttributeMode.INITIAL);
		tmp.put(ONLINE, AttributeMode.INITIAL);
		tmp.put(INTERLINE, AttributeMode.INITIAL);
		tmp.put(CODESHAREFLIGHTINCLUED, AttributeMode.INITIAL);
		tmp.put(FLIGHTTIMING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.bookingClassInclusion</code> attribute.
	 * @return the bookingClassInclusion
	 */
	public Boolean isBookingClassInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BOOKINGCLASSINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.bookingClassInclusion</code> attribute.
	 * @return the bookingClassInclusion
	 */
	public Boolean isBookingClassInclusion()
	{
		return isBookingClassInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.bookingClassInclusion</code> attribute. 
	 * @return the bookingClassInclusion
	 */
	public boolean isBookingClassInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBookingClassInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.bookingClassInclusion</code> attribute. 
	 * @return the bookingClassInclusion
	 */
	public boolean isBookingClassInclusionAsPrimitive()
	{
		return isBookingClassInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.bookingClassInclusion</code> attribute. 
	 * @param value the bookingClassInclusion
	 */
	public void setBookingClassInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BOOKINGCLASSINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.bookingClassInclusion</code> attribute. 
	 * @param value the bookingClassInclusion
	 */
	public void setBookingClassInclusion(final Boolean value)
	{
		setBookingClassInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.bookingClassInclusion</code> attribute. 
	 * @param value the bookingClassInclusion
	 */
	public void setBookingClassInclusion(final SessionContext ctx, final boolean value)
	{
		setBookingClassInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.bookingClassInclusion</code> attribute. 
	 * @param value the bookingClassInclusion
	 */
	public void setBookingClassInclusion(final boolean value)
	{
		setBookingClassInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.cabinclass</code> attribute.
	 * @return the cabinclass
	 */
	public EnumerationValue getCabinclass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.cabinclass</code> attribute.
	 * @return the cabinclass
	 */
	public EnumerationValue getCabinclass()
	{
		return getCabinclass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.cabinclass</code> attribute. 
	 * @param value the cabinclass
	 */
	public void setCabinclass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.cabinclass</code> attribute. 
	 * @param value the cabinclass
	 */
	public void setCabinclass(final EnumerationValue value)
	{
		setCabinclass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.codeShareFlightInclued</code> attribute.
	 * @return the codeShareFlightInclued
	 */
	public Boolean isCodeShareFlightInclued(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CODESHAREFLIGHTINCLUED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.codeShareFlightInclued</code> attribute.
	 * @return the codeShareFlightInclued
	 */
	public Boolean isCodeShareFlightInclued()
	{
		return isCodeShareFlightInclued( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.codeShareFlightInclued</code> attribute. 
	 * @return the codeShareFlightInclued
	 */
	public boolean isCodeShareFlightIncluedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCodeShareFlightInclued( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.codeShareFlightInclued</code> attribute. 
	 * @return the codeShareFlightInclued
	 */
	public boolean isCodeShareFlightIncluedAsPrimitive()
	{
		return isCodeShareFlightIncluedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.codeShareFlightInclued</code> attribute. 
	 * @param value the codeShareFlightInclued
	 */
	public void setCodeShareFlightInclued(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CODESHAREFLIGHTINCLUED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.codeShareFlightInclued</code> attribute. 
	 * @param value the codeShareFlightInclued
	 */
	public void setCodeShareFlightInclued(final Boolean value)
	{
		setCodeShareFlightInclued( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.codeShareFlightInclued</code> attribute. 
	 * @param value the codeShareFlightInclued
	 */
	public void setCodeShareFlightInclued(final SessionContext ctx, final boolean value)
	{
		setCodeShareFlightInclued( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.codeShareFlightInclued</code> attribute. 
	 * @param value the codeShareFlightInclued
	 */
	public void setCodeShareFlightInclued(final boolean value)
	{
		setCodeShareFlightInclued( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.dealCodes</code> attribute.
	 * @return the dealCodes
	 */
	public List<DealCode> getDealCodes(final SessionContext ctx)
	{
		List<DealCode> coll = (List<DealCode>)getProperty( ctx, DEALCODES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.dealCodes</code> attribute.
	 * @return the dealCodes
	 */
	public List<DealCode> getDealCodes()
	{
		return getDealCodes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.dealCodes</code> attribute. 
	 * @param value the dealCodes
	 */
	public void setDealCodes(final SessionContext ctx, final List<DealCode> value)
	{
		setProperty(ctx, DEALCODES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.dealCodes</code> attribute. 
	 * @param value the dealCodes
	 */
	public void setDealCodes(final List<DealCode> value)
	{
		setDealCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.directFlights</code> attribute.
	 * @return the directFlights
	 */
	public Boolean isDirectFlights(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DIRECTFLIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.directFlights</code> attribute.
	 * @return the directFlights
	 */
	public Boolean isDirectFlights()
	{
		return isDirectFlights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.directFlights</code> attribute. 
	 * @return the directFlights
	 */
	public boolean isDirectFlightsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDirectFlights( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.directFlights</code> attribute. 
	 * @return the directFlights
	 */
	public boolean isDirectFlightsAsPrimitive()
	{
		return isDirectFlightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.directFlights</code> attribute. 
	 * @param value the directFlights
	 */
	public void setDirectFlights(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DIRECTFLIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.directFlights</code> attribute. 
	 * @param value the directFlights
	 */
	public void setDirectFlights(final Boolean value)
	{
		setDirectFlights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.directFlights</code> attribute. 
	 * @param value the directFlights
	 */
	public void setDirectFlights(final SessionContext ctx, final boolean value)
	{
		setDirectFlights( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.directFlights</code> attribute. 
	 * @param value the directFlights
	 */
	public void setDirectFlights(final boolean value)
	{
		setDirectFlights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.fareClassInclusion</code> attribute.
	 * @return the fareClassInclusion
	 */
	public Boolean isFareClassInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FARECLASSINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.fareClassInclusion</code> attribute.
	 * @return the fareClassInclusion
	 */
	public Boolean isFareClassInclusion()
	{
		return isFareClassInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.fareClassInclusion</code> attribute. 
	 * @return the fareClassInclusion
	 */
	public boolean isFareClassInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFareClassInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.fareClassInclusion</code> attribute. 
	 * @return the fareClassInclusion
	 */
	public boolean isFareClassInclusionAsPrimitive()
	{
		return isFareClassInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.fareClassInclusion</code> attribute. 
	 * @param value the fareClassInclusion
	 */
	public void setFareClassInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FARECLASSINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.fareClassInclusion</code> attribute. 
	 * @param value the fareClassInclusion
	 */
	public void setFareClassInclusion(final Boolean value)
	{
		setFareClassInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.fareClassInclusion</code> attribute. 
	 * @param value the fareClassInclusion
	 */
	public void setFareClassInclusion(final SessionContext ctx, final boolean value)
	{
		setFareClassInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.fareClassInclusion</code> attribute. 
	 * @param value the fareClassInclusion
	 */
	public void setFareClassInclusion(final boolean value)
	{
		setFareClassInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.fareDetails</code> attribute.
	 * @return the fareDetails
	 */
	public Collection<FareDetail> getFareDetails(final SessionContext ctx)
	{
		return FAREDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.fareDetails</code> attribute.
	 * @return the fareDetails
	 */
	public Collection<FareDetail> getFareDetails()
	{
		return getFareDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.fareDetails</code> attribute. 
	 * @param value the fareDetails
	 */
	public void setFareDetails(final SessionContext ctx, final Collection<FareDetail> value)
	{
		FAREDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.fareDetails</code> attribute. 
	 * @param value the fareDetails
	 */
	public void setFareDetails(final Collection<FareDetail> value)
	{
		setFareDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to fareDetails. 
	 * @param value the item to add to fareDetails
	 */
	public void addToFareDetails(final SessionContext ctx, final FareDetail value)
	{
		FAREDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to fareDetails. 
	 * @param value the item to add to fareDetails
	 */
	public void addToFareDetails(final FareDetail value)
	{
		addToFareDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from fareDetails. 
	 * @param value the item to remove from fareDetails
	 */
	public void removeFromFareDetails(final SessionContext ctx, final FareDetail value)
	{
		FAREDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from fareDetails. 
	 * @param value the item to remove from fareDetails
	 */
	public void removeFromFareDetails(final FareDetail value)
	{
		removeFromFareDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.fareType</code> attribute.
	 * @return the fareType
	 */
	public EnumerationValue getFareType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FARETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.fareType</code> attribute.
	 * @return the fareType
	 */
	public EnumerationValue getFareType()
	{
		return getFareType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.fareType</code> attribute. 
	 * @param value the fareType
	 */
	public void setFareType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FARETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.fareType</code> attribute. 
	 * @param value the fareType
	 */
	public void setFareType(final EnumerationValue value)
	{
		setFareType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.flightNumberInclusion</code> attribute.
	 * @return the flightNumberInclusion
	 */
	public Boolean isFlightNumberInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FLIGHTNUMBERINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.flightNumberInclusion</code> attribute.
	 * @return the flightNumberInclusion
	 */
	public Boolean isFlightNumberInclusion()
	{
		return isFlightNumberInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.flightNumberInclusion</code> attribute. 
	 * @return the flightNumberInclusion
	 */
	public boolean isFlightNumberInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFlightNumberInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.flightNumberInclusion</code> attribute. 
	 * @return the flightNumberInclusion
	 */
	public boolean isFlightNumberInclusionAsPrimitive()
	{
		return isFlightNumberInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.flightNumberInclusion</code> attribute. 
	 * @param value the flightNumberInclusion
	 */
	public void setFlightNumberInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FLIGHTNUMBERINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.flightNumberInclusion</code> attribute. 
	 * @param value the flightNumberInclusion
	 */
	public void setFlightNumberInclusion(final Boolean value)
	{
		setFlightNumberInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.flightNumberInclusion</code> attribute. 
	 * @param value the flightNumberInclusion
	 */
	public void setFlightNumberInclusion(final SessionContext ctx, final boolean value)
	{
		setFlightNumberInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.flightNumberInclusion</code> attribute. 
	 * @param value the flightNumberInclusion
	 */
	public void setFlightNumberInclusion(final boolean value)
	{
		setFlightNumberInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.flightNumbers</code> attribute.
	 * @return the flightNumbers
	 */
	public Collection<FlightNumber> getFlightNumbers(final SessionContext ctx)
	{
		return FLIGHTNUMBERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.flightNumbers</code> attribute.
	 * @return the flightNumbers
	 */
	public Collection<FlightNumber> getFlightNumbers()
	{
		return getFlightNumbers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.flightNumbers</code> attribute. 
	 * @param value the flightNumbers
	 */
	public void setFlightNumbers(final SessionContext ctx, final Collection<FlightNumber> value)
	{
		FLIGHTNUMBERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.flightNumbers</code> attribute. 
	 * @param value the flightNumbers
	 */
	public void setFlightNumbers(final Collection<FlightNumber> value)
	{
		setFlightNumbers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightNumbers. 
	 * @param value the item to add to flightNumbers
	 */
	public void addToFlightNumbers(final SessionContext ctx, final FlightNumber value)
	{
		FLIGHTNUMBERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightNumbers. 
	 * @param value the item to add to flightNumbers
	 */
	public void addToFlightNumbers(final FlightNumber value)
	{
		addToFlightNumbers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightNumbers. 
	 * @param value the item to remove from flightNumbers
	 */
	public void removeFromFlightNumbers(final SessionContext ctx, final FlightNumber value)
	{
		FLIGHTNUMBERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightNumbers. 
	 * @param value the item to remove from flightNumbers
	 */
	public void removeFromFlightNumbers(final FlightNumber value)
	{
		removeFromFlightNumbers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.flightTiming</code> attribute.
	 * @return the flightTiming
	 */
	public Set<StandardDateRange> getFlightTiming(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, FLIGHTTIMING);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.flightTiming</code> attribute.
	 * @return the flightTiming
	 */
	public Set<StandardDateRange> getFlightTiming()
	{
		return getFlightTiming( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.flightTiming</code> attribute. 
	 * @param value the flightTiming
	 */
	public void setFlightTiming(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, FLIGHTTIMING,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.flightTiming</code> attribute. 
	 * @param value the flightTiming
	 */
	public void setFlightTiming(final Set<StandardDateRange> value)
	{
		setFlightTiming( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.interline</code> attribute.
	 * @return the interline
	 */
	public Boolean isInterline(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INTERLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.interline</code> attribute.
	 * @return the interline
	 */
	public Boolean isInterline()
	{
		return isInterline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.interline</code> attribute. 
	 * @return the interline
	 */
	public boolean isInterlineAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInterline( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.interline</code> attribute. 
	 * @return the interline
	 */
	public boolean isInterlineAsPrimitive()
	{
		return isInterlineAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.interline</code> attribute. 
	 * @param value the interline
	 */
	public void setInterline(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INTERLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.interline</code> attribute. 
	 * @param value the interline
	 */
	public void setInterline(final Boolean value)
	{
		setInterline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.interline</code> attribute. 
	 * @param value the interline
	 */
	public void setInterline(final SessionContext ctx, final boolean value)
	{
		setInterline( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.interline</code> attribute. 
	 * @param value the interline
	 */
	public void setInterline(final boolean value)
	{
		setInterline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.journeyType</code> attribute.
	 * @return the journeyType
	 */
	public List<EnumerationValue> getJourneyType(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, JOURNEYTYPE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.journeyType</code> attribute.
	 * @return the journeyType
	 */
	public List<EnumerationValue> getJourneyType()
	{
		return getJourneyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.journeyType</code> attribute. 
	 * @param value the journeyType
	 */
	public void setJourneyType(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, JOURNEYTYPE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.journeyType</code> attribute. 
	 * @param value the journeyType
	 */
	public void setJourneyType(final List<EnumerationValue> value)
	{
		setJourneyType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.online</code> attribute.
	 * @return the online
	 */
	public Boolean isOnline(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ONLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.online</code> attribute.
	 * @return the online
	 */
	public Boolean isOnline()
	{
		return isOnline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.online</code> attribute. 
	 * @return the online
	 */
	public boolean isOnlineAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOnline( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.online</code> attribute. 
	 * @return the online
	 */
	public boolean isOnlineAsPrimitive()
	{
		return isOnlineAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.online</code> attribute. 
	 * @param value the online
	 */
	public void setOnline(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ONLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.online</code> attribute. 
	 * @param value the online
	 */
	public void setOnline(final Boolean value)
	{
		setOnline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.online</code> attribute. 
	 * @param value the online
	 */
	public void setOnline(final SessionContext ctx, final boolean value)
	{
		setOnline( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.online</code> attribute. 
	 * @param value the online
	 */
	public void setOnline(final boolean value)
	{
		setOnline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.productInclusion</code> attribute.
	 * @return the productInclusion
	 */
	public Boolean isProductInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PRODUCTINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.productInclusion</code> attribute.
	 * @return the productInclusion
	 */
	public Boolean isProductInclusion()
	{
		return isProductInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.productInclusion</code> attribute. 
	 * @return the productInclusion
	 */
	public boolean isProductInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isProductInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.productInclusion</code> attribute. 
	 * @return the productInclusion
	 */
	public boolean isProductInclusionAsPrimitive()
	{
		return isProductInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.productInclusion</code> attribute. 
	 * @param value the productInclusion
	 */
	public void setProductInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PRODUCTINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.productInclusion</code> attribute. 
	 * @param value the productInclusion
	 */
	public void setProductInclusion(final Boolean value)
	{
		setProductInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.productInclusion</code> attribute. 
	 * @param value the productInclusion
	 */
	public void setProductInclusion(final SessionContext ctx, final boolean value)
	{
		setProductInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.productInclusion</code> attribute. 
	 * @param value the productInclusion
	 */
	public void setProductInclusion(final boolean value)
	{
		setProductInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.rbd</code> attribute.
	 * @return the rbd
	 */
	public List<EnumerationValue> getRbd(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, RBD);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.rbd</code> attribute.
	 * @return the rbd
	 */
	public List<EnumerationValue> getRbd()
	{
		return getRbd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.rbd</code> attribute. 
	 * @param value the rbd
	 */
	public void setRbd(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, RBD,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.rbd</code> attribute. 
	 * @param value the rbd
	 */
	public void setRbd(final List<EnumerationValue> value)
	{
		setRbd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.tourCodes</code> attribute.
	 * @return the tourCodes
	 */
	public List<String> getTourCodes(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, TOURCODES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.tourCodes</code> attribute.
	 * @return the tourCodes
	 */
	public List<String> getTourCodes()
	{
		return getTourCodes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.tourCodes</code> attribute. 
	 * @param value the tourCodes
	 */
	public void setTourCodes(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, TOURCODES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.tourCodes</code> attribute. 
	 * @param value the tourCodes
	 */
	public void setTourCodes(final List<String> value)
	{
		setTourCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.via</code> attribute.
	 * @return the via
	 */
	public Boolean isVia(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, VIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.via</code> attribute.
	 * @return the via
	 */
	public Boolean isVia()
	{
		return isVia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.via</code> attribute. 
	 * @return the via
	 */
	public boolean isViaAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isVia( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightClientCompanyAdvanceDefinition.via</code> attribute. 
	 * @return the via
	 */
	public boolean isViaAsPrimitive()
	{
		return isViaAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.via</code> attribute. 
	 * @param value the via
	 */
	public void setVia(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, VIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.via</code> attribute. 
	 * @param value the via
	 */
	public void setVia(final Boolean value)
	{
		setVia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.via</code> attribute. 
	 * @param value the via
	 */
	public void setVia(final SessionContext ctx, final boolean value)
	{
		setVia( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightClientCompanyAdvanceDefinition.via</code> attribute. 
	 * @param value the via
	 */
	public void setVia(final boolean value)
	{
		setVia( getSession().getSessionContext(), value );
	}
	
}
