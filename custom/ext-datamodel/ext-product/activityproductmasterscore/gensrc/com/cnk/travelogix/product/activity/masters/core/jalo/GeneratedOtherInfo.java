/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.OtherInfo OtherInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOtherInfo extends GenericItem
{
	/** Qualifier of the <code>OtherInfo.airCondition</code> attribute **/
	public static final String AIRCONDITION = "airCondition";
	/** Qualifier of the <code>OtherInfo.smokingAllowed</code> attribute **/
	public static final String SMOKINGALLOWED = "smokingAllowed";
	/** Qualifier of the <code>OtherInfo.notesOnSmoking</code> attribute **/
	public static final String NOTESONSMOKING = "notesOnSmoking";
	/** Qualifier of the <code>OtherInfo.alcoholServed</code> attribute **/
	public static final String ALCOHOLSERVED = "alcoholServed";
	/** Qualifier of the <code>OtherInfo.petsAllowed</code> attribute **/
	public static final String PETSALLOWED = "petsAllowed";
	/** Qualifier of the <code>OtherInfo.notesOnPets</code> attribute **/
	public static final String NOTESONPETS = "notesOnPets";
	/** Qualifier of the <code>OtherInfo.childrenAllowed</code> attribute **/
	public static final String CHILDRENALLOWED = "childrenAllowed";
	/** Qualifier of the <code>OtherInfo.notesOnChildren</code> attribute **/
	public static final String NOTESONCHILDREN = "notesOnChildren";
	/** Qualifier of the <code>OtherInfo.seatingCapacity</code> attribute **/
	public static final String SEATINGCAPACITY = "seatingCapacity";
	/** Qualifier of the <code>OtherInfo.drinkOffpremisesAllow</code> attribute **/
	public static final String DRINKOFFPREMISESALLOW = "drinkOffpremisesAllow";
	/** Qualifier of the <code>OtherInfo.corkageApplicable</code> attribute **/
	public static final String CORKAGEAPPLICABLE = "corkageApplicable";
	/** Qualifier of the <code>OtherInfo.ambience</code> attribute **/
	public static final String AMBIENCE = "ambience";
	/** Qualifier of the <code>OtherInfo.theme</code> attribute **/
	public static final String THEME = "theme";
	/** Qualifier of the <code>OtherInfo.cuisineSpeciality</code> attribute **/
	public static final String CUISINESPECIALITY = "cuisineSpeciality";
	/** Qualifier of the <code>OtherInfo.barAndLoungeAvailable</code> attribute **/
	public static final String BARANDLOUNGEAVAILABLE = "barAndLoungeAvailable";
	/** Qualifier of the <code>OtherInfo.noteOnTips</code> attribute **/
	public static final String NOTEONTIPS = "noteOnTips";
	/** Qualifier of the <code>OtherInfo.validAdimissionAllowed</code> attribute **/
	public static final String VALIDADIMISSIONALLOWED = "validAdimissionAllowed";
	/** Qualifier of the <code>OtherInfo.typeOfDining</code> attribute **/
	public static final String TYPEOFDINING = "typeOfDining";
	/** Qualifier of the <code>OtherInfo.style</code> attribute **/
	public static final String STYLE = "style";
	/** Qualifier of the <code>OtherInfo.typeOfService</code> attribute **/
	public static final String TYPEOFSERVICE = "typeOfService";
	/** Qualifier of the <code>OtherInfo.mealType</code> attribute **/
	public static final String MEALTYPE = "mealType";
	/** Qualifier of the <code>OtherInfo.cuisineType</code> attribute **/
	public static final String CUISINETYPE = "cuisineType";
	/** Qualifier of the <code>OtherInfo.menuType</code> attribute **/
	public static final String MENUTYPE = "menuType";
	/** Qualifier of the <code>OtherInfo.foodType</code> attribute **/
	public static final String FOODTYPE = "foodType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AIRCONDITION, AttributeMode.INITIAL);
		tmp.put(SMOKINGALLOWED, AttributeMode.INITIAL);
		tmp.put(NOTESONSMOKING, AttributeMode.INITIAL);
		tmp.put(ALCOHOLSERVED, AttributeMode.INITIAL);
		tmp.put(PETSALLOWED, AttributeMode.INITIAL);
		tmp.put(NOTESONPETS, AttributeMode.INITIAL);
		tmp.put(CHILDRENALLOWED, AttributeMode.INITIAL);
		tmp.put(NOTESONCHILDREN, AttributeMode.INITIAL);
		tmp.put(SEATINGCAPACITY, AttributeMode.INITIAL);
		tmp.put(DRINKOFFPREMISESALLOW, AttributeMode.INITIAL);
		tmp.put(CORKAGEAPPLICABLE, AttributeMode.INITIAL);
		tmp.put(AMBIENCE, AttributeMode.INITIAL);
		tmp.put(THEME, AttributeMode.INITIAL);
		tmp.put(CUISINESPECIALITY, AttributeMode.INITIAL);
		tmp.put(BARANDLOUNGEAVAILABLE, AttributeMode.INITIAL);
		tmp.put(NOTEONTIPS, AttributeMode.INITIAL);
		tmp.put(VALIDADIMISSIONALLOWED, AttributeMode.INITIAL);
		tmp.put(TYPEOFDINING, AttributeMode.INITIAL);
		tmp.put(STYLE, AttributeMode.INITIAL);
		tmp.put(TYPEOFSERVICE, AttributeMode.INITIAL);
		tmp.put(MEALTYPE, AttributeMode.INITIAL);
		tmp.put(CUISINETYPE, AttributeMode.INITIAL);
		tmp.put(MENUTYPE, AttributeMode.INITIAL);
		tmp.put(FOODTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.airCondition</code> attribute.
	 * @return the airCondition - Air Condition.
	 */
	public Boolean isAirCondition(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AIRCONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.airCondition</code> attribute.
	 * @return the airCondition - Air Condition.
	 */
	public Boolean isAirCondition()
	{
		return isAirCondition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.airCondition</code> attribute. 
	 * @return the airCondition - Air Condition.
	 */
	public boolean isAirConditionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAirCondition( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.airCondition</code> attribute. 
	 * @return the airCondition - Air Condition.
	 */
	public boolean isAirConditionAsPrimitive()
	{
		return isAirConditionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.airCondition</code> attribute. 
	 * @param value the airCondition - Air Condition.
	 */
	public void setAirCondition(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AIRCONDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.airCondition</code> attribute. 
	 * @param value the airCondition - Air Condition.
	 */
	public void setAirCondition(final Boolean value)
	{
		setAirCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.airCondition</code> attribute. 
	 * @param value the airCondition - Air Condition.
	 */
	public void setAirCondition(final SessionContext ctx, final boolean value)
	{
		setAirCondition( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.airCondition</code> attribute. 
	 * @param value the airCondition - Air Condition.
	 */
	public void setAirCondition(final boolean value)
	{
		setAirCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.alcoholServed</code> attribute.
	 * @return the alcoholServed - Alcohol Served.
	 */
	public Boolean isAlcoholServed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ALCOHOLSERVED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.alcoholServed</code> attribute.
	 * @return the alcoholServed - Alcohol Served.
	 */
	public Boolean isAlcoholServed()
	{
		return isAlcoholServed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.alcoholServed</code> attribute. 
	 * @return the alcoholServed - Alcohol Served.
	 */
	public boolean isAlcoholServedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAlcoholServed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.alcoholServed</code> attribute. 
	 * @return the alcoholServed - Alcohol Served.
	 */
	public boolean isAlcoholServedAsPrimitive()
	{
		return isAlcoholServedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.alcoholServed</code> attribute. 
	 * @param value the alcoholServed - Alcohol Served.
	 */
	public void setAlcoholServed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ALCOHOLSERVED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.alcoholServed</code> attribute. 
	 * @param value the alcoholServed - Alcohol Served.
	 */
	public void setAlcoholServed(final Boolean value)
	{
		setAlcoholServed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.alcoholServed</code> attribute. 
	 * @param value the alcoholServed - Alcohol Served.
	 */
	public void setAlcoholServed(final SessionContext ctx, final boolean value)
	{
		setAlcoholServed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.alcoholServed</code> attribute. 
	 * @param value the alcoholServed - Alcohol Served.
	 */
	public void setAlcoholServed(final boolean value)
	{
		setAlcoholServed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.ambience</code> attribute.
	 * @return the ambience - Ambience.
	 */
	public String getAmbience(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AMBIENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.ambience</code> attribute.
	 * @return the ambience - Ambience.
	 */
	public String getAmbience()
	{
		return getAmbience( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.ambience</code> attribute. 
	 * @param value the ambience - Ambience.
	 */
	public void setAmbience(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AMBIENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.ambience</code> attribute. 
	 * @param value the ambience - Ambience.
	 */
	public void setAmbience(final String value)
	{
		setAmbience( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.barAndLoungeAvailable</code> attribute.
	 * @return the barAndLoungeAvailable - Bar And Lounge Available.
	 */
	public Boolean isBarAndLoungeAvailable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BARANDLOUNGEAVAILABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.barAndLoungeAvailable</code> attribute.
	 * @return the barAndLoungeAvailable - Bar And Lounge Available.
	 */
	public Boolean isBarAndLoungeAvailable()
	{
		return isBarAndLoungeAvailable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.barAndLoungeAvailable</code> attribute. 
	 * @return the barAndLoungeAvailable - Bar And Lounge Available.
	 */
	public boolean isBarAndLoungeAvailableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBarAndLoungeAvailable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.barAndLoungeAvailable</code> attribute. 
	 * @return the barAndLoungeAvailable - Bar And Lounge Available.
	 */
	public boolean isBarAndLoungeAvailableAsPrimitive()
	{
		return isBarAndLoungeAvailableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.barAndLoungeAvailable</code> attribute. 
	 * @param value the barAndLoungeAvailable - Bar And Lounge Available.
	 */
	public void setBarAndLoungeAvailable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BARANDLOUNGEAVAILABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.barAndLoungeAvailable</code> attribute. 
	 * @param value the barAndLoungeAvailable - Bar And Lounge Available.
	 */
	public void setBarAndLoungeAvailable(final Boolean value)
	{
		setBarAndLoungeAvailable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.barAndLoungeAvailable</code> attribute. 
	 * @param value the barAndLoungeAvailable - Bar And Lounge Available.
	 */
	public void setBarAndLoungeAvailable(final SessionContext ctx, final boolean value)
	{
		setBarAndLoungeAvailable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.barAndLoungeAvailable</code> attribute. 
	 * @param value the barAndLoungeAvailable - Bar And Lounge Available.
	 */
	public void setBarAndLoungeAvailable(final boolean value)
	{
		setBarAndLoungeAvailable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.childrenAllowed</code> attribute.
	 * @return the childrenAllowed - Children Allowed.
	 */
	public Boolean isChildrenAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CHILDRENALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.childrenAllowed</code> attribute.
	 * @return the childrenAllowed - Children Allowed.
	 */
	public Boolean isChildrenAllowed()
	{
		return isChildrenAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.childrenAllowed</code> attribute. 
	 * @return the childrenAllowed - Children Allowed.
	 */
	public boolean isChildrenAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isChildrenAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.childrenAllowed</code> attribute. 
	 * @return the childrenAllowed - Children Allowed.
	 */
	public boolean isChildrenAllowedAsPrimitive()
	{
		return isChildrenAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.childrenAllowed</code> attribute. 
	 * @param value the childrenAllowed - Children Allowed.
	 */
	public void setChildrenAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CHILDRENALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.childrenAllowed</code> attribute. 
	 * @param value the childrenAllowed - Children Allowed.
	 */
	public void setChildrenAllowed(final Boolean value)
	{
		setChildrenAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.childrenAllowed</code> attribute. 
	 * @param value the childrenAllowed - Children Allowed.
	 */
	public void setChildrenAllowed(final SessionContext ctx, final boolean value)
	{
		setChildrenAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.childrenAllowed</code> attribute. 
	 * @param value the childrenAllowed - Children Allowed.
	 */
	public void setChildrenAllowed(final boolean value)
	{
		setChildrenAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.corkageApplicable</code> attribute.
	 * @return the corkageApplicable - Corkage Applicable.
	 */
	public Boolean isCorkageApplicable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CORKAGEAPPLICABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.corkageApplicable</code> attribute.
	 * @return the corkageApplicable - Corkage Applicable.
	 */
	public Boolean isCorkageApplicable()
	{
		return isCorkageApplicable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.corkageApplicable</code> attribute. 
	 * @return the corkageApplicable - Corkage Applicable.
	 */
	public boolean isCorkageApplicableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCorkageApplicable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.corkageApplicable</code> attribute. 
	 * @return the corkageApplicable - Corkage Applicable.
	 */
	public boolean isCorkageApplicableAsPrimitive()
	{
		return isCorkageApplicableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.corkageApplicable</code> attribute. 
	 * @param value the corkageApplicable - Corkage Applicable.
	 */
	public void setCorkageApplicable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CORKAGEAPPLICABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.corkageApplicable</code> attribute. 
	 * @param value the corkageApplicable - Corkage Applicable.
	 */
	public void setCorkageApplicable(final Boolean value)
	{
		setCorkageApplicable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.corkageApplicable</code> attribute. 
	 * @param value the corkageApplicable - Corkage Applicable.
	 */
	public void setCorkageApplicable(final SessionContext ctx, final boolean value)
	{
		setCorkageApplicable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.corkageApplicable</code> attribute. 
	 * @param value the corkageApplicable - Corkage Applicable.
	 */
	public void setCorkageApplicable(final boolean value)
	{
		setCorkageApplicable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.cuisineSpeciality</code> attribute.
	 * @return the cuisineSpeciality - Cuisine Speciality
	 */
	public EnumerationValue getCuisineSpeciality(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CUISINESPECIALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.cuisineSpeciality</code> attribute.
	 * @return the cuisineSpeciality - Cuisine Speciality
	 */
	public EnumerationValue getCuisineSpeciality()
	{
		return getCuisineSpeciality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.cuisineSpeciality</code> attribute. 
	 * @param value the cuisineSpeciality - Cuisine Speciality
	 */
	public void setCuisineSpeciality(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CUISINESPECIALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.cuisineSpeciality</code> attribute. 
	 * @param value the cuisineSpeciality - Cuisine Speciality
	 */
	public void setCuisineSpeciality(final EnumerationValue value)
	{
		setCuisineSpeciality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.cuisineType</code> attribute.
	 * @return the cuisineType - Cousine Type
	 */
	public EnumerationValue getCuisineType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CUISINETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.cuisineType</code> attribute.
	 * @return the cuisineType - Cousine Type
	 */
	public EnumerationValue getCuisineType()
	{
		return getCuisineType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.cuisineType</code> attribute. 
	 * @param value the cuisineType - Cousine Type
	 */
	public void setCuisineType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CUISINETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.cuisineType</code> attribute. 
	 * @param value the cuisineType - Cousine Type
	 */
	public void setCuisineType(final EnumerationValue value)
	{
		setCuisineType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.drinkOffpremisesAllow</code> attribute.
	 * @return the drinkOffpremisesAllow - Drink Off premises Allow.
	 */
	public Boolean isDrinkOffpremisesAllow(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DRINKOFFPREMISESALLOW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.drinkOffpremisesAllow</code> attribute.
	 * @return the drinkOffpremisesAllow - Drink Off premises Allow.
	 */
	public Boolean isDrinkOffpremisesAllow()
	{
		return isDrinkOffpremisesAllow( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.drinkOffpremisesAllow</code> attribute. 
	 * @return the drinkOffpremisesAllow - Drink Off premises Allow.
	 */
	public boolean isDrinkOffpremisesAllowAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDrinkOffpremisesAllow( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.drinkOffpremisesAllow</code> attribute. 
	 * @return the drinkOffpremisesAllow - Drink Off premises Allow.
	 */
	public boolean isDrinkOffpremisesAllowAsPrimitive()
	{
		return isDrinkOffpremisesAllowAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.drinkOffpremisesAllow</code> attribute. 
	 * @param value the drinkOffpremisesAllow - Drink Off premises Allow.
	 */
	public void setDrinkOffpremisesAllow(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DRINKOFFPREMISESALLOW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.drinkOffpremisesAllow</code> attribute. 
	 * @param value the drinkOffpremisesAllow - Drink Off premises Allow.
	 */
	public void setDrinkOffpremisesAllow(final Boolean value)
	{
		setDrinkOffpremisesAllow( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.drinkOffpremisesAllow</code> attribute. 
	 * @param value the drinkOffpremisesAllow - Drink Off premises Allow.
	 */
	public void setDrinkOffpremisesAllow(final SessionContext ctx, final boolean value)
	{
		setDrinkOffpremisesAllow( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.drinkOffpremisesAllow</code> attribute. 
	 * @param value the drinkOffpremisesAllow - Drink Off premises Allow.
	 */
	public void setDrinkOffpremisesAllow(final boolean value)
	{
		setDrinkOffpremisesAllow( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.foodType</code> attribute.
	 * @return the foodType - Food Type
	 */
	public EnumerationValue getFoodType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FOODTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.foodType</code> attribute.
	 * @return the foodType - Food Type
	 */
	public EnumerationValue getFoodType()
	{
		return getFoodType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.foodType</code> attribute. 
	 * @param value the foodType - Food Type
	 */
	public void setFoodType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FOODTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.foodType</code> attribute. 
	 * @param value the foodType - Food Type
	 */
	public void setFoodType(final EnumerationValue value)
	{
		setFoodType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.mealType</code> attribute.
	 * @return the mealType - Meal Type
	 */
	public EnumerationValue getMealType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.mealType</code> attribute.
	 * @return the mealType - Meal Type
	 */
	public EnumerationValue getMealType()
	{
		return getMealType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.mealType</code> attribute. 
	 * @param value the mealType - Meal Type
	 */
	public void setMealType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.mealType</code> attribute. 
	 * @param value the mealType - Meal Type
	 */
	public void setMealType(final EnumerationValue value)
	{
		setMealType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.menuType</code> attribute.
	 * @return the menuType - Menu Type
	 */
	public EnumerationValue getMenuType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MENUTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.menuType</code> attribute.
	 * @return the menuType - Menu Type
	 */
	public EnumerationValue getMenuType()
	{
		return getMenuType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.menuType</code> attribute. 
	 * @param value the menuType - Menu Type
	 */
	public void setMenuType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MENUTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.menuType</code> attribute. 
	 * @param value the menuType - Menu Type
	 */
	public void setMenuType(final EnumerationValue value)
	{
		setMenuType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.noteOnTips</code> attribute.
	 * @return the noteOnTips - Note On Tips.
	 */
	public String getNoteOnTips(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTEONTIPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.noteOnTips</code> attribute.
	 * @return the noteOnTips - Note On Tips.
	 */
	public String getNoteOnTips()
	{
		return getNoteOnTips( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.noteOnTips</code> attribute. 
	 * @param value the noteOnTips - Note On Tips.
	 */
	public void setNoteOnTips(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTEONTIPS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.noteOnTips</code> attribute. 
	 * @param value the noteOnTips - Note On Tips.
	 */
	public void setNoteOnTips(final String value)
	{
		setNoteOnTips( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.notesOnChildren</code> attribute.
	 * @return the notesOnChildren - Notes On Children.
	 */
	public String getNotesOnChildren(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTESONCHILDREN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.notesOnChildren</code> attribute.
	 * @return the notesOnChildren - Notes On Children.
	 */
	public String getNotesOnChildren()
	{
		return getNotesOnChildren( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.notesOnChildren</code> attribute. 
	 * @param value the notesOnChildren - Notes On Children.
	 */
	public void setNotesOnChildren(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTESONCHILDREN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.notesOnChildren</code> attribute. 
	 * @param value the notesOnChildren - Notes On Children.
	 */
	public void setNotesOnChildren(final String value)
	{
		setNotesOnChildren( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.notesOnPets</code> attribute.
	 * @return the notesOnPets - Notes On Pets.
	 */
	public String getNotesOnPets(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTESONPETS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.notesOnPets</code> attribute.
	 * @return the notesOnPets - Notes On Pets.
	 */
	public String getNotesOnPets()
	{
		return getNotesOnPets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.notesOnPets</code> attribute. 
	 * @param value the notesOnPets - Notes On Pets.
	 */
	public void setNotesOnPets(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTESONPETS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.notesOnPets</code> attribute. 
	 * @param value the notesOnPets - Notes On Pets.
	 */
	public void setNotesOnPets(final String value)
	{
		setNotesOnPets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.notesOnSmoking</code> attribute.
	 * @return the notesOnSmoking - Notes On Smoking.
	 */
	public String getNotesOnSmoking(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTESONSMOKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.notesOnSmoking</code> attribute.
	 * @return the notesOnSmoking - Notes On Smoking.
	 */
	public String getNotesOnSmoking()
	{
		return getNotesOnSmoking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.notesOnSmoking</code> attribute. 
	 * @param value the notesOnSmoking - Notes On Smoking.
	 */
	public void setNotesOnSmoking(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTESONSMOKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.notesOnSmoking</code> attribute. 
	 * @param value the notesOnSmoking - Notes On Smoking.
	 */
	public void setNotesOnSmoking(final String value)
	{
		setNotesOnSmoking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.petsAllowed</code> attribute.
	 * @return the petsAllowed - Pets Allowed.
	 */
	public Boolean isPetsAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PETSALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.petsAllowed</code> attribute.
	 * @return the petsAllowed - Pets Allowed.
	 */
	public Boolean isPetsAllowed()
	{
		return isPetsAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.petsAllowed</code> attribute. 
	 * @return the petsAllowed - Pets Allowed.
	 */
	public boolean isPetsAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPetsAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.petsAllowed</code> attribute. 
	 * @return the petsAllowed - Pets Allowed.
	 */
	public boolean isPetsAllowedAsPrimitive()
	{
		return isPetsAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.petsAllowed</code> attribute. 
	 * @param value the petsAllowed - Pets Allowed.
	 */
	public void setPetsAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PETSALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.petsAllowed</code> attribute. 
	 * @param value the petsAllowed - Pets Allowed.
	 */
	public void setPetsAllowed(final Boolean value)
	{
		setPetsAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.petsAllowed</code> attribute. 
	 * @param value the petsAllowed - Pets Allowed.
	 */
	public void setPetsAllowed(final SessionContext ctx, final boolean value)
	{
		setPetsAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.petsAllowed</code> attribute. 
	 * @param value the petsAllowed - Pets Allowed.
	 */
	public void setPetsAllowed(final boolean value)
	{
		setPetsAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.seatingCapacity</code> attribute.
	 * @return the seatingCapacity - Seating Capacity.
	 */
	public String getSeatingCapacity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEATINGCAPACITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.seatingCapacity</code> attribute.
	 * @return the seatingCapacity - Seating Capacity.
	 */
	public String getSeatingCapacity()
	{
		return getSeatingCapacity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.seatingCapacity</code> attribute. 
	 * @param value the seatingCapacity - Seating Capacity.
	 */
	public void setSeatingCapacity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEATINGCAPACITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.seatingCapacity</code> attribute. 
	 * @param value the seatingCapacity - Seating Capacity.
	 */
	public void setSeatingCapacity(final String value)
	{
		setSeatingCapacity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.smokingAllowed</code> attribute.
	 * @return the smokingAllowed - smoking Allowed
	 */
	public Boolean isSmokingAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SMOKINGALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.smokingAllowed</code> attribute.
	 * @return the smokingAllowed - smoking Allowed
	 */
	public Boolean isSmokingAllowed()
	{
		return isSmokingAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.smokingAllowed</code> attribute. 
	 * @return the smokingAllowed - smoking Allowed
	 */
	public boolean isSmokingAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSmokingAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.smokingAllowed</code> attribute. 
	 * @return the smokingAllowed - smoking Allowed
	 */
	public boolean isSmokingAllowedAsPrimitive()
	{
		return isSmokingAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.smokingAllowed</code> attribute. 
	 * @param value the smokingAllowed - smoking Allowed
	 */
	public void setSmokingAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SMOKINGALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.smokingAllowed</code> attribute. 
	 * @param value the smokingAllowed - smoking Allowed
	 */
	public void setSmokingAllowed(final Boolean value)
	{
		setSmokingAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.smokingAllowed</code> attribute. 
	 * @param value the smokingAllowed - smoking Allowed
	 */
	public void setSmokingAllowed(final SessionContext ctx, final boolean value)
	{
		setSmokingAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.smokingAllowed</code> attribute. 
	 * @param value the smokingAllowed - smoking Allowed
	 */
	public void setSmokingAllowed(final boolean value)
	{
		setSmokingAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.style</code> attribute.
	 * @return the style - Style
	 */
	public EnumerationValue getStyle(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STYLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.style</code> attribute.
	 * @return the style - Style
	 */
	public EnumerationValue getStyle()
	{
		return getStyle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.style</code> attribute. 
	 * @param value the style - Style
	 */
	public void setStyle(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STYLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.style</code> attribute. 
	 * @param value the style - Style
	 */
	public void setStyle(final EnumerationValue value)
	{
		setStyle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.theme</code> attribute.
	 * @return the theme - Theme.
	 */
	public EnumerationValue getTheme(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THEME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.theme</code> attribute.
	 * @return the theme - Theme.
	 */
	public EnumerationValue getTheme()
	{
		return getTheme( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.theme</code> attribute. 
	 * @param value the theme - Theme.
	 */
	public void setTheme(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THEME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.theme</code> attribute. 
	 * @param value the theme - Theme.
	 */
	public void setTheme(final EnumerationValue value)
	{
		setTheme( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.typeOfDining</code> attribute.
	 * @return the typeOfDining - Type Of Dining.
	 */
	public EnumerationValue getTypeOfDining(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFDINING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.typeOfDining</code> attribute.
	 * @return the typeOfDining - Type Of Dining.
	 */
	public EnumerationValue getTypeOfDining()
	{
		return getTypeOfDining( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.typeOfDining</code> attribute. 
	 * @param value the typeOfDining - Type Of Dining.
	 */
	public void setTypeOfDining(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFDINING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.typeOfDining</code> attribute. 
	 * @param value the typeOfDining - Type Of Dining.
	 */
	public void setTypeOfDining(final EnumerationValue value)
	{
		setTypeOfDining( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.typeOfService</code> attribute.
	 * @return the typeOfService - Type Of Service
	 */
	public EnumerationValue getTypeOfService(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFSERVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.typeOfService</code> attribute.
	 * @return the typeOfService - Type Of Service
	 */
	public EnumerationValue getTypeOfService()
	{
		return getTypeOfService( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.typeOfService</code> attribute. 
	 * @param value the typeOfService - Type Of Service
	 */
	public void setTypeOfService(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFSERVICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.typeOfService</code> attribute. 
	 * @param value the typeOfService - Type Of Service
	 */
	public void setTypeOfService(final EnumerationValue value)
	{
		setTypeOfService( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.validAdimissionAllowed</code> attribute.
	 * @return the validAdimissionAllowed - Valid Adimission Allowed.
	 */
	public Boolean isValidAdimissionAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, VALIDADIMISSIONALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.validAdimissionAllowed</code> attribute.
	 * @return the validAdimissionAllowed - Valid Adimission Allowed.
	 */
	public Boolean isValidAdimissionAllowed()
	{
		return isValidAdimissionAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.validAdimissionAllowed</code> attribute. 
	 * @return the validAdimissionAllowed - Valid Adimission Allowed.
	 */
	public boolean isValidAdimissionAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isValidAdimissionAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherInfo.validAdimissionAllowed</code> attribute. 
	 * @return the validAdimissionAllowed - Valid Adimission Allowed.
	 */
	public boolean isValidAdimissionAllowedAsPrimitive()
	{
		return isValidAdimissionAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.validAdimissionAllowed</code> attribute. 
	 * @param value the validAdimissionAllowed - Valid Adimission Allowed.
	 */
	public void setValidAdimissionAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, VALIDADIMISSIONALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.validAdimissionAllowed</code> attribute. 
	 * @param value the validAdimissionAllowed - Valid Adimission Allowed.
	 */
	public void setValidAdimissionAllowed(final Boolean value)
	{
		setValidAdimissionAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.validAdimissionAllowed</code> attribute. 
	 * @param value the validAdimissionAllowed - Valid Adimission Allowed.
	 */
	public void setValidAdimissionAllowed(final SessionContext ctx, final boolean value)
	{
		setValidAdimissionAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherInfo.validAdimissionAllowed</code> attribute. 
	 * @param value the validAdimissionAllowed - Valid Adimission Allowed.
	 */
	public void setValidAdimissionAllowed(final boolean value)
	{
		setValidAdimissionAllowed( getSession().getSessionContext(), value );
	}
	
}
