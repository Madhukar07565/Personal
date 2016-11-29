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
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.CreditCardEMIPaymentInfo CreditCardEMIPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCreditCardEMIPaymentInfo extends PaymentInfo
{
	/** Qualifier of the <code>CreditCardEMIPaymentInfo.bank</code> attribute **/
	public static final String BANK = "bank";
	/** Qualifier of the <code>CreditCardEMIPaymentInfo.emiOption</code> attribute **/
	public static final String EMIOPTION = "emiOption";
	/** Qualifier of the <code>CreditCardEMIPaymentInfo.cvv</code> attribute **/
	public static final String CVV = "cvv";
	/** Qualifier of the <code>CreditCardEMIPaymentInfo.masterOrVBV</code> attribute **/
	public static final String MASTERORVBV = "masterOrVBV";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BANK, AttributeMode.INITIAL);
		tmp.put(EMIOPTION, AttributeMode.INITIAL);
		tmp.put(CVV, AttributeMode.INITIAL);
		tmp.put(MASTERORVBV, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank()
	{
		return getBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final Bank value)
	{
		setBank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.cvv</code> attribute.
	 * @return the cvv
	 */
	public Integer getCvv(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CVV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.cvv</code> attribute.
	 * @return the cvv
	 */
	public Integer getCvv()
	{
		return getCvv( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.cvv</code> attribute. 
	 * @return the cvv
	 */
	public int getCvvAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCvv( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.cvv</code> attribute. 
	 * @return the cvv
	 */
	public int getCvvAsPrimitive()
	{
		return getCvvAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.cvv</code> attribute. 
	 * @param value the cvv
	 */
	public void setCvv(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CVV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.cvv</code> attribute. 
	 * @param value the cvv
	 */
	public void setCvv(final Integer value)
	{
		setCvv( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.cvv</code> attribute. 
	 * @param value the cvv
	 */
	public void setCvv(final SessionContext ctx, final int value)
	{
		setCvv( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.cvv</code> attribute. 
	 * @param value the cvv
	 */
	public void setCvv(final int value)
	{
		setCvv( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.emiOption</code> attribute.
	 * @return the emiOption
	 */
	public String getEmiOption(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMIOPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.emiOption</code> attribute.
	 * @return the emiOption
	 */
	public String getEmiOption()
	{
		return getEmiOption( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.emiOption</code> attribute. 
	 * @param value the emiOption
	 */
	public void setEmiOption(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMIOPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.emiOption</code> attribute. 
	 * @param value the emiOption
	 */
	public void setEmiOption(final String value)
	{
		setEmiOption( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.masterOrVBV</code> attribute.
	 * @return the masterOrVBV
	 */
	public Integer getMasterOrVBV(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MASTERORVBV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.masterOrVBV</code> attribute.
	 * @return the masterOrVBV
	 */
	public Integer getMasterOrVBV()
	{
		return getMasterOrVBV( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.masterOrVBV</code> attribute. 
	 * @return the masterOrVBV
	 */
	public int getMasterOrVBVAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMasterOrVBV( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardEMIPaymentInfo.masterOrVBV</code> attribute. 
	 * @return the masterOrVBV
	 */
	public int getMasterOrVBVAsPrimitive()
	{
		return getMasterOrVBVAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.masterOrVBV</code> attribute. 
	 * @param value the masterOrVBV
	 */
	public void setMasterOrVBV(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MASTERORVBV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.masterOrVBV</code> attribute. 
	 * @param value the masterOrVBV
	 */
	public void setMasterOrVBV(final Integer value)
	{
		setMasterOrVBV( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.masterOrVBV</code> attribute. 
	 * @param value the masterOrVBV
	 */
	public void setMasterOrVBV(final SessionContext ctx, final int value)
	{
		setMasterOrVBV( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardEMIPaymentInfo.masterOrVBV</code> attribute. 
	 * @param value the masterOrVBV
	 */
	public void setMasterOrVBV(final int value)
	{
		setMasterOrVBV( getSession().getSessionContext(), value );
	}
	
}
