/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.RoomDetailsforCruise RoomDetailsforCruise}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoomDetailsforCruise extends GenericItem
{
	/** Qualifier of the <code>RoomDetailsforCruise.cabinCategory</code> attribute **/
	public static final String CABINCATEGORY = "cabinCategory";
	/** Qualifier of the <code>RoomDetailsforCruise.cabinType</code> attribute **/
	public static final String CABINTYPE = "cabinType";
	/** Qualifier of the <code>RoomDetailsforCruise.mealPlan</code> attribute **/
	public static final String MEALPLAN = "mealPlan";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CABINCATEGORY, AttributeMode.INITIAL);
		tmp.put(CABINTYPE, AttributeMode.INITIAL);
		tmp.put(MEALPLAN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforCruise.cabinCategory</code> attribute.
	 * @return the cabinCategory - Company Policy Cabin Category
	 */
	public EnumerationValue getCabinCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforCruise.cabinCategory</code> attribute.
	 * @return the cabinCategory - Company Policy Cabin Category
	 */
	public EnumerationValue getCabinCategory()
	{
		return getCabinCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforCruise.cabinCategory</code> attribute. 
	 * @param value the cabinCategory - Company Policy Cabin Category
	 */
	public void setCabinCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforCruise.cabinCategory</code> attribute. 
	 * @param value the cabinCategory - Company Policy Cabin Category
	 */
	public void setCabinCategory(final EnumerationValue value)
	{
		setCabinCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforCruise.cabinType</code> attribute.
	 * @return the cabinType - Company Policy Cabin Type
	 */
	public EnumerationValue getCabinType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforCruise.cabinType</code> attribute.
	 * @return the cabinType - Company Policy Cabin Type
	 */
	public EnumerationValue getCabinType()
	{
		return getCabinType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforCruise.cabinType</code> attribute. 
	 * @param value the cabinType - Company Policy Cabin Type
	 */
	public void setCabinType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforCruise.cabinType</code> attribute. 
	 * @param value the cabinType - Company Policy Cabin Type
	 */
	public void setCabinType(final EnumerationValue value)
	{
		setCabinType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforCruise.mealPlan</code> attribute.
	 * @return the mealPlan - Company Policy Meal Plan List
	 */
	public List<EnumerationValue> getMealPlan(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, MEALPLAN);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforCruise.mealPlan</code> attribute.
	 * @return the mealPlan - Company Policy Meal Plan List
	 */
	public List<EnumerationValue> getMealPlan()
	{
		return getMealPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforCruise.mealPlan</code> attribute. 
	 * @param value the mealPlan - Company Policy Meal Plan List
	 */
	public void setMealPlan(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, MEALPLAN,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforCruise.mealPlan</code> attribute. 
	 * @param value the mealPlan - Company Policy Meal Plan List
	 */
	public void setMealPlan(final List<EnumerationValue> value)
	{
		setMealPlan( getSession().getSessionContext(), value );
	}
	
}
