/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.product.common.core.jalo.CruiseDestination;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.RouteDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.CruiseRoute CruiseRoute}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseRoute extends AbstractTravelogixItem
{
	/** Qualifier of the <code>CruiseRoute.routingCommonID</code> attribute **/
	public static final String ROUTINGCOMMONID = "routingCommonID";
	/** Qualifier of the <code>CruiseRoute.cruiseDestinationName</code> attribute **/
	public static final String CRUISEDESTINATIONNAME = "cruiseDestinationName";
	/** Qualifier of the <code>CruiseRoute.numberOfNights</code> attribute **/
	public static final String NUMBEROFNIGHTS = "numberOfNights";
	/** Qualifier of the <code>CruiseRoute.routingName</code> attribute **/
	public static final String ROUTINGNAME = "routingName";
	/** Qualifier of the <code>CruiseRoute.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>CruiseRoute.onlineDate</code> attribute **/
	public static final String ONLINEDATE = "onlineDate";
	/** Qualifier of the <code>CruiseRoute.offlineDate</code> attribute **/
	public static final String OFFLINEDATE = "offlineDate";
	/** Qualifier of the <code>CruiseRoute.routeDetails</code> attribute **/
	public static final String ROUTEDETAILS = "routeDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n ROUTEDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RouteDetail> ROUTEDETAILSHANDLER = new OneToManyHandler<RouteDetail>(
	TransportproductmasterscoreConstants.TC.ROUTEDETAIL,
	true,
	"cruiseRoute",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ROUTINGCOMMONID, AttributeMode.INITIAL);
		tmp.put(CRUISEDESTINATIONNAME, AttributeMode.INITIAL);
		tmp.put(NUMBEROFNIGHTS, AttributeMode.INITIAL);
		tmp.put(ROUTINGNAME, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		tmp.put(ONLINEDATE, AttributeMode.INITIAL);
		tmp.put(OFFLINEDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.copiedFrom</code> attribute.
	 * @return the copiedFrom - To show the copied From.
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.copiedFrom</code> attribute.
	 * @return the copiedFrom - To show the copied From.
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - To show the copied From.
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - To show the copied From.
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.cruiseDestinationName</code> attribute.
	 * @return the cruiseDestinationName - To show the destination Name.
	 */
	public CruiseDestination getCruiseDestinationName(final SessionContext ctx)
	{
		return (CruiseDestination)getProperty( ctx, CRUISEDESTINATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.cruiseDestinationName</code> attribute.
	 * @return the cruiseDestinationName - To show the destination Name.
	 */
	public CruiseDestination getCruiseDestinationName()
	{
		return getCruiseDestinationName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.cruiseDestinationName</code> attribute. 
	 * @param value the cruiseDestinationName - To show the destination Name.
	 */
	public void setCruiseDestinationName(final SessionContext ctx, final CruiseDestination value)
	{
		setProperty(ctx, CRUISEDESTINATIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.cruiseDestinationName</code> attribute. 
	 * @param value the cruiseDestinationName - To show the destination Name.
	 */
	public void setCruiseDestinationName(final CruiseDestination value)
	{
		setCruiseDestinationName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.numberOfNights</code> attribute.
	 * @return the numberOfNights - To show the number Of Nights.
	 */
	public Integer getNumberOfNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.numberOfNights</code> attribute.
	 * @return the numberOfNights - To show the number Of Nights.
	 */
	public Integer getNumberOfNights()
	{
		return getNumberOfNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.numberOfNights</code> attribute. 
	 * @return the numberOfNights - To show the number Of Nights.
	 */
	public int getNumberOfNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.numberOfNights</code> attribute. 
	 * @return the numberOfNights - To show the number Of Nights.
	 */
	public int getNumberOfNightsAsPrimitive()
	{
		return getNumberOfNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.numberOfNights</code> attribute. 
	 * @param value the numberOfNights - To show the number Of Nights.
	 */
	public void setNumberOfNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.numberOfNights</code> attribute. 
	 * @param value the numberOfNights - To show the number Of Nights.
	 */
	public void setNumberOfNights(final Integer value)
	{
		setNumberOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.numberOfNights</code> attribute. 
	 * @param value the numberOfNights - To show the number Of Nights.
	 */
	public void setNumberOfNights(final SessionContext ctx, final int value)
	{
		setNumberOfNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.numberOfNights</code> attribute. 
	 * @param value the numberOfNights - To show the number Of Nights.
	 */
	public void setNumberOfNights(final int value)
	{
		setNumberOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.offlineDate</code> attribute.
	 * @return the offlineDate - To show the Offline Date.
	 */
	public Date getOfflineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.offlineDate</code> attribute.
	 * @return the offlineDate - To show the Offline Date.
	 */
	public Date getOfflineDate()
	{
		return getOfflineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.offlineDate</code> attribute. 
	 * @param value the offlineDate - To show the Offline Date.
	 */
	public void setOfflineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.offlineDate</code> attribute. 
	 * @param value the offlineDate - To show the Offline Date.
	 */
	public void setOfflineDate(final Date value)
	{
		setOfflineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.onlineDate</code> attribute.
	 * @return the onlineDate - To show the Online Date.
	 */
	public Date getOnlineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.onlineDate</code> attribute.
	 * @return the onlineDate - To show the Online Date.
	 */
	public Date getOnlineDate()
	{
		return getOnlineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.onlineDate</code> attribute. 
	 * @param value the onlineDate - To show the Online Date.
	 */
	public void setOnlineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.onlineDate</code> attribute. 
	 * @param value the onlineDate - To show the Online Date.
	 */
	public void setOnlineDate(final Date value)
	{
		setOnlineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.routeDetails</code> attribute.
	 * @return the routeDetails
	 */
	public Collection<RouteDetail> getRouteDetails(final SessionContext ctx)
	{
		return ROUTEDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.routeDetails</code> attribute.
	 * @return the routeDetails
	 */
	public Collection<RouteDetail> getRouteDetails()
	{
		return getRouteDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.routeDetails</code> attribute. 
	 * @param value the routeDetails
	 */
	public void setRouteDetails(final SessionContext ctx, final Collection<RouteDetail> value)
	{
		ROUTEDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.routeDetails</code> attribute. 
	 * @param value the routeDetails
	 */
	public void setRouteDetails(final Collection<RouteDetail> value)
	{
		setRouteDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routeDetails. 
	 * @param value the item to add to routeDetails
	 */
	public void addToRouteDetails(final SessionContext ctx, final RouteDetail value)
	{
		ROUTEDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routeDetails. 
	 * @param value the item to add to routeDetails
	 */
	public void addToRouteDetails(final RouteDetail value)
	{
		addToRouteDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routeDetails. 
	 * @param value the item to remove from routeDetails
	 */
	public void removeFromRouteDetails(final SessionContext ctx, final RouteDetail value)
	{
		ROUTEDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routeDetails. 
	 * @param value the item to remove from routeDetails
	 */
	public void removeFromRouteDetails(final RouteDetail value)
	{
		removeFromRouteDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.routingCommonID</code> attribute.
	 * @return the routingCommonID - To show the routing Common IDs.
	 */
	public String getRoutingCommonID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROUTINGCOMMONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.routingCommonID</code> attribute.
	 * @return the routingCommonID - To show the routing Common IDs.
	 */
	public String getRoutingCommonID()
	{
		return getRoutingCommonID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.routingCommonID</code> attribute. 
	 * @param value the routingCommonID - To show the routing Common IDs.
	 */
	public void setRoutingCommonID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROUTINGCOMMONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.routingCommonID</code> attribute. 
	 * @param value the routingCommonID - To show the routing Common IDs.
	 */
	public void setRoutingCommonID(final String value)
	{
		setRoutingCommonID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.routingName</code> attribute.
	 * @return the routingName - To show the Cruise Route.
	 */
	public String getRoutingName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROUTINGNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRoute.routingName</code> attribute.
	 * @return the routingName - To show the Cruise Route.
	 */
	public String getRoutingName()
	{
		return getRoutingName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.routingName</code> attribute. 
	 * @param value the routingName - To show the Cruise Route.
	 */
	public void setRoutingName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROUTINGNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRoute.routingName</code> attribute. 
	 * @param value the routingName - To show the Cruise Route.
	 */
	public void setRoutingName(final String value)
	{
		setRoutingName( getSession().getSessionContext(), value );
	}
	
}
