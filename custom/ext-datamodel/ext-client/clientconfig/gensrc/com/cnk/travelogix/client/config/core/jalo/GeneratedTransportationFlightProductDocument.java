/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.transport.masters.core.jalo.FlightProduct;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.TransportationFlightProductDocument TransportationFlightProductDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationFlightProductDocument extends AbstractProductDocument
{
	/** Qualifier of the <code>TransportationFlightProductDocument.oneWay</code> attribute **/
	public static final String ONEWAY = "oneWay";
	/** Qualifier of the <code>TransportationFlightProductDocument.return</code> attribute **/
	public static final String RETURN = "return";
	/** Qualifier of the <code>TransportationFlightProductDocument.multiCity</code> attribute **/
	public static final String MULTICITY = "multiCity";
	/** Qualifier of the <code>TransportationFlightProductDocument.airlineName</code> attribute **/
	public static final String AIRLINENAME = "airlineName";
	/** Qualifier of the <code>TransportationFlightProductDocument.countryFrom</code> attribute **/
	public static final String COUNTRYFROM = "countryFrom";
	/** Qualifier of the <code>TransportationFlightProductDocument.cityFrom</code> attribute **/
	public static final String CITYFROM = "cityFrom";
	/** Qualifier of the <code>TransportationFlightProductDocument.countryTo</code> attribute **/
	public static final String COUNTRYTO = "countryTo";
	/** Qualifier of the <code>TransportationFlightProductDocument.cityTo</code> attribute **/
	public static final String CITYTO = "cityTo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductDocument.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ONEWAY, AttributeMode.INITIAL);
		tmp.put(RETURN, AttributeMode.INITIAL);
		tmp.put(MULTICITY, AttributeMode.INITIAL);
		tmp.put(AIRLINENAME, AttributeMode.INITIAL);
		tmp.put(COUNTRYFROM, AttributeMode.INITIAL);
		tmp.put(CITYFROM, AttributeMode.INITIAL);
		tmp.put(COUNTRYTO, AttributeMode.INITIAL);
		tmp.put(CITYTO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.airlineName</code> attribute.
	 * @return the airlineName - Flight Product Air Line Name
	 */
	public FlightProduct getAirlineName(final SessionContext ctx)
	{
		return (FlightProduct)getProperty( ctx, AIRLINENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.airlineName</code> attribute.
	 * @return the airlineName - Flight Product Air Line Name
	 */
	public FlightProduct getAirlineName()
	{
		return getAirlineName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.airlineName</code> attribute. 
	 * @param value the airlineName - Flight Product Air Line Name
	 */
	public void setAirlineName(final SessionContext ctx, final FlightProduct value)
	{
		setProperty(ctx, AIRLINENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.airlineName</code> attribute. 
	 * @param value the airlineName - Flight Product Air Line Name
	 */
	public void setAirlineName(final FlightProduct value)
	{
		setAirlineName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.cityFrom</code> attribute.
	 * @return the cityFrom - Flight Product From City
	 */
	public City getCityFrom(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITYFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.cityFrom</code> attribute.
	 * @return the cityFrom - Flight Product From City
	 */
	public City getCityFrom()
	{
		return getCityFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.cityFrom</code> attribute. 
	 * @param value the cityFrom - Flight Product From City
	 */
	public void setCityFrom(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITYFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.cityFrom</code> attribute. 
	 * @param value the cityFrom - Flight Product From City
	 */
	public void setCityFrom(final City value)
	{
		setCityFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.cityTo</code> attribute.
	 * @return the cityTo - Flight Product To City
	 */
	public City getCityTo(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITYTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.cityTo</code> attribute.
	 * @return the cityTo - Flight Product To City
	 */
	public City getCityTo()
	{
		return getCityTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.cityTo</code> attribute. 
	 * @param value the cityTo - Flight Product To City
	 */
	public void setCityTo(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITYTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.cityTo</code> attribute. 
	 * @param value the cityTo - Flight Product To City
	 */
	public void setCityTo(final City value)
	{
		setCityTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.countryFrom</code> attribute.
	 * @return the countryFrom - Flight Product From Country
	 */
	public Country getCountryFrom(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRYFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.countryFrom</code> attribute.
	 * @return the countryFrom - Flight Product From Country
	 */
	public Country getCountryFrom()
	{
		return getCountryFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.countryFrom</code> attribute. 
	 * @param value the countryFrom - Flight Product From Country
	 */
	public void setCountryFrom(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRYFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.countryFrom</code> attribute. 
	 * @param value the countryFrom - Flight Product From Country
	 */
	public void setCountryFrom(final Country value)
	{
		setCountryFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.countryTo</code> attribute.
	 * @return the countryTo - Flight Product To Country
	 */
	public Country getCountryTo(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRYTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.countryTo</code> attribute.
	 * @return the countryTo - Flight Product To Country
	 */
	public Country getCountryTo()
	{
		return getCountryTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.countryTo</code> attribute. 
	 * @param value the countryTo - Flight Product To Country
	 */
	public void setCountryTo(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRYTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.countryTo</code> attribute. 
	 * @param value the countryTo - Flight Product To Country
	 */
	public void setCountryTo(final Country value)
	{
		setCountryTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.multiCity</code> attribute.
	 * @return the multiCity
	 */
	public Boolean isMultiCity(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MULTICITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.multiCity</code> attribute.
	 * @return the multiCity
	 */
	public Boolean isMultiCity()
	{
		return isMultiCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.multiCity</code> attribute. 
	 * @return the multiCity
	 */
	public boolean isMultiCityAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMultiCity( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.multiCity</code> attribute. 
	 * @return the multiCity
	 */
	public boolean isMultiCityAsPrimitive()
	{
		return isMultiCityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.multiCity</code> attribute. 
	 * @param value the multiCity
	 */
	public void setMultiCity(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MULTICITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.multiCity</code> attribute. 
	 * @param value the multiCity
	 */
	public void setMultiCity(final Boolean value)
	{
		setMultiCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.multiCity</code> attribute. 
	 * @param value the multiCity
	 */
	public void setMultiCity(final SessionContext ctx, final boolean value)
	{
		setMultiCity( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.multiCity</code> attribute. 
	 * @param value the multiCity
	 */
	public void setMultiCity(final boolean value)
	{
		setMultiCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.oneWay</code> attribute.
	 * @return the oneWay
	 */
	public Boolean isOneWay(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ONEWAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.oneWay</code> attribute.
	 * @return the oneWay
	 */
	public Boolean isOneWay()
	{
		return isOneWay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.oneWay</code> attribute. 
	 * @return the oneWay
	 */
	public boolean isOneWayAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOneWay( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.oneWay</code> attribute. 
	 * @return the oneWay
	 */
	public boolean isOneWayAsPrimitive()
	{
		return isOneWayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.oneWay</code> attribute. 
	 * @param value the oneWay
	 */
	public void setOneWay(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ONEWAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.oneWay</code> attribute. 
	 * @param value the oneWay
	 */
	public void setOneWay(final Boolean value)
	{
		setOneWay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.oneWay</code> attribute. 
	 * @param value the oneWay
	 */
	public void setOneWay(final SessionContext ctx, final boolean value)
	{
		setOneWay( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.oneWay</code> attribute. 
	 * @param value the oneWay
	 */
	public void setOneWay(final boolean value)
	{
		setOneWay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.return</code> attribute.
	 * @return the return
	 */
	public Boolean isReturn(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RETURN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.return</code> attribute.
	 * @return the return
	 */
	public Boolean isReturn()
	{
		return isReturn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.return</code> attribute. 
	 * @return the return
	 */
	public boolean isReturnAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReturn( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationFlightProductDocument.return</code> attribute. 
	 * @return the return
	 */
	public boolean isReturnAsPrimitive()
	{
		return isReturnAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.return</code> attribute. 
	 * @param value the return
	 */
	public void setReturn(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RETURN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.return</code> attribute. 
	 * @param value the return
	 */
	public void setReturn(final Boolean value)
	{
		setReturn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.return</code> attribute. 
	 * @param value the return
	 */
	public void setReturn(final SessionContext ctx, final boolean value)
	{
		setReturn( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationFlightProductDocument.return</code> attribute. 
	 * @param value the return
	 */
	public void setReturn(final boolean value)
	{
		setReturn( getSession().getSessionContext(), value );
	}
	
}
