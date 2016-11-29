/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.c2l.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.Location;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.c2l.Region;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.c2l.jalo.Location Location}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLocation extends C2LItem
{
	/** Qualifier of the <code>Location.multicityLocation</code> attribute **/
	public static final String MULTICITYLOCATION = "multicityLocation";
	/** Qualifier of the <code>Location.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>Location.subType</code> attribute **/
	public static final String SUBTYPE = "subType";
	/** Qualifier of the <code>Location.portName</code> attribute **/
	public static final String PORTNAME = "portName";
	/** Qualifier of the <code>Location.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>Location.subCountry</code> attribute **/
	public static final String SUBCOUNTRY = "subCountry";
	/** Qualifier of the <code>Location.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>Location.subState</code> attribute **/
	public static final String SUBSTATE = "subState";
	/** Qualifier of the <code>Location.timeDiv</code> attribute **/
	public static final String TIMEDIV = "timeDiv";
	/** Qualifier of the <code>Location.latitude</code> attribute **/
	public static final String LATITUDE = "latitude";
	/** Qualifier of the <code>Location.longitude</code> attribute **/
	public static final String LONGITUDE = "longitude";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(C2LItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MULTICITYLOCATION, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(SUBTYPE, AttributeMode.INITIAL);
		tmp.put(PORTNAME, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(SUBCOUNTRY, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(SUBSTATE, AttributeMode.INITIAL);
		tmp.put(TIMEDIV, AttributeMode.INITIAL);
		tmp.put(LATITUDE, AttributeMode.INITIAL);
		tmp.put(LONGITUDE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.latitude</code> attribute.
	 * @return the latitude
	 */
	public String getLatitude(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LATITUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.latitude</code> attribute.
	 * @return the latitude
	 */
	public String getLatitude()
	{
		return getLatitude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.latitude</code> attribute. 
	 * @param value the latitude
	 */
	public void setLatitude(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LATITUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.latitude</code> attribute. 
	 * @param value the latitude
	 */
	public void setLatitude(final String value)
	{
		setLatitude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.longitude</code> attribute.
	 * @return the longitude
	 */
	public String getLongitude(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LONGITUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.longitude</code> attribute.
	 * @return the longitude
	 */
	public String getLongitude()
	{
		return getLongitude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.longitude</code> attribute. 
	 * @param value the longitude
	 */
	public void setLongitude(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LONGITUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.longitude</code> attribute. 
	 * @param value the longitude
	 */
	public void setLongitude(final String value)
	{
		setLongitude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.multicityLocation</code> attribute.
	 * @return the multicityLocation
	 */
	public Location getMulticityLocation(final SessionContext ctx)
	{
		return (Location)getProperty( ctx, MULTICITYLOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.multicityLocation</code> attribute.
	 * @return the multicityLocation
	 */
	public Location getMulticityLocation()
	{
		return getMulticityLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.multicityLocation</code> attribute. 
	 * @param value the multicityLocation
	 */
	public void setMulticityLocation(final SessionContext ctx, final Location value)
	{
		setProperty(ctx, MULTICITYLOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.multicityLocation</code> attribute. 
	 * @param value the multicityLocation
	 */
	public void setMulticityLocation(final Location value)
	{
		setMulticityLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.portName</code> attribute.
	 * @return the portName
	 */
	public String getPortName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedLocation.getPortName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PORTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.portName</code> attribute.
	 * @return the portName
	 */
	public String getPortName()
	{
		return getPortName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.portName</code> attribute. 
	 * @return the localized portName
	 */
	public Map<Language,String> getAllPortName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PORTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.portName</code> attribute. 
	 * @return the localized portName
	 */
	public Map<Language,String> getAllPortName()
	{
		return getAllPortName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.portName</code> attribute. 
	 * @param value the portName
	 */
	public void setPortName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedLocation.setPortName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PORTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.portName</code> attribute. 
	 * @param value the portName
	 */
	public void setPortName(final String value)
	{
		setPortName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.portName</code> attribute. 
	 * @param value the portName
	 */
	public void setAllPortName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PORTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.portName</code> attribute. 
	 * @param value the portName
	 */
	public void setAllPortName(final Map<Language,String> value)
	{
		setAllPortName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.state</code> attribute.
	 * @return the state
	 */
	public Region getState(final SessionContext ctx)
	{
		return (Region)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.state</code> attribute.
	 * @return the state
	 */
	public Region getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final Region value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final Region value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.subCountry</code> attribute.
	 * @return the subCountry
	 */
	public String getSubCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.subCountry</code> attribute.
	 * @return the subCountry
	 */
	public String getSubCountry()
	{
		return getSubCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.subCountry</code> attribute. 
	 * @param value the subCountry
	 */
	public void setSubCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.subCountry</code> attribute. 
	 * @param value the subCountry
	 */
	public void setSubCountry(final String value)
	{
		setSubCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.subState</code> attribute.
	 * @return the subState
	 */
	public String getSubState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.subState</code> attribute.
	 * @return the subState
	 */
	public String getSubState()
	{
		return getSubState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.subState</code> attribute. 
	 * @param value the subState
	 */
	public void setSubState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.subState</code> attribute. 
	 * @param value the subState
	 */
	public void setSubState(final String value)
	{
		setSubState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.subType</code> attribute.
	 * @return the subType
	 */
	public EnumerationValue getSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.subType</code> attribute.
	 * @return the subType
	 */
	public EnumerationValue getSubType()
	{
		return getSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.subType</code> attribute. 
	 * @param value the subType
	 */
	public void setSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.subType</code> attribute. 
	 * @param value the subType
	 */
	public void setSubType(final EnumerationValue value)
	{
		setSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.timeDiv</code> attribute.
	 * @return the timeDiv
	 */
	public String getTimeDiv(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMEDIV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.timeDiv</code> attribute.
	 * @return the timeDiv
	 */
	public String getTimeDiv()
	{
		return getTimeDiv( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.timeDiv</code> attribute. 
	 * @param value the timeDiv
	 */
	public void setTimeDiv(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMEDIV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.timeDiv</code> attribute. 
	 * @param value the timeDiv
	 */
	public void setTimeDiv(final String value)
	{
		setTimeDiv( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
