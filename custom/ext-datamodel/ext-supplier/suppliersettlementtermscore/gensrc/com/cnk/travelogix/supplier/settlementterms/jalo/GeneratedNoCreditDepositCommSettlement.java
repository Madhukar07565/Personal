/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.jalo;

import com.cnk.travelogix.masterdata.core.proucts.jalo.RateCode;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import com.cnk.travelogix.supplier.settlementterms.jalo.StdCommCommisionableSettlement;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.NoCreditDepositCommSettlement NoCreditDepositCommSettlement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNoCreditDepositCommSettlement extends GenericItem
{
	/** Qualifier of the <code>NoCreditDepositCommSettlement.thresholdType</code> attribute **/
	public static final String THRESHOLDTYPE = "thresholdType";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.thresholdAmount</code> attribute **/
	public static final String THRESHOLDAMOUNT = "thresholdAmount";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.raiseIndentBy</code> attribute **/
	public static final String RAISEINDENTBY = "raiseIndentBy";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.modeOfSecurity</code> attribute **/
	public static final String MODEOFSECURITY = "modeOfSecurity";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.supplierRateType</code> attribute **/
	public static final String SUPPLIERRATETYPE = "supplierRateType";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.supplierRateCode</code> attribute **/
	public static final String SUPPLIERRATECODE = "supplierRateCode";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.typeOfCredit</code> attribute **/
	public static final String TYPEOFCREDIT = "typeOfCredit";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.createdIndent</code> attribute **/
	public static final String CREATEDINDENT = "createdIndent";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.credentialNameList</code> attribute **/
	public static final String CREDENTIALNAMELIST = "credentialNameList";
	/** Qualifier of the <code>NoCreditDepositCommSettlement.stdCommCommisionableSettlement</code> attribute **/
	public static final String STDCOMMCOMMISIONABLESETTLEMENT = "stdCommCommisionableSettlement";
	/**
	* {@link OneToManyHandler} for handling 1:n CREDENTIALNAMELIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierCredentials> CREDENTIALNAMELISTHANDLER = new OneToManyHandler<SupplierCredentials>(
	SuppliercredentialscoreConstants.TC.SUPPLIERCREDENTIALS,
	false,
	"noCreditDepositcommisionableDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STDCOMMCOMMISIONABLESETTLEMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedNoCreditDepositCommSettlement> STDCOMMCOMMISIONABLESETTLEMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedNoCreditDepositCommSettlement>(
	SuppliersettlementtermscoreConstants.TC.NOCREDITDEPOSITCOMMSETTLEMENT,
	false,
	"stdCommCommisionableSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(THRESHOLDTYPE, AttributeMode.INITIAL);
		tmp.put(THRESHOLDAMOUNT, AttributeMode.INITIAL);
		tmp.put(RAISEINDENTBY, AttributeMode.INITIAL);
		tmp.put(MODEOFSECURITY, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATETYPE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATECODE, AttributeMode.INITIAL);
		tmp.put(TYPEOFCREDIT, AttributeMode.INITIAL);
		tmp.put(CREATEDINDENT, AttributeMode.INITIAL);
		tmp.put(STDCOMMCOMMISIONABLESETTLEMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.createdIndent</code> attribute.
	 * @return the createdIndent
	 */
	public Boolean isCreatedIndent(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CREATEDINDENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.createdIndent</code> attribute.
	 * @return the createdIndent
	 */
	public Boolean isCreatedIndent()
	{
		return isCreatedIndent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.createdIndent</code> attribute. 
	 * @return the createdIndent
	 */
	public boolean isCreatedIndentAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCreatedIndent( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.createdIndent</code> attribute. 
	 * @return the createdIndent
	 */
	public boolean isCreatedIndentAsPrimitive()
	{
		return isCreatedIndentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.createdIndent</code> attribute. 
	 * @param value the createdIndent
	 */
	public void setCreatedIndent(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CREATEDINDENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.createdIndent</code> attribute. 
	 * @param value the createdIndent
	 */
	public void setCreatedIndent(final Boolean value)
	{
		setCreatedIndent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.createdIndent</code> attribute. 
	 * @param value the createdIndent
	 */
	public void setCreatedIndent(final SessionContext ctx, final boolean value)
	{
		setCreatedIndent( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.createdIndent</code> attribute. 
	 * @param value the createdIndent
	 */
	public void setCreatedIndent(final boolean value)
	{
		setCreatedIndent( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STDCOMMCOMMISIONABLESETTLEMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.credentialNameList</code> attribute.
	 * @return the credentialNameList
	 */
	public Collection<SupplierCredentials> getCredentialNameList(final SessionContext ctx)
	{
		return CREDENTIALNAMELISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.credentialNameList</code> attribute.
	 * @return the credentialNameList
	 */
	public Collection<SupplierCredentials> getCredentialNameList()
	{
		return getCredentialNameList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.credentialNameList</code> attribute. 
	 * @param value the credentialNameList
	 */
	public void setCredentialNameList(final SessionContext ctx, final Collection<SupplierCredentials> value)
	{
		CREDENTIALNAMELISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.credentialNameList</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFSECURITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity()
	{
		return getModeOfSecurity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity
	 */
	public void setModeOfSecurity(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFSECURITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity
	 */
	public void setModeOfSecurity(final EnumerationValue value)
	{
		setModeOfSecurity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.raiseIndentBy</code> attribute.
	 * @return the raiseIndentBy
	 */
	public EnumerationValue getRaiseIndentBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RAISEINDENTBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.raiseIndentBy</code> attribute.
	 * @return the raiseIndentBy
	 */
	public EnumerationValue getRaiseIndentBy()
	{
		return getRaiseIndentBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.raiseIndentBy</code> attribute. 
	 * @param value the raiseIndentBy
	 */
	public void setRaiseIndentBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RAISEINDENTBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.raiseIndentBy</code> attribute. 
	 * @param value the raiseIndentBy
	 */
	public void setRaiseIndentBy(final EnumerationValue value)
	{
		setRaiseIndentBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.stdCommCommisionableSettlement</code> attribute.
	 * @return the stdCommCommisionableSettlement
	 */
	public StdCommCommisionableSettlement getStdCommCommisionableSettlement(final SessionContext ctx)
	{
		return (StdCommCommisionableSettlement)getProperty( ctx, STDCOMMCOMMISIONABLESETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.stdCommCommisionableSettlement</code> attribute.
	 * @return the stdCommCommisionableSettlement
	 */
	public StdCommCommisionableSettlement getStdCommCommisionableSettlement()
	{
		return getStdCommCommisionableSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.stdCommCommisionableSettlement</code> attribute. 
	 * @param value the stdCommCommisionableSettlement
	 */
	public void setStdCommCommisionableSettlement(final SessionContext ctx, final StdCommCommisionableSettlement value)
	{
		STDCOMMCOMMISIONABLESETTLEMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.stdCommCommisionableSettlement</code> attribute. 
	 * @param value the stdCommCommisionableSettlement
	 */
	public void setStdCommCommisionableSettlement(final StdCommCommisionableSettlement value)
	{
		setStdCommCommisionableSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.supplierRateCode</code> attribute.
	 * @return the supplierRateCode
	 */
	public RateCode getSupplierRateCode(final SessionContext ctx)
	{
		return (RateCode)getProperty( ctx, SUPPLIERRATECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.supplierRateCode</code> attribute.
	 * @return the supplierRateCode
	 */
	public RateCode getSupplierRateCode()
	{
		return getSupplierRateCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.supplierRateCode</code> attribute. 
	 * @param value the supplierRateCode
	 */
	public void setSupplierRateCode(final SessionContext ctx, final RateCode value)
	{
		setProperty(ctx, SUPPLIERRATECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.supplierRateCode</code> attribute. 
	 * @param value the supplierRateCode
	 */
	public void setSupplierRateCode(final RateCode value)
	{
		setSupplierRateCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.supplierRateType</code> attribute.
	 * @return the supplierRateType
	 */
	public RateType getSupplierRateType(final SessionContext ctx)
	{
		return (RateType)getProperty( ctx, SUPPLIERRATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.supplierRateType</code> attribute.
	 * @return the supplierRateType
	 */
	public RateType getSupplierRateType()
	{
		return getSupplierRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.supplierRateType</code> attribute. 
	 * @param value the supplierRateType
	 */
	public void setSupplierRateType(final SessionContext ctx, final RateType value)
	{
		setProperty(ctx, SUPPLIERRATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.supplierRateType</code> attribute. 
	 * @param value the supplierRateType
	 */
	public void setSupplierRateType(final RateType value)
	{
		setSupplierRateType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.thresholdAmount</code> attribute.
	 * @return the thresholdAmount
	 */
	public Double getThresholdAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, THRESHOLDAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.thresholdAmount</code> attribute.
	 * @return the thresholdAmount
	 */
	public Double getThresholdAmount()
	{
		return getThresholdAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.thresholdAmount</code> attribute. 
	 * @return the thresholdAmount
	 */
	public double getThresholdAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getThresholdAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.thresholdAmount</code> attribute. 
	 * @return the thresholdAmount
	 */
	public double getThresholdAmountAsPrimitive()
	{
		return getThresholdAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.thresholdAmount</code> attribute. 
	 * @param value the thresholdAmount
	 */
	public void setThresholdAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, THRESHOLDAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.thresholdAmount</code> attribute. 
	 * @param value the thresholdAmount
	 */
	public void setThresholdAmount(final Double value)
	{
		setThresholdAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.thresholdAmount</code> attribute. 
	 * @param value the thresholdAmount
	 */
	public void setThresholdAmount(final SessionContext ctx, final double value)
	{
		setThresholdAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.thresholdAmount</code> attribute. 
	 * @param value the thresholdAmount
	 */
	public void setThresholdAmount(final double value)
	{
		setThresholdAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.thresholdType</code> attribute.
	 * @return the thresholdType
	 */
	public EnumerationValue getThresholdType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.thresholdType</code> attribute.
	 * @return the thresholdType
	 */
	public EnumerationValue getThresholdType()
	{
		return getThresholdType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.thresholdType</code> attribute. 
	 * @param value the thresholdType
	 */
	public void setThresholdType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.thresholdType</code> attribute. 
	 * @param value the thresholdType
	 */
	public void setThresholdType(final EnumerationValue value)
	{
		setThresholdType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.typeOfCredit</code> attribute.
	 * @return the typeOfCredit - Credit Type
	 */
	public EnumerationValue getTypeOfCredit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFCREDIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NoCreditDepositCommSettlement.typeOfCredit</code> attribute.
	 * @return the typeOfCredit - Credit Type
	 */
	public EnumerationValue getTypeOfCredit()
	{
		return getTypeOfCredit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.typeOfCredit</code> attribute. 
	 * @param value the typeOfCredit - Credit Type
	 */
	public void setTypeOfCredit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFCREDIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NoCreditDepositCommSettlement.typeOfCredit</code> attribute. 
	 * @param value the typeOfCredit - Credit Type
	 */
	public void setTypeOfCredit(final EnumerationValue value)
	{
		setTypeOfCredit( getSession().getSessionContext(), value );
	}
	
}
