/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem PriceInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPriceInfo extends GenericItem
{
	/** Qualifier of the <code>PriceInfo.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>PriceInfo.costPrice</code> attribute **/
	public static final String COSTPRICE = "costPrice";
	/** Qualifier of the <code>PriceInfo.totalSellingPrice</code> attribute **/
	public static final String TOTALSELLINGPRICE = "totalSellingPrice";
	/** Qualifier of the <code>PriceInfo.commission</code> attribute **/
	public static final String COMMISSION = "commission";
	/** Qualifier of the <code>PriceInfo.discount</code> attribute **/
	public static final String DISCOUNT = "discount";
	/** Qualifier of the <code>PriceInfo.totalNetSellingPrice</code> attribute **/
	public static final String TOTALNETSELLINGPRICE = "totalNetSellingPrice";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(COSTPRICE, AttributeMode.INITIAL);
		tmp.put(TOTALSELLINGPRICE, AttributeMode.INITIAL);
		tmp.put(COMMISSION, AttributeMode.INITIAL);
		tmp.put(DISCOUNT, AttributeMode.INITIAL);
		tmp.put(TOTALNETSELLINGPRICE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.commission</code> attribute.
	 * @return the commission - commission
	 */
	public Double getCommission(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COMMISSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.commission</code> attribute.
	 * @return the commission - commission
	 */
	public Double getCommission()
	{
		return getCommission( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.commission</code> attribute. 
	 * @return the commission - commission
	 */
	public double getCommissionAsPrimitive(final SessionContext ctx)
	{
		Double value = getCommission( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.commission</code> attribute. 
	 * @return the commission - commission
	 */
	public double getCommissionAsPrimitive()
	{
		return getCommissionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.commission</code> attribute. 
	 * @param value the commission - commission
	 */
	public void setCommission(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COMMISSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.commission</code> attribute. 
	 * @param value the commission - commission
	 */
	public void setCommission(final Double value)
	{
		setCommission( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.commission</code> attribute. 
	 * @param value the commission - commission
	 */
	public void setCommission(final SessionContext ctx, final double value)
	{
		setCommission( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.commission</code> attribute. 
	 * @param value the commission - commission
	 */
	public void setCommission(final double value)
	{
		setCommission( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.costPrice</code> attribute.
	 * @return the costPrice - cost Price
	 */
	public Double getCostPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COSTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.costPrice</code> attribute.
	 * @return the costPrice - cost Price
	 */
	public Double getCostPrice()
	{
		return getCostPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.costPrice</code> attribute. 
	 * @return the costPrice - cost Price
	 */
	public double getCostPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getCostPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.costPrice</code> attribute. 
	 * @return the costPrice - cost Price
	 */
	public double getCostPriceAsPrimitive()
	{
		return getCostPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.costPrice</code> attribute. 
	 * @param value the costPrice - cost Price
	 */
	public void setCostPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COSTPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.costPrice</code> attribute. 
	 * @param value the costPrice - cost Price
	 */
	public void setCostPrice(final Double value)
	{
		setCostPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.costPrice</code> attribute. 
	 * @param value the costPrice - cost Price
	 */
	public void setCostPrice(final SessionContext ctx, final double value)
	{
		setCostPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.costPrice</code> attribute. 
	 * @param value the costPrice - cost Price
	 */
	public void setCostPrice(final double value)
	{
		setCostPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.discount</code> attribute.
	 * @return the discount - discount
	 */
	public Double getDiscount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DISCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.discount</code> attribute.
	 * @return the discount - discount
	 */
	public Double getDiscount()
	{
		return getDiscount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.discount</code> attribute. 
	 * @return the discount - discount
	 */
	public double getDiscountAsPrimitive(final SessionContext ctx)
	{
		Double value = getDiscount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.discount</code> attribute. 
	 * @return the discount - discount
	 */
	public double getDiscountAsPrimitive()
	{
		return getDiscountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.discount</code> attribute. 
	 * @param value the discount - discount
	 */
	public void setDiscount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DISCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.discount</code> attribute. 
	 * @param value the discount - discount
	 */
	public void setDiscount(final Double value)
	{
		setDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.discount</code> attribute. 
	 * @param value the discount - discount
	 */
	public void setDiscount(final SessionContext ctx, final double value)
	{
		setDiscount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.discount</code> attribute. 
	 * @param value the discount - discount
	 */
	public void setDiscount(final double value)
	{
		setDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.totalNetSellingPrice</code> attribute.
	 * @return the totalNetSellingPrice - total net selling price
	 */
	public Double getTotalNetSellingPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALNETSELLINGPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.totalNetSellingPrice</code> attribute.
	 * @return the totalNetSellingPrice - total net selling price
	 */
	public Double getTotalNetSellingPrice()
	{
		return getTotalNetSellingPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.totalNetSellingPrice</code> attribute. 
	 * @return the totalNetSellingPrice - total net selling price
	 */
	public double getTotalNetSellingPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalNetSellingPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.totalNetSellingPrice</code> attribute. 
	 * @return the totalNetSellingPrice - total net selling price
	 */
	public double getTotalNetSellingPriceAsPrimitive()
	{
		return getTotalNetSellingPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.totalNetSellingPrice</code> attribute. 
	 * @param value the totalNetSellingPrice - total net selling price
	 */
	public void setTotalNetSellingPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALNETSELLINGPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.totalNetSellingPrice</code> attribute. 
	 * @param value the totalNetSellingPrice - total net selling price
	 */
	public void setTotalNetSellingPrice(final Double value)
	{
		setTotalNetSellingPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.totalNetSellingPrice</code> attribute. 
	 * @param value the totalNetSellingPrice - total net selling price
	 */
	public void setTotalNetSellingPrice(final SessionContext ctx, final double value)
	{
		setTotalNetSellingPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.totalNetSellingPrice</code> attribute. 
	 * @param value the totalNetSellingPrice - total net selling price
	 */
	public void setTotalNetSellingPrice(final double value)
	{
		setTotalNetSellingPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.totalSellingPrice</code> attribute.
	 * @return the totalSellingPrice - total selling Price
	 */
	public Double getTotalSellingPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALSELLINGPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.totalSellingPrice</code> attribute.
	 * @return the totalSellingPrice - total selling Price
	 */
	public Double getTotalSellingPrice()
	{
		return getTotalSellingPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.totalSellingPrice</code> attribute. 
	 * @return the totalSellingPrice - total selling Price
	 */
	public double getTotalSellingPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalSellingPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceInfo.totalSellingPrice</code> attribute. 
	 * @return the totalSellingPrice - total selling Price
	 */
	public double getTotalSellingPriceAsPrimitive()
	{
		return getTotalSellingPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.totalSellingPrice</code> attribute. 
	 * @param value the totalSellingPrice - total selling Price
	 */
	public void setTotalSellingPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALSELLINGPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.totalSellingPrice</code> attribute. 
	 * @param value the totalSellingPrice - total selling Price
	 */
	public void setTotalSellingPrice(final Double value)
	{
		setTotalSellingPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.totalSellingPrice</code> attribute. 
	 * @param value the totalSellingPrice - total selling Price
	 */
	public void setTotalSellingPrice(final SessionContext ctx, final double value)
	{
		setTotalSellingPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceInfo.totalSellingPrice</code> attribute. 
	 * @param value the totalSellingPrice - total selling Price
	 */
	public void setTotalSellingPrice(final double value)
	{
		setTotalSellingPrice( getSession().getSessionContext(), value );
	}
	
}
