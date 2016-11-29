/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.RoomAncillary;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem LateCheckOutSubAncillary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLateCheckOutSubAncillary extends RoomAncillary
{
	/** Qualifier of the <code>LateCheckOutSubAncillary.checkoutTime</code> attribute **/
	public static final String CHECKOUTTIME = "checkoutTime";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(RoomAncillary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CHECKOUTTIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LateCheckOutSubAncillary.checkoutTime</code> attribute.
	 * @return the checkoutTime
	 */
	public Date getCheckoutTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CHECKOUTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LateCheckOutSubAncillary.checkoutTime</code> attribute.
	 * @return the checkoutTime
	 */
	public Date getCheckoutTime()
	{
		return getCheckoutTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LateCheckOutSubAncillary.checkoutTime</code> attribute. 
	 * @param value the checkoutTime
	 */
	public void setCheckoutTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CHECKOUTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LateCheckOutSubAncillary.checkoutTime</code> attribute. 
	 * @param value the checkoutTime
	 */
	public void setCheckoutTime(final Date value)
	{
		setCheckoutTime( getSession().getSessionContext(), value );
	}
	
}
