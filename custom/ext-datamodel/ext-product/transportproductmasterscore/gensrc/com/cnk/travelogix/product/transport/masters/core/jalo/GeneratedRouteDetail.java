/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruisePort;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseRoute;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.RouteDetail RouteDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRouteDetail extends GenericItem
{
	/** Qualifier of the <code>RouteDetail.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>RouteDetail.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>RouteDetail.placeType</code> attribute **/
	public static final String PLACETYPE = "placeType";
	/** Qualifier of the <code>RouteDetail.portName</code> attribute **/
	public static final String PORTNAME = "portName";
	/** Qualifier of the <code>RouteDetail.day</code> attribute **/
	public static final String DAY = "day";
	/** Qualifier of the <code>RouteDetail.cruiseRoute</code> attribute **/
	public static final String CRUISEROUTE = "cruiseRoute";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISEROUTE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRouteDetail> CRUISEROUTEHANDLER = new BidirectionalOneToManyHandler<GeneratedRouteDetail>(
	TransportproductmasterscoreConstants.TC.ROUTEDETAIL,
	false,
	"cruiseRoute",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(PLACETYPE, AttributeMode.INITIAL);
		tmp.put(PORTNAME, AttributeMode.INITIAL);
		tmp.put(DAY, AttributeMode.INITIAL);
		tmp.put(CRUISEROUTE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.city</code> attribute.
	 * @return the city - To show the City Name.
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.city</code> attribute.
	 * @return the city - To show the City Name.
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.city</code> attribute. 
	 * @param value the city - To show the City Name.
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.city</code> attribute. 
	 * @param value the city - To show the City Name.
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.country</code> attribute.
	 * @return the country - To show the country.
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.country</code> attribute.
	 * @return the country - To show the country.
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.country</code> attribute. 
	 * @param value the country - To show the country.
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.country</code> attribute. 
	 * @param value the country - To show the country.
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CRUISEROUTEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.cruiseRoute</code> attribute.
	 * @return the cruiseRoute
	 */
	public CruiseRoute getCruiseRoute(final SessionContext ctx)
	{
		return (CruiseRoute)getProperty( ctx, CRUISEROUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.cruiseRoute</code> attribute.
	 * @return the cruiseRoute
	 */
	public CruiseRoute getCruiseRoute()
	{
		return getCruiseRoute( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.cruiseRoute</code> attribute. 
	 * @param value the cruiseRoute
	 */
	public void setCruiseRoute(final SessionContext ctx, final CruiseRoute value)
	{
		CRUISEROUTEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.cruiseRoute</code> attribute. 
	 * @param value the cruiseRoute
	 */
	public void setCruiseRoute(final CruiseRoute value)
	{
		setCruiseRoute( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.day</code> attribute.
	 * @return the day - To show the day.
	 */
	public Integer getDay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.day</code> attribute.
	 * @return the day - To show the day.
	 */
	public Integer getDay()
	{
		return getDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.day</code> attribute. 
	 * @return the day - To show the day.
	 */
	public int getDayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.day</code> attribute. 
	 * @return the day - To show the day.
	 */
	public int getDayAsPrimitive()
	{
		return getDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.day</code> attribute. 
	 * @param value the day - To show the day.
	 */
	public void setDay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.day</code> attribute. 
	 * @param value the day - To show the day.
	 */
	public void setDay(final Integer value)
	{
		setDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.day</code> attribute. 
	 * @param value the day - To show the day.
	 */
	public void setDay(final SessionContext ctx, final int value)
	{
		setDay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.day</code> attribute. 
	 * @param value the day - To show the day.
	 */
	public void setDay(final int value)
	{
		setDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.placeType</code> attribute.
	 * @return the placeType - To show the Place Type.
	 */
	public EnumerationValue getPlaceType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PLACETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.placeType</code> attribute.
	 * @return the placeType - To show the Place Type.
	 */
	public EnumerationValue getPlaceType()
	{
		return getPlaceType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.placeType</code> attribute. 
	 * @param value the placeType - To show the Place Type.
	 */
	public void setPlaceType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PLACETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.placeType</code> attribute. 
	 * @param value the placeType - To show the Place Type.
	 */
	public void setPlaceType(final EnumerationValue value)
	{
		setPlaceType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.portName</code> attribute.
	 * @return the portName - To show the Cruise Port Name.
	 */
	public CruisePort getPortName(final SessionContext ctx)
	{
		return (CruisePort)getProperty( ctx, PORTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteDetail.portName</code> attribute.
	 * @return the portName - To show the Cruise Port Name.
	 */
	public CruisePort getPortName()
	{
		return getPortName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.portName</code> attribute. 
	 * @param value the portName - To show the Cruise Port Name.
	 */
	public void setPortName(final SessionContext ctx, final CruisePort value)
	{
		setProperty(ctx, PORTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteDetail.portName</code> attribute. 
	 * @param value the portName - To show the Cruise Port Name.
	 */
	public void setPortName(final CruisePort value)
	{
		setPortName( getSession().getSessionContext(), value );
	}
	
}
