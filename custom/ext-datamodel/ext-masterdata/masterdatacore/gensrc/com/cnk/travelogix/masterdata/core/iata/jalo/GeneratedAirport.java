/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.iata.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.iata.jalo.AbstractIATAItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.iata.jalo.Airport Airport}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirport extends AbstractIATAItem
{
	/** Qualifier of the <code>Airport.city</code> attribute **/
	public static final String CITY = "city";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractIATAItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.city</code> attribute.
	 * @return the city - City of the Airport
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.city</code> attribute.
	 * @return the city - City of the Airport
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.city</code> attribute. 
	 * @param value the city - City of the Airport
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.city</code> attribute. 
	 * @param value the city - City of the Airport
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
}
