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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.DebitCardPaymentInfo DebitCardPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDebitCardPaymentInfo extends PaymentInfo
{
	/** Qualifier of the <code>DebitCardPaymentInfo.cardNumber</code> attribute **/
	public static final String CARDNUMBER = "cardNumber";
	/** Qualifier of the <code>DebitCardPaymentInfo.cardType</code> attribute **/
	public static final String CARDTYPE = "cardType";
	/** Qualifier of the <code>DebitCardPaymentInfo.nameOnCard</code> attribute **/
	public static final String NAMEONCARD = "nameOnCard";
	/** Qualifier of the <code>DebitCardPaymentInfo.validToMonth</code> attribute **/
	public static final String VALIDTOMONTH = "validToMonth";
	/** Qualifier of the <code>DebitCardPaymentInfo.validToYear</code> attribute **/
	public static final String VALIDTOYEAR = "validToYear";
	/** Qualifier of the <code>DebitCardPaymentInfo.cvv</code> attribute **/
	public static final String CVV = "cvv";
	/** Qualifier of the <code>DebitCardPaymentInfo.masterOrVBV</code> attribute **/
	public static final String MASTERORVBV = "masterOrVBV";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CARDNUMBER, AttributeMode.INITIAL);
		tmp.put(CARDTYPE, AttributeMode.INITIAL);
		tmp.put(NAMEONCARD, AttributeMode.INITIAL);
		tmp.put(VALIDTOMONTH, AttributeMode.INITIAL);
		tmp.put(VALIDTOYEAR, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.cardNumber</code> attribute.
	 * @return the cardNumber
	 */
	public String getCardNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.cardNumber</code> attribute.
	 * @return the cardNumber
	 */
	public String getCardNumber()
	{
		return getCardNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.cardNumber</code> attribute. 
	 * @param value the cardNumber
	 */
	public void setCardNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.cardNumber</code> attribute. 
	 * @param value the cardNumber
	 */
	public void setCardNumber(final String value)
	{
		setCardNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.cardType</code> attribute.
	 * @return the cardType
	 */
	public EnumerationValue getCardType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CARDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.cardType</code> attribute.
	 * @return the cardType
	 */
	public EnumerationValue getCardType()
	{
		return getCardType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CARDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final EnumerationValue value)
	{
		setCardType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.cvv</code> attribute.
	 * @return the cvv
	 */
	public String getCvv(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CVV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.cvv</code> attribute.
	 * @return the cvv
	 */
	public String getCvv()
	{
		return getCvv( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.cvv</code> attribute. 
	 * @param value the cvv
	 */
	public void setCvv(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CVV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.cvv</code> attribute. 
	 * @param value the cvv
	 */
	public void setCvv(final String value)
	{
		setCvv( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.masterOrVBV</code> attribute.
	 * @return the masterOrVBV
	 */
	public String getMasterOrVBV(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MASTERORVBV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.masterOrVBV</code> attribute.
	 * @return the masterOrVBV
	 */
	public String getMasterOrVBV()
	{
		return getMasterOrVBV( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.masterOrVBV</code> attribute. 
	 * @param value the masterOrVBV
	 */
	public void setMasterOrVBV(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MASTERORVBV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.masterOrVBV</code> attribute. 
	 * @param value the masterOrVBV
	 */
	public void setMasterOrVBV(final String value)
	{
		setMasterOrVBV( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.nameOnCard</code> attribute.
	 * @return the nameOnCard
	 */
	public String getNameOnCard(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAMEONCARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.nameOnCard</code> attribute.
	 * @return the nameOnCard
	 */
	public String getNameOnCard()
	{
		return getNameOnCard( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.nameOnCard</code> attribute. 
	 * @param value the nameOnCard
	 */
	public void setNameOnCard(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAMEONCARD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.nameOnCard</code> attribute. 
	 * @param value the nameOnCard
	 */
	public void setNameOnCard(final String value)
	{
		setNameOnCard( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.validToMonth</code> attribute.
	 * @return the validToMonth
	 */
	public String getValidToMonth(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALIDTOMONTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.validToMonth</code> attribute.
	 * @return the validToMonth
	 */
	public String getValidToMonth()
	{
		return getValidToMonth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.validToMonth</code> attribute. 
	 * @param value the validToMonth
	 */
	public void setValidToMonth(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALIDTOMONTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.validToMonth</code> attribute. 
	 * @param value the validToMonth
	 */
	public void setValidToMonth(final String value)
	{
		setValidToMonth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.validToYear</code> attribute.
	 * @return the validToYear
	 */
	public String getValidToYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALIDTOYEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DebitCardPaymentInfo.validToYear</code> attribute.
	 * @return the validToYear
	 */
	public String getValidToYear()
	{
		return getValidToYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.validToYear</code> attribute. 
	 * @param value the validToYear
	 */
	public void setValidToYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALIDTOYEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DebitCardPaymentInfo.validToYear</code> attribute. 
	 * @param value the validToYear
	 */
	public void setValidToYear(final String value)
	{
		setValidToYear( getSession().getSessionContext(), value );
	}
	
}
