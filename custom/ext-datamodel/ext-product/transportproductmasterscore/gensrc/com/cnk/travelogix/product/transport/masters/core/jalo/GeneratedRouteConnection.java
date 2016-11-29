/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.Sector;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.RouteConnection RouteConnection}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRouteConnection extends GenericItem
{
	/** Qualifier of the <code>RouteConnection.connectionId</code> attribute **/
	public static final String CONNECTIONID = "connectionId";
	/** Qualifier of the <code>RouteConnection.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>RouteConnection.onlineDate</code> attribute **/
	public static final String ONLINEDATE = "onlineDate";
	/** Qualifier of the <code>RouteConnection.offlineDate</code> attribute **/
	public static final String OFFLINEDATE = "offlineDate";
	/** Qualifier of the <code>RouteConnection.sectors</code> attribute **/
	public static final String SECTORS = "sectors";
	/** Relation ordering override parameter constants for RouteConnectionToSector from ((transportproductmasterscore))*/
	protected static String ROUTECONNECTIONTOSECTOR_SRC_ORDERED = "relation.RouteConnectionToSector.source.ordered";
	protected static String ROUTECONNECTIONTOSECTOR_TGT_ORDERED = "relation.RouteConnectionToSector.target.ordered";
	/** Relation disable markmodifed parameter constants for RouteConnectionToSector from ((transportproductmasterscore))*/
	protected static String ROUTECONNECTIONTOSECTOR_MARKMODIFIED = "relation.RouteConnectionToSector.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CONNECTIONID, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.active</code> attribute.
	 * @return the active - To show the Sector Status.
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.active</code> attribute.
	 * @return the active - To show the Sector Status.
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.active</code> attribute. 
	 * @return the active - To show the Sector Status.
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.active</code> attribute. 
	 * @return the active - To show the Sector Status.
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.active</code> attribute. 
	 * @param value the active - To show the Sector Status.
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.active</code> attribute. 
	 * @param value the active - To show the Sector Status.
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.active</code> attribute. 
	 * @param value the active - To show the Sector Status.
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.active</code> attribute. 
	 * @param value the active - To show the Sector Status.
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.connectionId</code> attribute.
	 * @return the connectionId - Route connection ID
	 */
	public String getConnectionId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONNECTIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.connectionId</code> attribute.
	 * @return the connectionId - Route connection ID
	 */
	public String getConnectionId()
	{
		return getConnectionId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.connectionId</code> attribute. 
	 * @param value the connectionId - Route connection ID
	 */
	public void setConnectionId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONNECTIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.connectionId</code> attribute. 
	 * @param value the connectionId - Route connection ID
	 */
	public void setConnectionId(final String value)
	{
		setConnectionId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.offlineDate</code> attribute.
	 * @return the offlineDate - To show the offlineDate.
	 */
	public Date getOfflineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.offlineDate</code> attribute.
	 * @return the offlineDate - To show the offlineDate.
	 */
	public Date getOfflineDate()
	{
		return getOfflineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.offlineDate</code> attribute. 
	 * @param value the offlineDate - To show the offlineDate.
	 */
	public void setOfflineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.offlineDate</code> attribute. 
	 * @param value the offlineDate - To show the offlineDate.
	 */
	public void setOfflineDate(final Date value)
	{
		setOfflineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.onlineDate</code> attribute.
	 * @return the onlineDate - To show the Sector onlineDate.
	 */
	public Date getOnlineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.onlineDate</code> attribute.
	 * @return the onlineDate - To show the Sector onlineDate.
	 */
	public Date getOnlineDate()
	{
		return getOnlineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.onlineDate</code> attribute. 
	 * @param value the onlineDate - To show the Sector onlineDate.
	 */
	public void setOnlineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.onlineDate</code> attribute. 
	 * @param value the onlineDate - To show the Sector onlineDate.
	 */
	public void setOnlineDate(final Date value)
	{
		setOnlineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.sectors</code> attribute.
	 * @return the sectors
	 */
	public Collection<Sector> getSectors(final SessionContext ctx)
	{
		final List<Sector> items = getLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.ROUTECONNECTIONTOSECTOR,
			"Sector",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RouteConnection.sectors</code> attribute.
	 * @return the sectors
	 */
	public Collection<Sector> getSectors()
	{
		return getSectors( getSession().getSessionContext() );
	}
	
	public long getSectorsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.ROUTECONNECTIONTOSECTOR,
			"Sector",
			null
		);
	}
	
	public long getSectorsCount()
	{
		return getSectorsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.sectors</code> attribute. 
	 * @param value the sectors
	 */
	public void setSectors(final SessionContext ctx, final Collection<Sector> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.ROUTECONNECTIONTOSECTOR,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ROUTECONNECTIONTOSECTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RouteConnection.sectors</code> attribute. 
	 * @param value the sectors
	 */
	public void setSectors(final Collection<Sector> value)
	{
		setSectors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sectors. 
	 * @param value the item to add to sectors
	 */
	public void addToSectors(final SessionContext ctx, final Sector value)
	{
		addLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.ROUTECONNECTIONTOSECTOR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ROUTECONNECTIONTOSECTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sectors. 
	 * @param value the item to add to sectors
	 */
	public void addToSectors(final Sector value)
	{
		addToSectors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sectors. 
	 * @param value the item to remove from sectors
	 */
	public void removeFromSectors(final SessionContext ctx, final Sector value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.ROUTECONNECTIONTOSECTOR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ROUTECONNECTIONTOSECTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sectors. 
	 * @param value the item to remove from sectors
	 */
	public void removeFromSectors(final Sector value)
	{
		removeFromSectors( getSession().getSessionContext(), value );
	}
	
}
