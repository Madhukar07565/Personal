/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.CommonFlightInfo;
import com.cnk.travelogix.common.core.jalo.OrderFlightDetailInfo;
import com.cnk.travelogix.common.core.jalo.OrderProductInfo;
import com.cnk.travelogix.masterdata.core.fare.jalo.FareBasis;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem OrderTicketInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrderTicketInfo extends OrderProductInfo
{
	/** Qualifier of the <code>OrderTicketInfo.commonFlightInfo</code> attribute **/
	public static final String COMMONFLIGHTINFO = "commonFlightInfo";
	/** Qualifier of the <code>OrderTicketInfo.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>OrderTicketInfo.ticketIndex</code> attribute **/
	public static final String TICKETINDEX = "ticketIndex";
	/** Qualifier of the <code>OrderTicketInfo.RBD</code> attribute **/
	public static final String RBD = "RBD";
	/** Qualifier of the <code>OrderTicketInfo.fareBasis</code> attribute **/
	public static final String FAREBASIS = "fareBasis";
	/** Qualifier of the <code>OrderTicketInfo.ticketNo</code> attribute **/
	public static final String TICKETNO = "ticketNo";
	/** Qualifier of the <code>OrderTicketInfo.PNR</code> attribute **/
	public static final String PNR = "PNR";
	/** Qualifier of the <code>OrderTicketInfo.airlinePNR</code> attribute **/
	public static final String AIRLINEPNR = "airlinePNR";
	/** Qualifier of the <code>OrderTicketInfo.refundable</code> attribute **/
	public static final String REFUNDABLE = "refundable";
	/** Qualifier of the <code>OrderTicketInfo.orderFlightDetailInfo</code> attribute **/
	public static final String ORDERFLIGHTDETAILINFO = "orderFlightDetailInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ORDERFLIGHTDETAILINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedOrderTicketInfo> ORDERFLIGHTDETAILINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedOrderTicketInfo>(
	CommonCoreConstants.TC.ORDERTICKETINFO,
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(OrderProductInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMMONFLIGHTINFO, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(TICKETINDEX, AttributeMode.INITIAL);
		tmp.put(RBD, AttributeMode.INITIAL);
		tmp.put(FAREBASIS, AttributeMode.INITIAL);
		tmp.put(TICKETNO, AttributeMode.INITIAL);
		tmp.put(PNR, AttributeMode.INITIAL);
		tmp.put(AIRLINEPNR, AttributeMode.INITIAL);
		tmp.put(REFUNDABLE, AttributeMode.INITIAL);
		tmp.put(ORDERFLIGHTDETAILINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.airlinePNR</code> attribute.
	 * @return the airlinePNR
	 */
	public String getAirlinePNR(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AIRLINEPNR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.airlinePNR</code> attribute.
	 * @return the airlinePNR
	 */
	public String getAirlinePNR()
	{
		return getAirlinePNR( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.airlinePNR</code> attribute. 
	 * @param value the airlinePNR
	 */
	public void setAirlinePNR(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AIRLINEPNR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.airlinePNR</code> attribute. 
	 * @param value the airlinePNR
	 */
	public void setAirlinePNR(final String value)
	{
		setAirlinePNR( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.commonFlightInfo</code> attribute.
	 * @return the commonFlightInfo
	 */
	public CommonFlightInfo getCommonFlightInfo(final SessionContext ctx)
	{
		return (CommonFlightInfo)getProperty( ctx, COMMONFLIGHTINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.commonFlightInfo</code> attribute.
	 * @return the commonFlightInfo
	 */
	public CommonFlightInfo getCommonFlightInfo()
	{
		return getCommonFlightInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.commonFlightInfo</code> attribute. 
	 * @param value the commonFlightInfo
	 */
	public void setCommonFlightInfo(final SessionContext ctx, final CommonFlightInfo value)
	{
		setProperty(ctx, COMMONFLIGHTINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.commonFlightInfo</code> attribute. 
	 * @param value the commonFlightInfo
	 */
	public void setCommonFlightInfo(final CommonFlightInfo value)
	{
		setCommonFlightInfo( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ORDERFLIGHTDETAILINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.fareBasis</code> attribute.
	 * @return the fareBasis - Fare Basis
	 */
	public FareBasis getFareBasis(final SessionContext ctx)
	{
		return (FareBasis)getProperty( ctx, FAREBASIS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.fareBasis</code> attribute.
	 * @return the fareBasis - Fare Basis
	 */
	public FareBasis getFareBasis()
	{
		return getFareBasis( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.fareBasis</code> attribute. 
	 * @param value the fareBasis - Fare Basis
	 */
	public void setFareBasis(final SessionContext ctx, final FareBasis value)
	{
		setProperty(ctx, FAREBASIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.fareBasis</code> attribute. 
	 * @param value the fareBasis - Fare Basis
	 */
	public void setFareBasis(final FareBasis value)
	{
		setFareBasis( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.orderFlightDetailInfo</code> attribute.
	 * @return the orderFlightDetailInfo
	 */
	public OrderFlightDetailInfo getOrderFlightDetailInfo(final SessionContext ctx)
	{
		return (OrderFlightDetailInfo)getProperty( ctx, ORDERFLIGHTDETAILINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.orderFlightDetailInfo</code> attribute.
	 * @return the orderFlightDetailInfo
	 */
	public OrderFlightDetailInfo getOrderFlightDetailInfo()
	{
		return getOrderFlightDetailInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.orderFlightDetailInfo</code> attribute. 
	 * @param value the orderFlightDetailInfo
	 */
	public void setOrderFlightDetailInfo(final SessionContext ctx, final OrderFlightDetailInfo value)
	{
		ORDERFLIGHTDETAILINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.orderFlightDetailInfo</code> attribute. 
	 * @param value the orderFlightDetailInfo
	 */
	public void setOrderFlightDetailInfo(final OrderFlightDetailInfo value)
	{
		setOrderFlightDetailInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.passengerType</code> attribute.
	 * @return the passengerType - Passenger Type
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.passengerType</code> attribute.
	 * @return the passengerType - Passenger Type
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.passengerType</code> attribute. 
	 * @param value the passengerType - Passenger Type
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.passengerType</code> attribute. 
	 * @param value the passengerType - Passenger Type
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.PNR</code> attribute.
	 * @return the PNR
	 */
	public String getPNR(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PNR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.PNR</code> attribute.
	 * @return the PNR
	 */
	public String getPNR()
	{
		return getPNR( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.PNR</code> attribute. 
	 * @param value the PNR
	 */
	public void setPNR(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PNR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.PNR</code> attribute. 
	 * @param value the PNR
	 */
	public void setPNR(final String value)
	{
		setPNR( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.RBD</code> attribute.
	 * @return the RBD - RBD
	 */
	public String getRBD(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RBD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.RBD</code> attribute.
	 * @return the RBD - RBD
	 */
	public String getRBD()
	{
		return getRBD( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.RBD</code> attribute. 
	 * @param value the RBD - RBD
	 */
	public void setRBD(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RBD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.RBD</code> attribute. 
	 * @param value the RBD - RBD
	 */
	public void setRBD(final String value)
	{
		setRBD( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REFUNDABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable()
	{
		return isRefundable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRefundable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive()
	{
		return isRefundableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REFUNDABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final Boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final boolean value)
	{
		setRefundable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.ticketIndex</code> attribute.
	 * @return the ticketIndex - index of ticket
	 */
	public Integer getTicketIndex(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TICKETINDEX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.ticketIndex</code> attribute.
	 * @return the ticketIndex - index of ticket
	 */
	public Integer getTicketIndex()
	{
		return getTicketIndex( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.ticketIndex</code> attribute. 
	 * @return the ticketIndex - index of ticket
	 */
	public int getTicketIndexAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTicketIndex( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.ticketIndex</code> attribute. 
	 * @return the ticketIndex - index of ticket
	 */
	public int getTicketIndexAsPrimitive()
	{
		return getTicketIndexAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.ticketIndex</code> attribute. 
	 * @param value the ticketIndex - index of ticket
	 */
	public void setTicketIndex(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TICKETINDEX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.ticketIndex</code> attribute. 
	 * @param value the ticketIndex - index of ticket
	 */
	public void setTicketIndex(final Integer value)
	{
		setTicketIndex( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.ticketIndex</code> attribute. 
	 * @param value the ticketIndex - index of ticket
	 */
	public void setTicketIndex(final SessionContext ctx, final int value)
	{
		setTicketIndex( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.ticketIndex</code> attribute. 
	 * @param value the ticketIndex - index of ticket
	 */
	public void setTicketIndex(final int value)
	{
		setTicketIndex( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.ticketNo</code> attribute.
	 * @return the ticketNo - Ticket No
	 */
	public String getTicketNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TICKETNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTicketInfo.ticketNo</code> attribute.
	 * @return the ticketNo - Ticket No
	 */
	public String getTicketNo()
	{
		return getTicketNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.ticketNo</code> attribute. 
	 * @param value the ticketNo - Ticket No
	 */
	public void setTicketNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TICKETNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTicketInfo.ticketNo</code> attribute. 
	 * @param value the ticketNo - Ticket No
	 */
	public void setTicketNo(final String value)
	{
		setTicketNo( getSession().getSessionContext(), value );
	}
	
}
