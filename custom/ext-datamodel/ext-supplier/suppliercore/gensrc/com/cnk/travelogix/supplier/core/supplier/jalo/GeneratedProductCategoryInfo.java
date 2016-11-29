/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.core.supplier.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.core.supplier.jalo.ProductCategoryInfo ProductCategoryInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductCategoryInfo extends GenericItem
{
	/** Qualifier of the <code>ProductCategoryInfo.isDefautlSupplier</code> attribute **/
	public static final String ISDEFAUTLSUPPLIER = "isDefautlSupplier";
	/** Qualifier of the <code>ProductCategoryInfo.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>ProductCategoryInfo.suppliers</code> attribute **/
	public static final String SUPPLIERS = "suppliers";
	/** Relation ordering override parameter constants for Supplier2ProductCategoryInfo from ((suppliercore))*/
	protected static String SUPPLIER2PRODUCTCATEGORYINFO_SRC_ORDERED = "relation.Supplier2ProductCategoryInfo.source.ordered";
	protected static String SUPPLIER2PRODUCTCATEGORYINFO_TGT_ORDERED = "relation.Supplier2ProductCategoryInfo.target.ordered";
	/** Relation disable markmodifed parameter constants for Supplier2ProductCategoryInfo from ((suppliercore))*/
	protected static String SUPPLIER2PRODUCTCATEGORYINFO_MARKMODIFIED = "relation.Supplier2ProductCategoryInfo.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ISDEFAUTLSUPPLIER, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategoryInfo.isDefautlSupplier</code> attribute.
	 * @return the isDefautlSupplier - Is default supplier
	 */
	public Boolean isIsDefautlSupplier(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISDEFAUTLSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategoryInfo.isDefautlSupplier</code> attribute.
	 * @return the isDefautlSupplier - Is default supplier
	 */
	public Boolean isIsDefautlSupplier()
	{
		return isIsDefautlSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategoryInfo.isDefautlSupplier</code> attribute. 
	 * @return the isDefautlSupplier - Is default supplier
	 */
	public boolean isIsDefautlSupplierAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsDefautlSupplier( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategoryInfo.isDefautlSupplier</code> attribute. 
	 * @return the isDefautlSupplier - Is default supplier
	 */
	public boolean isIsDefautlSupplierAsPrimitive()
	{
		return isIsDefautlSupplierAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategoryInfo.isDefautlSupplier</code> attribute. 
	 * @param value the isDefautlSupplier - Is default supplier
	 */
	public void setIsDefautlSupplier(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISDEFAUTLSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategoryInfo.isDefautlSupplier</code> attribute. 
	 * @param value the isDefautlSupplier - Is default supplier
	 */
	public void setIsDefautlSupplier(final Boolean value)
	{
		setIsDefautlSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategoryInfo.isDefautlSupplier</code> attribute. 
	 * @param value the isDefautlSupplier - Is default supplier
	 */
	public void setIsDefautlSupplier(final SessionContext ctx, final boolean value)
	{
		setIsDefautlSupplier( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategoryInfo.isDefautlSupplier</code> attribute. 
	 * @param value the isDefautlSupplier - Is default supplier
	 */
	public void setIsDefautlSupplier(final boolean value)
	{
		setIsDefautlSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategoryInfo.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategoryInfo.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategoryInfo.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategoryInfo.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategoryInfo.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Collection<Supplier> getSuppliers(final SessionContext ctx)
	{
		final List<Supplier> items = getLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYINFO,
			"Supplier",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategoryInfo.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Collection<Supplier> getSuppliers()
	{
		return getSuppliers( getSession().getSessionContext() );
	}
	
	public long getSuppliersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYINFO,
			"Supplier",
			null
		);
	}
	
	public long getSuppliersCount()
	{
		return getSuppliersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategoryInfo.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final SessionContext ctx, final Collection<Supplier> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYINFO,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategoryInfo.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final Collection<Supplier> value)
	{
		setSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final SessionContext ctx, final Supplier value)
	{
		addLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYINFO,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final Supplier value)
	{
		addToSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final SessionContext ctx, final Supplier value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYINFO,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final Supplier value)
	{
		removeFromSuppliers( getSession().getSessionContext(), value );
	}
	
}
