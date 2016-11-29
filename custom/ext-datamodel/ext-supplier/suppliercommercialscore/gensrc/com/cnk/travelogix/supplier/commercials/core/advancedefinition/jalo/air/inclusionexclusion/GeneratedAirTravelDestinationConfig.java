/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.TravelDestinationConfig;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.AirTravelDestinationConfig AirTravelDestinationConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirTravelDestinationConfig extends TravelDestinationConfig
{
	/** Qualifier of the <code>AirTravelDestinationConfig.directFlight</code> attribute **/
	public static final String DIRECTFLIGHT = "directFlight";
	/** Qualifier of the <code>AirTravelDestinationConfig.viaOnline</code> attribute **/
	public static final String VIAONLINE = "viaOnline";
	/** Qualifier of the <code>AirTravelDestinationConfig.siti</code> attribute **/
	public static final String SITI = "siti";
	/** Qualifier of the <code>AirTravelDestinationConfig.sito</code> attribute **/
	public static final String SITO = "sito";
	/** Qualifier of the <code>AirTravelDestinationConfig.soti</code> attribute **/
	public static final String SOTI = "soti";
	/** Qualifier of the <code>AirTravelDestinationConfig.soto</code> attribute **/
	public static final String SOTO = "soto";
	/** Qualifier of the <code>AirTravelDestinationConfig.oneWay</code> attribute **/
	public static final String ONEWAY = "oneWay";
	/** Qualifier of the <code>AirTravelDestinationConfig.return</code> attribute **/
	public static final String RETURN = "return";
	/** Qualifier of the <code>AirTravelDestinationConfig.multiCity</code> attribute **/
	public static final String MULTICITY = "multiCity";
	/** Qualifier of the <code>AirTravelDestinationConfig.codeShareFlightIncluded</code> attribute **/
	public static final String CODESHAREFLIGHTINCLUDED = "codeShareFlightIncluded";
	/** Qualifier of the <code>AirTravelDestinationConfig.fromContinent</code> attribute **/
	public static final String FROMCONTINENT = "fromContinent";
	/** Qualifier of the <code>AirTravelDestinationConfig.fromCountry</code> attribute **/
	public static final String FROMCOUNTRY = "fromCountry";
	/** Qualifier of the <code>AirTravelDestinationConfig.fromCity</code> attribute **/
	public static final String FROMCITY = "fromCity";
	/** Qualifier of the <code>AirTravelDestinationConfig.viaContinent</code> attribute **/
	public static final String VIACONTINENT = "viaContinent";
	/** Qualifier of the <code>AirTravelDestinationConfig.viaCountry</code> attribute **/
	public static final String VIACOUNTRY = "viaCountry";
	/** Qualifier of the <code>AirTravelDestinationConfig.viaCity</code> attribute **/
	public static final String VIACITY = "viaCity";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(TravelDestinationConfig.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DIRECTFLIGHT, AttributeMode.INITIAL);
		tmp.put(VIAONLINE, AttributeMode.INITIAL);
		tmp.put(SITI, AttributeMode.INITIAL);
		tmp.put(SITO, AttributeMode.INITIAL);
		tmp.put(SOTI, AttributeMode.INITIAL);
		tmp.put(SOTO, AttributeMode.INITIAL);
		tmp.put(ONEWAY, AttributeMode.INITIAL);
		tmp.put(RETURN, AttributeMode.INITIAL);
		tmp.put(MULTICITY, AttributeMode.INITIAL);
		tmp.put(CODESHAREFLIGHTINCLUDED, AttributeMode.INITIAL);
		tmp.put(FROMCONTINENT, AttributeMode.INITIAL);
		tmp.put(FROMCOUNTRY, AttributeMode.INITIAL);
		tmp.put(FROMCITY, AttributeMode.INITIAL);
		tmp.put(VIACONTINENT, AttributeMode.INITIAL);
		tmp.put(VIACOUNTRY, AttributeMode.INITIAL);
		tmp.put(VIACITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.codeShareFlightIncluded</code> attribute.
	 * @return the codeShareFlightIncluded
	 */
	public Boolean isCodeShareFlightIncluded(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CODESHAREFLIGHTINCLUDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.codeShareFlightIncluded</code> attribute.
	 * @return the codeShareFlightIncluded
	 */
	public Boolean isCodeShareFlightIncluded()
	{
		return isCodeShareFlightIncluded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.codeShareFlightIncluded</code> attribute. 
	 * @return the codeShareFlightIncluded
	 */
	public boolean isCodeShareFlightIncludedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCodeShareFlightIncluded( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.codeShareFlightIncluded</code> attribute. 
	 * @return the codeShareFlightIncluded
	 */
	public boolean isCodeShareFlightIncludedAsPrimitive()
	{
		return isCodeShareFlightIncludedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.codeShareFlightIncluded</code> attribute. 
	 * @param value the codeShareFlightIncluded
	 */
	public void setCodeShareFlightIncluded(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CODESHAREFLIGHTINCLUDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.codeShareFlightIncluded</code> attribute. 
	 * @param value the codeShareFlightIncluded
	 */
	public void setCodeShareFlightIncluded(final Boolean value)
	{
		setCodeShareFlightIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.codeShareFlightIncluded</code> attribute. 
	 * @param value the codeShareFlightIncluded
	 */
	public void setCodeShareFlightIncluded(final SessionContext ctx, final boolean value)
	{
		setCodeShareFlightIncluded( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.codeShareFlightIncluded</code> attribute. 
	 * @param value the codeShareFlightIncluded
	 */
	public void setCodeShareFlightIncluded(final boolean value)
	{
		setCodeShareFlightIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.directFlight</code> attribute.
	 * @return the directFlight
	 */
	public Boolean isDirectFlight(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DIRECTFLIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.directFlight</code> attribute.
	 * @return the directFlight
	 */
	public Boolean isDirectFlight()
	{
		return isDirectFlight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.directFlight</code> attribute. 
	 * @return the directFlight
	 */
	public boolean isDirectFlightAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDirectFlight( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.directFlight</code> attribute. 
	 * @return the directFlight
	 */
	public boolean isDirectFlightAsPrimitive()
	{
		return isDirectFlightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.directFlight</code> attribute. 
	 * @param value the directFlight
	 */
	public void setDirectFlight(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DIRECTFLIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.directFlight</code> attribute. 
	 * @param value the directFlight
	 */
	public void setDirectFlight(final Boolean value)
	{
		setDirectFlight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.directFlight</code> attribute. 
	 * @param value the directFlight
	 */
	public void setDirectFlight(final SessionContext ctx, final boolean value)
	{
		setDirectFlight( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.directFlight</code> attribute. 
	 * @param value the directFlight
	 */
	public void setDirectFlight(final boolean value)
	{
		setDirectFlight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.fromCity</code> attribute.
	 * @return the fromCity
	 */
	public City getFromCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, FROMCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.fromCity</code> attribute.
	 * @return the fromCity
	 */
	public City getFromCity()
	{
		return getFromCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.fromCity</code> attribute. 
	 * @param value the fromCity
	 */
	public void setFromCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, FROMCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.fromCity</code> attribute. 
	 * @param value the fromCity
	 */
	public void setFromCity(final City value)
	{
		setFromCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.fromContinent</code> attribute.
	 * @return the fromContinent
	 */
	public Continent getFromContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, FROMCONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.fromContinent</code> attribute.
	 * @return the fromContinent
	 */
	public Continent getFromContinent()
	{
		return getFromContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.fromContinent</code> attribute. 
	 * @param value the fromContinent
	 */
	public void setFromContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, FROMCONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.fromContinent</code> attribute. 
	 * @param value the fromContinent
	 */
	public void setFromContinent(final Continent value)
	{
		setFromContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.fromCountry</code> attribute.
	 * @return the fromCountry
	 */
	public Country getFromCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, FROMCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.fromCountry</code> attribute.
	 * @return the fromCountry
	 */
	public Country getFromCountry()
	{
		return getFromCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.fromCountry</code> attribute. 
	 * @param value the fromCountry
	 */
	public void setFromCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, FROMCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.fromCountry</code> attribute. 
	 * @param value the fromCountry
	 */
	public void setFromCountry(final Country value)
	{
		setFromCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.multiCity</code> attribute.
	 * @return the multiCity
	 */
	public Boolean isMultiCity(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MULTICITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.multiCity</code> attribute.
	 * @return the multiCity
	 */
	public Boolean isMultiCity()
	{
		return isMultiCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.multiCity</code> attribute. 
	 * @return the multiCity
	 */
	public boolean isMultiCityAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMultiCity( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.multiCity</code> attribute. 
	 * @return the multiCity
	 */
	public boolean isMultiCityAsPrimitive()
	{
		return isMultiCityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.multiCity</code> attribute. 
	 * @param value the multiCity
	 */
	public void setMultiCity(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MULTICITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.multiCity</code> attribute. 
	 * @param value the multiCity
	 */
	public void setMultiCity(final Boolean value)
	{
		setMultiCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.multiCity</code> attribute. 
	 * @param value the multiCity
	 */
	public void setMultiCity(final SessionContext ctx, final boolean value)
	{
		setMultiCity( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.multiCity</code> attribute. 
	 * @param value the multiCity
	 */
	public void setMultiCity(final boolean value)
	{
		setMultiCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.oneWay</code> attribute.
	 * @return the oneWay
	 */
	public Boolean isOneWay(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ONEWAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.oneWay</code> attribute.
	 * @return the oneWay
	 */
	public Boolean isOneWay()
	{
		return isOneWay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.oneWay</code> attribute. 
	 * @return the oneWay
	 */
	public boolean isOneWayAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOneWay( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.oneWay</code> attribute. 
	 * @return the oneWay
	 */
	public boolean isOneWayAsPrimitive()
	{
		return isOneWayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.oneWay</code> attribute. 
	 * @param value the oneWay
	 */
	public void setOneWay(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ONEWAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.oneWay</code> attribute. 
	 * @param value the oneWay
	 */
	public void setOneWay(final Boolean value)
	{
		setOneWay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.oneWay</code> attribute. 
	 * @param value the oneWay
	 */
	public void setOneWay(final SessionContext ctx, final boolean value)
	{
		setOneWay( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.oneWay</code> attribute. 
	 * @param value the oneWay
	 */
	public void setOneWay(final boolean value)
	{
		setOneWay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.return</code> attribute.
	 * @return the return
	 */
	public Boolean isReturn(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RETURN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.return</code> attribute.
	 * @return the return
	 */
	public Boolean isReturn()
	{
		return isReturn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.return</code> attribute. 
	 * @return the return
	 */
	public boolean isReturnAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReturn( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.return</code> attribute. 
	 * @return the return
	 */
	public boolean isReturnAsPrimitive()
	{
		return isReturnAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.return</code> attribute. 
	 * @param value the return
	 */
	public void setReturn(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RETURN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.return</code> attribute. 
	 * @param value the return
	 */
	public void setReturn(final Boolean value)
	{
		setReturn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.return</code> attribute. 
	 * @param value the return
	 */
	public void setReturn(final SessionContext ctx, final boolean value)
	{
		setReturn( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.return</code> attribute. 
	 * @param value the return
	 */
	public void setReturn(final boolean value)
	{
		setReturn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.siti</code> attribute.
	 * @return the siti
	 */
	public Boolean isSiti(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SITI);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.siti</code> attribute.
	 * @return the siti
	 */
	public Boolean isSiti()
	{
		return isSiti( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.siti</code> attribute. 
	 * @return the siti
	 */
	public boolean isSitiAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSiti( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.siti</code> attribute. 
	 * @return the siti
	 */
	public boolean isSitiAsPrimitive()
	{
		return isSitiAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.siti</code> attribute. 
	 * @param value the siti
	 */
	public void setSiti(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SITI,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.siti</code> attribute. 
	 * @param value the siti
	 */
	public void setSiti(final Boolean value)
	{
		setSiti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.siti</code> attribute. 
	 * @param value the siti
	 */
	public void setSiti(final SessionContext ctx, final boolean value)
	{
		setSiti( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.siti</code> attribute. 
	 * @param value the siti
	 */
	public void setSiti(final boolean value)
	{
		setSiti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.sito</code> attribute.
	 * @return the sito
	 */
	public Boolean isSito(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SITO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.sito</code> attribute.
	 * @return the sito
	 */
	public Boolean isSito()
	{
		return isSito( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.sito</code> attribute. 
	 * @return the sito
	 */
	public boolean isSitoAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSito( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.sito</code> attribute. 
	 * @return the sito
	 */
	public boolean isSitoAsPrimitive()
	{
		return isSitoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.sito</code> attribute. 
	 * @param value the sito
	 */
	public void setSito(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SITO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.sito</code> attribute. 
	 * @param value the sito
	 */
	public void setSito(final Boolean value)
	{
		setSito( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.sito</code> attribute. 
	 * @param value the sito
	 */
	public void setSito(final SessionContext ctx, final boolean value)
	{
		setSito( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.sito</code> attribute. 
	 * @param value the sito
	 */
	public void setSito(final boolean value)
	{
		setSito( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.soti</code> attribute.
	 * @return the soti
	 */
	public Boolean isSoti(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SOTI);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.soti</code> attribute.
	 * @return the soti
	 */
	public Boolean isSoti()
	{
		return isSoti( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.soti</code> attribute. 
	 * @return the soti
	 */
	public boolean isSotiAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSoti( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.soti</code> attribute. 
	 * @return the soti
	 */
	public boolean isSotiAsPrimitive()
	{
		return isSotiAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.soti</code> attribute. 
	 * @param value the soti
	 */
	public void setSoti(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SOTI,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.soti</code> attribute. 
	 * @param value the soti
	 */
	public void setSoti(final Boolean value)
	{
		setSoti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.soti</code> attribute. 
	 * @param value the soti
	 */
	public void setSoti(final SessionContext ctx, final boolean value)
	{
		setSoti( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.soti</code> attribute. 
	 * @param value the soti
	 */
	public void setSoti(final boolean value)
	{
		setSoti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.soto</code> attribute.
	 * @return the soto
	 */
	public Boolean isSoto(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SOTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.soto</code> attribute.
	 * @return the soto
	 */
	public Boolean isSoto()
	{
		return isSoto( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.soto</code> attribute. 
	 * @return the soto
	 */
	public boolean isSotoAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSoto( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.soto</code> attribute. 
	 * @return the soto
	 */
	public boolean isSotoAsPrimitive()
	{
		return isSotoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.soto</code> attribute. 
	 * @param value the soto
	 */
	public void setSoto(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SOTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.soto</code> attribute. 
	 * @param value the soto
	 */
	public void setSoto(final Boolean value)
	{
		setSoto( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.soto</code> attribute. 
	 * @param value the soto
	 */
	public void setSoto(final SessionContext ctx, final boolean value)
	{
		setSoto( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.soto</code> attribute. 
	 * @param value the soto
	 */
	public void setSoto(final boolean value)
	{
		setSoto( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.viaCity</code> attribute.
	 * @return the viaCity
	 */
	public City getViaCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, VIACITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.viaCity</code> attribute.
	 * @return the viaCity
	 */
	public City getViaCity()
	{
		return getViaCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.viaCity</code> attribute. 
	 * @param value the viaCity
	 */
	public void setViaCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, VIACITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.viaCity</code> attribute. 
	 * @param value the viaCity
	 */
	public void setViaCity(final City value)
	{
		setViaCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.viaContinent</code> attribute.
	 * @return the viaContinent
	 */
	public Continent getViaContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, VIACONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.viaContinent</code> attribute.
	 * @return the viaContinent
	 */
	public Continent getViaContinent()
	{
		return getViaContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.viaContinent</code> attribute. 
	 * @param value the viaContinent
	 */
	public void setViaContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, VIACONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.viaContinent</code> attribute. 
	 * @param value the viaContinent
	 */
	public void setViaContinent(final Continent value)
	{
		setViaContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.viaCountry</code> attribute.
	 * @return the viaCountry
	 */
	public Country getViaCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, VIACOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.viaCountry</code> attribute.
	 * @return the viaCountry
	 */
	public Country getViaCountry()
	{
		return getViaCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.viaCountry</code> attribute. 
	 * @param value the viaCountry
	 */
	public void setViaCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, VIACOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.viaCountry</code> attribute. 
	 * @param value the viaCountry
	 */
	public void setViaCountry(final Country value)
	{
		setViaCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.viaOnline</code> attribute.
	 * @return the viaOnline
	 */
	public Boolean isViaOnline(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, VIAONLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.viaOnline</code> attribute.
	 * @return the viaOnline
	 */
	public Boolean isViaOnline()
	{
		return isViaOnline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.viaOnline</code> attribute. 
	 * @return the viaOnline
	 */
	public boolean isViaOnlineAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isViaOnline( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirTravelDestinationConfig.viaOnline</code> attribute. 
	 * @return the viaOnline
	 */
	public boolean isViaOnlineAsPrimitive()
	{
		return isViaOnlineAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.viaOnline</code> attribute. 
	 * @param value the viaOnline
	 */
	public void setViaOnline(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, VIAONLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.viaOnline</code> attribute. 
	 * @param value the viaOnline
	 */
	public void setViaOnline(final Boolean value)
	{
		setViaOnline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.viaOnline</code> attribute. 
	 * @param value the viaOnline
	 */
	public void setViaOnline(final SessionContext ctx, final boolean value)
	{
		setViaOnline( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirTravelDestinationConfig.viaOnline</code> attribute. 
	 * @param value the viaOnline
	 */
	public void setViaOnline(final boolean value)
	{
		setViaOnline( getSession().getSessionContext(), value );
	}
	
}
