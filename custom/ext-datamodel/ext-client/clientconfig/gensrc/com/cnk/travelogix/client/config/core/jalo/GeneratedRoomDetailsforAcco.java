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
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.RoomDetailsforAcco RoomDetailsforAcco}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoomDetailsforAcco extends GenericItem
{
	/** Qualifier of the <code>RoomDetailsforAcco.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>RoomDetailsforAcco.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>RoomDetailsforAcco.mealPlan</code> attribute **/
	public static final String MEALPLAN = "mealPlan";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(MEALPLAN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforAcco.mealPlan</code> attribute.
	 * @return the mealPlan - Company Policy Meal Plan List
	 */
	public List<EnumerationValue> getMealPlan(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, MEALPLAN);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforAcco.mealPlan</code> attribute.
	 * @return the mealPlan - Company Policy Meal Plan List
	 */
	public List<EnumerationValue> getMealPlan()
	{
		return getMealPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforAcco.mealPlan</code> attribute. 
	 * @param value the mealPlan - Company Policy Meal Plan List
	 */
	public void setMealPlan(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, MEALPLAN,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforAcco.mealPlan</code> attribute. 
	 * @param value the mealPlan - Company Policy Meal Plan List
	 */
	public void setMealPlan(final List<EnumerationValue> value)
	{
		setMealPlan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforAcco.roomCategory</code> attribute.
	 * @return the roomCategory - Company Policy Room Category
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforAcco.roomCategory</code> attribute.
	 * @return the roomCategory - Company Policy Room Category
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforAcco.roomCategory</code> attribute. 
	 * @param value the roomCategory - Company Policy Room Category
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforAcco.roomCategory</code> attribute. 
	 * @param value the roomCategory - Company Policy Room Category
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforAcco.roomType</code> attribute.
	 * @return the roomType - Company Policy Room Type
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforAcco.roomType</code> attribute.
	 * @return the roomType - Company Policy Room Type
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforAcco.roomType</code> attribute. 
	 * @param value the roomType - Company Policy Room Type
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforAcco.roomType</code> attribute. 
	 * @param value the roomType - Company Policy Room Type
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
}
