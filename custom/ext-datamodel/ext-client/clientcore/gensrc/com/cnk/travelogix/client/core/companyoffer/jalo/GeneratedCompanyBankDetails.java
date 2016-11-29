/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.CompanyBankDetails CompanyBankDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyBankDetails extends GenericItem
{
	/** Qualifier of the <code>CompanyBankDetails.bankName</code> attribute **/
	public static final String BANKNAME = "bankName";
	/** Qualifier of the <code>CompanyBankDetails.cardType</code> attribute **/
	public static final String CARDTYPE = "cardType";
	/** Qualifier of the <code>CompanyBankDetails.paymentType</code> attribute **/
	public static final String PAYMENTTYPE = "paymentType";
	/** Qualifier of the <code>CompanyBankDetails.modeOfPayment</code> attribute **/
	public static final String MODEOFPAYMENT = "modeOfPayment";
	/** Qualifier of the <code>CompanyBankDetails.lastDigit</code> attribute **/
	public static final String LASTDIGIT = "lastDigit";
	/** Qualifier of the <code>CompanyBankDetails.startingDigit</code> attribute **/
	public static final String STARTINGDIGIT = "startingDigit";
	/** Qualifier of the <code>CompanyBankDetails.totalDigits</code> attribute **/
	public static final String TOTALDIGITS = "totalDigits";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BANKNAME, AttributeMode.INITIAL);
		tmp.put(CARDTYPE, AttributeMode.INITIAL);
		tmp.put(PAYMENTTYPE, AttributeMode.INITIAL);
		tmp.put(MODEOFPAYMENT, AttributeMode.INITIAL);
		tmp.put(LASTDIGIT, AttributeMode.INITIAL);
		tmp.put(STARTINGDIGIT, AttributeMode.INITIAL);
		tmp.put(TOTALDIGITS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.bankName</code> attribute.
	 * @return the bankName
	 */
	public Bank getBankName(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANKNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.bankName</code> attribute.
	 * @return the bankName
	 */
	public Bank getBankName()
	{
		return getBankName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.bankName</code> attribute. 
	 * @param value the bankName
	 */
	public void setBankName(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANKNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.bankName</code> attribute. 
	 * @param value the bankName
	 */
	public void setBankName(final Bank value)
	{
		setBankName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.cardType</code> attribute.
	 * @return the cardType
	 */
	public EnumerationValue getCardType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CARDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.cardType</code> attribute.
	 * @return the cardType
	 */
	public EnumerationValue getCardType()
	{
		return getCardType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CARDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final EnumerationValue value)
	{
		setCardType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.lastDigit</code> attribute.
	 * @return the lastDigit
	 */
	public Integer getLastDigit(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LASTDIGIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.lastDigit</code> attribute.
	 * @return the lastDigit
	 */
	public Integer getLastDigit()
	{
		return getLastDigit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.lastDigit</code> attribute. 
	 * @return the lastDigit
	 */
	public int getLastDigitAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLastDigit( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.lastDigit</code> attribute. 
	 * @return the lastDigit
	 */
	public int getLastDigitAsPrimitive()
	{
		return getLastDigitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.lastDigit</code> attribute. 
	 * @param value the lastDigit
	 */
	public void setLastDigit(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LASTDIGIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.lastDigit</code> attribute. 
	 * @param value the lastDigit
	 */
	public void setLastDigit(final Integer value)
	{
		setLastDigit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.lastDigit</code> attribute. 
	 * @param value the lastDigit
	 */
	public void setLastDigit(final SessionContext ctx, final int value)
	{
		setLastDigit( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.lastDigit</code> attribute. 
	 * @param value the lastDigit
	 */
	public void setLastDigit(final int value)
	{
		setLastDigit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.modeOfPayment</code> attribute.
	 * @return the modeOfPayment
	 */
	public EnumerationValue getModeOfPayment(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.modeOfPayment</code> attribute.
	 * @return the modeOfPayment
	 */
	public EnumerationValue getModeOfPayment()
	{
		return getModeOfPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment
	 */
	public void setModeOfPayment(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment
	 */
	public void setModeOfPayment(final EnumerationValue value)
	{
		setModeOfPayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.paymentType</code> attribute.
	 * @return the paymentType
	 */
	public EnumerationValue getPaymentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.paymentType</code> attribute.
	 * @return the paymentType
	 */
	public EnumerationValue getPaymentType()
	{
		return getPaymentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.paymentType</code> attribute. 
	 * @param value the paymentType
	 */
	public void setPaymentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.paymentType</code> attribute. 
	 * @param value the paymentType
	 */
	public void setPaymentType(final EnumerationValue value)
	{
		setPaymentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.startingDigit</code> attribute.
	 * @return the startingDigit
	 */
	public Integer getStartingDigit(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, STARTINGDIGIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.startingDigit</code> attribute.
	 * @return the startingDigit
	 */
	public Integer getStartingDigit()
	{
		return getStartingDigit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.startingDigit</code> attribute. 
	 * @return the startingDigit
	 */
	public int getStartingDigitAsPrimitive(final SessionContext ctx)
	{
		Integer value = getStartingDigit( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.startingDigit</code> attribute. 
	 * @return the startingDigit
	 */
	public int getStartingDigitAsPrimitive()
	{
		return getStartingDigitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.startingDigit</code> attribute. 
	 * @param value the startingDigit
	 */
	public void setStartingDigit(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, STARTINGDIGIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.startingDigit</code> attribute. 
	 * @param value the startingDigit
	 */
	public void setStartingDigit(final Integer value)
	{
		setStartingDigit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.startingDigit</code> attribute. 
	 * @param value the startingDigit
	 */
	public void setStartingDigit(final SessionContext ctx, final int value)
	{
		setStartingDigit( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.startingDigit</code> attribute. 
	 * @param value the startingDigit
	 */
	public void setStartingDigit(final int value)
	{
		setStartingDigit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.totalDigits</code> attribute.
	 * @return the totalDigits
	 */
	public Integer getTotalDigits(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOTALDIGITS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.totalDigits</code> attribute.
	 * @return the totalDigits
	 */
	public Integer getTotalDigits()
	{
		return getTotalDigits( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.totalDigits</code> attribute. 
	 * @return the totalDigits
	 */
	public int getTotalDigitsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTotalDigits( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyBankDetails.totalDigits</code> attribute. 
	 * @return the totalDigits
	 */
	public int getTotalDigitsAsPrimitive()
	{
		return getTotalDigitsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.totalDigits</code> attribute. 
	 * @param value the totalDigits
	 */
	public void setTotalDigits(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOTALDIGITS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.totalDigits</code> attribute. 
	 * @param value the totalDigits
	 */
	public void setTotalDigits(final Integer value)
	{
		setTotalDigits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.totalDigits</code> attribute. 
	 * @param value the totalDigits
	 */
	public void setTotalDigits(final SessionContext ctx, final int value)
	{
		setTotalDigits( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyBankDetails.totalDigits</code> attribute. 
	 * @param value the totalDigits
	 */
	public void setTotalDigits(final int value)
	{
		setTotalDigits( getSession().getSessionContext(), value );
	}
	
}
