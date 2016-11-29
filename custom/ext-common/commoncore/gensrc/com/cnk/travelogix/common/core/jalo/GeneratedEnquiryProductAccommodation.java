/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.BaseEnquiryProductSpecific;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EnquiryProductAccommodation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEnquiryProductAccommodation extends BaseEnquiryProductSpecific
{
	/** Qualifier of the <code>EnquiryProductAccommodation.checkInDate</code> attribute **/
	public static final String CHECKINDATE = "checkInDate";
	/** Qualifier of the <code>EnquiryProductAccommodation.checkOutDate</code> attribute **/
	public static final String CHECKOUTDATE = "checkOutDate";
	/** Qualifier of the <code>EnquiryProductAccommodation.numberOfNights</code> attribute **/
	public static final String NUMBEROFNIGHTS = "numberOfNights";
	/** Qualifier of the <code>EnquiryProductAccommodation.numberOfRooms</code> attribute **/
	public static final String NUMBEROFROOMS = "numberOfRooms";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BaseEnquiryProductSpecific.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CHECKINDATE, AttributeMode.INITIAL);
		tmp.put(CHECKOUTDATE, AttributeMode.INITIAL);
		tmp.put(NUMBEROFNIGHTS, AttributeMode.INITIAL);
		tmp.put(NUMBEROFROOMS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.checkInDate</code> attribute.
	 * @return the checkInDate
	 */
	public Date getCheckInDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CHECKINDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.checkInDate</code> attribute.
	 * @return the checkInDate
	 */
	public Date getCheckInDate()
	{
		return getCheckInDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.checkInDate</code> attribute. 
	 * @param value the checkInDate
	 */
	public void setCheckInDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CHECKINDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.checkInDate</code> attribute. 
	 * @param value the checkInDate
	 */
	public void setCheckInDate(final Date value)
	{
		setCheckInDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.checkOutDate</code> attribute.
	 * @return the checkOutDate
	 */
	public Date getCheckOutDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CHECKOUTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.checkOutDate</code> attribute.
	 * @return the checkOutDate
	 */
	public Date getCheckOutDate()
	{
		return getCheckOutDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.checkOutDate</code> attribute. 
	 * @param value the checkOutDate
	 */
	public void setCheckOutDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CHECKOUTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.checkOutDate</code> attribute. 
	 * @param value the checkOutDate
	 */
	public void setCheckOutDate(final Date value)
	{
		setCheckOutDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.numberOfNights</code> attribute.
	 * @return the numberOfNights
	 */
	public Integer getNumberOfNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.numberOfNights</code> attribute.
	 * @return the numberOfNights
	 */
	public Integer getNumberOfNights()
	{
		return getNumberOfNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.numberOfNights</code> attribute. 
	 * @return the numberOfNights
	 */
	public int getNumberOfNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.numberOfNights</code> attribute. 
	 * @return the numberOfNights
	 */
	public int getNumberOfNightsAsPrimitive()
	{
		return getNumberOfNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.numberOfNights</code> attribute. 
	 * @param value the numberOfNights
	 */
	public void setNumberOfNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.numberOfNights</code> attribute. 
	 * @param value the numberOfNights
	 */
	public void setNumberOfNights(final Integer value)
	{
		setNumberOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.numberOfNights</code> attribute. 
	 * @param value the numberOfNights
	 */
	public void setNumberOfNights(final SessionContext ctx, final int value)
	{
		setNumberOfNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.numberOfNights</code> attribute. 
	 * @param value the numberOfNights
	 */
	public void setNumberOfNights(final int value)
	{
		setNumberOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.numberOfRooms</code> attribute.
	 * @return the numberOfRooms
	 */
	public Integer getNumberOfRooms(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFROOMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.numberOfRooms</code> attribute.
	 * @return the numberOfRooms
	 */
	public Integer getNumberOfRooms()
	{
		return getNumberOfRooms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.numberOfRooms</code> attribute. 
	 * @return the numberOfRooms
	 */
	public int getNumberOfRoomsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfRooms( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductAccommodation.numberOfRooms</code> attribute. 
	 * @return the numberOfRooms
	 */
	public int getNumberOfRoomsAsPrimitive()
	{
		return getNumberOfRoomsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.numberOfRooms</code> attribute. 
	 * @param value the numberOfRooms
	 */
	public void setNumberOfRooms(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFROOMS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.numberOfRooms</code> attribute. 
	 * @param value the numberOfRooms
	 */
	public void setNumberOfRooms(final Integer value)
	{
		setNumberOfRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.numberOfRooms</code> attribute. 
	 * @param value the numberOfRooms
	 */
	public void setNumberOfRooms(final SessionContext ctx, final int value)
	{
		setNumberOfRooms( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductAccommodation.numberOfRooms</code> attribute. 
	 * @param value the numberOfRooms
	 */
	public void setNumberOfRooms(final int value)
	{
		setNumberOfRooms( getSession().getSessionContext(), value );
	}
	
}
