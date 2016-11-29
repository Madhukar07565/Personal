/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.DiningInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.MealInfo MealInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMealInfo extends GenericItem
{
	/** Qualifier of the <code>MealInfo.mealType</code> attribute **/
	public static final String MEALTYPE = "mealType";
	/** Qualifier of the <code>MealInfo.menuName</code> attribute **/
	public static final String MENUNAME = "menuName";
	/** Qualifier of the <code>MealInfo.menuItemName</code> attribute **/
	public static final String MENUITEMNAME = "menuItemName";
	/** Qualifier of the <code>MealInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>MealInfo.menuValidity</code> attribute **/
	public static final String MENUVALIDITY = "menuValidity";
	/** Qualifier of the <code>MealInfo.media</code> attribute **/
	public static final String MEDIA = "media";
	/** Qualifier of the <code>MealInfo.spiceLevel</code> attribute **/
	public static final String SPICELEVEL = "spiceLevel";
	/** Qualifier of the <code>MealInfo.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>MealInfo.timeFrom</code> attribute **/
	public static final String TIMEFROM = "timeFrom";
	/** Qualifier of the <code>MealInfo.timeTo</code> attribute **/
	public static final String TIMETO = "timeTo";
	/** Qualifier of the <code>MealInfo.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>MealInfo.typeOfService</code> attribute **/
	public static final String TYPEOFSERVICE = "typeOfService";
	/** Qualifier of the <code>MealInfo.cuisineType</code> attribute **/
	public static final String CUISINETYPE = "cuisineType";
	/** Qualifier of the <code>MealInfo.foodType</code> attribute **/
	public static final String FOODTYPE = "foodType";
	/** Qualifier of the <code>MealInfo.chefRecommended</code> attribute **/
	public static final String CHEFRECOMMENDED = "chefRecommended";
	/** Qualifier of the <code>MealInfo.restaurant</code> attribute **/
	public static final String RESTAURANT = "restaurant";
	/** Qualifier of the <code>MealInfo.diningInfo</code> attribute **/
	public static final String DININGINFO = "diningInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RESTAURANT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMealInfo> RESTAURANTHANDLER = new BidirectionalOneToManyHandler<GeneratedMealInfo>(
	ActivityproductmasterscoreConstants.TC.MEALINFO,
	false,
	"restaurant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DININGINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMealInfo> DININGINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedMealInfo>(
	ActivityproductmasterscoreConstants.TC.MEALINFO,
	false,
	"diningInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MEALTYPE, AttributeMode.INITIAL);
		tmp.put(MENUNAME, AttributeMode.INITIAL);
		tmp.put(MENUITEMNAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(MENUVALIDITY, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		tmp.put(SPICELEVEL, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(TIMEFROM, AttributeMode.INITIAL);
		tmp.put(TIMETO, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(TYPEOFSERVICE, AttributeMode.INITIAL);
		tmp.put(CUISINETYPE, AttributeMode.INITIAL);
		tmp.put(FOODTYPE, AttributeMode.INITIAL);
		tmp.put(CHEFRECOMMENDED, AttributeMode.INITIAL);
		tmp.put(RESTAURANT, AttributeMode.INITIAL);
		tmp.put(DININGINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.chefRecommended</code> attribute.
	 * @return the chefRecommended - Chef Recommended.
	 */
	public Boolean isChefRecommended(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CHEFRECOMMENDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.chefRecommended</code> attribute.
	 * @return the chefRecommended - Chef Recommended.
	 */
	public Boolean isChefRecommended()
	{
		return isChefRecommended( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.chefRecommended</code> attribute. 
	 * @return the chefRecommended - Chef Recommended.
	 */
	public boolean isChefRecommendedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isChefRecommended( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.chefRecommended</code> attribute. 
	 * @return the chefRecommended - Chef Recommended.
	 */
	public boolean isChefRecommendedAsPrimitive()
	{
		return isChefRecommendedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.chefRecommended</code> attribute. 
	 * @param value the chefRecommended - Chef Recommended.
	 */
	public void setChefRecommended(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CHEFRECOMMENDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.chefRecommended</code> attribute. 
	 * @param value the chefRecommended - Chef Recommended.
	 */
	public void setChefRecommended(final Boolean value)
	{
		setChefRecommended( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.chefRecommended</code> attribute. 
	 * @param value the chefRecommended - Chef Recommended.
	 */
	public void setChefRecommended(final SessionContext ctx, final boolean value)
	{
		setChefRecommended( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.chefRecommended</code> attribute. 
	 * @param value the chefRecommended - Chef Recommended.
	 */
	public void setChefRecommended(final boolean value)
	{
		setChefRecommended( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RESTAURANTHANDLER.newInstance(ctx, allAttributes);
		DININGINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.cuisineType</code> attribute.
	 * @return the cuisineType - Cuisine Type
	 */
	public EnumerationValue getCuisineType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CUISINETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.cuisineType</code> attribute.
	 * @return the cuisineType - Cuisine Type
	 */
	public EnumerationValue getCuisineType()
	{
		return getCuisineType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.cuisineType</code> attribute. 
	 * @param value the cuisineType - Cuisine Type
	 */
	public void setCuisineType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CUISINETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.cuisineType</code> attribute. 
	 * @param value the cuisineType - Cuisine Type
	 */
	public void setCuisineType(final EnumerationValue value)
	{
		setCuisineType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - Days Of Week.
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - Days Of Week.
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - Days Of Week.
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - Days Of Week.
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.description</code> attribute.
	 * @return the description - Description.
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMealInfo.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.description</code> attribute.
	 * @return the description - Description.
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.description</code> attribute. 
	 * @return the localized description - Description.
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.description</code> attribute. 
	 * @return the localized description - Description.
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMealInfo.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.diningInfo</code> attribute.
	 * @return the diningInfo
	 */
	public DiningInfo getDiningInfo(final SessionContext ctx)
	{
		return (DiningInfo)getProperty( ctx, DININGINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.diningInfo</code> attribute.
	 * @return the diningInfo
	 */
	public DiningInfo getDiningInfo()
	{
		return getDiningInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.diningInfo</code> attribute. 
	 * @param value the diningInfo
	 */
	public void setDiningInfo(final SessionContext ctx, final DiningInfo value)
	{
		DININGINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.diningInfo</code> attribute. 
	 * @param value the diningInfo
	 */
	public void setDiningInfo(final DiningInfo value)
	{
		setDiningInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.foodType</code> attribute.
	 * @return the foodType - FoodType.
	 */
	public EnumerationValue getFoodType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FOODTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.foodType</code> attribute.
	 * @return the foodType - FoodType.
	 */
	public EnumerationValue getFoodType()
	{
		return getFoodType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.foodType</code> attribute. 
	 * @param value the foodType - FoodType.
	 */
	public void setFoodType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FOODTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.foodType</code> attribute. 
	 * @param value the foodType - FoodType.
	 */
	public void setFoodType(final EnumerationValue value)
	{
		setFoodType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.mealType</code> attribute.
	 * @return the mealType - MealType
	 */
	public EnumerationValue getMealType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.mealType</code> attribute.
	 * @return the mealType - MealType
	 */
	public EnumerationValue getMealType()
	{
		return getMealType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.mealType</code> attribute. 
	 * @param value the mealType - MealType
	 */
	public void setMealType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.mealType</code> attribute. 
	 * @param value the mealType - MealType
	 */
	public void setMealType(final EnumerationValue value)
	{
		setMealType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.media</code> attribute.
	 * @return the media - Media.
	 */
	public Collection<Media> getMedia(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.media</code> attribute.
	 * @return the media - Media.
	 */
	public Collection<Media> getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.media</code> attribute. 
	 * @param value the media - Media.
	 */
	public void setMedia(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.media</code> attribute. 
	 * @param value the media - Media.
	 */
	public void setMedia(final Collection<Media> value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.menuItemName</code> attribute.
	 * @return the menuItemName - MenuItemName.
	 */
	public String getMenuItemName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMealInfo.getMenuItemName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MENUITEMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.menuItemName</code> attribute.
	 * @return the menuItemName - MenuItemName.
	 */
	public String getMenuItemName()
	{
		return getMenuItemName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.menuItemName</code> attribute. 
	 * @return the localized menuItemName - MenuItemName.
	 */
	public Map<Language,String> getAllMenuItemName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MENUITEMNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.menuItemName</code> attribute. 
	 * @return the localized menuItemName - MenuItemName.
	 */
	public Map<Language,String> getAllMenuItemName()
	{
		return getAllMenuItemName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.menuItemName</code> attribute. 
	 * @param value the menuItemName - MenuItemName.
	 */
	public void setMenuItemName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMealInfo.setMenuItemName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MENUITEMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.menuItemName</code> attribute. 
	 * @param value the menuItemName - MenuItemName.
	 */
	public void setMenuItemName(final String value)
	{
		setMenuItemName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.menuItemName</code> attribute. 
	 * @param value the menuItemName - MenuItemName.
	 */
	public void setAllMenuItemName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MENUITEMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.menuItemName</code> attribute. 
	 * @param value the menuItemName - MenuItemName.
	 */
	public void setAllMenuItemName(final Map<Language,String> value)
	{
		setAllMenuItemName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.menuName</code> attribute.
	 * @return the menuName - Menu Name
	 */
	public EnumerationValue getMenuName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MENUNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.menuName</code> attribute.
	 * @return the menuName - Menu Name
	 */
	public EnumerationValue getMenuName()
	{
		return getMenuName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.menuName</code> attribute. 
	 * @param value the menuName - Menu Name
	 */
	public void setMenuName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MENUNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.menuName</code> attribute. 
	 * @param value the menuName - Menu Name
	 */
	public void setMenuName(final EnumerationValue value)
	{
		setMenuName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.menuValidity</code> attribute.
	 * @return the menuValidity - Date Range
	 */
	public StandardDateRange getMenuValidity(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, MENUVALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.menuValidity</code> attribute.
	 * @return the menuValidity - Date Range
	 */
	public StandardDateRange getMenuValidity()
	{
		return getMenuValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.menuValidity</code> attribute. 
	 * @param value the menuValidity - Date Range
	 */
	public void setMenuValidity(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, MENUVALIDITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.menuValidity</code> attribute. 
	 * @param value the menuValidity - Date Range
	 */
	public void setMenuValidity(final StandardDateRange value)
	{
		setMenuValidity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.restaurant</code> attribute.
	 * @return the restaurant
	 */
	public DiningInfo getRestaurant(final SessionContext ctx)
	{
		return (DiningInfo)getProperty( ctx, RESTAURANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.restaurant</code> attribute.
	 * @return the restaurant
	 */
	public DiningInfo getRestaurant()
	{
		return getRestaurant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.restaurant</code> attribute. 
	 * @param value the restaurant
	 */
	public void setRestaurant(final SessionContext ctx, final DiningInfo value)
	{
		RESTAURANTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.restaurant</code> attribute. 
	 * @param value the restaurant
	 */
	public void setRestaurant(final DiningInfo value)
	{
		setRestaurant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.spiceLevel</code> attribute.
	 * @return the spiceLevel - Spice Level.
	 */
	public EnumerationValue getSpiceLevel(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SPICELEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.spiceLevel</code> attribute.
	 * @return the spiceLevel - Spice Level.
	 */
	public EnumerationValue getSpiceLevel()
	{
		return getSpiceLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.spiceLevel</code> attribute. 
	 * @param value the spiceLevel - Spice Level.
	 */
	public void setSpiceLevel(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SPICELEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.spiceLevel</code> attribute. 
	 * @param value the spiceLevel - Spice Level.
	 */
	public void setSpiceLevel(final EnumerationValue value)
	{
		setSpiceLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.timeFrom</code> attribute.
	 * @return the timeFrom - Time From.
	 */
	public String getTimeFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.timeFrom</code> attribute.
	 * @return the timeFrom - Time From.
	 */
	public String getTimeFrom()
	{
		return getTimeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.timeFrom</code> attribute. 
	 * @param value the timeFrom - Time From.
	 */
	public void setTimeFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.timeFrom</code> attribute. 
	 * @param value the timeFrom - Time From.
	 */
	public void setTimeFrom(final String value)
	{
		setTimeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.timeTo</code> attribute.
	 * @return the timeTo - Time To.
	 */
	public String getTimeTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.timeTo</code> attribute.
	 * @return the timeTo - Time To.
	 */
	public String getTimeTo()
	{
		return getTimeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.timeTo</code> attribute. 
	 * @param value the timeTo - Time To.
	 */
	public void setTimeTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.timeTo</code> attribute. 
	 * @param value the timeTo - Time To.
	 */
	public void setTimeTo(final String value)
	{
		setTimeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.typeOfService</code> attribute.
	 * @return the typeOfService - TypeOfService.
	 */
	public EnumerationValue getTypeOfService(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFSERVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.typeOfService</code> attribute.
	 * @return the typeOfService - TypeOfService.
	 */
	public EnumerationValue getTypeOfService()
	{
		return getTypeOfService( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.typeOfService</code> attribute. 
	 * @param value the typeOfService - TypeOfService.
	 */
	public void setTypeOfService(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFSERVICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.typeOfService</code> attribute. 
	 * @param value the typeOfService - TypeOfService.
	 */
	public void setTypeOfService(final EnumerationValue value)
	{
		setTypeOfService( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.unit</code> attribute.
	 * @return the unit - Unit
	 */
	public EnumerationValue getUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MealInfo.unit</code> attribute.
	 * @return the unit - Unit
	 */
	public EnumerationValue getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.unit</code> attribute. 
	 * @param value the unit - Unit
	 */
	public void setUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MealInfo.unit</code> attribute. 
	 * @param value the unit - Unit
	 */
	public void setUnit(final EnumerationValue value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
}
