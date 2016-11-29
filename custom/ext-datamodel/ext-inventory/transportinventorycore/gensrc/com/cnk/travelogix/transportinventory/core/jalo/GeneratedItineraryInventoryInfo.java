/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.Cabin;
import com.cnk.travelogix.product.common.core.jalo.Deck;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.ItineraryInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.ItineraryInventoryInfo ItineraryInventoryInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedItineraryInventoryInfo extends GenericItem
{
	/** Qualifier of the <code>ItineraryInventoryInfo.departureDate</code> attribute **/
	public static final String DEPARTUREDATE = "departureDate";
	/** Qualifier of the <code>ItineraryInventoryInfo.deck</code> attribute **/
	public static final String DECK = "deck";
	/** Qualifier of the <code>ItineraryInventoryInfo.cabin</code> attribute **/
	public static final String CABIN = "cabin";
	/** Qualifier of the <code>ItineraryInventoryInfo.noOfCabinRequested</code> attribute **/
	public static final String NOOFCABINREQUESTED = "noOfCabinRequested";
	/** Qualifier of the <code>ItineraryInventoryInfo.itineraryInfoPOS</code> attribute **/
	public static final String ITINERARYINFOPOS = "itineraryInfoPOS";
	/** Qualifier of the <code>ItineraryInventoryInfo.itineraryInfo</code> attribute **/
	public static final String ITINERARYINFO = "itineraryInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ITINERARYINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedItineraryInventoryInfo> ITINERARYINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedItineraryInventoryInfo>(
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
		tmp.put(DEPARTUREDATE, AttributeMode.INITIAL);
		tmp.put(DECK, AttributeMode.INITIAL);
		tmp.put(CABIN, AttributeMode.INITIAL);
		tmp.put(NOOFCABINREQUESTED, AttributeMode.INITIAL);
		tmp.put(ITINERARYINFOPOS, AttributeMode.INITIAL);
		tmp.put(ITINERARYINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.cabin</code> attribute.
	 * @return the cabin - Cabin
	 */
	public Cabin getCabin(final SessionContext ctx)
	{
		return (Cabin)getProperty( ctx, CABIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.cabin</code> attribute.
	 * @return the cabin - Cabin
	 */
	public Cabin getCabin()
	{
		return getCabin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.cabin</code> attribute. 
	 * @param value the cabin - Cabin
	 */
	public void setCabin(final SessionContext ctx, final Cabin value)
	{
		setProperty(ctx, CABIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.cabin</code> attribute. 
	 * @param value the cabin - Cabin
	 */
	public void setCabin(final Cabin value)
	{
		setCabin( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ITINERARYINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.deck</code> attribute.
	 * @return the deck - Deck
	 */
	public Deck getDeck(final SessionContext ctx)
	{
		return (Deck)getProperty( ctx, DECK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.deck</code> attribute.
	 * @return the deck - Deck
	 */
	public Deck getDeck()
	{
		return getDeck( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.deck</code> attribute. 
	 * @param value the deck - Deck
	 */
	public void setDeck(final SessionContext ctx, final Deck value)
	{
		setProperty(ctx, DECK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.deck</code> attribute. 
	 * @param value the deck - Deck
	 */
	public void setDeck(final Deck value)
	{
		setDeck( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.departureDate</code> attribute.
	 * @return the departureDate - Departure Date
	 */
	public Date getDepartureDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DEPARTUREDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.departureDate</code> attribute.
	 * @return the departureDate - Departure Date
	 */
	public Date getDepartureDate()
	{
		return getDepartureDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.departureDate</code> attribute. 
	 * @param value the departureDate - Departure Date
	 */
	public void setDepartureDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DEPARTUREDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.departureDate</code> attribute. 
	 * @param value the departureDate - Departure Date
	 */
	public void setDepartureDate(final Date value)
	{
		setDepartureDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.itineraryInfo</code> attribute.
	 * @return the itineraryInfo
	 */
	public ItineraryInfo getItineraryInfo(final SessionContext ctx)
	{
		return (ItineraryInfo)getProperty( ctx, ITINERARYINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.itineraryInfo</code> attribute.
	 * @return the itineraryInfo
	 */
	public ItineraryInfo getItineraryInfo()
	{
		return getItineraryInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.itineraryInfo</code> attribute. 
	 * @param value the itineraryInfo
	 */
	public void setItineraryInfo(final SessionContext ctx, final ItineraryInfo value)
	{
		ITINERARYINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.itineraryInfo</code> attribute. 
	 * @param value the itineraryInfo
	 */
	public void setItineraryInfo(final ItineraryInfo value)
	{
		setItineraryInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.itineraryInfoPOS</code> attribute.
	 * @return the itineraryInfoPOS
	 */
	 Integer getItineraryInfoPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ITINERARYINFOPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.itineraryInfoPOS</code> attribute.
	 * @return the itineraryInfoPOS
	 */
	 Integer getItineraryInfoPOS()
	{
		return getItineraryInfoPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.itineraryInfoPOS</code> attribute. 
	 * @return the itineraryInfoPOS
	 */
	 int getItineraryInfoPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getItineraryInfoPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.itineraryInfoPOS</code> attribute. 
	 * @return the itineraryInfoPOS
	 */
	 int getItineraryInfoPOSAsPrimitive()
	{
		return getItineraryInfoPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.itineraryInfoPOS</code> attribute. 
	 * @param value the itineraryInfoPOS
	 */
	 void setItineraryInfoPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ITINERARYINFOPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.itineraryInfoPOS</code> attribute. 
	 * @param value the itineraryInfoPOS
	 */
	 void setItineraryInfoPOS(final Integer value)
	{
		setItineraryInfoPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.itineraryInfoPOS</code> attribute. 
	 * @param value the itineraryInfoPOS
	 */
	 void setItineraryInfoPOS(final SessionContext ctx, final int value)
	{
		setItineraryInfoPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.itineraryInfoPOS</code> attribute. 
	 * @param value the itineraryInfoPOS
	 */
	 void setItineraryInfoPOS(final int value)
	{
		setItineraryInfoPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.noOfCabinRequested</code> attribute.
	 * @return the noOfCabinRequested - No Of Cabin Requested
	 */
	public Integer getNoOfCabinRequested(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFCABINREQUESTED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.noOfCabinRequested</code> attribute.
	 * @return the noOfCabinRequested - No Of Cabin Requested
	 */
	public Integer getNoOfCabinRequested()
	{
		return getNoOfCabinRequested( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.noOfCabinRequested</code> attribute. 
	 * @return the noOfCabinRequested - No Of Cabin Requested
	 */
	public int getNoOfCabinRequestedAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfCabinRequested( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryInventoryInfo.noOfCabinRequested</code> attribute. 
	 * @return the noOfCabinRequested - No Of Cabin Requested
	 */
	public int getNoOfCabinRequestedAsPrimitive()
	{
		return getNoOfCabinRequestedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.noOfCabinRequested</code> attribute. 
	 * @param value the noOfCabinRequested - No Of Cabin Requested
	 */
	public void setNoOfCabinRequested(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFCABINREQUESTED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.noOfCabinRequested</code> attribute. 
	 * @param value the noOfCabinRequested - No Of Cabin Requested
	 */
	public void setNoOfCabinRequested(final Integer value)
	{
		setNoOfCabinRequested( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.noOfCabinRequested</code> attribute. 
	 * @param value the noOfCabinRequested - No Of Cabin Requested
	 */
	public void setNoOfCabinRequested(final SessionContext ctx, final int value)
	{
		setNoOfCabinRequested( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryInventoryInfo.noOfCabinRequested</code> attribute. 
	 * @param value the noOfCabinRequested - No Of Cabin Requested
	 */
	public void setNoOfCabinRequested(final int value)
	{
		setNoOfCabinRequested( getSession().getSessionContext(), value );
	}
	
}
