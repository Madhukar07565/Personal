/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.RailTransferDayWiseItinerary;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.RailPassTransferDayWiseItinerary RailPassTransferDayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRailPassTransferDayWiseItinerary extends RailTransferDayWiseItinerary
{
	/** Qualifier of the <code>RailPassTransferDayWiseItinerary.countries</code> attribute **/
	public static final String COUNTRIES = "countries";
	/** Qualifier of the <code>RailPassTransferDayWiseItinerary.numberOfDays</code> attribute **/
	public static final String NUMBEROFDAYS = "numberOfDays";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(RailTransferDayWiseItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COUNTRIES, AttributeMode.INITIAL);
		tmp.put(NUMBEROFDAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailPassTransferDayWiseItinerary.countries</code> attribute.
	 * @return the countries - Countries
	 */
	public Collection<Country> getCountries(final SessionContext ctx)
	{
		Collection<Country> coll = (Collection<Country>)getProperty( ctx, COUNTRIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailPassTransferDayWiseItinerary.countries</code> attribute.
	 * @return the countries - Countries
	 */
	public Collection<Country> getCountries()
	{
		return getCountries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailPassTransferDayWiseItinerary.countries</code> attribute. 
	 * @param value the countries - Countries
	 */
	public void setCountries(final SessionContext ctx, final Collection<Country> value)
	{
		setProperty(ctx, COUNTRIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailPassTransferDayWiseItinerary.countries</code> attribute. 
	 * @param value the countries - Countries
	 */
	public void setCountries(final Collection<Country> value)
	{
		setCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailPassTransferDayWiseItinerary.numberOfDays</code> attribute.
	 * @return the numberOfDays - Number of days
	 */
	public Integer getNumberOfDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailPassTransferDayWiseItinerary.numberOfDays</code> attribute.
	 * @return the numberOfDays - Number of days
	 */
	public Integer getNumberOfDays()
	{
		return getNumberOfDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailPassTransferDayWiseItinerary.numberOfDays</code> attribute. 
	 * @return the numberOfDays - Number of days
	 */
	public int getNumberOfDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailPassTransferDayWiseItinerary.numberOfDays</code> attribute. 
	 * @return the numberOfDays - Number of days
	 */
	public int getNumberOfDaysAsPrimitive()
	{
		return getNumberOfDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailPassTransferDayWiseItinerary.numberOfDays</code> attribute. 
	 * @param value the numberOfDays - Number of days
	 */
	public void setNumberOfDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailPassTransferDayWiseItinerary.numberOfDays</code> attribute. 
	 * @param value the numberOfDays - Number of days
	 */
	public void setNumberOfDays(final Integer value)
	{
		setNumberOfDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailPassTransferDayWiseItinerary.numberOfDays</code> attribute. 
	 * @param value the numberOfDays - Number of days
	 */
	public void setNumberOfDays(final SessionContext ctx, final int value)
	{
		setNumberOfDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailPassTransferDayWiseItinerary.numberOfDays</code> attribute. 
	 * @param value the numberOfDays - Number of days
	 */
	public void setNumberOfDays(final int value)
	{
		setNumberOfDays( getSession().getSessionContext(), value );
	}
	
}
