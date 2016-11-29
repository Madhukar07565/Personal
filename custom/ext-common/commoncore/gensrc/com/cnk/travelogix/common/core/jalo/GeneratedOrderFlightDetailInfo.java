/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitMasterConfig;
import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.BookingResponseAttribute;
import com.cnk.travelogix.common.core.jalo.CommonFlightInfo;
import com.cnk.travelogix.common.core.jalo.FlightTraveller;
import com.cnk.travelogix.common.core.jalo.OrderTicketInfo;
import com.cnk.travelogix.common.core.jalo.PaymentPlan;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem OrderFlightDetailInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrderFlightDetailInfo extends GenericItem
{
	/** Qualifier of the <code>OrderFlightDetailInfo.commonFlightInfo</code> attribute **/
	public static final String COMMONFLIGHTINFO = "commonFlightInfo";
	/** Qualifier of the <code>OrderFlightDetailInfo.sequence</code> attribute **/
	public static final String SEQUENCE = "sequence";
	/** Qualifier of the <code>OrderFlightDetailInfo.groupId</code> attribute **/
	public static final String GROUPID = "groupId";
	/** Qualifier of the <code>OrderFlightDetailInfo.orderStatus</code> attribute **/
	public static final String ORDERSTATUS = "orderStatus";
	/** Qualifier of the <code>OrderFlightDetailInfo.timeLimitExpDate</code> attribute **/
	public static final String TIMELIMITEXPDATE = "timeLimitExpDate";
	/** Qualifier of the <code>OrderFlightDetailInfo.timeLimit</code> attribute **/
	public static final String TIMELIMIT = "timeLimit";
	/** Qualifier of the <code>OrderFlightDetailInfo.timeLimitMasterConfig</code> attribute **/
	public static final String TIMELIMITMASTERCONFIG = "timeLimitMasterConfig";
	/** Qualifier of the <code>OrderFlightDetailInfo.paymentPlan</code> attribute **/
	public static final String PAYMENTPLAN = "paymentPlan";
	/** Qualifier of the <code>OrderFlightDetailInfo.refundable</code> attribute **/
	public static final String REFUNDABLE = "refundable";
	/** Qualifier of the <code>OrderFlightDetailInfo.journeyType</code> attribute **/
	public static final String JOURNEYTYPE = "journeyType";
	/** Qualifier of the <code>OrderFlightDetailInfo.bookingResponseAttributes</code> attribute **/
	public static final String BOOKINGRESPONSEATTRIBUTES = "bookingResponseAttributes";
	/** Qualifier of the <code>OrderFlightDetailInfo.flightTraveller</code> attribute **/
	public static final String FLIGHTTRAVELLER = "flightTraveller";
	/** Qualifier of the <code>OrderFlightDetailInfo.orderTicketInfo</code> attribute **/
	public static final String ORDERTICKETINFO = "orderTicketInfo";
	/**
	* {@link OneToManyHandler} for handling 1:n FLIGHTTRAVELLER's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FlightTraveller> FLIGHTTRAVELLERHANDLER = new OneToManyHandler<FlightTraveller>(
	CommonCoreConstants.TC.FLIGHTTRAVELLER,
	false,
	"orderFlightDetailInfo",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ORDERTICKETINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OrderTicketInfo> ORDERTICKETINFOHANDLER = new OneToManyHandler<OrderTicketInfo>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMMONFLIGHTINFO, AttributeMode.INITIAL);
		tmp.put(SEQUENCE, AttributeMode.INITIAL);
		tmp.put(GROUPID, AttributeMode.INITIAL);
		tmp.put(ORDERSTATUS, AttributeMode.INITIAL);
		tmp.put(TIMELIMITEXPDATE, AttributeMode.INITIAL);
		tmp.put(TIMELIMIT, AttributeMode.INITIAL);
		tmp.put(TIMELIMITMASTERCONFIG, AttributeMode.INITIAL);
		tmp.put(PAYMENTPLAN, AttributeMode.INITIAL);
		tmp.put(REFUNDABLE, AttributeMode.INITIAL);
		tmp.put(JOURNEYTYPE, AttributeMode.INITIAL);
		tmp.put(BOOKINGRESPONSEATTRIBUTES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.bookingResponseAttributes</code> attribute.
	 * @return the bookingResponseAttributes
	 */
	public List<BookingResponseAttribute> getBookingResponseAttributes(final SessionContext ctx)
	{
		List<BookingResponseAttribute> coll = (List<BookingResponseAttribute>)getProperty( ctx, BOOKINGRESPONSEATTRIBUTES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.bookingResponseAttributes</code> attribute.
	 * @return the bookingResponseAttributes
	 */
	public List<BookingResponseAttribute> getBookingResponseAttributes()
	{
		return getBookingResponseAttributes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.bookingResponseAttributes</code> attribute. 
	 * @param value the bookingResponseAttributes
	 */
	public void setBookingResponseAttributes(final SessionContext ctx, final List<BookingResponseAttribute> value)
	{
		setProperty(ctx, BOOKINGRESPONSEATTRIBUTES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.bookingResponseAttributes</code> attribute. 
	 * @param value the bookingResponseAttributes
	 */
	public void setBookingResponseAttributes(final List<BookingResponseAttribute> value)
	{
		setBookingResponseAttributes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.commonFlightInfo</code> attribute.
	 * @return the commonFlightInfo
	 */
	public CommonFlightInfo getCommonFlightInfo(final SessionContext ctx)
	{
		return (CommonFlightInfo)getProperty( ctx, COMMONFLIGHTINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.commonFlightInfo</code> attribute.
	 * @return the commonFlightInfo
	 */
	public CommonFlightInfo getCommonFlightInfo()
	{
		return getCommonFlightInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.commonFlightInfo</code> attribute. 
	 * @param value the commonFlightInfo
	 */
	public void setCommonFlightInfo(final SessionContext ctx, final CommonFlightInfo value)
	{
		setProperty(ctx, COMMONFLIGHTINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.commonFlightInfo</code> attribute. 
	 * @param value the commonFlightInfo
	 */
	public void setCommonFlightInfo(final CommonFlightInfo value)
	{
		setCommonFlightInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.flightTraveller</code> attribute.
	 * @return the flightTraveller
	 */
	public List<FlightTraveller> getFlightTraveller(final SessionContext ctx)
	{
		return (List<FlightTraveller>)FLIGHTTRAVELLERHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.flightTraveller</code> attribute.
	 * @return the flightTraveller
	 */
	public List<FlightTraveller> getFlightTraveller()
	{
		return getFlightTraveller( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.flightTraveller</code> attribute. 
	 * @param value the flightTraveller
	 */
	public void setFlightTraveller(final SessionContext ctx, final List<FlightTraveller> value)
	{
		FLIGHTTRAVELLERHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.flightTraveller</code> attribute. 
	 * @param value the flightTraveller
	 */
	public void setFlightTraveller(final List<FlightTraveller> value)
	{
		setFlightTraveller( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightTraveller. 
	 * @param value the item to add to flightTraveller
	 */
	public void addToFlightTraveller(final SessionContext ctx, final FlightTraveller value)
	{
		FLIGHTTRAVELLERHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightTraveller. 
	 * @param value the item to add to flightTraveller
	 */
	public void addToFlightTraveller(final FlightTraveller value)
	{
		addToFlightTraveller( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightTraveller. 
	 * @param value the item to remove from flightTraveller
	 */
	public void removeFromFlightTraveller(final SessionContext ctx, final FlightTraveller value)
	{
		FLIGHTTRAVELLERHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightTraveller. 
	 * @param value the item to remove from flightTraveller
	 */
	public void removeFromFlightTraveller(final FlightTraveller value)
	{
		removeFromFlightTraveller( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.groupId</code> attribute.
	 * @return the groupId
	 */
	public String getGroupId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GROUPID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.groupId</code> attribute.
	 * @return the groupId
	 */
	public String getGroupId()
	{
		return getGroupId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.groupId</code> attribute. 
	 * @param value the groupId
	 */
	public void setGroupId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GROUPID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.groupId</code> attribute. 
	 * @param value the groupId
	 */
	public void setGroupId(final String value)
	{
		setGroupId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.journeyType</code> attribute.
	 * @return the journeyType
	 */
	public EnumerationValue getJourneyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, JOURNEYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.journeyType</code> attribute.
	 * @return the journeyType
	 */
	public EnumerationValue getJourneyType()
	{
		return getJourneyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.journeyType</code> attribute. 
	 * @param value the journeyType
	 */
	public void setJourneyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, JOURNEYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.journeyType</code> attribute. 
	 * @param value the journeyType
	 */
	public void setJourneyType(final EnumerationValue value)
	{
		setJourneyType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.orderStatus</code> attribute.
	 * @return the orderStatus
	 */
	public EnumerationValue getOrderStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ORDERSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.orderStatus</code> attribute.
	 * @return the orderStatus
	 */
	public EnumerationValue getOrderStatus()
	{
		return getOrderStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.orderStatus</code> attribute. 
	 * @param value the orderStatus
	 */
	public void setOrderStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ORDERSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.orderStatus</code> attribute. 
	 * @param value the orderStatus
	 */
	public void setOrderStatus(final EnumerationValue value)
	{
		setOrderStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.orderTicketInfo</code> attribute.
	 * @return the orderTicketInfo
	 */
	public List<OrderTicketInfo> getOrderTicketInfo(final SessionContext ctx)
	{
		return (List<OrderTicketInfo>)ORDERTICKETINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.orderTicketInfo</code> attribute.
	 * @return the orderTicketInfo
	 */
	public List<OrderTicketInfo> getOrderTicketInfo()
	{
		return getOrderTicketInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.orderTicketInfo</code> attribute. 
	 * @param value the orderTicketInfo
	 */
	public void setOrderTicketInfo(final SessionContext ctx, final List<OrderTicketInfo> value)
	{
		ORDERTICKETINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.orderTicketInfo</code> attribute. 
	 * @param value the orderTicketInfo
	 */
	public void setOrderTicketInfo(final List<OrderTicketInfo> value)
	{
		setOrderTicketInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orderTicketInfo. 
	 * @param value the item to add to orderTicketInfo
	 */
	public void addToOrderTicketInfo(final SessionContext ctx, final OrderTicketInfo value)
	{
		ORDERTICKETINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orderTicketInfo. 
	 * @param value the item to add to orderTicketInfo
	 */
	public void addToOrderTicketInfo(final OrderTicketInfo value)
	{
		addToOrderTicketInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orderTicketInfo. 
	 * @param value the item to remove from orderTicketInfo
	 */
	public void removeFromOrderTicketInfo(final SessionContext ctx, final OrderTicketInfo value)
	{
		ORDERTICKETINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orderTicketInfo. 
	 * @param value the item to remove from orderTicketInfo
	 */
	public void removeFromOrderTicketInfo(final OrderTicketInfo value)
	{
		removeFromOrderTicketInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.paymentPlan</code> attribute.
	 * @return the paymentPlan
	 */
	public PaymentPlan getPaymentPlan(final SessionContext ctx)
	{
		return (PaymentPlan)getProperty( ctx, PAYMENTPLAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.paymentPlan</code> attribute.
	 * @return the paymentPlan
	 */
	public PaymentPlan getPaymentPlan()
	{
		return getPaymentPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.paymentPlan</code> attribute. 
	 * @param value the paymentPlan
	 */
	public void setPaymentPlan(final SessionContext ctx, final PaymentPlan value)
	{
		setProperty(ctx, PAYMENTPLAN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.paymentPlan</code> attribute. 
	 * @param value the paymentPlan
	 */
	public void setPaymentPlan(final PaymentPlan value)
	{
		setPaymentPlan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REFUNDABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable()
	{
		return isRefundable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRefundable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive()
	{
		return isRefundableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REFUNDABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final Boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final boolean value)
	{
		setRefundable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.sequence</code> attribute.
	 * @return the sequence - to record the sequence of the flight
	 */
	public String getSequence(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEQUENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.sequence</code> attribute.
	 * @return the sequence - to record the sequence of the flight
	 */
	public String getSequence()
	{
		return getSequence( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.sequence</code> attribute. 
	 * @param value the sequence - to record the sequence of the flight
	 */
	public void setSequence(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEQUENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.sequence</code> attribute. 
	 * @param value the sequence - to record the sequence of the flight
	 */
	public void setSequence(final String value)
	{
		setSequence( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.timeLimit</code> attribute.
	 * @return the timeLimit - If user checked timelimit checkbox.
	 */
	public Boolean isTimeLimit(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TIMELIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.timeLimit</code> attribute.
	 * @return the timeLimit - If user checked timelimit checkbox.
	 */
	public Boolean isTimeLimit()
	{
		return isTimeLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.timeLimit</code> attribute. 
	 * @return the timeLimit - If user checked timelimit checkbox.
	 */
	public boolean isTimeLimitAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTimeLimit( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.timeLimit</code> attribute. 
	 * @return the timeLimit - If user checked timelimit checkbox.
	 */
	public boolean isTimeLimitAsPrimitive()
	{
		return isTimeLimitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.timeLimit</code> attribute. 
	 * @param value the timeLimit - If user checked timelimit checkbox.
	 */
	public void setTimeLimit(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TIMELIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.timeLimit</code> attribute. 
	 * @param value the timeLimit - If user checked timelimit checkbox.
	 */
	public void setTimeLimit(final Boolean value)
	{
		setTimeLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.timeLimit</code> attribute. 
	 * @param value the timeLimit - If user checked timelimit checkbox.
	 */
	public void setTimeLimit(final SessionContext ctx, final boolean value)
	{
		setTimeLimit( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.timeLimit</code> attribute. 
	 * @param value the timeLimit - If user checked timelimit checkbox.
	 */
	public void setTimeLimit(final boolean value)
	{
		setTimeLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.timeLimitExpDate</code> attribute.
	 * @return the timeLimitExpDate - time limit to expiry date
	 */
	public Date getTimeLimitExpDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TIMELIMITEXPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.timeLimitExpDate</code> attribute.
	 * @return the timeLimitExpDate - time limit to expiry date
	 */
	public Date getTimeLimitExpDate()
	{
		return getTimeLimitExpDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.timeLimitExpDate</code> attribute. 
	 * @param value the timeLimitExpDate - time limit to expiry date
	 */
	public void setTimeLimitExpDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TIMELIMITEXPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.timeLimitExpDate</code> attribute. 
	 * @param value the timeLimitExpDate - time limit to expiry date
	 */
	public void setTimeLimitExpDate(final Date value)
	{
		setTimeLimitExpDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig - Time Limit Master Config
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final SessionContext ctx)
	{
		return (TimeLimitMasterConfig)getProperty( ctx, TIMELIMITMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderFlightDetailInfo.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig - Time Limit Master Config
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig()
	{
		return getTimeLimitMasterConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig - Time Limit Master Config
	 */
	public void setTimeLimitMasterConfig(final SessionContext ctx, final TimeLimitMasterConfig value)
	{
		setProperty(ctx, TIMELIMITMASTERCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderFlightDetailInfo.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig - Time Limit Master Config
	 */
	public void setTimeLimitMasterConfig(final TimeLimitMasterConfig value)
	{
		setTimeLimitMasterConfig( getSession().getSessionContext(), value );
	}
	
}
