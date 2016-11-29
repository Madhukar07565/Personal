/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialDefinition AbstractCommercialDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractCommercialDefinition extends AbstractTravelogixItem
{
	/** Qualifier of the <code>AbstractCommercialDefinition.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>AbstractCommercialDefinition.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>AbstractCommercialDefinition.commercialHead</code> attribute **/
	public static final String COMMERCIALHEAD = "commercialHead";
	/** Qualifier of the <code>AbstractCommercialDefinition.commercialType</code> attribute **/
	public static final String COMMERCIALTYPE = "commercialType";
	/** Qualifier of the <code>AbstractCommercialDefinition.supplierMarkets</code> attribute **/
	public static final String SUPPLIERMARKETS = "supplierMarkets";
	/** Relation ordering override parameter constants for SupComlDef2SupMarketRel from ((suppliercommercialscore))*/
	protected static String SUPCOMLDEF2SUPMARKETREL_SRC_ORDERED = "relation.SupComlDef2SupMarketRel.source.ordered";
	protected static String SUPCOMLDEF2SUPMARKETREL_TGT_ORDERED = "relation.SupComlDef2SupMarketRel.target.ordered";
	/** Relation disable markmodifed parameter constants for SupComlDef2SupMarketRel from ((suppliercommercialscore))*/
	protected static String SUPCOMLDEF2SUPMARKETREL_MARKMODIFIED = "relation.SupComlDef2SupMarketRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(COMMERCIALHEAD, AttributeMode.INITIAL);
		tmp.put(COMMERCIALTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialDefinition.commercialHead</code> attribute.
	 * @return the commercialHead
	 */
	public EnumerationValue getCommercialHead(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALHEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialDefinition.commercialHead</code> attribute.
	 * @return the commercialHead
	 */
	public EnumerationValue getCommercialHead()
	{
		return getCommercialHead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialDefinition.commercialHead</code> attribute. 
	 * @param value the commercialHead
	 */
	public void setCommercialHead(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALHEAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialDefinition.commercialHead</code> attribute. 
	 * @param value the commercialHead
	 */
	public void setCommercialHead(final EnumerationValue value)
	{
		setCommercialHead( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialDefinition.commercialType</code> attribute.
	 * @return the commercialType
	 */
	public EnumerationValue getCommercialType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialDefinition.commercialType</code> attribute.
	 * @return the commercialType
	 */
	public EnumerationValue getCommercialType()
	{
		return getCommercialType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialDefinition.commercialType</code> attribute. 
	 * @param value the commercialType
	 */
	public void setCommercialType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialDefinition.commercialType</code> attribute. 
	 * @param value the commercialType
	 */
	public void setCommercialType(final EnumerationValue value)
	{
		setCommercialType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialDefinition.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialDefinition.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialDefinition.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialDefinition.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialDefinition.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialDefinition.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialDefinition.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialDefinition.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialDefinition.supplierMarkets</code> attribute.
	 * @return the supplierMarkets
	 */
	public Set<SupplierMarket> getSupplierMarkets(final SessionContext ctx)
	{
		final List<SupplierMarket> items = getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.SUPCOMLDEF2SUPMARKETREL,
			"SupplierMarket",
			null,
			false,
			false
		);
		return new LinkedHashSet<SupplierMarket>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCommercialDefinition.supplierMarkets</code> attribute.
	 * @return the supplierMarkets
	 */
	public Set<SupplierMarket> getSupplierMarkets()
	{
		return getSupplierMarkets( getSession().getSessionContext() );
	}
	
	public long getSupplierMarketsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.SUPCOMLDEF2SUPMARKETREL,
			"SupplierMarket",
			null
		);
	}
	
	public long getSupplierMarketsCount()
	{
		return getSupplierMarketsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialDefinition.supplierMarkets</code> attribute. 
	 * @param value the supplierMarkets
	 */
	public void setSupplierMarkets(final SessionContext ctx, final Set<SupplierMarket> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.SUPCOMLDEF2SUPMARKETREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPCOMLDEF2SUPMARKETREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCommercialDefinition.supplierMarkets</code> attribute. 
	 * @param value the supplierMarkets
	 */
	public void setSupplierMarkets(final Set<SupplierMarket> value)
	{
		setSupplierMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierMarkets. 
	 * @param value the item to add to supplierMarkets
	 */
	public void addToSupplierMarkets(final SessionContext ctx, final SupplierMarket value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.SUPCOMLDEF2SUPMARKETREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPCOMLDEF2SUPMARKETREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierMarkets. 
	 * @param value the item to add to supplierMarkets
	 */
	public void addToSupplierMarkets(final SupplierMarket value)
	{
		addToSupplierMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierMarkets. 
	 * @param value the item to remove from supplierMarkets
	 */
	public void removeFromSupplierMarkets(final SessionContext ctx, final SupplierMarket value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.SUPCOMLDEF2SUPMARKETREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPCOMLDEF2SUPMARKETREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierMarkets. 
	 * @param value the item to remove from supplierMarkets
	 */
	public void removeFromSupplierMarkets(final SupplierMarket value)
	{
		removeFromSupplierMarkets( getSession().getSessionContext(), value );
	}
	
}
