/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.operation.reconfirmationconfig.jalo;

import com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.jalo.ClientReconfirmationConfig;
import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.jalo.ReconfirmationInterval;
import com.cnk.travelogix.datamodel.operation.reconfirmationtraveldestination.jalo.ReconfirmationTravelDestination;
import com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.jalo.SupplierReconfirmationConfig;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.operation.reconfirmationconfig.jalo.ReconfirmationConfig ReconfirmationConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedReconfirmationConfig extends AbstractTravelogixItem
{
	/** Qualifier of the <code>ReconfirmationConfig.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>ReconfirmationConfig.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>ReconfirmationConfig.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>ReconfirmationConfig.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>ReconfirmationConfig.clientreconfirmationconfigs</code> attribute **/
	public static final String CLIENTRECONFIRMATIONCONFIGS = "clientreconfirmationconfigs";
	/** Qualifier of the <code>ReconfirmationConfig.supplierreconfirmationconfigs</code> attribute **/
	public static final String SUPPLIERRECONFIRMATIONCONFIGS = "supplierreconfirmationconfigs";
	/** Qualifier of the <code>ReconfirmationConfig.reconfirmationintervals</code> attribute **/
	public static final String RECONFIRMATIONINTERVALS = "reconfirmationintervals";
	/** Qualifier of the <code>ReconfirmationConfig.reconfirmationtraveldestinations</code> attribute **/
	public static final String RECONFIRMATIONTRAVELDESTINATIONS = "reconfirmationtraveldestinations";
	/**
	* {@link OneToManyHandler} for handling 1:n CLIENTRECONFIRMATIONCONFIGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ClientReconfirmationConfig> CLIENTRECONFIRMATIONCONFIGSHANDLER = new OneToManyHandler<ClientReconfirmationConfig>(
	OperationmastercoreConstants.TC.CLIENTRECONFIRMATIONCONFIG,
	false,
	"reconfirmationconfig",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIERRECONFIRMATIONCONFIGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierReconfirmationConfig> SUPPLIERRECONFIRMATIONCONFIGSHANDLER = new OneToManyHandler<SupplierReconfirmationConfig>(
	OperationmastercoreConstants.TC.SUPPLIERRECONFIRMATIONCONFIG,
	false,
	"reconfirmationconfig",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RECONFIRMATIONINTERVALS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ReconfirmationInterval> RECONFIRMATIONINTERVALSHANDLER = new OneToManyHandler<ReconfirmationInterval>(
	OperationmastercoreConstants.TC.RECONFIRMATIONINTERVAL,
	false,
	"reconfirmationconfig",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RECONFIRMATIONTRAVELDESTINATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ReconfirmationTravelDestination> RECONFIRMATIONTRAVELDESTINATIONSHANDLER = new OneToManyHandler<ReconfirmationTravelDestination>(
	OperationmastercoreConstants.TC.RECONFIRMATIONTRAVELDESTINATION,
	false,
	"reconfirmationconfig",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.clientreconfirmationconfigs</code> attribute.
	 * @return the clientreconfirmationconfigs
	 */
	public Collection<ClientReconfirmationConfig> getClientreconfirmationconfigs(final SessionContext ctx)
	{
		return CLIENTRECONFIRMATIONCONFIGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.clientreconfirmationconfigs</code> attribute.
	 * @return the clientreconfirmationconfigs
	 */
	public Collection<ClientReconfirmationConfig> getClientreconfirmationconfigs()
	{
		return getClientreconfirmationconfigs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.clientreconfirmationconfigs</code> attribute. 
	 * @param value the clientreconfirmationconfigs
	 */
	public void setClientreconfirmationconfigs(final SessionContext ctx, final Collection<ClientReconfirmationConfig> value)
	{
		CLIENTRECONFIRMATIONCONFIGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.clientreconfirmationconfigs</code> attribute. 
	 * @param value the clientreconfirmationconfigs
	 */
	public void setClientreconfirmationconfigs(final Collection<ClientReconfirmationConfig> value)
	{
		setClientreconfirmationconfigs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientreconfirmationconfigs. 
	 * @param value the item to add to clientreconfirmationconfigs
	 */
	public void addToClientreconfirmationconfigs(final SessionContext ctx, final ClientReconfirmationConfig value)
	{
		CLIENTRECONFIRMATIONCONFIGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientreconfirmationconfigs. 
	 * @param value the item to add to clientreconfirmationconfigs
	 */
	public void addToClientreconfirmationconfigs(final ClientReconfirmationConfig value)
	{
		addToClientreconfirmationconfigs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientreconfirmationconfigs. 
	 * @param value the item to remove from clientreconfirmationconfigs
	 */
	public void removeFromClientreconfirmationconfigs(final SessionContext ctx, final ClientReconfirmationConfig value)
	{
		CLIENTRECONFIRMATIONCONFIGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientreconfirmationconfigs. 
	 * @param value the item to remove from clientreconfirmationconfigs
	 */
	public void removeFromClientreconfirmationconfigs(final ClientReconfirmationConfig value)
	{
		removeFromClientreconfirmationconfigs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.reconfirmationintervals</code> attribute.
	 * @return the reconfirmationintervals
	 */
	public Collection<ReconfirmationInterval> getReconfirmationintervals(final SessionContext ctx)
	{
		return RECONFIRMATIONINTERVALSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.reconfirmationintervals</code> attribute.
	 * @return the reconfirmationintervals
	 */
	public Collection<ReconfirmationInterval> getReconfirmationintervals()
	{
		return getReconfirmationintervals( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.reconfirmationintervals</code> attribute. 
	 * @param value the reconfirmationintervals
	 */
	public void setReconfirmationintervals(final SessionContext ctx, final Collection<ReconfirmationInterval> value)
	{
		RECONFIRMATIONINTERVALSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.reconfirmationintervals</code> attribute. 
	 * @param value the reconfirmationintervals
	 */
	public void setReconfirmationintervals(final Collection<ReconfirmationInterval> value)
	{
		setReconfirmationintervals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reconfirmationintervals. 
	 * @param value the item to add to reconfirmationintervals
	 */
	public void addToReconfirmationintervals(final SessionContext ctx, final ReconfirmationInterval value)
	{
		RECONFIRMATIONINTERVALSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reconfirmationintervals. 
	 * @param value the item to add to reconfirmationintervals
	 */
	public void addToReconfirmationintervals(final ReconfirmationInterval value)
	{
		addToReconfirmationintervals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reconfirmationintervals. 
	 * @param value the item to remove from reconfirmationintervals
	 */
	public void removeFromReconfirmationintervals(final SessionContext ctx, final ReconfirmationInterval value)
	{
		RECONFIRMATIONINTERVALSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reconfirmationintervals. 
	 * @param value the item to remove from reconfirmationintervals
	 */
	public void removeFromReconfirmationintervals(final ReconfirmationInterval value)
	{
		removeFromReconfirmationintervals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.reconfirmationtraveldestinations</code> attribute.
	 * @return the reconfirmationtraveldestinations
	 */
	public Collection<ReconfirmationTravelDestination> getReconfirmationtraveldestinations(final SessionContext ctx)
	{
		return RECONFIRMATIONTRAVELDESTINATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.reconfirmationtraveldestinations</code> attribute.
	 * @return the reconfirmationtraveldestinations
	 */
	public Collection<ReconfirmationTravelDestination> getReconfirmationtraveldestinations()
	{
		return getReconfirmationtraveldestinations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.reconfirmationtraveldestinations</code> attribute. 
	 * @param value the reconfirmationtraveldestinations
	 */
	public void setReconfirmationtraveldestinations(final SessionContext ctx, final Collection<ReconfirmationTravelDestination> value)
	{
		RECONFIRMATIONTRAVELDESTINATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.reconfirmationtraveldestinations</code> attribute. 
	 * @param value the reconfirmationtraveldestinations
	 */
	public void setReconfirmationtraveldestinations(final Collection<ReconfirmationTravelDestination> value)
	{
		setReconfirmationtraveldestinations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reconfirmationtraveldestinations. 
	 * @param value the item to add to reconfirmationtraveldestinations
	 */
	public void addToReconfirmationtraveldestinations(final SessionContext ctx, final ReconfirmationTravelDestination value)
	{
		RECONFIRMATIONTRAVELDESTINATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reconfirmationtraveldestinations. 
	 * @param value the item to add to reconfirmationtraveldestinations
	 */
	public void addToReconfirmationtraveldestinations(final ReconfirmationTravelDestination value)
	{
		addToReconfirmationtraveldestinations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reconfirmationtraveldestinations. 
	 * @param value the item to remove from reconfirmationtraveldestinations
	 */
	public void removeFromReconfirmationtraveldestinations(final SessionContext ctx, final ReconfirmationTravelDestination value)
	{
		RECONFIRMATIONTRAVELDESTINATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reconfirmationtraveldestinations. 
	 * @param value the item to remove from reconfirmationtraveldestinations
	 */
	public void removeFromReconfirmationtraveldestinations(final ReconfirmationTravelDestination value)
	{
		removeFromReconfirmationtraveldestinations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.supplierreconfirmationconfigs</code> attribute.
	 * @return the supplierreconfirmationconfigs
	 */
	public Collection<SupplierReconfirmationConfig> getSupplierreconfirmationconfigs(final SessionContext ctx)
	{
		return SUPPLIERRECONFIRMATIONCONFIGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationConfig.supplierreconfirmationconfigs</code> attribute.
	 * @return the supplierreconfirmationconfigs
	 */
	public Collection<SupplierReconfirmationConfig> getSupplierreconfirmationconfigs()
	{
		return getSupplierreconfirmationconfigs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.supplierreconfirmationconfigs</code> attribute. 
	 * @param value the supplierreconfirmationconfigs
	 */
	public void setSupplierreconfirmationconfigs(final SessionContext ctx, final Collection<SupplierReconfirmationConfig> value)
	{
		SUPPLIERRECONFIRMATIONCONFIGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationConfig.supplierreconfirmationconfigs</code> attribute. 
	 * @param value the supplierreconfirmationconfigs
	 */
	public void setSupplierreconfirmationconfigs(final Collection<SupplierReconfirmationConfig> value)
	{
		setSupplierreconfirmationconfigs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierreconfirmationconfigs. 
	 * @param value the item to add to supplierreconfirmationconfigs
	 */
	public void addToSupplierreconfirmationconfigs(final SessionContext ctx, final SupplierReconfirmationConfig value)
	{
		SUPPLIERRECONFIRMATIONCONFIGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierreconfirmationconfigs. 
	 * @param value the item to add to supplierreconfirmationconfigs
	 */
	public void addToSupplierreconfirmationconfigs(final SupplierReconfirmationConfig value)
	{
		addToSupplierreconfirmationconfigs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierreconfirmationconfigs. 
	 * @param value the item to remove from supplierreconfirmationconfigs
	 */
	public void removeFromSupplierreconfirmationconfigs(final SessionContext ctx, final SupplierReconfirmationConfig value)
	{
		SUPPLIERRECONFIRMATIONCONFIGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierreconfirmationconfigs. 
	 * @param value the item to remove from supplierreconfirmationconfigs
	 */
	public void removeFromSupplierreconfirmationconfigs(final SupplierReconfirmationConfig value)
	{
		removeFromSupplierreconfirmationconfigs( getSession().getSessionContext(), value );
	}
	
}
