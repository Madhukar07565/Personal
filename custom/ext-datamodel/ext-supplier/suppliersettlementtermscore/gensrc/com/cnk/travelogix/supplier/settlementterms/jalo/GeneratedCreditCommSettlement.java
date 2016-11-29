/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.jalo;

import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import com.cnk.travelogix.supplier.settlementterms.jalo.CountryCreditLimit;
import com.cnk.travelogix.supplier.settlementterms.jalo.StdCommCommisionableSettlement;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.payment.PaymentMode;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.CreditCommSettlement CreditCommSettlement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCreditCommSettlement extends GenericItem
{
	/** Qualifier of the <code>CreditCommSettlement.typeOfCredit</code> attribute **/
	public static final String TYPEOFCREDIT = "typeOfCredit";
	/** Qualifier of the <code>CreditCommSettlement.modeOfSecurity</code> attribute **/
	public static final String MODEOFSECURITY = "modeOfSecurity";
	/** Qualifier of the <code>CreditCommSettlement.validityFrom</code> attribute **/
	public static final String VALIDITYFROM = "validityFrom";
	/** Qualifier of the <code>CreditCommSettlement.validityTo</code> attribute **/
	public static final String VALIDITYTO = "validityTo";
	/** Qualifier of the <code>CreditCommSettlement.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>CreditCommSettlement.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>CreditCommSettlement.preferredPaymentOption</code> attribute **/
	public static final String PREFERREDPAYMENTOPTION = "preferredPaymentOption";
	/** Qualifier of the <code>CreditCommSettlement.credentialNameList</code> attribute **/
	public static final String CREDENTIALNAMELIST = "credentialNameList";
	/** Qualifier of the <code>CreditCommSettlement.stdCommCommisionableSettlement</code> attribute **/
	public static final String STDCOMMCOMMISIONABLESETTLEMENT = "stdCommCommisionableSettlement";
	/** Qualifier of the <code>CreditCommSettlement.countryCreditLimitList</code> attribute **/
	public static final String COUNTRYCREDITLIMITLIST = "countryCreditLimitList";
	/**
	* {@link OneToManyHandler} for handling 1:n CREDENTIALNAMELIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierCredentials> CREDENTIALNAMELISTHANDLER = new OneToManyHandler<SupplierCredentials>(
	SuppliercredentialscoreConstants.TC.SUPPLIERCREDENTIALS,
	false,
	"creditCommSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STDCOMMCOMMISIONABLESETTLEMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCreditCommSettlement> STDCOMMCOMMISIONABLESETTLEMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedCreditCommSettlement>(
	SuppliersettlementtermscoreConstants.TC.CREDITCOMMSETTLEMENT,
	false,
	"stdCommCommisionableSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COUNTRYCREDITLIMITLIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CountryCreditLimit> COUNTRYCREDITLIMITLISTHANDLER = new OneToManyHandler<CountryCreditLimit>(
	SuppliersettlementtermscoreConstants.TC.COUNTRYCREDITLIMIT,
	false,
	"creditCommSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TYPEOFCREDIT, AttributeMode.INITIAL);
		tmp.put(MODEOFSECURITY, AttributeMode.INITIAL);
		tmp.put(VALIDITYFROM, AttributeMode.INITIAL);
		tmp.put(VALIDITYTO, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(PREFERREDPAYMENTOPTION, AttributeMode.INITIAL);
		tmp.put(STDCOMMCOMMISIONABLESETTLEMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.countryCreditLimitList</code> attribute.
	 * @return the countryCreditLimitList
	 */
	public Collection<CountryCreditLimit> getCountryCreditLimitList(final SessionContext ctx)
	{
		return COUNTRYCREDITLIMITLISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.countryCreditLimitList</code> attribute.
	 * @return the countryCreditLimitList
	 */
	public Collection<CountryCreditLimit> getCountryCreditLimitList()
	{
		return getCountryCreditLimitList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.countryCreditLimitList</code> attribute. 
	 * @param value the countryCreditLimitList
	 */
	public void setCountryCreditLimitList(final SessionContext ctx, final Collection<CountryCreditLimit> value)
	{
		COUNTRYCREDITLIMITLISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.countryCreditLimitList</code> attribute. 
	 * @param value the countryCreditLimitList
	 */
	public void setCountryCreditLimitList(final Collection<CountryCreditLimit> value)
	{
		setCountryCreditLimitList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to countryCreditLimitList. 
	 * @param value the item to add to countryCreditLimitList
	 */
	public void addToCountryCreditLimitList(final SessionContext ctx, final CountryCreditLimit value)
	{
		COUNTRYCREDITLIMITLISTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to countryCreditLimitList. 
	 * @param value the item to add to countryCreditLimitList
	 */
	public void addToCountryCreditLimitList(final CountryCreditLimit value)
	{
		addToCountryCreditLimitList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from countryCreditLimitList. 
	 * @param value the item to remove from countryCreditLimitList
	 */
	public void removeFromCountryCreditLimitList(final SessionContext ctx, final CountryCreditLimit value)
	{
		COUNTRYCREDITLIMITLISTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from countryCreditLimitList. 
	 * @param value the item to remove from countryCreditLimitList
	 */
	public void removeFromCountryCreditLimitList(final CountryCreditLimit value)
	{
		removeFromCountryCreditLimitList( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STDCOMMCOMMISIONABLESETTLEMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.credentialNameList</code> attribute.
	 * @return the credentialNameList
	 */
	public Collection<SupplierCredentials> getCredentialNameList(final SessionContext ctx)
	{
		return CREDENTIALNAMELISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.credentialNameList</code> attribute.
	 * @return the credentialNameList
	 */
	public Collection<SupplierCredentials> getCredentialNameList()
	{
		return getCredentialNameList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.credentialNameList</code> attribute. 
	 * @param value the credentialNameList
	 */
	public void setCredentialNameList(final SessionContext ctx, final Collection<SupplierCredentials> value)
	{
		CREDENTIALNAMELISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.credentialNameList</code> attribute. 
	 * @param value the credentialNameList
	 */
	public void setCredentialNameList(final Collection<SupplierCredentials> value)
	{
		setCredentialNameList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to credentialNameList. 
	 * @param value the item to add to credentialNameList
	 */
	public void addToCredentialNameList(final SessionContext ctx, final SupplierCredentials value)
	{
		CREDENTIALNAMELISTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to credentialNameList. 
	 * @param value the item to add to credentialNameList
	 */
	public void addToCredentialNameList(final SupplierCredentials value)
	{
		addToCredentialNameList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from credentialNameList. 
	 * @param value the item to remove from credentialNameList
	 */
	public void removeFromCredentialNameList(final SessionContext ctx, final SupplierCredentials value)
	{
		CREDENTIALNAMELISTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from credentialNameList. 
	 * @param value the item to remove from credentialNameList
	 */
	public void removeFromCredentialNameList(final SupplierCredentials value)
	{
		removeFromCredentialNameList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFSECURITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity()
	{
		return getModeOfSecurity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity
	 */
	public void setModeOfSecurity(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFSECURITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity
	 */
	public void setModeOfSecurity(final EnumerationValue value)
	{
		setModeOfSecurity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.preferredPaymentOption</code> attribute.
	 * @return the preferredPaymentOption
	 */
	public PaymentMode getPreferredPaymentOption(final SessionContext ctx)
	{
		return (PaymentMode)getProperty( ctx, PREFERREDPAYMENTOPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.preferredPaymentOption</code> attribute.
	 * @return the preferredPaymentOption
	 */
	public PaymentMode getPreferredPaymentOption()
	{
		return getPreferredPaymentOption( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.preferredPaymentOption</code> attribute. 
	 * @param value the preferredPaymentOption
	 */
	public void setPreferredPaymentOption(final SessionContext ctx, final PaymentMode value)
	{
		setProperty(ctx, PREFERREDPAYMENTOPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.preferredPaymentOption</code> attribute. 
	 * @param value the preferredPaymentOption
	 */
	public void setPreferredPaymentOption(final PaymentMode value)
	{
		setPreferredPaymentOption( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.stdCommCommisionableSettlement</code> attribute.
	 * @return the stdCommCommisionableSettlement
	 */
	public StdCommCommisionableSettlement getStdCommCommisionableSettlement(final SessionContext ctx)
	{
		return (StdCommCommisionableSettlement)getProperty( ctx, STDCOMMCOMMISIONABLESETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.stdCommCommisionableSettlement</code> attribute.
	 * @return the stdCommCommisionableSettlement
	 */
	public StdCommCommisionableSettlement getStdCommCommisionableSettlement()
	{
		return getStdCommCommisionableSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.stdCommCommisionableSettlement</code> attribute. 
	 * @param value the stdCommCommisionableSettlement
	 */
	public void setStdCommCommisionableSettlement(final SessionContext ctx, final StdCommCommisionableSettlement value)
	{
		STDCOMMCOMMISIONABLESETTLEMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.stdCommCommisionableSettlement</code> attribute. 
	 * @param value the stdCommCommisionableSettlement
	 */
	public void setStdCommCommisionableSettlement(final StdCommCommisionableSettlement value)
	{
		setStdCommCommisionableSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.typeOfCredit</code> attribute.
	 * @return the typeOfCredit
	 */
	public EnumerationValue getTypeOfCredit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFCREDIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.typeOfCredit</code> attribute.
	 * @return the typeOfCredit
	 */
	public EnumerationValue getTypeOfCredit()
	{
		return getTypeOfCredit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.typeOfCredit</code> attribute. 
	 * @param value the typeOfCredit
	 */
	public void setTypeOfCredit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFCREDIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.typeOfCredit</code> attribute. 
	 * @param value the typeOfCredit
	 */
	public void setTypeOfCredit(final EnumerationValue value)
	{
		setTypeOfCredit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.validityFrom</code> attribute.
	 * @return the validityFrom
	 */
	public Date getValidityFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDITYFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.validityFrom</code> attribute.
	 * @return the validityFrom
	 */
	public Date getValidityFrom()
	{
		return getValidityFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.validityFrom</code> attribute. 
	 * @param value the validityFrom
	 */
	public void setValidityFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDITYFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.validityFrom</code> attribute. 
	 * @param value the validityFrom
	 */
	public void setValidityFrom(final Date value)
	{
		setValidityFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.validityTo</code> attribute.
	 * @return the validityTo
	 */
	public Date getValidityTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDITYTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCommSettlement.validityTo</code> attribute.
	 * @return the validityTo
	 */
	public Date getValidityTo()
	{
		return getValidityTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.validityTo</code> attribute. 
	 * @param value the validityTo
	 */
	public void setValidityTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDITYTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCommSettlement.validityTo</code> attribute. 
	 * @param value the validityTo
	 */
	public void setValidityTo(final Date value)
	{
		setValidityTo( getSession().getSessionContext(), value );
	}
	
}
