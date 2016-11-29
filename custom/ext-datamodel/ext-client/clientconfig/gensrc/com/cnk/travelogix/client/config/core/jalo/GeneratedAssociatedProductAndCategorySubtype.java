/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AssociatedCategories;
import com.cnk.travelogix.client.config.core.jalo.AssociatedProduct;
import com.cnk.travelogix.client.config.core.jalo.AssociatedSupplier;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.AssociatedProductAndCategorySubtype AssociatedProductAndCategorySubtype}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssociatedProductAndCategorySubtype extends GenericItem
{
	/** Qualifier of the <code>AssociatedProductAndCategorySubtype.enabled</code> attribute **/
	public static final String ENABLED = "enabled";
	/** Qualifier of the <code>AssociatedProductAndCategorySubtype.categorySubtype</code> attribute **/
	public static final String CATEGORYSUBTYPE = "categorySubtype";
	/** Qualifier of the <code>AssociatedProductAndCategorySubtype.enabledProducts</code> attribute **/
	public static final String ENABLEDPRODUCTS = "enabledProducts";
	/** Qualifier of the <code>AssociatedProductAndCategorySubtype.enabledSuppliers</code> attribute **/
	public static final String ENABLEDSUPPLIERS = "enabledSuppliers";
	/** Qualifier of the <code>AssociatedProductAndCategorySubtype.categories</code> attribute **/
	public static final String CATEGORIES = "categories";
	/** Qualifier of the <code>AssociatedProductAndCategorySubtype.suppliers</code> attribute **/
	public static final String SUPPLIERS = "suppliers";
	/** Qualifier of the <code>AssociatedProductAndCategorySubtype.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CATEGORIES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAssociatedProductAndCategorySubtype> CATEGORIESHANDLER = new BidirectionalOneToManyHandler<GeneratedAssociatedProductAndCategorySubtype>(
	ClientconfigConstants.TC.ASSOCIATEDPRODUCTANDCATEGORYSUBTYPE,
	false,
	"categories",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociatedSupplier> SUPPLIERSHANDLER = new OneToManyHandler<AssociatedSupplier>(
	ClientconfigConstants.TC.ASSOCIATEDSUPPLIER,
	false,
	"categorySubtypesAndProducts",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociatedProduct> PRODUCTSHANDLER = new OneToManyHandler<AssociatedProduct>(
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
		tmp.put(ENABLED, AttributeMode.INITIAL);
		tmp.put(CATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(ENABLEDPRODUCTS, AttributeMode.INITIAL);
		tmp.put(ENABLEDSUPPLIERS, AttributeMode.INITIAL);
		tmp.put(CATEGORIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.categories</code> attribute.
	 * @return the categories
	 */
	public AssociatedCategories getCategories(final SessionContext ctx)
	{
		return (AssociatedCategories)getProperty( ctx, CATEGORIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.categories</code> attribute.
	 * @return the categories
	 */
	public AssociatedCategories getCategories()
	{
		return getCategories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.categories</code> attribute. 
	 * @param value the categories
	 */
	public void setCategories(final SessionContext ctx, final AssociatedCategories value)
	{
		CATEGORIESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.categories</code> attribute. 
	 * @param value the categories
	 */
	public void setCategories(final AssociatedCategories value)
	{
		setCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.categorySubtype</code> attribute.
	 * @return the categorySubtype
	 */
	public ProductCategorySubType getCategorySubtype(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, CATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.categorySubtype</code> attribute.
	 * @return the categorySubtype
	 */
	public ProductCategorySubType getCategorySubtype()
	{
		return getCategorySubtype( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.categorySubtype</code> attribute. 
	 * @param value the categorySubtype
	 */
	public void setCategorySubtype(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, CATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.categorySubtype</code> attribute. 
	 * @param value the categorySubtype
	 */
	public void setCategorySubtype(final ProductCategorySubType value)
	{
		setCategorySubtype( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CATEGORIESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabled</code> attribute.
	 * @return the enabled
	 */
	public Boolean isEnabled(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabled</code> attribute.
	 * @return the enabled
	 */
	public Boolean isEnabled()
	{
		return isEnabled( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabled</code> attribute. 
	 * @return the enabled
	 */
	public boolean isEnabledAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnabled( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabled</code> attribute. 
	 * @return the enabled
	 */
	public boolean isEnabledAsPrimitive()
	{
		return isEnabledAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final Boolean value)
	{
		setEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final SessionContext ctx, final boolean value)
	{
		setEnabled( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final boolean value)
	{
		setEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabledProducts</code> attribute.
	 * @return the enabledProducts
	 */
	public Boolean isEnabledProducts(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ENABLEDPRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabledProducts</code> attribute.
	 * @return the enabledProducts
	 */
	public Boolean isEnabledProducts()
	{
		return isEnabledProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabledProducts</code> attribute. 
	 * @return the enabledProducts
	 */
	public boolean isEnabledProductsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnabledProducts( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabledProducts</code> attribute. 
	 * @return the enabledProducts
	 */
	public boolean isEnabledProductsAsPrimitive()
	{
		return isEnabledProductsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabledProducts</code> attribute. 
	 * @param value the enabledProducts
	 */
	public void setEnabledProducts(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ENABLEDPRODUCTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabledProducts</code> attribute. 
	 * @param value the enabledProducts
	 */
	public void setEnabledProducts(final Boolean value)
	{
		setEnabledProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabledProducts</code> attribute. 
	 * @param value the enabledProducts
	 */
	public void setEnabledProducts(final SessionContext ctx, final boolean value)
	{
		setEnabledProducts( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabledProducts</code> attribute. 
	 * @param value the enabledProducts
	 */
	public void setEnabledProducts(final boolean value)
	{
		setEnabledProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabledSuppliers</code> attribute.
	 * @return the enabledSuppliers
	 */
	public Boolean isEnabledSuppliers(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ENABLEDSUPPLIERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabledSuppliers</code> attribute.
	 * @return the enabledSuppliers
	 */
	public Boolean isEnabledSuppliers()
	{
		return isEnabledSuppliers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabledSuppliers</code> attribute. 
	 * @return the enabledSuppliers
	 */
	public boolean isEnabledSuppliersAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnabledSuppliers( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.enabledSuppliers</code> attribute. 
	 * @return the enabledSuppliers
	 */
	public boolean isEnabledSuppliersAsPrimitive()
	{
		return isEnabledSuppliersAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabledSuppliers</code> attribute. 
	 * @param value the enabledSuppliers
	 */
	public void setEnabledSuppliers(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ENABLEDSUPPLIERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabledSuppliers</code> attribute. 
	 * @param value the enabledSuppliers
	 */
	public void setEnabledSuppliers(final Boolean value)
	{
		setEnabledSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabledSuppliers</code> attribute. 
	 * @param value the enabledSuppliers
	 */
	public void setEnabledSuppliers(final SessionContext ctx, final boolean value)
	{
		setEnabledSuppliers( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.enabledSuppliers</code> attribute. 
	 * @param value the enabledSuppliers
	 */
	public void setEnabledSuppliers(final boolean value)
	{
		setEnabledSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.products</code> attribute.
	 * @return the products
	 */
	public Collection<AssociatedProduct> getProducts(final SessionContext ctx)
	{
		return PRODUCTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.products</code> attribute.
	 * @return the products
	 */
	public Collection<AssociatedProduct> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Collection<AssociatedProduct> value)
	{
		PRODUCTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.products</code> attribute. 
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
		PRODUCTSHANDLER.addValue( ctx, this, value );
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
		PRODUCTSHANDLER.removeValue( ctx, this, value );
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
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Collection<AssociatedSupplier> getSuppliers(final SessionContext ctx)
	{
		return SUPPLIERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProductAndCategorySubtype.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Collection<AssociatedSupplier> getSuppliers()
	{
		return getSuppliers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final SessionContext ctx, final Collection<AssociatedSupplier> value)
	{
		SUPPLIERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProductAndCategorySubtype.suppliers</code> attribute. 
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
		SUPPLIERSHANDLER.addValue( ctx, this, value );
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
		SUPPLIERSHANDLER.removeValue( ctx, this, value );
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
