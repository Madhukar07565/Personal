/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.activityinventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivityInventoryDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivitiesDate ActivitiesDate}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivitiesDate extends ActivityInventoryDetail
{
	/** Qualifier of the <code>ActivitiesDate.timeFrom</code> attribute **/
	public static final String TIMEFROM = "timeFrom";
	/** Qualifier of the <code>ActivitiesDate.timeTo</code> attribute **/
	public static final String TIMETO = "timeTo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ActivityInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TIMEFROM, AttributeMode.INITIAL);
		tmp.put(TIMETO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesDate.timeFrom</code> attribute.
	 * @return the timeFrom - Time From
	 */
	public String getTimeFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesDate.timeFrom</code> attribute.
	 * @return the timeFrom - Time From
	 */
	public String getTimeFrom()
	{
		return getTimeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesDate.timeFrom</code> attribute. 
	 * @param value the timeFrom - Time From
	 */
	public void setTimeFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesDate.timeFrom</code> attribute. 
	 * @param value the timeFrom - Time From
	 */
	public void setTimeFrom(final String value)
	{
		setTimeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesDate.timeTo</code> attribute.
	 * @return the timeTo - Time To
	 */
	public String getTimeTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesDate.timeTo</code> attribute.
	 * @return the timeTo - Time To
	 */
	public String getTimeTo()
	{
		return getTimeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesDate.timeTo</code> attribute. 
	 * @param value the timeTo - Time To
	 */
	public void setTimeTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesDate.timeTo</code> attribute. 
	 * @param value the timeTo - Time To
	 */
	public void setTimeTo(final String value)
	{
		setTimeTo( getSession().getSessionContext(), value );
	}
	
}
