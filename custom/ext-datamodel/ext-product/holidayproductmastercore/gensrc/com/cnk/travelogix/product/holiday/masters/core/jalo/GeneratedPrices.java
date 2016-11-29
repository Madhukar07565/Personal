/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.ActualPrices;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.Prices Prices}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPrices extends ActualPrices
{
	/** Qualifier of the <code>Prices.companyPackageCategory</code> attribute **/
	public static final String COMPANYPACKAGECATEGORY = "companyPackageCategory";
	/** Qualifier of the <code>Prices.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>Prices.perItem</code> attribute **/
	public static final String PERITEM = "perItem";
	/** Qualifier of the <code>Prices.adult</code> attribute **/
	public static final String ADULT = "adult";
	/** Qualifier of the <code>Prices.child</code> attribute **/
	public static final String CHILD = "child";
	/** Qualifier of the <code>Prices.infant</code> attribute **/
	public static final String INFANT = "infant";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ActualPrices.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPANYPACKAGECATEGORY, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(PERITEM, AttributeMode.INITIAL);
		tmp.put(ADULT, AttributeMode.INITIAL);
		tmp.put(CHILD, AttributeMode.INITIAL);
		tmp.put(INFANT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.adult</code> attribute.
	 * @return the adult - Adult
	 */
	public Double getAdult(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, ADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.adult</code> attribute.
	 * @return the adult - Adult
	 */
	public Double getAdult()
	{
		return getAdult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.adult</code> attribute. 
	 * @return the adult - Adult
	 */
	public double getAdultAsPrimitive(final SessionContext ctx)
	{
		Double value = getAdult( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.adult</code> attribute. 
	 * @return the adult - Adult
	 */
	public double getAdultAsPrimitive()
	{
		return getAdultAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.adult</code> attribute. 
	 * @param value the adult - Adult
	 */
	public void setAdult(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, ADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.adult</code> attribute. 
	 * @param value the adult - Adult
	 */
	public void setAdult(final Double value)
	{
		setAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.adult</code> attribute. 
	 * @param value the adult - Adult
	 */
	public void setAdult(final SessionContext ctx, final double value)
	{
		setAdult( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.adult</code> attribute. 
	 * @param value the adult - Adult
	 */
	public void setAdult(final double value)
	{
		setAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.child</code> attribute.
	 * @return the child - Child
	 */
	public Double getChild(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.child</code> attribute.
	 * @return the child - Child
	 */
	public Double getChild()
	{
		return getChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.child</code> attribute. 
	 * @return the child - Child
	 */
	public double getChildAsPrimitive(final SessionContext ctx)
	{
		Double value = getChild( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.child</code> attribute. 
	 * @return the child - Child
	 */
	public double getChildAsPrimitive()
	{
		return getChildAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.child</code> attribute. 
	 * @param value the child - Child
	 */
	public void setChild(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.child</code> attribute. 
	 * @param value the child - Child
	 */
	public void setChild(final Double value)
	{
		setChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.child</code> attribute. 
	 * @param value the child - Child
	 */
	public void setChild(final SessionContext ctx, final double value)
	{
		setChild( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.child</code> attribute. 
	 * @param value the child - Child
	 */
	public void setChild(final double value)
	{
		setChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.companyPackageCategory</code> attribute.
	 * @return the companyPackageCategory - Company package category
	 */
	public EnumerationValue getCompanyPackageCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYPACKAGECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.companyPackageCategory</code> attribute.
	 * @return the companyPackageCategory - Company package category
	 */
	public EnumerationValue getCompanyPackageCategory()
	{
		return getCompanyPackageCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.companyPackageCategory</code> attribute. 
	 * @param value the companyPackageCategory - Company package category
	 */
	public void setCompanyPackageCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYPACKAGECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.companyPackageCategory</code> attribute. 
	 * @param value the companyPackageCategory - Company package category
	 */
	public void setCompanyPackageCategory(final EnumerationValue value)
	{
		setCompanyPackageCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.infant</code> attribute.
	 * @return the infant - Infant
	 */
	public Double getInfant(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, INFANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.infant</code> attribute.
	 * @return the infant - Infant
	 */
	public Double getInfant()
	{
		return getInfant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.infant</code> attribute. 
	 * @return the infant - Infant
	 */
	public double getInfantAsPrimitive(final SessionContext ctx)
	{
		Double value = getInfant( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.infant</code> attribute. 
	 * @return the infant - Infant
	 */
	public double getInfantAsPrimitive()
	{
		return getInfantAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.infant</code> attribute. 
	 * @param value the infant - Infant
	 */
	public void setInfant(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, INFANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.infant</code> attribute. 
	 * @param value the infant - Infant
	 */
	public void setInfant(final Double value)
	{
		setInfant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.infant</code> attribute. 
	 * @param value the infant - Infant
	 */
	public void setInfant(final SessionContext ctx, final double value)
	{
		setInfant( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.infant</code> attribute. 
	 * @param value the infant - Infant
	 */
	public void setInfant(final double value)
	{
		setInfant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.perItem</code> attribute.
	 * @return the perItem - Per item
	 */
	public Double getPerItem(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERITEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.perItem</code> attribute.
	 * @return the perItem - Per item
	 */
	public Double getPerItem()
	{
		return getPerItem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.perItem</code> attribute. 
	 * @return the perItem - Per item
	 */
	public double getPerItemAsPrimitive(final SessionContext ctx)
	{
		Double value = getPerItem( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prices.perItem</code> attribute. 
	 * @return the perItem - Per item
	 */
	public double getPerItemAsPrimitive()
	{
		return getPerItemAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.perItem</code> attribute. 
	 * @param value the perItem - Per item
	 */
	public void setPerItem(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERITEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.perItem</code> attribute. 
	 * @param value the perItem - Per item
	 */
	public void setPerItem(final Double value)
	{
		setPerItem( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.perItem</code> attribute. 
	 * @param value the perItem - Per item
	 */
	public void setPerItem(final SessionContext ctx, final double value)
	{
		setPerItem( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prices.perItem</code> attribute. 
	 * @param value the perItem - Per item
	 */
	public void setPerItem(final double value)
	{
		setPerItem( getSession().getSessionContext(), value );
	}
	
}
