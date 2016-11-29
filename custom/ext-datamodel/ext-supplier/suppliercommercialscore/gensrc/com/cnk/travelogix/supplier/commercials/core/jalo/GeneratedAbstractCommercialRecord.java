/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.SupplierCommercialAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord AbstractCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractCommercialRecord extends GenericItem
{
	/** Qualifier of the <code>AbstractCommercialRecord.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>AbstractCommercialRecord.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>AbstractCommercialRecord.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>AbstractCommercialRecord.commercialType</code> attribute **/
	public static final String COMMERCIALTYPE = "commercialType";
	/** Qualifier of the <code>AbstractCommercialRecord.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>AbstractCommercialRecord.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>AbstractCommercialRecord.approvalStatus</code> attribute **/
	public static final String APPROVALSTATUS = "approvalStatus";
	/** Qualifier of the <code>AbstractCommercialRecord.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>AbstractCommercialRecord.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Relation ordering override parameter constants for Commercial2Product from ((suppliercommercialscore))*/
	protected static String COMMERCIAL2PRODUCT_SRC_ORDERED = "relation.Commercial2Product.source.ordered";
	protected static String COMMERCIAL2PRODUCT_TGT_ORDERED = "relation.Commercial2Product.target.ordered";
	/** Relation disable markmodifed parameter constants for Commercial2Product from ((suppliercommercialscore))*/
	protected static String COMMERCIAL2PRODUCT_MARKMODIFIED = "relation.Commercial2Product.markmodified";
	/** Qualifier of the <code>AbstractCommercialRecord.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/** Qualifier of the <code>AbstractCommercialRecord.policies</code> attribute **/
	public static final String POLICIES = "policies";
	/** Relation ordering override parameter constants for Commercial2TravelogixPolicy from ((suppliercommercialscore))*/
	protected static String COMMERCIAL2TRAVELOGIXPOLICY_SRC_ORDERED = "relation.Commercial2TravelogixPolicy.source.ordered";
	protected static String COMMERCIAL2TRAVELOGIXPOLICY_TGT_ORDERED = "relation.Commercial2TravelogixPolicy.target.ordered";
	/** Relation disable markmodifed parameter constants for Commercial2TravelogixPolicy from ((suppliercommercialscore))*/
	protected static String COMMERCIAL2TRAVELOGIXPOLICY_MARKMODIFIED = "relation.Commercial2TravelogixPolicy.markmodified";
	/** Qualifier of the <code>AbstractCommercialRecord.advancedDefinitions</code> attribute **/
	public static final String ADVANCEDDEFINITIONS = "advancedDefinitions";
	/**
	* {@link OneToManyHandler} for handling 1:n MEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> MEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	false,
	"commercialRecord",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ADVANCEDDEFINITIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierCommercialAdvanceDefinition> ADVANCEDDEFINITIONSHANDLER = new OneToManyHandler<SupplierCommercialAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.SUPPLIERCOMMERCIALADVANCEDEFINITION,
	true,
	"commercialsRecord",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(COMMERCIALTYPE, AttributeMode.INITIAL);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		tmp.put(APPROVALSTATUS, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.advancedDefinitions</code> attribute.
	 * @return the advancedDefinitions
	 */
	public Set<SupplierCommercialAdvanceDefinition> getAdvancedDefinitions(final SessionContext ctx)
	{
		return (Set<SupplierCommercialAdvanceDefinition>)ADVANCEDDEFINITIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.advancedDefinitions</code> attribute.
	 * @return the advancedDefinitions
	 */
	public Set<SupplierCommercialAdvanceDefinition> getAdvancedDefinitions()
	{
		return getAdvancedDefinitions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.advancedDefinitions</code> attribute. 
	 * @param value the advancedDefinitions
	 */
	public void setAdvancedDefinitions(final SessionContext ctx, final Set<SupplierCommercialAdvanceDefinition> value)
	{
		ADVANCEDDEFINITIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.advancedDefinitions</code> attribute. 
	 * @param value the advancedDefinitions
	 */
	public void setAdvancedDefinitions(final Set<SupplierCommercialAdvanceDefinition> value)
	{
		setAdvancedDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advancedDefinitions. 
	 * @param value the item to add to advancedDefinitions
	 */
	public void addToAdvancedDefinitions(final SessionContext ctx, final SupplierCommercialAdvanceDefinition value)
	{
		ADVANCEDDEFINITIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advancedDefinitions. 
	 * @param value the item to add to advancedDefinitions
	 */
	public void addToAdvancedDefinitions(final SupplierCommercialAdvanceDefinition value)
	{
		addToAdvancedDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advancedDefinitions. 
	 * @param value the item to remove from advancedDefinitions
	 */
	public void removeFromAdvancedDefinitions(final SessionContext ctx, final SupplierCommercialAdvanceDefinition value)
	{
		ADVANCEDDEFINITIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advancedDefinitions. 
	 * @param value the item to remove from advancedDefinitions
	 */
	public void removeFromAdvancedDefinitions(final SupplierCommercialAdvanceDefinition value)
	{
		removeFromAdvancedDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPROVALSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus()
	{
		return getApprovalStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPROVALSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final EnumerationValue value)
	{
		setApprovalStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.commercialType</code> attribute.
	 * @return the commercialType
	 */
	public EnumerationValue getCommercialType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.commercialType</code> attribute.
	 * @return the commercialType
	 */
	public EnumerationValue getCommercialType()
	{
		return getCommercialType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.commercialType</code> attribute. 
	 * @param value the commercialType
	 */
	public void setCommercialType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.commercialType</code> attribute. 
	 * @param value the commercialType
	 */
	public void setCommercialType(final EnumerationValue value)
	{
		setCommercialType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.copiedFrom</code> attribute.
	 * @return the copiedFrom - Abstract commercial Copied From Id
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.copiedFrom</code> attribute.
	 * @return the copiedFrom - Abstract commercial Copied From Id
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Abstract commercial Copied From Id
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Abstract commercial Copied From Id
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractCommercialRecord.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractCommercialRecord.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias(final SessionContext ctx)
	{
		return (Set<Media>)MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Set<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final Set<Media> value)
	{
		setMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final Media value)
	{
		addToMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final Media value)
	{
		removeFromMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.policies</code> attribute.
	 * @return the policies
	 */
	public Set<TravelogixPolicy> getPolicies(final SessionContext ctx)
	{
		final List<TravelogixPolicy> items = getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,
			"TravelogixPolicy",
			null,
			false,
			false
		);
		return new LinkedHashSet<TravelogixPolicy>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.policies</code> attribute.
	 * @return the policies
	 */
	public Set<TravelogixPolicy> getPolicies()
	{
		return getPolicies( getSession().getSessionContext() );
	}
	
	public long getPoliciesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,
			"TravelogixPolicy",
			null
		);
	}
	
	public long getPoliciesCount()
	{
		return getPoliciesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.policies</code> attribute. 
	 * @param value the policies
	 */
	public void setPolicies(final SessionContext ctx, final Set<TravelogixPolicy> value)
	{
		new PartOfHandler<Set<TravelogixPolicy>>()
		{
			@Override
			protected Set<TravelogixPolicy> doGetValue(final SessionContext ctx)
			{
				return getPolicies( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Set<TravelogixPolicy> _value)
			{
				final Set<TravelogixPolicy> value = _value;
				setLinkedItems( 
					ctx,
					true,
					SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(COMMERCIAL2TRAVELOGIXPOLICY_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.policies</code> attribute. 
	 * @param value the policies
	 */
	public void setPolicies(final Set<TravelogixPolicy> value)
	{
		setPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policies. 
	 * @param value the item to add to policies
	 */
	public void addToPolicies(final SessionContext ctx, final TravelogixPolicy value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2TRAVELOGIXPOLICY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policies. 
	 * @param value the item to add to policies
	 */
	public void addToPolicies(final TravelogixPolicy value)
	{
		addToPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policies. 
	 * @param value the item to remove from policies
	 */
	public void removeFromPolicies(final SessionContext ctx, final TravelogixPolicy value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2TRAVELOGIXPOLICY_MARKMODIFIED)
		);
		if( !getLinkedItems( ctx, true,SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,null).contains( value ) )
		{
			try
			{
				value.remove( ctx );
			}
			catch( ConsistencyCheckException e )
			{
				throw new JaloSystemException(e);
			}
		}
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policies. 
	 * @param value the item to remove from policies
	 */
	public void removeFromPolicies(final TravelogixPolicy value)
	{
		removeFromPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.products</code> attribute.
	 * @return the products
	 */
	public Collection<Product> getProducts(final SessionContext ctx)
	{
		final List<Product> items = getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2PRODUCT,
			"Product",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.products</code> attribute.
	 * @return the products
	 */
	public Collection<Product> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	public long getProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2PRODUCT,
			"Product",
			null
		);
	}
	
	public long getProductsCount()
	{
		return getProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Collection<Product> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2PRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Collection<Product> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final Product value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2PRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final Product value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final Product value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2PRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final Product value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialRecord.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialRecord.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
