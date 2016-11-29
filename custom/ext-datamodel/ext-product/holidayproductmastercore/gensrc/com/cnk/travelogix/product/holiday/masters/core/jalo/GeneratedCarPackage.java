/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.RentalTransferDayWiseItinerary;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.CarPackage CarPackage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCarPackage extends RentalTransferDayWiseItinerary
{
	/** Qualifier of the <code>CarPackage.cities</code> attribute **/
	public static final String CITIES = "cities";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(RentalTransferDayWiseItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CITIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPackage.cities</code> attribute.
	 * @return the cities - Cities
	 */
	public Collection<City> getCities(final SessionContext ctx)
	{
		Collection<City> coll = (Collection<City>)getProperty( ctx, CITIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPackage.cities</code> attribute.
	 * @return the cities - Cities
	 */
	public Collection<City> getCities()
	{
		return getCities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPackage.cities</code> attribute. 
	 * @param value the cities - Cities
	 */
	public void setCities(final SessionContext ctx, final Collection<City> value)
	{
		setProperty(ctx, CITIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPackage.cities</code> attribute. 
	 * @param value the cities - Cities
	 */
	public void setCities(final Collection<City> value)
	{
		setCities( getSession().getSessionContext(), value );
	}
	
}
