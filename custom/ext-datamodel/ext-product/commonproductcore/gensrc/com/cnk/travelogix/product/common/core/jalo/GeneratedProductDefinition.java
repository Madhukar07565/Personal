/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.AttachedProduct;
import com.cnk.travelogix.product.common.core.jalo.CombinationProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
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
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ProductDefinition ProductDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductDefinition extends GenericItem
{
	/** Qualifier of the <code>ProductDefinition.attachId</code> attribute **/
	public static final String ATTACHID = "attachId";
	/** Qualifier of the <code>ProductDefinition.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>ProductDefinition.combinationProduct</code> attribute **/
	public static final String COMBINATIONPRODUCT = "combinationProduct";
	/** Qualifier of the <code>ProductDefinition.attachedProducts</code> attribute **/
	public static final String ATTACHEDPRODUCTS = "attachedProducts";
	/** Relation ordering override parameter constants for ProductDefinitionToAttachedProducts from ((commonproductcore))*/
	protected static String PRODUCTDEFINITIONTOATTACHEDPRODUCTS_SRC_ORDERED = "relation.ProductDefinitionToAttachedProducts.source.ordered";
	protected static String PRODUCTDEFINITIONTOATTACHEDPRODUCTS_TGT_ORDERED = "relation.ProductDefinitionToAttachedProducts.target.ordered";
	/** Relation disable markmodifed parameter constants for ProductDefinitionToAttachedProducts from ((commonproductcore))*/
	protected static String PRODUCTDEFINITIONTOATTACHEDPRODUCTS_MARKMODIFIED = "relation.ProductDefinitionToAttachedProducts.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMBINATIONPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedProductDefinition> COMBINATIONPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedProductDefinition>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ATTACHID, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(COMBINATIONPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDefinition.attachedProducts</code> attribute.
	 * @return the attachedProducts
	 */
	public Collection<AttachedProduct> getAttachedProducts(final SessionContext ctx)
	{
		final List<AttachedProduct> items = getLinkedItems( 
			ctx,
			true,
			CommonproductcoreConstants.Relations.PRODUCTDEFINITIONTOATTACHEDPRODUCTS,
			"AttachedProduct",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDefinition.attachedProducts</code> attribute.
	 * @return the attachedProducts
	 */
	public Collection<AttachedProduct> getAttachedProducts()
	{
		return getAttachedProducts( getSession().getSessionContext() );
	}
	
	public long getAttachedProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			CommonproductcoreConstants.Relations.PRODUCTDEFINITIONTOATTACHEDPRODUCTS,
			"AttachedProduct",
			null
		);
	}
	
	public long getAttachedProductsCount()
	{
		return getAttachedProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDefinition.attachedProducts</code> attribute. 
	 * @param value the attachedProducts
	 */
	public void setAttachedProducts(final SessionContext ctx, final Collection<AttachedProduct> value)
	{
		setLinkedItems( 
			ctx,
			true,
			CommonproductcoreConstants.Relations.PRODUCTDEFINITIONTOATTACHEDPRODUCTS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCTDEFINITIONTOATTACHEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDefinition.attachedProducts</code> attribute. 
	 * @param value the attachedProducts
	 */
	public void setAttachedProducts(final Collection<AttachedProduct> value)
	{
		setAttachedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to attachedProducts. 
	 * @param value the item to add to attachedProducts
	 */
	public void addToAttachedProducts(final SessionContext ctx, final AttachedProduct value)
	{
		addLinkedItems( 
			ctx,
			true,
			CommonproductcoreConstants.Relations.PRODUCTDEFINITIONTOATTACHEDPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCTDEFINITIONTOATTACHEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to attachedProducts. 
	 * @param value the item to add to attachedProducts
	 */
	public void addToAttachedProducts(final AttachedProduct value)
	{
		addToAttachedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from attachedProducts. 
	 * @param value the item to remove from attachedProducts
	 */
	public void removeFromAttachedProducts(final SessionContext ctx, final AttachedProduct value)
	{
		removeLinkedItems( 
			ctx,
			true,
			CommonproductcoreConstants.Relations.PRODUCTDEFINITIONTOATTACHEDPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCTDEFINITIONTOATTACHEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from attachedProducts. 
	 * @param value the item to remove from attachedProducts
	 */
	public void removeFromAttachedProducts(final AttachedProduct value)
	{
		removeFromAttachedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDefinition.attachId</code> attribute.
	 * @return the attachId - This will be generated by system while click on save button on front end
	 */
	public String getAttachId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ATTACHID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDefinition.attachId</code> attribute.
	 * @return the attachId - This will be generated by system while click on save button on front end
	 */
	public String getAttachId()
	{
		return getAttachId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDefinition.attachId</code> attribute. 
	 * @param value the attachId - This will be generated by system while click on save button on front end
	 */
	public void setAttachId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ATTACHID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDefinition.attachId</code> attribute. 
	 * @param value the attachId - This will be generated by system while click on save button on front end
	 */
	public void setAttachId(final String value)
	{
		setAttachId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDefinition.category</code> attribute.
	 * @return the category - This will be Product Category SubType
	 */
	public ProductCategorySubType getCategory(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDefinition.category</code> attribute.
	 * @return the category - This will be Product Category SubType
	 */
	public ProductCategorySubType getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDefinition.category</code> attribute. 
	 * @param value the category - This will be Product Category SubType
	 */
	public void setCategory(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDefinition.category</code> attribute. 
	 * @param value the category - This will be Product Category SubType
	 */
	public void setCategory(final ProductCategorySubType value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDefinition.combinationProduct</code> attribute.
	 * @return the combinationProduct
	 */
	public CombinationProduct getCombinationProduct(final SessionContext ctx)
	{
		return (CombinationProduct)getProperty( ctx, COMBINATIONPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDefinition.combinationProduct</code> attribute.
	 * @return the combinationProduct
	 */
	public CombinationProduct getCombinationProduct()
	{
		return getCombinationProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDefinition.combinationProduct</code> attribute. 
	 * @param value the combinationProduct
	 */
	public void setCombinationProduct(final SessionContext ctx, final CombinationProduct value)
	{
		COMBINATIONPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDefinition.combinationProduct</code> attribute. 
	 * @param value the combinationProduct
	 */
	public void setCombinationProduct(final CombinationProduct value)
	{
		setCombinationProduct( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMBINATIONPRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
