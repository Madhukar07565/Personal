/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayFlavor;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.BlackOutDates BlackOutDates}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBlackOutDates extends GenericItem
{
	/** Qualifier of the <code>BlackOutDates.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>BlackOutDates.blackOutDates</code> attribute **/
	public static final String BLACKOUTDATES = "blackOutDates";
	/** Qualifier of the <code>BlackOutDates.holidayFlavor</code> attribute **/
	public static final String HOLIDAYFLAVOR = "holidayFlavor";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOLIDAYFLAVOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBlackOutDates> HOLIDAYFLAVORHANDLER = new BidirectionalOneToManyHandler<GeneratedBlackOutDates>(
	HolidayproductmastercoreConstants.TC.BLACKOUTDATES,
	false,
	"holidayFlavor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(BLACKOUTDATES, AttributeMode.INITIAL);
		tmp.put(HOLIDAYFLAVOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlackOutDates.blackOutDates</code> attribute.
	 * @return the blackOutDates - Black out dates
	 */
	public Set<StandardDateRange> getBlackOutDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, BLACKOUTDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlackOutDates.blackOutDates</code> attribute.
	 * @return the blackOutDates - Black out dates
	 */
	public Set<StandardDateRange> getBlackOutDates()
	{
		return getBlackOutDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlackOutDates.blackOutDates</code> attribute. 
	 * @param value the blackOutDates - Black out dates
	 */
	public void setBlackOutDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, BLACKOUTDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlackOutDates.blackOutDates</code> attribute. 
	 * @param value the blackOutDates - Black out dates
	 */
	public void setBlackOutDates(final Set<StandardDateRange> value)
	{
		setBlackOutDates( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		HOLIDAYFLAVORHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlackOutDates.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - List of week days
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlackOutDates.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - List of week days
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlackOutDates.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - List of week days
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlackOutDates.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - List of week days
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlackOutDates.holidayFlavor</code> attribute.
	 * @return the holidayFlavor
	 */
	public HolidayFlavor getHolidayFlavor(final SessionContext ctx)
	{
		return (HolidayFlavor)getProperty( ctx, HOLIDAYFLAVOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlackOutDates.holidayFlavor</code> attribute.
	 * @return the holidayFlavor
	 */
	public HolidayFlavor getHolidayFlavor()
	{
		return getHolidayFlavor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlackOutDates.holidayFlavor</code> attribute. 
	 * @param value the holidayFlavor
	 */
	public void setHolidayFlavor(final SessionContext ctx, final HolidayFlavor value)
	{
		HOLIDAYFLAVORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlackOutDates.holidayFlavor</code> attribute. 
	 * @param value the holidayFlavor
	 */
	public void setHolidayFlavor(final HolidayFlavor value)
	{
		setHolidayFlavor( getSession().getSessionContext(), value );
	}
	
}
