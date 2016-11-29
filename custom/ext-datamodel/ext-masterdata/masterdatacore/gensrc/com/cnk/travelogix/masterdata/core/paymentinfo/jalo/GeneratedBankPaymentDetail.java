/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.paymentinfo.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.paymentinfo.jalo.BankPaymentDetail BankPaymentDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBankPaymentDetail extends AbstractPaymentDetail
{
	/** Qualifier of the <code>BankPaymentDetail.paymentRefNo</code> attribute **/
	public static final String PAYMENTREFNO = "paymentRefNo";
	/** Qualifier of the <code>BankPaymentDetail.sapRefNo</code> attribute **/
	public static final String SAPREFNO = "sapRefNo";
	/** Qualifier of the <code>BankPaymentDetail.paymentDate</code> attribute **/
	public static final String PAYMENTDATE = "paymentDate";
	/** Qualifier of the <code>BankPaymentDetail.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractPaymentDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PAYMENTREFNO, AttributeMode.INITIAL);
		tmp.put(SAPREFNO, AttributeMode.INITIAL);
		tmp.put(PAYMENTDATE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankPaymentDetail.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankPaymentDetail.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankPaymentDetail.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankPaymentDetail.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankPaymentDetail.paymentDate</code> attribute.
	 * @return the paymentDate
	 */
	public Date getPaymentDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PAYMENTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankPaymentDetail.paymentDate</code> attribute.
	 * @return the paymentDate
	 */
	public Date getPaymentDate()
	{
		return getPaymentDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankPaymentDetail.paymentDate</code> attribute. 
	 * @param value the paymentDate
	 */
	public void setPaymentDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PAYMENTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankPaymentDetail.paymentDate</code> attribute. 
	 * @param value the paymentDate
	 */
	public void setPaymentDate(final Date value)
	{
		setPaymentDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankPaymentDetail.paymentRefNo</code> attribute.
	 * @return the paymentRefNo
	 */
	public String getPaymentRefNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTREFNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankPaymentDetail.paymentRefNo</code> attribute.
	 * @return the paymentRefNo
	 */
	public String getPaymentRefNo()
	{
		return getPaymentRefNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankPaymentDetail.paymentRefNo</code> attribute. 
	 * @param value the paymentRefNo
	 */
	public void setPaymentRefNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTREFNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankPaymentDetail.paymentRefNo</code> attribute. 
	 * @param value the paymentRefNo
	 */
	public void setPaymentRefNo(final String value)
	{
		setPaymentRefNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankPaymentDetail.sapRefNo</code> attribute.
	 * @return the sapRefNo
	 */
	public String getSapRefNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPREFNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankPaymentDetail.sapRefNo</code> attribute.
	 * @return the sapRefNo
	 */
	public String getSapRefNo()
	{
		return getSapRefNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankPaymentDetail.sapRefNo</code> attribute. 
	 * @param value the sapRefNo
	 */
	public void setSapRefNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPREFNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankPaymentDetail.sapRefNo</code> attribute. 
	 * @param value the sapRefNo
	 */
	public void setSapRefNo(final String value)
	{
		setSapRefNo( getSession().getSessionContext(), value );
	}
	
}
