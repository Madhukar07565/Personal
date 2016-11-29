/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.AbstractTargetProductVolume AbstractTargetProductVolume}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractTargetProductVolume extends GenericItem
{
	/** Qualifier of the <code>AbstractTargetProductVolume.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>AbstractTargetProductVolume.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>AbstractTargetProductVolume.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>AbstractTargetProductVolume.expectedSales</code> attribute **/
	public static final String EXPECTEDSALES = "expectedSales";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(EXPECTEDSALES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTargetProductVolume.expectedSales</code> attribute.
	 * @return the expectedSales - Expected sales for TargetProductVolume
	 */
	public BigDecimal getExpectedSales(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, EXPECTEDSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTargetProductVolume.expectedSales</code> attribute.
	 * @return the expectedSales - Expected sales for TargetProductVolume
	 */
	public BigDecimal getExpectedSales()
	{
		return getExpectedSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTargetProductVolume.expectedSales</code> attribute. 
	 * @param value the expectedSales - Expected sales for TargetProductVolume
	 */
	public void setExpectedSales(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, EXPECTEDSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTargetProductVolume.expectedSales</code> attribute. 
	 * @param value the expectedSales - Expected sales for TargetProductVolume
	 */
	public void setExpectedSales(final BigDecimal value)
	{
		setExpectedSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTargetProductVolume.product</code> attribute.
	 * @return the product - Defines Product or Service
	 */
	public EnumerationValue getProduct(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTargetProductVolume.product</code> attribute.
	 * @return the product - Defines Product or Service
	 */
	public EnumerationValue getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTargetProductVolume.product</code> attribute. 
	 * @param value the product - Defines Product or Service
	 */
	public void setProduct(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTargetProductVolume.product</code> attribute. 
	 * @param value the product - Defines Product or Service
	 */
	public void setProduct(final EnumerationValue value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTargetProductVolume.productCategory</code> attribute.
	 * @return the productCategory - Product Category for TargetProductVolume
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTargetProductVolume.productCategory</code> attribute.
	 * @return the productCategory - Product Category for TargetProductVolume
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTargetProductVolume.productCategory</code> attribute. 
	 * @param value the productCategory - Product Category for TargetProductVolume
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTargetProductVolume.productCategory</code> attribute. 
	 * @param value the productCategory - Product Category for TargetProductVolume
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTargetProductVolume.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - ProductCategorySubType for TargetProductVolume
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTargetProductVolume.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - ProductCategorySubType for TargetProductVolume
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTargetProductVolume.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - ProductCategorySubType for TargetProductVolume
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTargetProductVolume.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - ProductCategorySubType for TargetProductVolume
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
}
