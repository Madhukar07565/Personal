/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.CruisePackage;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.AbstractItinerary;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseOpeningSchedule;
import com.cnk.travelogix.product.transport.masters.core.jalo.ItineraryMedia;
import com.cnk.travelogix.product.transport.masters.core.jalo.RouteInfo;
import com.cnk.travelogix.product.transport.masters.core.jalo.ShoreExcursion;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary CruiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseItinerary extends AbstractItinerary
{
	/** Qualifier of the <code>CruiseItinerary.departureDates</code> attribute **/
	public static final String DEPARTUREDATES = "departureDates";
	/** Qualifier of the <code>CruiseItinerary.blockOutDepartureDates</code> attribute **/
	public static final String BLOCKOUTDEPARTUREDATES = "blockOutDepartureDates";
	/** Qualifier of the <code>CruiseItinerary.sailingDates</code> attribute **/
	public static final String SAILINGDATES = "sailingDates";
	/** Qualifier of the <code>CruiseItinerary.cruiseOperationalDay</code> attribute **/
	public static final String CRUISEOPERATIONALDAY = "cruiseOperationalDay";
	/** Qualifier of the <code>CruiseItinerary.cruiseItinerariesMedias</code> attribute **/
	public static final String CRUISEITINERARIESMEDIAS = "cruiseItinerariesMedias";
	/** Qualifier of the <code>CruiseItinerary.shoreExcursion</code> attribute **/
	public static final String SHOREEXCURSION = "shoreExcursion";
	/** Qualifier of the <code>CruiseItinerary.cruisePackage</code> attribute **/
	public static final String CRUISEPACKAGE = "cruisePackage";
	/** Qualifier of the <code>CruiseItinerary.routes</code> attribute **/
	public static final String ROUTES = "routes";
	/**
	* {@link OneToManyHandler} for handling 1:n CRUISEITINERARIESMEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ItineraryMedia> CRUISEITINERARIESMEDIASHANDLER = new OneToManyHandler<ItineraryMedia>(
	TransportproductmasterscoreConstants.TC.ITINERARYMEDIA,
	true,
	"cruiseItinerary",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SHOREEXCURSION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCruiseItinerary> SHOREEXCURSIONHANDLER = new BidirectionalOneToManyHandler<GeneratedCruiseItinerary>(
	TransportproductmasterscoreConstants.TC.CRUISEITINERARY,
	false,
	"shoreExcursion",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISEPACKAGE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCruiseItinerary> CRUISEPACKAGEHANDLER = new BidirectionalOneToManyHandler<GeneratedCruiseItinerary>(
	TransportproductmasterscoreConstants.TC.CRUISEITINERARY,
	false,
	"cruisePackage",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ROUTES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RouteInfo> ROUTESHANDLER = new OneToManyHandler<RouteInfo>(
	TransportproductmasterscoreConstants.TC.ROUTEINFO,
	true,
	"itineraries",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DEPARTUREDATES, AttributeMode.INITIAL);
		tmp.put(BLOCKOUTDEPARTUREDATES, AttributeMode.INITIAL);
		tmp.put(SAILINGDATES, AttributeMode.INITIAL);
		tmp.put(CRUISEOPERATIONALDAY, AttributeMode.INITIAL);
		tmp.put(SHOREEXCURSION, AttributeMode.INITIAL);
		tmp.put(CRUISEPACKAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.blockOutDepartureDates</code> attribute.
	 * @return the blockOutDepartureDates - BlockOutDepartureDate
	 */
	public Set<StandardDateRange> getBlockOutDepartureDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, BLOCKOUTDEPARTUREDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.blockOutDepartureDates</code> attribute.
	 * @return the blockOutDepartureDates - BlockOutDepartureDate
	 */
	public Set<StandardDateRange> getBlockOutDepartureDates()
	{
		return getBlockOutDepartureDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.blockOutDepartureDates</code> attribute. 
	 * @param value the blockOutDepartureDates - BlockOutDepartureDate
	 */
	public void setBlockOutDepartureDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, BLOCKOUTDEPARTUREDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.blockOutDepartureDates</code> attribute. 
	 * @param value the blockOutDepartureDates - BlockOutDepartureDate
	 */
	public void setBlockOutDepartureDates(final Set<StandardDateRange> value)
	{
		setBlockOutDepartureDates( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SHOREEXCURSIONHANDLER.newInstance(ctx, allAttributes);
		CRUISEPACKAGEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.cruiseItinerariesMedias</code> attribute.
	 * @return the cruiseItinerariesMedias
	 */
	public Collection<ItineraryMedia> getCruiseItinerariesMedias(final SessionContext ctx)
	{
		return CRUISEITINERARIESMEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.cruiseItinerariesMedias</code> attribute.
	 * @return the cruiseItinerariesMedias
	 */
	public Collection<ItineraryMedia> getCruiseItinerariesMedias()
	{
		return getCruiseItinerariesMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.cruiseItinerariesMedias</code> attribute. 
	 * @param value the cruiseItinerariesMedias
	 */
	public void setCruiseItinerariesMedias(final SessionContext ctx, final Collection<ItineraryMedia> value)
	{
		CRUISEITINERARIESMEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.cruiseItinerariesMedias</code> attribute. 
	 * @param value the cruiseItinerariesMedias
	 */
	public void setCruiseItinerariesMedias(final Collection<ItineraryMedia> value)
	{
		setCruiseItinerariesMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruiseItinerariesMedias. 
	 * @param value the item to add to cruiseItinerariesMedias
	 */
	public void addToCruiseItinerariesMedias(final SessionContext ctx, final ItineraryMedia value)
	{
		CRUISEITINERARIESMEDIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruiseItinerariesMedias. 
	 * @param value the item to add to cruiseItinerariesMedias
	 */
	public void addToCruiseItinerariesMedias(final ItineraryMedia value)
	{
		addToCruiseItinerariesMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruiseItinerariesMedias. 
	 * @param value the item to remove from cruiseItinerariesMedias
	 */
	public void removeFromCruiseItinerariesMedias(final SessionContext ctx, final ItineraryMedia value)
	{
		CRUISEITINERARIESMEDIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruiseItinerariesMedias. 
	 * @param value the item to remove from cruiseItinerariesMedias
	 */
	public void removeFromCruiseItinerariesMedias(final ItineraryMedia value)
	{
		removeFromCruiseItinerariesMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.cruiseOperationalDay</code> attribute.
	 * @return the cruiseOperationalDay - CruiseOperationalDay
	 */
	public CruiseOpeningSchedule getCruiseOperationalDay(final SessionContext ctx)
	{
		return (CruiseOpeningSchedule)getProperty( ctx, CRUISEOPERATIONALDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.cruiseOperationalDay</code> attribute.
	 * @return the cruiseOperationalDay - CruiseOperationalDay
	 */
	public CruiseOpeningSchedule getCruiseOperationalDay()
	{
		return getCruiseOperationalDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.cruiseOperationalDay</code> attribute. 
	 * @param value the cruiseOperationalDay - CruiseOperationalDay
	 */
	public void setCruiseOperationalDay(final SessionContext ctx, final CruiseOpeningSchedule value)
	{
		setProperty(ctx, CRUISEOPERATIONALDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.cruiseOperationalDay</code> attribute. 
	 * @param value the cruiseOperationalDay - CruiseOperationalDay
	 */
	public void setCruiseOperationalDay(final CruiseOpeningSchedule value)
	{
		setCruiseOperationalDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.cruisePackage</code> attribute.
	 * @return the cruisePackage
	 */
	public CruisePackage getCruisePackage(final SessionContext ctx)
	{
		return (CruisePackage)getProperty( ctx, CRUISEPACKAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.cruisePackage</code> attribute.
	 * @return the cruisePackage
	 */
	public CruisePackage getCruisePackage()
	{
		return getCruisePackage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.cruisePackage</code> attribute. 
	 * @param value the cruisePackage
	 */
	public void setCruisePackage(final SessionContext ctx, final CruisePackage value)
	{
		CRUISEPACKAGEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.cruisePackage</code> attribute. 
	 * @param value the cruisePackage
	 */
	public void setCruisePackage(final CruisePackage value)
	{
		setCruisePackage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.departureDates</code> attribute.
	 * @return the departureDates - Collection of DepartureDate
	 */
	public Set<StandardDateRange> getDepartureDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, DEPARTUREDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.departureDates</code> attribute.
	 * @return the departureDates - Collection of DepartureDate
	 */
	public Set<StandardDateRange> getDepartureDates()
	{
		return getDepartureDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.departureDates</code> attribute. 
	 * @param value the departureDates - Collection of DepartureDate
	 */
	public void setDepartureDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, DEPARTUREDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.departureDates</code> attribute. 
	 * @param value the departureDates - Collection of DepartureDate
	 */
	public void setDepartureDates(final Set<StandardDateRange> value)
	{
		setDepartureDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.routes</code> attribute.
	 * @return the routes
	 */
	public Collection<RouteInfo> getRoutes(final SessionContext ctx)
	{
		return ROUTESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.routes</code> attribute.
	 * @return the routes
	 */
	public Collection<RouteInfo> getRoutes()
	{
		return getRoutes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.routes</code> attribute. 
	 * @param value the routes
	 */
	public void setRoutes(final SessionContext ctx, final Collection<RouteInfo> value)
	{
		ROUTESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.routes</code> attribute. 
	 * @param value the routes
	 */
	public void setRoutes(final Collection<RouteInfo> value)
	{
		setRoutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routes. 
	 * @param value the item to add to routes
	 */
	public void addToRoutes(final SessionContext ctx, final RouteInfo value)
	{
		ROUTESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routes. 
	 * @param value the item to add to routes
	 */
	public void addToRoutes(final RouteInfo value)
	{
		addToRoutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routes. 
	 * @param value the item to remove from routes
	 */
	public void removeFromRoutes(final SessionContext ctx, final RouteInfo value)
	{
		ROUTESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routes. 
	 * @param value the item to remove from routes
	 */
	public void removeFromRoutes(final RouteInfo value)
	{
		removeFromRoutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.sailingDates</code> attribute.
	 * @return the sailingDates - Collection of SailingDates
	 */
	public Collection<Date> getSailingDates(final SessionContext ctx)
	{
		Collection<Date> coll = (Collection<Date>)getProperty( ctx, SAILINGDATES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.sailingDates</code> attribute.
	 * @return the sailingDates - Collection of SailingDates
	 */
	public Collection<Date> getSailingDates()
	{
		return getSailingDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.sailingDates</code> attribute. 
	 * @param value the sailingDates - Collection of SailingDates
	 */
	public void setSailingDates(final SessionContext ctx, final Collection<Date> value)
	{
		setProperty(ctx, SAILINGDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.sailingDates</code> attribute. 
	 * @param value the sailingDates - Collection of SailingDates
	 */
	public void setSailingDates(final Collection<Date> value)
	{
		setSailingDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.shoreExcursion</code> attribute.
	 * @return the shoreExcursion
	 */
	public ShoreExcursion getShoreExcursion(final SessionContext ctx)
	{
		return (ShoreExcursion)getProperty( ctx, SHOREEXCURSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseItinerary.shoreExcursion</code> attribute.
	 * @return the shoreExcursion
	 */
	public ShoreExcursion getShoreExcursion()
	{
		return getShoreExcursion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.shoreExcursion</code> attribute. 
	 * @param value the shoreExcursion
	 */
	public void setShoreExcursion(final SessionContext ctx, final ShoreExcursion value)
	{
		SHOREEXCURSIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseItinerary.shoreExcursion</code> attribute. 
	 * @param value the shoreExcursion
	 */
	public void setShoreExcursion(final ShoreExcursion value)
	{
		setShoreExcursion( getSession().getSessionContext(), value );
	}
	
}
