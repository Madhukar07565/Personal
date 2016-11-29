/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.ActivityDayWiseItinerary ActivityDayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityDayWiseItinerary extends AbstractDayWiseItinerary
{
	/** Qualifier of the <code>ActivityDayWiseItinerary.pickUpPointType</code> attribute **/
	public static final String PICKUPPOINTTYPE = "pickUpPointType";
	/** Qualifier of the <code>ActivityDayWiseItinerary.pickUpPointName</code> attribute **/
	public static final String PICKUPPOINTNAME = "pickUpPointName";
	/** Qualifier of the <code>ActivityDayWiseItinerary.sessionName</code> attribute **/
	public static final String SESSIONNAME = "sessionName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDayWiseItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PICKUPPOINTTYPE, AttributeMode.INITIAL);
		tmp.put(PICKUPPOINTNAME, AttributeMode.INITIAL);
		tmp.put(SESSIONNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDayWiseItinerary.pickUpPointName</code> attribute.
	 * @return the pickUpPointName - Pickup point name
	 */
	public Item getPickUpPointName(final SessionContext ctx)
	{
		return (Item)getProperty( ctx, PICKUPPOINTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDayWiseItinerary.pickUpPointName</code> attribute.
	 * @return the pickUpPointName - Pickup point name
	 */
	public Item getPickUpPointName()
	{
		return getPickUpPointName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDayWiseItinerary.pickUpPointName</code> attribute. 
	 * @param value the pickUpPointName - Pickup point name
	 */
	public void setPickUpPointName(final SessionContext ctx, final Item value)
	{
		setProperty(ctx, PICKUPPOINTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDayWiseItinerary.pickUpPointName</code> attribute. 
	 * @param value the pickUpPointName - Pickup point name
	 */
	public void setPickUpPointName(final Item value)
	{
		setPickUpPointName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDayWiseItinerary.pickUpPointType</code> attribute.
	 * @return the pickUpPointType - Pickup point type
	 */
	public EnumerationValue getPickUpPointType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PICKUPPOINTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDayWiseItinerary.pickUpPointType</code> attribute.
	 * @return the pickUpPointType - Pickup point type
	 */
	public EnumerationValue getPickUpPointType()
	{
		return getPickUpPointType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDayWiseItinerary.pickUpPointType</code> attribute. 
	 * @param value the pickUpPointType - Pickup point type
	 */
	public void setPickUpPointType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PICKUPPOINTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDayWiseItinerary.pickUpPointType</code> attribute. 
	 * @param value the pickUpPointType - Pickup point type
	 */
	public void setPickUpPointType(final EnumerationValue value)
	{
		setPickUpPointType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDayWiseItinerary.sessionName</code> attribute.
	 * @return the sessionName - Session
	 */
	public EnumerationValue getSessionName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SESSIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDayWiseItinerary.sessionName</code> attribute.
	 * @return the sessionName - Session
	 */
	public EnumerationValue getSessionName()
	{
		return getSessionName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDayWiseItinerary.sessionName</code> attribute. 
	 * @param value the sessionName - Session
	 */
	public void setSessionName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SESSIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDayWiseItinerary.sessionName</code> attribute. 
	 * @param value the sessionName - Session
	 */
	public void setSessionName(final EnumerationValue value)
	{
		setSessionName( getSession().getSessionContext(), value );
	}
	
}
