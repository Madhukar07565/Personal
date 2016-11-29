/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.CommonFlightInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CommonFlightDetailInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommonFlightDetailInfo extends GenericItem
{
	/** Qualifier of the <code>CommonFlightDetailInfo.flightNumber</code> attribute **/
	public static final String FLIGHTNUMBER = "flightNumber";
	/** Qualifier of the <code>CommonFlightDetailInfo.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>CommonFlightDetailInfo.fromCity</code> attribute **/
	public static final String FROMCITY = "fromCity";
	/** Qualifier of the <code>CommonFlightDetailInfo.fromAirport</code> attribute **/
	public static final String FROMAIRPORT = "fromAirport";
	/** Qualifier of the <code>CommonFlightDetailInfo.fromTerminal</code> attribute **/
	public static final String FROMTERMINAL = "fromTerminal";
	/** Qualifier of the <code>CommonFlightDetailInfo.toCity</code> attribute **/
	public static final String TOCITY = "toCity";
	/** Qualifier of the <code>CommonFlightDetailInfo.toAirport</code> attribute **/
	public static final String TOAIRPORT = "toAirport";
	/** Qualifier of the <code>CommonFlightDetailInfo.toTerminal</code> attribute **/
	public static final String TOTERMINAL = "toTerminal";
	/** Qualifier of the <code>CommonFlightDetailInfo.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>CommonFlightDetailInfo.departureTime</code> attribute **/
	public static final String DEPARTURETIME = "departureTime";
	/** Qualifier of the <code>CommonFlightDetailInfo.arrivalTime</code> attribute **/
	public static final String ARRIVALTIME = "arrivalTime";
	/** Qualifier of the <code>CommonFlightDetailInfo.commonFlightInfo</code> attribute **/
	public static final String COMMONFLIGHTINFO = "commonFlightInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMONFLIGHTINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCommonFlightDetailInfo> COMMONFLIGHTINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedCommonFlightDetailInfo>(
	CommonCoreConstants.TC.COMMONFLIGHTDETAILINFO,
	false,
	"commonFlightInfo",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FLIGHTNUMBER, AttributeMode.INITIAL);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(FROMCITY, AttributeMode.INITIAL);
		tmp.put(FROMAIRPORT, AttributeMode.INITIAL);
		tmp.put(FROMTERMINAL, AttributeMode.INITIAL);
		tmp.put(TOCITY, AttributeMode.INITIAL);
		tmp.put(TOAIRPORT, AttributeMode.INITIAL);
		tmp.put(TOTERMINAL, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(DEPARTURETIME, AttributeMode.INITIAL);
		tmp.put(ARRIVALTIME, AttributeMode.INITIAL);
		tmp.put(COMMONFLIGHTINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.arrivalTime</code> attribute.
	 * @return the arrivalTime
	 */
	public Date getArrivalTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ARRIVALTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.arrivalTime</code> attribute.
	 * @return the arrivalTime
	 */
	public Date getArrivalTime()
	{
		return getArrivalTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.arrivalTime</code> attribute. 
	 * @param value the arrivalTime
	 */
	public void setArrivalTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ARRIVALTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.arrivalTime</code> attribute. 
	 * @param value the arrivalTime
	 */
	public void setArrivalTime(final Date value)
	{
		setArrivalTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public String getCabinClass(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public String getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final String value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.commonFlightInfo</code> attribute.
	 * @return the commonFlightInfo
	 */
	public CommonFlightInfo getCommonFlightInfo(final SessionContext ctx)
	{
		return (CommonFlightInfo)getProperty( ctx, COMMONFLIGHTINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.commonFlightInfo</code> attribute.
	 * @return the commonFlightInfo
	 */
	public CommonFlightInfo getCommonFlightInfo()
	{
		return getCommonFlightInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.commonFlightInfo</code> attribute. 
	 * @param value the commonFlightInfo
	 */
	public void setCommonFlightInfo(final SessionContext ctx, final CommonFlightInfo value)
	{
		COMMONFLIGHTINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.commonFlightInfo</code> attribute. 
	 * @param value the commonFlightInfo
	 */
	public void setCommonFlightInfo(final CommonFlightInfo value)
	{
		setCommonFlightInfo( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMMONFLIGHTINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.departureTime</code> attribute.
	 * @return the departureTime
	 */
	public Date getDepartureTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DEPARTURETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.departureTime</code> attribute.
	 * @return the departureTime
	 */
	public Date getDepartureTime()
	{
		return getDepartureTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.departureTime</code> attribute. 
	 * @param value the departureTime
	 */
	public void setDepartureTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DEPARTURETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.departureTime</code> attribute. 
	 * @param value the departureTime
	 */
	public void setDepartureTime(final Date value)
	{
		setDepartureTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.duration</code> attribute.
	 * @return the duration
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.duration</code> attribute.
	 * @return the duration
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.flightNumber</code> attribute.
	 * @return the flightNumber
	 */
	public String getFlightNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLIGHTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.flightNumber</code> attribute.
	 * @return the flightNumber
	 */
	public String getFlightNumber()
	{
		return getFlightNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.flightNumber</code> attribute. 
	 * @param value the flightNumber
	 */
	public void setFlightNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLIGHTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.flightNumber</code> attribute. 
	 * @param value the flightNumber
	 */
	public void setFlightNumber(final String value)
	{
		setFlightNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.fromAirport</code> attribute.
	 * @return the fromAirport
	 */
	public String getFromAirport(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROMAIRPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.fromAirport</code> attribute.
	 * @return the fromAirport
	 */
	public String getFromAirport()
	{
		return getFromAirport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.fromAirport</code> attribute. 
	 * @param value the fromAirport
	 */
	public void setFromAirport(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROMAIRPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.fromAirport</code> attribute. 
	 * @param value the fromAirport
	 */
	public void setFromAirport(final String value)
	{
		setFromAirport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.fromCity</code> attribute.
	 * @return the fromCity
	 */
	public String getFromCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROMCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.fromCity</code> attribute.
	 * @return the fromCity
	 */
	public String getFromCity()
	{
		return getFromCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.fromCity</code> attribute. 
	 * @param value the fromCity
	 */
	public void setFromCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROMCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.fromCity</code> attribute. 
	 * @param value the fromCity
	 */
	public void setFromCity(final String value)
	{
		setFromCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.fromTerminal</code> attribute.
	 * @return the fromTerminal
	 */
	public String getFromTerminal(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROMTERMINAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.fromTerminal</code> attribute.
	 * @return the fromTerminal
	 */
	public String getFromTerminal()
	{
		return getFromTerminal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.fromTerminal</code> attribute. 
	 * @param value the fromTerminal
	 */
	public void setFromTerminal(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROMTERMINAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.fromTerminal</code> attribute. 
	 * @param value the fromTerminal
	 */
	public void setFromTerminal(final String value)
	{
		setFromTerminal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.toAirport</code> attribute.
	 * @return the toAirport
	 */
	public String getToAirport(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOAIRPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.toAirport</code> attribute.
	 * @return the toAirport
	 */
	public String getToAirport()
	{
		return getToAirport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.toAirport</code> attribute. 
	 * @param value the toAirport
	 */
	public void setToAirport(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOAIRPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.toAirport</code> attribute. 
	 * @param value the toAirport
	 */
	public void setToAirport(final String value)
	{
		setToAirport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.toCity</code> attribute.
	 * @return the toCity
	 */
	public String getToCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.toCity</code> attribute.
	 * @return the toCity
	 */
	public String getToCity()
	{
		return getToCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.toCity</code> attribute. 
	 * @param value the toCity
	 */
	public void setToCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.toCity</code> attribute. 
	 * @param value the toCity
	 */
	public void setToCity(final String value)
	{
		setToCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.toTerminal</code> attribute.
	 * @return the toTerminal
	 */
	public String getToTerminal(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOTERMINAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightDetailInfo.toTerminal</code> attribute.
	 * @return the toTerminal
	 */
	public String getToTerminal()
	{
		return getToTerminal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.toTerminal</code> attribute. 
	 * @param value the toTerminal
	 */
	public void setToTerminal(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOTERMINAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightDetailInfo.toTerminal</code> attribute. 
	 * @param value the toTerminal
	 */
	public void setToTerminal(final String value)
	{
		setToTerminal( getSession().getSessionContext(), value );
	}
	
}
