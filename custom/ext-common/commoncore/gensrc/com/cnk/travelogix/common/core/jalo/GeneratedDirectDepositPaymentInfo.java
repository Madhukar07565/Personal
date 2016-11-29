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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.DirectDepositPaymentInfo DirectDepositPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDirectDepositPaymentInfo extends PaymentInfo
{
	/** Qualifier of the <code>DirectDepositPaymentInfo.chequeOrDDToBank</code> attribute **/
	public static final String CHEQUEORDDTOBANK = "chequeOrDDToBank";
	/** Qualifier of the <code>DirectDepositPaymentInfo.chequeOrDDNumber</code> attribute **/
	public static final String CHEQUEORDDNUMBER = "chequeOrDDNumber";
	/** Qualifier of the <code>DirectDepositPaymentInfo.chequeOrDDIssuingBank</code> attribute **/
	public static final String CHEQUEORDDISSUINGBANK = "chequeOrDDIssuingBank";
	/** Qualifier of the <code>DirectDepositPaymentInfo.chequeOrDDDate</code> attribute **/
	public static final String CHEQUEORDDDATE = "chequeOrDDDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CHEQUEORDDTOBANK, AttributeMode.INITIAL);
		tmp.put(CHEQUEORDDNUMBER, AttributeMode.INITIAL);
		tmp.put(CHEQUEORDDISSUINGBANK, AttributeMode.INITIAL);
		tmp.put(CHEQUEORDDDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositPaymentInfo.chequeOrDDDate</code> attribute.
	 * @return the chequeOrDDDate
	 */
	public Date getChequeOrDDDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CHEQUEORDDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositPaymentInfo.chequeOrDDDate</code> attribute.
	 * @return the chequeOrDDDate
	 */
	public Date getChequeOrDDDate()
	{
		return getChequeOrDDDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositPaymentInfo.chequeOrDDDate</code> attribute. 
	 * @param value the chequeOrDDDate
	 */
	public void setChequeOrDDDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CHEQUEORDDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositPaymentInfo.chequeOrDDDate</code> attribute. 
	 * @param value the chequeOrDDDate
	 */
	public void setChequeOrDDDate(final Date value)
	{
		setChequeOrDDDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositPaymentInfo.chequeOrDDIssuingBank</code> attribute.
	 * @return the chequeOrDDIssuingBank
	 */
	public String getChequeOrDDIssuingBank(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHEQUEORDDISSUINGBANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositPaymentInfo.chequeOrDDIssuingBank</code> attribute.
	 * @return the chequeOrDDIssuingBank
	 */
	public String getChequeOrDDIssuingBank()
	{
		return getChequeOrDDIssuingBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositPaymentInfo.chequeOrDDIssuingBank</code> attribute. 
	 * @param value the chequeOrDDIssuingBank
	 */
	public void setChequeOrDDIssuingBank(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHEQUEORDDISSUINGBANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositPaymentInfo.chequeOrDDIssuingBank</code> attribute. 
	 * @param value the chequeOrDDIssuingBank
	 */
	public void setChequeOrDDIssuingBank(final String value)
	{
		setChequeOrDDIssuingBank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositPaymentInfo.chequeOrDDNumber</code> attribute.
	 * @return the chequeOrDDNumber
	 */
	public String getChequeOrDDNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHEQUEORDDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositPaymentInfo.chequeOrDDNumber</code> attribute.
	 * @return the chequeOrDDNumber
	 */
	public String getChequeOrDDNumber()
	{
		return getChequeOrDDNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositPaymentInfo.chequeOrDDNumber</code> attribute. 
	 * @param value the chequeOrDDNumber
	 */
	public void setChequeOrDDNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHEQUEORDDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositPaymentInfo.chequeOrDDNumber</code> attribute. 
	 * @param value the chequeOrDDNumber
	 */
	public void setChequeOrDDNumber(final String value)
	{
		setChequeOrDDNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositPaymentInfo.chequeOrDDToBank</code> attribute.
	 * @return the chequeOrDDToBank
	 */
	public Bank getChequeOrDDToBank(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, CHEQUEORDDTOBANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DirectDepositPaymentInfo.chequeOrDDToBank</code> attribute.
	 * @return the chequeOrDDToBank
	 */
	public Bank getChequeOrDDToBank()
	{
		return getChequeOrDDToBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositPaymentInfo.chequeOrDDToBank</code> attribute. 
	 * @param value the chequeOrDDToBank
	 */
	public void setChequeOrDDToBank(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, CHEQUEORDDTOBANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DirectDepositPaymentInfo.chequeOrDDToBank</code> attribute. 
	 * @param value the chequeOrDDToBank
	 */
	public void setChequeOrDDToBank(final Bank value)
	{
		setChequeOrDDToBank( getSession().getSessionContext(), value );
	}
	
}
