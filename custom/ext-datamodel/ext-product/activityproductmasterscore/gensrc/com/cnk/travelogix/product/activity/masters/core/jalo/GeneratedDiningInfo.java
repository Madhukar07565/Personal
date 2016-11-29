/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails;
import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.Inclusion;
import com.cnk.travelogix.product.activity.masters.core.jalo.MealInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.OtherInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.SeatingInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.Timing;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.DiningInfo DiningInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDiningInfo extends GenericItem
{
	/** Qualifier of the <code>DiningInfo.restaurantName</code> attribute **/
	public static final String RESTAURANTNAME = "restaurantName";
	/** Qualifier of the <code>DiningInfo.whereAbouts</code> attribute **/
	public static final String WHEREABOUTS = "whereAbouts";
	/** Qualifier of the <code>DiningInfo.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>DiningInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>DiningInfo.other</code> attribute **/
	public static final String OTHER = "other";
	/** Qualifier of the <code>DiningInfo.style</code> attribute **/
	public static final String STYLE = "style";
	/** Qualifier of the <code>DiningInfo.typeOfDining</code> attribute **/
	public static final String TYPEOFDINING = "typeOfDining";
	/** Qualifier of the <code>DiningInfo.typeOfService</code> attribute **/
	public static final String TYPEOFSERVICE = "typeOfService";
	/** Qualifier of the <code>DiningInfo.mealType</code> attribute **/
	public static final String MEALTYPE = "mealType";
	/** Qualifier of the <code>DiningInfo.cuisineType</code> attribute **/
	public static final String CUISINETYPE = "cuisineType";
	/** Qualifier of the <code>DiningInfo.foodType</code> attribute **/
	public static final String FOODTYPE = "foodType";
	/** Qualifier of the <code>DiningInfo.chefRecommended</code> attribute **/
	public static final String CHEFRECOMMENDED = "chefRecommended";
	/** Qualifier of the <code>DiningInfo.spiceLevel</code> attribute **/
	public static final String SPICELEVEL = "spiceLevel";
	/** Qualifier of the <code>DiningInfo.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>DiningInfo.contactDetails</code> attribute **/
	public static final String CONTACTDETAILS = "contactDetails";
	/** Qualifier of the <code>DiningInfo.seatingInfo</code> attribute **/
	public static final String SEATINGINFO = "seatingInfo";
	/** Qualifier of the <code>DiningInfo.mealDetail</code> attribute **/
	public static final String MEALDETAIL = "mealDetail";
	/** Qualifier of the <code>DiningInfo.reservationContactDetails</code> attribute **/
	public static final String RESERVATIONCONTACTDETAILS = "reservationContactDetails";
	/** Qualifier of the <code>DiningInfo.timings</code> attribute **/
	public static final String TIMINGS = "timings";
	/** Qualifier of the <code>DiningInfo.mealInfo</code> attribute **/
	public static final String MEALINFO = "mealInfo";
	/** Qualifier of the <code>DiningInfo.inclusion</code> attribute **/
	public static final String INCLUSION = "inclusion";
	/** Qualifier of the <code>DiningInfo.activityProduct</code> attribute **/
	public static final String ACTIVITYPRODUCT = "activityProduct";
	/** Relation ordering override parameter constants for ActivityProductToDiningInfo from ((activityproductmasterscore))*/
	protected static String ACTIVITYPRODUCTTODININGINFO_SRC_ORDERED = "relation.ActivityProductToDiningInfo.source.ordered";
	protected static String ACTIVITYPRODUCTTODININGINFO_TGT_ORDERED = "relation.ActivityProductToDiningInfo.target.ordered";
	/** Relation disable markmodifed parameter constants for ActivityProductToDiningInfo from ((activityproductmasterscore))*/
	protected static String ACTIVITYPRODUCTTODININGINFO_MARKMODIFIED = "relation.ActivityProductToDiningInfo.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n CONTACTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ContactDetails> CONTACTDETAILSHANDLER = new OneToManyHandler<ContactDetails>(
	MasterdatacoreConstants.TC.CONTACTDETAILS,
	false,
	"restaurantContactDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SEATINGINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SeatingInfo> SEATINGINFOHANDLER = new OneToManyHandler<SeatingInfo>(
	ActivityproductmasterscoreConstants.TC.SEATINGINFO,
	false,
	"restaurant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEALDETAIL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MealInfo> MEALDETAILHANDLER = new OneToManyHandler<MealInfo>(
	ActivityproductmasterscoreConstants.TC.MEALINFO,
	false,
	"restaurant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RESERVATIONCONTACTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ContactDetails> RESERVATIONCONTACTDETAILSHANDLER = new OneToManyHandler<ContactDetails>(
	MasterdatacoreConstants.TC.CONTACTDETAILS,
	false,
	"restaurant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TIMINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Timing> TIMINGSHANDLER = new OneToManyHandler<Timing>(
	ActivityproductmasterscoreConstants.TC.TIMING,
	false,
	"restaurant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEALINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MealInfo> MEALINFOHANDLER = new OneToManyHandler<MealInfo>(
	ActivityproductmasterscoreConstants.TC.MEALINFO,
	false,
	"diningInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INCLUSION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDiningInfo> INCLUSIONHANDLER = new BidirectionalOneToManyHandler<GeneratedDiningInfo>(
	ActivityproductmasterscoreConstants.TC.DININGINFO,
	false,
	"inclusion",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RESTAURANTNAME, AttributeMode.INITIAL);
		tmp.put(WHEREABOUTS, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(OTHER, AttributeMode.INITIAL);
		tmp.put(STYLE, AttributeMode.INITIAL);
		tmp.put(TYPEOFDINING, AttributeMode.INITIAL);
		tmp.put(TYPEOFSERVICE, AttributeMode.INITIAL);
		tmp.put(MEALTYPE, AttributeMode.INITIAL);
		tmp.put(CUISINETYPE, AttributeMode.INITIAL);
		tmp.put(FOODTYPE, AttributeMode.INITIAL);
		tmp.put(CHEFRECOMMENDED, AttributeMode.INITIAL);
		tmp.put(SPICELEVEL, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(INCLUSION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public Collection<ActivityProduct> getActivityProduct(final SessionContext ctx)
	{
		final List<ActivityProduct> items = getLinkedItems( 
			ctx,
			false,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYPRODUCTTODININGINFO,
			"ActivityProduct",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public Collection<ActivityProduct> getActivityProduct()
	{
		return getActivityProduct( getSession().getSessionContext() );
	}
	
	public long getActivityProductCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYPRODUCTTODININGINFO,
			"ActivityProduct",
			null
		);
	}
	
	public long getActivityProductCount()
	{
		return getActivityProductCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final Collection<ActivityProduct> value)
	{
		setLinkedItems( 
			ctx,
			false,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYPRODUCTTODININGINFO,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYPRODUCTTODININGINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final Collection<ActivityProduct> value)
	{
		setActivityProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityProduct. 
	 * @param value the item to add to activityProduct
	 */
	public void addToActivityProduct(final SessionContext ctx, final ActivityProduct value)
	{
		addLinkedItems( 
			ctx,
			false,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYPRODUCTTODININGINFO,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYPRODUCTTODININGINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityProduct. 
	 * @param value the item to add to activityProduct
	 */
	public void addToActivityProduct(final ActivityProduct value)
	{
		addToActivityProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityProduct. 
	 * @param value the item to remove from activityProduct
	 */
	public void removeFromActivityProduct(final SessionContext ctx, final ActivityProduct value)
	{
		removeLinkedItems( 
			ctx,
			false,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYPRODUCTTODININGINFO,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYPRODUCTTODININGINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityProduct. 
	 * @param value the item to remove from activityProduct
	 */
	public void removeFromActivityProduct(final ActivityProduct value)
	{
		removeFromActivityProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.chefRecommended</code> attribute.
	 * @return the chefRecommended - Chef recommended
	 */
	public Boolean isChefRecommended(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CHEFRECOMMENDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.chefRecommended</code> attribute.
	 * @return the chefRecommended - Chef recommended
	 */
	public Boolean isChefRecommended()
	{
		return isChefRecommended( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.chefRecommended</code> attribute. 
	 * @return the chefRecommended - Chef recommended
	 */
	public boolean isChefRecommendedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isChefRecommended( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.chefRecommended</code> attribute. 
	 * @return the chefRecommended - Chef recommended
	 */
	public boolean isChefRecommendedAsPrimitive()
	{
		return isChefRecommendedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.chefRecommended</code> attribute. 
	 * @param value the chefRecommended - Chef recommended
	 */
	public void setChefRecommended(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CHEFRECOMMENDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.chefRecommended</code> attribute. 
	 * @param value the chefRecommended - Chef recommended
	 */
	public void setChefRecommended(final Boolean value)
	{
		setChefRecommended( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.chefRecommended</code> attribute. 
	 * @param value the chefRecommended - Chef recommended
	 */
	public void setChefRecommended(final SessionContext ctx, final boolean value)
	{
		setChefRecommended( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.chefRecommended</code> attribute. 
	 * @param value the chefRecommended - Chef recommended
	 */
	public void setChefRecommended(final boolean value)
	{
		setChefRecommended( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.contactDetails</code> attribute.
	 * @return the contactDetails
	 */
	public Collection<ContactDetails> getContactDetails(final SessionContext ctx)
	{
		return CONTACTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.contactDetails</code> attribute.
	 * @return the contactDetails
	 */
	public Collection<ContactDetails> getContactDetails()
	{
		return getContactDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.contactDetails</code> attribute. 
	 * @param value the contactDetails
	 */
	public void setContactDetails(final SessionContext ctx, final Collection<ContactDetails> value)
	{
		CONTACTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.contactDetails</code> attribute. 
	 * @param value the contactDetails
	 */
	public void setContactDetails(final Collection<ContactDetails> value)
	{
		setContactDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contactDetails. 
	 * @param value the item to add to contactDetails
	 */
	public void addToContactDetails(final SessionContext ctx, final ContactDetails value)
	{
		CONTACTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contactDetails. 
	 * @param value the item to add to contactDetails
	 */
	public void addToContactDetails(final ContactDetails value)
	{
		addToContactDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contactDetails. 
	 * @param value the item to remove from contactDetails
	 */
	public void removeFromContactDetails(final SessionContext ctx, final ContactDetails value)
	{
		CONTACTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contactDetails. 
	 * @param value the item to remove from contactDetails
	 */
	public void removeFromContactDetails(final ContactDetails value)
	{
		removeFromContactDetails( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		INCLUSIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.cuisineType</code> attribute.
	 * @return the cuisineType - Dining cuisine type
	 */
	public EnumerationValue getCuisineType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CUISINETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.cuisineType</code> attribute.
	 * @return the cuisineType - Dining cuisine type
	 */
	public EnumerationValue getCuisineType()
	{
		return getCuisineType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.cuisineType</code> attribute. 
	 * @param value the cuisineType - Dining cuisine type
	 */
	public void setCuisineType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CUISINETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.cuisineType</code> attribute. 
	 * @param value the cuisineType - Dining cuisine type
	 */
	public void setCuisineType(final EnumerationValue value)
	{
		setCuisineType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.description</code> attribute.
	 * @return the description - Description.
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDiningInfo.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.description</code> attribute.
	 * @return the description - Description.
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.description</code> attribute. 
	 * @return the localized description - Description.
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.description</code> attribute. 
	 * @return the localized description - Description.
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDiningInfo.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.foodType</code> attribute.
	 * @return the foodType - Food Type
	 */
	public EnumerationValue getFoodType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FOODTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.foodType</code> attribute.
	 * @return the foodType - Food Type
	 */
	public EnumerationValue getFoodType()
	{
		return getFoodType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.foodType</code> attribute. 
	 * @param value the foodType - Food Type
	 */
	public void setFoodType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FOODTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.foodType</code> attribute. 
	 * @param value the foodType - Food Type
	 */
	public void setFoodType(final EnumerationValue value)
	{
		setFoodType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Inclusion getInclusion(final SessionContext ctx)
	{
		return (Inclusion)getProperty( ctx, INCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Inclusion getInclusion()
	{
		return getInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final Inclusion value)
	{
		INCLUSIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final Inclusion value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.location</code> attribute.
	 * @return the location - Location.
	 */
	public String getLocation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.location</code> attribute.
	 * @return the location - Location.
	 */
	public String getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.location</code> attribute. 
	 * @param value the location - Location.
	 */
	public void setLocation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.location</code> attribute. 
	 * @param value the location - Location.
	 */
	public void setLocation(final String value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.mealDetail</code> attribute.
	 * @return the mealDetail
	 */
	public Collection<MealInfo> getMealDetail(final SessionContext ctx)
	{
		return MEALDETAILHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.mealDetail</code> attribute.
	 * @return the mealDetail
	 */
	public Collection<MealInfo> getMealDetail()
	{
		return getMealDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.mealDetail</code> attribute. 
	 * @param value the mealDetail
	 */
	public void setMealDetail(final SessionContext ctx, final Collection<MealInfo> value)
	{
		MEALDETAILHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.mealDetail</code> attribute. 
	 * @param value the mealDetail
	 */
	public void setMealDetail(final Collection<MealInfo> value)
	{
		setMealDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to mealDetail. 
	 * @param value the item to add to mealDetail
	 */
	public void addToMealDetail(final SessionContext ctx, final MealInfo value)
	{
		MEALDETAILHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to mealDetail. 
	 * @param value the item to add to mealDetail
	 */
	public void addToMealDetail(final MealInfo value)
	{
		addToMealDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from mealDetail. 
	 * @param value the item to remove from mealDetail
	 */
	public void removeFromMealDetail(final SessionContext ctx, final MealInfo value)
	{
		MEALDETAILHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from mealDetail. 
	 * @param value the item to remove from mealDetail
	 */
	public void removeFromMealDetail(final MealInfo value)
	{
		removeFromMealDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.mealInfo</code> attribute.
	 * @return the mealInfo
	 */
	public Collection<MealInfo> getMealInfo(final SessionContext ctx)
	{
		return MEALINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.mealInfo</code> attribute.
	 * @return the mealInfo
	 */
	public Collection<MealInfo> getMealInfo()
	{
		return getMealInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.mealInfo</code> attribute. 
	 * @param value the mealInfo
	 */
	public void setMealInfo(final SessionContext ctx, final Collection<MealInfo> value)
	{
		MEALINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.mealInfo</code> attribute. 
	 * @param value the mealInfo
	 */
	public void setMealInfo(final Collection<MealInfo> value)
	{
		setMealInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to mealInfo. 
	 * @param value the item to add to mealInfo
	 */
	public void addToMealInfo(final SessionContext ctx, final MealInfo value)
	{
		MEALINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to mealInfo. 
	 * @param value the item to add to mealInfo
	 */
	public void addToMealInfo(final MealInfo value)
	{
		addToMealInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from mealInfo. 
	 * @param value the item to remove from mealInfo
	 */
	public void removeFromMealInfo(final SessionContext ctx, final MealInfo value)
	{
		MEALINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from mealInfo. 
	 * @param value the item to remove from mealInfo
	 */
	public void removeFromMealInfo(final MealInfo value)
	{
		removeFromMealInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.mealType</code> attribute.
	 * @return the mealType - Meal type
	 */
	public EnumerationValue getMealType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.mealType</code> attribute.
	 * @return the mealType - Meal type
	 */
	public EnumerationValue getMealType()
	{
		return getMealType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.mealType</code> attribute. 
	 * @param value the mealType - Meal type
	 */
	public void setMealType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.mealType</code> attribute. 
	 * @param value the mealType - Meal type
	 */
	public void setMealType(final EnumerationValue value)
	{
		setMealType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.other</code> attribute.
	 * @return the other - Other Restaurant Info.
	 */
	public OtherInfo getOther(final SessionContext ctx)
	{
		return (OtherInfo)getProperty( ctx, OTHER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.other</code> attribute.
	 * @return the other - Other Restaurant Info.
	 */
	public OtherInfo getOther()
	{
		return getOther( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.other</code> attribute. 
	 * @param value the other - Other Restaurant Info.
	 */
	public void setOther(final SessionContext ctx, final OtherInfo value)
	{
		setProperty(ctx, OTHER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.other</code> attribute. 
	 * @param value the other - Other Restaurant Info.
	 */
	public void setOther(final OtherInfo value)
	{
		setOther( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.reservationContactDetails</code> attribute.
	 * @return the reservationContactDetails
	 */
	public Collection<ContactDetails> getReservationContactDetails(final SessionContext ctx)
	{
		return RESERVATIONCONTACTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.reservationContactDetails</code> attribute.
	 * @return the reservationContactDetails
	 */
	public Collection<ContactDetails> getReservationContactDetails()
	{
		return getReservationContactDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.reservationContactDetails</code> attribute. 
	 * @param value the reservationContactDetails
	 */
	public void setReservationContactDetails(final SessionContext ctx, final Collection<ContactDetails> value)
	{
		RESERVATIONCONTACTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.reservationContactDetails</code> attribute. 
	 * @param value the reservationContactDetails
	 */
	public void setReservationContactDetails(final Collection<ContactDetails> value)
	{
		setReservationContactDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reservationContactDetails. 
	 * @param value the item to add to reservationContactDetails
	 */
	public void addToReservationContactDetails(final SessionContext ctx, final ContactDetails value)
	{
		RESERVATIONCONTACTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reservationContactDetails. 
	 * @param value the item to add to reservationContactDetails
	 */
	public void addToReservationContactDetails(final ContactDetails value)
	{
		addToReservationContactDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reservationContactDetails. 
	 * @param value the item to remove from reservationContactDetails
	 */
	public void removeFromReservationContactDetails(final SessionContext ctx, final ContactDetails value)
	{
		RESERVATIONCONTACTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reservationContactDetails. 
	 * @param value the item to remove from reservationContactDetails
	 */
	public void removeFromReservationContactDetails(final ContactDetails value)
	{
		removeFromReservationContactDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.restaurantName</code> attribute.
	 * @return the restaurantName - RestaurantName.
	 */
	public String getRestaurantName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDiningInfo.getRestaurantName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, RESTAURANTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.restaurantName</code> attribute.
	 * @return the restaurantName - RestaurantName.
	 */
	public String getRestaurantName()
	{
		return getRestaurantName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.restaurantName</code> attribute. 
	 * @return the localized restaurantName - RestaurantName.
	 */
	public Map<Language,String> getAllRestaurantName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,RESTAURANTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.restaurantName</code> attribute. 
	 * @return the localized restaurantName - RestaurantName.
	 */
	public Map<Language,String> getAllRestaurantName()
	{
		return getAllRestaurantName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.restaurantName</code> attribute. 
	 * @param value the restaurantName - RestaurantName.
	 */
	public void setRestaurantName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDiningInfo.setRestaurantName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, RESTAURANTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.restaurantName</code> attribute. 
	 * @param value the restaurantName - RestaurantName.
	 */
	public void setRestaurantName(final String value)
	{
		setRestaurantName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.restaurantName</code> attribute. 
	 * @param value the restaurantName - RestaurantName.
	 */
	public void setAllRestaurantName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,RESTAURANTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.restaurantName</code> attribute. 
	 * @param value the restaurantName - RestaurantName.
	 */
	public void setAllRestaurantName(final Map<Language,String> value)
	{
		setAllRestaurantName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.seatingInfo</code> attribute.
	 * @return the seatingInfo
	 */
	public Collection<SeatingInfo> getSeatingInfo(final SessionContext ctx)
	{
		return SEATINGINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.seatingInfo</code> attribute.
	 * @return the seatingInfo
	 */
	public Collection<SeatingInfo> getSeatingInfo()
	{
		return getSeatingInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.seatingInfo</code> attribute. 
	 * @param value the seatingInfo
	 */
	public void setSeatingInfo(final SessionContext ctx, final Collection<SeatingInfo> value)
	{
		SEATINGINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.seatingInfo</code> attribute. 
	 * @param value the seatingInfo
	 */
	public void setSeatingInfo(final Collection<SeatingInfo> value)
	{
		setSeatingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to seatingInfo. 
	 * @param value the item to add to seatingInfo
	 */
	public void addToSeatingInfo(final SessionContext ctx, final SeatingInfo value)
	{
		SEATINGINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to seatingInfo. 
	 * @param value the item to add to seatingInfo
	 */
	public void addToSeatingInfo(final SeatingInfo value)
	{
		addToSeatingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from seatingInfo. 
	 * @param value the item to remove from seatingInfo
	 */
	public void removeFromSeatingInfo(final SessionContext ctx, final SeatingInfo value)
	{
		SEATINGINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from seatingInfo. 
	 * @param value the item to remove from seatingInfo
	 */
	public void removeFromSeatingInfo(final SeatingInfo value)
	{
		removeFromSeatingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.spiceLevel</code> attribute.
	 * @return the spiceLevel - Spice level
	 */
	public EnumerationValue getSpiceLevel(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SPICELEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.spiceLevel</code> attribute.
	 * @return the spiceLevel - Spice level
	 */
	public EnumerationValue getSpiceLevel()
	{
		return getSpiceLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.spiceLevel</code> attribute. 
	 * @param value the spiceLevel - Spice level
	 */
	public void setSpiceLevel(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SPICELEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.spiceLevel</code> attribute. 
	 * @param value the spiceLevel - Spice level
	 */
	public void setSpiceLevel(final EnumerationValue value)
	{
		setSpiceLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.style</code> attribute.
	 * @return the style - Dining Style
	 */
	public EnumerationValue getStyle(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STYLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.style</code> attribute.
	 * @return the style - Dining Style
	 */
	public EnumerationValue getStyle()
	{
		return getStyle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.style</code> attribute. 
	 * @param value the style - Dining Style
	 */
	public void setStyle(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STYLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.style</code> attribute. 
	 * @param value the style - Dining Style
	 */
	public void setStyle(final EnumerationValue value)
	{
		setStyle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.timings</code> attribute.
	 * @return the timings
	 */
	public Collection<Timing> getTimings(final SessionContext ctx)
	{
		return TIMINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.timings</code> attribute.
	 * @return the timings
	 */
	public Collection<Timing> getTimings()
	{
		return getTimings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.timings</code> attribute. 
	 * @param value the timings
	 */
	public void setTimings(final SessionContext ctx, final Collection<Timing> value)
	{
		TIMINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.timings</code> attribute. 
	 * @param value the timings
	 */
	public void setTimings(final Collection<Timing> value)
	{
		setTimings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to timings. 
	 * @param value the item to add to timings
	 */
	public void addToTimings(final SessionContext ctx, final Timing value)
	{
		TIMINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to timings. 
	 * @param value the item to add to timings
	 */
	public void addToTimings(final Timing value)
	{
		addToTimings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from timings. 
	 * @param value the item to remove from timings
	 */
	public void removeFromTimings(final SessionContext ctx, final Timing value)
	{
		TIMINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from timings. 
	 * @param value the item to remove from timings
	 */
	public void removeFromTimings(final Timing value)
	{
		removeFromTimings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.typeOfDining</code> attribute.
	 * @return the typeOfDining - Type Of Dining.
	 */
	public EnumerationValue getTypeOfDining(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFDINING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.typeOfDining</code> attribute.
	 * @return the typeOfDining - Type Of Dining.
	 */
	public EnumerationValue getTypeOfDining()
	{
		return getTypeOfDining( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.typeOfDining</code> attribute. 
	 * @param value the typeOfDining - Type Of Dining.
	 */
	public void setTypeOfDining(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFDINING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.typeOfDining</code> attribute. 
	 * @param value the typeOfDining - Type Of Dining.
	 */
	public void setTypeOfDining(final EnumerationValue value)
	{
		setTypeOfDining( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.typeOfService</code> attribute.
	 * @return the typeOfService - Type of services
	 */
	public EnumerationValue getTypeOfService(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFSERVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.typeOfService</code> attribute.
	 * @return the typeOfService - Type of services
	 */
	public EnumerationValue getTypeOfService()
	{
		return getTypeOfService( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.typeOfService</code> attribute. 
	 * @param value the typeOfService - Type of services
	 */
	public void setTypeOfService(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFSERVICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.typeOfService</code> attribute. 
	 * @param value the typeOfService - Type of services
	 */
	public void setTypeOfService(final EnumerationValue value)
	{
		setTypeOfService( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.unit</code> attribute.
	 * @return the unit - Unit
	 */
	public EnumerationValue getUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.unit</code> attribute.
	 * @return the unit - Unit
	 */
	public EnumerationValue getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.unit</code> attribute. 
	 * @param value the unit - Unit
	 */
	public void setUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.unit</code> attribute. 
	 * @param value the unit - Unit
	 */
	public void setUnit(final EnumerationValue value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.whereAbouts</code> attribute.
	 * @return the whereAbouts - Where Abouts.
	 */
	public String getWhereAbouts(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WHEREABOUTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningInfo.whereAbouts</code> attribute.
	 * @return the whereAbouts - Where Abouts.
	 */
	public String getWhereAbouts()
	{
		return getWhereAbouts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.whereAbouts</code> attribute. 
	 * @param value the whereAbouts - Where Abouts.
	 */
	public void setWhereAbouts(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WHEREABOUTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningInfo.whereAbouts</code> attribute. 
	 * @param value the whereAbouts - Where Abouts.
	 */
	public void setWhereAbouts(final String value)
	{
		setWhereAbouts( getSession().getSessionContext(), value );
	}
	
}
