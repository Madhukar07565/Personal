/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AssociatedCredentials;
import com.cnk.travelogix.client.config.core.jalo.AssociatedProduct;
import com.cnk.travelogix.client.config.core.jalo.AssociatedProductAndCategorySubtype;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
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
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.AssociatedSupplier AssociatedSupplier}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssociatedSupplier extends GenericItem
{
	/** Qualifier of the <code>AssociatedSupplier.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>AssociatedSupplier.credentials</code> attribute **/
	public static final String CREDENTIALS = "credentials";
	/** Qualifier of the <code>AssociatedSupplier.categorySubtypesAndProducts</code> attribute **/
	public static final String CATEGORYSUBTYPESANDPRODUCTS = "categorySubtypesAndProducts";
	/** Qualifier of the <code>AssociatedSupplier.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Relation ordering override parameter constants for AssociatedSupplier2AssociatedProduct from ((clientconfig))*/
	protected static String ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_SRC_ORDERED = "relation.AssociatedSupplier2AssociatedProduct.source.ordered";
	protected static String ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_TGT_ORDERED = "relation.AssociatedSupplier2AssociatedProduct.target.ordered";
	/** Relation disable markmodifed parameter constants for AssociatedSupplier2AssociatedProduct from ((clientconfig))*/
	protected static String ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_MARKMODIFIED = "relation.AssociatedSupplier2AssociatedProduct.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n CREDENTIALS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociatedCredentials> CREDENTIALSHANDLER = new OneToManyHandler<AssociatedCredentials>(
	ClientconfigConstants.TC.ASSOCIATEDCREDENTIALS,
	false,
	"suppliers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CATEGORYSUBTYPESANDPRODUCTS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAssociatedSupplier> CATEGORYSUBTYPESANDPRODUCTSHANDLER = new BidirectionalOneToManyHandler<GeneratedAssociatedSupplier>(
	ClientconfigConstants.TC.ASSOCIATEDSUPPLIER,
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
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(CATEGORYSUBTYPESANDPRODUCTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedSupplier.categorySubtypesAndProducts</code> attribute.
	 * @return the categorySubtypesAndProducts
	 */
	public AssociatedProductAndCategorySubtype getCategorySubtypesAndProducts(final SessionContext ctx)
	{
		return (AssociatedProductAndCategorySubtype)getProperty( ctx, CATEGORYSUBTYPESANDPRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedSupplier.categorySubtypesAndProducts</code> attribute.
	 * @return the categorySubtypesAndProducts
	 */
	public AssociatedProductAndCategorySubtype getCategorySubtypesAndProducts()
	{
		return getCategorySubtypesAndProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedSupplier.categorySubtypesAndProducts</code> attribute. 
	 * @param value the categorySubtypesAndProducts
	 */
	public void setCategorySubtypesAndProducts(final SessionContext ctx, final AssociatedProductAndCategorySubtype value)
	{
		CATEGORYSUBTYPESANDPRODUCTSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedSupplier.categorySubtypesAndProducts</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>AssociatedSupplier.credentials</code> attribute.
	 * @return the credentials
	 */
	public Collection<AssociatedCredentials> getCredentials(final SessionContext ctx)
	{
		return CREDENTIALSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedSupplier.credentials</code> attribute.
	 * @return the credentials
	 */
	public Collection<AssociatedCredentials> getCredentials()
	{
		return getCredentials( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedSupplier.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final SessionContext ctx, final Collection<AssociatedCredentials> value)
	{
		CREDENTIALSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedSupplier.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final Collection<AssociatedCredentials> value)
	{
		setCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to credentials. 
	 * @param value the item to add to credentials
	 */
	public void addToCredentials(final SessionContext ctx, final AssociatedCredentials value)
	{
		CREDENTIALSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to credentials. 
	 * @param value the item to add to credentials
	 */
	public void addToCredentials(final AssociatedCredentials value)
	{
		addToCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from credentials. 
	 * @param value the item to remove from credentials
	 */
	public void removeFromCredentials(final SessionContext ctx, final AssociatedCredentials value)
	{
		CREDENTIALSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from credentials. 
	 * @param value the item to remove from credentials
	 */
	public void removeFromCredentials(final AssociatedCredentials value)
	{
		removeFromCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedSupplier.products</code> attribute.
	 * @return the products
	 */
	public Collection<AssociatedProduct> getProducts(final SessionContext ctx)
	{
		final List<AssociatedProduct> items = getLinkedItems( 
			ctx,
			true,
			ClientconfigConstants.Relations.ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT,
			"AssociatedProduct",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedSupplier.products</code> attribute.
	 * @return the products
	 */
	public Collection<AssociatedProduct> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	public long getProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ClientconfigConstants.Relations.ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT,
			"AssociatedProduct",
			null
		);
	}
	
	public long getProductsCount()
	{
		return getProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedSupplier.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Collection<AssociatedProduct> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ClientconfigConstants.Relations.ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedSupplier.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Collection<AssociatedProduct> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final AssociatedProduct value)
	{
		addLinkedItems( 
			ctx,
			true,
			ClientconfigConstants.Relations.ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final AssociatedProduct value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final AssociatedProduct value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ClientconfigConstants.Relations.ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ASSOCIATEDSUPPLIER2ASSOCIATEDPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final AssociatedProduct value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedSupplier.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedSupplier.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedSupplier.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedSupplier.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
}
