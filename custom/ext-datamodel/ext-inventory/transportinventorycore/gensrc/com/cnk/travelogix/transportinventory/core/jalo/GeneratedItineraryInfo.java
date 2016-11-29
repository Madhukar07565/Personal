/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.CruiseInventoryDetail;
import com.cnk.travelogix.transportinventory.core.jalo.ItineraryInventoryInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.ItineraryInfo ItineraryInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedItineraryInfo extends GenericItem
{
	/** Qualifier of the <code>ItineraryInfo.itinerary</code> attribute **/
	public static final String ITINERARY = "itinerary";
	/** Qualifier of the <code>ItineraryInfo.cruiseInventoryDetailsPOS</code> attribute **/
	public static final String CRUISEINVENTORYDETAILSPOS = "cruiseInventoryDetailsPOS";
	/** Qualifier of the <code>ItineraryInfo.cruiseInventoryDetails</code> attribute **/
	public static final String CRUISEINVENTORYDETAILS = "cruiseInventoryDetails";
	/** Qualifier of the <code>ItineraryInfo.itineraryInventoryInfos</code> attribute **/
	public static final String ITINERARYINVENTORYINFOS = "itineraryInventoryInfos";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISEINVENTORYDETAILS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedItineraryInfo> CRUISEINVENTORYDETAILSHANDLER = new BidirectionalOneToManyHandler<GeneratedItineraryInfo>(
	TransportinventorycoreConstants.TC.ITINERARYINFO,
	false,
	"cruiseInventoryDetails",
	"cruiseInventoryDetailsPOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ITINERARYINVENTORYINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ItineraryInventoryInfo> ITINERARYINVENTORYINFOSHANDLER = new OneToManyHandler<ItineraryInventoryInfo>(
	TransportinventorycoreConstants.TC.ITINERARYINVENTORYINFO,
	false,
	"itineraryInfo",
	"itineraryInfoPOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ITINERARY, AttributeMode.INITIAL);
		tmp.put(CRUISEINVENTORYDETAILSPOS, AttributeMode.INITIAL);
		tmp.put(CRUISEINVENTORYDETAILS, AttributeMode.INITIAL);
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
		CRUISEINVENTORYDETAILSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInfo.cruiseInventoryDetails</code> attribute.
	 * @return the cruiseInventoryDetails
	 */
	public CruiseInventoryDetail getCruiseInventoryDetails(final SessionContext ctx)
	{
		return (CruiseInventoryDetail)getProperty( ctx, CRUISEINVENTORYDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInfo.cruiseInventoryDetails</code> attribute.
	 * @return the cruiseInventoryDetails
	 */
	public CruiseInventoryDetail getCruiseInventoryDetails()
	{
		return getCruiseInventoryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInfo.cruiseInventoryDetails</code> attribute. 
	 * @param value the cruiseInventoryDetails
	 */
	public void setCruiseInventoryDetails(final SessionContext ctx, final CruiseInventoryDetail value)
	{
		CRUISEINVENTORYDETAILSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInfo.cruiseInventoryDetails</code> attribute. 
	 * @param value the cruiseInventoryDetails
	 */
	public void setCruiseInventoryDetails(final CruiseInventoryDetail value)
	{
		setCruiseInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInfo.cruiseInventoryDetailsPOS</code> attribute.
	 * @return the cruiseInventoryDetailsPOS
	 */
	 Integer getCruiseInventoryDetailsPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CRUISEINVENTORYDETAILSPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInfo.cruiseInventoryDetailsPOS</code> attribute.
	 * @return the cruiseInventoryDetailsPOS
	 */
	 Integer getCruiseInventoryDetailsPOS()
	{
		return getCruiseInventoryDetailsPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInfo.cruiseInventoryDetailsPOS</code> attribute. 
	 * @return the cruiseInventoryDetailsPOS
	 */
	 int getCruiseInventoryDetailsPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCruiseInventoryDetailsPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInfo.cruiseInventoryDetailsPOS</code> attribute. 
	 * @return the cruiseInventoryDetailsPOS
	 */
	 int getCruiseInventoryDetailsPOSAsPrimitive()
	{
		return getCruiseInventoryDetailsPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInfo.cruiseInventoryDetailsPOS</code> attribute. 
	 * @param value the cruiseInventoryDetailsPOS
	 */
	 void setCruiseInventoryDetailsPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CRUISEINVENTORYDETAILSPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInfo.cruiseInventoryDetailsPOS</code> attribute. 
	 * @param value the cruiseInventoryDetailsPOS
	 */
	 void setCruiseInventoryDetailsPOS(final Integer value)
	{
		setCruiseInventoryDetailsPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInfo.cruiseInventoryDetailsPOS</code> attribute. 
	 * @param value the cruiseInventoryDetailsPOS
	 */
	 void setCruiseInventoryDetailsPOS(final SessionContext ctx, final int value)
	{
		setCruiseInventoryDetailsPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInfo.cruiseInventoryDetailsPOS</code> attribute. 
	 * @param value the cruiseInventoryDetailsPOS
	 */
	 void setCruiseInventoryDetailsPOS(final int value)
	{
		setCruiseInventoryDetailsPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInfo.itinerary</code> attribute.
	 * @return the itinerary - Itinerary
	 */
	public CruiseItinerary getItinerary(final SessionContext ctx)
	{
		return (CruiseItinerary)getProperty( ctx, ITINERARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInfo.itinerary</code> attribute.
	 * @return the itinerary - Itinerary
	 */
	public CruiseItinerary getItinerary()
	{
		return getItinerary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInfo.itinerary</code> attribute. 
	 * @param value the itinerary - Itinerary
	 */
	public void setItinerary(final SessionContext ctx, final CruiseItinerary value)
	{
		setProperty(ctx, ITINERARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInfo.itinerary</code> attribute. 
	 * @param value the itinerary - Itinerary
	 */
	public void setItinerary(final CruiseItinerary value)
	{
		setItinerary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInfo.itineraryInventoryInfos</code> attribute.
	 * @return the itineraryInventoryInfos
	 */
	public Collection<ItineraryInventoryInfo> getItineraryInventoryInfos(final SessionContext ctx)
	{
		return ITINERARYINVENTORYINFOSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInfo.itineraryInventoryInfos</code> attribute.
	 * @return the itineraryInventoryInfos
	 */
	public Collection<ItineraryInventoryInfo> getItineraryInventoryInfos()
	{
		return getItineraryInventoryInfos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInfo.itineraryInventoryInfos</code> attribute. 
	 * @param value the itineraryInventoryInfos
	 */
	public void setItineraryInventoryInfos(final SessionContext ctx, final Collection<ItineraryInventoryInfo> value)
	{
		ITINERARYINVENTORYINFOSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInfo.itineraryInventoryInfos</code> attribute. 
	 * @param value the itineraryInventoryInfos
	 */
	public void setItineraryInventoryInfos(final Collection<ItineraryInventoryInfo> value)
	{
		setItineraryInventoryInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraryInventoryInfos. 
	 * @param value the item to add to itineraryInventoryInfos
	 */
	public void addToItineraryInventoryInfos(final SessionContext ctx, final ItineraryInventoryInfo value)
	{
		ITINERARYINVENTORYINFOSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraryInventoryInfos. 
	 * @param value the item to add to itineraryInventoryInfos
	 */
	public void addToItineraryInventoryInfos(final ItineraryInventoryInfo value)
	{
		addToItineraryInventoryInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraryInventoryInfos. 
	 * @param value the item to remove from itineraryInventoryInfos
	 */
	public void removeFromItineraryInventoryInfos(final SessionContext ctx, final ItineraryInventoryInfo value)
	{
		ITINERARYINVENTORYINFOSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraryInventoryInfos. 
	 * @param value the item to remove from itineraryInventoryInfos
	 */
	public void removeFromItineraryInventoryInfos(final ItineraryInventoryInfo value)
	{
		removeFromItineraryInventoryInfos( getSession().getSessionContext(), value );
	}
	
}
