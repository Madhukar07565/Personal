/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.core.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.core.jalo.CreditLimitInfo CreditLimitInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCreditLimitInfo extends GenericItem
{
	/** Qualifier of the <code>CreditLimitInfo.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>CreditLimitInfo.creditLimit</code> attribute **/
	public static final String CREDITLIMIT = "creditLimit";
	/** Qualifier of the <code>CreditLimitInfo.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AMOUNT, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>CreditLimitInfo.amount</code> attribute.
	 * @return the amount - Amount for credit limit
	 */
	public EnumerationValue getAmount(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditLimitInfo.amount</code> attribute.
	 * @return the amount - Amount for credit limit
	 */
	public EnumerationValue getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditLimitInfo.amount</code> attribute. 
	 * @param value the amount - Amount for credit limit
	 */
	public void setAmount(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditLimitInfo.amount</code> attribute. 
	 * @param value the amount - Amount for credit limit
	 */
	public void setAmount(final EnumerationValue value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditLimitInfo.creditLimit</code> attribute.
	 * @return the creditLimit - Credit Limit
	 */
	public BigDecimal getCreditLimit(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, CREDITLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditLimitInfo.creditLimit</code> attribute.
	 * @return the creditLimit - Credit Limit
	 */
	public BigDecimal getCreditLimit()
	{
		return getCreditLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditLimitInfo.creditLimit</code> attribute. 
	 * @param value the creditLimit - Credit Limit
	 */
	public void setCreditLimit(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, CREDITLIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditLimitInfo.creditLimit</code> attribute. 
	 * @param value the creditLimit - Credit Limit
	 */
	public void setCreditLimit(final BigDecimal value)
	{
		setCreditLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditLimitInfo.currency</code> attribute.
	 * @return the currency - Currency for Credit Limit
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditLimitInfo.currency</code> attribute.
	 * @return the currency - Currency for Credit Limit
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditLimitInfo.currency</code> attribute. 
	 * @param value the currency - Currency for Credit Limit
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditLimitInfo.currency</code> attribute. 
	 * @param value the currency - Currency for Credit Limit
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
}
