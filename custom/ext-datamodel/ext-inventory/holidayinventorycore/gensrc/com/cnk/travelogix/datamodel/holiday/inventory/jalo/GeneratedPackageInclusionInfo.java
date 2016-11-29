/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.holiday.inventory.jalo;

import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.DayWiseItinerary;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.holiday.inventory.jalo.PackageInclusionInfo PackageInclusionInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPackageInclusionInfo extends GenericItem
{
	/** Qualifier of the <code>PackageInclusionInfo.serviceBasedDayWiseItineraries</code> attribute **/
	public static final String SERVICEBASEDDAYWISEITINERARIES = "serviceBasedDayWiseItineraries";
	/** Qualifier of the <code>PackageInclusionInfo.itineraryBasedDayWiseItineraries</code> attribute **/
	public static final String ITINERARYBASEDDAYWISEITINERARIES = "itineraryBasedDayWiseItineraries";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SERVICEBASEDDAYWISEITINERARIES, AttributeMode.INITIAL);
		tmp.put(ITINERARYBASEDDAYWISEITINERARIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PackageInclusionInfo.itineraryBasedDayWiseItineraries</code> attribute.
	 * @return the itineraryBasedDayWiseItineraries - Itinerary Based Day Wise Itineraries
	 */
	public DayWiseItinerary getItineraryBasedDayWiseItineraries(final SessionContext ctx)
	{
		return (DayWiseItinerary)getProperty( ctx, ITINERARYBASEDDAYWISEITINERARIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PackageInclusionInfo.itineraryBasedDayWiseItineraries</code> attribute.
	 * @return the itineraryBasedDayWiseItineraries - Itinerary Based Day Wise Itineraries
	 */
	public DayWiseItinerary getItineraryBasedDayWiseItineraries()
	{
		return getItineraryBasedDayWiseItineraries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PackageInclusionInfo.itineraryBasedDayWiseItineraries</code> attribute. 
	 * @param value the itineraryBasedDayWiseItineraries - Itinerary Based Day Wise Itineraries
	 */
	public void setItineraryBasedDayWiseItineraries(final SessionContext ctx, final DayWiseItinerary value)
	{
		setProperty(ctx, ITINERARYBASEDDAYWISEITINERARIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PackageInclusionInfo.itineraryBasedDayWiseItineraries</code> attribute. 
	 * @param value the itineraryBasedDayWiseItineraries - Itinerary Based Day Wise Itineraries
	 */
	public void setItineraryBasedDayWiseItineraries(final DayWiseItinerary value)
	{
		setItineraryBasedDayWiseItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PackageInclusionInfo.serviceBasedDayWiseItineraries</code> attribute.
	 * @return the serviceBasedDayWiseItineraries - Service Based Day Wise Itineraries
	 */
	public AbstractDayWiseItinerary getServiceBasedDayWiseItineraries(final SessionContext ctx)
	{
		return (AbstractDayWiseItinerary)getProperty( ctx, SERVICEBASEDDAYWISEITINERARIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PackageInclusionInfo.serviceBasedDayWiseItineraries</code> attribute.
	 * @return the serviceBasedDayWiseItineraries - Service Based Day Wise Itineraries
	 */
	public AbstractDayWiseItinerary getServiceBasedDayWiseItineraries()
	{
		return getServiceBasedDayWiseItineraries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PackageInclusionInfo.serviceBasedDayWiseItineraries</code> attribute. 
	 * @param value the serviceBasedDayWiseItineraries - Service Based Day Wise Itineraries
	 */
	public void setServiceBasedDayWiseItineraries(final SessionContext ctx, final AbstractDayWiseItinerary value)
	{
		setProperty(ctx, SERVICEBASEDDAYWISEITINERARIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PackageInclusionInfo.serviceBasedDayWiseItineraries</code> attribute. 
	 * @param value the serviceBasedDayWiseItineraries - Service Based Day Wise Itineraries
	 */
	public void setServiceBasedDayWiseItineraries(final AbstractDayWiseItinerary value)
	{
		setServiceBasedDayWiseItineraries( getSession().getSessionContext(), value );
	}
	
}
