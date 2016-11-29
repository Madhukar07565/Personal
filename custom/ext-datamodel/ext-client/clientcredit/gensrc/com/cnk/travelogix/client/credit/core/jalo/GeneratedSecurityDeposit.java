/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.core.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.core.jalo.ClientCreditDetails;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.core.jalo.SecurityDeposit SecurityDeposit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSecurityDeposit extends GenericItem
{
	/** Qualifier of the <code>SecurityDeposit.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>SecurityDeposit.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>SecurityDeposit.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>SecurityDeposit.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>SecurityDeposit.creditLimit</code> attribute **/
	public static final String CREDITLIMIT = "creditLimit";
	/** Qualifier of the <code>SecurityDeposit.clientCreditDetails</code> attribute **/
	public static final String CLIENTCREDITDETAILS = "clientCreditDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENTCREDITDETAILS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSecurityDeposit> CLIENTCREDITDETAILSHANDLER = new BidirectionalOneToManyHandler<GeneratedSecurityDeposit>(
	ClientcreditConstants.TC.SECURITYDEPOSIT,
	false,
	"clientCreditDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(CREDITLIMIT, AttributeMode.INITIAL);
		tmp.put(CLIENTCREDITDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.amount</code> attribute.
	 * @return the amount - Amount
	 */
	public BigDecimal getAmount(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.amount</code> attribute.
	 * @return the amount - Amount
	 */
	public BigDecimal getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final BigDecimal value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.clientCreditDetails</code> attribute.
	 * @return the clientCreditDetails
	 */
	public ClientCreditDetails getClientCreditDetails(final SessionContext ctx)
	{
		return (ClientCreditDetails)getProperty( ctx, CLIENTCREDITDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.clientCreditDetails</code> attribute.
	 * @return the clientCreditDetails
	 */
	public ClientCreditDetails getClientCreditDetails()
	{
		return getClientCreditDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.clientCreditDetails</code> attribute. 
	 * @param value the clientCreditDetails
	 */
	public void setClientCreditDetails(final SessionContext ctx, final ClientCreditDetails value)
	{
		CLIENTCREDITDETAILSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.clientCreditDetails</code> attribute. 
	 * @param value the clientCreditDetails
	 */
	public void setClientCreditDetails(final ClientCreditDetails value)
	{
		setClientCreditDetails( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTCREDITDETAILSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.creditLimit</code> attribute.
	 * @return the creditLimit - CreditLimit
	 */
	public BigDecimal getCreditLimit(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, CREDITLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.creditLimit</code> attribute.
	 * @return the creditLimit - CreditLimit
	 */
	public BigDecimal getCreditLimit()
	{
		return getCreditLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.creditLimit</code> attribute. 
	 * @param value the creditLimit - CreditLimit
	 */
	public void setCreditLimit(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, CREDITLIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.creditLimit</code> attribute. 
	 * @param value the creditLimit - CreditLimit
	 */
	public void setCreditLimit(final BigDecimal value)
	{
		setCreditLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.validFrom</code> attribute.
	 * @return the validFrom - ValidFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.validFrom</code> attribute.
	 * @return the validFrom - ValidFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.validFrom</code> attribute. 
	 * @param value the validFrom - ValidFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.validFrom</code> attribute. 
	 * @param value the validFrom - ValidFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.validTo</code> attribute.
	 * @return the validTo - ValidTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecurityDeposit.validTo</code> attribute.
	 * @return the validTo - ValidTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.validTo</code> attribute. 
	 * @param value the validTo - ValidTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecurityDeposit.validTo</code> attribute. 
	 * @param value the validTo - ValidTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
