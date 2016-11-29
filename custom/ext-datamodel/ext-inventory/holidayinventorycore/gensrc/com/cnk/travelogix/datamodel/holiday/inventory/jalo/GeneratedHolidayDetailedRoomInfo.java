/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.holiday.inventory.jalo;

import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayRoomInfo;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.PackageInclusionInfo;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayDetailedRoomInfo HolidayDetailedRoomInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayDetailedRoomInfo extends HolidayRoomInfo
{
	/** Qualifier of the <code>HolidayDetailedRoomInfo.noOfNights</code> attribute **/
	public static final String NOOFNIGHTS = "noOfNights";
	/** Qualifier of the <code>HolidayDetailedRoomInfo.packageInclusion</code> attribute **/
	public static final String PACKAGEINCLUSION = "packageInclusion";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(HolidayRoomInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFNIGHTS, AttributeMode.INITIAL);
		tmp.put(PACKAGEINCLUSION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDetailedRoomInfo.noOfNights</code> attribute.
	 * @return the noOfNights - No Of Nights
	 */
	public Integer getNoOfNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDetailedRoomInfo.noOfNights</code> attribute.
	 * @return the noOfNights - No Of Nights
	 */
	public Integer getNoOfNights()
	{
		return getNoOfNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDetailedRoomInfo.noOfNights</code> attribute. 
	 * @return the noOfNights - No Of Nights
	 */
	public int getNoOfNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDetailedRoomInfo.noOfNights</code> attribute. 
	 * @return the noOfNights - No Of Nights
	 */
	public int getNoOfNightsAsPrimitive()
	{
		return getNoOfNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDetailedRoomInfo.noOfNights</code> attribute. 
	 * @param value the noOfNights - No Of Nights
	 */
	public void setNoOfNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDetailedRoomInfo.noOfNights</code> attribute. 
	 * @param value the noOfNights - No Of Nights
	 */
	public void setNoOfNights(final Integer value)
	{
		setNoOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDetailedRoomInfo.noOfNights</code> attribute. 
	 * @param value the noOfNights - No Of Nights
	 */
	public void setNoOfNights(final SessionContext ctx, final int value)
	{
		setNoOfNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDetailedRoomInfo.noOfNights</code> attribute. 
	 * @param value the noOfNights - No Of Nights
	 */
	public void setNoOfNights(final int value)
	{
		setNoOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDetailedRoomInfo.packageInclusion</code> attribute.
	 * @return the packageInclusion - package Inclusion
	 */
	public PackageInclusionInfo getPackageInclusion(final SessionContext ctx)
	{
		return (PackageInclusionInfo)getProperty( ctx, PACKAGEINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDetailedRoomInfo.packageInclusion</code> attribute.
	 * @return the packageInclusion - package Inclusion
	 */
	public PackageInclusionInfo getPackageInclusion()
	{
		return getPackageInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDetailedRoomInfo.packageInclusion</code> attribute. 
	 * @param value the packageInclusion - package Inclusion
	 */
	public void setPackageInclusion(final SessionContext ctx, final PackageInclusionInfo value)
	{
		setProperty(ctx, PACKAGEINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDetailedRoomInfo.packageInclusion</code> attribute. 
	 * @param value the packageInclusion - package Inclusion
	 */
	public void setPackageInclusion(final PackageInclusionInfo value)
	{
		setPackageInclusion( getSession().getSessionContext(), value );
	}
	
}
