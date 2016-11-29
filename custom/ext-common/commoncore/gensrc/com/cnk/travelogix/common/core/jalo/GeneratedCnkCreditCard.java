/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CnkCreditCard}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCnkCreditCard extends GenericItem
{
	/** Qualifier of the <code>CnkCreditCard.creditCardNumber</code> attribute **/
	public static final String CREDITCARDNUMBER = "creditCardNumber";
	/** Qualifier of the <code>CnkCreditCard.cardholderName</code> attribute **/
	public static final String CARDHOLDERNAME = "cardholderName";
	/** Qualifier of the <code>CnkCreditCard.ccExpiryDate</code> attribute **/
	public static final String CCEXPIRYDATE = "ccExpiryDate";
	/** Qualifier of the <code>CnkCreditCard.cardType</code> attribute **/
	public static final String CARDTYPE = "cardType";
	/** Qualifier of the <code>CnkCreditCard.cvv</code> attribute **/
	public static final String CVV = "cvv";
	/** Qualifier of the <code>CnkCreditCard.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CUSTOMER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCnkCreditCard> CUSTOMERHANDLER = new BidirectionalOneToManyHandler<GeneratedCnkCreditCard>(
	CommonCoreConstants.TC.CNKCREDITCARD,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CREDITCARDNUMBER, AttributeMode.INITIAL);
		tmp.put(CARDHOLDERNAME, AttributeMode.INITIAL);
		tmp.put(CCEXPIRYDATE, AttributeMode.INITIAL);
		tmp.put(CARDTYPE, AttributeMode.INITIAL);
		tmp.put(CVV, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.cardholderName</code> attribute.
	 * @return the cardholderName - CardHolderName
	 */
	public String getCardholderName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDHOLDERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.cardholderName</code> attribute.
	 * @return the cardholderName - CardHolderName
	 */
	public String getCardholderName()
	{
		return getCardholderName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.cardholderName</code> attribute. 
	 * @param value the cardholderName - CardHolderName
	 */
	public void setCardholderName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDHOLDERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.cardholderName</code> attribute. 
	 * @param value the cardholderName - CardHolderName
	 */
	public void setCardholderName(final String value)
	{
		setCardholderName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.cardType</code> attribute.
	 * @return the cardType
	 */
	public EnumerationValue getCardType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CARDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.cardType</code> attribute.
	 * @return the cardType
	 */
	public EnumerationValue getCardType()
	{
		return getCardType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CARDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final EnumerationValue value)
	{
		setCardType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.ccExpiryDate</code> attribute.
	 * @return the ccExpiryDate - CCExpiryDate
	 */
	public Date getCcExpiryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CCEXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.ccExpiryDate</code> attribute.
	 * @return the ccExpiryDate - CCExpiryDate
	 */
	public Date getCcExpiryDate()
	{
		return getCcExpiryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.ccExpiryDate</code> attribute. 
	 * @param value the ccExpiryDate - CCExpiryDate
	 */
	public void setCcExpiryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CCEXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.ccExpiryDate</code> attribute. 
	 * @param value the ccExpiryDate - CCExpiryDate
	 */
	public void setCcExpiryDate(final Date value)
	{
		setCcExpiryDate( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CUSTOMERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.creditCardNumber</code> attribute.
	 * @return the creditCardNumber - CreditCardNumber
	 */
	public String getCreditCardNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITCARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.creditCardNumber</code> attribute.
	 * @return the creditCardNumber - CreditCardNumber
	 */
	public String getCreditCardNumber()
	{
		return getCreditCardNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.creditCardNumber</code> attribute. 
	 * @param value the creditCardNumber - CreditCardNumber
	 */
	public void setCreditCardNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITCARDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.creditCardNumber</code> attribute. 
	 * @param value the creditCardNumber - CreditCardNumber
	 */
	public void setCreditCardNumber(final String value)
	{
		setCreditCardNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Customer value)
	{
		CUSTOMERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Customer value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.cvv</code> attribute.
	 * @return the cvv
	 */
	public String getCvv(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CVV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CnkCreditCard.cvv</code> attribute.
	 * @return the cvv
	 */
	public String getCvv()
	{
		return getCvv( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.cvv</code> attribute. 
	 * @param value the cvv
	 */
	public void setCvv(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CVV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CnkCreditCard.cvv</code> attribute. 
	 * @param value the cvv
	 */
	public void setCvv(final String value)
	{
		setCvv( getSession().getSessionContext(), value );
	}
	
}
