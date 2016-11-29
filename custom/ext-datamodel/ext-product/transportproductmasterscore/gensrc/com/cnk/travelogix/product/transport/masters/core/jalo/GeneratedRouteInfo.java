/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseRoute;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.RouteInfo RouteInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRouteInfo extends GenericItem
{
	/** Qualifier of the <code>RouteInfo.cruiseRoute</code> attribute **/
	public static final String CRUISEROUTE = "cruiseRoute";
	/** Qualifier of the <code>RouteInfo.localArrivalTime</code> attribute **/
	public static final String LOCALARRIVALTIME = "localArrivalTime";
	/** Qualifier of the <code>RouteInfo.localDepartureTime</code> attribute **/
	public static final String LOCALDEPARTURETIME = "localDepartureTime";
	/** Qualifier of the <code>RouteInfo.dayDescriptionRemark</code> attribute **/
	public static final String DAYDESCRIPTIONREMARK = "dayDescriptionRemark";
	/** Qualifier of the <code>RouteInfo.itineraries</code> attribute **/
	public static final String ITINERARIES = "itineraries";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ITINERARIES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRouteInfo> ITINERARIESHANDLER = new BidirectionalOneToManyHandler<GeneratedRouteInfo>(
	TransportproductmasterscoreConstants.TC.ROUTEINFO,
	false,
	"itineraries",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CRUISEROUTE, AttributeMode.INITIAL);
		tmp.put(LOCALARRIVALTIME, AttributeMode.INITIAL);
		tmp.put(LOCALDEPARTURETIME, AttributeMode.INITIAL);
		tmp.put(DAYDESCRIPTIONREMARK, AttributeMode.INITIAL);
		tmp.put(ITINERARIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ITINERARIESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteInfo.cruiseRoute</code> attribute.
	 * @return the cruiseRoute - Description
	 */
	public CruiseRoute getCruiseRoute(final SessionContext ctx)
	{
		return (CruiseRoute)getProperty( ctx, CRUISEROUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteInfo.cruiseRoute</code> attribute.
	 * @return the cruiseRoute - Description
	 */
	public CruiseRoute getCruiseRoute()
	{
		return getCruiseRoute( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteInfo.cruiseRoute</code> attribute. 
	 * @param value the cruiseRoute - Description
	 */
	public void setCruiseRoute(final SessionContext ctx, final CruiseRoute value)
	{
		setProperty(ctx, CRUISEROUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteInfo.cruiseRoute</code> attribute. 
	 * @param value the cruiseRoute - Description
	 */
	public void setCruiseRoute(final CruiseRoute value)
	{
		setCruiseRoute( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteInfo.dayDescriptionRemark</code> attribute.
	 * @return the dayDescriptionRemark - Day Description Remark
	 */
	public String getDayDescriptionRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DAYDESCRIPTIONREMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteInfo.dayDescriptionRemark</code> attribute.
	 * @return the dayDescriptionRemark - Day Description Remark
	 */
	public String getDayDescriptionRemark()
	{
		return getDayDescriptionRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteInfo.dayDescriptionRemark</code> attribute. 
	 * @param value the dayDescriptionRemark - Day Description Remark
	 */
	public void setDayDescriptionRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DAYDESCRIPTIONREMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteInfo.dayDescriptionRemark</code> attribute. 
	 * @param value the dayDescriptionRemark - Day Description Remark
	 */
	public void setDayDescriptionRemark(final String value)
	{
		setDayDescriptionRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteInfo.itineraries</code> attribute.
	 * @return the itineraries
	 */
	public CruiseItinerary getItineraries(final SessionContext ctx)
	{
		return (CruiseItinerary)getProperty( ctx, ITINERARIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteInfo.itineraries</code> attribute.
	 * @return the itineraries
	 */
	public CruiseItinerary getItineraries()
	{
		return getItineraries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteInfo.itineraries</code> attribute. 
	 * @param value the itineraries
	 */
	public void setItineraries(final SessionContext ctx, final CruiseItinerary value)
	{
		ITINERARIESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteInfo.itineraries</code> attribute. 
	 * @param value the itineraries
	 */
	public void setItineraries(final CruiseItinerary value)
	{
		setItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteInfo.localArrivalTime</code> attribute.
	 * @return the localArrivalTime - Local Arrival Time
	 */
	public String getLocalArrivalTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCALARRIVALTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteInfo.localArrivalTime</code> attribute.
	 * @return the localArrivalTime - Local Arrival Time
	 */
	public String getLocalArrivalTime()
	{
		return getLocalArrivalTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteInfo.localArrivalTime</code> attribute. 
	 * @param value the localArrivalTime - Local Arrival Time
	 */
	public void setLocalArrivalTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOCALARRIVALTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteInfo.localArrivalTime</code> attribute. 
	 * @param value the localArrivalTime - Local Arrival Time
	 */
	public void setLocalArrivalTime(final String value)
	{
		setLocalArrivalTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteInfo.localDepartureTime</code> attribute.
	 * @return the localDepartureTime - Local Departure Time
	 */
	public String getLocalDepartureTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCALDEPARTURETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteInfo.localDepartureTime</code> attribute.
	 * @return the localDepartureTime - Local Departure Time
	 */
	public String getLocalDepartureTime()
	{
		return getLocalDepartureTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteInfo.localDepartureTime</code> attribute. 
	 * @param value the localDepartureTime - Local Departure Time
	 */
	public void setLocalDepartureTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOCALDEPARTURETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteInfo.localDepartureTime</code> attribute. 
	 * @param value the localDepartureTime - Local Departure Time
	 */
	public void setLocalDepartureTime(final String value)
	{
		setLocalDepartureTime( getSession().getSessionContext(), value );
	}
	
}
