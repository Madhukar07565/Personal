/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.jalo.OverBookingLimit OverBookingLimit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOverBookingLimit extends GenericItem
{
	/** Qualifier of the <code>OverBookingLimit.limit</code> attribute **/
	public static final String LIMIT = "limit";
	/** Qualifier of the <code>OverBookingLimit.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LIMIT, AttributeMode.INITIAL);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.cabinClass</code> attribute.
	 * @return the cabinClass - cabin class
	 */
	public EnumerationValue getCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.cabinClass</code> attribute.
	 * @return the cabinClass - cabin class
	 */
	public EnumerationValue getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.cabinClass</code> attribute. 
	 * @param value the cabinClass - cabin class
	 */
	public void setCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.cabinClass</code> attribute. 
	 * @param value the cabinClass - cabin class
	 */
	public void setCabinClass(final EnumerationValue value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.limit</code> attribute.
	 * @return the limit - limit
	 */
	public Integer getLimit(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.limit</code> attribute.
	 * @return the limit - limit
	 */
	public Integer getLimit()
	{
		return getLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.limit</code> attribute. 
	 * @return the limit - limit
	 */
	public int getLimitAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLimit( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.limit</code> attribute. 
	 * @return the limit - limit
	 */
	public int getLimitAsPrimitive()
	{
		return getLimitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.limit</code> attribute. 
	 * @param value the limit - limit
	 */
	public void setLimit(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.limit</code> attribute. 
	 * @param value the limit - limit
	 */
	public void setLimit(final Integer value)
	{
		setLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.limit</code> attribute. 
	 * @param value the limit - limit
	 */
	public void setLimit(final SessionContext ctx, final int value)
	{
		setLimit( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.limit</code> attribute. 
	 * @param value the limit - limit
	 */
	public void setLimit(final int value)
	{
		setLimit( getSession().getSessionContext(), value );
	}
	
}
