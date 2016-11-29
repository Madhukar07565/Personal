/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.MLMDistribution MLMDistribution}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMLMDistribution extends GenericItem
{
	/** Qualifier of the <code>MLMDistribution.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>MLMDistribution.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>MLMDistribution.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>MLMDistribution.parentDistribution</code> attribute **/
	public static final String PARENTDISTRIBUTION = "parentDistribution";
	/** Qualifier of the <code>MLMDistribution.childDistribution</code> attribute **/
	public static final String CHILDDISTRIBUTION = "childDistribution";
	/** Qualifier of the <code>MLMDistribution.totalDistribution</code> attribute **/
	public static final String TOTALDISTRIBUTION = "totalDistribution";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		tmp.put(PARENTDISTRIBUTION, AttributeMode.INITIAL);
		tmp.put(CHILDDISTRIBUTION, AttributeMode.INITIAL);
		tmp.put(TOTALDISTRIBUTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.childDistribution</code> attribute.
	 * @return the childDistribution - Child share for distribution
	 */
	public BigDecimal getChildDistribution(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, CHILDDISTRIBUTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.childDistribution</code> attribute.
	 * @return the childDistribution - Child share for distribution
	 */
	public BigDecimal getChildDistribution()
	{
		return getChildDistribution( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.childDistribution</code> attribute. 
	 * @param value the childDistribution - Child share for distribution
	 */
	public void setChildDistribution(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, CHILDDISTRIBUTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.childDistribution</code> attribute. 
	 * @param value the childDistribution - Child share for distribution
	 */
	public void setChildDistribution(final BigDecimal value)
	{
		setChildDistribution( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Start date
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Start date
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Start date
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Start date
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.parentDistribution</code> attribute.
	 * @return the parentDistribution - Parent share for distribution
	 */
	public BigDecimal getParentDistribution(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, PARENTDISTRIBUTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.parentDistribution</code> attribute.
	 * @return the parentDistribution - Parent share for distribution
	 */
	public BigDecimal getParentDistribution()
	{
		return getParentDistribution( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.parentDistribution</code> attribute. 
	 * @param value the parentDistribution - Parent share for distribution
	 */
	public void setParentDistribution(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, PARENTDISTRIBUTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.parentDistribution</code> attribute. 
	 * @param value the parentDistribution - Parent share for distribution
	 */
	public void setParentDistribution(final BigDecimal value)
	{
		setParentDistribution( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.productCategory</code> attribute.
	 * @return the productCategory - Product Category
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.productCategory</code> attribute.
	 * @return the productCategory - Product Category
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.productCategory</code> attribute. 
	 * @param value the productCategory - Product Category
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.productCategory</code> attribute. 
	 * @param value the productCategory - Product Category
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - Product Category Sub Type
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - Product Category Sub Type
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - Product Category Sub Type
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - Product Category Sub Type
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.totalDistribution</code> attribute.
	 * @return the totalDistribution - Total distribution
	 */
	public BigDecimal getTotalDistribution(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, TOTALDISTRIBUTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.totalDistribution</code> attribute.
	 * @return the totalDistribution - Total distribution
	 */
	public BigDecimal getTotalDistribution()
	{
		return getTotalDistribution( getSession().getSessionContext() );
	}
	
}
