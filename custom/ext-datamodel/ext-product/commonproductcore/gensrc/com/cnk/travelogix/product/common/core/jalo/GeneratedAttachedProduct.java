/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.ProductDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.AttachedProduct AttachedProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAttachedProduct extends GenericItem
{
	/** Qualifier of the <code>AttachedProduct.include</code> attribute **/
	public static final String INCLUDE = "include";
	/** Qualifier of the <code>AttachedProduct.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>AttachedProduct.productDefinition</code> attribute **/
	public static final String PRODUCTDEFINITION = "productDefinition";
	/** Relation ordering override parameter constants for ProductDefinitionToAttachedProducts from ((commonproductcore))*/
	protected static String PRODUCTDEFINITIONTOATTACHEDPRODUCTS_SRC_ORDERED = "relation.ProductDefinitionToAttachedProducts.source.ordered";
	protected static String PRODUCTDEFINITIONTOATTACHEDPRODUCTS_TGT_ORDERED = "relation.ProductDefinitionToAttachedProducts.target.ordered";
	/** Relation disable markmodifed parameter constants for ProductDefinitionToAttachedProducts from ((commonproductcore))*/
	protected static String PRODUCTDEFINITIONTOATTACHEDPRODUCTS_MARKMODIFIED = "relation.ProductDefinitionToAttachedProducts.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INCLUDE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttachedProduct.include</code> attribute.
	 * @return the include - Whether the attached product is to be included/excluded on front end
	 */
	public Boolean isInclude(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttachedProduct.include</code> attribute.
	 * @return the include - Whether the attached product is to be included/excluded on front end
	 */
	public Boolean isInclude()
	{
		return isInclude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttachedProduct.include</code> attribute. 
	 * @return the include - Whether the attached product is to be included/excluded on front end
	 */
	public boolean isIncludeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInclude( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttachedProduct.include</code> attribute. 
	 * @return the include - Whether the attached product is to be included/excluded on front end
	 */
	public boolean isIncludeAsPrimitive()
	{
		return isIncludeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AttachedProduct.include</code> attribute. 
	 * @param value the include - Whether the attached product is to be included/excluded on front end
	 */
	public void setInclude(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AttachedProduct.include</code> attribute. 
	 * @param value the include - Whether the attached product is to be included/excluded on front end
	 */
	public void setInclude(final Boolean value)
	{
		setInclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AttachedProduct.include</code> attribute. 
	 * @param value the include - Whether the attached product is to be included/excluded on front end
	 */
	public void setInclude(final SessionContext ctx, final boolean value)
	{
		setInclude( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AttachedProduct.include</code> attribute. 
	 * @param value the include - Whether the attached product is to be included/excluded on front end
	 */
	public void setInclude(final boolean value)
	{
		setInclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttachedProduct.product</code> attribute.
	 * @return the product - Product to be attached
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttachedProduct.product</code> attribute.
	 * @return the product - Product to be attached
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AttachedProduct.product</code> attribute. 
	 * @param value the product - Product to be attached
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AttachedProduct.product</code> attribute. 
	 * @param value the product - Product to be attached
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttachedProduct.productDefinition</code> attribute.
	 * @return the productDefinition
	 */
	public Collection<ProductDefinition> getProductDefinition(final SessionContext ctx)
	{
		final List<ProductDefinition> items = getLinkedItems( 
			ctx,
			false,
			CommonproductcoreConstants.Relations.PRODUCTDEFINITIONTOATTACHEDPRODUCTS,
			"ProductDefinition",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttachedProduct.productDefinition</code> attribute.
	 * @return the productDefinition
	 */
	public Collection<ProductDefinition> getProductDefinition()
	{
		return getProductDefinition( getSession().getSessionContext() );
	}
	
	public long getProductDefinitionCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			CommonproductcoreConstants.Relations.PRODUCTDEFINITIONTOATTACHEDPRODUCTS,
			"ProductDefinition",
			null
		);
	}
	
	public long getProductDefinitionCount()
	{
		return getProductDefinitionCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AttachedProduct.productDefinition</code> attribute. 
	 * @param value the productDefinition
	 */
	public void setProductDefinition(final SessionContext ctx, final Collection<ProductDefinition> value)
	{
		setLinkedItems( 
			ctx,
			false,
			CommonproductcoreConstants.Relations.PRODUCTDEFINITIONTOATTACHEDPRODUCTS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCTDEFINITIONTOATTACHEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AttachedProduct.productDefinition</code> attribute. 
	 * @param value the productDefinition
	 */
	public void setProductDefinition(final Collection<ProductDefinition> value)
	{
		setProductDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productDefinition. 
	 * @param value the item to add to productDefinition
	 */
	public void addToProductDefinition(final SessionContext ctx, final ProductDefinition value)
	{
		addLinkedItems( 
			ctx,
			false,
			CommonproductcoreConstants.Relations.PRODUCTDEFINITIONTOATTACHEDPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCTDEFINITIONTOATTACHEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productDefinition. 
	 * @param value the item to add to productDefinition
	 */
	public void addToProductDefinition(final ProductDefinition value)
	{
		addToProductDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productDefinition. 
	 * @param value the item to remove from productDefinition
	 */
	public void removeFromProductDefinition(final SessionContext ctx, final ProductDefinition value)
	{
		removeLinkedItems( 
			ctx,
			false,
			CommonproductcoreConstants.Relations.PRODUCTDEFINITIONTOATTACHEDPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCTDEFINITIONTOATTACHEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productDefinition. 
	 * @param value the item to remove from productDefinition
	 */
	public void removeFromProductDefinition(final ProductDefinition value)
	{
		removeFromProductDefinition( getSession().getSessionContext(), value );
	}
	
}
