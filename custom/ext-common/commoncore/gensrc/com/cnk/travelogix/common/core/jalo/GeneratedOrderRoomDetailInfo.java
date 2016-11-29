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
import com.cnk.travelogix.common.core.jalo.OrderHotelDetailInfo;
import com.cnk.travelogix.common.core.jalo.OrderProductInfo;
import com.cnk.travelogix.common.core.jalo.PaymentPlan;
import com.cnk.travelogix.common.core.jalo.RoomAncillary;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem OrderRoomDetailInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrderRoomDetailInfo extends OrderProductInfo
{
	/** Qualifier of the <code>OrderRoomDetailInfo.hotelId</code> attribute **/
	public static final String HOTELID = "hotelId";
	/** Qualifier of the <code>OrderRoomDetailInfo.roomId</code> attribute **/
	public static final String ROOMID = "roomId";
	/** Qualifier of the <code>OrderRoomDetailInfo.roomAncillaryList</code> attribute **/
	public static final String ROOMANCILLARYLIST = "roomAncillaryList";
	/** Qualifier of the <code>OrderRoomDetailInfo.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>OrderRoomDetailInfo.roomName</code> attribute **/
	public static final String ROOMNAME = "roomName";
	/** Qualifier of the <code>OrderRoomDetailInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>OrderRoomDetailInfo.numberOfAdult</code> attribute **/
	public static final String NUMBEROFADULT = "numberOfAdult";
	/** Qualifier of the <code>OrderRoomDetailInfo.numberOfChild</code> attribute **/
	public static final String NUMBEROFCHILD = "numberOfChild";
	/** Qualifier of the <code>OrderRoomDetailInfo.numberOfNight</code> attribute **/
	public static final String NUMBEROFNIGHT = "numberOfNight";
	/** Qualifier of the <code>OrderRoomDetailInfo.roomIndex</code> attribute **/
	public static final String ROOMINDEX = "roomIndex";
	/** Qualifier of the <code>OrderRoomDetailInfo.roomCheckinDate</code> attribute **/
	public static final String ROOMCHECKINDATE = "roomCheckinDate";
	/** Qualifier of the <code>OrderRoomDetailInfo.roomCheckoutDate</code> attribute **/
	public static final String ROOMCHECKOUTDATE = "roomCheckoutDate";
	/** Qualifier of the <code>OrderRoomDetailInfo.freeCancelation</code> attribute **/
	public static final String FREECANCELATION = "freeCancelation";
	/** Qualifier of the <code>OrderRoomDetailInfo.payAtHotel</code> attribute **/
	public static final String PAYATHOTEL = "payAtHotel";
	/** Qualifier of the <code>OrderRoomDetailInfo.refundable</code> attribute **/
	public static final String REFUNDABLE = "refundable";
	/** Qualifier of the <code>OrderRoomDetailInfo.paymentPlan</code> attribute **/
	public static final String PAYMENTPLAN = "paymentPlan";
	/** Qualifier of the <code>OrderRoomDetailInfo.timeLimitExpDate</code> attribute **/
	public static final String TIMELIMITEXPDATE = "timeLimitExpDate";
	/** Qualifier of the <code>OrderRoomDetailInfo.timeLimit</code> attribute **/
	public static final String TIMELIMIT = "timeLimit";
	/** Qualifier of the <code>OrderRoomDetailInfo.timeLimitMasterConfig</code> attribute **/
	public static final String TIMELIMITMASTERCONFIG = "timeLimitMasterConfig";
	/** Qualifier of the <code>OrderRoomDetailInfo.bookingResponseAttributes</code> attribute **/
	public static final String BOOKINGRESPONSEATTRIBUTES = "bookingResponseAttributes";
	/** Qualifier of the <code>OrderRoomDetailInfo.orderHotelDetailInfo</code> attribute **/
	public static final String ORDERHOTELDETAILINFO = "orderHotelDetailInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ORDERHOTELDETAILINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedOrderRoomDetailInfo> ORDERHOTELDETAILINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedOrderRoomDetailInfo>(
	CommonCoreConstants.TC.ORDERROOMDETAILINFO,
	false,
	"orderHotelDetailInfo",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(OrderProductInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(HOTELID, AttributeMode.INITIAL);
		tmp.put(ROOMID, AttributeMode.INITIAL);
		tmp.put(ROOMANCILLARYLIST, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(ROOMNAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(NUMBEROFADULT, AttributeMode.INITIAL);
		tmp.put(NUMBEROFCHILD, AttributeMode.INITIAL);
		tmp.put(NUMBEROFNIGHT, AttributeMode.INITIAL);
		tmp.put(ROOMINDEX, AttributeMode.INITIAL);
		tmp.put(ROOMCHECKINDATE, AttributeMode.INITIAL);
		tmp.put(ROOMCHECKOUTDATE, AttributeMode.INITIAL);
		tmp.put(FREECANCELATION, AttributeMode.INITIAL);
		tmp.put(PAYATHOTEL, AttributeMode.INITIAL);
		tmp.put(REFUNDABLE, AttributeMode.INITIAL);
		tmp.put(PAYMENTPLAN, AttributeMode.INITIAL);
		tmp.put(TIMELIMITEXPDATE, AttributeMode.INITIAL);
		tmp.put(TIMELIMIT, AttributeMode.INITIAL);
		tmp.put(TIMELIMITMASTERCONFIG, AttributeMode.INITIAL);
		tmp.put(BOOKINGRESPONSEATTRIBUTES, AttributeMode.INITIAL);
		tmp.put(ORDERHOTELDETAILINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.bookingResponseAttributes</code> attribute.
	 * @return the bookingResponseAttributes
	 */
	public List<BookingResponseAttribute> getBookingResponseAttributes(final SessionContext ctx)
	{
		List<BookingResponseAttribute> coll = (List<BookingResponseAttribute>)getProperty( ctx, BOOKINGRESPONSEATTRIBUTES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.bookingResponseAttributes</code> attribute.
	 * @return the bookingResponseAttributes
	 */
	public List<BookingResponseAttribute> getBookingResponseAttributes()
	{
		return getBookingResponseAttributes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.bookingResponseAttributes</code> attribute. 
	 * @param value the bookingResponseAttributes
	 */
	public void setBookingResponseAttributes(final SessionContext ctx, final List<BookingResponseAttribute> value)
	{
		setProperty(ctx, BOOKINGRESPONSEATTRIBUTES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.bookingResponseAttributes</code> attribute. 
	 * @param value the bookingResponseAttributes
	 */
	public void setBookingResponseAttributes(final List<BookingResponseAttribute> value)
	{
		setBookingResponseAttributes( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ORDERHOTELDETAILINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.freeCancelation</code> attribute.
	 * @return the freeCancelation - If this product is free cancellation.
	 */
	public Boolean isFreeCancelation(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FREECANCELATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.freeCancelation</code> attribute.
	 * @return the freeCancelation - If this product is free cancellation.
	 */
	public Boolean isFreeCancelation()
	{
		return isFreeCancelation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.freeCancelation</code> attribute. 
	 * @return the freeCancelation - If this product is free cancellation.
	 */
	public boolean isFreeCancelationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFreeCancelation( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.freeCancelation</code> attribute. 
	 * @return the freeCancelation - If this product is free cancellation.
	 */
	public boolean isFreeCancelationAsPrimitive()
	{
		return isFreeCancelationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.freeCancelation</code> attribute. 
	 * @param value the freeCancelation - If this product is free cancellation.
	 */
	public void setFreeCancelation(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FREECANCELATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.freeCancelation</code> attribute. 
	 * @param value the freeCancelation - If this product is free cancellation.
	 */
	public void setFreeCancelation(final Boolean value)
	{
		setFreeCancelation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.freeCancelation</code> attribute. 
	 * @param value the freeCancelation - If this product is free cancellation.
	 */
	public void setFreeCancelation(final SessionContext ctx, final boolean value)
	{
		setFreeCancelation( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.freeCancelation</code> attribute. 
	 * @param value the freeCancelation - If this product is free cancellation.
	 */
	public void setFreeCancelation(final boolean value)
	{
		setFreeCancelation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.hotelId</code> attribute.
	 * @return the hotelId
	 */
	public String getHotelId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOTELID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.hotelId</code> attribute.
	 * @return the hotelId
	 */
	public String getHotelId()
	{
		return getHotelId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.hotelId</code> attribute. 
	 * @param value the hotelId
	 */
	public void setHotelId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOTELID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.hotelId</code> attribute. 
	 * @param value the hotelId
	 */
	public void setHotelId(final String value)
	{
		setHotelId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.numberOfAdult</code> attribute.
	 * @return the numberOfAdult - No. of adult
	 */
	public String getNumberOfAdult(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.numberOfAdult</code> attribute.
	 * @return the numberOfAdult - No. of adult
	 */
	public String getNumberOfAdult()
	{
		return getNumberOfAdult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.numberOfAdult</code> attribute. 
	 * @param value the numberOfAdult - No. of adult
	 */
	public void setNumberOfAdult(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.numberOfAdult</code> attribute. 
	 * @param value the numberOfAdult - No. of adult
	 */
	public void setNumberOfAdult(final String value)
	{
		setNumberOfAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.numberOfChild</code> attribute.
	 * @return the numberOfChild - No. of child
	 */
	public String getNumberOfChild(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.numberOfChild</code> attribute.
	 * @return the numberOfChild - No. of child
	 */
	public String getNumberOfChild()
	{
		return getNumberOfChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.numberOfChild</code> attribute. 
	 * @param value the numberOfChild - No. of child
	 */
	public void setNumberOfChild(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.numberOfChild</code> attribute. 
	 * @param value the numberOfChild - No. of child
	 */
	public void setNumberOfChild(final String value)
	{
		setNumberOfChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.numberOfNight</code> attribute.
	 * @return the numberOfNight - No. of living night
	 */
	public String getNumberOfNight(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.numberOfNight</code> attribute.
	 * @return the numberOfNight - No. of living night
	 */
	public String getNumberOfNight()
	{
		return getNumberOfNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.numberOfNight</code> attribute. 
	 * @param value the numberOfNight - No. of living night
	 */
	public void setNumberOfNight(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.numberOfNight</code> attribute. 
	 * @param value the numberOfNight - No. of living night
	 */
	public void setNumberOfNight(final String value)
	{
		setNumberOfNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.orderHotelDetailInfo</code> attribute.
	 * @return the orderHotelDetailInfo
	 */
	public OrderHotelDetailInfo getOrderHotelDetailInfo(final SessionContext ctx)
	{
		return (OrderHotelDetailInfo)getProperty( ctx, ORDERHOTELDETAILINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.orderHotelDetailInfo</code> attribute.
	 * @return the orderHotelDetailInfo
	 */
	public OrderHotelDetailInfo getOrderHotelDetailInfo()
	{
		return getOrderHotelDetailInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.orderHotelDetailInfo</code> attribute. 
	 * @param value the orderHotelDetailInfo
	 */
	public void setOrderHotelDetailInfo(final SessionContext ctx, final OrderHotelDetailInfo value)
	{
		ORDERHOTELDETAILINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.orderHotelDetailInfo</code> attribute. 
	 * @param value the orderHotelDetailInfo
	 */
	public void setOrderHotelDetailInfo(final OrderHotelDetailInfo value)
	{
		setOrderHotelDetailInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.payAtHotel</code> attribute.
	 * @return the payAtHotel - If this product is support pay@Hotel.
	 */
	public Boolean isPayAtHotel(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYATHOTEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.payAtHotel</code> attribute.
	 * @return the payAtHotel - If this product is support pay@Hotel.
	 */
	public Boolean isPayAtHotel()
	{
		return isPayAtHotel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.payAtHotel</code> attribute. 
	 * @return the payAtHotel - If this product is support pay@Hotel.
	 */
	public boolean isPayAtHotelAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPayAtHotel( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.payAtHotel</code> attribute. 
	 * @return the payAtHotel - If this product is support pay@Hotel.
	 */
	public boolean isPayAtHotelAsPrimitive()
	{
		return isPayAtHotelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.payAtHotel</code> attribute. 
	 * @param value the payAtHotel - If this product is support pay@Hotel.
	 */
	public void setPayAtHotel(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYATHOTEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.payAtHotel</code> attribute. 
	 * @param value the payAtHotel - If this product is support pay@Hotel.
	 */
	public void setPayAtHotel(final Boolean value)
	{
		setPayAtHotel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.payAtHotel</code> attribute. 
	 * @param value the payAtHotel - If this product is support pay@Hotel.
	 */
	public void setPayAtHotel(final SessionContext ctx, final boolean value)
	{
		setPayAtHotel( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.payAtHotel</code> attribute. 
	 * @param value the payAtHotel - If this product is support pay@Hotel.
	 */
	public void setPayAtHotel(final boolean value)
	{
		setPayAtHotel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.paymentPlan</code> attribute.
	 * @return the paymentPlan
	 */
	public PaymentPlan getPaymentPlan(final SessionContext ctx)
	{
		return (PaymentPlan)getProperty( ctx, PAYMENTPLAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.paymentPlan</code> attribute.
	 * @return the paymentPlan
	 */
	public PaymentPlan getPaymentPlan()
	{
		return getPaymentPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.paymentPlan</code> attribute. 
	 * @param value the paymentPlan
	 */
	public void setPaymentPlan(final SessionContext ctx, final PaymentPlan value)
	{
		setProperty(ctx, PAYMENTPLAN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.paymentPlan</code> attribute. 
	 * @param value the paymentPlan
	 */
	public void setPaymentPlan(final PaymentPlan value)
	{
		setPaymentPlan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REFUNDABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable()
	{
		return isRefundable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRefundable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive()
	{
		return isRefundableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REFUNDABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final Boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final boolean value)
	{
		setRefundable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomAncillaryList</code> attribute.
	 * @return the roomAncillaryList
	 */
	public List<RoomAncillary> getRoomAncillaryList(final SessionContext ctx)
	{
		List<RoomAncillary> coll = (List<RoomAncillary>)getProperty( ctx, ROOMANCILLARYLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomAncillaryList</code> attribute.
	 * @return the roomAncillaryList
	 */
	public List<RoomAncillary> getRoomAncillaryList()
	{
		return getRoomAncillaryList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomAncillaryList</code> attribute. 
	 * @param value the roomAncillaryList
	 */
	public void setRoomAncillaryList(final SessionContext ctx, final List<RoomAncillary> value)
	{
		setProperty(ctx, ROOMANCILLARYLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomAncillaryList</code> attribute. 
	 * @param value the roomAncillaryList
	 */
	public void setRoomAncillaryList(final List<RoomAncillary> value)
	{
		setRoomAncillaryList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomCheckinDate</code> attribute.
	 * @return the roomCheckinDate - Check in date of room
	 */
	public Date getRoomCheckinDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ROOMCHECKINDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomCheckinDate</code> attribute.
	 * @return the roomCheckinDate - Check in date of room
	 */
	public Date getRoomCheckinDate()
	{
		return getRoomCheckinDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomCheckinDate</code> attribute. 
	 * @param value the roomCheckinDate - Check in date of room
	 */
	public void setRoomCheckinDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ROOMCHECKINDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomCheckinDate</code> attribute. 
	 * @param value the roomCheckinDate - Check in date of room
	 */
	public void setRoomCheckinDate(final Date value)
	{
		setRoomCheckinDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomCheckoutDate</code> attribute.
	 * @return the roomCheckoutDate - Check out date of room
	 */
	public Date getRoomCheckoutDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ROOMCHECKOUTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomCheckoutDate</code> attribute.
	 * @return the roomCheckoutDate - Check out date of room
	 */
	public Date getRoomCheckoutDate()
	{
		return getRoomCheckoutDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomCheckoutDate</code> attribute. 
	 * @param value the roomCheckoutDate - Check out date of room
	 */
	public void setRoomCheckoutDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ROOMCHECKOUTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomCheckoutDate</code> attribute. 
	 * @param value the roomCheckoutDate - Check out date of room
	 */
	public void setRoomCheckoutDate(final Date value)
	{
		setRoomCheckoutDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomId</code> attribute.
	 * @return the roomId
	 */
	public String getRoomId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomId</code> attribute.
	 * @return the roomId
	 */
	public String getRoomId()
	{
		return getRoomId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomId</code> attribute. 
	 * @param value the roomId
	 */
	public void setRoomId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomId</code> attribute. 
	 * @param value the roomId
	 */
	public void setRoomId(final String value)
	{
		setRoomId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomIndex</code> attribute.
	 * @return the roomIndex - index of room
	 */
	public Integer getRoomIndex(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ROOMINDEX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomIndex</code> attribute.
	 * @return the roomIndex - index of room
	 */
	public Integer getRoomIndex()
	{
		return getRoomIndex( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomIndex</code> attribute. 
	 * @return the roomIndex - index of room
	 */
	public int getRoomIndexAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRoomIndex( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomIndex</code> attribute. 
	 * @return the roomIndex - index of room
	 */
	public int getRoomIndexAsPrimitive()
	{
		return getRoomIndexAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomIndex</code> attribute. 
	 * @param value the roomIndex - index of room
	 */
	public void setRoomIndex(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ROOMINDEX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomIndex</code> attribute. 
	 * @param value the roomIndex - index of room
	 */
	public void setRoomIndex(final Integer value)
	{
		setRoomIndex( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomIndex</code> attribute. 
	 * @param value the roomIndex - index of room
	 */
	public void setRoomIndex(final SessionContext ctx, final int value)
	{
		setRoomIndex( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomIndex</code> attribute. 
	 * @param value the roomIndex - index of room
	 */
	public void setRoomIndex(final int value)
	{
		setRoomIndex( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomName</code> attribute.
	 * @return the roomName - Room Name
	 */
	public String getRoomName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomName</code> attribute.
	 * @return the roomName - Room Name
	 */
	public String getRoomName()
	{
		return getRoomName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomName</code> attribute. 
	 * @param value the roomName - Room Name
	 */
	public void setRoomName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomName</code> attribute. 
	 * @param value the roomName - Room Name
	 */
	public void setRoomName(final String value)
	{
		setRoomName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomType</code> attribute.
	 * @return the roomType - Room Type
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.roomType</code> attribute.
	 * @return the roomType - Room Type
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomType</code> attribute. 
	 * @param value the roomType - Room Type
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.roomType</code> attribute. 
	 * @param value the roomType - Room Type
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.timeLimit</code> attribute.
	 * @return the timeLimit - If user checked timelimit checkbox.
	 */
	public Boolean isTimeLimit(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TIMELIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.timeLimit</code> attribute.
	 * @return the timeLimit - If user checked timelimit checkbox.
	 */
	public Boolean isTimeLimit()
	{
		return isTimeLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.timeLimit</code> attribute. 
	 * @return the timeLimit - If user checked timelimit checkbox.
	 */
	public boolean isTimeLimitAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTimeLimit( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.timeLimit</code> attribute. 
	 * @return the timeLimit - If user checked timelimit checkbox.
	 */
	public boolean isTimeLimitAsPrimitive()
	{
		return isTimeLimitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.timeLimit</code> attribute. 
	 * @param value the timeLimit - If user checked timelimit checkbox.
	 */
	public void setTimeLimit(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TIMELIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.timeLimit</code> attribute. 
	 * @param value the timeLimit - If user checked timelimit checkbox.
	 */
	public void setTimeLimit(final Boolean value)
	{
		setTimeLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.timeLimit</code> attribute. 
	 * @param value the timeLimit - If user checked timelimit checkbox.
	 */
	public void setTimeLimit(final SessionContext ctx, final boolean value)
	{
		setTimeLimit( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.timeLimit</code> attribute. 
	 * @param value the timeLimit - If user checked timelimit checkbox.
	 */
	public void setTimeLimit(final boolean value)
	{
		setTimeLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.timeLimitExpDate</code> attribute.
	 * @return the timeLimitExpDate - time limit to expiry date
	 */
	public Date getTimeLimitExpDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TIMELIMITEXPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.timeLimitExpDate</code> attribute.
	 * @return the timeLimitExpDate - time limit to expiry date
	 */
	public Date getTimeLimitExpDate()
	{
		return getTimeLimitExpDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.timeLimitExpDate</code> attribute. 
	 * @param value the timeLimitExpDate - time limit to expiry date
	 */
	public void setTimeLimitExpDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TIMELIMITEXPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.timeLimitExpDate</code> attribute. 
	 * @param value the timeLimitExpDate - time limit to expiry date
	 */
	public void setTimeLimitExpDate(final Date value)
	{
		setTimeLimitExpDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig - Time Limit Master Config
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final SessionContext ctx)
	{
		return (TimeLimitMasterConfig)getProperty( ctx, TIMELIMITMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderRoomDetailInfo.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig - Time Limit Master Config
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig()
	{
		return getTimeLimitMasterConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig - Time Limit Master Config
	 */
	public void setTimeLimitMasterConfig(final SessionContext ctx, final TimeLimitMasterConfig value)
	{
		setProperty(ctx, TIMELIMITMASTERCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderRoomDetailInfo.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig - Time Limit Master Config
	 */
	public void setTimeLimitMasterConfig(final TimeLimitMasterConfig value)
	{
		setTimeLimitMasterConfig( getSession().getSessionContext(), value );
	}
	
}
