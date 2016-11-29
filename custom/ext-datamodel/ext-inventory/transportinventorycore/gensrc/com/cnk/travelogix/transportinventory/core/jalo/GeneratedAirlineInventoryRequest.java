/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryRequest;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInventoryGrid;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.AirlineInventoryRequest AirlineInventoryRequest}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirlineInventoryRequest extends AbstractInventoryRequest
{
	/** Qualifier of the <code>AirlineInventoryRequest.journeyType</code> attribute **/
	public static final String JOURNEYTYPE = "journeyType";
	/** Qualifier of the <code>AirlineInventoryRequest.itinerary</code> attribute **/
	public static final String ITINERARY = "itinerary";
	/** Qualifier of the <code>AirlineInventoryRequest.inventoryDetails</code> attribute **/
	public static final String INVENTORYDETAILS = "inventoryDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirInventoryGrid> INVENTORYDETAILSHANDLER = new OneToManyHandler<AirInventoryGrid>(
	TransportinventorycoreConstants.TC.AIRINVENTORYGRID,
	false,
	"airlineInventoryRequest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryRequest.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JOURNEYTYPE, AttributeMode.INITIAL);
		tmp.put(ITINERARY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineInventoryRequest.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<AirInventoryGrid> getInventoryDetails(final SessionContext ctx)
	{
		return INVENTORYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineInventoryRequest.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<AirInventoryGrid> getInventoryDetails()
	{
		return getInventoryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineInventoryRequest.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final SessionContext ctx, final Collection<AirInventoryGrid> value)
	{
		INVENTORYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineInventoryRequest.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final Collection<AirInventoryGrid> value)
	{
		setInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final SessionContext ctx, final AirInventoryGrid value)
	{
		INVENTORYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final AirInventoryGrid value)
	{
		addToInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final SessionContext ctx, final AirInventoryGrid value)
	{
		INVENTORYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final AirInventoryGrid value)
	{
		removeFromInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineInventoryRequest.itinerary</code> attribute.
	 * @return the itinerary - Itinerary
	 */
	public String getItinerary(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITINERARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineInventoryRequest.itinerary</code> attribute.
	 * @return the itinerary - Itinerary
	 */
	public String getItinerary()
	{
		return getItinerary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineInventoryRequest.itinerary</code> attribute. 
	 * @param value the itinerary - Itinerary
	 */
	public void setItinerary(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITINERARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineInventoryRequest.itinerary</code> attribute. 
	 * @param value the itinerary - Itinerary
	 */
	public void setItinerary(final String value)
	{
		setItinerary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineInventoryRequest.journeyType</code> attribute.
	 * @return the journeyType - Journey Type
	 */
	public EnumerationValue getJourneyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, JOURNEYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineInventoryRequest.journeyType</code> attribute.
	 * @return the journeyType - Journey Type
	 */
	public EnumerationValue getJourneyType()
	{
		return getJourneyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineInventoryRequest.journeyType</code> attribute. 
	 * @param value the journeyType - Journey Type
	 */
	public void setJourneyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, JOURNEYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineInventoryRequest.journeyType</code> attribute. 
	 * @param value the journeyType - Journey Type
	 */
	public void setJourneyType(final EnumerationValue value)
	{
		setJourneyType( getSession().getSessionContext(), value );
	}
	
}
