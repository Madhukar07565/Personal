/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.AbstractProductInventoryDefinition;
import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory AssociateInventory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssociateInventory extends GenericItem
{
	/** Qualifier of the <code>AssociateInventory.inventoryFor</code> attribute **/
	public static final String INVENTORYFOR = "inventoryFor";
	/** Qualifier of the <code>AssociateInventory.productCategories</code> attribute **/
	public static final String PRODUCTCATEGORIES = "productCategories";
	/** Qualifier of the <code>AssociateInventory.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>AssociateInventory.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Qualifier of the <code>AssociateInventory.variants</code> attribute **/
	public static final String VARIANTS = "variants";
	/** Qualifier of the <code>AssociateInventory.numberOfDistributedInventory</code> attribute **/
	public static final String NUMBEROFDISTRIBUTEDINVENTORY = "numberOfDistributedInventory";
	/** Qualifier of the <code>AssociateInventory.abstractProductInventoryDefinitionPOS</code> attribute **/
	public static final String ABSTRACTPRODUCTINVENTORYDEFINITIONPOS = "abstractProductInventoryDefinitionPOS";
	/** Qualifier of the <code>AssociateInventory.abstractProductInventoryDefinition</code> attribute **/
	public static final String ABSTRACTPRODUCTINVENTORYDEFINITION = "abstractProductInventoryDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTRACTPRODUCTINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAssociateInventory> ABSTRACTPRODUCTINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAssociateInventory>(
	CommoninventorycoreConstants.TC.ASSOCIATEINVENTORY,
	false,
	"abstractProductInventoryDefinition",
	"abstractProductInventoryDefinitionPOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INVENTORYFOR, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORIES, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCTS, AttributeMode.INITIAL);
		tmp.put(VARIANTS, AttributeMode.INITIAL);
		tmp.put(NUMBEROFDISTRIBUTEDINVENTORY, AttributeMode.INITIAL);
		tmp.put(ABSTRACTPRODUCTINVENTORYDEFINITIONPOS, AttributeMode.INITIAL);
		tmp.put(ABSTRACTPRODUCTINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractProductInventoryDefinition</code> attribute.
	 * @return the abstractProductInventoryDefinition
	 */
	public AbstractProductInventoryDefinition getAbstractProductInventoryDefinition(final SessionContext ctx)
	{
		return (AbstractProductInventoryDefinition)getProperty( ctx, ABSTRACTPRODUCTINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractProductInventoryDefinition</code> attribute.
	 * @return the abstractProductInventoryDefinition
	 */
	public AbstractProductInventoryDefinition getAbstractProductInventoryDefinition()
	{
		return getAbstractProductInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractProductInventoryDefinition</code> attribute. 
	 * @param value the abstractProductInventoryDefinition
	 */
	public void setAbstractProductInventoryDefinition(final SessionContext ctx, final AbstractProductInventoryDefinition value)
	{
		ABSTRACTPRODUCTINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractProductInventoryDefinition</code> attribute. 
	 * @param value the abstractProductInventoryDefinition
	 */
	public void setAbstractProductInventoryDefinition(final AbstractProductInventoryDefinition value)
	{
		setAbstractProductInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractProductInventoryDefinitionPOS</code> attribute.
	 * @return the abstractProductInventoryDefinitionPOS
	 */
	 Integer getAbstractProductInventoryDefinitionPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ABSTRACTPRODUCTINVENTORYDEFINITIONPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractProductInventoryDefinitionPOS</code> attribute.
	 * @return the abstractProductInventoryDefinitionPOS
	 */
	 Integer getAbstractProductInventoryDefinitionPOS()
	{
		return getAbstractProductInventoryDefinitionPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractProductInventoryDefinitionPOS</code> attribute. 
	 * @return the abstractProductInventoryDefinitionPOS
	 */
	 int getAbstractProductInventoryDefinitionPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAbstractProductInventoryDefinitionPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractProductInventoryDefinitionPOS</code> attribute. 
	 * @return the abstractProductInventoryDefinitionPOS
	 */
	 int getAbstractProductInventoryDefinitionPOSAsPrimitive()
	{
		return getAbstractProductInventoryDefinitionPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractProductInventoryDefinitionPOS</code> attribute. 
	 * @param value the abstractProductInventoryDefinitionPOS
	 */
	 void setAbstractProductInventoryDefinitionPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ABSTRACTPRODUCTINVENTORYDEFINITIONPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractProductInventoryDefinitionPOS</code> attribute. 
	 * @param value the abstractProductInventoryDefinitionPOS
	 */
	 void setAbstractProductInventoryDefinitionPOS(final Integer value)
	{
		setAbstractProductInventoryDefinitionPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractProductInventoryDefinitionPOS</code> attribute. 
	 * @param value the abstractProductInventoryDefinitionPOS
	 */
	 void setAbstractProductInventoryDefinitionPOS(final SessionContext ctx, final int value)
	{
		setAbstractProductInventoryDefinitionPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractProductInventoryDefinitionPOS</code> attribute. 
	 * @param value the abstractProductInventoryDefinitionPOS
	 */
	 void setAbstractProductInventoryDefinitionPOS(final int value)
	{
		setAbstractProductInventoryDefinitionPOS( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ABSTRACTPRODUCTINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.inventoryFor</code> attribute.
	 * @return the inventoryFor - Inventory available for
	 */
	public EnumerationValue getInventoryFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, INVENTORYFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.inventoryFor</code> attribute.
	 * @return the inventoryFor - Inventory available for
	 */
	public EnumerationValue getInventoryFor()
	{
		return getInventoryFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.inventoryFor</code> attribute. 
	 * @param value the inventoryFor - Inventory available for
	 */
	public void setInventoryFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, INVENTORYFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.inventoryFor</code> attribute. 
	 * @param value the inventoryFor - Inventory available for
	 */
	public void setInventoryFor(final EnumerationValue value)
	{
		setInventoryFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.numberOfDistributedInventory</code> attribute.
	 * @return the numberOfDistributedInventory - Number of distributed inventory
	 */
	public Long getNumberOfDistributedInventory(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, NUMBEROFDISTRIBUTEDINVENTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.numberOfDistributedInventory</code> attribute.
	 * @return the numberOfDistributedInventory - Number of distributed inventory
	 */
	public Long getNumberOfDistributedInventory()
	{
		return getNumberOfDistributedInventory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.numberOfDistributedInventory</code> attribute. 
	 * @return the numberOfDistributedInventory - Number of distributed inventory
	 */
	public long getNumberOfDistributedInventoryAsPrimitive(final SessionContext ctx)
	{
		Long value = getNumberOfDistributedInventory( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.numberOfDistributedInventory</code> attribute. 
	 * @return the numberOfDistributedInventory - Number of distributed inventory
	 */
	public long getNumberOfDistributedInventoryAsPrimitive()
	{
		return getNumberOfDistributedInventoryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.numberOfDistributedInventory</code> attribute. 
	 * @param value the numberOfDistributedInventory - Number of distributed inventory
	 */
	public void setNumberOfDistributedInventory(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, NUMBEROFDISTRIBUTEDINVENTORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.numberOfDistributedInventory</code> attribute. 
	 * @param value the numberOfDistributedInventory - Number of distributed inventory
	 */
	public void setNumberOfDistributedInventory(final Long value)
	{
		setNumberOfDistributedInventory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.numberOfDistributedInventory</code> attribute. 
	 * @param value the numberOfDistributedInventory - Number of distributed inventory
	 */
	public void setNumberOfDistributedInventory(final SessionContext ctx, final long value)
	{
		setNumberOfDistributedInventory( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.numberOfDistributedInventory</code> attribute. 
	 * @param value the numberOfDistributedInventory - Number of distributed inventory
	 */
	public void setNumberOfDistributedInventory(final long value)
	{
		setNumberOfDistributedInventory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.productCategories</code> attribute.
	 * @return the productCategories - Collection of product categories
	 */
	public Collection<Category> getProductCategories(final SessionContext ctx)
	{
		Collection<Category> coll = (Collection<Category>)getProperty( ctx, PRODUCTCATEGORIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.productCategories</code> attribute.
	 * @return the productCategories - Collection of product categories
	 */
	public Collection<Category> getProductCategories()
	{
		return getProductCategories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.productCategories</code> attribute. 
	 * @param value the productCategories - Collection of product categories
	 */
	public void setProductCategories(final SessionContext ctx, final Collection<Category> value)
	{
		setProperty(ctx, PRODUCTCATEGORIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.productCategories</code> attribute. 
	 * @param value the productCategories - Collection of product categories
	 */
	public void setProductCategories(final Collection<Category> value)
	{
		setProductCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - Collection of ProductCategorySubTypes
	 */
	public Collection<ProductCategorySubType> getProductCategorySubType(final SessionContext ctx)
	{
		Collection<ProductCategorySubType> coll = (Collection<ProductCategorySubType>)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - Collection of ProductCategorySubTypes
	 */
	public Collection<ProductCategorySubType> getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - Collection of ProductCategorySubTypes
	 */
	public void setProductCategorySubType(final SessionContext ctx, final Collection<ProductCategorySubType> value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - Collection of ProductCategorySubTypes
	 */
	public void setProductCategorySubType(final Collection<ProductCategorySubType> value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.products</code> attribute.
	 * @return the products - Collection of products
	 */
	public Collection<Product> getProducts(final SessionContext ctx)
	{
		Collection<Product> coll = (Collection<Product>)getProperty( ctx, PRODUCTS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.products</code> attribute.
	 * @return the products - Collection of products
	 */
	public Collection<Product> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.products</code> attribute. 
	 * @param value the products - Collection of products
	 */
	public void setProducts(final SessionContext ctx, final Collection<Product> value)
	{
		setProperty(ctx, PRODUCTS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.products</code> attribute. 
	 * @param value the products - Collection of products
	 */
	public void setProducts(final Collection<Product> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.variants</code> attribute.
	 * @return the variants - Collection of variant products
	 */
	public Collection<VariantProduct> getVariants(final SessionContext ctx)
	{
		Collection<VariantProduct> coll = (Collection<VariantProduct>)getProperty( ctx, VARIANTS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.variants</code> attribute.
	 * @return the variants - Collection of variant products
	 */
	public Collection<VariantProduct> getVariants()
	{
		return getVariants( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.variants</code> attribute. 
	 * @param value the variants - Collection of variant products
	 */
	public void setVariants(final SessionContext ctx, final Collection<VariantProduct> value)
	{
		setProperty(ctx, VARIANTS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.variants</code> attribute. 
	 * @param value the variants - Collection of variant products
	 */
	public void setVariants(final Collection<VariantProduct> value)
	{
		setVariants( getSession().getSessionContext(), value );
	}
	
}
