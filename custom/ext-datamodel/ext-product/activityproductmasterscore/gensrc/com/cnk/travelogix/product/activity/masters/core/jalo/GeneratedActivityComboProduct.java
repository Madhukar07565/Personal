/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProductSubType;
import com.cnk.travelogix.product.activity.masters.core.jalo.PickupAndDropOff;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.DeactivationConfig;
import com.cnk.travelogix.product.common.core.jalo.DescriptionDetails;
import com.cnk.travelogix.product.common.core.jalo.Interest;
import de.hybris.platform.configurablebundleservices.jalo.BundleTemplate;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.ActivityComboProduct ActivityComboProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityComboProduct extends BundleTemplate
{
	/** Qualifier of the <code>ActivityComboProduct.comboProductType</code> attribute **/
	public static final String COMBOPRODUCTTYPE = "comboProductType";
	/** Qualifier of the <code>ActivityComboProduct.comboCompanyProductNameId</code> attribute **/
	public static final String COMBOCOMPANYPRODUCTNAMEID = "comboCompanyProductNameId";
	/** Qualifier of the <code>ActivityComboProduct.productNameFinanceControlId</code> attribute **/
	public static final String PRODUCTNAMEFINANCECONTROLID = "productNameFinanceControlId";
	/** Qualifier of the <code>ActivityComboProduct.comboDisplayName</code> attribute **/
	public static final String COMBODISPLAYNAME = "comboDisplayName";
	/** Qualifier of the <code>ActivityComboProduct.comboCommonProductNameSubTypeId</code> attribute **/
	public static final String COMBOCOMMONPRODUCTNAMESUBTYPEID = "comboCommonProductNameSubTypeId";
	/** Qualifier of the <code>ActivityComboProduct.comboCompanyProductNameSubTypeId</code> attribute **/
	public static final String COMBOCOMPANYPRODUCTNAMESUBTYPEID = "comboCompanyProductNameSubTypeId";
	/** Qualifier of the <code>ActivityComboProduct.comboProductNameSubType</code> attribute **/
	public static final String COMBOPRODUCTNAMESUBTYPE = "comboProductNameSubType";
	/** Qualifier of the <code>ActivityComboProduct.productNameSubTypeFinanceControlId</code> attribute **/
	public static final String PRODUCTNAMESUBTYPEFINANCECONTROLID = "productNameSubTypeFinanceControlId";
	/** Qualifier of the <code>ActivityComboProduct.pickOfPoint</code> attribute **/
	public static final String PICKOFPOINT = "pickOfPoint";
	/** Qualifier of the <code>ActivityComboProduct.dropOffPoint</code> attribute **/
	public static final String DROPOFFPOINT = "dropOffPoint";
	/** Qualifier of the <code>ActivityComboProduct.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>ActivityComboProduct.uniqueSellingPoints</code> attribute **/
	public static final String UNIQUESELLINGPOINTS = "uniqueSellingPoints";
	/** Qualifier of the <code>ActivityComboProduct.sellingTips</code> attribute **/
	public static final String SELLINGTIPS = "sellingTips";
	/** Qualifier of the <code>ActivityComboProduct.copiedFromCompanyProductNameId</code> attribute **/
	public static final String COPIEDFROMCOMPANYPRODUCTNAMEID = "copiedFromCompanyProductNameId";
	/** Qualifier of the <code>ActivityComboProduct.copiedFromCompanyProductNameSubTypeId</code> attribute **/
	public static final String COPIEDFROMCOMPANYPRODUCTNAMESUBTYPEID = "copiedFromCompanyProductNameSubTypeId";
	/** Qualifier of the <code>ActivityComboProduct.interest</code> attribute **/
	public static final String INTEREST = "interest";
	/** Qualifier of the <code>ActivityComboProduct.highlights</code> attribute **/
	public static final String HIGHLIGHTS = "highlights";
	/** Qualifier of the <code>ActivityComboProduct.activityComboMedia</code> attribute **/
	public static final String ACTIVITYCOMBOMEDIA = "activityComboMedia";
	/** Qualifier of the <code>ActivityComboProduct.attachedPolicies</code> attribute **/
	public static final String ATTACHEDPOLICIES = "attachedPolicies";
	/** Qualifier of the <code>ActivityComboProduct.activityComboProducts</code> attribute **/
	public static final String ACTIVITYCOMBOPRODUCTS = "activityComboProducts";
	/** Relation ordering override parameter constants for ActivityComboProductToActivityComboProducts from ((activityproductmasterscore))*/
	protected static String ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_SRC_ORDERED = "relation.ActivityComboProductToActivityComboProducts.source.ordered";
	protected static String ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_TGT_ORDERED = "relation.ActivityComboProductToActivityComboProducts.target.ordered";
	/** Relation disable markmodifed parameter constants for ActivityComboProductToActivityComboProducts from ((activityproductmasterscore))*/
	protected static String ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_MARKMODIFIED = "relation.ActivityComboProductToActivityComboProducts.markmodified";
	/** Qualifier of the <code>ActivityComboProduct.longDescription</code> attribute **/
	public static final String LONGDESCRIPTION = "longDescription";
	/** Qualifier of the <code>ActivityComboProduct.shortDescription</code> attribute **/
	public static final String SHORTDESCRIPTION = "shortDescription";
	/** Qualifier of the <code>ActivityComboProduct.updates</code> attribute **/
	public static final String UPDATES = "updates";
	/** Qualifier of the <code>ActivityComboProduct.deactivationFromMarket</code> attribute **/
	public static final String DEACTIVATIONFROMMARKET = "deactivationFromMarket";
	/**
	* {@link OneToManyHandler} for handling 1:n LONGDESCRIPTION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DescriptionDetails> LONGDESCRIPTIONHANDLER = new OneToManyHandler<DescriptionDetails>(
	CommonproductcoreConstants.TC.DESCRIPTIONDETAILS,
	false,
	"activityComboProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SHORTDESCRIPTION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DescriptionDetails> SHORTDESCRIPTIONHANDLER = new OneToManyHandler<DescriptionDetails>(
	CommonproductcoreConstants.TC.DESCRIPTIONDETAILS,
	false,
	"activityComboProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n UPDATES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DescriptionDetails> UPDATESHANDLER = new OneToManyHandler<DescriptionDetails>(
	CommonproductcoreConstants.TC.DESCRIPTIONDETAILS,
	false,
	"activityComboProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DEACTIVATIONFROMMARKET's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DeactivationConfig> DEACTIVATIONFROMMARKETHANDLER = new OneToManyHandler<DeactivationConfig>(
	CommonproductcoreConstants.TC.DEACTIVATIONCONFIG,
	false,
	"activityComboProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BundleTemplate.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMBOPRODUCTTYPE, AttributeMode.INITIAL);
		tmp.put(COMBOCOMPANYPRODUCTNAMEID, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAMEFINANCECONTROLID, AttributeMode.INITIAL);
		tmp.put(COMBODISPLAYNAME, AttributeMode.INITIAL);
		tmp.put(COMBOCOMMONPRODUCTNAMESUBTYPEID, AttributeMode.INITIAL);
		tmp.put(COMBOCOMPANYPRODUCTNAMESUBTYPEID, AttributeMode.INITIAL);
		tmp.put(COMBOPRODUCTNAMESUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAMESUBTYPEFINANCECONTROLID, AttributeMode.INITIAL);
		tmp.put(PICKOFPOINT, AttributeMode.INITIAL);
		tmp.put(DROPOFFPOINT, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		tmp.put(UNIQUESELLINGPOINTS, AttributeMode.INITIAL);
		tmp.put(SELLINGTIPS, AttributeMode.INITIAL);
		tmp.put(COPIEDFROMCOMPANYPRODUCTNAMEID, AttributeMode.INITIAL);
		tmp.put(COPIEDFROMCOMPANYPRODUCTNAMESUBTYPEID, AttributeMode.INITIAL);
		tmp.put(INTEREST, AttributeMode.INITIAL);
		tmp.put(HIGHLIGHTS, AttributeMode.INITIAL);
		tmp.put(ACTIVITYCOMBOMEDIA, AttributeMode.INITIAL);
		tmp.put(ATTACHEDPOLICIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.activityComboMedia</code> attribute.
	 * @return the activityComboMedia - ActivityCombo Media
	 */
	public Collection<Media> getActivityComboMedia(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, ACTIVITYCOMBOMEDIA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.activityComboMedia</code> attribute.
	 * @return the activityComboMedia - ActivityCombo Media
	 */
	public Collection<Media> getActivityComboMedia()
	{
		return getActivityComboMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.activityComboMedia</code> attribute. 
	 * @param value the activityComboMedia - ActivityCombo Media
	 */
	public void setActivityComboMedia(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, ACTIVITYCOMBOMEDIA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.activityComboMedia</code> attribute. 
	 * @param value the activityComboMedia - ActivityCombo Media
	 */
	public void setActivityComboMedia(final Collection<Media> value)
	{
		setActivityComboMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.activityComboProducts</code> attribute.
	 * @return the activityComboProducts
	 */
	public Collection<ActivityProductSubType> getActivityComboProducts(final SessionContext ctx)
	{
		final List<ActivityProductSubType> items = getLinkedItems( 
			ctx,
			true,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS,
			"ActivityProductSubType",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.activityComboProducts</code> attribute.
	 * @return the activityComboProducts
	 */
	public Collection<ActivityProductSubType> getActivityComboProducts()
	{
		return getActivityComboProducts( getSession().getSessionContext() );
	}
	
	public long getActivityComboProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS,
			"ActivityProductSubType",
			null
		);
	}
	
	public long getActivityComboProductsCount()
	{
		return getActivityComboProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.activityComboProducts</code> attribute. 
	 * @param value the activityComboProducts
	 */
	public void setActivityComboProducts(final SessionContext ctx, final Collection<ActivityProductSubType> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.activityComboProducts</code> attribute. 
	 * @param value the activityComboProducts
	 */
	public void setActivityComboProducts(final Collection<ActivityProductSubType> value)
	{
		setActivityComboProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityComboProducts. 
	 * @param value the item to add to activityComboProducts
	 */
	public void addToActivityComboProducts(final SessionContext ctx, final ActivityProductSubType value)
	{
		addLinkedItems( 
			ctx,
			true,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityComboProducts. 
	 * @param value the item to add to activityComboProducts
	 */
	public void addToActivityComboProducts(final ActivityProductSubType value)
	{
		addToActivityComboProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityComboProducts. 
	 * @param value the item to remove from activityComboProducts
	 */
	public void removeFromActivityComboProducts(final SessionContext ctx, final ActivityProductSubType value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYCOMBOPRODUCTTOACTIVITYCOMBOPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityComboProducts. 
	 * @param value the item to remove from activityComboProducts
	 */
	public void removeFromActivityComboProducts(final ActivityProductSubType value)
	{
		removeFromActivityComboProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.attachedPolicies</code> attribute.
	 * @return the attachedPolicies - Attached Policies
	 */
	public Collection<TravelogixPolicy> getAttachedPolicies(final SessionContext ctx)
	{
		Collection<TravelogixPolicy> coll = (Collection<TravelogixPolicy>)getProperty( ctx, ATTACHEDPOLICIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.attachedPolicies</code> attribute.
	 * @return the attachedPolicies - Attached Policies
	 */
	public Collection<TravelogixPolicy> getAttachedPolicies()
	{
		return getAttachedPolicies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.attachedPolicies</code> attribute. 
	 * @param value the attachedPolicies - Attached Policies
	 */
	public void setAttachedPolicies(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		setProperty(ctx, ATTACHEDPOLICIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.attachedPolicies</code> attribute. 
	 * @param value the attachedPolicies - Attached Policies
	 */
	public void setAttachedPolicies(final Collection<TravelogixPolicy> value)
	{
		setAttachedPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboCommonProductNameSubTypeId</code> attribute.
	 * @return the comboCommonProductNameSubTypeId - Combo Common ProductName SubTypeId
	 */
	public String getComboCommonProductNameSubTypeId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMBOCOMMONPRODUCTNAMESUBTYPEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboCommonProductNameSubTypeId</code> attribute.
	 * @return the comboCommonProductNameSubTypeId - Combo Common ProductName SubTypeId
	 */
	public String getComboCommonProductNameSubTypeId()
	{
		return getComboCommonProductNameSubTypeId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboCommonProductNameSubTypeId</code> attribute. 
	 * @param value the comboCommonProductNameSubTypeId - Combo Common ProductName SubTypeId
	 */
	public void setComboCommonProductNameSubTypeId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMBOCOMMONPRODUCTNAMESUBTYPEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboCommonProductNameSubTypeId</code> attribute. 
	 * @param value the comboCommonProductNameSubTypeId - Combo Common ProductName SubTypeId
	 */
	public void setComboCommonProductNameSubTypeId(final String value)
	{
		setComboCommonProductNameSubTypeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboCompanyProductNameId</code> attribute.
	 * @return the comboCompanyProductNameId - Combo Company Product Name Id
	 */
	public String getComboCompanyProductNameId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMBOCOMPANYPRODUCTNAMEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboCompanyProductNameId</code> attribute.
	 * @return the comboCompanyProductNameId - Combo Company Product Name Id
	 */
	public String getComboCompanyProductNameId()
	{
		return getComboCompanyProductNameId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboCompanyProductNameId</code> attribute. 
	 * @param value the comboCompanyProductNameId - Combo Company Product Name Id
	 */
	public void setComboCompanyProductNameId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMBOCOMPANYPRODUCTNAMEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboCompanyProductNameId</code> attribute. 
	 * @param value the comboCompanyProductNameId - Combo Company Product Name Id
	 */
	public void setComboCompanyProductNameId(final String value)
	{
		setComboCompanyProductNameId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboCompanyProductNameSubTypeId</code> attribute.
	 * @return the comboCompanyProductNameSubTypeId - Combo Company ProductName SubTypeId
	 */
	public String getComboCompanyProductNameSubTypeId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMBOCOMPANYPRODUCTNAMESUBTYPEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboCompanyProductNameSubTypeId</code> attribute.
	 * @return the comboCompanyProductNameSubTypeId - Combo Company ProductName SubTypeId
	 */
	public String getComboCompanyProductNameSubTypeId()
	{
		return getComboCompanyProductNameSubTypeId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboCompanyProductNameSubTypeId</code> attribute. 
	 * @param value the comboCompanyProductNameSubTypeId - Combo Company ProductName SubTypeId
	 */
	public void setComboCompanyProductNameSubTypeId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMBOCOMPANYPRODUCTNAMESUBTYPEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboCompanyProductNameSubTypeId</code> attribute. 
	 * @param value the comboCompanyProductNameSubTypeId - Combo Company ProductName SubTypeId
	 */
	public void setComboCompanyProductNameSubTypeId(final String value)
	{
		setComboCompanyProductNameSubTypeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboDisplayName</code> attribute.
	 * @return the comboDisplayName - Combo DisplayName
	 */
	public String getComboDisplayName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMBODISPLAYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboDisplayName</code> attribute.
	 * @return the comboDisplayName - Combo DisplayName
	 */
	public String getComboDisplayName()
	{
		return getComboDisplayName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboDisplayName</code> attribute. 
	 * @param value the comboDisplayName - Combo DisplayName
	 */
	public void setComboDisplayName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMBODISPLAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboDisplayName</code> attribute. 
	 * @param value the comboDisplayName - Combo DisplayName
	 */
	public void setComboDisplayName(final String value)
	{
		setComboDisplayName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboProductNameSubType</code> attribute.
	 * @return the comboProductNameSubType - Combo ProductName SubType
	 */
	public String getComboProductNameSubType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMBOPRODUCTNAMESUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboProductNameSubType</code> attribute.
	 * @return the comboProductNameSubType - Combo ProductName SubType
	 */
	public String getComboProductNameSubType()
	{
		return getComboProductNameSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboProductNameSubType</code> attribute. 
	 * @param value the comboProductNameSubType - Combo ProductName SubType
	 */
	public void setComboProductNameSubType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMBOPRODUCTNAMESUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboProductNameSubType</code> attribute. 
	 * @param value the comboProductNameSubType - Combo ProductName SubType
	 */
	public void setComboProductNameSubType(final String value)
	{
		setComboProductNameSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboProductType</code> attribute.
	 * @return the comboProductType - Combo Product Type
	 */
	public String getComboProductType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMBOPRODUCTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.comboProductType</code> attribute.
	 * @return the comboProductType - Combo Product Type
	 */
	public String getComboProductType()
	{
		return getComboProductType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboProductType</code> attribute. 
	 * @param value the comboProductType - Combo Product Type
	 */
	public void setComboProductType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMBOPRODUCTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.comboProductType</code> attribute. 
	 * @param value the comboProductType - Combo Product Type
	 */
	public void setComboProductType(final String value)
	{
		setComboProductType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.copiedFromCompanyProductNameId</code> attribute.
	 * @return the copiedFromCompanyProductNameId - CopiedFrom Company ProductNameId
	 */
	public String getCopiedFromCompanyProductNameId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROMCOMPANYPRODUCTNAMEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.copiedFromCompanyProductNameId</code> attribute.
	 * @return the copiedFromCompanyProductNameId - CopiedFrom Company ProductNameId
	 */
	public String getCopiedFromCompanyProductNameId()
	{
		return getCopiedFromCompanyProductNameId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.copiedFromCompanyProductNameId</code> attribute. 
	 * @param value the copiedFromCompanyProductNameId - CopiedFrom Company ProductNameId
	 */
	public void setCopiedFromCompanyProductNameId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROMCOMPANYPRODUCTNAMEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.copiedFromCompanyProductNameId</code> attribute. 
	 * @param value the copiedFromCompanyProductNameId - CopiedFrom Company ProductNameId
	 */
	public void setCopiedFromCompanyProductNameId(final String value)
	{
		setCopiedFromCompanyProductNameId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.copiedFromCompanyProductNameSubTypeId</code> attribute.
	 * @return the copiedFromCompanyProductNameSubTypeId - Copied From Company ProductName SubTypeId
	 */
	public String getCopiedFromCompanyProductNameSubTypeId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROMCOMPANYPRODUCTNAMESUBTYPEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.copiedFromCompanyProductNameSubTypeId</code> attribute.
	 * @return the copiedFromCompanyProductNameSubTypeId - Copied From Company ProductName SubTypeId
	 */
	public String getCopiedFromCompanyProductNameSubTypeId()
	{
		return getCopiedFromCompanyProductNameSubTypeId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.copiedFromCompanyProductNameSubTypeId</code> attribute. 
	 * @param value the copiedFromCompanyProductNameSubTypeId - Copied From Company ProductName SubTypeId
	 */
	public void setCopiedFromCompanyProductNameSubTypeId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROMCOMPANYPRODUCTNAMESUBTYPEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.copiedFromCompanyProductNameSubTypeId</code> attribute. 
	 * @param value the copiedFromCompanyProductNameSubTypeId - Copied From Company ProductName SubTypeId
	 */
	public void setCopiedFromCompanyProductNameSubTypeId(final String value)
	{
		setCopiedFromCompanyProductNameSubTypeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.deactivationFromMarket</code> attribute.
	 * @return the deactivationFromMarket
	 */
	public Collection<DeactivationConfig> getDeactivationFromMarket(final SessionContext ctx)
	{
		return DEACTIVATIONFROMMARKETHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.deactivationFromMarket</code> attribute.
	 * @return the deactivationFromMarket
	 */
	public Collection<DeactivationConfig> getDeactivationFromMarket()
	{
		return getDeactivationFromMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.deactivationFromMarket</code> attribute. 
	 * @param value the deactivationFromMarket
	 */
	public void setDeactivationFromMarket(final SessionContext ctx, final Collection<DeactivationConfig> value)
	{
		DEACTIVATIONFROMMARKETHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.deactivationFromMarket</code> attribute. 
	 * @param value the deactivationFromMarket
	 */
	public void setDeactivationFromMarket(final Collection<DeactivationConfig> value)
	{
		setDeactivationFromMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to deactivationFromMarket. 
	 * @param value the item to add to deactivationFromMarket
	 */
	public void addToDeactivationFromMarket(final SessionContext ctx, final DeactivationConfig value)
	{
		DEACTIVATIONFROMMARKETHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to deactivationFromMarket. 
	 * @param value the item to add to deactivationFromMarket
	 */
	public void addToDeactivationFromMarket(final DeactivationConfig value)
	{
		addToDeactivationFromMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from deactivationFromMarket. 
	 * @param value the item to remove from deactivationFromMarket
	 */
	public void removeFromDeactivationFromMarket(final SessionContext ctx, final DeactivationConfig value)
	{
		DEACTIVATIONFROMMARKETHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from deactivationFromMarket. 
	 * @param value the item to remove from deactivationFromMarket
	 */
	public void removeFromDeactivationFromMarket(final DeactivationConfig value)
	{
		removeFromDeactivationFromMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.dropOffPoint</code> attribute.
	 * @return the dropOffPoint - Collection of dropOffPoint
	 */
	public Collection<PickupAndDropOff> getDropOffPoint(final SessionContext ctx)
	{
		Collection<PickupAndDropOff> coll = (Collection<PickupAndDropOff>)getProperty( ctx, DROPOFFPOINT);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.dropOffPoint</code> attribute.
	 * @return the dropOffPoint - Collection of dropOffPoint
	 */
	public Collection<PickupAndDropOff> getDropOffPoint()
	{
		return getDropOffPoint( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.dropOffPoint</code> attribute. 
	 * @param value the dropOffPoint - Collection of dropOffPoint
	 */
	public void setDropOffPoint(final SessionContext ctx, final Collection<PickupAndDropOff> value)
	{
		setProperty(ctx, DROPOFFPOINT,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.dropOffPoint</code> attribute. 
	 * @param value the dropOffPoint - Collection of dropOffPoint
	 */
	public void setDropOffPoint(final Collection<PickupAndDropOff> value)
	{
		setDropOffPoint( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.highlights</code> attribute.
	 * @return the highlights - Highlights
	 */
	public String getHighlights(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HIGHLIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.highlights</code> attribute.
	 * @return the highlights - Highlights
	 */
	public String getHighlights()
	{
		return getHighlights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.highlights</code> attribute. 
	 * @param value the highlights - Highlights
	 */
	public void setHighlights(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HIGHLIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.highlights</code> attribute. 
	 * @param value the highlights - Highlights
	 */
	public void setHighlights(final String value)
	{
		setHighlights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.interest</code> attribute.
	 * @return the interest - Interest
	 */
	public Interest getInterest(final SessionContext ctx)
	{
		return (Interest)getProperty( ctx, INTEREST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.interest</code> attribute.
	 * @return the interest - Interest
	 */
	public Interest getInterest()
	{
		return getInterest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.interest</code> attribute. 
	 * @param value the interest - Interest
	 */
	public void setInterest(final SessionContext ctx, final Interest value)
	{
		setProperty(ctx, INTEREST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.interest</code> attribute. 
	 * @param value the interest - Interest
	 */
	public void setInterest(final Interest value)
	{
		setInterest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.longDescription</code> attribute.
	 * @return the longDescription
	 */
	public Collection<DescriptionDetails> getLongDescription(final SessionContext ctx)
	{
		return LONGDESCRIPTIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.longDescription</code> attribute.
	 * @return the longDescription
	 */
	public Collection<DescriptionDetails> getLongDescription()
	{
		return getLongDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.longDescription</code> attribute. 
	 * @param value the longDescription
	 */
	public void setLongDescription(final SessionContext ctx, final Collection<DescriptionDetails> value)
	{
		LONGDESCRIPTIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.longDescription</code> attribute. 
	 * @param value the longDescription
	 */
	public void setLongDescription(final Collection<DescriptionDetails> value)
	{
		setLongDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to longDescription. 
	 * @param value the item to add to longDescription
	 */
	public void addToLongDescription(final SessionContext ctx, final DescriptionDetails value)
	{
		LONGDESCRIPTIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to longDescription. 
	 * @param value the item to add to longDescription
	 */
	public void addToLongDescription(final DescriptionDetails value)
	{
		addToLongDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from longDescription. 
	 * @param value the item to remove from longDescription
	 */
	public void removeFromLongDescription(final SessionContext ctx, final DescriptionDetails value)
	{
		LONGDESCRIPTIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from longDescription. 
	 * @param value the item to remove from longDescription
	 */
	public void removeFromLongDescription(final DescriptionDetails value)
	{
		removeFromLongDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.pickOfPoint</code> attribute.
	 * @return the pickOfPoint - Collection 
	 * 						of pickOfPoints
	 */
	public Collection<PickupAndDropOff> getPickOfPoint(final SessionContext ctx)
	{
		Collection<PickupAndDropOff> coll = (Collection<PickupAndDropOff>)getProperty( ctx, PICKOFPOINT);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.pickOfPoint</code> attribute.
	 * @return the pickOfPoint - Collection 
	 * 						of pickOfPoints
	 */
	public Collection<PickupAndDropOff> getPickOfPoint()
	{
		return getPickOfPoint( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.pickOfPoint</code> attribute. 
	 * @param value the pickOfPoint - Collection 
	 * 						of pickOfPoints
	 */
	public void setPickOfPoint(final SessionContext ctx, final Collection<PickupAndDropOff> value)
	{
		setProperty(ctx, PICKOFPOINT,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.pickOfPoint</code> attribute. 
	 * @param value the pickOfPoint - Collection 
	 * 						of pickOfPoints
	 */
	public void setPickOfPoint(final Collection<PickupAndDropOff> value)
	{
		setPickOfPoint( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.productNameFinanceControlId</code> attribute.
	 * @return the productNameFinanceControlId - ProductName and FinanceControlId
	 */
	public String getProductNameFinanceControlId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTNAMEFINANCECONTROLID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.productNameFinanceControlId</code> attribute.
	 * @return the productNameFinanceControlId - ProductName and FinanceControlId
	 */
	public String getProductNameFinanceControlId()
	{
		return getProductNameFinanceControlId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.productNameFinanceControlId</code> attribute. 
	 * @param value the productNameFinanceControlId - ProductName and FinanceControlId
	 */
	public void setProductNameFinanceControlId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTNAMEFINANCECONTROLID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.productNameFinanceControlId</code> attribute. 
	 * @param value the productNameFinanceControlId - ProductName and FinanceControlId
	 */
	public void setProductNameFinanceControlId(final String value)
	{
		setProductNameFinanceControlId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.productNameSubTypeFinanceControlId</code> attribute.
	 * @return the productNameSubTypeFinanceControlId - ProductName SubType FinanceControlId
	 */
	public String getProductNameSubTypeFinanceControlId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTNAMESUBTYPEFINANCECONTROLID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.productNameSubTypeFinanceControlId</code> attribute.
	 * @return the productNameSubTypeFinanceControlId - ProductName SubType FinanceControlId
	 */
	public String getProductNameSubTypeFinanceControlId()
	{
		return getProductNameSubTypeFinanceControlId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.productNameSubTypeFinanceControlId</code> attribute. 
	 * @param value the productNameSubTypeFinanceControlId - ProductName SubType FinanceControlId
	 */
	public void setProductNameSubTypeFinanceControlId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTNAMESUBTYPEFINANCECONTROLID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.productNameSubTypeFinanceControlId</code> attribute. 
	 * @param value the productNameSubTypeFinanceControlId - ProductName SubType FinanceControlId
	 */
	public void setProductNameSubTypeFinanceControlId(final String value)
	{
		setProductNameSubTypeFinanceControlId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.sellingTips</code> attribute.
	 * @return the sellingTips - SellingTips
	 */
	public String getSellingTips(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SELLINGTIPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.sellingTips</code> attribute.
	 * @return the sellingTips - SellingTips
	 */
	public String getSellingTips()
	{
		return getSellingTips( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.sellingTips</code> attribute. 
	 * @param value the sellingTips - SellingTips
	 */
	public void setSellingTips(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SELLINGTIPS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.sellingTips</code> attribute. 
	 * @param value the sellingTips - SellingTips
	 */
	public void setSellingTips(final String value)
	{
		setSellingTips( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.shortDescription</code> attribute.
	 * @return the shortDescription
	 */
	public Collection<DescriptionDetails> getShortDescription(final SessionContext ctx)
	{
		return SHORTDESCRIPTIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.shortDescription</code> attribute.
	 * @return the shortDescription
	 */
	public Collection<DescriptionDetails> getShortDescription()
	{
		return getShortDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.shortDescription</code> attribute. 
	 * @param value the shortDescription
	 */
	public void setShortDescription(final SessionContext ctx, final Collection<DescriptionDetails> value)
	{
		SHORTDESCRIPTIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.shortDescription</code> attribute. 
	 * @param value the shortDescription
	 */
	public void setShortDescription(final Collection<DescriptionDetails> value)
	{
		setShortDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shortDescription. 
	 * @param value the item to add to shortDescription
	 */
	public void addToShortDescription(final SessionContext ctx, final DescriptionDetails value)
	{
		SHORTDESCRIPTIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shortDescription. 
	 * @param value the item to add to shortDescription
	 */
	public void addToShortDescription(final DescriptionDetails value)
	{
		addToShortDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shortDescription. 
	 * @param value the item to remove from shortDescription
	 */
	public void removeFromShortDescription(final SessionContext ctx, final DescriptionDetails value)
	{
		SHORTDESCRIPTIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shortDescription. 
	 * @param value the item to remove from shortDescription
	 */
	public void removeFromShortDescription(final DescriptionDetails value)
	{
		removeFromShortDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.uniqueSellingPoints</code> attribute.
	 * @return the uniqueSellingPoints - Unique SellingPoints
	 */
	public String getUniqueSellingPoints(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UNIQUESELLINGPOINTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.uniqueSellingPoints</code> attribute.
	 * @return the uniqueSellingPoints - Unique SellingPoints
	 */
	public String getUniqueSellingPoints()
	{
		return getUniqueSellingPoints( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.uniqueSellingPoints</code> attribute. 
	 * @param value the uniqueSellingPoints - Unique SellingPoints
	 */
	public void setUniqueSellingPoints(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UNIQUESELLINGPOINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.uniqueSellingPoints</code> attribute. 
	 * @param value the uniqueSellingPoints - Unique SellingPoints
	 */
	public void setUniqueSellingPoints(final String value)
	{
		setUniqueSellingPoints( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.updates</code> attribute.
	 * @return the updates
	 */
	public Collection<DescriptionDetails> getUpdates(final SessionContext ctx)
	{
		return UPDATESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityComboProduct.updates</code> attribute.
	 * @return the updates
	 */
	public Collection<DescriptionDetails> getUpdates()
	{
		return getUpdates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.updates</code> attribute. 
	 * @param value the updates
	 */
	public void setUpdates(final SessionContext ctx, final Collection<DescriptionDetails> value)
	{
		UPDATESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityComboProduct.updates</code> attribute. 
	 * @param value the updates
	 */
	public void setUpdates(final Collection<DescriptionDetails> value)
	{
		setUpdates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to updates. 
	 * @param value the item to add to updates
	 */
	public void addToUpdates(final SessionContext ctx, final DescriptionDetails value)
	{
		UPDATESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to updates. 
	 * @param value the item to add to updates
	 */
	public void addToUpdates(final DescriptionDetails value)
	{
		addToUpdates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from updates. 
	 * @param value the item to remove from updates
	 */
	public void removeFromUpdates(final SessionContext ctx, final DescriptionDetails value)
	{
		UPDATESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from updates. 
	 * @param value the item to remove from updates
	 */
	public void removeFromUpdates(final DescriptionDetails value)
	{
		removeFromUpdates( getSession().getSessionContext(), value );
	}
	
}
