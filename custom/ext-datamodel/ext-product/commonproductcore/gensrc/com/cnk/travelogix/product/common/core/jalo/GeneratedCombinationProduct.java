/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.PointOfSale;
import com.cnk.travelogix.product.common.core.jalo.PriceRetention;
import com.cnk.travelogix.product.common.core.jalo.ProductDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.CombinationProduct CombinationProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCombinationProduct extends Product
{
	/** Qualifier of the <code>CombinationProduct.comboFailDueToSingleProduct</code> attribute **/
	public static final String COMBOFAILDUETOSINGLEPRODUCT = "comboFailDueToSingleProduct";
	/** Qualifier of the <code>CombinationProduct.singleProductCancellation</code> attribute **/
	public static final String SINGLEPRODUCTCANCELLATION = "singleProductCancellation";
	/** Qualifier of the <code>CombinationProduct.priceRetention</code> attribute **/
	public static final String PRICERETENTION = "priceRetention";
	/** Qualifier of the <code>CombinationProduct.entity</code> attribute **/
	public static final String ENTITY = "entity";
	/** Qualifier of the <code>CombinationProduct.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>CombinationProduct.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Qualifier of the <code>CombinationProduct.pointOfSale</code> attribute **/
	public static final String POINTOFSALE = "pointOfSale";
	/** Relation ordering override parameter constants for CombinationProductToPointOfSale from ((commonproductcore))*/
	protected static String COMBINATIONPRODUCTTOPOINTOFSALE_SRC_ORDERED = "relation.CombinationProductToPointOfSale.source.ordered";
	protected static String COMBINATIONPRODUCTTOPOINTOFSALE_TGT_ORDERED = "relation.CombinationProductToPointOfSale.target.ordered";
	/** Relation disable markmodifed parameter constants for CombinationProductToPointOfSale from ((commonproductcore))*/
	protected static String COMBINATIONPRODUCTTOPOINTOFSALE_MARKMODIFIED = "relation.CombinationProductToPointOfSale.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductDefinition> PRODUCTSHANDLER = new OneToManyHandler<ProductDefinition>(
	CommonproductcoreConstants.TC.PRODUCTDEFINITION,
	false,
	"combinationProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMBOFAILDUETOSINGLEPRODUCT, AttributeMode.INITIAL);
		tmp.put(SINGLEPRODUCTCANCELLATION, AttributeMode.INITIAL);
		tmp.put(PRICERETENTION, AttributeMode.INITIAL);
		tmp.put(ENTITY, AttributeMode.INITIAL);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.comboFailDueToSingleProduct</code> attribute.
	 * @return the comboFailDueToSingleProduct - Fail Entire Combination if any product Failed in the booking
	 */
	public Boolean isComboFailDueToSingleProduct(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COMBOFAILDUETOSINGLEPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.comboFailDueToSingleProduct</code> attribute.
	 * @return the comboFailDueToSingleProduct - Fail Entire Combination if any product Failed in the booking
	 */
	public Boolean isComboFailDueToSingleProduct()
	{
		return isComboFailDueToSingleProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.comboFailDueToSingleProduct</code> attribute. 
	 * @return the comboFailDueToSingleProduct - Fail Entire Combination if any product Failed in the booking
	 */
	public boolean isComboFailDueToSingleProductAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isComboFailDueToSingleProduct( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.comboFailDueToSingleProduct</code> attribute. 
	 * @return the comboFailDueToSingleProduct - Fail Entire Combination if any product Failed in the booking
	 */
	public boolean isComboFailDueToSingleProductAsPrimitive()
	{
		return isComboFailDueToSingleProductAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.comboFailDueToSingleProduct</code> attribute. 
	 * @param value the comboFailDueToSingleProduct - Fail Entire Combination if any product Failed in the booking
	 */
	public void setComboFailDueToSingleProduct(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COMBOFAILDUETOSINGLEPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.comboFailDueToSingleProduct</code> attribute. 
	 * @param value the comboFailDueToSingleProduct - Fail Entire Combination if any product Failed in the booking
	 */
	public void setComboFailDueToSingleProduct(final Boolean value)
	{
		setComboFailDueToSingleProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.comboFailDueToSingleProduct</code> attribute. 
	 * @param value the comboFailDueToSingleProduct - Fail Entire Combination if any product Failed in the booking
	 */
	public void setComboFailDueToSingleProduct(final SessionContext ctx, final boolean value)
	{
		setComboFailDueToSingleProduct( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.comboFailDueToSingleProduct</code> attribute. 
	 * @param value the comboFailDueToSingleProduct - Fail Entire Combination if any product Failed in the booking
	 */
	public void setComboFailDueToSingleProduct(final boolean value)
	{
		setComboFailDueToSingleProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.entity</code> attribute.
	 * @return the entity - Entity Type
	 */
	public Principal getEntity(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, ENTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.entity</code> attribute.
	 * @return the entity - Entity Type
	 */
	public Principal getEntity()
	{
		return getEntity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.entity</code> attribute. 
	 * @param value the entity - Entity Type
	 */
	public void setEntity(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, ENTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.entity</code> attribute. 
	 * @param value the entity - Entity Type
	 */
	public void setEntity(final Principal value)
	{
		setEntity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public Collection<PointOfSale> getPointOfSale(final SessionContext ctx)
	{
		final List<PointOfSale> items = getLinkedItems( 
			ctx,
			true,
			CommonproductcoreConstants.Relations.COMBINATIONPRODUCTTOPOINTOFSALE,
			"PointOfSale",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public Collection<PointOfSale> getPointOfSale()
	{
		return getPointOfSale( getSession().getSessionContext() );
	}
	
	public long getPointOfSaleCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			CommonproductcoreConstants.Relations.COMBINATIONPRODUCTTOPOINTOFSALE,
			"PointOfSale",
			null
		);
	}
	
	public long getPointOfSaleCount()
	{
		return getPointOfSaleCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final SessionContext ctx, final Collection<PointOfSale> value)
	{
		setLinkedItems( 
			ctx,
			true,
			CommonproductcoreConstants.Relations.COMBINATIONPRODUCTTOPOINTOFSALE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMBINATIONPRODUCTTOPOINTOFSALE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final Collection<PointOfSale> value)
	{
		setPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pointOfSale. 
	 * @param value the item to add to pointOfSale
	 */
	public void addToPointOfSale(final SessionContext ctx, final PointOfSale value)
	{
		addLinkedItems( 
			ctx,
			true,
			CommonproductcoreConstants.Relations.COMBINATIONPRODUCTTOPOINTOFSALE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMBINATIONPRODUCTTOPOINTOFSALE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pointOfSale. 
	 * @param value the item to add to pointOfSale
	 */
	public void addToPointOfSale(final PointOfSale value)
	{
		addToPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pointOfSale. 
	 * @param value the item to remove from pointOfSale
	 */
	public void removeFromPointOfSale(final SessionContext ctx, final PointOfSale value)
	{
		removeLinkedItems( 
			ctx,
			true,
			CommonproductcoreConstants.Relations.COMBINATIONPRODUCTTOPOINTOFSALE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMBINATIONPRODUCTTOPOINTOFSALE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pointOfSale. 
	 * @param value the item to remove from pointOfSale
	 */
	public void removeFromPointOfSale(final PointOfSale value)
	{
		removeFromPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.priceRetention</code> attribute.
	 * @return the priceRetention - Price retention
	 */
	public PriceRetention getPriceRetention(final SessionContext ctx)
	{
		return (PriceRetention)getProperty( ctx, PRICERETENTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.priceRetention</code> attribute.
	 * @return the priceRetention - Price retention
	 */
	public PriceRetention getPriceRetention()
	{
		return getPriceRetention( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.priceRetention</code> attribute. 
	 * @param value the priceRetention - Price retention
	 */
	public void setPriceRetention(final SessionContext ctx, final PriceRetention value)
	{
		setProperty(ctx, PRICERETENTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.priceRetention</code> attribute. 
	 * @param value the priceRetention - Price retention
	 */
	public void setPriceRetention(final PriceRetention value)
	{
		setPriceRetention( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.products</code> attribute.
	 * @return the products
	 */
	public Collection<ProductDefinition> getProducts(final SessionContext ctx)
	{
		return PRODUCTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.products</code> attribute.
	 * @return the products
	 */
	public Collection<ProductDefinition> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Collection<ProductDefinition> value)
	{
		PRODUCTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Collection<ProductDefinition> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final ProductDefinition value)
	{
		PRODUCTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final ProductDefinition value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final ProductDefinition value)
	{
		PRODUCTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final ProductDefinition value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.singleProductCancellation</code> attribute.
	 * @return the singleProductCancellation - Whether single product cancellation is allowed or not from the combination product
	 */
	public Boolean isSingleProductCancellation(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SINGLEPRODUCTCANCELLATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.singleProductCancellation</code> attribute.
	 * @return the singleProductCancellation - Whether single product cancellation is allowed or not from the combination product
	 */
	public Boolean isSingleProductCancellation()
	{
		return isSingleProductCancellation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.singleProductCancellation</code> attribute. 
	 * @return the singleProductCancellation - Whether single product cancellation is allowed or not from the combination product
	 */
	public boolean isSingleProductCancellationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSingleProductCancellation( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.singleProductCancellation</code> attribute. 
	 * @return the singleProductCancellation - Whether single product cancellation is allowed or not from the combination product
	 */
	public boolean isSingleProductCancellationAsPrimitive()
	{
		return isSingleProductCancellationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.singleProductCancellation</code> attribute. 
	 * @param value the singleProductCancellation - Whether single product cancellation is allowed or not from the combination product
	 */
	public void setSingleProductCancellation(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SINGLEPRODUCTCANCELLATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.singleProductCancellation</code> attribute. 
	 * @param value the singleProductCancellation - Whether single product cancellation is allowed or not from the combination product
	 */
	public void setSingleProductCancellation(final Boolean value)
	{
		setSingleProductCancellation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.singleProductCancellation</code> attribute. 
	 * @param value the singleProductCancellation - Whether single product cancellation is allowed or not from the combination product
	 */
	public void setSingleProductCancellation(final SessionContext ctx, final boolean value)
	{
		setSingleProductCancellation( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.singleProductCancellation</code> attribute. 
	 * @param value the singleProductCancellation - Whether single product cancellation is allowed or not from the combination product
	 */
	public void setSingleProductCancellation(final boolean value)
	{
		setSingleProductCancellation( getSession().getSessionContext(), value );
	}
	
}
