/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.OrderRoomDetailInfo;
import com.cnk.travelogix.common.core.jalo.PriceInfo;
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem OrderHotelDetailInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrderHotelDetailInfo extends GenericItem
{
	/** Qualifier of the <code>OrderHotelDetailInfo.hotelPictureUrl</code> attribute **/
	public static final String HOTELPICTUREURL = "hotelPictureUrl";
	/** Qualifier of the <code>OrderHotelDetailInfo.hotelId</code> attribute **/
	public static final String HOTELID = "hotelId";
	/** Qualifier of the <code>OrderHotelDetailInfo.hotelName</code> attribute **/
	public static final String HOTELNAME = "hotelName";
	/** Qualifier of the <code>OrderHotelDetailInfo.hotelRate</code> attribute **/
	public static final String HOTELRATE = "hotelRate";
	/** Qualifier of the <code>OrderHotelDetailInfo.hotelAddress</code> attribute **/
	public static final String HOTELADDRESS = "hotelAddress";
	/** Qualifier of the <code>OrderHotelDetailInfo.hotelCityName</code> attribute **/
	public static final String HOTELCITYNAME = "hotelCityName";
	/** Qualifier of the <code>OrderHotelDetailInfo.hotelCountryName</code> attribute **/
	public static final String HOTELCOUNTRYNAME = "hotelCountryName";
	/** Qualifier of the <code>OrderHotelDetailInfo.hotelBookingDate</code> attribute **/
	public static final String HOTELBOOKINGDATE = "hotelBookingDate";
	/** Qualifier of the <code>OrderHotelDetailInfo.hotelCheckinDate</code> attribute **/
	public static final String HOTELCHECKINDATE = "hotelCheckinDate";
	/** Qualifier of the <code>OrderHotelDetailInfo.hotelCheckoutDate</code> attribute **/
	public static final String HOTELCHECKOUTDATE = "hotelCheckoutDate";
	/** Qualifier of the <code>OrderHotelDetailInfo.reservationDay</code> attribute **/
	public static final String RESERVATIONDAY = "reservationDay";
	/** Qualifier of the <code>OrderHotelDetailInfo.numberOfrooms</code> attribute **/
	public static final String NUMBEROFROOMS = "numberOfrooms";
	/** Qualifier of the <code>OrderHotelDetailInfo.numberOfAdult</code> attribute **/
	public static final String NUMBEROFADULT = "numberOfAdult";
	/** Qualifier of the <code>OrderHotelDetailInfo.numberOfChild</code> attribute **/
	public static final String NUMBEROFCHILD = "numberOfChild";
	/** Qualifier of the <code>OrderHotelDetailInfo.numberOfNights</code> attribute **/
	public static final String NUMBEROFNIGHTS = "numberOfNights";
	/** Qualifier of the <code>OrderHotelDetailInfo.priceInfo</code> attribute **/
	public static final String PRICEINFO = "priceInfo";
	/** Qualifier of the <code>OrderHotelDetailInfo.orderStatus</code> attribute **/
	public static final String ORDERSTATUS = "orderStatus";
	/** Qualifier of the <code>OrderHotelDetailInfo.orderRoomDetailInfo</code> attribute **/
	public static final String ORDERROOMDETAILINFO = "orderRoomDetailInfo";
	/**
	* {@link OneToManyHandler} for handling 1:n ORDERROOMDETAILINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OrderRoomDetailInfo> ORDERROOMDETAILINFOHANDLER = new OneToManyHandler<OrderRoomDetailInfo>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(HOTELPICTUREURL, AttributeMode.INITIAL);
		tmp.put(HOTELID, AttributeMode.INITIAL);
		tmp.put(HOTELNAME, AttributeMode.INITIAL);
		tmp.put(HOTELRATE, AttributeMode.INITIAL);
		tmp.put(HOTELADDRESS, AttributeMode.INITIAL);
		tmp.put(HOTELCITYNAME, AttributeMode.INITIAL);
		tmp.put(HOTELCOUNTRYNAME, AttributeMode.INITIAL);
		tmp.put(HOTELBOOKINGDATE, AttributeMode.INITIAL);
		tmp.put(HOTELCHECKINDATE, AttributeMode.INITIAL);
		tmp.put(HOTELCHECKOUTDATE, AttributeMode.INITIAL);
		tmp.put(RESERVATIONDAY, AttributeMode.INITIAL);
		tmp.put(NUMBEROFROOMS, AttributeMode.INITIAL);
		tmp.put(NUMBEROFADULT, AttributeMode.INITIAL);
		tmp.put(NUMBEROFCHILD, AttributeMode.INITIAL);
		tmp.put(NUMBEROFNIGHTS, AttributeMode.INITIAL);
		tmp.put(PRICEINFO, AttributeMode.INITIAL);
		tmp.put(ORDERSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelAddress</code> attribute.
	 * @return the hotelAddress - address of the hotel
	 */
	public String getHotelAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOTELADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelAddress</code> attribute.
	 * @return the hotelAddress - address of the hotel
	 */
	public String getHotelAddress()
	{
		return getHotelAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelAddress</code> attribute. 
	 * @param value the hotelAddress - address of the hotel
	 */
	public void setHotelAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOTELADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelAddress</code> attribute. 
	 * @param value the hotelAddress - address of the hotel
	 */
	public void setHotelAddress(final String value)
	{
		setHotelAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelBookingDate</code> attribute.
	 * @return the hotelBookingDate - booking date of hotel
	 */
	public Date getHotelBookingDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, HOTELBOOKINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelBookingDate</code> attribute.
	 * @return the hotelBookingDate - booking date of hotel
	 */
	public Date getHotelBookingDate()
	{
		return getHotelBookingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelBookingDate</code> attribute. 
	 * @param value the hotelBookingDate - booking date of hotel
	 */
	public void setHotelBookingDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, HOTELBOOKINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelBookingDate</code> attribute. 
	 * @param value the hotelBookingDate - booking date of hotel
	 */
	public void setHotelBookingDate(final Date value)
	{
		setHotelBookingDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelCheckinDate</code> attribute.
	 * @return the hotelCheckinDate - Check in date of hotel
	 */
	public Date getHotelCheckinDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, HOTELCHECKINDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelCheckinDate</code> attribute.
	 * @return the hotelCheckinDate - Check in date of hotel
	 */
	public Date getHotelCheckinDate()
	{
		return getHotelCheckinDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelCheckinDate</code> attribute. 
	 * @param value the hotelCheckinDate - Check in date of hotel
	 */
	public void setHotelCheckinDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, HOTELCHECKINDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelCheckinDate</code> attribute. 
	 * @param value the hotelCheckinDate - Check in date of hotel
	 */
	public void setHotelCheckinDate(final Date value)
	{
		setHotelCheckinDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelCheckoutDate</code> attribute.
	 * @return the hotelCheckoutDate - Check out date of hotel
	 */
	public Date getHotelCheckoutDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, HOTELCHECKOUTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelCheckoutDate</code> attribute.
	 * @return the hotelCheckoutDate - Check out date of hotel
	 */
	public Date getHotelCheckoutDate()
	{
		return getHotelCheckoutDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelCheckoutDate</code> attribute. 
	 * @param value the hotelCheckoutDate - Check out date of hotel
	 */
	public void setHotelCheckoutDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, HOTELCHECKOUTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelCheckoutDate</code> attribute. 
	 * @param value the hotelCheckoutDate - Check out date of hotel
	 */
	public void setHotelCheckoutDate(final Date value)
	{
		setHotelCheckoutDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelCityName</code> attribute.
	 * @return the hotelCityName - city name of the hotel
	 */
	public String getHotelCityName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOTELCITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelCityName</code> attribute.
	 * @return the hotelCityName - city name of the hotel
	 */
	public String getHotelCityName()
	{
		return getHotelCityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelCityName</code> attribute. 
	 * @param value the hotelCityName - city name of the hotel
	 */
	public void setHotelCityName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOTELCITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelCityName</code> attribute. 
	 * @param value the hotelCityName - city name of the hotel
	 */
	public void setHotelCityName(final String value)
	{
		setHotelCityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelCountryName</code> attribute.
	 * @return the hotelCountryName - country name of the hotel
	 */
	public String getHotelCountryName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOTELCOUNTRYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelCountryName</code> attribute.
	 * @return the hotelCountryName - country name of the hotel
	 */
	public String getHotelCountryName()
	{
		return getHotelCountryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelCountryName</code> attribute. 
	 * @param value the hotelCountryName - country name of the hotel
	 */
	public void setHotelCountryName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOTELCOUNTRYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelCountryName</code> attribute. 
	 * @param value the hotelCountryName - country name of the hotel
	 */
	public void setHotelCountryName(final String value)
	{
		setHotelCountryName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelId</code> attribute.
	 * @return the hotelId - id of the hotel
	 */
	public String getHotelId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOTELID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelId</code> attribute.
	 * @return the hotelId - id of the hotel
	 */
	public String getHotelId()
	{
		return getHotelId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelId</code> attribute. 
	 * @param value the hotelId - id of the hotel
	 */
	public void setHotelId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOTELID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelId</code> attribute. 
	 * @param value the hotelId - id of the hotel
	 */
	public void setHotelId(final String value)
	{
		setHotelId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelName</code> attribute.
	 * @return the hotelName - name of the hotel
	 */
	public String getHotelName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOTELNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelName</code> attribute.
	 * @return the hotelName - name of the hotel
	 */
	public String getHotelName()
	{
		return getHotelName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelName</code> attribute. 
	 * @param value the hotelName - name of the hotel
	 */
	public void setHotelName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOTELNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelName</code> attribute. 
	 * @param value the hotelName - name of the hotel
	 */
	public void setHotelName(final String value)
	{
		setHotelName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelPictureUrl</code> attribute.
	 * @return the hotelPictureUrl - hotel Picture Url
	 */
	public String getHotelPictureUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOTELPICTUREURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelPictureUrl</code> attribute.
	 * @return the hotelPictureUrl - hotel Picture Url
	 */
	public String getHotelPictureUrl()
	{
		return getHotelPictureUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelPictureUrl</code> attribute. 
	 * @param value the hotelPictureUrl - hotel Picture Url
	 */
	public void setHotelPictureUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOTELPICTUREURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelPictureUrl</code> attribute. 
	 * @param value the hotelPictureUrl - hotel Picture Url
	 */
	public void setHotelPictureUrl(final String value)
	{
		setHotelPictureUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelRate</code> attribute.
	 * @return the hotelRate - Rate of the hotel
	 */
	public String getHotelRate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOTELRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.hotelRate</code> attribute.
	 * @return the hotelRate - Rate of the hotel
	 */
	public String getHotelRate()
	{
		return getHotelRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelRate</code> attribute. 
	 * @param value the hotelRate - Rate of the hotel
	 */
	public void setHotelRate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOTELRATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.hotelRate</code> attribute. 
	 * @param value the hotelRate - Rate of the hotel
	 */
	public void setHotelRate(final String value)
	{
		setHotelRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.numberOfAdult</code> attribute.
	 * @return the numberOfAdult - No. of adult
	 */
	public String getNumberOfAdult(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.numberOfAdult</code> attribute.
	 * @return the numberOfAdult - No. of adult
	 */
	public String getNumberOfAdult()
	{
		return getNumberOfAdult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.numberOfAdult</code> attribute. 
	 * @param value the numberOfAdult - No. of adult
	 */
	public void setNumberOfAdult(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.numberOfAdult</code> attribute. 
	 * @param value the numberOfAdult - No. of adult
	 */
	public void setNumberOfAdult(final String value)
	{
		setNumberOfAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.numberOfChild</code> attribute.
	 * @return the numberOfChild - No. of child
	 */
	public String getNumberOfChild(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.numberOfChild</code> attribute.
	 * @return the numberOfChild - No. of child
	 */
	public String getNumberOfChild()
	{
		return getNumberOfChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.numberOfChild</code> attribute. 
	 * @param value the numberOfChild - No. of child
	 */
	public void setNumberOfChild(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.numberOfChild</code> attribute. 
	 * @param value the numberOfChild - No. of child
	 */
	public void setNumberOfChild(final String value)
	{
		setNumberOfChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.numberOfNights</code> attribute.
	 * @return the numberOfNights
	 */
	public String getNumberOfNights(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.numberOfNights</code> attribute.
	 * @return the numberOfNights
	 */
	public String getNumberOfNights()
	{
		return getNumberOfNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.numberOfNights</code> attribute. 
	 * @param value the numberOfNights
	 */
	public void setNumberOfNights(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.numberOfNights</code> attribute. 
	 * @param value the numberOfNights
	 */
	public void setNumberOfNights(final String value)
	{
		setNumberOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.numberOfrooms</code> attribute.
	 * @return the numberOfrooms - No. of booking rooms
	 */
	public String getNumberOfrooms(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFROOMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.numberOfrooms</code> attribute.
	 * @return the numberOfrooms - No. of booking rooms
	 */
	public String getNumberOfrooms()
	{
		return getNumberOfrooms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.numberOfrooms</code> attribute. 
	 * @param value the numberOfrooms - No. of booking rooms
	 */
	public void setNumberOfrooms(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFROOMS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.numberOfrooms</code> attribute. 
	 * @param value the numberOfrooms - No. of booking rooms
	 */
	public void setNumberOfrooms(final String value)
	{
		setNumberOfrooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.orderRoomDetailInfo</code> attribute.
	 * @return the orderRoomDetailInfo
	 */
	public List<OrderRoomDetailInfo> getOrderRoomDetailInfo(final SessionContext ctx)
	{
		return (List<OrderRoomDetailInfo>)ORDERROOMDETAILINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.orderRoomDetailInfo</code> attribute.
	 * @return the orderRoomDetailInfo
	 */
	public List<OrderRoomDetailInfo> getOrderRoomDetailInfo()
	{
		return getOrderRoomDetailInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.orderRoomDetailInfo</code> attribute. 
	 * @param value the orderRoomDetailInfo
	 */
	public void setOrderRoomDetailInfo(final SessionContext ctx, final List<OrderRoomDetailInfo> value)
	{
		ORDERROOMDETAILINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.orderRoomDetailInfo</code> attribute. 
	 * @param value the orderRoomDetailInfo
	 */
	public void setOrderRoomDetailInfo(final List<OrderRoomDetailInfo> value)
	{
		setOrderRoomDetailInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orderRoomDetailInfo. 
	 * @param value the item to add to orderRoomDetailInfo
	 */
	public void addToOrderRoomDetailInfo(final SessionContext ctx, final OrderRoomDetailInfo value)
	{
		ORDERROOMDETAILINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orderRoomDetailInfo. 
	 * @param value the item to add to orderRoomDetailInfo
	 */
	public void addToOrderRoomDetailInfo(final OrderRoomDetailInfo value)
	{
		addToOrderRoomDetailInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orderRoomDetailInfo. 
	 * @param value the item to remove from orderRoomDetailInfo
	 */
	public void removeFromOrderRoomDetailInfo(final SessionContext ctx, final OrderRoomDetailInfo value)
	{
		ORDERROOMDETAILINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orderRoomDetailInfo. 
	 * @param value the item to remove from orderRoomDetailInfo
	 */
	public void removeFromOrderRoomDetailInfo(final OrderRoomDetailInfo value)
	{
		removeFromOrderRoomDetailInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.orderStatus</code> attribute.
	 * @return the orderStatus
	 */
	public EnumerationValue getOrderStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ORDERSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.orderStatus</code> attribute.
	 * @return the orderStatus
	 */
	public EnumerationValue getOrderStatus()
	{
		return getOrderStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.orderStatus</code> attribute. 
	 * @param value the orderStatus
	 */
	public void setOrderStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ORDERSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.orderStatus</code> attribute. 
	 * @param value the orderStatus
	 */
	public void setOrderStatus(final EnumerationValue value)
	{
		setOrderStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.priceInfo</code> attribute.
	 * @return the priceInfo
	 */
	public PriceInfo getPriceInfo(final SessionContext ctx)
	{
		return (PriceInfo)getProperty( ctx, PRICEINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.priceInfo</code> attribute.
	 * @return the priceInfo
	 */
	public PriceInfo getPriceInfo()
	{
		return getPriceInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.priceInfo</code> attribute. 
	 * @param value the priceInfo
	 */
	public void setPriceInfo(final SessionContext ctx, final PriceInfo value)
	{
		setProperty(ctx, PRICEINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.priceInfo</code> attribute. 
	 * @param value the priceInfo
	 */
	public void setPriceInfo(final PriceInfo value)
	{
		setPriceInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.reservationDay</code> attribute.
	 * @return the reservationDay - Reservation days
	 */
	public String getReservationDay(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RESERVATIONDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderHotelDetailInfo.reservationDay</code> attribute.
	 * @return the reservationDay - Reservation days
	 */
	public String getReservationDay()
	{
		return getReservationDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.reservationDay</code> attribute. 
	 * @param value the reservationDay - Reservation days
	 */
	public void setReservationDay(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RESERVATIONDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderHotelDetailInfo.reservationDay</code> attribute. 
	 * @param value the reservationDay - Reservation days
	 */
	public void setReservationDay(final String value)
	{
		setReservationDay( getSession().getSessionContext(), value );
	}
	
}
