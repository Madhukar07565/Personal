/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.products.jalo.Station;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.PolicyRailTicketsProduct PolicyRailTicketsProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPolicyRailTicketsProduct extends GenericItem
{
	/** Qualifier of the <code>PolicyRailTicketsProduct.OneWay</code> attribute **/
	public static final String ONEWAY = "OneWay";
	/** Qualifier of the <code>PolicyRailTicketsProduct.return</code> attribute **/
	public static final String RETURN = "return";
	/** Qualifier of the <code>PolicyRailTicketsProduct.countryFrom</code> attribute **/
	public static final String COUNTRYFROM = "countryFrom";
	/** Qualifier of the <code>PolicyRailTicketsProduct.countryTo</code> attribute **/
	public static final String COUNTRYTO = "countryTo";
	/** Qualifier of the <code>PolicyRailTicketsProduct.cityFrom</code> attribute **/
	public static final String CITYFROM = "cityFrom";
	/** Qualifier of the <code>PolicyRailTicketsProduct.cityTo</code> attribute **/
	public static final String CITYTO = "cityTo";
	/** Qualifier of the <code>PolicyRailTicketsProduct.stationFrom</code> attribute **/
	public static final String STATIONFROM = "stationFrom";
	/** Qualifier of the <code>PolicyRailTicketsProduct.stationTo</code> attribute **/
	public static final String STATIONTO = "stationTo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ONEWAY, AttributeMode.INITIAL);
		tmp.put(RETURN, AttributeMode.INITIAL);
		tmp.put(COUNTRYFROM, AttributeMode.INITIAL);
		tmp.put(COUNTRYTO, AttributeMode.INITIAL);
		tmp.put(CITYFROM, AttributeMode.INITIAL);
		tmp.put(CITYTO, AttributeMode.INITIAL);
		tmp.put(STATIONFROM, AttributeMode.INITIAL);
		tmp.put(STATIONTO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.cityFrom</code> attribute.
	 * @return the cityFrom - Rail Ticket From City
	 */
	public City getCityFrom(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITYFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.cityFrom</code> attribute.
	 * @return the cityFrom - Rail Ticket From City
	 */
	public City getCityFrom()
	{
		return getCityFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.cityFrom</code> attribute. 
	 * @param value the cityFrom - Rail Ticket From City
	 */
	public void setCityFrom(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITYFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.cityFrom</code> attribute. 
	 * @param value the cityFrom - Rail Ticket From City
	 */
	public void setCityFrom(final City value)
	{
		setCityFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.cityTo</code> attribute.
	 * @return the cityTo - Rail Ticket To City
	 */
	public City getCityTo(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITYTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.cityTo</code> attribute.
	 * @return the cityTo - Rail Ticket To City
	 */
	public City getCityTo()
	{
		return getCityTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.cityTo</code> attribute. 
	 * @param value the cityTo - Rail Ticket To City
	 */
	public void setCityTo(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITYTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.cityTo</code> attribute. 
	 * @param value the cityTo - Rail Ticket To City
	 */
	public void setCityTo(final City value)
	{
		setCityTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.countryFrom</code> attribute.
	 * @return the countryFrom - Rail Ticket From Country
	 */
	public Country getCountryFrom(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRYFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.countryFrom</code> attribute.
	 * @return the countryFrom - Rail Ticket From Country
	 */
	public Country getCountryFrom()
	{
		return getCountryFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.countryFrom</code> attribute. 
	 * @param value the countryFrom - Rail Ticket From Country
	 */
	public void setCountryFrom(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRYFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.countryFrom</code> attribute. 
	 * @param value the countryFrom - Rail Ticket From Country
	 */
	public void setCountryFrom(final Country value)
	{
		setCountryFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.countryTo</code> attribute.
	 * @return the countryTo - Rail Ticket To Country
	 */
	public Country getCountryTo(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRYTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.countryTo</code> attribute.
	 * @return the countryTo - Rail Ticket To Country
	 */
	public Country getCountryTo()
	{
		return getCountryTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.countryTo</code> attribute. 
	 * @param value the countryTo - Rail Ticket To Country
	 */
	public void setCountryTo(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRYTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.countryTo</code> attribute. 
	 * @param value the countryTo - Rail Ticket To Country
	 */
	public void setCountryTo(final Country value)
	{
		setCountryTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.OneWay</code> attribute.
	 * @return the OneWay - Rail Ticket Info
	 */
	public Boolean isOneWay(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ONEWAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.OneWay</code> attribute.
	 * @return the OneWay - Rail Ticket Info
	 */
	public Boolean isOneWay()
	{
		return isOneWay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.OneWay</code> attribute. 
	 * @return the OneWay - Rail Ticket Info
	 */
	public boolean isOneWayAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOneWay( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.OneWay</code> attribute. 
	 * @return the OneWay - Rail Ticket Info
	 */
	public boolean isOneWayAsPrimitive()
	{
		return isOneWayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.OneWay</code> attribute. 
	 * @param value the OneWay - Rail Ticket Info
	 */
	public void setOneWay(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ONEWAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.OneWay</code> attribute. 
	 * @param value the OneWay - Rail Ticket Info
	 */
	public void setOneWay(final Boolean value)
	{
		setOneWay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.OneWay</code> attribute. 
	 * @param value the OneWay - Rail Ticket Info
	 */
	public void setOneWay(final SessionContext ctx, final boolean value)
	{
		setOneWay( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.OneWay</code> attribute. 
	 * @param value the OneWay - Rail Ticket Info
	 */
	public void setOneWay(final boolean value)
	{
		setOneWay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.return</code> attribute.
	 * @return the return - Rail Ticket Info
	 */
	public Boolean isReturn(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RETURN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.return</code> attribute.
	 * @return the return - Rail Ticket Info
	 */
	public Boolean isReturn()
	{
		return isReturn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.return</code> attribute. 
	 * @return the return - Rail Ticket Info
	 */
	public boolean isReturnAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReturn( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.return</code> attribute. 
	 * @return the return - Rail Ticket Info
	 */
	public boolean isReturnAsPrimitive()
	{
		return isReturnAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.return</code> attribute. 
	 * @param value the return - Rail Ticket Info
	 */
	public void setReturn(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RETURN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.return</code> attribute. 
	 * @param value the return - Rail Ticket Info
	 */
	public void setReturn(final Boolean value)
	{
		setReturn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.return</code> attribute. 
	 * @param value the return - Rail Ticket Info
	 */
	public void setReturn(final SessionContext ctx, final boolean value)
	{
		setReturn( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.return</code> attribute. 
	 * @param value the return - Rail Ticket Info
	 */
	public void setReturn(final boolean value)
	{
		setReturn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.stationFrom</code> attribute.
	 * @return the stationFrom - Rail Ticket From Station
	 */
	public Station getStationFrom(final SessionContext ctx)
	{
		return (Station)getProperty( ctx, STATIONFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.stationFrom</code> attribute.
	 * @return the stationFrom - Rail Ticket From Station
	 */
	public Station getStationFrom()
	{
		return getStationFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.stationFrom</code> attribute. 
	 * @param value the stationFrom - Rail Ticket From Station
	 */
	public void setStationFrom(final SessionContext ctx, final Station value)
	{
		setProperty(ctx, STATIONFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.stationFrom</code> attribute. 
	 * @param value the stationFrom - Rail Ticket From Station
	 */
	public void setStationFrom(final Station value)
	{
		setStationFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.stationTo</code> attribute.
	 * @return the stationTo - Rail Ticket To Station
	 */
	public Station getStationTo(final SessionContext ctx)
	{
		return (Station)getProperty( ctx, STATIONTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailTicketsProduct.stationTo</code> attribute.
	 * @return the stationTo - Rail Ticket To Station
	 */
	public Station getStationTo()
	{
		return getStationTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.stationTo</code> attribute. 
	 * @param value the stationTo - Rail Ticket To Station
	 */
	public void setStationTo(final SessionContext ctx, final Station value)
	{
		setProperty(ctx, STATIONTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailTicketsProduct.stationTo</code> attribute. 
	 * @param value the stationTo - Rail Ticket To Station
	 */
	public void setStationTo(final Station value)
	{
		setStationTo( getSession().getSessionContext(), value );
	}
	
}
