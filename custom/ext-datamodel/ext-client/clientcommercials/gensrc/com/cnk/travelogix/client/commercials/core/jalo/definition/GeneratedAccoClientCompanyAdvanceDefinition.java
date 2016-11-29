/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.commercials.core.jalo.definition;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.client.commercials.core.jalo.definition.AbstractClientCompanyAdvanceDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.commercials.core.jalo.definition.AccoClientCompanyAdvanceDefinition AccoClientCompanyAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoClientCompanyAdvanceDefinition extends AbstractClientCompanyAdvanceDefinition
{
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.inclusion</code> attribute **/
	public static final String INCLUSION = "inclusion";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.roomLevelInclusion</code> attribute **/
	public static final String ROOMLEVELINCLUSION = "roomLevelInclusion";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.starCategoryInclusion</code> attribute **/
	public static final String STARCATEGORYINCLUSION = "starCategoryInclusion";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.starCategory</code> attribute **/
	public static final String STARCATEGORY = "starCategory";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.maxNight</code> attribute **/
	public static final String MAXNIGHT = "maxNight";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.minNight</code> attribute **/
	public static final String MINNIGHT = "minNight";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.maxPassangers</code> attribute **/
	public static final String MAXPASSANGERS = "maxPassangers";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.minPassangers</code> attribute **/
	public static final String MINPASSANGERS = "minPassangers";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.ismealPlanInclusion</code> attribute **/
	public static final String ISMEALPLANINCLUSION = "ismealPlanInclusion";
	/** Qualifier of the <code>AccoClientCompanyAdvanceDefinition.mealPlan</code> attribute **/
	public static final String MEALPLAN = "mealPlan";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractClientCompanyAdvanceDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(INCLUSION, AttributeMode.INITIAL);
		tmp.put(ROOMLEVELINCLUSION, AttributeMode.INITIAL);
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(STARCATEGORYINCLUSION, AttributeMode.INITIAL);
		tmp.put(STARCATEGORY, AttributeMode.INITIAL);
		tmp.put(MAXNIGHT, AttributeMode.INITIAL);
		tmp.put(MINNIGHT, AttributeMode.INITIAL);
		tmp.put(MAXPASSANGERS, AttributeMode.INITIAL);
		tmp.put(MINPASSANGERS, AttributeMode.INITIAL);
		tmp.put(ISMEALPLANINCLUSION, AttributeMode.INITIAL);
		tmp.put(MEALPLAN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Boolean isInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Boolean isInclusion()
	{
		return isInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.inclusion</code> attribute. 
	 * @return the inclusion
	 */
	public boolean isInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.inclusion</code> attribute. 
	 * @return the inclusion
	 */
	public boolean isInclusionAsPrimitive()
	{
		return isInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final Boolean value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final boolean value)
	{
		setInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final boolean value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.ismealPlanInclusion</code> attribute.
	 * @return the ismealPlanInclusion
	 */
	public Boolean isIsmealPlanInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISMEALPLANINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.ismealPlanInclusion</code> attribute.
	 * @return the ismealPlanInclusion
	 */
	public Boolean isIsmealPlanInclusion()
	{
		return isIsmealPlanInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.ismealPlanInclusion</code> attribute. 
	 * @return the ismealPlanInclusion
	 */
	public boolean isIsmealPlanInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsmealPlanInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.ismealPlanInclusion</code> attribute. 
	 * @return the ismealPlanInclusion
	 */
	public boolean isIsmealPlanInclusionAsPrimitive()
	{
		return isIsmealPlanInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.ismealPlanInclusion</code> attribute. 
	 * @param value the ismealPlanInclusion
	 */
	public void setIsmealPlanInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISMEALPLANINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.ismealPlanInclusion</code> attribute. 
	 * @param value the ismealPlanInclusion
	 */
	public void setIsmealPlanInclusion(final Boolean value)
	{
		setIsmealPlanInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.ismealPlanInclusion</code> attribute. 
	 * @param value the ismealPlanInclusion
	 */
	public void setIsmealPlanInclusion(final SessionContext ctx, final boolean value)
	{
		setIsmealPlanInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.ismealPlanInclusion</code> attribute. 
	 * @param value the ismealPlanInclusion
	 */
	public void setIsmealPlanInclusion(final boolean value)
	{
		setIsmealPlanInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.maxNight</code> attribute.
	 * @return the maxNight
	 */
	public Integer getMaxNight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.maxNight</code> attribute.
	 * @return the maxNight
	 */
	public Integer getMaxNight()
	{
		return getMaxNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.maxNight</code> attribute. 
	 * @return the maxNight
	 */
	public int getMaxNightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxNight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.maxNight</code> attribute. 
	 * @return the maxNight
	 */
	public int getMaxNightAsPrimitive()
	{
		return getMaxNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.maxNight</code> attribute. 
	 * @param value the maxNight
	 */
	public void setMaxNight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.maxNight</code> attribute. 
	 * @param value the maxNight
	 */
	public void setMaxNight(final Integer value)
	{
		setMaxNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.maxNight</code> attribute. 
	 * @param value the maxNight
	 */
	public void setMaxNight(final SessionContext ctx, final int value)
	{
		setMaxNight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.maxNight</code> attribute. 
	 * @param value the maxNight
	 */
	public void setMaxNight(final int value)
	{
		setMaxNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.maxPassangers</code> attribute.
	 * @return the maxPassangers
	 */
	public Integer getMaxPassangers(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPASSANGERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.maxPassangers</code> attribute.
	 * @return the maxPassangers
	 */
	public Integer getMaxPassangers()
	{
		return getMaxPassangers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.maxPassangers</code> attribute. 
	 * @return the maxPassangers
	 */
	public int getMaxPassangersAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxPassangers( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.maxPassangers</code> attribute. 
	 * @return the maxPassangers
	 */
	public int getMaxPassangersAsPrimitive()
	{
		return getMaxPassangersAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.maxPassangers</code> attribute. 
	 * @param value the maxPassangers
	 */
	public void setMaxPassangers(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPASSANGERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.maxPassangers</code> attribute. 
	 * @param value the maxPassangers
	 */
	public void setMaxPassangers(final Integer value)
	{
		setMaxPassangers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.maxPassangers</code> attribute. 
	 * @param value the maxPassangers
	 */
	public void setMaxPassangers(final SessionContext ctx, final int value)
	{
		setMaxPassangers( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.maxPassangers</code> attribute. 
	 * @param value the maxPassangers
	 */
	public void setMaxPassangers(final int value)
	{
		setMaxPassangers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.mealPlan</code> attribute.
	 * @return the mealPlan
	 */
	public List<EnumerationValue> getMealPlan(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, MEALPLAN);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.mealPlan</code> attribute.
	 * @return the mealPlan
	 */
	public List<EnumerationValue> getMealPlan()
	{
		return getMealPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.mealPlan</code> attribute. 
	 * @param value the mealPlan
	 */
	public void setMealPlan(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, MEALPLAN,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.mealPlan</code> attribute. 
	 * @param value the mealPlan
	 */
	public void setMealPlan(final List<EnumerationValue> value)
	{
		setMealPlan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.minNight</code> attribute.
	 * @return the minNight
	 */
	public Integer getMinNight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.minNight</code> attribute.
	 * @return the minNight
	 */
	public Integer getMinNight()
	{
		return getMinNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.minNight</code> attribute. 
	 * @return the minNight
	 */
	public int getMinNightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinNight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.minNight</code> attribute. 
	 * @return the minNight
	 */
	public int getMinNightAsPrimitive()
	{
		return getMinNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.minNight</code> attribute. 
	 * @param value the minNight
	 */
	public void setMinNight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.minNight</code> attribute. 
	 * @param value the minNight
	 */
	public void setMinNight(final Integer value)
	{
		setMinNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.minNight</code> attribute. 
	 * @param value the minNight
	 */
	public void setMinNight(final SessionContext ctx, final int value)
	{
		setMinNight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.minNight</code> attribute. 
	 * @param value the minNight
	 */
	public void setMinNight(final int value)
	{
		setMinNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.minPassangers</code> attribute.
	 * @return the minPassangers
	 */
	public Integer getMinPassangers(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINPASSANGERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.minPassangers</code> attribute.
	 * @return the minPassangers
	 */
	public Integer getMinPassangers()
	{
		return getMinPassangers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.minPassangers</code> attribute. 
	 * @return the minPassangers
	 */
	public int getMinPassangersAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinPassangers( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.minPassangers</code> attribute. 
	 * @return the minPassangers
	 */
	public int getMinPassangersAsPrimitive()
	{
		return getMinPassangersAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.minPassangers</code> attribute. 
	 * @param value the minPassangers
	 */
	public void setMinPassangers(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINPASSANGERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.minPassangers</code> attribute. 
	 * @param value the minPassangers
	 */
	public void setMinPassangers(final Integer value)
	{
		setMinPassangers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.minPassangers</code> attribute. 
	 * @param value the minPassangers
	 */
	public void setMinPassangers(final SessionContext ctx, final int value)
	{
		setMinPassangers( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.minPassangers</code> attribute. 
	 * @param value the minPassangers
	 */
	public void setMinPassangers(final int value)
	{
		setMinPassangers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public List<EnumerationValue> getRoomCategory(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, ROOMCATEGORY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public List<EnumerationValue> getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, ROOMCATEGORY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final List<EnumerationValue> value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.roomLevelInclusion</code> attribute.
	 * @return the roomLevelInclusion
	 */
	public Boolean isRoomLevelInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ROOMLEVELINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.roomLevelInclusion</code> attribute.
	 * @return the roomLevelInclusion
	 */
	public Boolean isRoomLevelInclusion()
	{
		return isRoomLevelInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.roomLevelInclusion</code> attribute. 
	 * @return the roomLevelInclusion
	 */
	public boolean isRoomLevelInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRoomLevelInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.roomLevelInclusion</code> attribute. 
	 * @return the roomLevelInclusion
	 */
	public boolean isRoomLevelInclusionAsPrimitive()
	{
		return isRoomLevelInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.roomLevelInclusion</code> attribute. 
	 * @param value the roomLevelInclusion
	 */
	public void setRoomLevelInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ROOMLEVELINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.roomLevelInclusion</code> attribute. 
	 * @param value the roomLevelInclusion
	 */
	public void setRoomLevelInclusion(final Boolean value)
	{
		setRoomLevelInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.roomLevelInclusion</code> attribute. 
	 * @param value the roomLevelInclusion
	 */
	public void setRoomLevelInclusion(final SessionContext ctx, final boolean value)
	{
		setRoomLevelInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.roomLevelInclusion</code> attribute. 
	 * @param value the roomLevelInclusion
	 */
	public void setRoomLevelInclusion(final boolean value)
	{
		setRoomLevelInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.roomType</code> attribute.
	 * @return the roomType
	 */
	public List<EnumerationValue> getRoomType(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, ROOMTYPE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.roomType</code> attribute.
	 * @return the roomType
	 */
	public List<EnumerationValue> getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, ROOMTYPE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final List<EnumerationValue> value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.starCategory</code> attribute.
	 * @return the starCategory
	 */
	public List<EnumerationValue> getStarCategory(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, STARCATEGORY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.starCategory</code> attribute.
	 * @return the starCategory
	 */
	public List<EnumerationValue> getStarCategory()
	{
		return getStarCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.starCategory</code> attribute. 
	 * @param value the starCategory
	 */
	public void setStarCategory(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, STARCATEGORY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.starCategory</code> attribute. 
	 * @param value the starCategory
	 */
	public void setStarCategory(final List<EnumerationValue> value)
	{
		setStarCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.starCategoryInclusion</code> attribute.
	 * @return the starCategoryInclusion
	 */
	public Boolean isStarCategoryInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STARCATEGORYINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.starCategoryInclusion</code> attribute.
	 * @return the starCategoryInclusion
	 */
	public Boolean isStarCategoryInclusion()
	{
		return isStarCategoryInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.starCategoryInclusion</code> attribute. 
	 * @return the starCategoryInclusion
	 */
	public boolean isStarCategoryInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStarCategoryInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoClientCompanyAdvanceDefinition.starCategoryInclusion</code> attribute. 
	 * @return the starCategoryInclusion
	 */
	public boolean isStarCategoryInclusionAsPrimitive()
	{
		return isStarCategoryInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.starCategoryInclusion</code> attribute. 
	 * @param value the starCategoryInclusion
	 */
	public void setStarCategoryInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STARCATEGORYINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.starCategoryInclusion</code> attribute. 
	 * @param value the starCategoryInclusion
	 */
	public void setStarCategoryInclusion(final Boolean value)
	{
		setStarCategoryInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.starCategoryInclusion</code> attribute. 
	 * @param value the starCategoryInclusion
	 */
	public void setStarCategoryInclusion(final SessionContext ctx, final boolean value)
	{
		setStarCategoryInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoClientCompanyAdvanceDefinition.starCategoryInclusion</code> attribute. 
	 * @param value the starCategoryInclusion
	 */
	public void setStarCategoryInclusion(final boolean value)
	{
		setStarCategoryInclusion( getSession().getSessionContext(), value );
	}
	
}
