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
import com.cnk.travelogix.supplier.settlementterms.jalo.PayableAmountDetail;
import com.cnk.travelogix.supplier.settlementterms.jalo.StdCommNonComissionableSettlement;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.NoCreditPrePaymentCommSettlement NoCreditPrePaymentCommSettlement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNoCreditPrePaymentCommSettlement extends GenericItem
{
	/** Qualifier of the <code>NoCreditPrePaymentCommSettlement.typeOfPrePayment</code> attribute **/
	public static final String TYPEOFPREPAYMENT = "typeOfPrePayment";
	/** Qualifier of the <code>NoCreditPrePaymentCommSettlement.prePaymentByCountry</code> attribute **/
	public static final String PREPAYMENTBYCOUNTRY = "prePaymentByCountry";
	/** Qualifier of the <code>NoCreditPrePaymentCommSettlement.modeOfSecurity</code> attribute **/
	public static final String MODEOFSECURITY = "modeOfSecurity";
	/** Qualifier of the <code>NoCreditPrePaymentCommSettlement.typeOfCredit</code> attribute **/
	public static final String TYPEOFCREDIT = "typeOfCredit";
	/** Qualifier of the <code>NoCreditPrePaymentCommSettlement.countryList</code> attribute **/
	public static final String COUNTRYLIST = "countryList";
	/** Qualifier of the <code>NoCreditPrePaymentCommSettlement.credentialNameList</code> attribute **/
	public static final String CREDENTIALNAMELIST = "credentialNameList";
	/** Qualifier of the <code>NoCreditPrePaymentCommSettlement.stdCommNonComissionableSettlement</code> attribute **/
	public static final String STDCOMMNONCOMISSIONABLESETTLEMENT = "stdCommNonComissionableSettlement";
	/** Qualifier of the <code>NoCreditPrePaymentCommSettlement.payableAmountDetails</code> attribute **/
	public static final String PAYABLEAMOUNTDETAILS = "payableAmountDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n CREDENTIALNAMELIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierCredentials> CREDENTIALNAMELISTHANDLER = new OneToManyHandler<SupplierCredentials>(
	SuppliercredentialscoreConstants.TC.SUPPLIERCREDENTIALS,
	false,
	"noCreditPrePaymentCommSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STDCOMMNONCOMISSIONABLESETTLEMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedNoCreditPrePaymentCommSettlement> STDCOMMNONCOMISSIONABLESETTLEMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedNoCreditPrePaymentCommSettlement>(
	SuppliersettlementtermscoreConstants.TC.NOCREDITPREPAYMENTCOMMSETTLEMENT,
	false,
	"stdCommNonComissionableSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PAYABLEAMOUNTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PayableAmountDetail> PAYABLEAMOUNTDETAILSHANDLER = new OneToManyHandler<PayableAmountDetail>(
	SuppliersettlementtermscoreConstants.TC.PAYABLEAMOUNTDETAIL,
	false,
	"noCreditPrePaymentCommSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TYPEOFPREPAYMENT, AttributeMode.INITIAL);
		tmp.put(PREPAYMENTBYCOUNTRY, AttributeMode.INITIAL);
		tmp.put(MODEOFSECURITY, AttributeMode.INITIAL);
		tmp.put(TYPEOFCREDIT, AttributeMode.INITIAL);
		tmp.put(COUNTRYLIST, AttributeMode.INITIAL);
		tmp.put(STDCOMMNONCOMISSIONABLESETTLEMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.countryList</code> attribute.
	 * @return the countryList
	 */
	public Collection<Country> getCountryList(final SessionContext ctx)
	{
		Collection<Country> coll = (Collection<Country>)getProperty( ctx, COUNTRYLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.countryList</code> attribute.
	 * @return the countryList
	 */
	public Collection<Country> getCountryList()
	{
		return getCountryList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.countryList</code> attribute. 
	 * @param value the countryList
	 */
	public void setCountryList(final SessionContext ctx, final Collection<Country> value)
	{
		setProperty(ctx, COUNTRYLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.countryList</code> attribute. 
	 * @param value the countryList
	 */
	public void setCountryList(final Collection<Country> value)
	{
		setCountryList( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STDCOMMNONCOMISSIONABLESETTLEMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.credentialNameList</code> attribute.
	 * @return the credentialNameList
	 */
	public Collection<SupplierCredentials> getCredentialNameList(final SessionContext ctx)
	{
		return CREDENTIALNAMELISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.credentialNameList</code> attribute.
	 * @return the credentialNameList
	 */
	public Collection<SupplierCredentials> getCredentialNameList()
	{
		return getCredentialNameList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.credentialNameList</code> attribute. 
	 * @param value the credentialNameList
	 */
	public void setCredentialNameList(final SessionContext ctx, final Collection<SupplierCredentials> value)
	{
		CREDENTIALNAMELISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.credentialNameList</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFSECURITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity()
	{
		return getModeOfSecurity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity
	 */
	public void setModeOfSecurity(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFSECURITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity
	 */
	public void setModeOfSecurity(final EnumerationValue value)
	{
		setModeOfSecurity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.payableAmountDetails</code> attribute.
	 * @return the payableAmountDetails
	 */
	public Collection<PayableAmountDetail> getPayableAmountDetails(final SessionContext ctx)
	{
		return PAYABLEAMOUNTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.payableAmountDetails</code> attribute.
	 * @return the payableAmountDetails
	 */
	public Collection<PayableAmountDetail> getPayableAmountDetails()
	{
		return getPayableAmountDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.payableAmountDetails</code> attribute. 
	 * @param value the payableAmountDetails
	 */
	public void setPayableAmountDetails(final SessionContext ctx, final Collection<PayableAmountDetail> value)
	{
		PAYABLEAMOUNTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.payableAmountDetails</code> attribute. 
	 * @param value the payableAmountDetails
	 */
	public void setPayableAmountDetails(final Collection<PayableAmountDetail> value)
	{
		setPayableAmountDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to payableAmountDetails. 
	 * @param value the item to add to payableAmountDetails
	 */
	public void addToPayableAmountDetails(final SessionContext ctx, final PayableAmountDetail value)
	{
		PAYABLEAMOUNTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to payableAmountDetails. 
	 * @param value the item to add to payableAmountDetails
	 */
	public void addToPayableAmountDetails(final PayableAmountDetail value)
	{
		addToPayableAmountDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from payableAmountDetails. 
	 * @param value the item to remove from payableAmountDetails
	 */
	public void removeFromPayableAmountDetails(final SessionContext ctx, final PayableAmountDetail value)
	{
		PAYABLEAMOUNTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from payableAmountDetails. 
	 * @param value the item to remove from payableAmountDetails
	 */
	public void removeFromPayableAmountDetails(final PayableAmountDetail value)
	{
		removeFromPayableAmountDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.prePaymentByCountry</code> attribute.
	 * @return the prePaymentByCountry
	 */
	public Boolean isPrePaymentByCountry(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PREPAYMENTBYCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.prePaymentByCountry</code> attribute.
	 * @return the prePaymentByCountry
	 */
	public Boolean isPrePaymentByCountry()
	{
		return isPrePaymentByCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.prePaymentByCountry</code> attribute. 
	 * @return the prePaymentByCountry
	 */
	public boolean isPrePaymentByCountryAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPrePaymentByCountry( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.prePaymentByCountry</code> attribute. 
	 * @return the prePaymentByCountry
	 */
	public boolean isPrePaymentByCountryAsPrimitive()
	{
		return isPrePaymentByCountryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.prePaymentByCountry</code> attribute. 
	 * @param value the prePaymentByCountry
	 */
	public void setPrePaymentByCountry(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PREPAYMENTBYCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.prePaymentByCountry</code> attribute. 
	 * @param value the prePaymentByCountry
	 */
	public void setPrePaymentByCountry(final Boolean value)
	{
		setPrePaymentByCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.prePaymentByCountry</code> attribute. 
	 * @param value the prePaymentByCountry
	 */
	public void setPrePaymentByCountry(final SessionContext ctx, final boolean value)
	{
		setPrePaymentByCountry( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.prePaymentByCountry</code> attribute. 
	 * @param value the prePaymentByCountry
	 */
	public void setPrePaymentByCountry(final boolean value)
	{
		setPrePaymentByCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.stdCommNonComissionableSettlement</code> attribute.
	 * @return the stdCommNonComissionableSettlement
	 */
	public StdCommNonComissionableSettlement getStdCommNonComissionableSettlement(final SessionContext ctx)
	{
		return (StdCommNonComissionableSettlement)getProperty( ctx, STDCOMMNONCOMISSIONABLESETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.stdCommNonComissionableSettlement</code> attribute.
	 * @return the stdCommNonComissionableSettlement
	 */
	public StdCommNonComissionableSettlement getStdCommNonComissionableSettlement()
	{
		return getStdCommNonComissionableSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.stdCommNonComissionableSettlement</code> attribute. 
	 * @param value the stdCommNonComissionableSettlement
	 */
	public void setStdCommNonComissionableSettlement(final SessionContext ctx, final StdCommNonComissionableSettlement value)
	{
		STDCOMMNONCOMISSIONABLESETTLEMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.stdCommNonComissionableSettlement</code> attribute. 
	 * @param value the stdCommNonComissionableSettlement
	 */
	public void setStdCommNonComissionableSettlement(final StdCommNonComissionableSettlement value)
	{
		setStdCommNonComissionableSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.typeOfCredit</code> attribute.
	 * @return the typeOfCredit - Credit Type
	 */
	public EnumerationValue getTypeOfCredit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFCREDIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.typeOfCredit</code> attribute.
	 * @return the typeOfCredit - Credit Type
	 */
	public EnumerationValue getTypeOfCredit()
	{
		return getTypeOfCredit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.typeOfCredit</code> attribute. 
	 * @param value the typeOfCredit - Credit Type
	 */
	public void setTypeOfCredit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFCREDIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.typeOfCredit</code> attribute. 
	 * @param value the typeOfCredit - Credit Type
	 */
	public void setTypeOfCredit(final EnumerationValue value)
	{
		setTypeOfCredit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.typeOfPrePayment</code> attribute.
	 * @return the typeOfPrePayment
	 */
	public EnumerationValue getTypeOfPrePayment(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFPREPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditPrePaymentCommSettlement.typeOfPrePayment</code> attribute.
	 * @return the typeOfPrePayment
	 */
	public EnumerationValue getTypeOfPrePayment()
	{
		return getTypeOfPrePayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.typeOfPrePayment</code> attribute. 
	 * @param value the typeOfPrePayment
	 */
	public void setTypeOfPrePayment(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFPREPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditPrePaymentCommSettlement.typeOfPrePayment</code> attribute. 
	 * @param value the typeOfPrePayment
	 */
	public void setTypeOfPrePayment(final EnumerationValue value)
	{
		setTypeOfPrePayment( getSession().getSessionContext(), value );
	}
	
}
