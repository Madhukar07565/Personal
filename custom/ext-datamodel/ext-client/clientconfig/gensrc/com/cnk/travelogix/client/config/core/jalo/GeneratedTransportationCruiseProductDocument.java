/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.product.common.core.jalo.CruiseBrand;
import com.cnk.travelogix.product.common.core.jalo.CruisePackage;
import com.cnk.travelogix.product.common.core.jalo.Ship;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.TransportationCruiseProductDocument TransportationCruiseProductDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationCruiseProductDocument extends AbstractProductDocument
{
	/** Qualifier of the <code>TransportationCruiseProductDocument.cruiseBrandName</code> attribute **/
	public static final String CRUISEBRANDNAME = "cruiseBrandName";
	/** Qualifier of the <code>TransportationCruiseProductDocument.cruisePackage</code> attribute **/
	public static final String CRUISEPACKAGE = "cruisePackage";
	/** Qualifier of the <code>TransportationCruiseProductDocument.shipName</code> attribute **/
	public static final String SHIPNAME = "shipName";
	/** Qualifier of the <code>TransportationCruiseProductDocument.itineraryName</code> attribute **/
	public static final String ITINERARYNAME = "itineraryName";
	/** Qualifier of the <code>TransportationCruiseProductDocument.destination</code> attribute **/
	public static final String DESTINATION = "destination";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductDocument.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CRUISEBRANDNAME, AttributeMode.INITIAL);
		tmp.put(CRUISEPACKAGE, AttributeMode.INITIAL);
		tmp.put(SHIPNAME, AttributeMode.INITIAL);
		tmp.put(ITINERARYNAME, AttributeMode.INITIAL);
		tmp.put(DESTINATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationCruiseProductDocument.cruiseBrandName</code> attribute.
	 * @return the cruiseBrandName - Transportation Cruise Product Brand name
	 */
	public CruiseBrand getCruiseBrandName(final SessionContext ctx)
	{
		return (CruiseBrand)getProperty( ctx, CRUISEBRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationCruiseProductDocument.cruiseBrandName</code> attribute.
	 * @return the cruiseBrandName - Transportation Cruise Product Brand name
	 */
	public CruiseBrand getCruiseBrandName()
	{
		return getCruiseBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationCruiseProductDocument.cruiseBrandName</code> attribute. 
	 * @param value the cruiseBrandName - Transportation Cruise Product Brand name
	 */
	public void setCruiseBrandName(final SessionContext ctx, final CruiseBrand value)
	{
		setProperty(ctx, CRUISEBRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationCruiseProductDocument.cruiseBrandName</code> attribute. 
	 * @param value the cruiseBrandName - Transportation Cruise Product Brand name
	 */
	public void setCruiseBrandName(final CruiseBrand value)
	{
		setCruiseBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationCruiseProductDocument.cruisePackage</code> attribute.
	 * @return the cruisePackage - Transportation Cruise Product Cruise Package
	 */
	public CruisePackage getCruisePackage(final SessionContext ctx)
	{
		return (CruisePackage)getProperty( ctx, CRUISEPACKAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationCruiseProductDocument.cruisePackage</code> attribute.
	 * @return the cruisePackage - Transportation Cruise Product Cruise Package
	 */
	public CruisePackage getCruisePackage()
	{
		return getCruisePackage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationCruiseProductDocument.cruisePackage</code> attribute. 
	 * @param value the cruisePackage - Transportation Cruise Product Cruise Package
	 */
	public void setCruisePackage(final SessionContext ctx, final CruisePackage value)
	{
		setProperty(ctx, CRUISEPACKAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationCruiseProductDocument.cruisePackage</code> attribute. 
	 * @param value the cruisePackage - Transportation Cruise Product Cruise Package
	 */
	public void setCruisePackage(final CruisePackage value)
	{
		setCruisePackage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationCruiseProductDocument.destination</code> attribute.
	 * @return the destination - Transportation Cruise Product Destination
	 */
	public Continent getDestination(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, DESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationCruiseProductDocument.destination</code> attribute.
	 * @return the destination - Transportation Cruise Product Destination
	 */
	public Continent getDestination()
	{
		return getDestination( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationCruiseProductDocument.destination</code> attribute. 
	 * @param value the destination - Transportation Cruise Product Destination
	 */
	public void setDestination(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, DESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationCruiseProductDocument.destination</code> attribute. 
	 * @param value the destination - Transportation Cruise Product Destination
	 */
	public void setDestination(final Continent value)
	{
		setDestination( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationCruiseProductDocument.itineraryName</code> attribute.
	 * @return the itineraryName - Transportation Cruise Product Itinerary Name
	 */
	public CruiseItinerary getItineraryName(final SessionContext ctx)
	{
		return (CruiseItinerary)getProperty( ctx, ITINERARYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationCruiseProductDocument.itineraryName</code> attribute.
	 * @return the itineraryName - Transportation Cruise Product Itinerary Name
	 */
	public CruiseItinerary getItineraryName()
	{
		return getItineraryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationCruiseProductDocument.itineraryName</code> attribute. 
	 * @param value the itineraryName - Transportation Cruise Product Itinerary Name
	 */
	public void setItineraryName(final SessionContext ctx, final CruiseItinerary value)
	{
		setProperty(ctx, ITINERARYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationCruiseProductDocument.itineraryName</code> attribute. 
	 * @param value the itineraryName - Transportation Cruise Product Itinerary Name
	 */
	public void setItineraryName(final CruiseItinerary value)
	{
		setItineraryName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationCruiseProductDocument.shipName</code> attribute.
	 * @return the shipName - Transportation Cruise Product Ship
	 */
	public Ship getShipName(final SessionContext ctx)
	{
		return (Ship)getProperty( ctx, SHIPNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationCruiseProductDocument.shipName</code> attribute.
	 * @return the shipName - Transportation Cruise Product Ship
	 */
	public Ship getShipName()
	{
		return getShipName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationCruiseProductDocument.shipName</code> attribute. 
	 * @param value the shipName - Transportation Cruise Product Ship
	 */
	public void setShipName(final SessionContext ctx, final Ship value)
	{
		setProperty(ctx, SHIPNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationCruiseProductDocument.shipName</code> attribute. 
	 * @param value the shipName - Transportation Cruise Product Ship
	 */
	public void setShipName(final Ship value)
	{
		setShipName( getSession().getSessionContext(), value );
	}
	
}
