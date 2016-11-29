/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.jalo.LimitByBranchOrProduct LimitByBranchOrProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLimitByBranchOrProduct extends GenericItem
{
	/** Qualifier of the <code>LimitByBranchOrProduct.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>LimitByBranchOrProduct.productCategorySubtype</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubtype";
	/** Qualifier of the <code>LimitByBranchOrProduct.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>LimitByBranchOrProduct.productSubtype</code> attribute **/
	public static final String PRODUCTSUBTYPE = "productSubtype";
	/** Qualifier of the <code>LimitByBranchOrProduct.creditLimitIn</code> attribute **/
	public static final String CREDITLIMITIN = "creditLimitIn";
	/** Qualifier of the <code>LimitByBranchOrProduct.creditLimit</code> attribute **/
	public static final String CREDITLIMIT = "creditLimit";
	/** Qualifier of the <code>LimitByBranchOrProduct.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>LimitByBranchOrProduct.thresholdIn</code> attribute **/
	public static final String THRESHOLDIN = "thresholdIn";
	/** Qualifier of the <code>LimitByBranchOrProduct.thresholdValue</code> attribute **/
	public static final String THRESHOLDVALUE = "thresholdValue";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(PRODUCTSUBTYPE, AttributeMode.INITIAL);
		tmp.put(CREDITLIMITIN, AttributeMode.INITIAL);
		tmp.put(CREDITLIMIT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(THRESHOLDIN, AttributeMode.INITIAL);
		tmp.put(THRESHOLDVALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.creditLimit</code> attribute.
	 * @return the creditLimit
	 */
	public Double getCreditLimit(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CREDITLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.creditLimit</code> attribute.
	 * @return the creditLimit
	 */
	public Double getCreditLimit()
	{
		return getCreditLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.creditLimit</code> attribute. 
	 * @return the creditLimit
	 */
	public double getCreditLimitAsPrimitive(final SessionContext ctx)
	{
		Double value = getCreditLimit( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.creditLimit</code> attribute. 
	 * @return the creditLimit
	 */
	public double getCreditLimitAsPrimitive()
	{
		return getCreditLimitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CREDITLIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final Double value)
	{
		setCreditLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final SessionContext ctx, final double value)
	{
		setCreditLimit( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final double value)
	{
		setCreditLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.creditLimitIn</code> attribute.
	 * @return the creditLimitIn
	 */
	public EnumerationValue getCreditLimitIn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CREDITLIMITIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.creditLimitIn</code> attribute.
	 * @return the creditLimitIn
	 */
	public EnumerationValue getCreditLimitIn()
	{
		return getCreditLimitIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.creditLimitIn</code> attribute. 
	 * @param value the creditLimitIn
	 */
	public void setCreditLimitIn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CREDITLIMITIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.creditLimitIn</code> attribute. 
	 * @param value the creditLimitIn
	 */
	public void setCreditLimitIn(final EnumerationValue value)
	{
		setCreditLimitIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.productCategorySubtype</code> attribute.
	 * @return the productCategorySubtype
	 */
	public ProductCategorySubType getProductCategorySubtype(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.productCategorySubtype</code> attribute.
	 * @return the productCategorySubtype
	 */
	public ProductCategorySubType getProductCategorySubtype()
	{
		return getProductCategorySubtype( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.productCategorySubtype</code> attribute. 
	 * @param value the productCategorySubtype
	 */
	public void setProductCategorySubtype(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.productCategorySubtype</code> attribute. 
	 * @param value the productCategorySubtype
	 */
	public void setProductCategorySubtype(final ProductCategorySubType value)
	{
		setProductCategorySubtype( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.productSubtype</code> attribute.
	 * @return the productSubtype
	 */
	public VariantProduct getProductSubtype(final SessionContext ctx)
	{
		return (VariantProduct)getProperty( ctx, PRODUCTSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.productSubtype</code> attribute.
	 * @return the productSubtype
	 */
	public VariantProduct getProductSubtype()
	{
		return getProductSubtype( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.productSubtype</code> attribute. 
	 * @param value the productSubtype
	 */
	public void setProductSubtype(final SessionContext ctx, final VariantProduct value)
	{
		setProperty(ctx, PRODUCTSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.productSubtype</code> attribute. 
	 * @param value the productSubtype
	 */
	public void setProductSubtype(final VariantProduct value)
	{
		setProductSubtype( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.thresholdIn</code> attribute.
	 * @return the thresholdIn
	 */
	public EnumerationValue getThresholdIn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.thresholdIn</code> attribute.
	 * @return the thresholdIn
	 */
	public EnumerationValue getThresholdIn()
	{
		return getThresholdIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.thresholdIn</code> attribute. 
	 * @param value the thresholdIn
	 */
	public void setThresholdIn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.thresholdIn</code> attribute. 
	 * @param value the thresholdIn
	 */
	public void setThresholdIn(final EnumerationValue value)
	{
		setThresholdIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.thresholdValue</code> attribute.
	 * @return the thresholdValue
	 */
	public Double getThresholdValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, THRESHOLDVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.thresholdValue</code> attribute.
	 * @return the thresholdValue
	 */
	public Double getThresholdValue()
	{
		return getThresholdValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.thresholdValue</code> attribute. 
	 * @return the thresholdValue
	 */
	public double getThresholdValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getThresholdValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LimitByBranchOrProduct.thresholdValue</code> attribute. 
	 * @return the thresholdValue
	 */
	public double getThresholdValueAsPrimitive()
	{
		return getThresholdValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, THRESHOLDVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final Double value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final SessionContext ctx, final double value)
	{
		setThresholdValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LimitByBranchOrProduct.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final double value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
}
