/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.holiday.inventory.jalo;

import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayRoomLevelInvDetail;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayPaxRoomInvDetail HolidayPaxRoomInvDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayPaxRoomInvDetail extends HolidayRoomLevelInvDetail
{
	/** Qualifier of the <code>HolidayPaxRoomInvDetail.noOfRooms</code> attribute **/
	public static final String NOOFROOMS = "noOfRooms";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(HolidayRoomLevelInvDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFROOMS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPaxRoomInvDetail.noOfRooms</code> attribute.
	 * @return the noOfRooms - Inventory Holiday no Of Rooms
	 */
	public Integer getNoOfRooms(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFROOMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPaxRoomInvDetail.noOfRooms</code> attribute.
	 * @return the noOfRooms - Inventory Holiday no Of Rooms
	 */
	public Integer getNoOfRooms()
	{
		return getNoOfRooms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPaxRoomInvDetail.noOfRooms</code> attribute. 
	 * @return the noOfRooms - Inventory Holiday no Of Rooms
	 */
	public int getNoOfRoomsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfRooms( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPaxRoomInvDetail.noOfRooms</code> attribute. 
	 * @return the noOfRooms - Inventory Holiday no Of Rooms
	 */
	public int getNoOfRoomsAsPrimitive()
	{
		return getNoOfRoomsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPaxRoomInvDetail.noOfRooms</code> attribute. 
	 * @param value the noOfRooms - Inventory Holiday no Of Rooms
	 */
	public void setNoOfRooms(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFROOMS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPaxRoomInvDetail.noOfRooms</code> attribute. 
	 * @param value the noOfRooms - Inventory Holiday no Of Rooms
	 */
	public void setNoOfRooms(final Integer value)
	{
		setNoOfRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPaxRoomInvDetail.noOfRooms</code> attribute. 
	 * @param value the noOfRooms - Inventory Holiday no Of Rooms
	 */
	public void setNoOfRooms(final SessionContext ctx, final int value)
	{
		setNoOfRooms( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPaxRoomInvDetail.noOfRooms</code> attribute. 
	 * @param value the noOfRooms - Inventory Holiday no Of Rooms
	 */
	public void setNoOfRooms(final int value)
	{
		setNoOfRooms( getSession().getSessionContext(), value );
	}
	
}
