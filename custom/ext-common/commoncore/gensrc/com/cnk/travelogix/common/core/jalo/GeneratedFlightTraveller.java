/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.OrderFlightDetailInfo;
import com.cnk.travelogix.common.core.jalo.Traveller;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem FlightTraveller}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightTraveller extends Traveller
{
	/** Qualifier of the <code>FlightTraveller.specialRequest</code> attribute **/
	public static final String SPECIALREQUEST = "specialRequest";
	/** Qualifier of the <code>FlightTraveller.freflyerSelAirline</code> attribute **/
	public static final String FREFLYERSELAIRLINE = "freflyerSelAirline";
	/** Qualifier of the <code>FlightTraveller.freflyernumber</code> attribute **/
	public static final String FREFLYERNUMBER = "freflyernumber";
	/** Qualifier of the <code>FlightTraveller.mealprefer</code> attribute **/
	public static final String MEALPREFER = "mealprefer";
	/** Qualifier of the <code>FlightTraveller.seatprefer</code> attribute **/
	public static final String SEATPREFER = "seatprefer";
	/** Qualifier of the <code>FlightTraveller.orderFlightDetailInfo</code> attribute **/
	public static final String ORDERFLIGHTDETAILINFO = "orderFlightDetailInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ORDERFLIGHTDETAILINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFlightTraveller> ORDERFLIGHTDETAILINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedFlightTraveller>(
	CommonCoreConstants.TC.FLIGHTTRAVELLER,
	false,
	"orderFlightDetailInfo",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Traveller.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SPECIALREQUEST, AttributeMode.INITIAL);
		tmp.put(FREFLYERSELAIRLINE, AttributeMode.INITIAL);
		tmp.put(FREFLYERNUMBER, AttributeMode.INITIAL);
		tmp.put(MEALPREFER, AttributeMode.INITIAL);
		tmp.put(SEATPREFER, AttributeMode.INITIAL);
		tmp.put(ORDERFLIGHTDETAILINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ORDERFLIGHTDETAILINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.freflyernumber</code> attribute.
	 * @return the freflyernumber
	 */
	public String getFreflyernumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FREFLYERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.freflyernumber</code> attribute.
	 * @return the freflyernumber
	 */
	public String getFreflyernumber()
	{
		return getFreflyernumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.freflyernumber</code> attribute. 
	 * @param value the freflyernumber
	 */
	public void setFreflyernumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FREFLYERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.freflyernumber</code> attribute. 
	 * @param value the freflyernumber
	 */
	public void setFreflyernumber(final String value)
	{
		setFreflyernumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.freflyerSelAirline</code> attribute.
	 * @return the freflyerSelAirline
	 */
	public String getFreflyerSelAirline(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FREFLYERSELAIRLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.freflyerSelAirline</code> attribute.
	 * @return the freflyerSelAirline
	 */
	public String getFreflyerSelAirline()
	{
		return getFreflyerSelAirline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.freflyerSelAirline</code> attribute. 
	 * @param value the freflyerSelAirline
	 */
	public void setFreflyerSelAirline(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FREFLYERSELAIRLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.freflyerSelAirline</code> attribute. 
	 * @param value the freflyerSelAirline
	 */
	public void setFreflyerSelAirline(final String value)
	{
		setFreflyerSelAirline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.mealprefer</code> attribute.
	 * @return the mealprefer
	 */
	public String getMealprefer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MEALPREFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.mealprefer</code> attribute.
	 * @return the mealprefer
	 */
	public String getMealprefer()
	{
		return getMealprefer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.mealprefer</code> attribute. 
	 * @param value the mealprefer
	 */
	public void setMealprefer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MEALPREFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.mealprefer</code> attribute. 
	 * @param value the mealprefer
	 */
	public void setMealprefer(final String value)
	{
		setMealprefer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.orderFlightDetailInfo</code> attribute.
	 * @return the orderFlightDetailInfo
	 */
	public OrderFlightDetailInfo getOrderFlightDetailInfo(final SessionContext ctx)
	{
		return (OrderFlightDetailInfo)getProperty( ctx, ORDERFLIGHTDETAILINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.orderFlightDetailInfo</code> attribute.
	 * @return the orderFlightDetailInfo
	 */
	public OrderFlightDetailInfo getOrderFlightDetailInfo()
	{
		return getOrderFlightDetailInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.orderFlightDetailInfo</code> attribute. 
	 * @param value the orderFlightDetailInfo
	 */
	public void setOrderFlightDetailInfo(final SessionContext ctx, final OrderFlightDetailInfo value)
	{
		ORDERFLIGHTDETAILINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.orderFlightDetailInfo</code> attribute. 
	 * @param value the orderFlightDetailInfo
	 */
	public void setOrderFlightDetailInfo(final OrderFlightDetailInfo value)
	{
		setOrderFlightDetailInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.seatprefer</code> attribute.
	 * @return the seatprefer
	 */
	public String getSeatprefer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEATPREFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.seatprefer</code> attribute.
	 * @return the seatprefer
	 */
	public String getSeatprefer()
	{
		return getSeatprefer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.seatprefer</code> attribute. 
	 * @param value the seatprefer
	 */
	public void setSeatprefer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEATPREFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.seatprefer</code> attribute. 
	 * @param value the seatprefer
	 */
	public void setSeatprefer(final String value)
	{
		setSeatprefer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.specialRequest</code> attribute.
	 * @return the specialRequest
	 */
	public String getSpecialRequest(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SPECIALREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTraveller.specialRequest</code> attribute.
	 * @return the specialRequest
	 */
	public String getSpecialRequest()
	{
		return getSpecialRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.specialRequest</code> attribute. 
	 * @param value the specialRequest
	 */
	public void setSpecialRequest(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SPECIALREQUEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTraveller.specialRequest</code> attribute. 
	 * @param value the specialRequest
	 */
	public void setSpecialRequest(final String value)
	{
		setSpecialRequest( getSession().getSessionContext(), value );
	}
	
}
