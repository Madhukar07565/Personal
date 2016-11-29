/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.iata.jalo.Airport;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.RouteConnection;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.AirRoute AirRoute}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirRoute extends AbstractTravelogixItem
{
	/** Qualifier of the <code>AirRoute.fromCountry</code> attribute **/
	public static final String FROMCOUNTRY = "fromCountry";
	/** Qualifier of the <code>AirRoute.routeFromCity</code> attribute **/
	public static final String ROUTEFROMCITY = "routeFromCity";
	/** Qualifier of the <code>AirRoute.toCountry</code> attribute **/
	public static final String TOCOUNTRY = "toCountry";
	/** Qualifier of the <code>AirRoute.routeToCity</code> attribute **/
	public static final String ROUTETOCITY = "routeToCity";
	/** Qualifier of the <code>AirRoute.onlineDate</code> attribute **/
	public static final String ONLINEDATE = "onlineDate";
	/** Qualifier of the <code>AirRoute.offlineDate</code> attribute **/
	public static final String OFFLINEDATE = "offlineDate";
	/** Qualifier of the <code>AirRoute.sectors</code> attribute **/
	public static final String SECTORS = "sectors";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FROMCOUNTRY, AttributeMode.INITIAL);
		tmp.put(ROUTEFROMCITY, AttributeMode.INITIAL);
		tmp.put(TOCOUNTRY, AttributeMode.INITIAL);
		tmp.put(ROUTETOCITY, AttributeMode.INITIAL);
		tmp.put(ONLINEDATE, AttributeMode.INITIAL);
		tmp.put(OFFLINEDATE, AttributeMode.INITIAL);
		tmp.put(SECTORS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.fromCountry</code> attribute.
	 * @return the fromCountry - To show the AirRoute from Country.
	 */
	public Country getFromCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, FROMCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.fromCountry</code> attribute.
	 * @return the fromCountry - To show the AirRoute from Country.
	 */
	public Country getFromCountry()
	{
		return getFromCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.fromCountry</code> attribute. 
	 * @param value the fromCountry - To show the AirRoute from Country.
	 */
	public void setFromCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, FROMCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.fromCountry</code> attribute. 
	 * @param value the fromCountry - To show the AirRoute from Country.
	 */
	public void setFromCountry(final Country value)
	{
		setFromCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.offlineDate</code> attribute.
	 * @return the offlineDate - To show the Offline Date.
	 */
	public Date getOfflineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.offlineDate</code> attribute.
	 * @return the offlineDate - To show the Offline Date.
	 */
	public Date getOfflineDate()
	{
		return getOfflineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.offlineDate</code> attribute. 
	 * @param value the offlineDate - To show the Offline Date.
	 */
	public void setOfflineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.offlineDate</code> attribute. 
	 * @param value the offlineDate - To show the Offline Date.
	 */
	public void setOfflineDate(final Date value)
	{
		setOfflineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.onlineDate</code> attribute.
	 * @return the onlineDate - To show the online Date.
	 */
	public Date getOnlineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.onlineDate</code> attribute.
	 * @return the onlineDate - To show the online Date.
	 */
	public Date getOnlineDate()
	{
		return getOnlineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.onlineDate</code> attribute. 
	 * @param value the onlineDate - To show the online Date.
	 */
	public void setOnlineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.onlineDate</code> attribute. 
	 * @param value the onlineDate - To show the online Date.
	 */
	public void setOnlineDate(final Date value)
	{
		setOnlineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.routeFromCity</code> attribute.
	 * @return the routeFromCity - To show the AirRoute From City.
	 */
	public Airport getRouteFromCity(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, ROUTEFROMCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.routeFromCity</code> attribute.
	 * @return the routeFromCity - To show the AirRoute From City.
	 */
	public Airport getRouteFromCity()
	{
		return getRouteFromCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.routeFromCity</code> attribute. 
	 * @param value the routeFromCity - To show the AirRoute From City.
	 */
	public void setRouteFromCity(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, ROUTEFROMCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.routeFromCity</code> attribute. 
	 * @param value the routeFromCity - To show the AirRoute From City.
	 */
	public void setRouteFromCity(final Airport value)
	{
		setRouteFromCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.routeToCity</code> attribute.
	 * @return the routeToCity - To show the AirRoute to City.
	 */
	public Airport getRouteToCity(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, ROUTETOCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.routeToCity</code> attribute.
	 * @return the routeToCity - To show the AirRoute to City.
	 */
	public Airport getRouteToCity()
	{
		return getRouteToCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.routeToCity</code> attribute. 
	 * @param value the routeToCity - To show the AirRoute to City.
	 */
	public void setRouteToCity(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, ROUTETOCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.routeToCity</code> attribute. 
	 * @param value the routeToCity - To show the AirRoute to City.
	 */
	public void setRouteToCity(final Airport value)
	{
		setRouteToCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.sectors</code> attribute.
	 * @return the sectors - To show the sectors.
	 */
	public RouteConnection getSectors(final SessionContext ctx)
	{
		return (RouteConnection)getProperty( ctx, SECTORS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.sectors</code> attribute.
	 * @return the sectors - To show the sectors.
	 */
	public RouteConnection getSectors()
	{
		return getSectors( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.sectors</code> attribute. 
	 * @param value the sectors - To show the sectors.
	 */
	public void setSectors(final SessionContext ctx, final RouteConnection value)
	{
		setProperty(ctx, SECTORS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.sectors</code> attribute. 
	 * @param value the sectors - To show the sectors.
	 */
	public void setSectors(final RouteConnection value)
	{
		setSectors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.toCountry</code> attribute.
	 * @return the toCountry - To show the AirRoute to Country.
	 */
	public Country getToCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, TOCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirRoute.toCountry</code> attribute.
	 * @return the toCountry - To show the AirRoute to Country.
	 */
	public Country getToCountry()
	{
		return getToCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.toCountry</code> attribute. 
	 * @param value the toCountry - To show the AirRoute to Country.
	 */
	public void setToCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, TOCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirRoute.toCountry</code> attribute. 
	 * @param value the toCountry - To show the AirRoute to Country.
	 */
	public void setToCountry(final Country value)
	{
		setToCountry( getSession().getSessionContext(), value );
	}
	
}
