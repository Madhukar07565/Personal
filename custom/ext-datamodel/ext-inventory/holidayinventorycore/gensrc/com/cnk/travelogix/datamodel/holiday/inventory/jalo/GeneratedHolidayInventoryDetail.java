/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.holiday.inventory.jalo;

import com.cnk.travelogix.datamodel.holiday.inventory.jalo.AbstractHolidayInventoryDetail;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayRoomInfo;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayInventoryDetail HolidayInventoryDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayInventoryDetail extends AbstractHolidayInventoryDetail
{
	/** Qualifier of the <code>HolidayInventoryDetail.holidayProductRoomInfo</code> attribute **/
	public static final String HOLIDAYPRODUCTROOMINFO = "holidayProductRoomInfo";
	/**
	* {@link OneToManyHandler} for handling 1:n HOLIDAYPRODUCTROOMINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<HolidayRoomInfo> HOLIDAYPRODUCTROOMINFOHANDLER = new OneToManyHandler<HolidayRoomInfo>(
	HolidayinventorycoreConstants.TC.HOLIDAYROOMINFO,
	false,
	"holidayInventoryDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractHolidayInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDetail.holidayProductRoomInfo</code> attribute.
	 * @return the holidayProductRoomInfo
	 */
	public Collection<HolidayRoomInfo> getHolidayProductRoomInfo(final SessionContext ctx)
	{
		return HOLIDAYPRODUCTROOMINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDetail.holidayProductRoomInfo</code> attribute.
	 * @return the holidayProductRoomInfo
	 */
	public Collection<HolidayRoomInfo> getHolidayProductRoomInfo()
	{
		return getHolidayProductRoomInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDetail.holidayProductRoomInfo</code> attribute. 
	 * @param value the holidayProductRoomInfo
	 */
	public void setHolidayProductRoomInfo(final SessionContext ctx, final Collection<HolidayRoomInfo> value)
	{
		HOLIDAYPRODUCTROOMINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDetail.holidayProductRoomInfo</code> attribute. 
	 * @param value the holidayProductRoomInfo
	 */
	public void setHolidayProductRoomInfo(final Collection<HolidayRoomInfo> value)
	{
		setHolidayProductRoomInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to holidayProductRoomInfo. 
	 * @param value the item to add to holidayProductRoomInfo
	 */
	public void addToHolidayProductRoomInfo(final SessionContext ctx, final HolidayRoomInfo value)
	{
		HOLIDAYPRODUCTROOMINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to holidayProductRoomInfo. 
	 * @param value the item to add to holidayProductRoomInfo
	 */
	public void addToHolidayProductRoomInfo(final HolidayRoomInfo value)
	{
		addToHolidayProductRoomInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from holidayProductRoomInfo. 
	 * @param value the item to remove from holidayProductRoomInfo
	 */
	public void removeFromHolidayProductRoomInfo(final SessionContext ctx, final HolidayRoomInfo value)
	{
		HOLIDAYPRODUCTROOMINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from holidayProductRoomInfo. 
	 * @param value the item to remove from holidayProductRoomInfo
	 */
	public void removeFromHolidayProductRoomInfo(final HolidayRoomInfo value)
	{
		removeFromHolidayProductRoomInfo( getSession().getSessionContext(), value );
	}
	
}
