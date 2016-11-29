/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.MealSupplementDetail MealSupplementDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMealSupplementDetail extends GenericItem
{
	/** Qualifier of the <code>MealSupplementDetail.menuName</code> attribute **/
	public static final String MENUNAME = "menuName";
	/** Qualifier of the <code>MealSupplementDetail.menuItemName</code> attribute **/
	public static final String MENUITEMNAME = "menuItemName";
	/** Qualifier of the <code>MealSupplementDetail.mealType</code> attribute **/
	public static final String MEALTYPE = "mealType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MENUNAME, AttributeMode.INITIAL);
		tmp.put(MENUITEMNAME, AttributeMode.INITIAL);
		tmp.put(MEALTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealSupplementDetail.mealType</code> attribute.
	 * @return the mealType
	 */
	public EnumerationValue getMealType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealSupplementDetail.mealType</code> attribute.
	 * @return the mealType
	 */
	public EnumerationValue getMealType()
	{
		return getMealType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealSupplementDetail.mealType</code> attribute. 
	 * @param value the mealType
	 */
	public void setMealType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealSupplementDetail.mealType</code> attribute. 
	 * @param value the mealType
	 */
	public void setMealType(final EnumerationValue value)
	{
		setMealType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealSupplementDetail.menuItemName</code> attribute.
	 * @return the menuItemName
	 */
	public EnumerationValue getMenuItemName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MENUITEMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealSupplementDetail.menuItemName</code> attribute.
	 * @return the menuItemName
	 */
	public EnumerationValue getMenuItemName()
	{
		return getMenuItemName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealSupplementDetail.menuItemName</code> attribute. 
	 * @param value the menuItemName
	 */
	public void setMenuItemName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MENUITEMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealSupplementDetail.menuItemName</code> attribute. 
	 * @param value the menuItemName
	 */
	public void setMenuItemName(final EnumerationValue value)
	{
		setMenuItemName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealSupplementDetail.menuName</code> attribute.
	 * @return the menuName
	 */
	public EnumerationValue getMenuName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MENUNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealSupplementDetail.menuName</code> attribute.
	 * @return the menuName
	 */
	public EnumerationValue getMenuName()
	{
		return getMenuName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealSupplementDetail.menuName</code> attribute. 
	 * @param value the menuName
	 */
	public void setMenuName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MENUNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealSupplementDetail.menuName</code> attribute. 
	 * @param value the menuName
	 */
	public void setMenuName(final EnumerationValue value)
	{
		setMenuName( getSession().getSessionContext(), value );
	}
	
}
