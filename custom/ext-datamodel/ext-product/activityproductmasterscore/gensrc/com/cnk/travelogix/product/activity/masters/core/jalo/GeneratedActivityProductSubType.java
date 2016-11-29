/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.jalo.ProductType;
import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityComboProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityDescription;
import com.cnk.travelogix.product.activity.masters.core.jalo.AdditionalActivityInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.Inclusion;
import com.cnk.travelogix.product.activity.masters.core.jalo.OperationDuration;
import com.cnk.travelogix.product.activity.masters.core.jalo.PickupAndDropOff;
import com.cnk.travelogix.product.activity.masters.core.jalo.SeatingInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.TourItinerary;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProductSubType ActivityProductSubType}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityProductSubType extends VariantProduct
{
	/** Qualifier of the <code>ActivityProductSubType.commonProductNameSubTypeId</code> attribute **/
	public static final String COMMONPRODUCTNAMESUBTYPEID = "commonProductNameSubTypeId";
	/** Qualifier of the <code>ActivityProductSubType.productType</code> attribute **/
	public static final String PRODUCTTYPE = "productType";
	/** Qualifier of the <code>ActivityProductSubType.placeOfEvent</code> attribute **/
	public static final String PLACEOFEVENT = "placeOfEvent";
	/** Qualifier of the <code>ActivityProductSubType.startingPoint</code> attribute **/
	public static final String STARTINGPOINT = "startingPoint";
	/** Qualifier of the <code>ActivityProductSubType.endingPoint</code> attribute **/
	public static final String ENDINGPOINT = "endingPoint";
	/** Qualifier of the <code>ActivityProductSubType.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>ActivityProductSubType.isPickupAndDropOff</code> attribute **/
	public static final String ISPICKUPANDDROPOFF = "isPickupAndDropOff";
	/** Qualifier of the <code>ActivityProductSubType.exclusionDescription</code> attribute **/
	public static final String EXCLUSIONDESCRIPTION = "exclusionDescription";
	/** Qualifier of the <code>ActivityProductSubType.pickAndDropDetails</code> attribute **/
	public static final String PICKANDDROPDETAILS = "pickAndDropDetails";
	/** Qualifier of the <code>ActivityProductSubType.operationDuration</code> attribute **/
	public static final String OPERATIONDURATION = "operationDuration";
	/** Qualifier of the <code>ActivityProductSubType.seatingArrangement</code> attribute **/
	public static final String SEATINGARRANGEMENT = "seatingArrangement";
	/** Qualifier of the <code>ActivityProductSubType.additionalInfos</code> attribute **/
	public static final String ADDITIONALINFOS = "additionalInfos";
	/** Qualifier of the <code>ActivityProductSubType.inclusions</code> attribute **/
	public static final String INCLUSIONS = "inclusions";
	/** Qualifier of the <code>ActivityProductSubType.activityComboProduct</code> attribute **/
	public static final String ACTIVITYCOMBOPRODUCT = "activityComboProduct";
	/** Relation ordering override parameter constants for ActivityComboProductToActivityComboProducts from ((activityproductmasterscore))*/
	protected static String ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_SRC_ORDERED = "relation.ActivityComboProductToActivityComboProducts.source.ordered";
	protected static String ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_TGT_ORDERED = "relation.ActivityComboProductToActivityComboProducts.target.ordered";
	/** Relation disable markmodifed parameter constants for ActivityComboProductToActivityComboProducts from ((activityproductmasterscore))*/
	protected static String ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_MARKMODIFIED = "relation.ActivityComboProductToActivityComboProducts.markmodified";
	/** Qualifier of the <code>ActivityProductSubType.activitySubTypeDesc</code> attribute **/
	public static final String ACTIVITYSUBTYPEDESC = "activitySubTypeDesc";
	/** Qualifier of the <code>ActivityProductSubType.tourRouting</code> attribute **/
	public static final String TOURROUTING = "tourRouting";
	/**
	* {@link OneToManyHandler} for handling 1:n PICKANDDROPDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PickupAndDropOff> PICKANDDROPDETAILSHANDLER = new OneToManyHandler<PickupAndDropOff>(
	ActivityproductmasterscoreConstants.TC.PICKUPANDDROPOFF,
	false,
	"activityProductSubTypePickAndDropDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OPERATIONDURATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OperationDuration> OPERATIONDURATIONHANDLER = new OneToManyHandler<OperationDuration>(
	ActivityproductmasterscoreConstants.TC.OPERATIONDURATION,
	false,
	"activityProductSubTypeOperationDuration",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SEATINGARRANGEMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SeatingInfo> SEATINGARRANGEMENTHANDLER = new OneToManyHandler<SeatingInfo>(
	ActivityproductmasterscoreConstants.TC.SEATINGINFO,
	false,
	"activityProductSubTypeSeatingArrangement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ADDITIONALINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AdditionalActivityInfo> ADDITIONALINFOSHANDLER = new OneToManyHandler<AdditionalActivityInfo>(
	ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO,
	false,
	"activityProductSubTypeAdditionalInfos",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INCLUSIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Inclusion> INCLUSIONSHANDLER = new OneToManyHandler<Inclusion>(
	ActivityproductmasterscoreConstants.TC.INCLUSION,
	false,
	"activityProductSubTypeInclusions",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ACTIVITYSUBTYPEDESC's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ActivityDescription> ACTIVITYSUBTYPEDESCHANDLER = new OneToManyHandler<ActivityDescription>(
	ActivityproductmasterscoreConstants.TC.ACTIVITYDESCRIPTION,
	false,
	"activityProductSubTypeActivityDescription",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TOURROUTING's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TourItinerary> TOURROUTINGHANDLER = new OneToManyHandler<TourItinerary>(
	ActivityproductmasterscoreConstants.TC.TOURITINERARY,
	false,
	"activityProductSubTypeTourItinerary",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMMONPRODUCTNAMESUBTYPEID, AttributeMode.INITIAL);
		tmp.put(PRODUCTTYPE, AttributeMode.INITIAL);
		tmp.put(PLACEOFEVENT, AttributeMode.INITIAL);
		tmp.put(STARTINGPOINT, AttributeMode.INITIAL);
		tmp.put(ENDINGPOINT, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(ISPICKUPANDDROPOFF, AttributeMode.INITIAL);
		tmp.put(EXCLUSIONDESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.activityComboProduct</code> attribute.
	 * @return the activityComboProduct
	 */
	public Collection<ActivityComboProduct> getActivityComboProduct(final SessionContext ctx)
	{
		final List<ActivityComboProduct> items = getLinkedItems( 
			ctx,
			false,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS,
			"ActivityComboProduct",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.activityComboProduct</code> attribute.
	 * @return the activityComboProduct
	 */
	public Collection<ActivityComboProduct> getActivityComboProduct()
	{
		return getActivityComboProduct( getSession().getSessionContext() );
	}
	
	public long getActivityComboProductCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS,
			"ActivityComboProduct",
			null
		);
	}
	
	public long getActivityComboProductCount()
	{
		return getActivityComboProductCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.activityComboProduct</code> attribute. 
	 * @param value the activityComboProduct
	 */
	public void setActivityComboProduct(final SessionContext ctx, final Collection<ActivityComboProduct> value)
	{
		setLinkedItems( 
			ctx,
			false,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.activityComboProduct</code> attribute. 
	 * @param value the activityComboProduct
	 */
	public void setActivityComboProduct(final Collection<ActivityComboProduct> value)
	{
		setActivityComboProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityComboProduct. 
	 * @param value the item to add to activityComboProduct
	 */
	public void addToActivityComboProduct(final SessionContext ctx, final ActivityComboProduct value)
	{
		addLinkedItems( 
			ctx,
			false,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityComboProduct. 
	 * @param value the item to add to activityComboProduct
	 */
	public void addToActivityComboProduct(final ActivityComboProduct value)
	{
		addToActivityComboProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityComboProduct. 
	 * @param value the item to remove from activityComboProduct
	 */
	public void removeFromActivityComboProduct(final SessionContext ctx, final ActivityComboProduct value)
	{
		removeLinkedItems( 
			ctx,
			false,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityComboProduct. 
	 * @param value the item to remove from activityComboProduct
	 */
	public void removeFromActivityComboProduct(final ActivityComboProduct value)
	{
		removeFromActivityComboProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.activitySubTypeDesc</code> attribute.
	 * @return the activitySubTypeDesc
	 */
	public Collection<ActivityDescription> getActivitySubTypeDesc(final SessionContext ctx)
	{
		return ACTIVITYSUBTYPEDESCHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.activitySubTypeDesc</code> attribute.
	 * @return the activitySubTypeDesc
	 */
	public Collection<ActivityDescription> getActivitySubTypeDesc()
	{
		return getActivitySubTypeDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.activitySubTypeDesc</code> attribute. 
	 * @param value the activitySubTypeDesc
	 */
	public void setActivitySubTypeDesc(final SessionContext ctx, final Collection<ActivityDescription> value)
	{
		ACTIVITYSUBTYPEDESCHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.activitySubTypeDesc</code> attribute. 
	 * @param value the activitySubTypeDesc
	 */
	public void setActivitySubTypeDesc(final Collection<ActivityDescription> value)
	{
		setActivitySubTypeDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activitySubTypeDesc. 
	 * @param value the item to add to activitySubTypeDesc
	 */
	public void addToActivitySubTypeDesc(final SessionContext ctx, final ActivityDescription value)
	{
		ACTIVITYSUBTYPEDESCHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activitySubTypeDesc. 
	 * @param value the item to add to activitySubTypeDesc
	 */
	public void addToActivitySubTypeDesc(final ActivityDescription value)
	{
		addToActivitySubTypeDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activitySubTypeDesc. 
	 * @param value the item to remove from activitySubTypeDesc
	 */
	public void removeFromActivitySubTypeDesc(final SessionContext ctx, final ActivityDescription value)
	{
		ACTIVITYSUBTYPEDESCHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activitySubTypeDesc. 
	 * @param value the item to remove from activitySubTypeDesc
	 */
	public void removeFromActivitySubTypeDesc(final ActivityDescription value)
	{
		removeFromActivitySubTypeDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.additionalInfos</code> attribute.
	 * @return the additionalInfos
	 */
	public Collection<AdditionalActivityInfo> getAdditionalInfos(final SessionContext ctx)
	{
		return ADDITIONALINFOSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.additionalInfos</code> attribute.
	 * @return the additionalInfos
	 */
	public Collection<AdditionalActivityInfo> getAdditionalInfos()
	{
		return getAdditionalInfos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.additionalInfos</code> attribute. 
	 * @param value the additionalInfos
	 */
	public void setAdditionalInfos(final SessionContext ctx, final Collection<AdditionalActivityInfo> value)
	{
		ADDITIONALINFOSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.additionalInfos</code> attribute. 
	 * @param value the additionalInfos
	 */
	public void setAdditionalInfos(final Collection<AdditionalActivityInfo> value)
	{
		setAdditionalInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to additionalInfos. 
	 * @param value the item to add to additionalInfos
	 */
	public void addToAdditionalInfos(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		ADDITIONALINFOSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to additionalInfos. 
	 * @param value the item to add to additionalInfos
	 */
	public void addToAdditionalInfos(final AdditionalActivityInfo value)
	{
		addToAdditionalInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from additionalInfos. 
	 * @param value the item to remove from additionalInfos
	 */
	public void removeFromAdditionalInfos(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		ADDITIONALINFOSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from additionalInfos. 
	 * @param value the item to remove from additionalInfos
	 */
	public void removeFromAdditionalInfos(final AdditionalActivityInfo value)
	{
		removeFromAdditionalInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.commonProductNameSubTypeId</code> attribute.
	 * @return the commonProductNameSubTypeId - Common product name sub type ID and value will be system generated
	 */
	public String getCommonProductNameSubTypeId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMONPRODUCTNAMESUBTYPEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.commonProductNameSubTypeId</code> attribute.
	 * @return the commonProductNameSubTypeId - Common product name sub type ID and value will be system generated
	 */
	public String getCommonProductNameSubTypeId()
	{
		return getCommonProductNameSubTypeId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.commonProductNameSubTypeId</code> attribute. 
	 * @param value the commonProductNameSubTypeId - Common product name sub type ID and value will be system generated
	 */
	public void setCommonProductNameSubTypeId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMONPRODUCTNAMESUBTYPEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.commonProductNameSubTypeId</code> attribute. 
	 * @param value the commonProductNameSubTypeId - Common product name sub type ID and value will be system generated
	 */
	public void setCommonProductNameSubTypeId(final String value)
	{
		setCommonProductNameSubTypeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.duration</code> attribute.
	 * @return the duration - Duration
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.duration</code> attribute.
	 * @return the duration - Duration
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.duration</code> attribute. 
	 * @param value the duration - Duration
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.duration</code> attribute. 
	 * @param value the duration - Duration
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.endingPoint</code> attribute.
	 * @return the endingPoint - Ending Point
	 */
	public String getEndingPoint(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ENDINGPOINT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.endingPoint</code> attribute.
	 * @return the endingPoint - Ending Point
	 */
	public String getEndingPoint()
	{
		return getEndingPoint( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.endingPoint</code> attribute. 
	 * @param value the endingPoint - Ending Point
	 */
	public void setEndingPoint(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ENDINGPOINT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.endingPoint</code> attribute. 
	 * @param value the endingPoint - Ending Point
	 */
	public void setEndingPoint(final String value)
	{
		setEndingPoint( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.exclusionDescription</code> attribute.
	 * @return the exclusionDescription - Exclusion Description
	 */
	public String getExclusionDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXCLUSIONDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.exclusionDescription</code> attribute.
	 * @return the exclusionDescription - Exclusion Description
	 */
	public String getExclusionDescription()
	{
		return getExclusionDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.exclusionDescription</code> attribute. 
	 * @param value the exclusionDescription - Exclusion Description
	 */
	public void setExclusionDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXCLUSIONDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.exclusionDescription</code> attribute. 
	 * @param value the exclusionDescription - Exclusion Description
	 */
	public void setExclusionDescription(final String value)
	{
		setExclusionDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.inclusions</code> attribute.
	 * @return the inclusions
	 */
	public Collection<Inclusion> getInclusions(final SessionContext ctx)
	{
		return INCLUSIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.inclusions</code> attribute.
	 * @return the inclusions
	 */
	public Collection<Inclusion> getInclusions()
	{
		return getInclusions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.inclusions</code> attribute. 
	 * @param value the inclusions
	 */
	public void setInclusions(final SessionContext ctx, final Collection<Inclusion> value)
	{
		INCLUSIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.inclusions</code> attribute. 
	 * @param value the inclusions
	 */
	public void setInclusions(final Collection<Inclusion> value)
	{
		setInclusions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inclusions. 
	 * @param value the item to add to inclusions
	 */
	public void addToInclusions(final SessionContext ctx, final Inclusion value)
	{
		INCLUSIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inclusions. 
	 * @param value the item to add to inclusions
	 */
	public void addToInclusions(final Inclusion value)
	{
		addToInclusions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inclusions. 
	 * @param value the item to remove from inclusions
	 */
	public void removeFromInclusions(final SessionContext ctx, final Inclusion value)
	{
		INCLUSIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inclusions. 
	 * @param value the item to remove from inclusions
	 */
	public void removeFromInclusions(final Inclusion value)
	{
		removeFromInclusions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.isPickupAndDropOff</code> attribute.
	 * @return the isPickupAndDropOff - Pickup And DropOff
	 */
	public Boolean isIsPickupAndDropOff(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISPICKUPANDDROPOFF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.isPickupAndDropOff</code> attribute.
	 * @return the isPickupAndDropOff - Pickup And DropOff
	 */
	public Boolean isIsPickupAndDropOff()
	{
		return isIsPickupAndDropOff( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.isPickupAndDropOff</code> attribute. 
	 * @return the isPickupAndDropOff - Pickup And DropOff
	 */
	public boolean isIsPickupAndDropOffAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsPickupAndDropOff( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.isPickupAndDropOff</code> attribute. 
	 * @return the isPickupAndDropOff - Pickup And DropOff
	 */
	public boolean isIsPickupAndDropOffAsPrimitive()
	{
		return isIsPickupAndDropOffAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.isPickupAndDropOff</code> attribute. 
	 * @param value the isPickupAndDropOff - Pickup And DropOff
	 */
	public void setIsPickupAndDropOff(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISPICKUPANDDROPOFF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.isPickupAndDropOff</code> attribute. 
	 * @param value the isPickupAndDropOff - Pickup And DropOff
	 */
	public void setIsPickupAndDropOff(final Boolean value)
	{
		setIsPickupAndDropOff( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.isPickupAndDropOff</code> attribute. 
	 * @param value the isPickupAndDropOff - Pickup And DropOff
	 */
	public void setIsPickupAndDropOff(final SessionContext ctx, final boolean value)
	{
		setIsPickupAndDropOff( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.isPickupAndDropOff</code> attribute. 
	 * @param value the isPickupAndDropOff - Pickup And DropOff
	 */
	public void setIsPickupAndDropOff(final boolean value)
	{
		setIsPickupAndDropOff( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.operationDuration</code> attribute.
	 * @return the operationDuration
	 */
	public Collection<OperationDuration> getOperationDuration(final SessionContext ctx)
	{
		return OPERATIONDURATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.operationDuration</code> attribute.
	 * @return the operationDuration
	 */
	public Collection<OperationDuration> getOperationDuration()
	{
		return getOperationDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.operationDuration</code> attribute. 
	 * @param value the operationDuration
	 */
	public void setOperationDuration(final SessionContext ctx, final Collection<OperationDuration> value)
	{
		OPERATIONDURATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.operationDuration</code> attribute. 
	 * @param value the operationDuration
	 */
	public void setOperationDuration(final Collection<OperationDuration> value)
	{
		setOperationDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to operationDuration. 
	 * @param value the item to add to operationDuration
	 */
	public void addToOperationDuration(final SessionContext ctx, final OperationDuration value)
	{
		OPERATIONDURATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to operationDuration. 
	 * @param value the item to add to operationDuration
	 */
	public void addToOperationDuration(final OperationDuration value)
	{
		addToOperationDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from operationDuration. 
	 * @param value the item to remove from operationDuration
	 */
	public void removeFromOperationDuration(final SessionContext ctx, final OperationDuration value)
	{
		OPERATIONDURATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from operationDuration. 
	 * @param value the item to remove from operationDuration
	 */
	public void removeFromOperationDuration(final OperationDuration value)
	{
		removeFromOperationDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.pickAndDropDetails</code> attribute.
	 * @return the pickAndDropDetails
	 */
	public Collection<PickupAndDropOff> getPickAndDropDetails(final SessionContext ctx)
	{
		return PICKANDDROPDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.pickAndDropDetails</code> attribute.
	 * @return the pickAndDropDetails
	 */
	public Collection<PickupAndDropOff> getPickAndDropDetails()
	{
		return getPickAndDropDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.pickAndDropDetails</code> attribute. 
	 * @param value the pickAndDropDetails
	 */
	public void setPickAndDropDetails(final SessionContext ctx, final Collection<PickupAndDropOff> value)
	{
		PICKANDDROPDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.pickAndDropDetails</code> attribute. 
	 * @param value the pickAndDropDetails
	 */
	public void setPickAndDropDetails(final Collection<PickupAndDropOff> value)
	{
		setPickAndDropDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pickAndDropDetails. 
	 * @param value the item to add to pickAndDropDetails
	 */
	public void addToPickAndDropDetails(final SessionContext ctx, final PickupAndDropOff value)
	{
		PICKANDDROPDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pickAndDropDetails. 
	 * @param value the item to add to pickAndDropDetails
	 */
	public void addToPickAndDropDetails(final PickupAndDropOff value)
	{
		addToPickAndDropDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pickAndDropDetails. 
	 * @param value the item to remove from pickAndDropDetails
	 */
	public void removeFromPickAndDropDetails(final SessionContext ctx, final PickupAndDropOff value)
	{
		PICKANDDROPDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pickAndDropDetails. 
	 * @param value the item to remove from pickAndDropDetails
	 */
	public void removeFromPickAndDropDetails(final PickupAndDropOff value)
	{
		removeFromPickAndDropDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.placeOfEvent</code> attribute.
	 * @return the placeOfEvent - Place of Event
	 */
	public EnumerationValue getPlaceOfEvent(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PLACEOFEVENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.placeOfEvent</code> attribute.
	 * @return the placeOfEvent - Place of Event
	 */
	public EnumerationValue getPlaceOfEvent()
	{
		return getPlaceOfEvent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.placeOfEvent</code> attribute. 
	 * @param value the placeOfEvent - Place of Event
	 */
	public void setPlaceOfEvent(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PLACEOFEVENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.placeOfEvent</code> attribute. 
	 * @param value the placeOfEvent - Place of Event
	 */
	public void setPlaceOfEvent(final EnumerationValue value)
	{
		setPlaceOfEvent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.productType</code> attribute.
	 * @return the productType - Product Type
	 */
	public ProductType getProductType(final SessionContext ctx)
	{
		return (ProductType)getProperty( ctx, PRODUCTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.productType</code> attribute.
	 * @return the productType - Product Type
	 */
	public ProductType getProductType()
	{
		return getProductType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.productType</code> attribute. 
	 * @param value the productType - Product Type
	 */
	public void setProductType(final SessionContext ctx, final ProductType value)
	{
		setProperty(ctx, PRODUCTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.productType</code> attribute. 
	 * @param value the productType - Product Type
	 */
	public void setProductType(final ProductType value)
	{
		setProductType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.seatingArrangement</code> attribute.
	 * @return the seatingArrangement
	 */
	public Collection<SeatingInfo> getSeatingArrangement(final SessionContext ctx)
	{
		return SEATINGARRANGEMENTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.seatingArrangement</code> attribute.
	 * @return the seatingArrangement
	 */
	public Collection<SeatingInfo> getSeatingArrangement()
	{
		return getSeatingArrangement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.seatingArrangement</code> attribute. 
	 * @param value the seatingArrangement
	 */
	public void setSeatingArrangement(final SessionContext ctx, final Collection<SeatingInfo> value)
	{
		SEATINGARRANGEMENTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.seatingArrangement</code> attribute. 
	 * @param value the seatingArrangement
	 */
	public void setSeatingArrangement(final Collection<SeatingInfo> value)
	{
		setSeatingArrangement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to seatingArrangement. 
	 * @param value the item to add to seatingArrangement
	 */
	public void addToSeatingArrangement(final SessionContext ctx, final SeatingInfo value)
	{
		SEATINGARRANGEMENTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to seatingArrangement. 
	 * @param value the item to add to seatingArrangement
	 */
	public void addToSeatingArrangement(final SeatingInfo value)
	{
		addToSeatingArrangement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from seatingArrangement. 
	 * @param value the item to remove from seatingArrangement
	 */
	public void removeFromSeatingArrangement(final SessionContext ctx, final SeatingInfo value)
	{
		SEATINGARRANGEMENTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from seatingArrangement. 
	 * @param value the item to remove from seatingArrangement
	 */
	public void removeFromSeatingArrangement(final SeatingInfo value)
	{
		removeFromSeatingArrangement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.startingPoint</code> attribute.
	 * @return the startingPoint - Starting Point
	 */
	public String getStartingPoint(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STARTINGPOINT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.startingPoint</code> attribute.
	 * @return the startingPoint - Starting Point
	 */
	public String getStartingPoint()
	{
		return getStartingPoint( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.startingPoint</code> attribute. 
	 * @param value the startingPoint - Starting Point
	 */
	public void setStartingPoint(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STARTINGPOINT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.startingPoint</code> attribute. 
	 * @param value the startingPoint - Starting Point
	 */
	public void setStartingPoint(final String value)
	{
		setStartingPoint( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.tourRouting</code> attribute.
	 * @return the tourRouting
	 */
	public Collection<TourItinerary> getTourRouting(final SessionContext ctx)
	{
		return TOURROUTINGHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProductSubType.tourRouting</code> attribute.
	 * @return the tourRouting
	 */
	public Collection<TourItinerary> getTourRouting()
	{
		return getTourRouting( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.tourRouting</code> attribute. 
	 * @param value the tourRouting
	 */
	public void setTourRouting(final SessionContext ctx, final Collection<TourItinerary> value)
	{
		TOURROUTINGHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProductSubType.tourRouting</code> attribute. 
	 * @param value the tourRouting
	 */
	public void setTourRouting(final Collection<TourItinerary> value)
	{
		setTourRouting( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tourRouting. 
	 * @param value the item to add to tourRouting
	 */
	public void addToTourRouting(final SessionContext ctx, final TourItinerary value)
	{
		TOURROUTINGHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tourRouting. 
	 * @param value the item to add to tourRouting
	 */
	public void addToTourRouting(final TourItinerary value)
	{
		addToTourRouting( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tourRouting. 
	 * @param value the item to remove from tourRouting
	 */
	public void removeFromTourRouting(final SessionContext ctx, final TourItinerary value)
	{
		TOURROUTINGHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tourRouting. 
	 * @param value the item to remove from tourRouting
	 */
	public void removeFromTourRouting(final TourItinerary value)
	{
		removeFromTourRouting( getSession().getSessionContext(), value );
	}
	
}
