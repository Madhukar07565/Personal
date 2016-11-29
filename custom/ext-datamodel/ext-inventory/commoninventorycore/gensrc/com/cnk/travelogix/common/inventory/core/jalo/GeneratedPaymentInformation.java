/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.PaymentInformation PaymentInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentInformation extends GenericItem
{
	/** Qualifier of the <code>PaymentInformation.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>PaymentInformation.balFromLastPaymentAdv</code> attribute **/
	public static final String BALFROMLASTPAYMENTADV = "balFromLastPaymentAdv";
	/** Qualifier of the <code>PaymentInformation.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>PaymentInformation.paymentType</code> attribute **/
	public static final String PAYMENTTYPE = "paymentType";
	/** Qualifier of the <code>PaymentInformation.paymentDueDate</code> attribute **/
	public static final String PAYMENTDUEDATE = "paymentDueDate";
	/** Qualifier of the <code>PaymentInformation.remark</code> attribute **/
	public static final String REMARK = "remark";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(BALFROMLASTPAYMENTADV, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(PAYMENTTYPE, AttributeMode.INITIAL);
		tmp.put(PAYMENTDUEDATE, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.amount</code> attribute.
	 * @return the amount - Amount
	 */
	public BigDecimal getAmount(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.amount</code> attribute.
	 * @return the amount - Amount
	 */
	public BigDecimal getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final BigDecimal value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.balFromLastPaymentAdv</code> attribute.
	 * @return the balFromLastPaymentAdv - Balance From Last Payment Advance
	 */
	public BigDecimal getBalFromLastPaymentAdv(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, BALFROMLASTPAYMENTADV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.balFromLastPaymentAdv</code> attribute.
	 * @return the balFromLastPaymentAdv - Balance From Last Payment Advance
	 */
	public BigDecimal getBalFromLastPaymentAdv()
	{
		return getBalFromLastPaymentAdv( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.balFromLastPaymentAdv</code> attribute. 
	 * @param value the balFromLastPaymentAdv - Balance From Last Payment Advance
	 */
	public void setBalFromLastPaymentAdv(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, BALFROMLASTPAYMENTADV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.balFromLastPaymentAdv</code> attribute. 
	 * @param value the balFromLastPaymentAdv - Balance From Last Payment Advance
	 */
	public void setBalFromLastPaymentAdv(final BigDecimal value)
	{
		setBalFromLastPaymentAdv( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.paymentDueDate</code> attribute.
	 * @return the paymentDueDate - Payment due date
	 */
	public Date getPaymentDueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PAYMENTDUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.paymentDueDate</code> attribute.
	 * @return the paymentDueDate - Payment due date
	 */
	public Date getPaymentDueDate()
	{
		return getPaymentDueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.paymentDueDate</code> attribute. 
	 * @param value the paymentDueDate - Payment due date
	 */
	public void setPaymentDueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PAYMENTDUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.paymentDueDate</code> attribute. 
	 * @param value the paymentDueDate - Payment due date
	 */
	public void setPaymentDueDate(final Date value)
	{
		setPaymentDueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.paymentType</code> attribute.
	 * @return the paymentType - Payment type
	 */
	public String getPaymentType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.paymentType</code> attribute.
	 * @return the paymentType - Payment type
	 */
	public String getPaymentType()
	{
		return getPaymentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.paymentType</code> attribute. 
	 * @param value the paymentType - Payment type
	 */
	public void setPaymentType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.paymentType</code> attribute. 
	 * @param value the paymentType - Payment type
	 */
	public void setPaymentType(final String value)
	{
		setPaymentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.remark</code> attribute.
	 * @return the remark - Payment remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentInformation.remark</code> attribute.
	 * @return the remark - Payment remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.remark</code> attribute. 
	 * @param value the remark - Payment remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentInformation.remark</code> attribute. 
	 * @param value the remark - Payment remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
}
