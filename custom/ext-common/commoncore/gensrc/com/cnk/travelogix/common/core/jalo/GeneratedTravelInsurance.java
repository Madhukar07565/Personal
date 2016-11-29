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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem TravelInsurance}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelInsurance extends GenericItem
{
	/** Qualifier of the <code>TravelInsurance.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>TravelInsurance.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>TravelInsurance.costPrice</code> attribute **/
	public static final String COSTPRICE = "costPrice";
	/** Qualifier of the <code>TravelInsurance.totalPrice</code> attribute **/
	public static final String TOTALPRICE = "totalPrice";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(COSTPRICE, AttributeMode.INITIAL);
		tmp.put(TOTALPRICE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.costPrice</code> attribute.
	 * @return the costPrice - cost Price
	 */
	public Double getCostPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COSTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.costPrice</code> attribute.
	 * @return the costPrice - cost Price
	 */
	public Double getCostPrice()
	{
		return getCostPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.costPrice</code> attribute. 
	 * @return the costPrice - cost Price
	 */
	public double getCostPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getCostPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.costPrice</code> attribute. 
	 * @return the costPrice - cost Price
	 */
	public double getCostPriceAsPrimitive()
	{
		return getCostPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.costPrice</code> attribute. 
	 * @param value the costPrice - cost Price
	 */
	public void setCostPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COSTPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.costPrice</code> attribute. 
	 * @param value the costPrice - cost Price
	 */
	public void setCostPrice(final Double value)
	{
		setCostPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.costPrice</code> attribute. 
	 * @param value the costPrice - cost Price
	 */
	public void setCostPrice(final SessionContext ctx, final double value)
	{
		setCostPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.costPrice</code> attribute. 
	 * @param value the costPrice - cost Price
	 */
	public void setCostPrice(final double value)
	{
		setCostPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.totalPrice</code> attribute.
	 * @return the totalPrice - total Price
	 */
	public Double getTotalPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.totalPrice</code> attribute.
	 * @return the totalPrice - total Price
	 */
	public Double getTotalPrice()
	{
		return getTotalPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.totalPrice</code> attribute. 
	 * @return the totalPrice - total Price
	 */
	public double getTotalPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelInsurance.totalPrice</code> attribute. 
	 * @return the totalPrice - total Price
	 */
	public double getTotalPriceAsPrimitive()
	{
		return getTotalPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.totalPrice</code> attribute. 
	 * @param value the totalPrice - total Price
	 */
	public void setTotalPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.totalPrice</code> attribute. 
	 * @param value the totalPrice - total Price
	 */
	public void setTotalPrice(final Double value)
	{
		setTotalPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.totalPrice</code> attribute. 
	 * @param value the totalPrice - total Price
	 */
	public void setTotalPrice(final SessionContext ctx, final double value)
	{
		setTotalPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelInsurance.totalPrice</code> attribute. 
	 * @param value the totalPrice - total Price
	 */
	public void setTotalPrice(final double value)
	{
		setTotalPrice( getSession().getSessionContext(), value );
	}
	
}
