/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.jalo.SecuredCreditDepositLimit;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.jalo.SecuredDepositLimit SecuredDepositLimit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSecuredDepositLimit extends SecuredCreditDepositLimit
{
	/** Qualifier of the <code>SecuredDepositLimit.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>SecuredDepositLimit.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>SecuredDepositLimit.creditLimitPercentage</code> attribute **/
	public static final String CREDITLIMITPERCENTAGE = "creditLimitPercentage";
	/** Qualifier of the <code>SecuredDepositLimit.thresholdIn</code> attribute **/
	public static final String THRESHOLDIN = "thresholdIn";
	/** Qualifier of the <code>SecuredDepositLimit.thresholdValue</code> attribute **/
	public static final String THRESHOLDVALUE = "thresholdValue";
	/** Qualifier of the <code>SecuredDepositLimit.creditLimit</code> attribute **/
	public static final String CREDITLIMIT = "creditLimit";
	/** Qualifier of the <code>SecuredDepositLimit.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SecuredCreditDepositLimit.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(CREDITLIMITPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(THRESHOLDIN, AttributeMode.INITIAL);
		tmp.put(THRESHOLDVALUE, AttributeMode.INITIAL);
		tmp.put(CREDITLIMIT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.creditLimit</code> attribute.
	 * @return the creditLimit
	 */
	public Double getCreditLimit(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CREDITLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.creditLimit</code> attribute.
	 * @return the creditLimit
	 */
	public Double getCreditLimit()
	{
		return getCreditLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.creditLimit</code> attribute. 
	 * @return the creditLimit
	 */
	public double getCreditLimitAsPrimitive(final SessionContext ctx)
	{
		Double value = getCreditLimit( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.creditLimit</code> attribute. 
	 * @return the creditLimit
	 */
	public double getCreditLimitAsPrimitive()
	{
		return getCreditLimitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CREDITLIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final Double value)
	{
		setCreditLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final SessionContext ctx, final double value)
	{
		setCreditLimit( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final double value)
	{
		setCreditLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.creditLimitPercentage</code> attribute.
	 * @return the creditLimitPercentage
	 */
	public Double getCreditLimitPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CREDITLIMITPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.creditLimitPercentage</code> attribute.
	 * @return the creditLimitPercentage
	 */
	public Double getCreditLimitPercentage()
	{
		return getCreditLimitPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.creditLimitPercentage</code> attribute. 
	 * @return the creditLimitPercentage
	 */
	public double getCreditLimitPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getCreditLimitPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.creditLimitPercentage</code> attribute. 
	 * @return the creditLimitPercentage
	 */
	public double getCreditLimitPercentageAsPrimitive()
	{
		return getCreditLimitPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.creditLimitPercentage</code> attribute. 
	 * @param value the creditLimitPercentage
	 */
	public void setCreditLimitPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CREDITLIMITPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.creditLimitPercentage</code> attribute. 
	 * @param value the creditLimitPercentage
	 */
	public void setCreditLimitPercentage(final Double value)
	{
		setCreditLimitPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.creditLimitPercentage</code> attribute. 
	 * @param value the creditLimitPercentage
	 */
	public void setCreditLimitPercentage(final SessionContext ctx, final double value)
	{
		setCreditLimitPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.creditLimitPercentage</code> attribute. 
	 * @param value the creditLimitPercentage
	 */
	public void setCreditLimitPercentage(final double value)
	{
		setCreditLimitPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.thresholdIn</code> attribute.
	 * @return the thresholdIn
	 */
	public EnumerationValue getThresholdIn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.thresholdIn</code> attribute.
	 * @return the thresholdIn
	 */
	public EnumerationValue getThresholdIn()
	{
		return getThresholdIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.thresholdIn</code> attribute. 
	 * @param value the thresholdIn
	 */
	public void setThresholdIn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.thresholdIn</code> attribute. 
	 * @param value the thresholdIn
	 */
	public void setThresholdIn(final EnumerationValue value)
	{
		setThresholdIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.thresholdValue</code> attribute.
	 * @return the thresholdValue
	 */
	public Double getThresholdValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, THRESHOLDVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.thresholdValue</code> attribute.
	 * @return the thresholdValue
	 */
	public Double getThresholdValue()
	{
		return getThresholdValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.thresholdValue</code> attribute. 
	 * @return the thresholdValue
	 */
	public double getThresholdValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getThresholdValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.thresholdValue</code> attribute. 
	 * @return the thresholdValue
	 */
	public double getThresholdValueAsPrimitive()
	{
		return getThresholdValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, THRESHOLDVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final Double value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final SessionContext ctx, final double value)
	{
		setThresholdValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final double value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredDepositLimit.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredDepositLimit.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
