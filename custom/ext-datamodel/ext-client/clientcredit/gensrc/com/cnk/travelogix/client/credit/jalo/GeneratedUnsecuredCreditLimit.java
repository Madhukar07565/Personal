/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.jalo.ClientCreditDepositLimit;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.jalo.UnsecuredCreditLimit UnsecuredCreditLimit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedUnsecuredCreditLimit extends ClientCreditDepositLimit
{
	/** Qualifier of the <code>UnsecuredCreditLimit.limitedCredit</code> attribute **/
	public static final String LIMITEDCREDIT = "limitedCredit";
	/** Qualifier of the <code>UnsecuredCreditLimit.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>UnsecuredCreditLimit.creditLimitAmount</code> attribute **/
	public static final String CREDITLIMITAMOUNT = "creditLimitAmount";
	/** Qualifier of the <code>UnsecuredCreditLimit.creditLimitPercentage</code> attribute **/
	public static final String CREDITLIMITPERCENTAGE = "creditLimitPercentage";
	/** Qualifier of the <code>UnsecuredCreditLimit.thresholdAmount</code> attribute **/
	public static final String THRESHOLDAMOUNT = "thresholdAmount";
	/** Qualifier of the <code>UnsecuredCreditLimit.thresholdPercentage</code> attribute **/
	public static final String THRESHOLDPERCENTAGE = "thresholdPercentage";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ClientCreditDepositLimit.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LIMITEDCREDIT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(CREDITLIMITAMOUNT, AttributeMode.INITIAL);
		tmp.put(CREDITLIMITPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(THRESHOLDAMOUNT, AttributeMode.INITIAL);
		tmp.put(THRESHOLDPERCENTAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.creditLimitAmount</code> attribute.
	 * @return the creditLimitAmount
	 */
	public Double getCreditLimitAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CREDITLIMITAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.creditLimitAmount</code> attribute.
	 * @return the creditLimitAmount
	 */
	public Double getCreditLimitAmount()
	{
		return getCreditLimitAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.creditLimitAmount</code> attribute. 
	 * @return the creditLimitAmount
	 */
	public double getCreditLimitAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getCreditLimitAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.creditLimitAmount</code> attribute. 
	 * @return the creditLimitAmount
	 */
	public double getCreditLimitAmountAsPrimitive()
	{
		return getCreditLimitAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.creditLimitAmount</code> attribute. 
	 * @param value the creditLimitAmount
	 */
	public void setCreditLimitAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CREDITLIMITAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.creditLimitAmount</code> attribute. 
	 * @param value the creditLimitAmount
	 */
	public void setCreditLimitAmount(final Double value)
	{
		setCreditLimitAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.creditLimitAmount</code> attribute. 
	 * @param value the creditLimitAmount
	 */
	public void setCreditLimitAmount(final SessionContext ctx, final double value)
	{
		setCreditLimitAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.creditLimitAmount</code> attribute. 
	 * @param value the creditLimitAmount
	 */
	public void setCreditLimitAmount(final double value)
	{
		setCreditLimitAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.creditLimitPercentage</code> attribute.
	 * @return the creditLimitPercentage
	 */
	public Double getCreditLimitPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CREDITLIMITPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.creditLimitPercentage</code> attribute.
	 * @return the creditLimitPercentage
	 */
	public Double getCreditLimitPercentage()
	{
		return getCreditLimitPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.creditLimitPercentage</code> attribute. 
	 * @return the creditLimitPercentage
	 */
	public double getCreditLimitPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getCreditLimitPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.creditLimitPercentage</code> attribute. 
	 * @return the creditLimitPercentage
	 */
	public double getCreditLimitPercentageAsPrimitive()
	{
		return getCreditLimitPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.creditLimitPercentage</code> attribute. 
	 * @param value the creditLimitPercentage
	 */
	public void setCreditLimitPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CREDITLIMITPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.creditLimitPercentage</code> attribute. 
	 * @param value the creditLimitPercentage
	 */
	public void setCreditLimitPercentage(final Double value)
	{
		setCreditLimitPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.creditLimitPercentage</code> attribute. 
	 * @param value the creditLimitPercentage
	 */
	public void setCreditLimitPercentage(final SessionContext ctx, final double value)
	{
		setCreditLimitPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.creditLimitPercentage</code> attribute. 
	 * @param value the creditLimitPercentage
	 */
	public void setCreditLimitPercentage(final double value)
	{
		setCreditLimitPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.limitedCredit</code> attribute.
	 * @return the limitedCredit
	 */
	public Boolean isLimitedCredit(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, LIMITEDCREDIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.limitedCredit</code> attribute.
	 * @return the limitedCredit
	 */
	public Boolean isLimitedCredit()
	{
		return isLimitedCredit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.limitedCredit</code> attribute. 
	 * @return the limitedCredit
	 */
	public boolean isLimitedCreditAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isLimitedCredit( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.limitedCredit</code> attribute. 
	 * @return the limitedCredit
	 */
	public boolean isLimitedCreditAsPrimitive()
	{
		return isLimitedCreditAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.limitedCredit</code> attribute. 
	 * @param value the limitedCredit
	 */
	public void setLimitedCredit(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, LIMITEDCREDIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.limitedCredit</code> attribute. 
	 * @param value the limitedCredit
	 */
	public void setLimitedCredit(final Boolean value)
	{
		setLimitedCredit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.limitedCredit</code> attribute. 
	 * @param value the limitedCredit
	 */
	public void setLimitedCredit(final SessionContext ctx, final boolean value)
	{
		setLimitedCredit( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.limitedCredit</code> attribute. 
	 * @param value the limitedCredit
	 */
	public void setLimitedCredit(final boolean value)
	{
		setLimitedCredit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.thresholdAmount</code> attribute.
	 * @return the thresholdAmount
	 */
	public Double getThresholdAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, THRESHOLDAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.thresholdAmount</code> attribute.
	 * @return the thresholdAmount
	 */
	public Double getThresholdAmount()
	{
		return getThresholdAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.thresholdAmount</code> attribute. 
	 * @return the thresholdAmount
	 */
	public double getThresholdAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getThresholdAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.thresholdAmount</code> attribute. 
	 * @return the thresholdAmount
	 */
	public double getThresholdAmountAsPrimitive()
	{
		return getThresholdAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.thresholdAmount</code> attribute. 
	 * @param value the thresholdAmount
	 */
	public void setThresholdAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, THRESHOLDAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.thresholdAmount</code> attribute. 
	 * @param value the thresholdAmount
	 */
	public void setThresholdAmount(final Double value)
	{
		setThresholdAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.thresholdAmount</code> attribute. 
	 * @param value the thresholdAmount
	 */
	public void setThresholdAmount(final SessionContext ctx, final double value)
	{
		setThresholdAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.thresholdAmount</code> attribute. 
	 * @param value the thresholdAmount
	 */
	public void setThresholdAmount(final double value)
	{
		setThresholdAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.thresholdPercentage</code> attribute.
	 * @return the thresholdPercentage
	 */
	public Double getThresholdPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, THRESHOLDPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.thresholdPercentage</code> attribute.
	 * @return the thresholdPercentage
	 */
	public Double getThresholdPercentage()
	{
		return getThresholdPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.thresholdPercentage</code> attribute. 
	 * @return the thresholdPercentage
	 */
	public double getThresholdPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getThresholdPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UnsecuredCreditLimit.thresholdPercentage</code> attribute. 
	 * @return the thresholdPercentage
	 */
	public double getThresholdPercentageAsPrimitive()
	{
		return getThresholdPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.thresholdPercentage</code> attribute. 
	 * @param value the thresholdPercentage
	 */
	public void setThresholdPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, THRESHOLDPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.thresholdPercentage</code> attribute. 
	 * @param value the thresholdPercentage
	 */
	public void setThresholdPercentage(final Double value)
	{
		setThresholdPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.thresholdPercentage</code> attribute. 
	 * @param value the thresholdPercentage
	 */
	public void setThresholdPercentage(final SessionContext ctx, final double value)
	{
		setThresholdPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UnsecuredCreditLimit.thresholdPercentage</code> attribute. 
	 * @param value the thresholdPercentage
	 */
	public void setThresholdPercentage(final double value)
	{
		setThresholdPercentage( getSession().getSessionContext(), value );
	}
	
}
