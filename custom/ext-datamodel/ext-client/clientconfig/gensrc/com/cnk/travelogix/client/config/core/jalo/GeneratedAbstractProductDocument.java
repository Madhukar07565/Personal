/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.DocumentHandlingConfigMaster;
import com.cnk.travelogix.client.config.core.jalo.DocumentSetting;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.product.common.core.jalo.Ancillary;
import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.category.jalo.Category;
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
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument AbstractProductDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractProductDocument extends GenericItem
{
	/** Qualifier of the <code>AbstractProductDocument.includeProducts</code> attribute **/
	public static final String INCLUDEPRODUCTS = "includeProducts";
	/** Qualifier of the <code>AbstractProductDocument.ancillaryName</code> attribute **/
	public static final String ANCILLARYNAME = "ancillaryName";
	/** Qualifier of the <code>AbstractProductDocument.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>AbstractProductDocument.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>AbstractProductDocument.documentHandlingConfigMaster</code> attribute **/
	public static final String DOCUMENTHANDLINGCONFIGMASTER = "documentHandlingConfigMaster";
	/** Qualifier of the <code>AbstractProductDocument.documentSetting</code> attribute **/
	public static final String DOCUMENTSETTING = "documentSetting";
	/** Qualifier of the <code>AbstractProductDocument.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DOCUMENTHANDLINGCONFIGMASTER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractProductDocument> DOCUMENTHANDLINGCONFIGMASTERHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractProductDocument>(
	ClientconfigConstants.TC.ABSTRACTPRODUCTDOCUMENT,
	false,
	"documentHandlingConfigMaster",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DOCUMENTSETTING's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DocumentSetting> DOCUMENTSETTINGHANDLER = new OneToManyHandler<DocumentSetting>(
	ClientconfigConstants.TC.DOCUMENTSETTING,
	false,
	"abstractProductDocument",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIER's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Supplier> SUPPLIERHANDLER = new OneToManyHandler<Supplier>(
	SuppliercoreConstants.TC.SUPPLIER,
	false,
	"abstractProductDocument",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INCLUDEPRODUCTS, AttributeMode.INITIAL);
		tmp.put(ANCILLARYNAME, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(DOCUMENTHANDLINGCONFIGMASTER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.ancillaryName</code> attribute.
	 * @return the ancillaryName - Activities Product Ancillary Name
	 */
	public Ancillary getAncillaryName(final SessionContext ctx)
	{
		return (Ancillary)getProperty( ctx, ANCILLARYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.ancillaryName</code> attribute.
	 * @return the ancillaryName - Activities Product Ancillary Name
	 */
	public Ancillary getAncillaryName()
	{
		return getAncillaryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.ancillaryName</code> attribute. 
	 * @param value the ancillaryName - Activities Product Ancillary Name
	 */
	public void setAncillaryName(final SessionContext ctx, final Ancillary value)
	{
		setProperty(ctx, ANCILLARYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.ancillaryName</code> attribute. 
	 * @param value the ancillaryName - Activities Product Ancillary Name
	 */
	public void setAncillaryName(final Ancillary value)
	{
		setAncillaryName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DOCUMENTHANDLINGCONFIGMASTERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.documentHandlingConfigMaster</code> attribute.
	 * @return the documentHandlingConfigMaster
	 */
	public DocumentHandlingConfigMaster getDocumentHandlingConfigMaster(final SessionContext ctx)
	{
		return (DocumentHandlingConfigMaster)getProperty( ctx, DOCUMENTHANDLINGCONFIGMASTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.documentHandlingConfigMaster</code> attribute.
	 * @return the documentHandlingConfigMaster
	 */
	public DocumentHandlingConfigMaster getDocumentHandlingConfigMaster()
	{
		return getDocumentHandlingConfigMaster( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.documentHandlingConfigMaster</code> attribute. 
	 * @param value the documentHandlingConfigMaster
	 */
	public void setDocumentHandlingConfigMaster(final SessionContext ctx, final DocumentHandlingConfigMaster value)
	{
		DOCUMENTHANDLINGCONFIGMASTERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.documentHandlingConfigMaster</code> attribute. 
	 * @param value the documentHandlingConfigMaster
	 */
	public void setDocumentHandlingConfigMaster(final DocumentHandlingConfigMaster value)
	{
		setDocumentHandlingConfigMaster( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.documentSetting</code> attribute.
	 * @return the documentSetting
	 */
	public Collection<DocumentSetting> getDocumentSetting(final SessionContext ctx)
	{
		return DOCUMENTSETTINGHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.documentSetting</code> attribute.
	 * @return the documentSetting
	 */
	public Collection<DocumentSetting> getDocumentSetting()
	{
		return getDocumentSetting( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.documentSetting</code> attribute. 
	 * @param value the documentSetting
	 */
	public void setDocumentSetting(final SessionContext ctx, final Collection<DocumentSetting> value)
	{
		DOCUMENTSETTINGHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.documentSetting</code> attribute. 
	 * @param value the documentSetting
	 */
	public void setDocumentSetting(final Collection<DocumentSetting> value)
	{
		setDocumentSetting( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to documentSetting. 
	 * @param value the item to add to documentSetting
	 */
	public void addToDocumentSetting(final SessionContext ctx, final DocumentSetting value)
	{
		DOCUMENTSETTINGHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to documentSetting. 
	 * @param value the item to add to documentSetting
	 */
	public void addToDocumentSetting(final DocumentSetting value)
	{
		addToDocumentSetting( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from documentSetting. 
	 * @param value the item to remove from documentSetting
	 */
	public void removeFromDocumentSetting(final SessionContext ctx, final DocumentSetting value)
	{
		DOCUMENTSETTINGHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from documentSetting. 
	 * @param value the item to remove from documentSetting
	 */
	public void removeFromDocumentSetting(final DocumentSetting value)
	{
		removeFromDocumentSetting( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.includeProducts</code> attribute.
	 * @return the includeProducts - If true will include products else exclude products
	 */
	public Boolean isIncludeProducts(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDEPRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.includeProducts</code> attribute.
	 * @return the includeProducts - If true will include products else exclude products
	 */
	public Boolean isIncludeProducts()
	{
		return isIncludeProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.includeProducts</code> attribute. 
	 * @return the includeProducts - If true will include products else exclude products
	 */
	public boolean isIncludeProductsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIncludeProducts( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.includeProducts</code> attribute. 
	 * @return the includeProducts - If true will include products else exclude products
	 */
	public boolean isIncludeProductsAsPrimitive()
	{
		return isIncludeProductsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.includeProducts</code> attribute. 
	 * @param value the includeProducts - If true will include products else exclude products
	 */
	public void setIncludeProducts(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDEPRODUCTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.includeProducts</code> attribute. 
	 * @param value the includeProducts - If true will include products else exclude products
	 */
	public void setIncludeProducts(final Boolean value)
	{
		setIncludeProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.includeProducts</code> attribute. 
	 * @param value the includeProducts - If true will include products else exclude products
	 */
	public void setIncludeProducts(final SessionContext ctx, final boolean value)
	{
		setIncludeProducts( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.includeProducts</code> attribute. 
	 * @param value the includeProducts - If true will include products else exclude products
	 */
	public void setIncludeProducts(final boolean value)
	{
		setIncludeProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.supplier</code> attribute.
	 * @return the supplier
	 */
	public Collection<Supplier> getSupplier(final SessionContext ctx)
	{
		return SUPPLIERHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductDocument.supplier</code> attribute.
	 * @return the supplier
	 */
	public Collection<Supplier> getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Collection<Supplier> value)
	{
		SUPPLIERHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductDocument.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Collection<Supplier> value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplier. 
	 * @param value the item to add to supplier
	 */
	public void addToSupplier(final SessionContext ctx, final Supplier value)
	{
		SUPPLIERHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplier. 
	 * @param value the item to add to supplier
	 */
	public void addToSupplier(final Supplier value)
	{
		addToSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplier. 
	 * @param value the item to remove from supplier
	 */
	public void removeFromSupplier(final SessionContext ctx, final Supplier value)
	{
		SUPPLIERHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplier. 
	 * @param value the item to remove from supplier
	 */
	public void removeFromSupplier(final Supplier value)
	{
		removeFromSupplier( getSession().getSessionContext(), value );
	}
	
}
