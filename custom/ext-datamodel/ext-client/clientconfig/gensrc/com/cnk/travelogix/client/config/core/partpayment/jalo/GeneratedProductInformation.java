/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.partpayment.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.partpayment.jalo.PartPaymentMasterConfig;
import com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitMasterConfig;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.partpayment.jalo.ProductInformation ProductInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductInformation extends GenericItem
{
	/** Qualifier of the <code>ProductInformation.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>ProductInformation.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>ProductInformation.inclusion</code> attribute **/
	public static final String INCLUSION = "inclusion";
	/** Qualifier of the <code>ProductInformation.partPaymentMasterConfig</code> attribute **/
	public static final String PARTPAYMENTMASTERCONFIG = "partPaymentMasterConfig";
	/** Qualifier of the <code>ProductInformation.timeLimitMasterConfig</code> attribute **/
	public static final String TIMELIMITMASTERCONFIG = "timeLimitMasterConfig";
	/** Qualifier of the <code>ProductInformation.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PARTPAYMENTMASTERCONFIG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedProductInformation> PARTPAYMENTMASTERCONFIGHANDLER = new BidirectionalOneToManyHandler<GeneratedProductInformation>(
	ClientconfigConstants.TC.PRODUCTINFORMATION,
	false,
	"partPaymentMasterConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TIMELIMITMASTERCONFIG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedProductInformation> TIMELIMITMASTERCONFIGHANDLER = new BidirectionalOneToManyHandler<GeneratedProductInformation>(
	ClientconfigConstants.TC.PRODUCTINFORMATION,
	false,
	"timeLimitMasterConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> PRODUCTHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"productInformation",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(INCLUSION, AttributeMode.INITIAL);
		tmp.put(PARTPAYMENTMASTERCONFIG, AttributeMode.INITIAL);
		tmp.put(TIMELIMITMASTERCONFIG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PARTPAYMENTMASTERCONFIGHANDLER.newInstance(ctx, allAttributes);
		TIMELIMITMASTERCONFIGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Boolean isInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Boolean isInclusion()
	{
		return isInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.inclusion</code> attribute. 
	 * @return the inclusion
	 */
	public boolean isInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.inclusion</code> attribute. 
	 * @return the inclusion
	 */
	public boolean isInclusionAsPrimitive()
	{
		return isInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final Boolean value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final boolean value)
	{
		setInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final boolean value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.partPaymentMasterConfig</code> attribute.
	 * @return the partPaymentMasterConfig
	 */
	public PartPaymentMasterConfig getPartPaymentMasterConfig(final SessionContext ctx)
	{
		return (PartPaymentMasterConfig)getProperty( ctx, PARTPAYMENTMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.partPaymentMasterConfig</code> attribute.
	 * @return the partPaymentMasterConfig
	 */
	public PartPaymentMasterConfig getPartPaymentMasterConfig()
	{
		return getPartPaymentMasterConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.partPaymentMasterConfig</code> attribute. 
	 * @param value the partPaymentMasterConfig
	 */
	public void setPartPaymentMasterConfig(final SessionContext ctx, final PartPaymentMasterConfig value)
	{
		PARTPAYMENTMASTERCONFIGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.partPaymentMasterConfig</code> attribute. 
	 * @param value the partPaymentMasterConfig
	 */
	public void setPartPaymentMasterConfig(final PartPaymentMasterConfig value)
	{
		setPartPaymentMasterConfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.product</code> attribute.
	 * @return the product
	 */
	public Set<Product> getProduct(final SessionContext ctx)
	{
		return (Set<Product>)PRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.product</code> attribute.
	 * @return the product
	 */
	public Set<Product> getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Set<Product> value)
	{
		PRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Set<Product> value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to product. 
	 * @param value the item to add to product
	 */
	public void addToProduct(final SessionContext ctx, final Product value)
	{
		PRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to product. 
	 * @param value the item to add to product
	 */
	public void addToProduct(final Product value)
	{
		addToProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from product. 
	 * @param value the item to remove from product
	 */
	public void removeFromProduct(final SessionContext ctx, final Product value)
	{
		PRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from product. 
	 * @param value the item to remove from product
	 */
	public void removeFromProduct(final Product value)
	{
		removeFromProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final SessionContext ctx)
	{
		return (TimeLimitMasterConfig)getProperty( ctx, TIMELIMITMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformation.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig()
	{
		return getTimeLimitMasterConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final SessionContext ctx, final TimeLimitMasterConfig value)
	{
		TIMELIMITMASTERCONFIGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformation.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final TimeLimitMasterConfig value)
	{
		setTimeLimitMasterConfig( getSession().getSessionContext(), value );
	}
	
}
