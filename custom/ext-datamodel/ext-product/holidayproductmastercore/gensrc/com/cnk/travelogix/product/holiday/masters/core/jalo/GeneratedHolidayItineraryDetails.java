/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.DayWiseItinerary;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayItineraryDetails HolidayItineraryDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayItineraryDetails extends GenericItem
{
	/** Qualifier of the <code>HolidayItineraryDetails.itineraryInBrief</code> attribute **/
	public static final String ITINERARYINBRIEF = "itineraryInBrief";
	/** Qualifier of the <code>HolidayItineraryDetails.itineraryDetails</code> attribute **/
	public static final String ITINERARYDETAILS = "itineraryDetails";
	/** Qualifier of the <code>HolidayItineraryDetails.packageCategories</code> attribute **/
	public static final String PACKAGECATEGORIES = "packageCategories";
	/** Qualifier of the <code>HolidayItineraryDetails.dayWiseItinerary</code> attribute **/
	public static final String DAYWISEITINERARY = "dayWiseItinerary";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DAYWISEITINERARY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedHolidayItineraryDetails> DAYWISEITINERARYHANDLER = new BidirectionalOneToManyHandler<GeneratedHolidayItineraryDetails>(
	HolidayproductmastercoreConstants.TC.HOLIDAYITINERARYDETAILS,
	false,
	"dayWiseItinerary",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ITINERARYINBRIEF, AttributeMode.INITIAL);
		tmp.put(ITINERARYDETAILS, AttributeMode.INITIAL);
		tmp.put(PACKAGECATEGORIES, AttributeMode.INITIAL);
		tmp.put(DAYWISEITINERARY, AttributeMode.INITIAL);
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
		DAYWISEITINERARYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayItineraryDetails.dayWiseItinerary</code> attribute.
	 * @return the dayWiseItinerary
	 */
	public DayWiseItinerary getDayWiseItinerary(final SessionContext ctx)
	{
		return (DayWiseItinerary)getProperty( ctx, DAYWISEITINERARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayItineraryDetails.dayWiseItinerary</code> attribute.
	 * @return the dayWiseItinerary
	 */
	public DayWiseItinerary getDayWiseItinerary()
	{
		return getDayWiseItinerary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayItineraryDetails.dayWiseItinerary</code> attribute. 
	 * @param value the dayWiseItinerary
	 */
	public void setDayWiseItinerary(final SessionContext ctx, final DayWiseItinerary value)
	{
		DAYWISEITINERARYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayItineraryDetails.dayWiseItinerary</code> attribute. 
	 * @param value the dayWiseItinerary
	 */
	public void setDayWiseItinerary(final DayWiseItinerary value)
	{
		setDayWiseItinerary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayItineraryDetails.itineraryDetails</code> attribute.
	 * @return the itineraryDetails - Itinerary details
	 */
	public String getItineraryDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITINERARYDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayItineraryDetails.itineraryDetails</code> attribute.
	 * @return the itineraryDetails - Itinerary details
	 */
	public String getItineraryDetails()
	{
		return getItineraryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayItineraryDetails.itineraryDetails</code> attribute. 
	 * @param value the itineraryDetails - Itinerary details
	 */
	public void setItineraryDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITINERARYDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayItineraryDetails.itineraryDetails</code> attribute. 
	 * @param value the itineraryDetails - Itinerary details
	 */
	public void setItineraryDetails(final String value)
	{
		setItineraryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayItineraryDetails.itineraryInBrief</code> attribute.
	 * @return the itineraryInBrief - Itinerary brief
	 */
	public String getItineraryInBrief(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITINERARYINBRIEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayItineraryDetails.itineraryInBrief</code> attribute.
	 * @return the itineraryInBrief - Itinerary brief
	 */
	public String getItineraryInBrief()
	{
		return getItineraryInBrief( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayItineraryDetails.itineraryInBrief</code> attribute. 
	 * @param value the itineraryInBrief - Itinerary brief
	 */
	public void setItineraryInBrief(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITINERARYINBRIEF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayItineraryDetails.itineraryInBrief</code> attribute. 
	 * @param value the itineraryInBrief - Itinerary brief
	 */
	public void setItineraryInBrief(final String value)
	{
		setItineraryInBrief( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayItineraryDetails.packageCategories</code> attribute.
	 * @return the packageCategories - List of package categories
	 */
	public Collection<EnumerationValue> getPackageCategories(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, PACKAGECATEGORIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayItineraryDetails.packageCategories</code> attribute.
	 * @return the packageCategories - List of package categories
	 */
	public Collection<EnumerationValue> getPackageCategories()
	{
		return getPackageCategories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayItineraryDetails.packageCategories</code> attribute. 
	 * @param value the packageCategories - List of package categories
	 */
	public void setPackageCategories(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, PACKAGECATEGORIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayItineraryDetails.packageCategories</code> attribute. 
	 * @param value the packageCategories - List of package categories
	 */
	public void setPackageCategories(final Collection<EnumerationValue> value)
	{
		setPackageCategories( getSession().getSessionContext(), value );
	}
	
}
