/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.iata.jalo.Airport;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.FlightProduct;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.AirLineDetails AirLineDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirLineDetails extends GenericItem
{
	/** Qualifier of the <code>AirLineDetails.airlineType</code> attribute **/
	public static final String AIRLINETYPE = "airlineType";
	/** Qualifier of the <code>AirLineDetails.flightNumberTo</code> attribute **/
	public static final String FLIGHTNUMBERTO = "flightNumberTo";
	/** Qualifier of the <code>AirLineDetails.flightNumberFrom</code> attribute **/
	public static final String FLIGHTNUMBERFROM = "flightNumberFrom";
	/** Qualifier of the <code>AirLineDetails.sectorFrom</code> attribute **/
	public static final String SECTORFROM = "sectorFrom";
	/** Qualifier of the <code>AirLineDetails.sectorTo</code> attribute **/
	public static final String SECTORTO = "sectorTo";
	/** Qualifier of the <code>AirLineDetails.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>AirLineDetails.rbds</code> attribute **/
	public static final String RBDS = "rbds";
	/** Qualifier of the <code>AirLineDetails.flightProduct</code> attribute **/
	public static final String FLIGHTPRODUCT = "flightProduct";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FLIGHTPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirLineDetails> FLIGHTPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedAirLineDetails>(
	TransportproductmasterscoreConstants.TC.AIRLINEDETAILS,
	false,
	"flightProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AIRLINETYPE, AttributeMode.INITIAL);
		tmp.put(FLIGHTNUMBERTO, AttributeMode.INITIAL);
		tmp.put(FLIGHTNUMBERFROM, AttributeMode.INITIAL);
		tmp.put(SECTORFROM, AttributeMode.INITIAL);
		tmp.put(SECTORTO, AttributeMode.INITIAL);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(RBDS, AttributeMode.INITIAL);
		tmp.put(FLIGHTPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.airlineType</code> attribute.
	 * @return the airlineType - To show the Airline type.
	 */
	public EnumerationValue getAirlineType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AIRLINETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.airlineType</code> attribute.
	 * @return the airlineType - To show the Airline type.
	 */
	public EnumerationValue getAirlineType()
	{
		return getAirlineType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.airlineType</code> attribute. 
	 * @param value the airlineType - To show the Airline type.
	 */
	public void setAirlineType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AIRLINETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.airlineType</code> attribute. 
	 * @param value the airlineType - To show the Airline type.
	 */
	public void setAirlineType(final EnumerationValue value)
	{
		setAirlineType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.cabinClass</code> attribute.
	 * @return the cabinClass - To show the cabinClass.
	 */
	public EnumerationValue getCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.cabinClass</code> attribute.
	 * @return the cabinClass - To show the cabinClass.
	 */
	public EnumerationValue getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.cabinClass</code> attribute. 
	 * @param value the cabinClass - To show the cabinClass.
	 */
	public void setCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.cabinClass</code> attribute. 
	 * @param value the cabinClass - To show the cabinClass.
	 */
	public void setCabinClass(final EnumerationValue value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		FLIGHTPRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.flightNumberFrom</code> attribute.
	 * @return the flightNumberFrom - To show the flight From Numbers.
	 */
	public Long getFlightNumberFrom(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, FLIGHTNUMBERFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.flightNumberFrom</code> attribute.
	 * @return the flightNumberFrom - To show the flight From Numbers.
	 */
	public Long getFlightNumberFrom()
	{
		return getFlightNumberFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.flightNumberFrom</code> attribute. 
	 * @return the flightNumberFrom - To show the flight From Numbers.
	 */
	public long getFlightNumberFromAsPrimitive(final SessionContext ctx)
	{
		Long value = getFlightNumberFrom( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.flightNumberFrom</code> attribute. 
	 * @return the flightNumberFrom - To show the flight From Numbers.
	 */
	public long getFlightNumberFromAsPrimitive()
	{
		return getFlightNumberFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.flightNumberFrom</code> attribute. 
	 * @param value the flightNumberFrom - To show the flight From Numbers.
	 */
	public void setFlightNumberFrom(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, FLIGHTNUMBERFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.flightNumberFrom</code> attribute. 
	 * @param value the flightNumberFrom - To show the flight From Numbers.
	 */
	public void setFlightNumberFrom(final Long value)
	{
		setFlightNumberFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.flightNumberFrom</code> attribute. 
	 * @param value the flightNumberFrom - To show the flight From Numbers.
	 */
	public void setFlightNumberFrom(final SessionContext ctx, final long value)
	{
		setFlightNumberFrom( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.flightNumberFrom</code> attribute. 
	 * @param value the flightNumberFrom - To show the flight From Numbers.
	 */
	public void setFlightNumberFrom(final long value)
	{
		setFlightNumberFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.flightNumberTo</code> attribute.
	 * @return the flightNumberTo - To show the flight Numbers.
	 */
	public Long getFlightNumberTo(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, FLIGHTNUMBERTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.flightNumberTo</code> attribute.
	 * @return the flightNumberTo - To show the flight Numbers.
	 */
	public Long getFlightNumberTo()
	{
		return getFlightNumberTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.flightNumberTo</code> attribute. 
	 * @return the flightNumberTo - To show the flight Numbers.
	 */
	public long getFlightNumberToAsPrimitive(final SessionContext ctx)
	{
		Long value = getFlightNumberTo( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.flightNumberTo</code> attribute. 
	 * @return the flightNumberTo - To show the flight Numbers.
	 */
	public long getFlightNumberToAsPrimitive()
	{
		return getFlightNumberToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.flightNumberTo</code> attribute. 
	 * @param value the flightNumberTo - To show the flight Numbers.
	 */
	public void setFlightNumberTo(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, FLIGHTNUMBERTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.flightNumberTo</code> attribute. 
	 * @param value the flightNumberTo - To show the flight Numbers.
	 */
	public void setFlightNumberTo(final Long value)
	{
		setFlightNumberTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.flightNumberTo</code> attribute. 
	 * @param value the flightNumberTo - To show the flight Numbers.
	 */
	public void setFlightNumberTo(final SessionContext ctx, final long value)
	{
		setFlightNumberTo( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.flightNumberTo</code> attribute. 
	 * @param value the flightNumberTo - To show the flight Numbers.
	 */
	public void setFlightNumberTo(final long value)
	{
		setFlightNumberTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.flightProduct</code> attribute.
	 * @return the flightProduct
	 */
	public FlightProduct getFlightProduct(final SessionContext ctx)
	{
		return (FlightProduct)getProperty( ctx, FLIGHTPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.flightProduct</code> attribute.
	 * @return the flightProduct
	 */
	public FlightProduct getFlightProduct()
	{
		return getFlightProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.flightProduct</code> attribute. 
	 * @param value the flightProduct
	 */
	public void setFlightProduct(final SessionContext ctx, final FlightProduct value)
	{
		FLIGHTPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.flightProduct</code> attribute. 
	 * @param value the flightProduct
	 */
	public void setFlightProduct(final FlightProduct value)
	{
		setFlightProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.rbds</code> attribute.
	 * @return the rbds - To show the rbds.
	 */
	public List<EnumerationValue> getRbds(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, RBDS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.rbds</code> attribute.
	 * @return the rbds - To show the rbds.
	 */
	public List<EnumerationValue> getRbds()
	{
		return getRbds( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.rbds</code> attribute. 
	 * @param value the rbds - To show the rbds.
	 */
	public void setRbds(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, RBDS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.rbds</code> attribute. 
	 * @param value the rbds - To show the rbds.
	 */
	public void setRbds(final List<EnumerationValue> value)
	{
		setRbds( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.sectorFrom</code> attribute.
	 * @return the sectorFrom - To show the sectorFrom.
	 */
	public Airport getSectorFrom(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, SECTORFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.sectorFrom</code> attribute.
	 * @return the sectorFrom - To show the sectorFrom.
	 */
	public Airport getSectorFrom()
	{
		return getSectorFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.sectorFrom</code> attribute. 
	 * @param value the sectorFrom - To show the sectorFrom.
	 */
	public void setSectorFrom(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, SECTORFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.sectorFrom</code> attribute. 
	 * @param value the sectorFrom - To show the sectorFrom.
	 */
	public void setSectorFrom(final Airport value)
	{
		setSectorFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.sectorTo</code> attribute.
	 * @return the sectorTo - To show the sector to.
	 */
	public Airport getSectorTo(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, SECTORTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirLineDetails.sectorTo</code> attribute.
	 * @return the sectorTo - To show the sector to.
	 */
	public Airport getSectorTo()
	{
		return getSectorTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.sectorTo</code> attribute. 
	 * @param value the sectorTo - To show the sector to.
	 */
	public void setSectorTo(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, SECTORTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirLineDetails.sectorTo</code> attribute. 
	 * @param value the sectorTo - To show the sector to.
	 */
	public void setSectorTo(final Airport value)
	{
		setSectorTo( getSession().getSessionContext(), value );
	}
	
}
