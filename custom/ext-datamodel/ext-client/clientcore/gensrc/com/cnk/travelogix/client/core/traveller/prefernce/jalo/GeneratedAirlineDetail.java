/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.prefernce.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.FlightPrefernce;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.prefernce.jalo.AirlineDetail AirlineDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirlineDetail extends GenericItem
{
	/** Qualifier of the <code>AirlineDetail.airlineType</code> attribute **/
	public static final String AIRLINETYPE = "airlineType";
	/** Qualifier of the <code>AirlineDetail.airlineName</code> attribute **/
	public static final String AIRLINENAME = "airlineName";
	/** Qualifier of the <code>AirlineDetail.airlineClass</code> attribute **/
	public static final String AIRLINECLASS = "airlineClass";
	/** Qualifier of the <code>AirlineDetail.seatNumber</code> attribute **/
	public static final String SEATNUMBER = "seatNumber";
	/** Qualifier of the <code>AirlineDetail.flightPrefernce</code> attribute **/
	public static final String FLIGHTPREFERNCE = "flightPrefernce";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FLIGHTPREFERNCE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirlineDetail> FLIGHTPREFERNCEHANDLER = new BidirectionalOneToManyHandler<GeneratedAirlineDetail>(
	ClientcoreConstants.TC.AIRLINEDETAIL,
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
		tmp.put(AIRLINETYPE, AttributeMode.INITIAL);
		tmp.put(AIRLINENAME, AttributeMode.INITIAL);
		tmp.put(AIRLINECLASS, AttributeMode.INITIAL);
		tmp.put(SEATNUMBER, AttributeMode.INITIAL);
		tmp.put(FLIGHTPREFERNCE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineDetail.airlineClass</code> attribute.
	 * @return the airlineClass
	 */
	public EnumerationValue getAirlineClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AIRLINECLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineDetail.airlineClass</code> attribute.
	 * @return the airlineClass
	 */
	public EnumerationValue getAirlineClass()
	{
		return getAirlineClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineDetail.airlineClass</code> attribute. 
	 * @param value the airlineClass
	 */
	public void setAirlineClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AIRLINECLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineDetail.airlineClass</code> attribute. 
	 * @param value the airlineClass
	 */
	public void setAirlineClass(final EnumerationValue value)
	{
		setAirlineClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineDetail.airlineName</code> attribute.
	 * @return the airlineName
	 */
	public Product getAirlineName(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, AIRLINENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineDetail.airlineName</code> attribute.
	 * @return the airlineName
	 */
	public Product getAirlineName()
	{
		return getAirlineName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineDetail.airlineName</code> attribute. 
	 * @param value the airlineName
	 */
	public void setAirlineName(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, AIRLINENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineDetail.airlineName</code> attribute. 
	 * @param value the airlineName
	 */
	public void setAirlineName(final Product value)
	{
		setAirlineName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineDetail.airlineType</code> attribute.
	 * @return the airlineType
	 */
	public EnumerationValue getAirlineType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AIRLINETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineDetail.airlineType</code> attribute.
	 * @return the airlineType
	 */
	public EnumerationValue getAirlineType()
	{
		return getAirlineType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineDetail.airlineType</code> attribute. 
	 * @param value the airlineType
	 */
	public void setAirlineType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AIRLINETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineDetail.airlineType</code> attribute. 
	 * @param value the airlineType
	 */
	public void setAirlineType(final EnumerationValue value)
	{
		setAirlineType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		FLIGHTPREFERNCEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineDetail.flightPrefernce</code> attribute.
	 * @return the flightPrefernce
	 */
	public FlightPrefernce getFlightPrefernce(final SessionContext ctx)
	{
		return (FlightPrefernce)getProperty( ctx, FLIGHTPREFERNCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineDetail.flightPrefernce</code> attribute.
	 * @return the flightPrefernce
	 */
	public FlightPrefernce getFlightPrefernce()
	{
		return getFlightPrefernce( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineDetail.flightPrefernce</code> attribute. 
	 * @param value the flightPrefernce
	 */
	public void setFlightPrefernce(final SessionContext ctx, final FlightPrefernce value)
	{
		FLIGHTPREFERNCEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineDetail.flightPrefernce</code> attribute. 
	 * @param value the flightPrefernce
	 */
	public void setFlightPrefernce(final FlightPrefernce value)
	{
		setFlightPrefernce( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineDetail.seatNumber</code> attribute.
	 * @return the seatNumber
	 */
	public String getSeatNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEATNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineDetail.seatNumber</code> attribute.
	 * @return the seatNumber
	 */
	public String getSeatNumber()
	{
		return getSeatNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineDetail.seatNumber</code> attribute. 
	 * @param value the seatNumber
	 */
	public void setSeatNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEATNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineDetail.seatNumber</code> attribute. 
	 * @param value the seatNumber
	 */
	public void setSeatNumber(final String value)
	{
		setSeatNumber( getSession().getSessionContext(), value );
	}
	
}
