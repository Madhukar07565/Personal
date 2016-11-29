/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.order.payment.PaymentInfo EmiCreditCardPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEmiCreditCardPaymentInfo extends PaymentInfo
{
	/** Qualifier of the <code>EmiCreditCardPaymentInfo.bank</code> attribute **/
	public static final String BANK = "bank";
	/** Qualifier of the <code>EmiCreditCardPaymentInfo.emiOption</code> attribute **/
	public static final String EMIOPTION = "emiOption";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BANK, AttributeMode.INITIAL);
		tmp.put(EMIOPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmiCreditCardPaymentInfo.bank</code> attribute.
	 * @return the bank
	 */
	public String getBank(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmiCreditCardPaymentInfo.bank</code> attribute.
	 * @return the bank
	 */
	public String getBank()
	{
		return getBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmiCreditCardPaymentInfo.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmiCreditCardPaymentInfo.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final String value)
	{
		setBank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmiCreditCardPaymentInfo.emiOption</code> attribute.
	 * @return the emiOption
	 */
	public String getEmiOption(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMIOPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmiCreditCardPaymentInfo.emiOption</code> attribute.
	 * @return the emiOption
	 */
	public String getEmiOption()
	{
		return getEmiOption( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmiCreditCardPaymentInfo.emiOption</code> attribute. 
	 * @param value the emiOption
	 */
	public void setEmiOption(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMIOPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmiCreditCardPaymentInfo.emiOption</code> attribute. 
	 * @param value the emiOption
	 */
	public void setEmiOption(final String value)
	{
		setEmiOption( getSession().getSessionContext(), value );
	}
	
}
