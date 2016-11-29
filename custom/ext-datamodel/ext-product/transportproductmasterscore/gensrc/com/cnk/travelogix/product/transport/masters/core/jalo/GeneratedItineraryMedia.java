/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.ItineraryMedia ItineraryMedia}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedItineraryMedia extends Media
{
	/** Qualifier of the <code>ItineraryMedia.day</code> attribute **/
	public static final String DAY = "day";
	/** Qualifier of the <code>ItineraryMedia.cruiseItinerary</code> attribute **/
	public static final String CRUISEITINERARY = "cruiseItinerary";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISEITINERARY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedItineraryMedia> CRUISEITINERARYHANDLER = new BidirectionalOneToManyHandler<GeneratedItineraryMedia>(
	TransportproductmasterscoreConstants.TC.ITINERARYMEDIA,
	false,
	"cruiseItinerary",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Media.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DAY, AttributeMode.INITIAL);
		tmp.put(CRUISEITINERARY, AttributeMode.INITIAL);
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
		CRUISEITINERARYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryMedia.cruiseItinerary</code> attribute.
	 * @return the cruiseItinerary
	 */
	public CruiseItinerary getCruiseItinerary(final SessionContext ctx)
	{
		return (CruiseItinerary)getProperty( ctx, CRUISEITINERARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryMedia.cruiseItinerary</code> attribute.
	 * @return the cruiseItinerary
	 */
	public CruiseItinerary getCruiseItinerary()
	{
		return getCruiseItinerary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryMedia.cruiseItinerary</code> attribute. 
	 * @param value the cruiseItinerary
	 */
	public void setCruiseItinerary(final SessionContext ctx, final CruiseItinerary value)
	{
		CRUISEITINERARYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryMedia.cruiseItinerary</code> attribute. 
	 * @param value the cruiseItinerary
	 */
	public void setCruiseItinerary(final CruiseItinerary value)
	{
		setCruiseItinerary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryMedia.day</code> attribute.
	 * @return the day - Day
	 */
	public Integer getDay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryMedia.day</code> attribute.
	 * @return the day - Day
	 */
	public Integer getDay()
	{
		return getDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryMedia.day</code> attribute. 
	 * @return the day - Day
	 */
	public int getDayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItineraryMedia.day</code> attribute. 
	 * @return the day - Day
	 */
	public int getDayAsPrimitive()
	{
		return getDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryMedia.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryMedia.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final Integer value)
	{
		setDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryMedia.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final SessionContext ctx, final int value)
	{
		setDay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItineraryMedia.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final int value)
	{
		setDay( getSession().getSessionContext(), value );
	}
	
}
