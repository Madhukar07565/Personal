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
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.EPOSPaymentInfo EPOSPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEPOSPaymentInfo extends PaymentInfo
{
	/** Qualifier of the <code>EPOSPaymentInfo.bankName</code> attribute **/
	public static final String BANKNAME = "bankName";
	/** Qualifier of the <code>EPOSPaymentInfo.creditOrDebitCard</code> attribute **/
	public static final String CREDITORDEBITCARD = "creditOrDebitCard";
	/** Qualifier of the <code>EPOSPaymentInfo.authCode</code> attribute **/
	public static final String AUTHCODE = "authCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BANKNAME, AttributeMode.INITIAL);
		tmp.put(CREDITORDEBITCARD, AttributeMode.INITIAL);
		tmp.put(AUTHCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EPOSPaymentInfo.authCode</code> attribute.
	 * @return the authCode
	 */
	public String getAuthCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AUTHCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EPOSPaymentInfo.authCode</code> attribute.
	 * @return the authCode
	 */
	public String getAuthCode()
	{
		return getAuthCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EPOSPaymentInfo.authCode</code> attribute. 
	 * @param value the authCode
	 */
	public void setAuthCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AUTHCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EPOSPaymentInfo.authCode</code> attribute. 
	 * @param value the authCode
	 */
	public void setAuthCode(final String value)
	{
		setAuthCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EPOSPaymentInfo.bankName</code> attribute.
	 * @return the bankName
	 */
	public Bank getBankName(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANKNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EPOSPaymentInfo.bankName</code> attribute.
	 * @return the bankName
	 */
	public Bank getBankName()
	{
		return getBankName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EPOSPaymentInfo.bankName</code> attribute. 
	 * @param value the bankName
	 */
	public void setBankName(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANKNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EPOSPaymentInfo.bankName</code> attribute. 
	 * @param value the bankName
	 */
	public void setBankName(final Bank value)
	{
		setBankName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EPOSPaymentInfo.creditOrDebitCard</code> attribute.
	 * @return the creditOrDebitCard
	 */
	public String getCreditOrDebitCard(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITORDEBITCARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EPOSPaymentInfo.creditOrDebitCard</code> attribute.
	 * @return the creditOrDebitCard
	 */
	public String getCreditOrDebitCard()
	{
		return getCreditOrDebitCard( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EPOSPaymentInfo.creditOrDebitCard</code> attribute. 
	 * @param value the creditOrDebitCard
	 */
	public void setCreditOrDebitCard(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITORDEBITCARD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EPOSPaymentInfo.creditOrDebitCard</code> attribute. 
	 * @param value the creditOrDebitCard
	 */
	public void setCreditOrDebitCard(final String value)
	{
		setCreditOrDebitCard( getSession().getSessionContext(), value );
	}
	
}
