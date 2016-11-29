/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.AirlineIATA;
import com.cnk.travelogix.common.core.jalo.CommonFlightDetailInfo;
import com.cnk.travelogix.common.core.jalo.PriceInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.CommonFlightInfo CommonFlightInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommonFlightInfo extends GenericItem
{
	/** Qualifier of the <code>CommonFlightInfo.flightNumber</code> attribute **/
	public static final String FLIGHTNUMBER = "flightNumber";
	/** Qualifier of the <code>CommonFlightInfo.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>CommonFlightInfo.departureTime</code> attribute **/
	public static final String DEPARTURETIME = "departureTime";
	/** Qualifier of the <code>CommonFlightInfo.arrivalTime</code> attribute **/
	public static final String ARRIVALTIME = "arrivalTime";
	/** Qualifier of the <code>CommonFlightInfo.fromCity</code> attribute **/
	public static final String FROMCITY = "fromCity";
	/** Qualifier of the <code>CommonFlightInfo.fromAirport</code> attribute **/
	public static final String FROMAIRPORT = "fromAirport";
	/** Qualifier of the <code>CommonFlightInfo.fromTerminal</code> attribute **/
	public static final String FROMTERMINAL = "fromTerminal";
	/** Qualifier of the <code>CommonFlightInfo.toCity</code> attribute **/
	public static final String TOCITY = "toCity";
	/** Qualifier of the <code>CommonFlightInfo.toAirport</code> attribute **/
	public static final String TOAIRPORT = "toAirport";
	/** Qualifier of the <code>CommonFlightInfo.toTerminal</code> attribute **/
	public static final String TOTERMINAL = "toTerminal";
	/** Qualifier of the <code>CommonFlightInfo.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>CommonFlightInfo.airlineIATA</code> attribute **/
	public static final String AIRLINEIATA = "airlineIATA";
	/** Qualifier of the <code>CommonFlightInfo.priceInfo</code> attribute **/
	public static final String PRICEINFO = "priceInfo";
	/** Qualifier of the <code>CommonFlightInfo.numberOfStops</code> attribute **/
	public static final String NUMBEROFSTOPS = "numberOfStops";
	/** Qualifier of the <code>CommonFlightInfo.commonFlightDetailInfo</code> attribute **/
	public static final String COMMONFLIGHTDETAILINFO = "commonFlightDetailInfo";
	/**
	* {@link OneToManyHandler} for handling 1:n COMMONFLIGHTDETAILINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CommonFlightDetailInfo> COMMONFLIGHTDETAILINFOHANDLER = new OneToManyHandler<CommonFlightDetailInfo>(
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
		tmp.put(DEPARTURETIME, AttributeMode.INITIAL);
		tmp.put(ARRIVALTIME, AttributeMode.INITIAL);
		tmp.put(FROMCITY, AttributeMode.INITIAL);
		tmp.put(FROMAIRPORT, AttributeMode.INITIAL);
		tmp.put(FROMTERMINAL, AttributeMode.INITIAL);
		tmp.put(TOCITY, AttributeMode.INITIAL);
		tmp.put(TOAIRPORT, AttributeMode.INITIAL);
		tmp.put(TOTERMINAL, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(AIRLINEIATA, AttributeMode.INITIAL);
		tmp.put(PRICEINFO, AttributeMode.INITIAL);
		tmp.put(NUMBEROFSTOPS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.airlineIATA</code> attribute.
	 * @return the airlineIATA
	 */
	public AirlineIATA getAirlineIATA(final SessionContext ctx)
	{
		return (AirlineIATA)getProperty( ctx, AIRLINEIATA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.airlineIATA</code> attribute.
	 * @return the airlineIATA
	 */
	public AirlineIATA getAirlineIATA()
	{
		return getAirlineIATA( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.airlineIATA</code> attribute. 
	 * @param value the airlineIATA
	 */
	public void setAirlineIATA(final SessionContext ctx, final AirlineIATA value)
	{
		setProperty(ctx, AIRLINEIATA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.airlineIATA</code> attribute. 
	 * @param value the airlineIATA
	 */
	public void setAirlineIATA(final AirlineIATA value)
	{
		setAirlineIATA( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.arrivalTime</code> attribute.
	 * @return the arrivalTime
	 */
	public Date getArrivalTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ARRIVALTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.arrivalTime</code> attribute.
	 * @return the arrivalTime
	 */
	public Date getArrivalTime()
	{
		return getArrivalTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.arrivalTime</code> attribute. 
	 * @param value the arrivalTime
	 */
	public void setArrivalTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ARRIVALTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.arrivalTime</code> attribute. 
	 * @param value the arrivalTime
	 */
	public void setArrivalTime(final Date value)
	{
		setArrivalTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public String getCabinClass(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public String getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final String value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.commonFlightDetailInfo</code> attribute.
	 * @return the commonFlightDetailInfo
	 */
	public List<CommonFlightDetailInfo> getCommonFlightDetailInfo(final SessionContext ctx)
	{
		return (List<CommonFlightDetailInfo>)COMMONFLIGHTDETAILINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.commonFlightDetailInfo</code> attribute.
	 * @return the commonFlightDetailInfo
	 */
	public List<CommonFlightDetailInfo> getCommonFlightDetailInfo()
	{
		return getCommonFlightDetailInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.commonFlightDetailInfo</code> attribute. 
	 * @param value the commonFlightDetailInfo
	 */
	public void setCommonFlightDetailInfo(final SessionContext ctx, final List<CommonFlightDetailInfo> value)
	{
		COMMONFLIGHTDETAILINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.commonFlightDetailInfo</code> attribute. 
	 * @param value the commonFlightDetailInfo
	 */
	public void setCommonFlightDetailInfo(final List<CommonFlightDetailInfo> value)
	{
		setCommonFlightDetailInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commonFlightDetailInfo. 
	 * @param value the item to add to commonFlightDetailInfo
	 */
	public void addToCommonFlightDetailInfo(final SessionContext ctx, final CommonFlightDetailInfo value)
	{
		COMMONFLIGHTDETAILINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commonFlightDetailInfo. 
	 * @param value the item to add to commonFlightDetailInfo
	 */
	public void addToCommonFlightDetailInfo(final CommonFlightDetailInfo value)
	{
		addToCommonFlightDetailInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commonFlightDetailInfo. 
	 * @param value the item to remove from commonFlightDetailInfo
	 */
	public void removeFromCommonFlightDetailInfo(final SessionContext ctx, final CommonFlightDetailInfo value)
	{
		COMMONFLIGHTDETAILINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commonFlightDetailInfo. 
	 * @param value the item to remove from commonFlightDetailInfo
	 */
	public void removeFromCommonFlightDetailInfo(final CommonFlightDetailInfo value)
	{
		removeFromCommonFlightDetailInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.departureTime</code> attribute.
	 * @return the departureTime
	 */
	public Date getDepartureTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DEPARTURETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.departureTime</code> attribute.
	 * @return the departureTime
	 */
	public Date getDepartureTime()
	{
		return getDepartureTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.departureTime</code> attribute. 
	 * @param value the departureTime
	 */
	public void setDepartureTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DEPARTURETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.departureTime</code> attribute. 
	 * @param value the departureTime
	 */
	public void setDepartureTime(final Date value)
	{
		setDepartureTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.duration</code> attribute.
	 * @return the duration
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.duration</code> attribute.
	 * @return the duration
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.flightNumber</code> attribute.
	 * @return the flightNumber
	 */
	public String getFlightNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLIGHTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.flightNumber</code> attribute.
	 * @return the flightNumber
	 */
	public String getFlightNumber()
	{
		return getFlightNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.flightNumber</code> attribute. 
	 * @param value the flightNumber
	 */
	public void setFlightNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLIGHTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.flightNumber</code> attribute. 
	 * @param value the flightNumber
	 */
	public void setFlightNumber(final String value)
	{
		setFlightNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.fromAirport</code> attribute.
	 * @return the fromAirport
	 */
	public String getFromAirport(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROMAIRPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.fromAirport</code> attribute.
	 * @return the fromAirport
	 */
	public String getFromAirport()
	{
		return getFromAirport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.fromAirport</code> attribute. 
	 * @param value the fromAirport
	 */
	public void setFromAirport(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROMAIRPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.fromAirport</code> attribute. 
	 * @param value the fromAirport
	 */
	public void setFromAirport(final String value)
	{
		setFromAirport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.fromCity</code> attribute.
	 * @return the fromCity
	 */
	public String getFromCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROMCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.fromCity</code> attribute.
	 * @return the fromCity
	 */
	public String getFromCity()
	{
		return getFromCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.fromCity</code> attribute. 
	 * @param value the fromCity
	 */
	public void setFromCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROMCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.fromCity</code> attribute. 
	 * @param value the fromCity
	 */
	public void setFromCity(final String value)
	{
		setFromCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.fromTerminal</code> attribute.
	 * @return the fromTerminal
	 */
	public String getFromTerminal(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROMTERMINAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.fromTerminal</code> attribute.
	 * @return the fromTerminal
	 */
	public String getFromTerminal()
	{
		return getFromTerminal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.fromTerminal</code> attribute. 
	 * @param value the fromTerminal
	 */
	public void setFromTerminal(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROMTERMINAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.fromTerminal</code> attribute. 
	 * @param value the fromTerminal
	 */
	public void setFromTerminal(final String value)
	{
		setFromTerminal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.numberOfStops</code> attribute.
	 * @return the numberOfStops
	 */
	public String getNumberOfStops(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFSTOPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.numberOfStops</code> attribute.
	 * @return the numberOfStops
	 */
	public String getNumberOfStops()
	{
		return getNumberOfStops( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.numberOfStops</code> attribute. 
	 * @param value the numberOfStops
	 */
	public void setNumberOfStops(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFSTOPS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.numberOfStops</code> attribute. 
	 * @param value the numberOfStops
	 */
	public void setNumberOfStops(final String value)
	{
		setNumberOfStops( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.priceInfo</code> attribute.
	 * @return the priceInfo
	 */
	public PriceInfo getPriceInfo(final SessionContext ctx)
	{
		return (PriceInfo)getProperty( ctx, PRICEINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.priceInfo</code> attribute.
	 * @return the priceInfo
	 */
	public PriceInfo getPriceInfo()
	{
		return getPriceInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.priceInfo</code> attribute. 
	 * @param value the priceInfo
	 */
	public void setPriceInfo(final SessionContext ctx, final PriceInfo value)
	{
		setProperty(ctx, PRICEINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.priceInfo</code> attribute. 
	 * @param value the priceInfo
	 */
	public void setPriceInfo(final PriceInfo value)
	{
		setPriceInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.toAirport</code> attribute.
	 * @return the toAirport
	 */
	public String getToAirport(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOAIRPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.toAirport</code> attribute.
	 * @return the toAirport
	 */
	public String getToAirport()
	{
		return getToAirport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.toAirport</code> attribute. 
	 * @param value the toAirport
	 */
	public void setToAirport(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOAIRPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.toAirport</code> attribute. 
	 * @param value the toAirport
	 */
	public void setToAirport(final String value)
	{
		setToAirport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.toCity</code> attribute.
	 * @return the toCity
	 */
	public String getToCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.toCity</code> attribute.
	 * @return the toCity
	 */
	public String getToCity()
	{
		return getToCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.toCity</code> attribute. 
	 * @param value the toCity
	 */
	public void setToCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.toCity</code> attribute. 
	 * @param value the toCity
	 */
	public void setToCity(final String value)
	{
		setToCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.toTerminal</code> attribute.
	 * @return the toTerminal
	 */
	public String getToTerminal(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOTERMINAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonFlightInfo.toTerminal</code> attribute.
	 * @return the toTerminal
	 */
	public String getToTerminal()
	{
		return getToTerminal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.toTerminal</code> attribute. 
	 * @param value the toTerminal
	 */
	public void setToTerminal(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOTERMINAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonFlightInfo.toTerminal</code> attribute. 
	 * @param value the toTerminal
	 */
	public void setToTerminal(final String value)
	{
		setToTerminal( getSession().getSessionContext(), value );
	}
	
}
