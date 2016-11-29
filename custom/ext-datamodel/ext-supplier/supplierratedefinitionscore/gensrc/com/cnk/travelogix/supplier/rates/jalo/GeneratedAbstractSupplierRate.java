/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RateRestriction;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SeasonDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SupplierAncillaryRate;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateDefinition;
import de.hybris.platform.europe1.constants.Europe1Constants;
import de.hybris.platform.europe1.jalo.TaxRow;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.StandardDateRange;
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
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem AbstractSupplierRate}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractSupplierRate extends AbstractTravelogixItem
{
	/** Qualifier of the <code>AbstractSupplierRate.productSubCategory</code> attribute **/
	public static final String PRODUCTSUBCATEGORY = "productSubCategory";
	/** Qualifier of the <code>AbstractSupplierRate.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>AbstractSupplierRate.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>AbstractSupplierRate.validity</code> attribute **/
	public static final String VALIDITY = "validity";
	/** Qualifier of the <code>AbstractSupplierRate.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>AbstractSupplierRate.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>AbstractSupplierRate.activeDateRange</code> attribute **/
	public static final String ACTIVEDATERANGE = "activeDateRange";
	/** Qualifier of the <code>AbstractSupplierRate.ancillary</code> attribute **/
	public static final String ANCILLARY = "ancillary";
	/** Qualifier of the <code>AbstractSupplierRate.defineSeasonality</code> attribute **/
	public static final String DEFINESEASONALITY = "defineSeasonality";
	/** Qualifier of the <code>AbstractSupplierRate.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>AbstractSupplierRate.companyRateInvRestrictions</code> attribute **/
	public static final String COMPANYRATEINVRESTRICTIONS = "companyRateInvRestrictions";
	/** Qualifier of the <code>AbstractSupplierRate.taxes</code> attribute **/
	public static final String TAXES = "taxes";
	/** Qualifier of the <code>AbstractSupplierRate.seasonDetails</code> attribute **/
	public static final String SEASONDETAILS = "seasonDetails";
	/** Qualifier of the <code>AbstractSupplierRate.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/** Relation ordering override parameter constants for AbsSupplierRate2MediaRel from ((supplierratedefinitionscore))*/
	protected static String ABSSUPPLIERRATE2MEDIAREL_SRC_ORDERED = "relation.AbsSupplierRate2MediaRel.source.ordered";
	protected static String ABSSUPPLIERRATE2MEDIAREL_TGT_ORDERED = "relation.AbsSupplierRate2MediaRel.target.ordered";
	/** Relation disable markmodifed parameter constants for AbsSupplierRate2MediaRel from ((supplierratedefinitionscore))*/
	protected static String ABSSUPPLIERRATE2MEDIAREL_MARKMODIFIED = "relation.AbsSupplierRate2MediaRel.markmodified";
	/** Qualifier of the <code>AbstractSupplierRate.absRateDefinitions</code> attribute **/
	public static final String ABSRATEDEFINITIONS = "absRateDefinitions";
	/**
	* {@link OneToManyHandler} for handling 1:n COMPANYRATEINVRESTRICTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RateRestriction> COMPANYRATEINVRESTRICTIONSHANDLER = new OneToManyHandler<RateRestriction>(
	SupplierratedefinitionscoreConstants.TC.COMPANYRATEINVRESTRICTION,
	true,
	"supplierRate",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TAXES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TaxRow> TAXESHANDLER = new OneToManyHandler<TaxRow>(
	Europe1Constants.TC.TAXROW,
	true,
	"supplierRate",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SEASONDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SeasonDetail> SEASONDETAILSHANDLER = new OneToManyHandler<SeasonDetail>(
	SupplierratedefinitionscoreConstants.TC.SEASONDETAIL,
	true,
	"supplierRate",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ABSRATEDEFINITIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractRateDefinition> ABSRATEDEFINITIONSHANDLER = new OneToManyHandler<AbstractRateDefinition>(
	SupplierratedefinitionscoreConstants.TC.ABSTRACTRATEDEFINITION,
	false,
	"absSupplierRate",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTSUBCATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(VALIDITY, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(MARKET, AttributeMode.INITIAL);
		tmp.put(ACTIVEDATERANGE, AttributeMode.INITIAL);
		tmp.put(ANCILLARY, AttributeMode.INITIAL);
		tmp.put(DEFINESEASONALITY, AttributeMode.INITIAL);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.absRateDefinitions</code> attribute.
	 * @return the absRateDefinitions
	 */
	public Collection<AbstractRateDefinition> getAbsRateDefinitions(final SessionContext ctx)
	{
		return ABSRATEDEFINITIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.absRateDefinitions</code> attribute.
	 * @return the absRateDefinitions
	 */
	public Collection<AbstractRateDefinition> getAbsRateDefinitions()
	{
		return getAbsRateDefinitions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.absRateDefinitions</code> attribute. 
	 * @param value the absRateDefinitions
	 */
	public void setAbsRateDefinitions(final SessionContext ctx, final Collection<AbstractRateDefinition> value)
	{
		ABSRATEDEFINITIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.absRateDefinitions</code> attribute. 
	 * @param value the absRateDefinitions
	 */
	public void setAbsRateDefinitions(final Collection<AbstractRateDefinition> value)
	{
		setAbsRateDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to absRateDefinitions. 
	 * @param value the item to add to absRateDefinitions
	 */
	public void addToAbsRateDefinitions(final SessionContext ctx, final AbstractRateDefinition value)
	{
		ABSRATEDEFINITIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to absRateDefinitions. 
	 * @param value the item to add to absRateDefinitions
	 */
	public void addToAbsRateDefinitions(final AbstractRateDefinition value)
	{
		addToAbsRateDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from absRateDefinitions. 
	 * @param value the item to remove from absRateDefinitions
	 */
	public void removeFromAbsRateDefinitions(final SessionContext ctx, final AbstractRateDefinition value)
	{
		ABSRATEDEFINITIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from absRateDefinitions. 
	 * @param value the item to remove from absRateDefinitions
	 */
	public void removeFromAbsRateDefinitions(final AbstractRateDefinition value)
	{
		removeFromAbsRateDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.activeDateRange</code> attribute.
	 * @return the activeDateRange
	 */
	public Date getActiveDateRange(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTIVEDATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.activeDateRange</code> attribute.
	 * @return the activeDateRange
	 */
	public Date getActiveDateRange()
	{
		return getActiveDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.activeDateRange</code> attribute. 
	 * @param value the activeDateRange
	 */
	public void setActiveDateRange(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTIVEDATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.activeDateRange</code> attribute. 
	 * @param value the activeDateRange
	 */
	public void setActiveDateRange(final Date value)
	{
		setActiveDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.ancillary</code> attribute.
	 * @return the ancillary
	 */
	public SupplierAncillaryRate getAncillary(final SessionContext ctx)
	{
		return (SupplierAncillaryRate)getProperty( ctx, ANCILLARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.ancillary</code> attribute.
	 * @return the ancillary
	 */
	public SupplierAncillaryRate getAncillary()
	{
		return getAncillary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.ancillary</code> attribute. 
	 * @param value the ancillary
	 */
	public void setAncillary(final SessionContext ctx, final SupplierAncillaryRate value)
	{
		new PartOfHandler<SupplierAncillaryRate>()
		{
			@Override
			protected SupplierAncillaryRate doGetValue(final SessionContext ctx)
			{
				return getAncillary( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final SupplierAncillaryRate _value)
			{
				final SupplierAncillaryRate value = _value;
				setProperty(ctx, ANCILLARY,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.ancillary</code> attribute. 
	 * @param value the ancillary
	 */
	public void setAncillary(final SupplierAncillaryRate value)
	{
		setAncillary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.companyRateInvRestrictions</code> attribute.
	 * @return the companyRateInvRestrictions
	 */
	public Set<RateRestriction> getCompanyRateInvRestrictions(final SessionContext ctx)
	{
		return (Set<RateRestriction>)COMPANYRATEINVRESTRICTIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.companyRateInvRestrictions</code> attribute.
	 * @return the companyRateInvRestrictions
	 */
	public Set<RateRestriction> getCompanyRateInvRestrictions()
	{
		return getCompanyRateInvRestrictions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.companyRateInvRestrictions</code> attribute. 
	 * @param value the companyRateInvRestrictions
	 */
	public void setCompanyRateInvRestrictions(final SessionContext ctx, final Set<RateRestriction> value)
	{
		COMPANYRATEINVRESTRICTIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.companyRateInvRestrictions</code> attribute. 
	 * @param value the companyRateInvRestrictions
	 */
	public void setCompanyRateInvRestrictions(final Set<RateRestriction> value)
	{
		setCompanyRateInvRestrictions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyRateInvRestrictions. 
	 * @param value the item to add to companyRateInvRestrictions
	 */
	public void addToCompanyRateInvRestrictions(final SessionContext ctx, final RateRestriction value)
	{
		COMPANYRATEINVRESTRICTIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyRateInvRestrictions. 
	 * @param value the item to add to companyRateInvRestrictions
	 */
	public void addToCompanyRateInvRestrictions(final RateRestriction value)
	{
		addToCompanyRateInvRestrictions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyRateInvRestrictions. 
	 * @param value the item to remove from companyRateInvRestrictions
	 */
	public void removeFromCompanyRateInvRestrictions(final SessionContext ctx, final RateRestriction value)
	{
		COMPANYRATEINVRESTRICTIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyRateInvRestrictions. 
	 * @param value the item to remove from companyRateInvRestrictions
	 */
	public void removeFromCompanyRateInvRestrictions(final RateRestriction value)
	{
		removeFromCompanyRateInvRestrictions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.defineSeasonality</code> attribute.
	 * @return the defineSeasonality
	 */
	public Boolean isDefineSeasonality(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DEFINESEASONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.defineSeasonality</code> attribute.
	 * @return the defineSeasonality
	 */
	public Boolean isDefineSeasonality()
	{
		return isDefineSeasonality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.defineSeasonality</code> attribute. 
	 * @return the defineSeasonality
	 */
	public boolean isDefineSeasonalityAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDefineSeasonality( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.defineSeasonality</code> attribute. 
	 * @return the defineSeasonality
	 */
	public boolean isDefineSeasonalityAsPrimitive()
	{
		return isDefineSeasonalityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.defineSeasonality</code> attribute. 
	 * @param value the defineSeasonality
	 */
	public void setDefineSeasonality(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DEFINESEASONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.defineSeasonality</code> attribute. 
	 * @param value the defineSeasonality
	 */
	public void setDefineSeasonality(final Boolean value)
	{
		setDefineSeasonality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.defineSeasonality</code> attribute. 
	 * @param value the defineSeasonality
	 */
	public void setDefineSeasonality(final SessionContext ctx, final boolean value)
	{
		setDefineSeasonality( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.defineSeasonality</code> attribute. 
	 * @param value the defineSeasonality
	 */
	public void setDefineSeasonality(final boolean value)
	{
		setDefineSeasonality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.market</code> attribute.
	 * @return the market
	 */
	public SupplierMarket getMarket(final SessionContext ctx)
	{
		return (SupplierMarket)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.market</code> attribute.
	 * @return the market
	 */
	public SupplierMarket getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.market</code> attribute. 
	 * @param value the market
	 */
	public void setMarket(final SessionContext ctx, final SupplierMarket value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.market</code> attribute. 
	 * @param value the market
	 */
	public void setMarket(final SupplierMarket value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias(final SessionContext ctx)
	{
		final List<Media> items = getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSSUPPLIERRATE2MEDIAREL,
			"Media",
			null,
			false,
			false
		);
		return new LinkedHashSet<Media>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	public long getMediasCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSSUPPLIERRATE2MEDIAREL,
			"Media",
			null
		);
	}
	
	public long getMediasCount()
	{
		return getMediasCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Set<Media> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSSUPPLIERRATE2MEDIAREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSSUPPLIERRATE2MEDIAREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.medias</code> attribute. 
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
		addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSSUPPLIERRATE2MEDIAREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSSUPPLIERRATE2MEDIAREL_MARKMODIFIED)
		);
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
		removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSSUPPLIERRATE2MEDIAREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSSUPPLIERRATE2MEDIAREL_MARKMODIFIED)
		);
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
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.productSubCategory</code> attribute.
	 * @return the productSubCategory
	 */
	public ProductCategorySubType getProductSubCategory(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTSUBCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.productSubCategory</code> attribute.
	 * @return the productSubCategory
	 */
	public ProductCategorySubType getProductSubCategory()
	{
		return getProductSubCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.productSubCategory</code> attribute. 
	 * @param value the productSubCategory
	 */
	public void setProductSubCategory(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTSUBCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.productSubCategory</code> attribute. 
	 * @param value the productSubCategory
	 */
	public void setProductSubCategory(final ProductCategorySubType value)
	{
		setProductSubCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.seasonDetails</code> attribute.
	 * @return the seasonDetails
	 */
	public Set<SeasonDetail> getSeasonDetails(final SessionContext ctx)
	{
		return (Set<SeasonDetail>)SEASONDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.seasonDetails</code> attribute.
	 * @return the seasonDetails
	 */
	public Set<SeasonDetail> getSeasonDetails()
	{
		return getSeasonDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.seasonDetails</code> attribute. 
	 * @param value the seasonDetails
	 */
	public void setSeasonDetails(final SessionContext ctx, final Set<SeasonDetail> value)
	{
		SEASONDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.seasonDetails</code> attribute. 
	 * @param value the seasonDetails
	 */
	public void setSeasonDetails(final Set<SeasonDetail> value)
	{
		setSeasonDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to seasonDetails. 
	 * @param value the item to add to seasonDetails
	 */
	public void addToSeasonDetails(final SessionContext ctx, final SeasonDetail value)
	{
		SEASONDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to seasonDetails. 
	 * @param value the item to add to seasonDetails
	 */
	public void addToSeasonDetails(final SeasonDetail value)
	{
		addToSeasonDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from seasonDetails. 
	 * @param value the item to remove from seasonDetails
	 */
	public void removeFromSeasonDetails(final SessionContext ctx, final SeasonDetail value)
	{
		SEASONDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from seasonDetails. 
	 * @param value the item to remove from seasonDetails
	 */
	public void removeFromSeasonDetails(final SeasonDetail value)
	{
		removeFromSeasonDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.taxes</code> attribute.
	 * @return the taxes
	 */
	public Set<TaxRow> getTaxes(final SessionContext ctx)
	{
		return (Set<TaxRow>)TAXESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.taxes</code> attribute.
	 * @return the taxes
	 */
	public Set<TaxRow> getTaxes()
	{
		return getTaxes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final SessionContext ctx, final Set<TaxRow> value)
	{
		TAXESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final Set<TaxRow> value)
	{
		setTaxes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxes. 
	 * @param value the item to add to taxes
	 */
	public void addToTaxes(final SessionContext ctx, final TaxRow value)
	{
		TAXESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxes. 
	 * @param value the item to add to taxes
	 */
	public void addToTaxes(final TaxRow value)
	{
		addToTaxes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxes. 
	 * @param value the item to remove from taxes
	 */
	public void removeFromTaxes(final SessionContext ctx, final TaxRow value)
	{
		TAXESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxes. 
	 * @param value the item to remove from taxes
	 */
	public void removeFromTaxes(final TaxRow value)
	{
		removeFromTaxes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.validity</code> attribute.
	 * @return the validity
	 */
	public StandardDateRange getValidity(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, VALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.validity</code> attribute.
	 * @return the validity
	 */
	public StandardDateRange getValidity()
	{
		return getValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.validity</code> attribute. 
	 * @param value the validity
	 */
	public void setValidity(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, VALIDITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.validity</code> attribute. 
	 * @param value the validity
	 */
	public void setValidity(final StandardDateRange value)
	{
		setValidity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierRate.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierRate.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
