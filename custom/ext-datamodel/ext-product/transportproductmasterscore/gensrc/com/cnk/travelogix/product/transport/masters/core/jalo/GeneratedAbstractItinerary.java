/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.AbstractItinerary AbstractItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractItinerary extends GenericItem
{
	/** Qualifier of the <code>AbstractItinerary.itineraryId</code> attribute **/
	public static final String ITINERARYID = "itineraryId";
	/** Qualifier of the <code>AbstractItinerary.itineraryName</code> attribute **/
	public static final String ITINERARYNAME = "itineraryName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ITINERARYID, AttributeMode.INITIAL);
		tmp.put(ITINERARYNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractItinerary.itineraryId</code> attribute.
	 * @return the itineraryId - ItineraryId
	 */
	public String getItineraryId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITINERARYID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractItinerary.itineraryId</code> attribute.
	 * @return the itineraryId - ItineraryId
	 */
	public String getItineraryId()
	{
		return getItineraryId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractItinerary.itineraryId</code> attribute. 
	 * @param value the itineraryId - ItineraryId
	 */
	public void setItineraryId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITINERARYID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractItinerary.itineraryId</code> attribute. 
	 * @param value the itineraryId - ItineraryId
	 */
	public void setItineraryId(final String value)
	{
		setItineraryId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractItinerary.itineraryName</code> attribute.
	 * @return the itineraryName - ItineraryName
	 */
	public String getItineraryName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITINERARYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractItinerary.itineraryName</code> attribute.
	 * @return the itineraryName - ItineraryName
	 */
	public String getItineraryName()
	{
		return getItineraryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractItinerary.itineraryName</code> attribute. 
	 * @param value the itineraryName - ItineraryName
	 */
	public void setItineraryName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITINERARYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractItinerary.itineraryName</code> attribute. 
	 * @param value the itineraryName - ItineraryName
	 */
	public void setItineraryName(final String value)
	{
		setItineraryName( getSession().getSessionContext(), value );
	}
	
}
