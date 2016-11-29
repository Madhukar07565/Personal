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
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.FundTransferPaymentInfo FundTransferPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFundTransferPaymentInfo extends PaymentInfo
{
	/** Qualifier of the <code>FundTransferPaymentInfo.referenceNumber</code> attribute **/
	public static final String REFERENCENUMBER = "referenceNumber";
	/** Qualifier of the <code>FundTransferPaymentInfo.fromBank</code> attribute **/
	public static final String FROMBANK = "fromBank";
	/** Qualifier of the <code>FundTransferPaymentInfo.toBank</code> attribute **/
	public static final String TOBANK = "toBank";
	/** Qualifier of the <code>FundTransferPaymentInfo.accountNumber</code> attribute **/
	public static final String ACCOUNTNUMBER = "accountNumber";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REFERENCENUMBER, AttributeMode.INITIAL);
		tmp.put(FROMBANK, AttributeMode.INITIAL);
		tmp.put(TOBANK, AttributeMode.INITIAL);
		tmp.put(ACCOUNTNUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FundTransferPaymentInfo.accountNumber</code> attribute.
	 * @return the accountNumber
	 */
	public String getAccountNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCOUNTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FundTransferPaymentInfo.accountNumber</code> attribute.
	 * @return the accountNumber
	 */
	public String getAccountNumber()
	{
		return getAccountNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FundTransferPaymentInfo.accountNumber</code> attribute. 
	 * @param value the accountNumber
	 */
	public void setAccountNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCOUNTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FundTransferPaymentInfo.accountNumber</code> attribute. 
	 * @param value the accountNumber
	 */
	public void setAccountNumber(final String value)
	{
		setAccountNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FundTransferPaymentInfo.fromBank</code> attribute.
	 * @return the fromBank
	 */
	public Bank getFromBank(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, FROMBANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FundTransferPaymentInfo.fromBank</code> attribute.
	 * @return the fromBank
	 */
	public Bank getFromBank()
	{
		return getFromBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FundTransferPaymentInfo.fromBank</code> attribute. 
	 * @param value the fromBank
	 */
	public void setFromBank(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, FROMBANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FundTransferPaymentInfo.fromBank</code> attribute. 
	 * @param value the fromBank
	 */
	public void setFromBank(final Bank value)
	{
		setFromBank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FundTransferPaymentInfo.referenceNumber</code> attribute.
	 * @return the referenceNumber
	 */
	public String getReferenceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REFERENCENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FundTransferPaymentInfo.referenceNumber</code> attribute.
	 * @return the referenceNumber
	 */
	public String getReferenceNumber()
	{
		return getReferenceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FundTransferPaymentInfo.referenceNumber</code> attribute. 
	 * @param value the referenceNumber
	 */
	public void setReferenceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REFERENCENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FundTransferPaymentInfo.referenceNumber</code> attribute. 
	 * @param value the referenceNumber
	 */
	public void setReferenceNumber(final String value)
	{
		setReferenceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FundTransferPaymentInfo.toBank</code> attribute.
	 * @return the toBank
	 */
	public Bank getToBank(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, TOBANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FundTransferPaymentInfo.toBank</code> attribute.
	 * @return the toBank
	 */
	public Bank getToBank()
	{
		return getToBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FundTransferPaymentInfo.toBank</code> attribute. 
	 * @param value the toBank
	 */
	public void setToBank(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, TOBANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FundTransferPaymentInfo.toBank</code> attribute. 
	 * @param value the toBank
	 */
	public void setToBank(final Bank value)
	{
		setToBank( getSession().getSessionContext(), value );
	}
	
}
