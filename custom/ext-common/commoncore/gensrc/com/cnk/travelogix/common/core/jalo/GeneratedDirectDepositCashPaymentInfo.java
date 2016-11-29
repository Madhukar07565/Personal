/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.DirectDepositCashPaymentInfo DirectDepositCashPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDirectDepositCashPaymentInfo extends PaymentInfo
{
	/** Qualifier of the <code>DirectDepositCashPaymentInfo.denomination</code> attribute **/
	public static final String DENOMINATION = "denomination";
	/** Qualifier of the <code>DirectDepositCashPaymentInfo.bankAccountNumber</code> attribute **/
	public static final String BANKACCOUNTNUMBER = "bankAccountNumber";
	/** Qualifier of the <code>DirectDepositCashPaymentInfo.bankName</code> attribute **/
	public static final String BANKNAME = "bankName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DENOMINATION, AttributeMode.INITIAL);
		tmp.put(BANKACCOUNTNUMBER, AttributeMode.INITIAL);
		tmp.put(BANKNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositCashPaymentInfo.bankAccountNumber</code> attribute.
	 * @return the bankAccountNumber
	 */
	public String getBankAccountNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BANKACCOUNTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositCashPaymentInfo.bankAccountNumber</code> attribute.
	 * @return the bankAccountNumber
	 */
	public String getBankAccountNumber()
	{
		return getBankAccountNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositCashPaymentInfo.bankAccountNumber</code> attribute. 
	 * @param value the bankAccountNumber
	 */
	public void setBankAccountNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BANKACCOUNTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositCashPaymentInfo.bankAccountNumber</code> attribute. 
	 * @param value the bankAccountNumber
	 */
	public void setBankAccountNumber(final String value)
	{
		setBankAccountNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositCashPaymentInfo.bankName</code> attribute.
	 * @return the bankName
	 */
	public Bank getBankName(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANKNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositCashPaymentInfo.bankName</code> attribute.
	 * @return the bankName
	 */
	public Bank getBankName()
	{
		return getBankName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositCashPaymentInfo.bankName</code> attribute. 
	 * @param value the bankName
	 */
	public void setBankName(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANKNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositCashPaymentInfo.bankName</code> attribute. 
	 * @param value the bankName
	 */
	public void setBankName(final Bank value)
	{
		setBankName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositCashPaymentInfo.denomination</code> attribute.
	 * @return the denomination
	 */
	public Integer getDenomination(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DENOMINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositCashPaymentInfo.denomination</code> attribute.
	 * @return the denomination
	 */
	public Integer getDenomination()
	{
		return getDenomination( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositCashPaymentInfo.denomination</code> attribute. 
	 * @return the denomination
	 */
	public int getDenominationAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDenomination( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositCashPaymentInfo.denomination</code> attribute. 
	 * @return the denomination
	 */
	public int getDenominationAsPrimitive()
	{
		return getDenominationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositCashPaymentInfo.denomination</code> attribute. 
	 * @param value the denomination
	 */
	public void setDenomination(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DENOMINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositCashPaymentInfo.denomination</code> attribute. 
	 * @param value the denomination
	 */
	public void setDenomination(final Integer value)
	{
		setDenomination( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositCashPaymentInfo.denomination</code> attribute. 
	 * @param value the denomination
	 */
	public void setDenomination(final SessionContext ctx, final int value)
	{
		setDenomination( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositCashPaymentInfo.denomination</code> attribute. 
	 * @param value the denomination
	 */
	public void setDenomination(final int value)
	{
		setDenomination( getSession().getSessionContext(), value );
	}
	
}
