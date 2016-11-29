/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsaccommodationConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractSurchargeSuppDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.AccoSurchargeSuppDetail AccoSurchargeSuppDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoSurchargeSuppDetail extends AbstractSurchargeSuppDetail
{
	/** Qualifier of the <code>AccoSurchargeSuppDetail.subType</code> attribute **/
	public static final String SUBTYPE = "subType";
	/** Qualifier of the <code>AccoSurchargeSuppDetail.roomCategories</code> attribute **/
	public static final String ROOMCATEGORIES = "roomCategories";
	/** Qualifier of the <code>AccoSurchargeSuppDetail.roomTypes</code> attribute **/
	public static final String ROOMTYPES = "roomTypes";
	/** Qualifier of the <code>AccoSurchargeSuppDetail.mealPlan</code> attribute **/
	public static final String MEALPLAN = "mealPlan";
	/** Qualifier of the <code>AccoSurchargeSuppDetail.stdCommissionValue</code> attribute **/
	public static final String STDCOMMISSIONVALUE = "stdCommissionValue";
	/** Qualifier of the <code>AccoSurchargeSuppDetail.stdCommissionType</code> attribute **/
	public static final String STDCOMMISSIONTYPE = "stdCommissionType";
	/** Qualifier of the <code>AccoSurchargeSuppDetail.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSurchargeSuppDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUBTYPE, AttributeMode.INITIAL);
		tmp.put(ROOMCATEGORIES, AttributeMode.INITIAL);
		tmp.put(ROOMTYPES, AttributeMode.INITIAL);
		tmp.put(MEALPLAN, AttributeMode.INITIAL);
		tmp.put(STDCOMMISSIONVALUE, AttributeMode.INITIAL);
		tmp.put(STDCOMMISSIONTYPE, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.mealPlan</code> attribute.
	 * @return the mealPlan
	 */
	public Set<EnumerationValue> getMealPlan(final SessionContext ctx)
	{
		Set<EnumerationValue> coll = (Set<EnumerationValue>)getProperty( ctx, MEALPLAN);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.mealPlan</code> attribute.
	 * @return the mealPlan
	 */
	public Set<EnumerationValue> getMealPlan()
	{
		return getMealPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.mealPlan</code> attribute. 
	 * @param value the mealPlan
	 */
	public void setMealPlan(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setProperty(ctx, MEALPLAN,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.mealPlan</code> attribute. 
	 * @param value the mealPlan
	 */
	public void setMealPlan(final Set<EnumerationValue> value)
	{
		setMealPlan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.roomCategories</code> attribute.
	 * @return the roomCategories
	 */
	public Set<EnumerationValue> getRoomCategories(final SessionContext ctx)
	{
		Set<EnumerationValue> coll = (Set<EnumerationValue>)getProperty( ctx, ROOMCATEGORIES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.roomCategories</code> attribute.
	 * @return the roomCategories
	 */
	public Set<EnumerationValue> getRoomCategories()
	{
		return getRoomCategories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.roomCategories</code> attribute. 
	 * @param value the roomCategories
	 */
	public void setRoomCategories(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setProperty(ctx, ROOMCATEGORIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.roomCategories</code> attribute. 
	 * @param value the roomCategories
	 */
	public void setRoomCategories(final Set<EnumerationValue> value)
	{
		setRoomCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.roomTypes</code> attribute.
	 * @return the roomTypes
	 */
	public Set<EnumerationValue> getRoomTypes(final SessionContext ctx)
	{
		Set<EnumerationValue> coll = (Set<EnumerationValue>)getProperty( ctx, ROOMTYPES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.roomTypes</code> attribute.
	 * @return the roomTypes
	 */
	public Set<EnumerationValue> getRoomTypes()
	{
		return getRoomTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.roomTypes</code> attribute. 
	 * @param value the roomTypes
	 */
	public void setRoomTypes(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setProperty(ctx, ROOMTYPES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.roomTypes</code> attribute. 
	 * @param value the roomTypes
	 */
	public void setRoomTypes(final Set<EnumerationValue> value)
	{
		setRoomTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STDCOMMISSIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType()
	{
		return getStdCommissionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STDCOMMISSIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final EnumerationValue value)
	{
		setStdCommissionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, STDCOMMISSIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue()
	{
		return getStdCommissionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getStdCommissionValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive()
	{
		return getStdCommissionValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, STDCOMMISSIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final Double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final double value)
	{
		setStdCommissionValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.subType</code> attribute.
	 * @return the subType
	 */
	public EnumerationValue getSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSurchargeSuppDetail.subType</code> attribute.
	 * @return the subType
	 */
	public EnumerationValue getSubType()
	{
		return getSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.subType</code> attribute. 
	 * @param value the subType
	 */
	public void setSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSurchargeSuppDetail.subType</code> attribute. 
	 * @param value the subType
	 */
	public void setSubType(final EnumerationValue value)
	{
		setSubType( getSession().getSessionContext(), value );
	}
	
}
