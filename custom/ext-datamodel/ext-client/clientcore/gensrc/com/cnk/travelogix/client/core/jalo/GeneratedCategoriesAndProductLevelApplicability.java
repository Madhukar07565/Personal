/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.AdvanceApplicability;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.CategoriesAndProductLevelApplicability CategoriesAndProductLevelApplicability}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCategoriesAndProductLevelApplicability extends GenericItem
{
	/** Qualifier of the <code>CategoriesAndProductLevelApplicability.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>CategoriesAndProductLevelApplicability.productCategorySubtype</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubtype";
	/** Qualifier of the <code>CategoriesAndProductLevelApplicability.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>CategoriesAndProductLevelApplicability.productVariant</code> attribute **/
	public static final String PRODUCTVARIANT = "productVariant";
	/** Qualifier of the <code>CategoriesAndProductLevelApplicability.advanceApplicability</code> attribute **/
	public static final String ADVANCEAPPLICABILITY = "advanceApplicability";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADVANCEAPPLICABILITY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCategoriesAndProductLevelApplicability> ADVANCEAPPLICABILITYHANDLER = new BidirectionalOneToManyHandler<GeneratedCategoriesAndProductLevelApplicability>(
	ClientcoreConstants.TC.CATEGORIESANDPRODUCTLEVELAPPLICABILITY,
	false,
	"advanceApplicability",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(PRODUCTVARIANT, AttributeMode.INITIAL);
		tmp.put(ADVANCEAPPLICABILITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoriesAndProductLevelApplicability.advanceApplicability</code> attribute.
	 * @return the advanceApplicability
	 */
	public AdvanceApplicability getAdvanceApplicability(final SessionContext ctx)
	{
		return (AdvanceApplicability)getProperty( ctx, ADVANCEAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoriesAndProductLevelApplicability.advanceApplicability</code> attribute.
	 * @return the advanceApplicability
	 */
	public AdvanceApplicability getAdvanceApplicability()
	{
		return getAdvanceApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoriesAndProductLevelApplicability.advanceApplicability</code> attribute. 
	 * @param value the advanceApplicability
	 */
	public void setAdvanceApplicability(final SessionContext ctx, final AdvanceApplicability value)
	{
		ADVANCEAPPLICABILITYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoriesAndProductLevelApplicability.advanceApplicability</code> attribute. 
	 * @param value the advanceApplicability
	 */
	public void setAdvanceApplicability(final AdvanceApplicability value)
	{
		setAdvanceApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoriesAndProductLevelApplicability.category</code> attribute.
	 * @return the category - Category
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoriesAndProductLevelApplicability.category</code> attribute.
	 * @return the category - Category
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoriesAndProductLevelApplicability.category</code> attribute. 
	 * @param value the category - Category
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoriesAndProductLevelApplicability.category</code> attribute. 
	 * @param value the category - Category
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADVANCEAPPLICABILITYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoriesAndProductLevelApplicability.product</code> attribute.
	 * @return the product - Product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoriesAndProductLevelApplicability.product</code> attribute.
	 * @return the product - Product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoriesAndProductLevelApplicability.product</code> attribute. 
	 * @param value the product - Product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoriesAndProductLevelApplicability.product</code> attribute. 
	 * @param value the product - Product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoriesAndProductLevelApplicability.productCategorySubtype</code> attribute.
	 * @return the productCategorySubtype - Product Category Subtype
	 */
	public ProductCategorySubType getProductCategorySubtype(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoriesAndProductLevelApplicability.productCategorySubtype</code> attribute.
	 * @return the productCategorySubtype - Product Category Subtype
	 */
	public ProductCategorySubType getProductCategorySubtype()
	{
		return getProductCategorySubtype( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoriesAndProductLevelApplicability.productCategorySubtype</code> attribute. 
	 * @param value the productCategorySubtype - Product Category Subtype
	 */
	public void setProductCategorySubtype(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoriesAndProductLevelApplicability.productCategorySubtype</code> attribute. 
	 * @param value the productCategorySubtype - Product Category Subtype
	 */
	public void setProductCategorySubtype(final ProductCategorySubType value)
	{
		setProductCategorySubtype( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoriesAndProductLevelApplicability.productVariant</code> attribute.
	 * @return the productVariant - Variant Product
	 */
	public VariantProduct getProductVariant(final SessionContext ctx)
	{
		return (VariantProduct)getProperty( ctx, PRODUCTVARIANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoriesAndProductLevelApplicability.productVariant</code> attribute.
	 * @return the productVariant - Variant Product
	 */
	public VariantProduct getProductVariant()
	{
		return getProductVariant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoriesAndProductLevelApplicability.productVariant</code> attribute. 
	 * @param value the productVariant - Variant Product
	 */
	public void setProductVariant(final SessionContext ctx, final VariantProduct value)
	{
		setProperty(ctx, PRODUCTVARIANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoriesAndProductLevelApplicability.productVariant</code> attribute. 
	 * @param value the productVariant - Variant Product
	 */
	public void setProductVariant(final VariantProduct value)
	{
		setProductVariant( getSession().getSessionContext(), value );
	}
	
}
