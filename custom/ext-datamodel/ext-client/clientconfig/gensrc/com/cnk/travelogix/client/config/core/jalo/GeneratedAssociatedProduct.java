/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AssociatedProductAndCategorySubtype;
import com.cnk.travelogix.client.config.core.jalo.AssociatedSupplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.AssociatedProduct AssociatedProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssociatedProduct extends GenericItem
{
	/** Qualifier of the <code>AssociatedProduct.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>AssociatedProduct.categorySubtypesAndProducts</code> attribute **/
	public static final String CATEGORYSUBTYPESANDPRODUCTS = "categorySubtypesAndProducts";
	/** Qualifier of the <code>AssociatedProduct.suppliers</code> attribute **/
	public static final String SUPPLIERS = "suppliers";
	/** Relation ordering override parameter constants for AssociatedSupplier2AssociatedProduct from ((clientconfig))*/
	protected static String ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_SRC_ORDERED = "relation.AssociatedSupplier2AssociatedProduct.source.ordered";
	protected static String ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_TGT_ORDERED = "relation.AssociatedSupplier2AssociatedProduct.target.ordered";
	/** Relation disable markmodifed parameter constants for AssociatedSupplier2AssociatedProduct from ((clientconfig))*/
	protected static String ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_MARKMODIFIED = "relation.AssociatedSupplier2AssociatedProduct.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CATEGORYSUBTYPESANDPRODUCTS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAssociatedProduct> CATEGORYSUBTYPESANDPRODUCTSHANDLER = new BidirectionalOneToManyHandler<GeneratedAssociatedProduct>(
	ClientconfigConstants.TC.ASSOCIATEDPRODUCT,
	false,
	"categorySubtypesAndProducts",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(CATEGORYSUBTYPESANDPRODUCTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProduct.categorySubtypesAndProducts</code> attribute.
	 * @return the categorySubtypesAndProducts
	 */
	public AssociatedProductAndCategorySubtype getCategorySubtypesAndProducts(final SessionContext ctx)
	{
		return (AssociatedProductAndCategorySubtype)getProperty( ctx, CATEGORYSUBTYPESANDPRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProduct.categorySubtypesAndProducts</code> attribute.
	 * @return the categorySubtypesAndProducts
	 */
	public AssociatedProductAndCategorySubtype getCategorySubtypesAndProducts()
	{
		return getCategorySubtypesAndProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProduct.categorySubtypesAndProducts</code> attribute. 
	 * @param value the categorySubtypesAndProducts
	 */
	public void setCategorySubtypesAndProducts(final SessionContext ctx, final AssociatedProductAndCategorySubtype value)
	{
		CATEGORYSUBTYPESANDPRODUCTSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProduct.categorySubtypesAndProducts</code> attribute. 
	 * @param value the categorySubtypesAndProducts
	 */
	public void setCategorySubtypesAndProducts(final AssociatedProductAndCategorySubtype value)
	{
		setCategorySubtypesAndProducts( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CATEGORYSUBTYPESANDPRODUCTSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProduct.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProduct.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProduct.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProduct.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProduct.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Collection<AssociatedSupplier> getSuppliers(final SessionContext ctx)
	{
		final List<AssociatedSupplier> items = getLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT,
			"AssociatedSupplier",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProduct.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Collection<AssociatedSupplier> getSuppliers()
	{
		return getSuppliers( getSession().getSessionContext() );
	}
	
	public long getSuppliersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			ClientconfigConstants.Relations.ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT,
			"AssociatedSupplier",
			null
		);
	}
	
	public long getSuppliersCount()
	{
		return getSuppliersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProduct.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final SessionContext ctx, final Collection<AssociatedSupplier> value)
	{
		setLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProduct.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final Collection<AssociatedSupplier> value)
	{
		setSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final SessionContext ctx, final AssociatedSupplier value)
	{
		addLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final AssociatedSupplier value)
	{
		addToSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final SessionContext ctx, final AssociatedSupplier value)
	{
		removeLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final AssociatedSupplier value)
	{
		removeFromSuppliers( getSession().getSessionContext(), value );
	}
	
}
