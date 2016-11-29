/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.masterdata.core.iata.jalo.Airport;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.FlightProduct;
import com.cnk.travelogix.product.transport.masters.core.jalo.RouteConnection;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.Sector Sector}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSector extends GenericItem
{
	/** Qualifier of the <code>Sector.fromCountry</code> attribute **/
	public static final String FROMCOUNTRY = "fromCountry";
	/** Qualifier of the <code>Sector.fromCity</code> attribute **/
	public static final String FROMCITY = "fromCity";
	/** Qualifier of the <code>Sector.toCountry</code> attribute **/
	public static final String TOCOUNTRY = "toCountry";
	/** Qualifier of the <code>Sector.toCity</code> attribute **/
	public static final String TOCITY = "toCity";
	/** Qualifier of the <code>Sector.sameAirlineorSameTerminal</code> attribute **/
	public static final String SAMEAIRLINEORSAMETERMINAL = "sameAirlineorSameTerminal";
	/** Qualifier of the <code>Sector.sameAirlineorDifferentTerminal</code> attribute **/
	public static final String SAMEAIRLINEORDIFFERENTTERMINAL = "sameAirlineorDifferentTerminal";
	/** Qualifier of the <code>Sector.differentAirlineorSameTerminal</code> attribute **/
	public static final String DIFFERENTAIRLINEORSAMETERMINAL = "differentAirlineorSameTerminal";
	/** Qualifier of the <code>Sector.differentAirlineorDifferentTerminal</code> attribute **/
	public static final String DIFFERENTAIRLINEORDIFFERENTTERMINAL = "differentAirlineorDifferentTerminal";
	/** Qualifier of the <code>Sector.routeConnection</code> attribute **/
	public static final String ROUTECONNECTION = "routeConnection";
	/** Relation ordering override parameter constants for RouteConnectionToSector from ((transportproductmasterscore))*/
	protected static String ROUTECONNECTIONTOSECTOR_SRC_ORDERED = "relation.RouteConnectionToSector.source.ordered";
	protected static String ROUTECONNECTIONTOSECTOR_TGT_ORDERED = "relation.RouteConnectionToSector.target.ordered";
	/** Relation disable markmodifed parameter constants for RouteConnectionToSector from ((transportproductmasterscore))*/
	protected static String ROUTECONNECTIONTOSECTOR_MARKMODIFIED = "relation.RouteConnectionToSector.markmodified";
	/** Qualifier of the <code>Sector.airlineProducts</code> attribute **/
	public static final String AIRLINEPRODUCTS = "airlineProducts";
	/** Relation ordering override parameter constants for SectorTOFlightProduct from ((transportproductmasterscore))*/
	protected static String SECTORTOFLIGHTPRODUCT_SRC_ORDERED = "relation.SectorTOFlightProduct.source.ordered";
	protected static String SECTORTOFLIGHTPRODUCT_TGT_ORDERED = "relation.SectorTOFlightProduct.target.ordered";
	/** Relation disable markmodifed parameter constants for SectorTOFlightProduct from ((transportproductmasterscore))*/
	protected static String SECTORTOFLIGHTPRODUCT_MARKMODIFIED = "relation.SectorTOFlightProduct.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FROMCOUNTRY, AttributeMode.INITIAL);
		tmp.put(FROMCITY, AttributeMode.INITIAL);
		tmp.put(TOCOUNTRY, AttributeMode.INITIAL);
		tmp.put(TOCITY, AttributeMode.INITIAL);
		tmp.put(SAMEAIRLINEORSAMETERMINAL, AttributeMode.INITIAL);
		tmp.put(SAMEAIRLINEORDIFFERENTTERMINAL, AttributeMode.INITIAL);
		tmp.put(DIFFERENTAIRLINEORSAMETERMINAL, AttributeMode.INITIAL);
		tmp.put(DIFFERENTAIRLINEORDIFFERENTTERMINAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.airlineProducts</code> attribute.
	 * @return the airlineProducts
	 */
	public Collection<FlightProduct> getAirlineProducts(final SessionContext ctx)
	{
		final List<FlightProduct> items = getLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.SECTORTOFLIGHTPRODUCT,
			"FlightProduct",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.airlineProducts</code> attribute.
	 * @return the airlineProducts
	 */
	public Collection<FlightProduct> getAirlineProducts()
	{
		return getAirlineProducts( getSession().getSessionContext() );
	}
	
	public long getAirlineProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.SECTORTOFLIGHTPRODUCT,
			"FlightProduct",
			null
		);
	}
	
	public long getAirlineProductsCount()
	{
		return getAirlineProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.airlineProducts</code> attribute. 
	 * @param value the airlineProducts
	 */
	public void setAirlineProducts(final SessionContext ctx, final Collection<FlightProduct> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.SECTORTOFLIGHTPRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SECTORTOFLIGHTPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.airlineProducts</code> attribute. 
	 * @param value the airlineProducts
	 */
	public void setAirlineProducts(final Collection<FlightProduct> value)
	{
		setAirlineProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airlineProducts. 
	 * @param value the item to add to airlineProducts
	 */
	public void addToAirlineProducts(final SessionContext ctx, final FlightProduct value)
	{
		addLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.SECTORTOFLIGHTPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SECTORTOFLIGHTPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airlineProducts. 
	 * @param value the item to add to airlineProducts
	 */
	public void addToAirlineProducts(final FlightProduct value)
	{
		addToAirlineProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airlineProducts. 
	 * @param value the item to remove from airlineProducts
	 */
	public void removeFromAirlineProducts(final SessionContext ctx, final FlightProduct value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.SECTORTOFLIGHTPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SECTORTOFLIGHTPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airlineProducts. 
	 * @param value the item to remove from airlineProducts
	 */
	public void removeFromAirlineProducts(final FlightProduct value)
	{
		removeFromAirlineProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.differentAirlineorDifferentTerminal</code> attribute.
	 * @return the differentAirlineorDifferentTerminal - To show the Sector different Airline or different
	 * 							Terminal.
	 */
	public String getDifferentAirlineorDifferentTerminal(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIFFERENTAIRLINEORDIFFERENTTERMINAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.differentAirlineorDifferentTerminal</code> attribute.
	 * @return the differentAirlineorDifferentTerminal - To show the Sector different Airline or different
	 * 							Terminal.
	 */
	public String getDifferentAirlineorDifferentTerminal()
	{
		return getDifferentAirlineorDifferentTerminal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.differentAirlineorDifferentTerminal</code> attribute. 
	 * @param value the differentAirlineorDifferentTerminal - To show the Sector different Airline or different
	 * 							Terminal.
	 */
	public void setDifferentAirlineorDifferentTerminal(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIFFERENTAIRLINEORDIFFERENTTERMINAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.differentAirlineorDifferentTerminal</code> attribute. 
	 * @param value the differentAirlineorDifferentTerminal - To show the Sector different Airline or different
	 * 							Terminal.
	 */
	public void setDifferentAirlineorDifferentTerminal(final String value)
	{
		setDifferentAirlineorDifferentTerminal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.differentAirlineorSameTerminal</code> attribute.
	 * @return the differentAirlineorSameTerminal - To show the Sector different Airline or same
	 * 							Terminal.
	 */
	public String getDifferentAirlineorSameTerminal(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIFFERENTAIRLINEORSAMETERMINAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.differentAirlineorSameTerminal</code> attribute.
	 * @return the differentAirlineorSameTerminal - To show the Sector different Airline or same
	 * 							Terminal.
	 */
	public String getDifferentAirlineorSameTerminal()
	{
		return getDifferentAirlineorSameTerminal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.differentAirlineorSameTerminal</code> attribute. 
	 * @param value the differentAirlineorSameTerminal - To show the Sector different Airline or same
	 * 							Terminal.
	 */
	public void setDifferentAirlineorSameTerminal(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIFFERENTAIRLINEORSAMETERMINAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.differentAirlineorSameTerminal</code> attribute. 
	 * @param value the differentAirlineorSameTerminal - To show the Sector different Airline or same
	 * 							Terminal.
	 */
	public void setDifferentAirlineorSameTerminal(final String value)
	{
		setDifferentAirlineorSameTerminal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.fromCity</code> attribute.
	 * @return the fromCity - To show the Sector from City.
	 */
	public Airport getFromCity(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, FROMCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.fromCity</code> attribute.
	 * @return the fromCity - To show the Sector from City.
	 */
	public Airport getFromCity()
	{
		return getFromCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.fromCity</code> attribute. 
	 * @param value the fromCity - To show the Sector from City.
	 */
	public void setFromCity(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, FROMCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.fromCity</code> attribute. 
	 * @param value the fromCity - To show the Sector from City.
	 */
	public void setFromCity(final Airport value)
	{
		setFromCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.fromCountry</code> attribute.
	 * @return the fromCountry - To show the Sector from Country.
	 */
	public Country getFromCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, FROMCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.fromCountry</code> attribute.
	 * @return the fromCountry - To show the Sector from Country.
	 */
	public Country getFromCountry()
	{
		return getFromCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.fromCountry</code> attribute. 
	 * @param value the fromCountry - To show the Sector from Country.
	 */
	public void setFromCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, FROMCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.fromCountry</code> attribute. 
	 * @param value the fromCountry - To show the Sector from Country.
	 */
	public void setFromCountry(final Country value)
	{
		setFromCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.routeConnection</code> attribute.
	 * @return the routeConnection
	 */
	public Collection<RouteConnection> getRouteConnection(final SessionContext ctx)
	{
		final List<RouteConnection> items = getLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.ROUTECONNECTIONTOSECTOR,
			"RouteConnection",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.routeConnection</code> attribute.
	 * @return the routeConnection
	 */
	public Collection<RouteConnection> getRouteConnection()
	{
		return getRouteConnection( getSession().getSessionContext() );
	}
	
	public long getRouteConnectionCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.ROUTECONNECTIONTOSECTOR,
			"RouteConnection",
			null
		);
	}
	
	public long getRouteConnectionCount()
	{
		return getRouteConnectionCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.routeConnection</code> attribute. 
	 * @param value the routeConnection
	 */
	public void setRouteConnection(final SessionContext ctx, final Collection<RouteConnection> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.ROUTECONNECTIONTOSECTOR,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ROUTECONNECTIONTOSECTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.routeConnection</code> attribute. 
	 * @param value the routeConnection
	 */
	public void setRouteConnection(final Collection<RouteConnection> value)
	{
		setRouteConnection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routeConnection. 
	 * @param value the item to add to routeConnection
	 */
	public void addToRouteConnection(final SessionContext ctx, final RouteConnection value)
	{
		addLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.ROUTECONNECTIONTOSECTOR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ROUTECONNECTIONTOSECTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routeConnection. 
	 * @param value the item to add to routeConnection
	 */
	public void addToRouteConnection(final RouteConnection value)
	{
		addToRouteConnection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routeConnection. 
	 * @param value the item to remove from routeConnection
	 */
	public void removeFromRouteConnection(final SessionContext ctx, final RouteConnection value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.ROUTECONNECTIONTOSECTOR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ROUTECONNECTIONTOSECTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routeConnection. 
	 * @param value the item to remove from routeConnection
	 */
	public void removeFromRouteConnection(final RouteConnection value)
	{
		removeFromRouteConnection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.sameAirlineorDifferentTerminal</code> attribute.
	 * @return the sameAirlineorDifferentTerminal - To show the Sector same Airline or different
	 * 							Terminal.
	 */
	public String getSameAirlineorDifferentTerminal(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAMEAIRLINEORDIFFERENTTERMINAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.sameAirlineorDifferentTerminal</code> attribute.
	 * @return the sameAirlineorDifferentTerminal - To show the Sector same Airline or different
	 * 							Terminal.
	 */
	public String getSameAirlineorDifferentTerminal()
	{
		return getSameAirlineorDifferentTerminal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.sameAirlineorDifferentTerminal</code> attribute. 
	 * @param value the sameAirlineorDifferentTerminal - To show the Sector same Airline or different
	 * 							Terminal.
	 */
	public void setSameAirlineorDifferentTerminal(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAMEAIRLINEORDIFFERENTTERMINAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.sameAirlineorDifferentTerminal</code> attribute. 
	 * @param value the sameAirlineorDifferentTerminal - To show the Sector same Airline or different
	 * 							Terminal.
	 */
	public void setSameAirlineorDifferentTerminal(final String value)
	{
		setSameAirlineorDifferentTerminal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.sameAirlineorSameTerminal</code> attribute.
	 * @return the sameAirlineorSameTerminal - To show the Sector same Air line or same Terminal.
	 */
	public String getSameAirlineorSameTerminal(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAMEAIRLINEORSAMETERMINAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.sameAirlineorSameTerminal</code> attribute.
	 * @return the sameAirlineorSameTerminal - To show the Sector same Air line or same Terminal.
	 */
	public String getSameAirlineorSameTerminal()
	{
		return getSameAirlineorSameTerminal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.sameAirlineorSameTerminal</code> attribute. 
	 * @param value the sameAirlineorSameTerminal - To show the Sector same Air line or same Terminal.
	 */
	public void setSameAirlineorSameTerminal(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAMEAIRLINEORSAMETERMINAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.sameAirlineorSameTerminal</code> attribute. 
	 * @param value the sameAirlineorSameTerminal - To show the Sector same Air line or same Terminal.
	 */
	public void setSameAirlineorSameTerminal(final String value)
	{
		setSameAirlineorSameTerminal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.toCity</code> attribute.
	 * @return the toCity - To show the Sector to City.
	 */
	public Airport getToCity(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, TOCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.toCity</code> attribute.
	 * @return the toCity - To show the Sector to City.
	 */
	public Airport getToCity()
	{
		return getToCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.toCity</code> attribute. 
	 * @param value the toCity - To show the Sector to City.
	 */
	public void setToCity(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, TOCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.toCity</code> attribute. 
	 * @param value the toCity - To show the Sector to City.
	 */
	public void setToCity(final Airport value)
	{
		setToCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.toCountry</code> attribute.
	 * @return the toCountry - To show the Sector to Country.
	 */
	public Country getToCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, TOCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sector.toCountry</code> attribute.
	 * @return the toCountry - To show the Sector to Country.
	 */
	public Country getToCountry()
	{
		return getToCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.toCountry</code> attribute. 
	 * @param value the toCountry - To show the Sector to Country.
	 */
	public void setToCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, TOCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sector.toCountry</code> attribute. 
	 * @param value the toCountry - To show the Sector to Country.
	 */
	public void setToCountry(final Country value)
	{
		setToCountry( getSession().getSessionContext(), value );
	}
	
}
