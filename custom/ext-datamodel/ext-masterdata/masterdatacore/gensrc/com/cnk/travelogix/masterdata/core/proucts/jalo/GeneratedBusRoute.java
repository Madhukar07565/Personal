/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.proucts.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.proucts.jalo.BusRoute BusRoute}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBusRoute extends GenericItem
{
	/** Qualifier of the <code>BusRoute.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>BusRoute.from</code> attribute **/
	public static final String FROM = "from";
	/** Qualifier of the <code>BusRoute.to</code> attribute **/
	public static final String TO = "to";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(FROM, AttributeMode.INITIAL);
		tmp.put(TO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusRoute.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusRoute.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusRoute.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusRoute.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusRoute.from</code> attribute.
	 * @return the from
	 */
	public City getFrom(final SessionContext ctx)
	{
		return (City)getProperty( ctx, FROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusRoute.from</code> attribute.
	 * @return the from
	 */
	public City getFrom()
	{
		return getFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusRoute.from</code> attribute. 
	 * @param value the from
	 */
	public void setFrom(final SessionContext ctx, final City value)
	{
		setProperty(ctx, FROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusRoute.from</code> attribute. 
	 * @param value the from
	 */
	public void setFrom(final City value)
	{
		setFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusRoute.to</code> attribute.
	 * @return the to
	 */
	public City getTo(final SessionContext ctx)
	{
		return (City)getProperty( ctx, TO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusRoute.to</code> attribute.
	 * @return the to
	 */
	public City getTo()
	{
		return getTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusRoute.to</code> attribute. 
	 * @param value the to
	 */
	public void setTo(final SessionContext ctx, final City value)
	{
		setProperty(ctx, TO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusRoute.to</code> attribute. 
	 * @param value the to
	 */
	public void setTo(final City value)
	{
		setTo( getSession().getSessionContext(), value );
	}
	
}
